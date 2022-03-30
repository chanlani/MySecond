package lec10_extends_interface.starcraft;

public class Zealot extends ProtossUnit {	


	
	@Override
	public String toString() {	// 앞에 슈퍼 생략가능.
		return "Zealot [name=" + getName() + ", damage=" + super.getDamage() + ", hp=" + super.getHp() + ", shield=" + getShield() + ", attackRange="
				+ super.getAttackRange() + ", attackSpeed=" + super.getAttackSpeed() + ", mineral=" + super.getMineral() + ", gas=" + super.getGas() + "]";
	}


	public Zealot() {
		super("질럿", 16, 100, 1, 1.5, 100, 0, 60);	// 네임, 데미지, hp ...
	}



	
	
}
