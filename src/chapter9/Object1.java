package chapter9;

public class Object1 {
	int num1;
	double num2;
	
	void func1() {
		System.out.println("func1");
		
		System.out.println("this.num1 = " + num1);
		System.out.println("this.num2 = " + num2);
	}
	
	void func2(int num) {
		System.out.println("func2");
		
		System.out.println("this.num1 = " + num1);
		System.out.println("this.num2 = " + num2);
		System.out.println("num = " + num);
	}
	
	public static void main(String[] args) {
		// 메모리에서 아래 객체의 상태를 그려보세요.
		Object1 obj = new Object1();
		
		obj.num1 = 1;
		obj.num2 = 3.14;
		
		obj.func1();
		obj.func2(3);
		
	}
}


