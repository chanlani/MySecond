package lec13_thread.factory;

public class Packing implements Runnable {
	Factory factory;
	
	Packing(Factory factory){
		this.factory = factory;
	}
	
	
	@Override
	public void run() {
		factory.packing(); 		// Factory 클래스에 packing 재귀함수를 써서 반복문돌릴 필요 없음.
	}

}
