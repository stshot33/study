package chapter17;

public class Customer {
	private String name;
	private String tel;
	private int seat;

	public Customer(String name, String tel, int seat) {
		this.name = name;
		this.tel = tel;
		this.seat = seat;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	@Override
	public String toString() {
		return "name="+name+"/tel="+tel+"/seat="+seat;
	}
}
