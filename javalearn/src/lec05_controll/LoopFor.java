package lec05_controll;

public class LoopFor {
	public static void main(String[] args) {
		
		// 반복문
		// for문
		for(int intVal = 0; intVal < 10; intVal++) {
			System.out.println(intVal);
		}
	//	System.out.println(i); // for 문 안에 있는 변수는 중괄호 안쪽에서 유효 그래서 프린트해도 i변수값이 안나옴.
		
		
		/*
		 * 디버깅 모드
		 * 코드라인 좌측 부분을 더블클릭하면 breakpoint(초록점)이 생깁니다.
		 * [단축키 ctrl + shift + B]
		 * 토글 형식이라 더클블릭 혹은 단축키로 생성/삭제 가능
		 * 코드를 한줄 한줄 실행해보며, 변수에 어떤 값이 담기는지
		 * 확인할 때, 주로 사용
		 * 상단 Run 버튼 좌측 벌레 모양의 아이콘 클릭하면 
		 * 디버깅 모드 실행
		 * 디버깅 모드에 적합한 화면 스타일(Perspective)로 
		 * 전환할거냐는 메시지 창이 뜬다.
		 * 오케이하면 디버깅 모드가 실행되어 현재 코드들이 
		 * 위에서부터 실행되다가 breakpoint가 있는 지점에 멈춰서 대기를 한다.
		 * 이후 상단의 Run - step over [단축키 F6] 을 실행하면
		 * 한줄한줄 실행이 됩니다.
		 * 디버깅 모드를 종료하시려면 Terminate [단축키 ctrl + F2]
		 * 이후 원래 화면으로 돌아오려면 우측 상단의 Perspective
		 * 버튼에서 Java를 클릭하면 된다.
		 */
		
		// 실수로 ctrl + shift + f11을 하면 Coverage 활성화
		// 코드 검사기능으로 작성을 잘했으면 녹색, 못했으면 적색으로 표기
		// 각종 view들은 상단 window - show view 안에 다 들었으니 자유자재로 껐다 켜도된다.
		
		// 1부터 20까지 더하기
		int num = 0;
		for(int i=1; i<=20; i++) {
			num += i;
		}
		System.out.println("1부터 20까지 더하면 " + num);
		
		for(int i = 0; i < 10; i = i + 1) {
			System.out.println(i);
		}
		for(int i = 0; i < 10; i += 1) {
			System.out.println(i);
		}
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		for(double j =0; j < 2; j += 0.2) {
			System.out.println(j);
			// 실수인 float과 double의 연산은 정확하지 않으므로
			// 비추천한다.
		}
		
		// 구구단 2단
		// 2 * 1 = 2
		// ~ 2 * 9= 18 이 나오도록 해본다.
		
		
		for(int i = 1; i <=9; i++) {
			System.out.println("2 * "+ i + " = "+(i*2));
		}
		for(int i = 1; i <10; i++) {
			System.out.println("3 * "+i+" = "+(i*3));
		}
		
		for(int i = 0; i < 10; i += 1) {
			System.out.println(i);
		}		
		
		for(int i =2; i < 10; i *= 3) {
			System.out.println(i);
		}
		
		// 가끔 Console 창이 날라다닐때, 
		// 그럴때 우측 상단의 Perspective 버튼에서 
		// Java Perspective 버튼 마우스 우클릭 - reset
		// Window-show view-console
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
			
		System.out.println("\n=======================\n");
		
		// 1부터 10까지 중 홀수만 출력
		for(int i = 1; i <= 10; i++ ) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}   // 총 10번 실행됨
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}  // 총 5번 실행됨 -> 성능 증가 (프로그램 실행 속도 증가)
		
		System.out.println("\n======================\n");
		
		
		//아래의 5층 탑을 for문을 사용하여 만들어 주세요.
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		String star = "";
		for(int i = 0; i < 5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		
		System.out.println("\n======================\n");
		
		// % 나머지 연산 주로 사용할 때
		// for문 내에서 순환하는 숫자에 대해 사용
		
		System.out.println("\n=================오뚜기================\n");
		
		// 국수공장에서 면을 20cm 뽑고 있는데, 
		// 5cm마다 잘라주는 로직
		for(int i = 0; i <20; i++) {
			System.out.println("||||||||");
			
			// i가 4, 9, 14 일때 잘라야함
			if((i == 4) || (i == 9) || (i == 14)) {
				System.out.println("-------------");
			}
		}
		System.out.println("\n==============농심================\n");
		
		// 라면 공장에서 면을 30cm 뽑고 있는데,
		// 6cm마다 잘라주어야 한다.
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 ==1) {
				System.out.println("////////");
			}else {
				System.out.println("\\\\\\\\\\\\\\\\");
			}
			// i가 6, 12, 18, 24 때 잘라야 한다.
			// 6으로 나눴을때 나머지는 0이다. 
			if(i % 6 == 0 ) {
				System.out.println("--------");
			}
			
