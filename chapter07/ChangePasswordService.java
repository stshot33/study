package chapter07;

import org.springframework.transaction.annotation.Transactional;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	// @Transactional -> 트랜잭션을 지정하고 싶은 메서드에 이 애노테이션을 붙임
	// changePassword 메서드에 @Transactional 애노테이션을 붙여
	// 이 메서드 안에서 동작하는 쿼리 ( selectByEmail, update )가 하나의 작업으로 묶임
	@Transactional
	public void changePassword(String email, String oldPW, String newPW) 
			throws MemberNotFoundException, WrongIdPasswordException {
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
