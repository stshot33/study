package chapter01;

public class Greeter {
	private String format;
	
	public String greeter(String guest) {
		return String.format(format,  guest);
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
}