package chapter11;

public class SimpleType {
	// public -> 어디서든 접근이 가능
	public int num1;
	// default -> 같은 패키지 안에서만 접근이 가능
	int num2;
	// private -> 오직 자신의 내부에서만 접근이 가능
	private int num3;
	
	public void func1() {
		System.out.println("func1");
	}
	
	void func2() {
		System.out.println("func2");
	}
	
	private void func3() {
		System.out.println("fucn3");
	}
}
