package chapter19;

import java.io.File;
import java.io.IOException;

public class Ex12 {
	public static void main(String[] args) {
		// File 이라는 클래스 이름 때문에 많이 혼동을 하는데
		// File 클래스를 사용해서 파일의 정보 뿐만 아니라
		// 디렉토리(폴더) 정보도 알 수 있음
		File file = new File("info.txt");
		
		if(file.exists() && file.isFile()) {
			System.out.println("파일이 존재함");
		} else {
			System.out.println("파일이 존재하지 않음");
			
			file.mkdir();
		}
		// mkdir - 폴더를 만듦
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
