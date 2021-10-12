package chapter17;

public class Ex6 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 32);
		Person p2 = new Person("홍길동", 32);
		
		System.out.println("p1과 p2가 같나요? " + p1.equals(p2));
	}
}
