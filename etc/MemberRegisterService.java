package etc;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import chapter04.DuplicatememberException;
import chapter04.Member;
import chapter04.MemberDao;
import chapter04.RegisterRequest;

// 빈 객체의 이름이 충돌될 가능성이 있으므로
// 조심해야 함 / 빈 객체의 이름이 중복되면 예외 발생

@Component("memberRegSvc")
public class MemberRegisterService {
	@Autowired
	private  MemberDao memberDao;
	
	public long regist(RegisterRequest request) throws DuplicatememberException {
		Member member = memberDao.selectByEmail(request.getEmail());
		
		if(member != null) {
			throw new DuplicatememberException("dup email " + request.getEmail());
		}
		
		Member newMember = new Member(
				request.getEmail(), request.getPassword(), request.getName(),
				LocalDateTime.now()	);
		
		memberDao.insert(newMember);
		
		return newMember.getId();
	}
}