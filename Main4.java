package chapter07;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main4 {
	public static void main(String[] args) {
		// 회원가입, 회원탈퇴 로그를 남기는 구조
		
		Scanner scanf = new Scanner(System.in);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		while(true) {
			System.out.println("<< 메뉴 선택 >>");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.print("메뉴를 선택하세요 : ");
			int menu = scanf.nextInt();
			
			scanf.nextLine();
			
			if(menu == 1) {
				// 회원가입
				System.out.println("<< 가입 정보 입력 >>");
				String info = scanf.nextLine();
				String[] infos = info.split(" ");
				
				RegisterRequest rr = new RegisterRequest();
				rr.setEmail(infos[0]);
				rr.setName(infos[1]);
				rr.setPassword(infos[2]);
				rr.setConfirmPassword(infos[3]);
				
				if(!rr.isPasswordEqualToConfirmPasword()) {
					System.out.println("암호와 확인이 일치하지 않습니다.");
					return ;
				}
				
				MemberRegisterService mrs = ctx.getBean("memberRegSvc", MemberRegisterService.class);
				
				try {
					// DuplicatememberException 예외를 발생시키고 
					// 그 예외를 적절히 처리하세요.
					mrs.regist(rr);	
				} catch (DuplicatememberException e) {
					System.out.println("사용중인 이메일입니다.");
				}
			} else {
				// 회원 탈퇴
				
				// 탈퇴할 사용자의 이메일 전달 받기
				System.out.println("<< 탈퇴할 사용자의 이메일 >>");
				String email = scanf.nextLine();
				
				MemberRegisterService mrs = ctx.getBean("memberRegSvc", MemberRegisterService.class);
				

				try {
					// 탈퇴
					mrs.delete(email);
				} catch (WrongIdPasswordException e) {
					System.out.println("존재하지 않는 이메일입니다.");
				}
				
			}
		}
	}
}
