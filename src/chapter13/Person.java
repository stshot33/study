package chapter13;

public class Person implements Moveable {
	public void move(int x, int y){
		System.out.println("** 사람의 이동 **");
		System.out.println(x + ", " + y + "로 이동합니다.");
	}
}
