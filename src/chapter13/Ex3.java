package chapter13;

public class Ex3 {
	public static void main(String[] args) {
		Player player = new AudioPlayer();
		player.play(0);
		player.stop();
		
		player = new VideoPlayer();
		player.play(0);
		player.stop();
	}
}
