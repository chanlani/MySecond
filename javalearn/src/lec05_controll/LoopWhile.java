package lec05_controll;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		// while문
		
		int i = 2;  // 초기화
		while(i <= 9) { //조건식
			System.out.println("2 x "+ i + " = " +(2*i));
			i++;  // 증감식
		}
		// for문의 향기가..
		System.out.println("\n=======================\n");
		
		i = 2;
		// 못생긴 for문은 쓰지말자
		for( ;i <= 9 ; ) {   //조건문 
			System.out.println("2 x "+ i + " = " +(2*i));  //실행 
			i++;  // 증감  
		}
		System.out.println("\n========================\n");
		
		// level 1
		boolean isRunning = true; 
		Scanner sc = new Scanner(System.in);
	
//		while(isRunning) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			
//			String inputText = sc.nextLine();
//			
//			if(inputText.equals("q")|| inputText.equals("Q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				isRunning = false;
//			}else {
//				System.out.println(inputText);
//			}
//		}
//		
		// level 2
//		while(true) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			String inputText = sc.nextLine();
//			
//			// .toLowerCase() 해당 알파벳을 소문자로 바꿔준다.
//			if(inputText.toLowerCase().equals("q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			}else {
//				System.out.println(inputText);
//			}
//		}
		System.out.println("\n==================================\n");
		
		// do-while문
//		isRunning = false;
//		do {
//			System.out.println("프로그램이 시작되었습니다");
//		}while(isRunning);
//		String inputString = "";
//		do {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			inputString = sc.nextLine();
//			System.out.println(inputString);
//		}while(!inputString.toUpperCase().contentEquals("Q"));  //사용자가 q를 입력했을때 false가 된다. 앞에 느낌표를 붙이면 반대의
	
		System.out.println("\n======================\n");
		
		// 이중(다중) while문
		// 구구단
		// 2 x 2 = 4
		// 2 x 9 = 18
		// 3 x 2 = 6
		int intVal = 2;
		while(intVal <= 9) {
			
			int rightVal = 2;
			while(rightVal <= 9) {
				System.out.println(intVal + " x "+ rightVal + " = "+ (intVal * rightVal));				
				rightVal++;
			}
			System.out.println();			
			intVal++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
