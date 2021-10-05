package chapter7;

public class Ex6 {
	public static void main(String[] args) {
		// 인스턴스 멤버 변수는 인스턴스를 만들 때 생성된다 라고 배웠음
		// 클래스 멤버 변수는 언제 생성될까?
		// 우리가 어떤 소스 파일을 실행시키면 컴퓨터는 프로젝트 전체를 다 전달 받고
		// 프로젝트 내 모든 패키지, 클래스를 먼저 분석을 함
		// 클래스의 정보를 분석할 때 클래스 멤버 변수를 만나면
		// 컴퓨터는 메모리에 클래스 멤버 변수를 생성
		// 
		// 그 다음에 가장 마지막으로 우리가 실행시킨 소스 파일이 실행됨
		
		Phone.maker = "애플";
		
		System.out.println("Hello World~!");
	}
}
