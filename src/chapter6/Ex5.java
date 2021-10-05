package chapter6;

public class Ex5 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num <= 10) {
			num++;
			
			if(num % 2 == 1) {
				continue;
			}
			
			System.out.println(num);
		} // end while
		
//		while(num <= 10) {
//			num++;
//			
//			// 어떤 수를 2로 나눴을 때 나머지가 0이면 짝수
//			// 어떤 수를 2로 나눴을 때 나머지가 1이면 홀수
//			if(num % 2 == 0) {
//				System.out.println(num);
//			} // end if
//		} // end while
	} // end main
}

