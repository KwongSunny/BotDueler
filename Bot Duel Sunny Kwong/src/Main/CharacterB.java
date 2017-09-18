package main;

public class CharacterB implements Dueler {

	private int hp = -1;
	private boolean isLoaded = false;
	private String[] theTaunts = {"You will never get to shoot me!", "I am sad to say that you will lose!", "You'll never get my cookies!", "I'm too good for you.", "You should've never challenged me!"};
	private int lastTaunt = -1;
	
	public CharacterB() {
	
	}
	
	public void taunt() {
		int numOfTaunts = theTaunts.length;
		int randomNum = (int) (Math.random()*numOfTaunts);
		while(lastTaunt == randomNum) {
			randomNum = (int) (Math.random()*numOfTaunts);
		}
		lastTaunt = randomNum;
		
		System.out.println(this.getName() + ": " + theTaunts[randomNum]);
	}
	
	public String getName() {
		
		return "Bot";
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
		else {
			int randomNum = (int) Math.random()*3;
			while(randomNum == 0) {
				if(isLoaded) {
					randomNum = (int) Math.random()*3;
				}
				else {
					if(randomNum == 1) {
						isLoaded = false;
						return randomNum;
					}
					else {
						randomNum = 2;
						return randomNum;
					}
				}
			}
			
		}
			
	}
	public void hit(Object caller) {
		if(caller instanceof Duel) {
			hp = hp - 10;
		}
	}
	}
	
}