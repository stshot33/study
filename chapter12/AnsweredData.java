package chapter12;

import java.util.List;

// 설문지 역할을 할 클래스
// RegisterRequest 클래스와 다른 점
// 1. 리스트 타입의 멤버 변수가 있음
// 2. 중첩 멤버 변수를 가짐
// 스프링 MVC는 이 클래스와 같이 멤버 변수의 구조가 복잡할 때도
// 요청 파라미터의 값을 알맞게 커맨드 객체에 저장할 수 있는 기능을 제공
// 요청 파라미터 이름이 "멤버변수이름[인덱스]" 형식이면 List 타입 멤버 변수의 값들로 처리함
// 요청 파라미터 이름이 "멤버변수이름.멤버변수이름" 형식이면 중첩 멤버 변수의 값으로 처리함
public class AnsweredData {

	private List<String> responses;
	private Respondent res;

	public List<String> getResponses() {
		return responses;
	}

	public void setResponses(List<String> responses) {
		this.responses = responses;
	}

	public Respondent getRes() {
		return res;
	}

	public void setRes(Respondent res) {
		this.res = res;
	}

}
