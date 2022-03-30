package submit_class.submit4;

import java.util.Scanner;

public class TrafficCardMain {
	public static void main(String[] args) {

		TrafficCard busFee = new TrafficCard();

		TrafficCard taxiFee = new TrafficCard();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("어디갑니까? :");
			String inputText = sc.nextLine();
			if (inputText.equals("대전")) {
				while (true) {
					System.out.println("무엇을 이용하겠습니까? 1.버스|2.택시 :");
					String inputNum = sc.nextLine();
					if (Integer.parseInt(inputNum) == 1) {
						System.out.println("기본요금 " + busFee.getBusFee() + "입니다");
						break;
					} else if (Integer.parseInt(inputNum) == 2) {
						System.out.println("기본요금 " + taxiFee.getTaxiFee() + "입니다");
						break;
					} else {
						System.out.println("1,2번 중 택1하세요");
					}
				}

			} else if (inputText.equals("서울")) {
				while (true) {
					System.out.println("무엇을 이용하겠습니까? 1.버스|2.택시 :");
					String inputNum = sc.nextLine();
					if (Integer.parseInt(inputNum) == 1) {
						System.out.println(busFee.getBusFee() * 5 + "입니다");
						break;
					} else if (Integer.parseInt(inputNum) == 2) {
						System.out.println(taxiFee.getTaxiFee() * 20 + "입니다");
						break;
					} else {
						System.out.println("1,2번 중 택1하세요");
					}
				}

			} else if (inputText.equals("부산")) {
				while (true) {
					System.out.println("무엇을 이용하겠습니까? 1.버스|2.택시 :");
					String inputNum = sc.nextLine();
					if (Integer.parseInt(inputNum) == 1) {
						System.out.println(busFee.getBusFee() * 7 + "입니다");
						break;
					} else if (Integer.parseInt(inputNum) == 2) {
						System.out.println(taxiFee.getTaxiFee() * 24 + "입니다");
						break;
					} else {
						System.out.println("1,2번 중 택1하세요");
					}
				}

			} else {
				System.out.println("서울,대전,부산 중 택1하세요");
			}
		}
		
	}
}
