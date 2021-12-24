package chapter07;

import java.util.Collection;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;

	public void printAll() {
		// 회원가입 되어있는 사용자들의 정보
		Collection<Member> members = memberDao.selectAll();

		// 사용자들의 정보를 하나씩 전부 출력
		for (Member member : members) {
			printer.print(member);
		}

		System.out.println();
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
}
