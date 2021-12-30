package chapter07;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class LogDao {
	private JdbcTemplate jdbcTemplate;
	
	public LogDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insertLog(long memberIdx, int categoryIdx, String message) {
		String sql = "INSERT INTO log(member_idx, log_category, message, regdate) VALUES (?, ?, ?, CURRENT_TIMESTAMP())";
		
		jdbcTemplate.update(sql, memberIdx, categoryIdx, message);
	}
}
