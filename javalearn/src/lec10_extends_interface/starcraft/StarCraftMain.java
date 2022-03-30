package lec10_extends_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {
	public static void main(String[] args) {
		Zealot zealot = new Zealot();
		
		System.out.println(zealot.toString());
		
		HIghTemplar highTemplar = new HIghTemplar();
		System.out.println(highTemplar.toString());
		
		highTemplar.psionicStorm();
		
		
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		Zealot zealot7 = new Zealot();
		
		// 질럿들 드래그로 선택
		ArrayList<Zealot> zealotList = new ArrayList<Zealot>();
		zealotList.add(zealot);
		zealotList.add(zealot2);
		zealotList.add(zealot3);
		zealotList.add(zealot4);
		zealotList.add(zealot5);
		zealotList.add(zealot6);
		zealotList.add(zealot7);
		// 선택된 질럿들 이동명령 내리기
		for(int i = 0; i<zealotList.size(); i++) {
			zealotList.get(i).move(20, 30);
		}
		
//		zealotList.add(highTemplar);
		
		// 다형성
		// 하나의 객체가 여러 가지 타입을 가질 수 있는 것
		// 부모 클래스 타입의 참조변수로 (ProtossUnit, StarUnit)
		// 자식 클래스 타입의 인스턴스(zealot 객체)를 참조할 수 있는 것
		
		// 자식 객체에서 부모 객체로 형변환이 가능합니다.
		ProtossUnit protossUnit = zealot;	// 자동형변환
//		 long longVal = 304030; // 자동형변환
		ProtossUnit proUnit = (ProtossUnit)zealot;	// 강제 형변환
		
		// 자식 객체에서 조부모 객체로 형변환이 가능하다. 
		StarUnit starUnit = zealot;
		
		// 드래그 선택
		ArrayList<StarUnit> starList = new ArrayList<StarUnit>();
		
		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(zealot5);
		starList.add(zealot6);
		starList.add(zealot7);
		starList.add(highTemplar);
		
		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(5, 15);
		}
		
//		HIghTemplar ht = starList.get(7);	오류		// 위에서 형변환이 되어 StarUnit의 starList에 들어가서 HIghTemplar는 안됨.
													// highTemplar가 starList에 담김.
		StarUnit su = starList.get(7);
		System.out.println(starList.get(7).getName());
		
		((HIghTemplar)su).psionicStorm(); 		// 괄호는 형변환을 나타냄. int로 바꿀때도 (int)로 해서 변환을 하는데 이것도 같음.
												// ()는 su를 HIghTemplar로 형변환한 거.
		highTemplar.psionicStorm();
		
		
		
		StarUnit puma = new StarUnit("퓨마", 0, 40, 0, 0, 0, 0);
		
		// 일반적으로 부모 객체는 자식 객체로 형변환할수 없습니다.
		// instanceof 객체의 타입을 확인하는데 사용/ 좌측 객체가 우측 클래스로 형변환이 가능한지 true/false로 리턴
		System.out.println(puma instanceof ProtossUnit); // puma(객체) ProtossUnit(클래스), false
		System.out.println(puma instanceof Zealot); 		// false
		
		// 자식 객체는 부모 객체로 형변환이 가능하다.
		System.out.println(highTemplar instanceof ProtossUnit);	//true
		System.out.println(highTemplar instanceof StarUnit);	//true
		
		// 부모 객체로 형변환되었던 자식 객체는 다시 자식 객체로 형변환이 가능하다.
		System.out.println(starUnit instanceof Zealot); //true
		System.out.println(starUnit instanceof HIghTemplar); //false
		
		for(int i = 0; i < starList.size(); i++) {
			// 하이템플러인지 체크 후 사이오닉 스톰 메소드 실행
//			if(starList.get(i).getName().equals("하이템플러")) {
//				((HIghTemplar)starList.get(i)).psionicStorm();	// 형변환하고 사이오닉스톰	, 원래는 부모는 자식으로 형변환이 불가하지만 이 경우 
//																// 자식이 부모로 형변환했다가 다시 자식으로 돌아오는 경우라 됨.
//			}
			
			if(starList.get(i) instanceof HIghTemplar) {
				((HIghTemplar)starList.get(i)).psionicStorm();
			}
			
		}
		
		// StarUnit을 상속받는 SiegeTank 클래스를 만들어주세요
		// SiegeTank는 siegeMode라는 메소드를 가지고 있고,
		// siegeMode를 실행하면 damage가 70이 되고,
		// 공격 사거리가 12가 됩니다.
		
		SiegeTank siegeTank = new SiegeTank();
		System.out.println(siegeTank);
		
		siegeTank.siegeMode();
		
		
		
		
	}
}
