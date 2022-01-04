package chapter08;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	// @GetMapping -> 이 메서드가 처리할 경로를 지정
	// Model 타입의 매개변수 -> 컨트롤러의 데이터를 뷰로 전달할 때 사용
	// @RequestParam 애노테이션이 붙은 매개변수 -> 이름이 name인 요청 파라미터의 값을 이 매개변수에 저장
	// required 속성 : 필수 여부 지정
	@GetMapping("/hello")
	public String hello(Model model, 
			@RequestParam(value = "name", required = false) String name) {
		
		// 뷰에 전달할 데이터를 저장
		model.addAttribute("greeting", name + " 님 안녕하세요~!");
		
		// 컨트롤러의 결과를 보여줄 뷰를 지정
		// 결과를 보여줄 뷰 파일의 이름은 hello.jsp
		// 뷰 파일의 경로는 루트 디렉토리(/) 임
		return "hello";
	}
}
