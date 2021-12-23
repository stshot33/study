package chapter06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chapter06.config.AppCtx;

public class Main4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

		// 다형성 때문에 전혀 문제가 없어보이지만 실제로는 스프링이 프록시 디자인 패턴을 적용한 새로운 타입의 인스턴스를 만들기 때문에
		// 예외가 발생 / 예외 메세지 : 이름이 calculator인 빈 객체의 실제 타입은 ImpCalculator1 가 아니라 com.sun.proxy.$Proxy~~ 이다 확인해봐라 라는 메세지가 나오게 됨
		ImpCalculator1 cal = ctx.getBean("calculator", ImpCalculator1.class);
		
		cal.factorial(5);
		
		ctx.close();
	}
}