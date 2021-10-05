package chapter12;

public class ElectricFan {
	private boolean power;
	private int fanStrength;
	private boolean rotation;
	
	public void powerOnOff() {
		power = !power;
	}
	
	public void pushFanStrength() {
		fanStrength++;
		fanStrength = fanStrength / 3;
	}
	
	public void rotationSwitch() {
		rotation = !rotation;
	}
}
