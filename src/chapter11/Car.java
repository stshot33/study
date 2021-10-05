package chapter11;

public class Car {
	private String brand;
	private int color;
	private String type;
	
	public Car() {
		this(null, 0, null);
	}
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	public Car(String brand, int color) {
		this.brand = brand;
		this.color = color;
	}
	
	public Car(String brand, int color, String type) {
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
