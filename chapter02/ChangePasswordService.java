package chapter02;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void changePassword(String email, String oldPW, String newPW) {
		// 비밀번호를 변경할 회원 정보를 조회
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			// 이메일이 잘못되는 등
			// 비밀번호를 변경할 회원 정보를 조회하지 못했다면 예외 발생
			throw new MemberNotFoundException();
		}
		
		// 비밀번호 변경
		member.changePassword(oldPW, newPW);
		
		memberDao.update(member);
	}
}
