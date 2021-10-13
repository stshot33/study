package chapter19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex7 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		fis = new FileInputStream("test.txt");
		fos = new FileOutputStream("new.txt");
		
		// test.txt 파일에 들어있는 데이터를
		// new.txt로 복사하는 프로그램
		
		// 1. test.txt 파일에 들어있는 데이터를 읽어옴
		// 2. 읽어온 데이터를 new.txt에 출력
		while(true) {
			int data = fis.read();
			if(data == -1) {
				break;
			}
			fos.write(data);
		}
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			fis.close();
			fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
