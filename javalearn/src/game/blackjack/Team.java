package game.blackjack;

import java.util.ArrayList;

public class Team {
	String name;
	int money;
	int bet = 0;
	ArrayList<Integer> cardList = new ArrayList<Integer>();
	
	public Team(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 보유 카드 출력
	public void showCards() {
		System.out.println(name + "상황판 ================");
		int sum = 0;
		for(int i = 0; i < cardList.size(); i++) {
			System.out.println(cardList.get(i));
			sum += cardList.get(i);
		}
		System.out.println("총합: " + sum);
	}
	
	
	
}
