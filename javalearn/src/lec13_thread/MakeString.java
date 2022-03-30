package lec13_thread;

public class MakeString {

	public static void main(String[] args) {
		// 문자열을 아주 길~~게 만들어보자
		String result = ""; // String 쓰면 가비지컬렉터가 1억번이나 일을해서 StringBuffer를 써주는게 좋다.
//		StringBuffer sbResult = new StringBuffer("");
		StringBuilder sbResult = new StringBuilder("");	 // StringBuilder는 동기화를 지원하지 않아서 서로 값이 겹쳐 엉망임.
/*
		for (int i = 0; i < 100000000; i++) {
//			result += (int)(Math.random()*10);
			sbResult.append((int) (Math.random() * 10));

			if (i % 10000000 == 0) {
				System.out.println(i + "...");
			}
		}
//		System.out.println(result.length());
		System.out.println(sbResult.length());
*/
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 50000000; i++) {
				sbResult.append((int) (Math.random() * 10));

				if (i % 10000000 == 0) {
					System.out.println(i + "...");
				}
			}
			System.out.println(sbResult.length());
		}, "유진");

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 50000000; i++) {
				sbResult.append((int) (Math.random() * 10));

				if (i % 10000000 == 0) {
					System.out.println(i + "...");
				}
			}
			System.out.println(sbResult.length());
		}, "예반");

		thread1.start();
		thread2.start();

	}

}
