package chapter12;

public class NoteBook extends Computer {
	private double battery;

	public void charging() {
		System.out.println("노트북을 충전한다.");
	}
	
	// 부모 클래스에게 상속 받은 메서드를 자식 클래스에서 다시 정의하는 것을 오버라이딩 이라고 함
	// 1. 부모 클래스에게 상속 받은 메서드의 선언을 그대로 유지해야 함
	// 오버라이딩을 하는 이유 : 부모 클래스에게 물려받은 메서드 이름은 글대로 사용하면서
	//					  동작만 자식 클래스의 상황에 맞게 바꾸고 싶을 때
	public void showComputerInfo() { // 메서드 선언
		// 자식 클래스에서 부모 클래스로부터 상속 받은 private 멤버 변수에 접근하려고 했더니
		// 컴파일 오류가 발생했음
		// 왜? 같은 영역에 있지만 정확하게는 상속 받은 영역에 있기 때문에 접근할 수 없음
		// 메서드 정의 : 메서드의 코드
		System.out.println("==== [ NoteBook Info ] ====");
		System.out.println("CPU = " + super.getCpu());
		System.out.println("GPU = " + super.getGpu());
		System.out.println("RAM = " + super.getRam());
		System.out.println("HDD = " + super.getHdd());
		System.out.println("Battery = " + battery);
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}
}
