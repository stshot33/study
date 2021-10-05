package chapter13;

public class KoreanTourGiude {
	public void doLeisureSports() {
		System.out.println("한강에서 수상 스키를 탄다.");
	}
	
	public void doSightsseintg() {
		System.out.println("경북궁 관광을 한다.");
	}
	
	public void eatFood() {
		System.out.println("전주비빔밥 맛집에 간다.");
	}
	
	// 객체 지향 프로그래밍에서 중요한 개념 중 하나!
	// 메서드는 최소한의 동작만 해야한다.
	// 하나의 메서드가 두 개 이상의 동작을 담당하면 안됨!
	
	// tour
	
	
	public void tour() {
		doLeisureSports();
		
		doSightsseintg();
		
		eatFood();
		}
		
		
	}
