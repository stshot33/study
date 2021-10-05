package chapter11;

public class Menu {
	// 일반적으로 멤버 변수는 private으로 접근제어자를 줌
	private String name;
	private int price;
	
	// 멤버 변수에 값을 저장하는 메서드는 set으로 시작하니까 setter 라고 불름
	// name 멤버 변수에 값을 저장하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	// price 멤버 변수에 값을 저장하는 메서드
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 멤버 변수에 저장된값을 사용해야하는 경우도 있으니까 멤버 변수에 저장된 값을
	// 반환하는 getter 메서드를 선언해둠
	public String getName() {
		return name;
	}
	
	// price 멤버 변수를 반환하는 getter 메서드를 선언
	public int getPrice() {
		return price;
	}
}




