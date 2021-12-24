package chapter07;


import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
	
	@Bean(destroyMethod = "close")	// .close의 역할을 함
	public DataSource dataSource() {
		// 커넥션 풀은 커넥션을 생성하고 유지
		// 커넥션 풀에 커넥션을 요청하면 해당 커넥션은 활성(active) 상태가 되고
		// 커넥션을 커넥션 풀에 반환하면 유휴(idle) 상태가 됨
		
		// 커넥션 풀에 커넥션을 요청할 때는 getConnection() 메서드를 호출
		// 커넥션을 커넥션 풀에 반환할 때는 close() 메서드를 호출함
		DataSource ds = new DataSource();
		
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUrl("jdbc:mariadb://localhost:3306/spring");
		ds.setUsername("root");
		ds.setPassword("0000");
		
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		ds.setMaxIdle(10);
		
		return ds;
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource());
	}
}
