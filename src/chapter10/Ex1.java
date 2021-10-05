package chapter10;

public class Ex1 {
	public static void main(String[] args) {
		// TDD ( Test Driven Development ) : 테스트를 통해서 개발하는 기법
		// 내가 원하는 결과물이 이미 완성됬다고 가정하고
		// 내가 원하는 결과가 나오도록 사용하는 코드부터 시작하는 개발 방법
		
		// 내 방 TV 객체
		TV myRoomTV = new TV();
		
		myRoomTV.powerOnOff();
		myRoomTV.powerOnOff();
		myRoomTV.powerOnOff();
		
		myRoomTV.channelUp();
		
		myRoomTV.channelDown();
		
		// 거실 TV 객체
		TV livingRoomTV = new TV();
	}
}



