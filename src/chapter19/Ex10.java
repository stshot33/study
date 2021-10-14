package chapter19;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			// outputStream은 기본적으로 덮어쓰기 모드로 생성
			// 연결할 파일이 존재하지 않으면 파일을 새로 생성한 뒤에 연결
			// 연결할 파일이 존재하면 파일 안에 들어있는 내용을 비우고 연결
			
			// 기존의 데이터는 유지한 채로 마지막에 새로운 데이터를 추가하려면
			// outputstream을 추가하기(append) 모드로 생성
			fos = new FileOutputStream("empty.txt", true);
			
			// 중간에 데이터를 추가하는 그런 기능은 없기 때문에
			// 기존의 데이터 중간에 새로운 데이터를 추가한다 라면
			// 우리가 지금까지 배운 걸 활용해서 직접 만들어야 함
			
			fos.write('1');
			fos.write('2');
			fos.write('3');
			fos.write('4');
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
