package chapter02;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {
	private static ApplicationContext ctx = null;

	public static void main(String[] args) {
		// 스프링 컨테이너는 설정 파일( 클래스 ) 에 있는 @Autowired 애노테이션도 분석하고
		// 설정 파일에 있는 빈 객체의 클래스도 분석해서 @Autowired 애노테이션을 찾아서
		// 자동 의존 주입을 해줌
		// 설정 클래스를 빈 객체로 등록
//		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
//		ctx = new AnnotationConfigApplicationContext(AppConf1.class, AppConf2.class);
		ctx = new AnnotationConfigApplicationContext(AppImport.class);

		// 컨테이너 안에 있는 AppConf1 타입의 빈을 가져온다
		// 꼭 빈의 이름을 써야하는 건 아님
		// 특정 타입의 빈이 컨테이너 안에 1개만 있다면
		// 빈의 타입만 써도 그런 타입의 빈을 가져온단
		// 컨테이너에 해당하는 타입의 빈이 없다면 NoSuchBeanDefinitionException 예외가 발생
		// 컨테이너에 해당하는 타입의 빈이 여러개면 NoUniqueBeanDefinitionexception 예외가 발생
//		ctx.getBean(AppConf1.class);
		
		Scanner scanf = new Scanner(System.in);

		while (true) {
			System.out.println("명령어를 입력하세요.");

			String command = scanf.nextLine();
			if (command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다.");
				break;
			}

			if (command.startsWith("new ")) {
				processNewCommand(command.split(" "));
				continue;
			} else if (command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			} else if (command.startsWith("list")) {
				processListCommand();
				continue;
			} else if (command.startsWith("info")) {
				processInfoCommand(command.split(" "));
				continue;
			} else if (command.startsWith("version")) {
				processVersioncommand();
				continue;
			}

			printHelp();
		}

		scanf.close();
	}

	private static void processVersioncommand() {
		// getBean 메서드의 첫 번째 인자 - 빈의 이름
		// getBean 메서드의 두 번째 인자 - 빈의 타입
		VersionPrinter versionPrinter = ctx.getBean( VersionPrinter.class);
		
		versionPrinter.print();
	}

	private static void processInfoCommand(String[] arg) {
		if(arg.length != 2) {
			printHelp();
			return;
		}
		
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		
		infoPrinter.printMemberInfo(arg[1]);
	}

	private static void processListCommand() {
		MemberListPrinter listPrinter = ctx.getBean("listPrinter", MemberListPrinter.class);
		listPrinter.printAll();
	}

	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}

		try {
			ChangePasswordService cps = ctx.getBean("changePwdSvc", ChangePasswordService.class);

			cps.changePassword(arg[1], arg[2], arg[3]);

			System.out.println("비밀번호가 변경되었습니다.\n");
		} catch (MemberNotFoundException e) {
			System.out.println("일치하는 회원정보가 없습니다.\n");
		} catch (WrongIdPasswordException e) {
			System.out.println("현재 비밀번호가 다릅니다.\n");
		}

	}

	private static void processNewCommand(String[] arg) {
		if (arg.length != 5) {
			printHelp();
			return;
		}

		RegisterRequest rr = new RegisterRequest();
		rr.setEmail(arg[1]);
		rr.setName(arg[2]);
		rr.setPassword(arg[3]);
		rr.setConfirmPassword(arg[4]);

		if (!rr.isPasswordEqualToConfirmPasword()) {
			System.out.println("암호와 확인이 일치하지 않습니다.\n");
			return;
		}

		try {
			MemberRegisterService mrs = ctx.getBean("memberRegSvc", MemberRegisterService.class);

			long id = mrs.regist(rr);

			System.out.println("아이디가 " + id + " 인 사용자가 등록되었습니다.");
		} catch (DuplicatememberException e) {
			System.out.println("이미 존재하는 이메일입니다.\n");
		}

	}

	private static void printHelp() {
		System.out.println();

		System.out.println("잘못된 명령입니다. 아래 명령어 사용방법을 확인하세요.");
		System.out.println("<< 명령어 사용 방법 >>");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println("list");
		System.out.println("info 이메일");

		System.out.println();
	}

}
