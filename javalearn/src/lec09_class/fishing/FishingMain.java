package lec09_class.fishing;

import java.util.ArrayList;
import java.util.Scanner;

import lec09_class.UtilClass;

public class FishingMain {
	public static void main(String[] args) {
		ArrayList<Fish> fishList = new ArrayList<Fish>();

//		Fish mulchi = new Fish("멸치", 100, 1);
//		fishList.add(mulchi);	// 아래와 같음. 변수 선언 안하고 아래처럼 직접 넣어도 됨.

		fishList.add(new Fish("멸치", 100, 1));
		fishList.add(new Fish("광어", 200, 2));
		fishList.add(new Fish("도미", 500, 3));
		fishList.add(new Fish("감성돔", 1200, 4));
		fishList.add(new Fish("다금바리", 10000, 5));

		Fisher minwoo = new Fisher("민우");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("낚시 횟수: " + (i + 1));
			System.out.println("멸치를 잡았습니다. 행동을 선택해주세요.");
			System.out.println("1. 가방에 넣기 | 2. 미끼로 쓰기");
			System.out.println(">>>");

			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				minwoo.bag.add(fishList.get(0));
			} else if (select == 2) {
//				UtilClass util = new UtilClass();	// static 안썼을때 폴더가 다르기에 임포트를 해줌.
//				util.banban();

				UtilClass.banban(); // static을 써주면 객체를 만들지 않아도 바로 사용가능.
//				Math.random();
				if (UtilClass.banban()) {
					System.out.println(fishList.get(1).name + "를 잡았습니다. 행동을 선택해주세요.");
					System.out.println("1. 가방에 넣기 | 2. 미끼로 쓰기");
					System.out.print(">>>");

					int select2 = Integer.parseInt(sc.nextLine());

					if (select2 == 1) {
						minwoo.bag.add(fishList.get(0));
					} else if (select2 == 2) {
						UtilClass.banban();
						if (UtilClass.banban()) {
							System.out.println(fishList.get(2).name + "를 잡았습니다. 행동을 선택해주세요.");
							System.out.println("1. 가방에 넣기 | 2. 미끼로 쓰기");
							System.out.print(">>>");

							int select3 = Integer.parseInt(sc.nextLine());

							if (select3 == 1) {
								minwoo.bag.add(fishList.get(0));
							} else if (select3 == 2) {
								UtilClass.banban();

								if (UtilClass.banban()) {
									System.out.println(fishList.get(3).name + "를 잡았습니다. 행동을 선택해주세요.");
									System.out.println("1. 가방에 넣기 | 2. 미끼로 쓰기");
									System.out.print(">>>");

									int select4 = Integer.parseInt(sc.nextLine());

									if (select4 == 1) {
										minwoo.bag.add(fishList.get(0));
									} else if (select4 == 2) {
										UtilClass.banban();

										if (UtilClass.banban()) {
											System.out.println(fishList.get(4).name + "을 잡았습니다!!");

											minwoo.bag.add(fishList.get(4));
										}
									}
								}

							}

						}
						
					}
				}
			}
		}
		
		System.out.println("낚시 결과");
		int money = 0;
		for (int j = 0; j < minwoo.bag.size(); j++) {
			System.out.println(minwoo.bag.get(j).name);
			money += minwoo.bag.get(j).price;
		}
		System.out.println("총 금액: " + money);
		
		
		
	}
}
