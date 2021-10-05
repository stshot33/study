package chapter3;

public class Ex4 {
	public static void main(String[] args) {
		// 사과 3개
		int apple = 3;
		
		// 바나나 3개
		int banana = 3;
		
		// 오렌지 2개
		int orange = 2;
		
		// 과일 종류의 수
		int cnt = 3;
		
		int total = apple + banana + orange;
		
		double avg = total / (double) cnt;
		
		// 과일의 총량
		System.out.println("과일 총량 : " + total);
		
		// 평균 과일 보유량
		System.out.println("평균 과일 보유량 : " + avg);
	}
}





