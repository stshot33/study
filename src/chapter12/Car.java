package chapter12;

public class Car {
	private String color;
	private int door;

	public void drive() {
		System.out.println("drive, Brrr~~");
	}

	public void stop() {
		System.out.println("stop!!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
}
