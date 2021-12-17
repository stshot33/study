package chapter04;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("memberRegSvc")
public class MemberRegisterService {
	@Autowired
	private  MemberDao memberDao;
	
//	public MemberRegisterService(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	
	public long regist(RegisterRequest request) throws DuplicatememberException {
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
