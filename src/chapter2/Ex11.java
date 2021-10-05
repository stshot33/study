package chapter2;

public class Ex11 {
	public static void main(String[] args) {
		// 형변환 : 데이터의 타입을 바꾸는 것
		//  방법 : (데이터타입) 값;
		
		System.out.println(17.3149);
		System.out.println((int) 17.3149);
		
		int num1 = (int) 17.3149;
		System.out.println("num1 = " + num1);
		
		double num2 = 17.3149;
		int num3 = (int) num2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
	}
}





