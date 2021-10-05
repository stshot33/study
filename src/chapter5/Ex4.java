package chapter5;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
		// 무작위로 수 하나를 뽑기 위한 Random 기능 꾸러미 생성
		Random random = new Random();
		
		// random.nextInt(숫자) -> 0 ~ 숫자미만 사이의 수 하나를 뽑아줌
		int dice = random.nextInt(6) + 1;
		
		System.out.println("주사위를 굴려서 나온 숫자는 " + dice + " 입니다.");
		
		dice = random.nextInt(6) + 1;
		
		System.out.println("주사위를 굴려서 나온 숫자는 " + dice + " 입니다.");
		
		dice = random.nextInt(6) + 1;
		
		System.out.println("주사위를 굴려서 나온 숫자는 " + dice + " 입니다.");
		
		dice = random.nextInt(6) + 1;
		
		System.out.println("주사위를 굴려서 나온 숫자는 " + dice + " 입니다.");
		
		dice = random.nextInt(6) + 1;
		
		System.out.println("주사위를 굴려서 나온 숫자는 " + dice + " 입니다.");
	}
}



