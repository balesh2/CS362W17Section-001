package org.cs362.dominion;

public class Garden extends Card{
	
	public Garden(){
		
		super("Garden", 4, 0, 0,
				new CardType[] {CardType.Victory});
		
	}

	public int getVictoryPoints(Player player){
		return player.numTotalCards()/10;
	}
	
}
