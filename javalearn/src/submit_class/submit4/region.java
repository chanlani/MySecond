package submit_class.submit4;

public class region {
	String 서울;
	String 대전;
	String 부산;
	int distance;
	public region(String 서울, String 대전, String 부산, int distance) {
		super();
		this.서울 = 서울;
		this.대전 = 대전;
		this.부산 = 부산;
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "region [서울=" + 서울 + ", 대전=" + 대전 + ", 부산=" + 부산 + ", distance=" + distance + "]";
	}
	public String get서울() {
		return 서울;
	}
	public void set서울(String 서울) {
		this.서울 = 서울;
	}
	public String get대전() {
		return 대전;
	}
	public void set대전(String 대전) {
		this.대전 = 대전;
	}
	public String get부산() {
		return 부산;
	}
	public void set부산(String 부산) {
		this.부산 = 부산;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
}
