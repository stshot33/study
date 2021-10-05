package chapter12;

public class Ex6 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		car = (Car) fe1; // 업캐스팅 - 자손타입에서 조상타입으로 형 변환  생략가능
		fe2 = (FireEngine) car; // 다운캐스팅 - 조상타입에서 자손타입으로 형 변환  생략불가
		
		fe1.water();
		fe2.water();
		
//		car.water();
		
	}
}
