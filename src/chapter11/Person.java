package chapter11;

public class Person {
	private String name;
	private int age;
	private double height;
	
	public Person(int age) {
		this(null, age);
	}
	
	public Person(String name, int age) {
		this(name, age, 0.0);
	}
	
	public Person(int age, double height) {
		this(null, age, height);
	}
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
}
