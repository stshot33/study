package chapter3;

public class Ex9 {
	public static void main(String[] args) {
		// 97을 저장했을 때 true와 true가 출력됨
		// 101을 저장했을 때 true와 false가 출력됨
		// -1을 저장했을 때 false와 true가 출력됨
		int score = 55;	// 철수의 국어점수
		
		// 0 <= score <= 100
//		System.out.println(0 <= score <= 100);
//		System.out.println(score >= 0);
//		System.out.println(score <= 100);
		// score변수의 값이 0 이상 그리고 score변수의 값이 100이하
		// 다음과 같이 비교 연산을 논리연산자로 묶어주면 우리가 원하는 범위의 값을 입력했을 때 true
		// 우리가 원하지 않는(잘못된) 범위의 값을 입력했을 때 false
		System.out.println( score >= 0 && score <= 100 );
		System.out.println( 0 <= score && score <= 100 );
	}
}





