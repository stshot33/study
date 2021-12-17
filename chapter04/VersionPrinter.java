package chapter04;

import org.springframework.stereotype.Component;

@Component("versionPrinter")
public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;

	public void print() {
		String fullVersion = majorVersion + "." + minorVersion;

		System.out.println("프로그램 버젼 : " + fullVersion);
		System.out.println();
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}

}
