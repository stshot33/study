package chapter10;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.transaction.annotation.Transactional;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	// @Transactional -> 트랜잭션을 지정하고 싶은 메서드에 이 애노테이션을 붙임
	// changePassword 메서드에 @Transactional 애노테이션을 붙여
	// 이 메서드 안에서 동작하는 쿼리 ( selectByEmail, update )가 하나의 작업으로 묶임
	
	// 이 메서드에서 예외를 발생시키는 이유는 우리가 원하는 상황에서 rollback이 되도록 하기 위해
	// 트랜잭션으로 묶인 코드를 실행할 때 SQLException 계열의 예외가 발생할 수 있음
	// SQLException 계열의 예외는 RuntimeEXception 계열이 아님
	// RuntimeException 계열의 예외가 아닌 다른 계열의 예외가 발생하면 rollback이 이뤄지지 않음
	// rollbackFor 속성을 추가하면 지정한 예외가 발생했을 때도 rollback이 이뤄지도록 할 수 있음
	// noRllbackFor 속성을 사용하면 지정한 예외가 발생했을 때는 rollback 하지 않도록 함
	@Transactional(rollbackFor = {SQLException.class, IOException.class})
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
