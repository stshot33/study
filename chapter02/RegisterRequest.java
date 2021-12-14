package chapter02;

// 회원가입을 처리할 때 필요한 이메일, 암호, 이름 데이터를 담고 있을 DTO
public class RegisterRequest {
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	
	public boolean isPasswordEqualToConfirmPasword() {
		return password.equals(confirmPassword);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
