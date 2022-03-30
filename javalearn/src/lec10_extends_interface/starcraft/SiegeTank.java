package lec10_extends_interface.starcraft;

public class SiegeTank extends StarUnit{

	
	
	public SiegeTank(String name, int damage, int hp, int attackRange, double attackSpeed, int mineral, int gas) {
		super(name, damage, hp, attackRange, attackSpeed, mineral, gas);
		// TODO Auto-generated constructor stub
	}
	
	public SiegeTank() {
		super("시즈탱크", 35, 120, 7, 2.0, 150, 100);
	}
	
	@Override
	public String toString() {
		return "SiegeTank " + super.toString();
	}

	public void siegeMode() {
		System.out.println("시즈모드 실행");
		super.setDamage(70);
		super.setAttackRange(12);
	}
	
	
	
	
}


