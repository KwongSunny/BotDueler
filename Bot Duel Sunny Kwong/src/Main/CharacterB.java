package Main;

public class CharacterB implements Dueler {
	
	private int hp;
	
	public CharacterB() {
		
	}
	
	public String getName() {
		return "Name";
	}
	
	public void taunt() {
		System.out.println("");
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
}
