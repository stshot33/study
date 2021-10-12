package chapter17;

import java.util.ArrayList;

public class KTX {
	
	public void showAllCustomer(ArrayList<Customer> list) {
		for(int i=0; i<list.size(); i++) {
			Customer Customer = list.get(i);
			
			System.out.println("name = " + Customer.getName());
			System.out.println("tel = " + Customer.getTel());
			System.out.println("seat = " + Customer.getSeat());
		}
	}
	
	public static void main(String[] args) {
		KTX ktx = new KTX();
		
		Customer customer1 = new Customer("홍길동", "010-1473-3698", 32);
		Customer customer2 = new Customer("고영희", "010-1598-7894", 55);
		
		ArrayList <Customer> CustomerList = new ArrayList<>();
		CustomerList.add(customer1);
		CustomerList.add(customer2);
		
		ktx.showAllCustomer(CustomerList);
		
		// 누락된 구매자 정보 추가
		Customer customer3 = new Customer("김영수", "0107536-9514", 17);
		CustomerList.add(customer3);
		
		ktx.showAllCustomer(CustomerList);

		// 홍길동 구매자 정보 제거
		CustomerList.remove(0);
		
		ktx.showAllCustomer(CustomerList);
		
		// 반복문, if문 사용해서 원하는 구매자 정보 추가&제거
		for(int i=0; i<CustomerList.size(); i++) {
			Customer nthCustomer = CustomerList.get(i);
			String nthName = nthCustomer.getName();
			
			if(nthName.equals("홍길동")) {
				CustomerList.remove(i);
			}
		}
	}
}
