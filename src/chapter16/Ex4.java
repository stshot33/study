package chapter16;

public class Ex4 {
	public static void main(String[] args) {
//		// 오토박싱을 배웠으니까 항상 오토박싱이 적용되 ㄴWrapper 클래스를 사용할 예정
//		// 오토박싱이 적용됐다는 걸 항상 잘 기억해줘야 한다.
//		Integer obj1 = 10;
//		
//		int num1 = obj1.intValue();
//		// obj1의 타입이 int와 대응되는 Integer이므로 위 코드와 같이 변환되서 컴퓨터에게 전달 됨.
//		int num2 = obj1;
//		
//		
		
		Integer obj1 = 10; 	// 오토박싱
		int num1 = obj1;	// 오토언박싱
		System.out.println("num1 = " + num1);
		
		Double obj2 = 3.14;	// 오토박싱
		double num2 = obj2;	// 오토언박싱
		System.out.println("num2 = " + num2);
		
		Character obj3 = 'a';	// 오토박싱
		char num3 = obj3;		// 오토언박싱
		System.out.println("num3 =  " + num3);
	}
}
