package chapter7;

public class Ex3 {
	public static void main(String[] args) {
		// 실행시키지 말고 메모리 상태가 어떻게 될지 그려보고
		// Sysout의 결과를 예측을 해보세요
		Object1 obj = new Object1();
		Object1 obj2 = obj;
		
		System.out.println("obj = " + obj);
		System.out.println("obj2 = " + obj2);
	}
}
