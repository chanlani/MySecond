package lec13_thread.issac;

public class IssacMain {

	public static void main(String[] args) {
		Issac issac = new Issac();
		
		Chief chief = new Chief(issac);
		
		Customer minwoo = new Customer(issac, 2, "민우");
		Customer gildong = new Customer(issac, 5, "길동");
		Customer watashi = new Customer(issac, 3, "은지");
		
		chief.start();
		minwoo.start();
		gildong.start();
		watashi.start();
		
		
	}

}
