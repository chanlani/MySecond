package lec10_extends_interface.rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class RpgMain {
	public static void main(String[] args) {
		Warrior minwoo = new Warrior("민우", 100, 200, Warrior.Jobs.BERSERKER);
		Creep chanung = new Creep("찬웅", 10, 300);		// Creep 클래스에 크르르 메서드가 기본탑재라서 쓰기만 해도 크르르 나옴.
		
//		minwoo.attack(chanung);
		System.out.println(chanung.getHp());
		
//		minwoo.skill(chanung);
		
		// Magician 을 만들어주세요
		// Character를 상속받고, attack해도 Character와 같음
		// enum 클래스로 FIRE, ICE를 가지는 필드변수 job 똑같이 생성
		
		Magician magician = new Magician("얼음마법", 100, 200, Magician.Jobs.MAGICIANICE);
//		magician.skill(chanung);
		
		ArrayList<Character> party = new ArrayList<Character>();
		party.add(minwoo);
		party.add(magician);
		
		Creep creep = new Creep("잡몹", 30, 200);
		
		Boss boss = new Boss("보스", 100, 1000);
		
		// 모든 클래스들은 기본적으로 Object라는 클래스를 상속받고 있다.
		// 다만 생략되어 extends에 보이지 않음. 그래서 상속받지 않은것같아 보이는 클래스에도 
		// Object클래스를 상속받았기에 toString메서드를 넣으면 Override가 뜨는게 이 이유이다. 
		// 상속받지 않아 보이는 클래스를 아래와 같이 Object로 묶으면 다른 클래스의 것들도 추가 가능.
		
		// Warrior -> Character -> Object
		ArrayList<Object> battleGroud = new ArrayList<Object>();
		battleGroud.add(minwoo);
		battleGroud.add(magician);
		battleGroud.add(creep);
		battleGroud.add(boss);
		
		for(int i = 0; i<battleGroud.size(); i++) {
			System.out.println(battleGroud.get(i).toString());
		}
		
		System.out.println(battleGroud.get(0).getClass());
		Object ob = battleGroud.get(0);
		
		minwoo.battle = new Battle() {

			@Override
			public void outOfBattle() {
				battleGroud.remove(minwoo);
			}
			
		};
		
		magician.battle = new Battle() {

			@Override
			public void outOfBattle() {
				battleGroud.remove(magician);
			}
			
		};
		
		creep.battle = new Battle() {

			@Override
			public void outOfBattle() {
				battleGroud.remove(creep);
			}
			
		};
		
		boss.battle = new Battle() {

			@Override
			public void outOfBattle() {
				battleGroud.remove(boss);
			}
			
		};
		
		magician.skill(creep);
		
		for(int i = 0; i<battleGroud.size();i++) {
			System.out.println(battleGroud.get(i).toString());
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < battleGroud.size();i++) {
				// 각각의 battleGroud.get(i) 요소들은
				// object로 형변환 된 상태
				
				// instanceof로 Character인지 체크 후에
				// 행동을 입력받는다.
				if(battleGroud.get(i) instanceof Character) {
					// 해당 객체를 Character로 변환
					Character player = (Character)battleGroud.get(i);
					System.out.println(player.getName()+"의 턴입니다. 행동을 선택해주세요");
					System.out.println("1.공격 || 2.스킬");
					System.out.println(">>> ");
					
					int select = Integer.parseInt(sc.nextLine());
					
					if(select == 1) {
						player.attack(boss);
					}else if(select == 2) {
						player.skill(boss);
					}
				}
				
				
			}
			
			if(battleGroud.contains(boss)) {
				System.out.println("전투에서 승리하였습니다.");
				break;
			}
			
			if(!battleGroud.contains(minwoo) && !battleGroud.contains(magician)) {
				System.out.println("전투에서 패배하였습니다.");
				break;
			}
			
		}
		
	}
	
	
}
