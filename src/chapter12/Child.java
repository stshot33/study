package chapter12;

// 모든 클래스이 가장 위에 있는 부모 클래스가 있음
// 그 부모 클래스는 Object
// 자바는 단일 상속 / 한 부모에게만 소스 코드를 물려 받을 수 있음
// 그래서 Child 클래스는 Object 클래스의 자식이 아님

public class Child extends Parent {
	public Child() {
		// Child 클래스의 생성자가 호출되기 전에
			// Parent 클래스의 생성자가 호출됨
			// 컴파일러가 자식 클래스의 생성자를 호출하는 코드 안에
			// 부모 클래스의 생성자를 호출하는 코드를 넣어줌
			System.out.println("Child 클래스의 생성자");
		}
	// 상속관계에서는 자식 클래스 내 super() 코드가 들어있는
	// 기본 생성자가 추가됨
	public Child(int n) {
		super();	// 직접 부모 클래스의 생성자를 호출하지 않으면 컴파일러는
					// 부모 클래스의 기본 생성자를 호출하는 코드를 넣어줌
		System.out.println("Child 클래스의 생성자");
	}
	
	@Override	//Annotation(애너테이션) | 컴퓨터가 읽을 수 있는 주석
	public void tellMyName() {
		System.out.println("Child Class");
	}

}
