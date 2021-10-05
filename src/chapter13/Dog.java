package chapter13;

public class Dog implements Moveable{
	public void move(int x, int y) {
		System.out.println("** 강아지의 이동 **");
		System.out.println(x + ", " + y + "로 이동합니다.");
	}
}
