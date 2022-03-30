package lec06_method;

public class MethodQuestion {
	public static void main(String[] args) {
		// 명함 만들기
		// 사용자가 이름, 연락처, 이메일을 입력했을때,
		// 콘솔에
		// ===============================
		// 이름 : [사용자가 입력한 이름]
		// 연락처 : [사용자가 입력한 연락처]
		// 이메일 : [사용자가 입력한 이메일]
		// ===============================
		// 와 같은 형태로 출력해주는 함수를 만들어보세요.
		/*
		 * String name = "홍길동"; String call = "010-0000-0000"; String mail =
		 * "dhdhdhd@dndn.com"; print(name,call,mail);
		 */
		print("홍길동", "010-0000-0000", "dhdhdhd@dndn.com");

		System.out.println("\n======================\n");

		// 성적표 만들기
		// 두근두근 성적표가 나왔습니다.
		// 국어, 영어, 수학 점수를 입력했을 경우,
		// 국어, 영어, 수학, 총점, 평균, 등급을 출력하는 성적표
		// 평균은 소수 둘째자리에서 반올림하여 출력
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지 F

		// 국어 :
		// 영어 :
		// 수학 :
		// 총점 :
		// 평균 :
		// 등급 :

		Score(70, 87, 33);

		System.out.println("\n========================\n");

		// LoopFor에서 했던 각 자리수 더하기를 함수화해보세요.

		System.out.println(eachAdd(2839845));
		System.out.println(eachAdd("2839845"));

		System.out.println("\n=====================\n");
		// 10진수 수를 이진법으로 나타내기
		// 10을 2로 나눠서 만듦

		int intVal = 30;
		String binaryString = Integer.toBinaryString(intVal);
		System.out.println(binaryString);

		String myBinaryStr = makeBinary(intVal);
		System.out.println(myBinaryStr);

		System.out.println("\n=====================\n");

		// for 문을 배울때, 트리를 많이 만들었다.
		// 5층짜리만 해봤으니
		// 사용자가 층(int n)을 입력받아.
		// n층 짜리 트리를 출력할 수 있는 메소드를 만들어서
		// 실행시키세요

		makeTree(7);



	} // main의 끝

	public static void makeTree(int n) {
		String star = "*";
		String blank = "";
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				star += "**";
			}
			blank = "";
			for (int j = 1; j < n - i; j++) {
				blank += " ";
			}
			System.out.println(i + " : "+blank+star);
		}
		

	}

	// 이진수 만들기
	public static String makeBinary(int num) {
		// 30이 들어왔다
		// 30을 2로 나눠서 나머지 0/ 몫은 15
		// 15를 2로 나눠서 나머지 1/ 몫은 7
		// 7을 2로 나눠서 나머지 1 / 몫은 3
		// 3을 2로 나눠서 나머지 1 / 몫은 1
		String result = "";
		while (true) {

			result += (num % 2);
			if (num == 1) {
				break;
			}
			num /= 2;

		}
		return reverseString(result);

	}

	public static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse; // 리턴시 메소드 종료
	}

	// 메소드 오버로딩 해서, int도 받고, String도 받아야 함
	public static int eachAdd(int intNum) {
		int answer = 0;
		while (true) {
			answer = intNum % 10 + answer;
			if (intNum < 10) {
				break;
			}
			intNum = intNum / 10;
		}
		return answer;
	}

//	int result = 0;
//	for(int i = 0; i < example.length(); i++) {
//		String strNum = example.substring(i,i+1);
//		int intNum = Integer.parseInt(strNum);
//		result += intNum;
//	}
	public static int eachAdd(String strNum) {
		int result = 0;
		for (int i = 0; i < strNum.length(); i++) {
			result += Integer.parseInt(strNum.substring(i, i + 1));
		}
		return result;
	}

	public static void print(String name, String call, String mail) {
		System.out.println("========================" + "\n 이름 : " + name + "\n 연락처 : " + call + "\n 이메일 : " + mail
				+ "\n========================");
	}

	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수
	 * 
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n      반올림 하고싶은 자리
	 * @return 반올림된 실수
	 */
	public static double round(double douNum, int n) {
		// 소수 두번째 자리에서 반올림해서
		// 소수 첫번쨰 자리를 만들고 싶다. (n = 1)
		// 3.141592 에서 10을 곱한 뒤, math.round를 적용하고
		// 다시 10으로 나누면 됨

		// 소수 세번째 자리에서 반올림해서
		// 소수 두번째 자리를 만들고 싶다. (n=2)
		// 3.141592에서 100을 곱한 뒤, math.round를 적용하고
		// 다시 100으로 나누면 됨

		// douNum = 3.141592, n=2 를 넣었다면
		int one = 1;
		for (int i = 0; i < n; i++) {
			one *= 10;
		}
		// longNum = 314
		double mul = douNum * one;
		// mul = 314.1592
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double) longNum / one;
		return douVal;

	}

	public static void Score(int Kor, int Eng, int Mat) {
		int Sum = Kor + Eng + Mat;
		// 평균
		double Avg = Sum / 3.0;
		String Grade = (Avg >= 90) ? "A" : (((Avg >= 80) ? "B" : (Avg >= 70) ? "C" : (Avg >= 60) ? "D" : "F"));
		Object math;
		System.out.print("국어 : " + Kor + "\n영어 : " + Eng + "\n수학 : " + Mat + "\n총점 : " + Sum + "\n평균 : " + round(Avg, 1)
				+ "\n등급 : " + Grade + "\n======================");
	}
}
