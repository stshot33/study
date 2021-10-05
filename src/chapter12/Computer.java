package chapter12;

public class Computer {
	private String cpu;
	private String gpu;
	private String ram;
	private String hdd;
	
	public void powerOnOff() {
		System.out.println("전원을 켜거나 끈다");
	}
	
	public void typing() {
		System.out.println("키보드로 타이핑을 한다.");
	}
	
	public void playGame() {
		System.out.println("게임을 한다.");
	}
	
	public void showComputerInfo() {
		System.out.println("==== [ Computer Info ] ====");
		System.out.println("CPU = " + cpu);
		System.out.println("GPU = " + gpu);
		System.out.println("RAM = " + ram);
		System.out.println("HDD = " + hdd);
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
}




