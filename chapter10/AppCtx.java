package chapter10;



import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AppCtx {

	@Bean
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
	public PlatformTransactionManager transactionManager() {
		
		return tm;
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource());
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao());
		
		return pwdSvc;
	}
}
