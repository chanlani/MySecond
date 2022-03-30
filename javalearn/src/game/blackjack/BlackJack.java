package game.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

import lec09_class.UtilClass;

public class BlackJack {
	public static void main(String[] args) {
		Team one = new Team("1팀", 1000);
		Team two = new Team("2팀", 1000);
		
		ArrayList<Integer> cardPool = new ArrayList<Integer>();
		
		for(int i = 2; i <= 11; i++) {
			cardPool.add(i);
			
			if(i == 10) {
				cardPool.add(i);	// J
				cardPool.add(i);	// Q
				cardPool.add(i);	// K
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 7; i++) {
			one.cardList.clear();
			two.cardList.clear();
			
			System.out.println("각 팀 소지금");
			System.out.println(one.name + ": " + one.money);
			System.out.println(two.name + ": " + two.money);
			
			System.out.print(one.name + " 베팅 금액 입력: ");
			one.bet = Integer.parseInt(sc.nextLine());
			System.out.print(two.name + " 베팅 금액 입력: ");
			two.bet = Integer.parseInt(sc.nextLine());
			
			int randIdx = (int)(Math.random() * cardPool.size());
			one.cardList.add(cardPool.get(randIdx));
			randIdx = (int)(Math.random() * cardPool.size());
			one.cardList.add(cardPool.get(randIdx));
			
			randIdx = (int)(Math.random() * cardPool.size());
			two.cardList.add(cardPool.get(randIdx));
			randIdx = (int)(Math.random() * cardPool.size());
			two.cardList.add(cardPool.get(randIdx));
			
			one.showCards();
			two.showCards();
			
			while(true) {
				System.out.print("1팀, 카드를 더 받음? (y/n): ");
				String inputText = sc.nextLine();
				
				if(inputText.equals("y")) {
					randIdx = (int)(Math.random() * cardPool.size());
					one.cardList.add(cardPool.get(randIdx));
					break;
				}else if(inputText.equals("n")) {
					break;
				}else {
					System.out.println("잘못입력");
				}
			}
			
			while(true) {
				System.out.print("2팀, 카드를 더 받음? (y/n): ");
				String inputText = sc.nextLine();
				
				if(inputText.equals("y")) {
					randIdx = (int)(Math.random() * cardPool.size());
					two.cardList.add(cardPool.get(randIdx));
					break;
				}else if(inputText.equals("n")) {
					break;
				}else {
					System.out.println("잘못입력");
				}
			}
			
			System.out.println("결과");
			one.showCards();
			two.showCards();
			
			int sumOneCard = UtilClass.sumIntList(one.cardList);
			int sumTwoCard = UtilClass.sumIntList(two.cardList);
			
			if(sumOneCard > 21 && sumTwoCard > 21) {
				System.out.println("무승부");
			}else if(sumOneCard > 21) {
				System.out.println(two.name + "승리");
				one.money -= one.bet;
				two.money += two.bet;
			}else if(sumTwoCard > 21) {
				System.out.println(one.name + "승리");
				one.money += one.bet;
				two.money -= two.bet;
			}else {
				if(sumOneCard == sumTwoCard) {
					System.out.println("무승부");
				}else if(sumOneCard > sumTwoCard) {
					System.out.println(one.name + "승리");
					one.money += one.bet;
					two.money -= two.bet;
				}else {
					System.out.println(two.name + "승리");
					one.money -= one.bet;
					two.money += two.bet;
				}
			}
		}
		
	}
}
