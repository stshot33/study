package chapter14;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int [] numberList = {2, 1, 0};
		
		int index = random.nextInt(4);
		try {
			int number = numberList[index];
			
			int result = 7 / number;
			
			System.out.println("7 / " + number + " = " + result);
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
			
			System.out.println("예외가 발생한 이유 : " + e.getMessage());
			e.printStackTrace();
		} 
	}
}
