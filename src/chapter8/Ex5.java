package chapter8;

public class Ex5 {
	// 반환타입 -> 이 메서드가 동작하고나서 만들어내는 결괏값(return 하는 메서드다)
	// return 하는 데이터의 타입에 맞춰서 반환 타입을 적절한 데이터 타입으로 선언해야함
	String comp(int num) {
		String result;
		
		if(num % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		// return은 메서드의 끝을 의미하기 때문에
		// return을 만나면 제어가 제자리로 돌아감
		return result;
	}
	
	// 두 개의 정수를 전달 받아서
	// 전달 받은 두 수를 더한 뒤
	// 호출한곳으로 되돌려주는 메서드
	int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	public static void main(String[] args) {
		Ex5 obj = new Ex5();
		
		// 메서드가 return을 만나서 결괏값을 가지고 돌아왔다면
		// 이 자리가 가지고 온 결괏값으로 대체됨
		obj.comp(2);
		
		System.out.println(obj.add(1, 1));
		
		int result = obj.add(2, 3);
		System.out.println(result);
	}
}







