package chapter19;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		while(true) {
			int data = input.read();
			if(data == -1) {
				break;
			}
			
			output.write(data);
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input source : " + Arrays.toString(inSrc));
		System.out.println("Output source : " + Arrays.toString(outSrc));
		
		try {
			input.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
