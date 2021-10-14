package chapter19;

import java.io.File;

public class Ex11 {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Desktop\\9월\\2021-09-08";
		String name = "empty.txt";
		File file = new File(path, name);
		
		// 경로를 포함한 파일 이름
		System.out.println(file.getPath());
		// 이 파일의 절대경로
		System.out.println(file.getAbsolutePath());
		// 이 파일이 들어있는 디렉토리(폴더)
		System.out.println(file.getParent());
		
		// System.getProperty() -> 이 프로그램과 관련된 정보를 알려주는 메서드
		// System.getProperty("user.dir") 설정이 어떻게 되어이쓴ㄴ지 물어보는 메서드
		// user.dir은 이 프로그램의 위치를 의미
		System.out.println("user.dir - " + System.getProperty("user.dir"));
	}
}
