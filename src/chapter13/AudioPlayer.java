package chapter13;

// 추상 클래스를 활용한다는 건
// 본질이 클래스이기 때문에 다른 클래스의 부모 클래스로 활용하거나
// 또는 자식 클래스로 추상 클래스명 옆에 extends를 붙이거나 한다는 것

// 추상 클래스의 자식 클래스는 부모 클래스인 추상 클래스의 추상 메서드를 반드시 구현(정의) 해야 함.
public class AudioPlayer extends Player{

	@Override
	public void play(int pos) {
		System.out.println("오디오가 재생됩니다.");
	}

	@Override
	public void stop() {
		System.out.println("오디오가 멈췄습니다.");
	}
	
}
