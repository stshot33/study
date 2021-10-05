package chapter11;

public class Ex4 {
	public static void main(String[] args) {
		// 메뉴 정보를 생성
		
		// 메뉴1 정보 생성
		Menu menu1 = new Menu();
		menu1.setName("짜장면");
		menu1.setPrice(4900);
		
		// 메뉴2 정보 생성
		Menu menu2 = new Menu();
		menu2.setName("짬뽕");
		menu2.setPrice(6000);
		
		// 메뉴3 정보 생성
		// 아래처럼 접근하는게 틀리지는 않았지만 객체 지향 프로그래밍을 깨트리는것이 됨
		Menu menu3 = new Menu();
		menu3.setName("탕수육");
		menu3.setPrice(13900);
		
		// 메뉴1의 이름과 가격을 출력
		System.out.println(menu1.name);
		
		// 메뉴2의 이름과 가격을 출력
		
		
		// 메뉴3의 이름과 가격을 출력
		
	}
}





