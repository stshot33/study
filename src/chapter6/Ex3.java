package chapter6;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
		// 복권 1등에 당첨될 때까지 복권을 산다.
		
		Random random = new Random();
		
		// 복권 당첨 여부
		boolean isWin = false;
		
		while(true) {
			System.out.println("복권을 산다.");
			System.out.println("당첨 여부를 확인한다.");
			isWin = random.nextBoolean();	// 당첨 여부 결정
			if(isWin) {
				System.out.println("축하합니다! 복권에 당첨되었습니다.");
				// 더 이상 복권을 사지 않도록 처리 ( 반복문을 빠져나가기 )
				break;
			}
		}
	}
}




