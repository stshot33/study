package chapter17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		Customer1 p1 = new Customer1("010-1493-3698", "현금");
		Customer1 p2 = new Customer1("010-1598-7894", "카드");
		Customer1 p3 = new Customer1("010-4569-1236", "현금");
		Map<String, Customer1> info = new HashMap<>();
		
		info.put("홍길동", p1);
		info.put("김철수", p2);
		info.put("고영희", p3);
		
		// 현재 점포에 들어와있는 모든 고객의 정보 출력
		Customer1 customer = info.get("홍길동");
		System.out.println("tel = " + customer.getTel());
		System.out.println("paymentMethod = " + customer.getPay());
		
		customer = info.get("김철수");
		System.out.println("tel = " + customer.getTel());
		System.out.println("paymentMethod = " + customer.getPay());
		
		customer = info.get("고영희");
		System.out.println("tel = " + customer.getTel());
		System.out.println("paymentMethod = " + customer.getPay());
		
		// 이 맵에 있는 키의 목록을 set으로 반환
		Set<String> keyList = info.keySet();
		
		// 키의 목록(keyList)와 향상된 for문을 사용해서
		// 매장 내 모든 고객의 정보를 출력하세요.
		for(String key : keyList) {
			Customer1 c = info.get(key);
			System.out.println("name : " + key);
			System.out.println("tel = " + c.getTel());
			System.out.println("paymentMethod = " + c.getPay());
		}
		
		info.clear();
		System.out.println(info);
	}
}
