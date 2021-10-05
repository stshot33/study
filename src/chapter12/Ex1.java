package chapter12;

public class Ex1 {
	public static void main(String[] args) {
		Person person = new Person();
		person.say();
		person.eat();
		
		Student student = new Student();
		student.say();
		student.eat();
		student.study();
		
		System.out.println("연습");
	}
}
