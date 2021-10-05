package chapter5;

public class Ex15 {
	public static void main(String[] args) {
		int dayOfMonth = 1;
		int week = 7;
		int dayOfWeek = dayOfMonth % week;
		
		System.out.print("2021년 3월 " + dayOfMonth + "일은 ");
		
		if(dayOfWeek == 0) System.out.println("일요일");
		else if(dayOfWeek == 1) System.out.println("월요일");
		else if(dayOfWeek == 2) System.out.println("화요일");
		else if(dayOfWeek == 3) System.out.println("수요일");
		else if(dayOfWeek == 4) System.out.println("목요일");
		else if(dayOfWeek == 5) System.out.println("금요일");
		else System.out.println("토요일");
	}
}



