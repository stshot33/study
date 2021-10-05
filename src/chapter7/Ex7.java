package chapter7;

public class Ex7 {
	public static void main(String[] args) {
		// 아래의 두 객체를 메모리에 그려보세요.
		
		Object1 obj1 = new Object1();
		obj1.num1 = 10;
		// 일반적으로 클래스 멤버 변수는 클래스의 정보 안에 들어있기 때문에
		// 클래스명을 사용해서 접근
		Object1.num2 = 10;
		
		Object1 obj2 = new Object1();
		obj2.num1 = 11;
		Object1.num2 = 11;
		
		System.out.println("obj1.num1 = " + obj1.num1);
		System.out.println("obj2.num1 = " + obj2.num1);
		
		System.out.println("Object1.num2 = " + Object1.num2);
	}
}
