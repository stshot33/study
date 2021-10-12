package chapter17;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public boolean equals(Object arg0) {
		Person other = (Person) arg0;
		String otherName = other.getName();
		int otherAge = other.getAge();
		
		if(name.equals(otherName) && age == otherAge) {
			return true;
		} else {
			return false;
		}
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

}
