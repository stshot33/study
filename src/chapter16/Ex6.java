package chapter16;

public class Ex6 {
	public static void main(String[] args) {
		Product computer1 = new Product("computer", 1900000);
		Product computer2 = new Product("computer", 1050000);

		Product tv1 = new Product("television", 630000);

		// 제네릭스가 적용된 클래스의 인스턴스를 만들 때 제네릭스 타입을 생략할 수 있음
		// 제네릭스 타입을 생략하면 객체의 제네릭스 타입을 따라감
		Box<Product> box1 = new Box<>();
		box1.setItem(computer1); // 컴퓨터를 박스에 넣는다.

		Box<Product> box2 = new Box<>();
		box2.setItem(computer2); // 컴퓨터를 박스에 넣는다.

		Box<Product> box3 = new Box<>();
		box3.setItem(tv1); // TV를 박스에 넣는다.

		Product product; // 이 객체 하나를 사용해서 박스에 들어있는 제품의 type, price를 출력하세요

		// 제품을 박스에서 꺼낸다
		product = box1.getItem();

		// 꺼낸 제품의 type, price를 출력한다.
		System.out.println("type = " + product.getType());
		System.out.println("price = " + product.getPrice());

		// 제품을 박스에서 꺼낸다
		product = box2.getItem();

		// 꺼낸 제품의 type, price를 출력한다.
		System.out.println("type = " + product.getType());
		System.out.println("price = " + product.getPrice());
		
		// 제품을 박스에서 꺼낸다
		product = box3.getItem();

		// 꺼낸 제품의 type, price를 출력한다.
		System.out.println("type = " + product.getType());
		System.out.println("price = " + product.getPrice());

	}
}
