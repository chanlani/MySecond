package lec13_thread.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory = new Factory();
		factory.endFactory = new EndFactory(){

			@Override
			public void endFactory() {
				System.out.println("공장가동을 중지한다.");
			}
			
		};
		
		Ramen ramen = new Ramen(factory);
		Thread thread1 = new Thread(ramen, "면");
		thread1.start();
		
		Thread thread2 = new Thread(new Soup(factory), "스프");
		thread2.start();
		
		new Thread(new Packing(factory), "포장").start();		// 위에서 하나씩 줄여서 붙인거임.
		
	}

}
