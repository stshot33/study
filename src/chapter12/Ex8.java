package chapter12;

public class Ex8 {
	public static void main(String[] args) {
		// instanceof 연산자 => 객체 간에 다형성을 적용해서 형변환을 할 때
		// 					  인스턴스의 상태에 따라서 형변환이 되지 않을 수 있으니
		//					  객체를 형변환 할 때 형변환이 가능한지 판단해주는 연산자
		
		FireEngine fe = new FireEngine();
		// fe instanceof FireEngine -> fe 객체를 fireengine 타입으로 형변환 할 수 있나요?
		System.out.println(fe instanceof FireEngine);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof Object);
		
		Car car = new Car();
//		System.out.println(Car instanceof FireEngine);
//		System.out.println(Car instanceof Car);
//		System.out.println(Car instanceof Object);
	}
}
