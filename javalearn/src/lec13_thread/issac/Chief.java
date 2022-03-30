package lec13_thread.issac;

public class Chief extends Thread {
	private Issac issac;
	
	Chief(Issac issac){
		this.issac = issac;
	}
	@Override
	public void run() {
		for(int i = 1; i< 10; i ++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			issac.makeToast();
		}
	}
}
