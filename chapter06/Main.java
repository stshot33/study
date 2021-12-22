package chapter06;

public class Main {
	public static void main(String[] args) {
		// 기존의 코드를 최대한 수정하지 않고
		// 코드가 중복되는 부분을 피할 수 있는 방법 : 프록시 패턴
		long start1 = System.currentTimeMillis();
		
		ImpCalculator1 imp1 = new ImpCalculator1();
		
		imp1.factorial(5);
		
		long end = System.currentTimeMillis();
		// factorial의 수행 시간을 계산하고 초단위로 변환
		long duration = (end - start1);
		
		System.out.println("실행시간 = " + duration);
		
		System.out.println("- - - - -");
		
		long start2 = System.currentTimeMillis();
		
		ImpCalculator2 imp2 = new ImpCalculator2();
		
		imp2.factorial(5);
		
		long end2 = System.currentTimeMillis();
		long duration2 = (end2 - start2);
		
		System.out.println("실행시간 = " + duration2);
	}
}