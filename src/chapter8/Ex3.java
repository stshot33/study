package chapter8;

public class Ex3 {
	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		
		ex2.printLines1();
		
		// 메서드를 호출 할 때 넣어주는 재료를 인자 라고 부름
		ex2.printLines2(0);
		ex2.printLines2(3);
		
		ex2.printLines3(3.14);
		
		System.out.println("-----");
		
		ex2.printLines4(1, 2);
		ex2.printLines4(0, -1);
		
		// 메서드를 정의할 때 메서드가 동작할 때 필요한 재료인 매개변수를 선언하면
		// 호출 할 때는 그에 맞춰서 반드시 인자를 전달해줘야함
		
		// 매개변수는 매개변수의 이름이 중요한게 아님
		// 매개변수의 개수와 타입이 중요
		
		// printLines4 메서드 내 첫 번째 매개변수 int x -> 첫 번째 매개변수가 정수 타입이므로 호출 시 첫 번째 인자를 정수로 넣어야함
		// printLines4 메서드 내 두 번째 매개변수 int y -> 두 번째 매개변수가 정수 타입이므로 호출 시 두 번째 인자를 정수로 넣어야함
	}
}



