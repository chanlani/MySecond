package lec09_class.worldcup;

import java.util.ArrayList;
import java.util.Scanner;

public class worldCupMain {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Menu menu2 = new Menu("짜장면", false);

		ArrayList<Menu> menuList = new ArrayList<Menu>();

		menuList.add(new Menu("짜장면", false));
		menuList.add(new Menu("짬뽕"));
		menuList.add(new Menu("볶음밥"));
		menuList.add(new Menu("김치찌개"));
		menuList.add(new Menu("제육볶음"));
		menuList.add(new Menu("돈까스"));
		menuList.add(new Menu("김밥/라면"));
		menuList.add(new Menu("떡볶이"));
		menuList.add(new Menu("해장국"));
		menuList.add(new Menu("순대국밥"));
		menuList.add(new Menu("햄버거"));
		menuList.add(new Menu("냉면"));
		menuList.add(new Menu("스파게티"));
		menuList.add(new Menu("삼겹살"));
		menuList.add(new Menu("생선구이"));
		menuList.add(new Menu("리조또"));

		Scanner sc = new Scanner(System.in);

		// 16강
		// 0:1 | 2:3 | 4:5
		System.out.println("16강");
		for (int i = 0; i < menuList.size(); i += 2) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. " + menuList.get(i).getName() + " |2." + menuList.get(i + 1).getName());
			System.out.println(">>> ");

			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				menuList.get(i).setSelect(true);
			} else if (select == 2) {
				menuList.get(i + 1).setSelect(true);
			}
			// 8강

		}

	}

}