//			try {
//				Thread.sleep(300); // 1초는 1000밀리초 
//				// 현재 프로그램을 실행중인 
//				// 스레드를 괄호안 시간(단위: 밀리초, ms)
//				// 만큼 잠깐 재웠다가 깨워줍니다 
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
			
		}
		
		System.out.println("\n=====================시계==================\n");
		
		// 0시를 기준으로 매 시간마다 시간을 콘솔에 출력한다.
		// 100 시간
		for(int i = 0; i<100; i++) {
			System.out.println(i % 24);
		}
		
		System.out.println("\n========조은 시계========\n");
		
		// 시간뿐 아니라 일자도 나타나게 합시다.
		int currentDay = 18;
		int currentTime = 3;
		
		// 100시간 후, 몇일 몇시가 될까?
		for(int i = 0; i < 100; i++) {  // 이 for문은 블록{} 내의 명령문들을 100번 실행시킨다.
			int day = currentDay + (currentTime/24);
			int time = currentTime%24;
			System.out.println(day + "일 "+ time + "시 ");
			currentTime++;
		}
		// % 나머지 연산자 사용 팁 끝 ~!!
		System.out.println("\n=========유니코드 탐방==========\n");
		
		// 유니코드에서 한글 시작('가' = 43032)부터
		// 이후 10개를 출력해봅시다
		
		char charNum = 44032;
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + ". " + charNum);
			charNum++;
		}
		
		System.out.println("\n===========거꾸로 for문============\n");
		
		// 10부터 1까지 출력
		int hiNum = 10;
		for(int i = 0; i < 10; i++) {
			System.out.println(hiNum);
			hiNum --;
		}
		
		for(int i = 10; i>0; i--) {
			System.out.println(i);
		}
		System.out.println("\n============================\n");
		
		star = "*****";
		for(int i = 0; i < 5; i++) {
			System.out.println(star);
			star = star.replaceFirst("\\*", "");  // 
			// *, ?, + 를 문자로 써야 에러가 안난다.
			// 문자로 쓰려면 특수기호 앞에 \\을 붙인다.
			// regex란 정규표현식(Regular Expression)을 의미한다.
			// 정규표현식 사용 예시) 회원가입을 할 때 
			// 이름에 숫자 넣었는지 확인하고 경고!! 
			// 연락처에 숫자만 넣었는지 확인
			// 아이디에 영어랑 숫자만 넣었는지 확인
			// 비밀번호 패턴 (영어 대소문자, 숫자, 특수기호 각각 1개 이상)
		}
		
		System.out.println("\n========for문으로 String 가지고 놀기========\n");
		
		// 숫자 문자열의 각 자리수를 더해서 출력
		
		String example = "39284576";
		int result = 0;
		for(int i = 0; i < example.length(); i++) {
			String strNum = example.substring(i,i+1);
			int intNum = Integer.parseInt(strNum);
			result += intNum;
		}
		System.out.println("각 자리수를 더한 결과는 " + result);
		
		System.out.println("\n===================== '슈 '가 몇개===============\n");
		String sususu = "슈슈슛ㅅ슛슈슈,.!! 슈슈슉";
		int countSu = 0;
		for(int i = 0; i < sususu.length(); i++) {
			String strNum = sususu.substring(i, i+1);
			if(strNum.equals("슈")) {
				countSu += 1;
				System.out.println(strNum);
			}
		}
		System.out.println("슈의 갯수는 " + countSu);
		
		// 월리를 찾아라!! 
		String findWally = "윌리울리일리울리울리일리월리";
		System.out.println(findWally.length());
		// 월리가 몇개 들어있는지 콘솔에 출력해주세요
		int countWally = 0;
		for(int i = 0; i < findWally.length()-1; i++) {  // finwWally의 length가 14이니까 14보다 작은 13까지가 i에 적용된다. 
														 // 그렇게 되면 substring(i, i+2)할때 15가 되어버린다. 글자는 14글자밖에없는데 그래서 
														 // 오류를 뱉는다. 그래서 for문의 length에 -1을 해준다.
			// i는 0부터 12까지 증가한다.
			String strWally = findWally.substring(i,i+2);
			// errMsg: String index out of range
			// substring 함수를 사용시 잘라낼 변수의 길이가 
			// 벗어난 경우.
			if(strWally.equals("월리")) {
				countWally += 1;
			}
		}
		System.out.println(countWally);
		
		
		System.out.println("\n==========break 문==========\n");
		
		// i가 0부터 10까지 증가하는 for문에서
		// i가 5보다 커지게 되면 해당 for문을 종료
		
		for(int i = 0; i <=10; i++) {
			if(i > 5) {
				break;
			}
			System.out.println(i);
		}
		
		// 1부터 n까지 더한다고 했을때, 100 이상이 되는 n을 
		// 구해봅시다.
		int sumNum = 0;
		for(int i = 1; i < 1000; i++) {
			sumNum += i;
			System.out.println(sumNum);
			if(sumNum >=100) {
				System.out.println("100이상이 되는 n은 "+i+"입니다");
				break;
			}
		}
		
		System.out.println("\n========== continue 문 ==========\n");
		// 구구단 7단
		// 너무 쉬운 2,3,4 는 그냥 출력 안할래요.
		for(int i =1; i <= 9; i++) {
			if(i < 5) {
				continue;
			}
			System.out.println("7 x "+ i + " = " + (7*i));
		}
		
		// 대부분의 경우 굳이 continue 문을 쓰지 않는다.
		for(int i = 1; i <=9; i++) {
			if(i >4) {
				System.out.println("7 x "+ i + " = " + (7*i));
			}
		}
		
		System.out.println("\n=========구구단========\n");
		
		// 2 x 1 = 4
		// 2 x 2 = 6
		// 2 x 9 = 18
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 9 = 27
		
		
		// 이중 for문 (다중 for문)
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+" x "+ j +" = "+ (i*j));
			}
			System.out.println();
		}
		
		System.out.println("\n=========================\n");
		
		// 트리 만들기
		//       	*
		//         **
		//        ***
		//       ****
		//      *****
		
		star = "";
		for(int i = 0; i < 5; i++) {
			String blank = "";
			for(int j = 0; j < 5-i; j++) {
				blank += " ";
				// i가 0일때, star는 * 1개가 되고, 
				// blank는 공백 5개가 되야 한다.
				// i가 1일때, star는 * 두 개가 되고,
				// blank는 공백 4개가 되야 한다.
				// i가 2일때, star는 별 3개가 되고
				// blank는 공백 3개가 되야 한다.
			}
			star += "*";
			System.out.println(blank + star);
		}
		
		System.out.println("================");
		
		String blank = "";
		for(int i = 0; i < 5; i++) {
			star = "";
			for(int j = 0; j < 5-i; j++) {
				star += "*";
				// i가 0일때, star는 * 1개가 되고, 
				// blank는 공백 5개가 되야 한다.
				// i가 1일때, star는 * 두 개가 되고,
				// blank는 공백 4개가 되야 한다.
				// i가 2일때, star는 별 3개가 되고
				// blank는 공백 3개가 되야 한다.
			}
			blank += " ";
			System.out.println(blank + star);
		}
		
		System.out.println("================");
		
		star = "";
		for(int i = 0; i < 5; i++) {
			blank = "";
			for(int j = 0; j < i; j++) {
				blank += " ";
				// i가 0일때, star는 * 1개가 되고, 
				// blank는 공백 5개가 되야 한다.
				// i가 1일때, star는 * 두 개가 되고,
				// blank는 공백 4개가 되야 한다.
				// i가 2일때, star는 별 3개가 되고
				// blank는 공백 3개가 되야 한다.
			}
			star += "*";
			System.out.println(star + blank);
		}
		System.out.println("=================");
		

		star = "";
		for(int i = 0; i < 5; i++) {
			blank = "";
			for(int j = 0; j < 5-i; j++) {
				blank += " ";
				// i가 0일때, star는 * 1개가 되고, 
				// blank는 공백 5개가 되야 한다.
				// i가 1일때, star는 * 두 개가 되고,
				// blank는 공백 4개가 되야 한다.
				// i가 2일때, star는 별 3개가 되고
				// blank는 공백 3개가 되야 한다.
			}
			star += "*";
			System.out.println(blank + star);
		}
		
	}
}
