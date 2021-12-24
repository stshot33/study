package chapter07;

import java.time.format.DateTimeFormatter;

public class MemberPrinter {
	
	private DateTimeFormatter dtf;
	
	public void print(Member member) {
		String text1 = "아이디=" + member.getId();
		String text2 = "이메일=" + member.getEmail();
		String text3 = "이름=" + member.getName();
		String text4 = "등록일=" + member.getRegisterDateTime();
		
		if(dtf != null) {
			text4 = "등록일=" + dtf.format(member.getRegisterDateTime());
		}
		
		String text = "회원 정보 : " + text1 + ", " + text2 + ", " + text3 + ", " + text4;
		
		System.out.println(text);
	}
}