package chapter13;

public interface Calculatorable {
	// 인터페이스는 상수화된 클러ㅐ스 멤버 변수도 갖고 있을 수 있음
	public static final int value = 10;
	// 덧셈
	public abstract int add(int num1, int num2);
	// 뺄셈
	public abstract int minus(int num1, int num2);
	// 곱셈
	public abstract int	multi(int num1, int num2);
	// 나눗셈
	public abstract double div(int num1, int num2);
}
