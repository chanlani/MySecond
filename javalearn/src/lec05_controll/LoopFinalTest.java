package lec05_controll;

import java.util.Scanner;

public class LoopFinalTest {
	public static void main(String[] args) {
		// 복습시간

		// 팩토리얼
		// 수학기호로 4! 는 4 팩토리얼을 의미하며
		// 그 값은 4x3x2x1 = 24

		// for문을 사용해서 10 팩토리얼의 값을 출력해주세여.
		int i = 1;
		long result = 1; // 결과가 길어서 int로는 바이트가 모자람. long을 사용
		for (i = 1; i < 11; i++) {
			result = result * i; // i가 1일때, 1*1=1, 2일때, 2*1=2, 3일때, 3*2=6, 4일때 4*6=24 5일때 5*24=120
			// result *= i;
			System.out.println(result);
		}
		// 결과: 3628800

		// @ 15 팩토리얼의 값을 출력해주세요.
		// 결과 : 1307674368000
		i = 1;
		result = 1;
		for (i = 1; i < 16; i++) {
			result = result * i;
			System.out.println(result);

		}

		System.out.println("\n===================\n");

		// 룰렛을 아주 힘차게 돌렸더니
		// 5834도가 돌아갔다고 합니다.
		// 한바퀴 당연히 360도겠죠?
		// 그렇다면 룰렛이 멈추고난 각도에 따른 경품이
		// 뭔지 출력을 해주시고, 총 몇바퀴 돌아갔는지도 출력해주세요
		// 0도 초과 ~ 60도 이하 : 사탕
		// 60도 초과 ~ 120도 이하 : 초콜릿
		// 120도 초과 ~ 180도 이하 : 쿠키
		// 180도 초과 ~ 240도 이하 : 콜라
		// 240도 초과 ~ 300도 이하 : 아이스크림
		// 300도 초과 ~ 360(0)도 이하 : 커피

		/*
		 * 삼항연산자 이용방법. System.out.println(5834/360+"바퀴"); int G = 5834 % 360; String Re
		 * = (G >300) ? "커피" : ((G > 240) ? "아이스크림":(G > 180)? "콜라":(G>120)?
		 * "쿠키":(G>60)? "초콜릿":(G>0)? "사탕":"커피"); System.out.println("경품: "+Re);
		 */
		int angle = 5834 % 360;
		if (angle > 0 && angle <= 60) {
			System.out.println("사탕");
		} else if (angle > 60 && angle <= 120) {
			System.out.println("초콜릿");
		} else if (angle > 120 && angle <= 180) {
			System.out.println("쿠키");
		} else if (angle > 180 && angle <= 240) {
			System.out.println("콜라");
		} else if (angle > 240 && angle <= 300) {
			System.out.println("아이스크림");
		} else {
			System.out.println("커피");
		}

		System.out.println("\n====================\n");

		/*
		 * // 사용자가 입력한 문자열의 순서를 뒤집어서 출력해보세요 Scanner sc = new Scanner(System.in);
		 * System.out.print("거꾸로 뒤집을 문자열 입력: "); String inputText = sc.nextLine();
		 * String reverse = "";
		 * for (i = inputText.length() - 1; i >= 0; i--) { 
		 * reverse = reverse + inputText.charAt(i); } 
		 * System.out.println(reverse);
		 * 
		 * // substring이용 for (i = inputText.length(); i > 0; i--) { reverse +=
		 * inputText.substring(i - 1, i); } System.out.println("로꾸꺼:" + reverse);
		 * 
		 * sc.close(); // 코드 정렬이 어렵다면
		 */ // 단축키 [ctrl+shift+F]

		System.out.println("\n=========2월 달력==========\n");

		// 2월 달력을 출력해봅시다.
		// 화요일에 1일 스타트
		// startDay 는 요일을 기준으로
		// 일요일 0, 월요일 1, 화2, 수3, 목4, 금5, 토6

		int startDay = 2;
		int lastDay = 28;
		int currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (i = 0; i < 42; i++) {
			if (i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;

				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			// i가 6, 13, 20, 27인 경우에 줄바꿈
			if (i % 7 == 6) {
				System.out.println();
			}
		}

		System.out.println("\n=============6월 달력=======\n");
		// 1~9까지는 오른쪽으로 정렬하자.

		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (i = 0; i < 42; i++) {
			if (i >= startDay) {
				if(currentDay <10) {
					System.out.print(" ");
				}
				System.out.print(currentDay + "\t");
				currentDay++;
			
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if (i % 7 == 6) {   // 한줄에 7개의 요일이 있고 일요일부터 0이고 토요일 6임. 줄바꿀때 나머지가 6이 나오면 줄바꿈 
				System.out.println();
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
