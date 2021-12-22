package chapter06;

public class Main2 {
	public static void main(String[] args) {
		// ExecTimeCalculator 클래스가 부가 기능을 수행
		// ImpCalculator1, ImpCalculator2 클래스가 핵심 기능을 수행
		ExecTimeCalculator etc1 = new ExecTimeCalculator(new ImpCalculator1());
		
		etc1.factorial(5);
		
		System.out.println("= = = = =");
		
		ExecTimeCalculator etc2 = new ExecTimeCalculator(new ImpCalculator2());
		
		etc2.factorial(5);
	}
}