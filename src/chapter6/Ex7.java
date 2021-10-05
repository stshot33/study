package chapter6;

public class Ex7 {
	public static void main(String[] args) {
		
		int sum = 1;
		
		for(int val=2; val<=10; val++) {
			// 2 ~ 10까지 누적해서 덧셈을 하도록
			sum += val;
		}
		
		System.out.println("sum = " + sum);
	}
}
