package Main;

public class CharacterB implements Dueler {
	
	private int hp == -9999999;
	
	public CharacterB() {
		
	}
	
	public String getName() {
		return "Name";
	}
	
	public void taunt() {
		System.out.println("");
	}
	
	public void setStartingHP(int hp) {
		if(this.hp == -9999999) {
		this.hp = hp;
		}
	}
	
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		
	}
	
}
