package chapter7;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num;
		
		int[] arr = new int[4];
		
		String str;
		// 연관된 데이터들(정보)이 저장된 메모리 주소를 저장하는 변수 -> 객체
		Object1 obj;
		
		Car myCar;
		
		// Object1 클래스의 인스턴스를 생성
		// 인스턴스를 생성 -> 클래스 안에 적어둔 소스 코드가 메모리의 임의의 공간에 복사
		new Object1();
		
		// 1. 클래스 선언
		// 2. 클래스 타입의 객체 선언 & 클래스의 인스턴스 생성
		// 3. 객체 사용
		
		System.out.println("프로그램 종료");
	}
}




