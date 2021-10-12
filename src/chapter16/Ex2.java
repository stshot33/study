package chapter16;

public class Ex2 {
	public static void main(String[] args) {
		Integer obj1 = new Integer(10);
		
		Integer obj2 = new Integer("10");
		
		Integer obj3 = Integer.valueOf(10);
		
		Integer obj4 = Integer.valueOf("10");
		
		int num1 = obj4.intValue();
		double num2 = obj4.doubleValue();
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
