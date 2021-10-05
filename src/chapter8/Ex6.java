package chapter8;

import java.util.Arrays;

public class Ex6 {
	void func(int num) {
		num = num + 1;
		
		System.out.println("num = " + num);
	}
	
	void func2(int[] arr) {
		arr[0] = arr[0] + 1;
		
		System.out.println("arr = " + Arrays.toString(arr));
	}
	
	void func3(Object1 param) {
		param.num = param.num + 1;
		
		System.out.println("param.num = " + param.num);
	}
	
	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		
		// 인자로 변수를 넣으면 변수에 들어있는 값이 복사되서 매개변수로 전달됨
		// 근데 그 복사되는 대상이 직접적인 값이냐(기본 데이터 타입)
		// 아니면 메모리 주소냐(참조 데이터 타입)에 따라서 메서드 안에서 동작이
		// 메서드 바깥에까지 영향을 미칠 수 있음
		
		Object1 obj = new Object1();
		obj.num = 1;
		System.out.println("호출 전, obj.num = " + obj.num);
		
		ex6.func3(obj);
		System.out.println("호출 후, obj.num = " + obj.num);
		
//		// 호출 했을 때 메모리가 어떻게 그려질지 변수의 범위를 생각하면서 그려보세요.
//		int[] numArr = {1, 2, 3};
//		System.out.println("호출 전, numArr = " + Arrays.toString(numArr));
//		
//		ex6.func2(numArr);
//		System.out.println("호출 후, numArr = " + Arrays.toString(numArr));
		
//		int num = 10;
//		System.out.println("호출 전, num = " + num);
//		
//		ex6.func(num);
//		System.out.println("호출 후, num = " + num);
	}
}


