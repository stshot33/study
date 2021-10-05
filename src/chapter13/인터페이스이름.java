package chapter13;

// 인터페이스는 추상 메서드만 가질 수 있다.
// 추상 메서드 -> 메서드를 호출했을 때 동작할 코드가 없는... 매개변수까지만 나열하고 ; 으로 끝나는 메서드

public interface 인터페이스이름 {
//	public abstract 반환타입 메서드이름(매개변수);
	
	// id -> 이메일
	// pw -> 비밀번호
	// 반환타입
	// ㄱ. 200 : 로그인 성공
	// ㄴ. 400 : 아이디, 비밀번호가 틀렸음
	// ㄷ. 404 : 아이디가 존재하지 않음
	public abstract int login(String id, String pw);
	
	public abstract int findPW(String id);
	
	
}
