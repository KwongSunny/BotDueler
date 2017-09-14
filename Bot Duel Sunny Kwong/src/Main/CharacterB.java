package Main;

import duel.Dueler;

public class CharacterB implements Dueler {
	
	public static final String[] GLOBALTAUNTS = {"I dare you to shoot me!", "You have no chance!", "You will lose!", "You better be afraid!"};
	public int arraySize = GLOBALTAUNT.length;
	
	public void taunt() {
		private int arrayIndex = GLOBALTAUNTS[Math.ceil(Math.random() * arraySize)];
		System.out.println();
	}
	
	public String getName() {
		return "Hello";
	}
	
	public void setStartingHP(int hp) {
		
	}
	
	public int getHP() {
		
	}
	
}
