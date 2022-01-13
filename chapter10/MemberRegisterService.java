package chapter10;

import java.time.LocalDateTime;

import org.springframework.transaction.annotation.Transactional;

public class MemberRegisterService {
	private MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Transactional
	// SELECT 쿼리는 DB 내 데이터에 직접 영향을 주는 쿼리가 아님
	public long regist(RegisterRequest request) throws DuplicateMemberException {
		Member member = memberDao.selectByEmail(request.getEmail());
		
		if(member != null) {
			throw new DuplicateMemberException("dup email " + request.getEmail());
		}
		
		Member newMember = new Member(
				request.getEmail(), request.getPassword(), request.getName(),
				LocalDateTime.now() );
		
		long newMemberId = memberDao.insert(newMember);
		
		return newMemberId;
	}
	
	public void withdrawal(String email) throws WrongIdPasswordException {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new WrongIdPasswordException();
		}
		
		memberDao.withdrawal(email);
	}
}





