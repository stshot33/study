package chapter11;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/main").setViewName("main");
	}
	
	// message 패키지 안에 만들어둔 메세지 파일인 label.properties를 불러와
	// 해당 파일 내 메세지들을 message.label 이라는 이름에 저장
	// message.label -> message 패키지 안에 있는 label.properties 파일을 불러와라
	// label.properties 파일 내 문자 인코딩을 UTF-8로 사용했으므로
	// 불러온 문자열의 인코딩을 UTF-8로 설정


	// 주의사항!
	// 메세지 파일을 불러오는 빈의 이름은 반드시 messageSource 여야 함
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
		
		ms.setBasenames("message.label");
		ms.setDefaultEncoding("UTF-8");		
		
		return ms;
	}
	
	@Override
	public Validator getValidator() {
		return new RegisterRequestValidator();
	}
}


