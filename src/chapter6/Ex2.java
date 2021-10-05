package chapter6;

public class Ex2 {
	public static void main(String[] args) {
		int num = 2;
		int sum = 1;
		
		while(num <= 10) {
			sum = sum + num;
			
			num++;
		}
		
		System.out.println("sum = " + sum);
	}
}
