package chapter03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		// 기존에 생성자 방식으로 직접 의존 주입했던 코드는 주석
//		return new MemberRegisterService(memberDao());
		return new MemberRegisterService();
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		// 의존 객체를 주입하는 세터를 지웠지만 스프링 컨테이너가 알아서 의존 주입을 해준다.
		ChangePasswordService cps = new ChangePasswordService();
		// 의존 객체에 자동 의존 주입을 적용했으므로 직접 의존 주입을 할 필요가 없다.
//		cps.setMemberDao(memberDao());
		
		return cps;
	}
	
	@Bean
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberPrinter memberPrinter2() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
//		return new MemberListPrinter(memberDao(), memberPrinter());
		// MemberRegisterservice 클래스의 경우에는 멤버 변수에 @Autowired가 붙어서
		// 기본 생성자를 통해서 자동 의존 주입이 된다고 넘어갈 순 있는데
		// MemberListPrinter 클래스의 경우에는 setter 메서드에 @Autowired가 붙어서
		// 코드만 보면 이해하기 어려울 수 있음
		// @Autowired가 멤버 변수에 붙나 메서드에 붙나 똑같이 스프링이 알아서 의존 주입을 해줌
		// 단, 자동 의존 주입을 하려면 의존 객체 타입의 빈이 컨테이너에 등록되어있어야 함!
		return new MemberListPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setMemberDao(memberDao());
//		infoPrinter.setPrinter(memberPrinter());
		
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(1);
		versionPrinter.setMinorVersion(4);
		
		return versionPrinter;
	}
}