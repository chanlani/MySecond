package lec10_extends_interface.starcraft;

public class HIghTemplar extends ProtossUnit {

	private int shield = 40;
	private int mp = 225;

	public void psionicStorm() {
		System.out.println("사이오닉 스톰 시전!");
		this.mp -= 75;
	}
	
	public void hallucination() {
		System.out.println("할루시네이션 시전!");
		this.mp -= 100;
	}
	
	public HIghTemplar() {
		super("하이템플러", 0, 40, 0, 0, 50, 150, 40);
		
	}

	@Override
	public String toString() {
		return "HIghTemplar [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", shield=" + getShield()
				+ ", attackRange=" + getAttackRange() + ", attackSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas="
				+ getGas() + ", mp=" + mp + "]";
	}

	
	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
}
