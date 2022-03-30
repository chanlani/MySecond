package lec06_method;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {

		// 함수
		// 함수 = 메소드 = method = function
		// 굳이 나누자면 method는 클래스에 종속된 함수를 말하며,
		// function은 클래스에 독립적인 함수를 말한다.

		// n부터 m까지 다 더하면 결과는??
		int fromNum = 1;
		int toNum = 100;
		int sumNum = 0;
		for (int i = fromNum; i <= toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터" + toNum + "까지 다 더하면 " + sumNum + "입니다.");

		// 30부터 50까지 다 더하면 결과는??
		fromNum = 30;
		toNum = 60;
		sumNum = 0;
		for (int i = fromNum; i < toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터" + toNum + "까지 다 더하면 " + sumNum + "입니다.");

		// 25부터 50까지 다 더하면 결과는??
		fromNum = 25;
		toNum = 50;
		sumNum = 0;
		for (int i = fromNum; i < toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터" + toNum + "까지 다 더하면 " + sumNum + "입니다.");

		System.out.println("\n==============================\n");

		// 25부터 50까지 다 더한 값은??
		printSum(25, 50);

		// 함수를 쓰면 좋은 점
		// 코드가 간결해진다.
		// 중복된 코드를 한 곳에서 관리할 수 있다.
		// 수정할 때 용이하다.

		// 리턴값이 존재하는 함수로 만들기
		returnSum(40, 50);

		// 리턴값이 존재하는 함수는 실행 결과를 변수에 담을 수 있다.
		// 이때, 변수 타입은 해당 함수의 리턴 타입과 일치해야 한다.
		int sum = returnSum(40, 50);
		System.out.println("40부터 50까지 다 더하면" + sum);
		System.out.println("40부터 50까지 다 더하면" + returnSum(40, 50));

		System.out.println("\n============================\n");

		// System.out.println()을 print()로 만들어 쓰기
		print("Hello World!!");

		int intVal = 100;
		System.out.println(intVal);
		print(intVal);

		System.out.println("\n=====================\n");

		// void (리턴이 없는) 함수의 return;

		playPokemon();

	} // main 메소드 종료

	public static void playPokemon() {
		
		// 포켓몬스터
				Scanner scan = new Scanner(System.in);
				while(true) {
					System.out.println("야생의 단데기를 만났습니다."
							+ " 행동을 선택해주세요.");
					System.out.println("1. 공격 | 2. 도망");
					System.out.print(">> ");
					
					String inputText = scan.nextLine();
					
					if(inputText.equals("1")) {
						while(true) {
							System.out.println("공격 방법은?");
							System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
							System.out.print(">> ");
							int enemyHp = 100;
							String attack = scan.nextLine();
							if(attack.equals("1")) {
								System.out.println("피카츄 백만볼트!!");
								enemyHp -= 50;
								System.out.println("단데기의 체력: "+enemyHp);
								if(enemyHp <= 0) {
									System.out.println("이겼닭 치킨이닭");
									return;   //메소드를 즉시 종료한다. 
								}
							}else if(attack.equals("2")) {
								System.out.println("도망쳤습니다");
								return;
							}else if(attack.equals("3")) {
								break;	// 내부 while문은 더이상 실행되지 않음
										// 외부 while문은 계속 실행
							}else {
								System.out.println("잘못 입력하셨습니다.");
							}
						}
					}else if(inputText.equals("2")) {
						System.out.println("단데기를 상대로 도망쳤습니다.");
						break;
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
		
	}

	// 메소드 오버로딩(OverLoading)
	// 같은 이름의 메소드를 중복하여 정의하는 것
	// 매개변수의 개수나 타입을 다르게 하면 같은 이름으로 메소드 작성 가능 
	public static void print(String anything) {
		System.out.println(anything);
	}

	public static void print(int anything) {
		System.out.println(anything);
	}

	public static void printSum(int fromNum, int toNum) {
		// void는 리턴값이 없는 함수일 경우 꼭 써준다. 리턴값이 없으니 값을 가져와도 다른 계산에 쓸 수없다. 실무에서는 return 함수를
		// 많이 씀.
		int sumNum = 0;
		for (int i = fromNum; i < toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터" + toNum + "까지 다 더하면 " + sumNum + "입니다.");
	}

	public static int returnSum(int a, int b) {
		int sumNum = 0;
		for (int i = a; i < b; i++) {
			sumNum += i;
		}
		return sumNum;
	}

}
