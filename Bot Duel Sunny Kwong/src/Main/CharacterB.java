package main;

public class CharacterB implements Dueler {

	private int hp = -1;
	
	public CharacterB() {
	
	}
	
	public void taunt() {
		
		System.out.println("You will never shoot me!");
	}
	
	public String getName() {
		
		return "Justin";
	}
	
	public void setStartingHP(int hp) {
		
		if(this.hp == -1) {
			this.hp = hp;
		}
		
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp)
	{
		return d.getHP() == hp;
	}
	
	public int getAction(Object caller) {
		if(caller instanceof CharacterA) {
			return 3;
		}
		else if()
			
	}
	public void hit(Object caller) {
		if(called instanceof Duel) {
			hp = hp - 10;
		}
	}
	}
	
}