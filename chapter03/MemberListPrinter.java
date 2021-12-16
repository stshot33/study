package chapter03;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;

//	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
//		this.memberDao = memberDao;
//		this.printer = printer;
//	}

	public void printAll() {
		// 회원가입 되어있는 사용자들의 정보
		Collection<Member> members = memberDao.selectAll();

		// 사용자들의 정보를 하나씩 전부 출력
		for (Member member : members) {
			printer.print(member);
			;
		}

		System.out.println();
	}

	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Autowired
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
}
