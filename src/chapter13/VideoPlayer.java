package chapter13;

public class VideoPlayer extends Player{

	@Override
	public void play(int pos) {
		System.out.println("동영상을 재생합니다.");
	}

	@Override
	public void stop() {
		System.out.println("동영상이 멈췄습니다.");
	}
	
}
