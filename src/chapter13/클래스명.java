package chapter13;

// 메서드가 정의되어 있는 (구현되어있는) 메서드는
// abstract 키워드가 붙을 수 없다.

// 추상 메서드는 인터페이스 또는 추상 클래스만 가질 수 있다.

// 부모 클래스가 자식 클래스에게 할 일을 만들어 주는 것
// 하나의 메서드가 자식 클래스에 따라 서로 다른 동작을 하도록 강요할 때
// 부모 클래스에서는 메서드를 선언만 하고 자식 클래스에서 메서드를 구현
public abstract class 클래스명 {
	private int 멤버변수;
	
	public void 메서드() {
		
	}
	
	public abstract void 추상메서드();
}
