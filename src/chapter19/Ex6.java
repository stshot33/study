package chapter19;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex6 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			// 어떤 파일과 outputStream으로 연결했을 때
			// 그 위치에 파일이 없으면 파일을 생성함
			fos = new FileOutputStream("new.txt");
			
			// a~z까지 new.txt에 저장하세요.
			// 한 줄에 알파벳 하나씩 저장하세요.
			for(char ch='a'; ch<='z'; ch++) {
			fos.write(ch);
			fos.write('\n');
			}
			
		} catch (IOException e){
			e.printStackTrace();			
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}