package chapter13;

public class TourGuide {
	private TourKnowledge tourKnowledge;
	
	public TourGuide(String location) {
		if(location.equals("korea")) {
		tourKnowledge = new KoreaTourKnowledge();
	} else {
		tourKnowledge = new JapanTourKnowledge();
	}
}
	
	public void tour() {
		tourKnowledge.leisuresports();
		tourKnowledge.sightseeing();
		tourKnowledge.food();
	}
}
