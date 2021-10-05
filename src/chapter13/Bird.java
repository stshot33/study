package chapter13;

public class Bird implements Moveable{
	public void fly(int x, int y, int speed) {
		System.out.println("** 새가 날아감 **");
		System.out.println(x + ", " + y + "로 " + speed + "의 속도로 날아갑니다.");	
	}

	@Override
	public void move(int x, int y) {
		System.out.println("** 새의 이동 **");
		System.out.println(x + ", " + y + "로 이동합니다.");		
	}
	
}
