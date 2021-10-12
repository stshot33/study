package chapter16;

public class Ex5 {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		box1.item = 10; // 오토박싱
		box1.setItem(24);
		int num1 = box1.getItem();
		
		Box<Double> box2 = new Box<Double>();
		box2.item = 3.14; // 오토박싱
		
		box2.setItem(6.28);
		double num2 = box2.getItem();
		
		System.out.println("num1  = " + num1);
		System.out.println("num2  = " + num2);
	}
}