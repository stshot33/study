package chapter8;

public class Ex4 {
	void add(int num1, int num2) {
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
	
	// 두 개의 정수를 전달 받아 두 정수 중 큰 수를 출력하는 메서드
	void compare(int number1, int number2) {
		if(number1 > number2) {
			System.out.println(number1);
		} else {
			System.out.println(number2);
		}
	}
	
	void comp(int value) {
		if(value % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
	
	public static void main(String[] args) {
		Ex4 obj = new Ex4();
		
		// 인자를 가지고 이동하지 않고
		// 먼저 인자를 복사한 뒤 복사가 된 인자를 가지고 간다!
		obj.comp(4);
		
		int num = 4;
		obj.comp(num);
		
		
	}
}






