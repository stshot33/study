package chapter7;

public class Ex8 {
	public static void main(String[] args) {
		// int의 기본값이 채워진 상태로 배열이 만들어졌음
		int[] arr = new int[3];
		
		// 객체를 생성하면 객체 내 멤버 변수는 어떻게 될까?
		// 객체 내 멤버 변수도 배열과 마찬가지로
		// 멤버 변수의 타입에 맞는 기본값으로 채워진 상태로 멤버 변수가 만들어짐
		Car myCar = new Car();
		
		System.out.println(myCar.wheel);
		System.out.println(myCar.fuel);
		System.out.println(myCar.grade);
		System.out.println(myCar.color);
	}
}
