package lec10_extends_interface.rpg;

public class Magician extends Character {
	private Jobs job;
	
	public Magician(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
	}

	@Override
	public void skill(Enermy enermy) {
		switch(job) {
		case MAGICIANFIRE:
			System.out.println("FIRE");
			enermy.setHp(enermy.getHp()-200);
			if(enermy.getHp()<= 0) {
				enermy.die();
			}
			break;
		case MAGICIANICE:
			System.out.println("ICE");
			enermy.setHp(enermy.getHp()-185);
			if(enermy.getHp()<= 0) {
				enermy.die();
			}
			break;

		default:
			System.out.println("직업이 없습니다.");
			break;
			
		}
	}
	
	enum Jobs{
		MAGICIANFIRE, MAGICIANICE
	}
	
}
