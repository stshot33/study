package chapter4;

// 아래 코드가 동작하면 메모리 내 변화가 어떻게 이뤄지는지
// 여러분이 먼저 추측해보세요

public class Ex9 {
	public static void main(String[] args) {
		int[] korArr1 = {3, 2, 1};
		
		int[] korArr2 = korArr1;
		
		System.out.println("<< 변경 전 >>");
		System.out.println("korArr1[0] = " + korArr1[0]);
		System.out.println("korArr2[0] = " + korArr2[0]);
		
		korArr1[0] = 4;
		
		System.out.println("<< 변경 후 >>");
		System.out.println("korArr1[0] = " + korArr1[0]);
		System.out.println("korArr2[0] = " + korArr2[0]);
	}
}




