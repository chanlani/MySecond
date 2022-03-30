package lec10_extends_interface.rpg;

public class Warrior extends Character {
	private Jobs job;
	
	public Warrior(String name, int damage, int hp, Jobs job) {
		// 부모 생성자(super)가 자식생성자 가장 위에 있어야 한다.
		super(name, damage, hp);
		this.job = job;
	}
	
	// 공격시 두 배의 데미지를 주고 싶다면
	// ctrl+space 하면 부모가 가진 메서드를 불러올 수 있다. 
	@Override
	public void attack(Enermy enermy) {
		System.out.println(getName()+"이(가) "+ enermy.getName()+"을 공격합니다.");
		enermy.setHp(enermy.getHp()-super.getDamage()*2);
		super.setHp(super.getHp() - enermy.getDamage());
		
		if(enermy.getHp()<=0) {
			enermy.die();
		}
		
		if(super.getHp() <=0) {
			die();
		}
	}

	@Override
	public void skill(Enermy enermy) {
		switch(job) {
		case BERSERKER:
			System.out.println("파워 스트라이크!");
			enermy.setHp(enermy.getHp() - 150);
			
			if(enermy.getHp()<= 0) {
				enermy.die();
			}
			break;
			
		case WAROAD:
			System.out.println("버스트 캐논!");
			enermy.setHp(enermy.getHp() - 200);
			
			if(enermy.getHp()<= 0) {
				enermy.die();
			}
			break;
			
		default:
			System.out.println("직업이 없습니다.");
			break;
			
		}
		
	}
	// enum 
	// 열거형 클래스
	// Constant 처럼 사용
	
	// inner 클래스(클래스 안에 있는 클래스) 여기 안에 클래스에서만 쓸 경우.
	enum Jobs{
		BERSERKER,
		WAROAD, MAGICIANFIRE
	}
	
	
}
