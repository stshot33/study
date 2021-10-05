package chapter8;

public class Ex1 {
	// 메서드를 사용하려면 우선 클래스의 인스턴스를 생성해야함
	void printLines() {
		System.out.println("----- ----- -----");
		System.out.println("----- ----- -----");
	}
	
	void add() {
		int result = 1 + 1;
		
		System.out.println("1 + 1 = " + result);
	}
	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		
		ex1.printLines();
		
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 정보수정");
		System.out.println("4. 회원탈퇴");
		
		// 메서드를 사용하려면 메서드가 들어있는 클래스의 인스턴스를 생성해야함
		// 이유는? 메서드는 인스턴스 메서드이기 때문에
		// 클래스의 인스턴스를 생성하고 인스턴스명. 을 사용해서 메서드에 접근할 수 있음
		// 메서드를 사용하면 제어는 메모리 안에 해당 메서드로 이동 그 후 메서드 내 소스 코드를 차례대로 실행
		// 제어가 메서드의 끝을 만나면? 다시 제자리로 돌아왔다가 다음으로 이동
		ex1.printLines();
		
		ex1.add();
		
		Object1 obj = new Object1();
		obj.add();
		
	}
}





