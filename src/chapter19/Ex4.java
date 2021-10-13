package chapter19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) {
		
		// 파일의 경로 표기법
		// 1. 절대 경로 : 이 운영체제의 최상위(Root)에 있는 경로부터 나열하는 표기법
		// 예) C:\Users\User\Desktop\text.txt
		// 2. 상대 경로 : 이 파일이 있는 위치부터 찾아가는 표기법
		// 예) test.txt
		// java는 이 프로젝트의 시작부터 찾기 시작함
		// 상대 경로를 사용해서 chapter19 패키지 안에 들어있는 test.txt를 찾아라
		// -> src/chapter19/test.txt
		// 상대 경로 기호
		// (1) ./  -> 여기 (이 파일이 있는 위치)
		// (2) ../ -> 이 위에 (이 파일을 포함하는 폴더로 올라감)
		// ./test.txt -> 프로젝트 안에서 찾음
		// ../test.txt -> 이 파일이 들어있는 위치에서 한 단계 위로 올라가서 찾음
		// ../../test.txt -> 이 파일이 들어있는 위치에서 두 단계 위로 올라가서 찾음
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\text.txt");

			// 이 파일의 처음부터 끝까지 모든 데이터를 읽어와 Sysout으로 출력
			// 1바이트를 아스키 코드를 읽어옴
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
				
				System.out.println("data = " + (char)data);
				
			}
			
			
			
			
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.out.println("알 수 없는 오류가 발생했습니다.");
		}
	}
}
