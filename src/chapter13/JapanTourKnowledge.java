package chapter13;

public class JapanTourKnowledge implements TourKnowledge{

	@Override
	public void leisuresports() {
		System.out.println("도쿄타워에서 번지점프를 한다.");
	}

	@Override
	public void sightseeing() {
		System.out.println("후쿠오카 커넬시티 관광을 한다.");
	}

	@Override
	public void food() {
		System.out.println("라멘 맛집에 간다.");
	}

}
