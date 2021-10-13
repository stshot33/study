package chapter19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex8 {
	public static void main(String[] args) {
		// 보조 스트림을 사용하려면 기반 스트림이 필요함
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("new.txt");
			bos = new BufferedOutputStream(fos, 5);
			
			for(char ch='1'; ch<='9'; ch++) {
				bos.write(ch);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 보조 스트림을 닫으면 기반 스트림도 같이 닫힌다.
			try {
				bos.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}