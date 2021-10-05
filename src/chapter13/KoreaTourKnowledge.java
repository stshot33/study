package chapter13;

public class KoreaTourKnowledge implements TourKnowledge {

	@Override
	public void leisuresports() {
		System.out.println("한강에서 수상스키를 탄다.");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관광을 한다.");
	}

	@Override
	public void food() {
		System.out.println("전주비빔밥 맛집에 간다.");
	}

}
