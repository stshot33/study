package chapter19;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		byte[] temp = new byte[3];
		// 적절히 끊어서 가지고 와야 컴퓨터의 부하를 줄일 수 있음

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		try {
			while (input.available() > 0) {
				input.read(temp);
				output.write(temp);

				outSrc = output.toByteArray();
				System.out.println("temp : " + Arrays.toString(temp));
				System.out.println("Output source : " + Arrays.toString(outSrc));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
