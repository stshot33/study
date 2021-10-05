package chapter12;

// extends를 하지 않으면 컴파일러가 자동으로
// extends Object 를 추가해줌
public class Parent {
	public Parent() {
		System.out.println("Parent 클래스의 생성자");
	}
	
	public Parent(int n) {
		System.out.println("매개변수가 하나인 Parent 클래스의 생성자");
	}
	
	public void tellMyName() {
		System.out.println("Parent Class");
	}
}
