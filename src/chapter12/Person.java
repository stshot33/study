package chapter12;

public class Person {
	private String name;
	private int age;
	private double height;

	public void say() {
		System.out.println("말하다.");
	}

	public void eat() {
		System.out.println("먹는다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
