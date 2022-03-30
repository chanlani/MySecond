package lec05_controll;

import java.util.Scanner;

public class LoopWhileQuestion {
	public static void main(String[] args) {
		// while문이랑 for문이랑 표현만 좀 다르지
		// 결국 같은 반복문입니다.
		
		// 그렇다면 크리스마스 트리를 while문으로 출력해주세요.
		
		String star = "*";
		String blank = " ";
		int i = 0;
		while(i<=4) {
			if (i > 0) {
				star += "**";
			
			}
			blank = "";
			int j = 1;
			while(j<5-i) {
				blank += " ";
				j++;
			}
			System.out.println(i + ": "+blank + star);
			i++;
			
		}
		
		System.out.println("\n=======================\n");
		
		// 포켓몬스터
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("야생의 단데기를 만났습니다." + "행동을 선택해주세요.");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">> ");
			
			String inputText = scan.nextLine();
			if(inputText.contentEquals("1")) {
				while(true) {
					System.out.println("공격 방법은?");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">> ");
					
					String attack = scan.nextLine();
					attack.equals("1")){
						System.out.println("피카츄 백만볼트!");
					}else if(attack.contentEquals("2")) {
						System.out.println("피카츄 전광석화!");
					}else if(attack.contentEquals("3")) {
						break; // 내부 while문은 더이상 실행되지 않음
							   // 외부 while문은 계속 실
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
						
				}
			}else if(inputText.contentEquals("2")) {
				System.out.println("단데기를 상대로 도망쳤습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		scan.close(); // 사용자로부터 값을 입력받는 Scanner 객체를 종료한다.
		
		// String inputText = scan.nextLine();
		// scanner를 닫은 이후 입력 받으려하면 에러가 난다.
		// 즉, 더 이상 입력받을 일이 없을 때 close()를 한다.
		// 사실 Scanner는 AutoCloserable을 구현하고 있기 때문에
		// 자동으로 close되고 있지만, 명시적으로 close를 해주면 좋다.
		
		// Ctrl + 마우스 클릭 -> 해당 변수가 선언된 위치나, 해당 클래스가 있는 위치 등등을 찾아갑니다.
		
		
		
	}
}
