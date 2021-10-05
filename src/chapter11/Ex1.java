package chapter11;

// 자바 패키지 밑에 유틸 패키지 밑에 있는 모든 클래스를 import하겠다.
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
			Scanner scanf = new Scanner(System.in);
			
			// System 클래스는 java.lang 패키지 안에 들어있음
			// java.lang 패키지 안에는 우리가 자주 사용하는 클래스들이 모여있음
			// 그래서 java.lang 패키지는 우리가 import 하지 않아도
			// 컴파일러가 자동으로 import를 해줌
			// 그래서 java.lang 패키지 안에 있는 클래스를 사용할 때는
			// 별도로 import나 패키지명을 써주지 않아도됨
			System.out.println("출력");
			
			String str = "김철수";
	}
}







