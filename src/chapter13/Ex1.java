package chapter13;

public class Ex1 {
	public static void main(String[] args) {
		Moveable element1 = new Person();
		element1.move(1, 5);
		
		Moveable element2 = new Dog();
		element2.move(1, 5);
		
		Moveable element3 = new Bird();
		element3.move(1, 5);
	}
}
