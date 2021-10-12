package chapter19;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		byte[] temp = new byte[10];

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		// 데이터를 읽어와(read) temp 배열에 저장하는데
		// temp.length개 만큼 읽어와서 temp 배열에 0번 인덱스부터
		// 읽어온 데이터를 저장함
		input.read(temp, 0, temp.length);
		
		System.out.println(Arrays.toString(temp));
		
		try {
			// temp에 들어있는 모든 데이터를 출력
			output.write(temp);
			
			outSrc = output.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		// 스트림을 닫는 close 메서드는 생략
	}
}
