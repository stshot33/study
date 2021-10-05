package chapter12;

public class Ex4 {
	public static void main(String[] args) {
		
		ElectricFan fan1 = new ElectricFan();
		fan1.powerOnOff();
		
		wallMountedFan fan2 = new wallMountedFan();
		fan2.hangFan("내 방 창가");
		
		// fan3은 상속 관계에 의해서 다형성을 적용시켜서
		// fan3의 타입과 인스턴스의 타입이 일치하지 않아도 됨
		// 부모 클래스 타입의 객체가 자식 클래스 타입의 인스턴스를 저장할 수 있음
		ElectricFan fan3 = new wallMountedFan();
		
	}
}
