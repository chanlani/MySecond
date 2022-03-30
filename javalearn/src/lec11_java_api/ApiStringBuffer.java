package lec11_java_api;

public class ApiStringBuffer {

	public static void main(String[] args) {
		// 문자열하면 = String
		// String을 계속 수정하게되면 힙 메모리 영역에 
		// 계속 새로운 String 객체가 만들어지고,
		// 그로인해 가비지 컬렉터가 할 일이 많아진다.
		
		// 1부터 10까지의 숫자를 문자열로 다 더하면?
		String strVal = "";
		for(int i = 1; i <=10; i++) {
			// 매 순간 새로운 메모리 영역을 할당
			// 기존 메모리 영역에 남아있는 값은 가비지 컬렉터에 의해 
			// 삭제된다.(비효율)
			strVal += i;	
		}
		System.out.println(strVal);
		
		String hello = "안녕";
		String hi = "안녕";
		
		System.out.println(hello.hashCode());
		System.out.println(hi.hashCode());
		
		hello += "하세요";
		hi += "하세요";
		System.out.println(hello.hashCode());
		System.out.println(hi.hashCode());
		
		System.out.println("\n=====================\n");
		
		// StringBuffer 이용
		StringBuffer strBuff = new StringBuffer("안녕");
		System.out.println(strBuff);
		System.out.println(strBuff.hashCode());
		
		// 문자열 추가
		strBuff.append("하세요");
		System.out.println(strBuff);
		System.out.println(strBuff.hashCode());		// 해쉬코드가 그대로 나옴. 즉 String값이 변하지 않음. 그래서 가비지 컬렉터가 일을 하지않음.
		
		// StringBuffer가 가진 문자열을 String으로 변환
		String strVar = strBuff.toString();
		System.out.println(strVar);
		
		System.out.println("\n=============================\n");
		
		// StringBuilder 이용
		StringBuilder strBuil = new StringBuilder("안녕");
		System.out.println(strBuil);
		System.out.println(strBuil.hashCode());
		
		// 문자열 추가
		strBuil.append("하세요");
		System.out.println(strBuil);
		System.out.println(strBuil.hashCode());
		
		// StringBuilder가 가진 문자열을 String으로 변환
		String str = strBuil.toString();
		System.out.println(str);
		
		// 둘의 차이점
		// StringBuffer는 동기화 지원
		// StringBuilder는 동기화 미지원
		
		// 동기화란?
		// 멀티쓰레드 환경에서 해당 객체가 모든쓰레드에서
		// 안정적으로 사용 가능하도록 하는 것
		
		// 동기화 미지원
		// 쓰레드 a, b, c에서 strBuild를 사용할 때, 쓰레드 a에서 
		// strBuild를 바꾼 경우 b, c는 이를 모른다.
		
		// 동기화 지원
		// 쓰레드 a,b,c에서 strBuffer를 사용할 때, 쓰레드 a에서
		// strBuffer를 바꾼 경우 b,c는 이를 알 수 있다.
		// 단일 쓰레드를 사용하면 느린 성능
		
		
		
		
	}

}
