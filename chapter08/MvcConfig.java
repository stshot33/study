package chapter08;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @EnableWebMvc -> 스프링 MVC 활성화
// WebMvcConfigurer 인터페이스 -> 스프링 MVC의 설정을 조정할 때 사용

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

	// DefaultServlet과 관련된 설정
	// DispatcherServlet의 매핑 경로를 / 로 주었을 때, JSP/HTML/CSS 등 웹 요소들을 올바르게 처리하기 위한 설정
	// DispatcherServlet -> 스프링 MVC가 웹 요청을 처리하려면 반드시 필요한 요소
	// 스프링 MVC가 웹 요청을 처리할 때 DispatcherServlet을 통해서 웹 요청을 받음
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	// ViewResolver와 관련된 설정
	// 요청 결과를 보여주기 위한 설정
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
}