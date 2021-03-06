import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class GameManagerTest {

	public GameManager randomManager()
	{
		Random rand = new Random();
		int numPlayers = rand.nextInt(3) + 2;
		
		String[] kingdomNames = {"Adventurer","Ambassador","Baron",
				"Council Room","Cutpurse","Embargo",
				"Feast","Gardens","Great Hall",
				"Mine","Smithy","Village","Sea Hag"};
		String[] kingdomsUsed = new String[10];
		int[] notUse = new int[3];
		notUse[0] = rand.nextInt(13);
		notUse[1] = rand.nextInt(13);
		while(notUse[0] == notUse[1]){
			notUse[1] = rand.nextInt(13);
		}
		notUse[2] = rand.nextInt(13);
		while(notUse[0] == notUse[2] || notUse[1] == notUse[2]){
			notUse[2] = rand.nextInt(13);
		}
		
		int kingdomCount = 0;
		for (int i=0; i<13; i++){
			if (i!=notUse[0] && i!=notUse[1] && i!=notUse[2]){
				kingdomsUsed[kingdomCount] = kingdomNames[i];
				kingdomCount++;
			}
		}
		assertEquals(kingdomsUsed.length,10);
		
		String[] playerNames = {"Grant", "Susan", "Daren", "Alison"};
		
		GameManager mgr = new GameManager(numPlayers, playerNames, kingdomsUsed);
		return mgr;
	}
	
	@Test
	public void testCurrentPlayerGainEstate() {
		GameManager mgr = randomManager();
		mgr.currentPlayerGainEstate();
	}
	
	@Test
	public void testAddCopper() {
		GameManager mgr = randomManager();
		mgr.addCopperToHand();
	}

	@Test
	public void testEmbargo() {
		GameManager mgr = randomManager();
		mgr.addEmbargoToken("Province");
	}
	
	@Test
	public void testAddGold() {
		GameManager mgr = randomManager();
		mgr.addGoldToHand();
	}
	
	@Test
	public void testAddMoney() {
		GameManager mgr = randomManager();
		mgr.addMoney(10, 1);
	}
	
	@Test
	public void testAddSilver() {
		GameManager mgr = randomManager();
		mgr.addSilverToHand();
	}
	
	@Test
	public void testAddToDiscard() {
		GameManager mgr = randomManager();
		CurseCard in = new CurseCard();
		mgr.addToDiscard(in, 0);
	}
	
	@Test
	public void testAddToTrash() {
		GameManager mgr = randomManager();
		CurseCard in = new CurseCard();
		mgr.addToTrash(in);
	}
	
	@Test
	public void testAutoplayTresures() {
		GameManager mgr = randomManager();
		mgr.AutoplayTreasures();
	}
	
	@Test
	public void testBuy() {
		GameManager mgr = randomManager();
		mgr.buy(mgr.findResourceStack("Copper"));
	}
	
	@Test
	public void testEndActions() {
		GameManager mgr = randomManager();
		mgr.endActions();
	}
	
	@Test
	public void testEndTurn() {
		GameManager mgr = randomManager();
		mgr.endPlayerTurn();
	}
	
	@Test
	public void testPlayerHandSize() {
		GameManager mgr = randomManager();
		mgr.getPlayerHandSize(0);
	}
	
	@Test
	public void testisGameOver() {
		GameManager mgr = randomManager();
		mgr.isGameOver();
	}
	
	@Test
	public void testisHandEmpty() {
		GameManager mgr = randomManager();
		mgr.isHandEmpty(0);
	}
	
	@Test
	public void testisPileEmptys() {
		GameManager mgr = randomManager();
		mgr.isPileEmpty("Gold");
	}
	
	@Test
	public void testnextPlayer() {
		GameManager mgr = randomManager();
		mgr.nextPlayer();
	}
	
	@Test
	public void testprintAllPlayersFull() {
		GameManager mgr = randomManager();
		mgr.printAllPlayersFull();
	}
	
	@Test
	public void testprintCurrentPlayerHand() {
		GameManager mgr = randomManager();
		mgr.printCurrentPlayerHand();
	}
	
	@Test
	public void testprintPlayerStandard() {
		GameManager mgr = randomManager();
		mgr.printPlayerStandard();
	}
	
	@Test
	public void testprintPlayerTurnStats() {
		GameManager mgr = randomManager();
		mgr.printPlayerTurnStats();
	}
	
	@Test
	public void testprintPlayerVictoryPoints() {
		GameManager mgr = randomManager();
		mgr.printPlayerVictoryPoints();
	}
}
