package chapter16;

public class Ex3 {
	public static void main(String[] args) {
		
		Integer obj1 = 10;
		// Integer obj1 = new Integer(10);
		
		obj1.intValue();
		
		// Integer는 int와 대응되는 wrapper class 이므로
		// int 타입의 데이터만 오토박싱이 적용됨
		Integer obj2 = 10.0;
		// Integer obj2 = new Double(10.0);으로 오토박싱이 되므로 논리적으로 성립 할 수 없음.
		
		String str =  "Hello";
		// String str = new String("Hello");
		
		Integer obj3 = "10";
		// Integer obj3 = new String("10");
		// Integer obj3 = new Interg("10"); 이 코드는 논리적으로 성립됨
	}
}
