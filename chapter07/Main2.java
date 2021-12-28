package chapter07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		ChangePasswordService cps = ctx.getBean(ChangePasswordService.class);
		
		try {
			cps.changePassword("1228110605@test.com", "0x1.4ea9f81ac047p-4", "1111");	
		} catch(MemberNotFoundException e) {
			System.out.println("이메일이 일치하는 회원 정보가 없습니다.");
		} catch(WrongIdPasswordException e) {
			System.out.println("암호가 올바르지 않습니다.");
		}
		
		ctx.close();
	}
}