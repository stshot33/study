package chapter12;

public class Ex7 {
	public static void main(String[] args) {
		Car car = new Car();
		FireEngine fe1 = null;
		FireEngine fe2 = null;
		
		fe1 = (FireEngine) car;
		fe2 = (FireEngine) car;
		
		fe1.water();
		fe2.water();
	}
}
