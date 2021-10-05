package chapter5;

public class Ex7 {
	public static void main(String[] args) {
		int hour = 8;		// 철수가 일어난 시간
		int money = 29000;	// 철수의 돈
		
		// 철수가 일어난 시간이 8시 이후이고 돈이 삼만원 이상있다면
		// "택시를 타고 학교 간다" 를 출력
		
		// 철수가 일어난 시간이 8시 이후
//		if(hour >= 8) {
//			// 돈이 삼만원 이상
//			if(money >= 30000) {
//				System.out.println("택시를 타고 학교 간다.");
//			}
//		}
		if(hour >= 8 && money >= 30000) {
			System.out.println("택시를 타고 학교 간다.");
		}
	}
}



