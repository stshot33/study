package chapter02;

import java.time.LocalDateTime;

// DI 디자인 패턴이 적용된 Service
// DTO와 DAO를 사용해서 사용자가 원하는 동작을 하는 기능

// 회원가입 제약 조건
// 1. 회원들의 이메일은 중복되면 안된다.
public class MemberRegisterService {
	private  MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public long regist(RegisterRequest request) {
		// 가입하려는 사용자의 이메일로 회원 정보를 조회
		Member member = memberDao.selectByEmail(request.getEmail());
		
		if(member != null) {
			// 같은 이메일을 가진 회원이 이미 존재한다면 예외 발생
			throw new DuplicatememberException("dup email " + request.getEmail());
		}
		
		// 같은 이메일을 가진 회원이 존재하지 않는다면
		Member newMember = new Member(
				request.getEmail(), request.getPassword(), request.getName(),
				LocalDateTime.now()	);
		
		memberDao.insert(newMember);
		
		return newMember.getId();
	}
}
