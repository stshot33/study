package chapter10;

public class TV {
	boolean power;
	
	void powerOnOff() {
		if(power) {
			// 전원이 켜진 상태면 전원을 끈다
			power = false;
			System.out.println("전원 on -> off");
		} else {
			// 전원이 꺼진 상태면 전원을 켠다
			power = true;
			System.out.println("전원 off -> on");
		}
	}
	
	void channelUp() {
		
	}
	
	void channelDown() {
		
	}
}
