package lec13_thread.factory;

public class Soup implements Runnable{
	Factory factory;
	
	Soup(Factory factory){		// 스프에 팩토리를 받아줌.
		this.factory = factory;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i ++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			factory.makeSoup();
		}
	}
	
}
