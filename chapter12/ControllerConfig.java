package chapter12;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUrl("jdbc:mariadb://localhost:3306/spring");
		ds.setUsername("root");
		ds.setPassword("0000");
		
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		
		return ds;
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource());
	}
	
	@Bean
	public ChangePasswordService changePasswordService() {
		ChangePasswordService cps = new ChangePasswordService();
		cps.setMemberDao(memberDao());
		return cps;
	}
	
	@Bean
	public MemberRegisterService memberRegisterService() {
		MemberRegisterService memberRegSvc = new MemberRegisterService(memberDao());
		
		return memberRegSvc;
	}

	// registController를 빈으로 갖는 설정 클래스를 완성하세요.
	@Bean
	public RegistController registerController() {
		return new RegistController(memberRegisterService());
	}
	
	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}
	
	@Bean
	public AuthService authService() {
		AuthService authService = new AuthService();
		authService.setMemberDao(memberDao());
		
		return authService;
	}
	
	@Bean
	public LoginController loginController() {
		LoginController controller = new LoginController();
		
		controller.setAuthService(authService());
		
		return controller;
	}
	
	@Bean
	public LogoutController logoutController() {
		return new LogoutController();
	}
	
	@Bean
	public ChangePwdController changePwdController() {
		ChangePwdController cpc = new ChangePwdController();
		cpc.setChangePasswordService(changePasswordService());
		
		return cpc;
	}
}