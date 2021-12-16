package chapter02;

import org.springframework.beans.factory.annotation.Autowired;

// 두 개 이상의 의존 객체가 있음
// 하나의 세터로 여러 개의 의존 객체를 주입하는게 아니라
// 의존 객체 마다 세터를 만들어서 의존 주입을 하도록 해야 함!

public class MemberInfoPrinter {
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			System.out.println("일치하는 회원 정보 없음\n");
			return;
		}

		printer.print(member);
		System.out.println();
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}
