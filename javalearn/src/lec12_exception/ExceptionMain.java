package lec12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		int[] intArray = {1,2,3};
		
		// 에러가 발생하면 프로그램이 즉시 종료되기 때문에 
		// 웹 페이지라면 응답이 없어지며, 앱의 경우 종료된다.
		try {
			System.out.println("인덱싱 시작");
			System.out.println(intArray[3]);  // 여기부터 오류라서 밑의 인덱싱끝을 출력하지않고 바로 catch로 넘어감.
			System.out.println("인덱싱끝");
		}catch(Exception e) {
			e.printStackTrace();
			// 에러가 콘솔창에 출력되는 시점과
			// syso가 콘솔창에 출력되는 시점은 다르다.
			System.err.println("난 딸기야");
			System.out.println("망했다");
			// 웹사이트의 경우 에러 사이트로 이동
		}
		
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {		// ArrayIndexOutOfBoundsException는 exception의 상속받은거.
			// 구체적인 에러 지정
			System.out.println("인덱스3은 없습니다");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		System.out.println("\n============================\n");
		
		int intA = 3;
		int intB = 0;
		
		try {
			System.out.println(intArray[3]);
			System.out.println(intA/intB);
		}catch(ArithmeticException a) {
//			a.printStackTrace();   에러 난 것을 표시함.
			System.out.println("0으로 나누지 마시오");
		}catch(ArrayIndexOutOfBoundsException e) {
			// 각 예외에 대한 다른 처리를 할 수 있다.
			System.out.println("인덱스 범주에 넘어섰음");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		// 충분히 예상되는 에러의 경우 따로 Exception 클래스를
		// 만들어서 처리한다. -> BizException
		
		try {
			System.out.println(ExMethod.divide(5, 0));
		}catch(BizException e) {
			System.out.println("예측된에러발생");
			// 서버로 에러 코드와 에러 메시지를 보냅니다.
//			e.printStackTrace();	
			// 에러 메시지 읽기
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("나도모르는에러");
		} 
		
		System.out.println("\n===============================\n");
		try {
			ExMethod.showName("2334");
		}catch(BizException b){
			System.out.println("에러코드 : "+b.getErrCode());
			System.out.println("에러코드 : "+ b.getMessage());
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		System.out.println("\n===================================\n");

		try {
			ExMethod.dateMillSec("2022.03.22");
		}catch(ParseException p) {
			System.out.println("날짜 포맷을 yyyy.MM.dd로 맞춰주세요");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}finally {
			// 예외가 발생하든 말든 실행할 명령어 입력
			// 일반적인 명령문의 경우 finally 에 굳이 쓸 이유가 없다
			// 주로 try문에서 사용된 객체를 close할 때 이용
			System.out.println("에러가 발생하던 말던 실행됨");
		}
		System.out.println("에러가 발생하던 말던 실행됨");
		
	}

}
