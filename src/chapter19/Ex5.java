package chapter19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		// 프로젝트 내 test.txt 파일의 내용을 전부 Sysout으로 화면에 출력하세요.
		try {
			fis = new FileInputStream("test.txt");
			
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
				
				System.out.print((char)data);
			}
			
			
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fis.close를 finally에 놓어서 동작하도록 프로그램을 수정하세요.
			try {
				fis.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		
	}
}
