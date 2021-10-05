package chapter6;

public class Ex4 {
	public static void main(String[] args) {
		// break -> break가 포함된 반복문 하나를 빠져나간다.
		
		System.out.println("프로그램 시작");
		
		while(true) {
			System.out.println("while문 시작");
			
			while(true) {
				System.out.println("내부 while 시작");
				
				break;
				
//				System.out.println("내부 while 종료");
			}
			
			break;
			
//			System.out.println("while문 종료");
		}
		
		System.out.println("프로그램 종료");

	}
}
