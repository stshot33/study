package chapter16;

// 클래스 이름 옆에 제네릭스를 적용시킬 수 있음
// 제네릭스가 적용된 Box 클래스

// T를 제네릭스 타입 이라고 부름
public class Box<T> {
	private T item;

	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
