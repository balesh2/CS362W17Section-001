package balesh.dominion;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CardTest extends TestCase {

	public CardTest(String testName) {
		super( testName );
	}
	
	public static Test suite()
	{
		return new TestSuite( CardTest.class );
	}
	
	public void testCreateCard() {
		List<Card> cards;
		
		cards = new ArrayList<Card>(Card.createCards());
		assertEquals("First card in the list should be a gold\n", Card.CardName.Gold, cards.get(0).getCardName());
		assertEquals("First card in the list should be a silver\n", Card.CardName.Silver, cards.get(1).getCardName());
		assertEquals("First card in the list should be a copper\n", Card.CardName.Copper, cards.get(2).getCardName());
		assertEquals("First card in the list should be a province\n", Card.CardName.Province, cards.get(3).getCardName());
		assertEquals("First card in the list should be a duchy\n", Card.CardName.Duchy, cards.get(4).getCardName());
		assertEquals("First card in the list should be a estate\n", Card.CardName.Estate, cards.get(5).getCardName());
		assertEquals("First card in the list should be a curse\n", Card.CardName.Curse, cards.get(6).getCardName());
		assertEquals("First card in the list should be a adventurer\n", Card.CardName.Adventurer, cards.get(7).getCardName());
		assertEquals("First card in the list should be a witch\n", Card.CardName.Witch, cards.get(8).getCardName());
		assertEquals("First card in the list should be a mine\n", Card.CardName.Mine, cards.get(9).getCardName());
		assertEquals("First card in the list should be a lab\n", Card.CardName.Laboratory, cards.get(10).getCardName());
		assertEquals("First card in the list should be a thief\n", Card.CardName.Thief, cards.get(11).getCardName());
		assertEquals("First card in the list should be a smithy\n", Card.CardName.Smithy, cards.get(12).getCardName());
		assertEquals("First card in the list should be a moneylender\n", Card.CardName.Moneylender, cards.get(13).getCardName());
		assertEquals("First card in the list should be a village\n", Card.CardName.Village, cards.get(14).getCardName());
		assertEquals("First card in the list should be a woodcutter\n", Card.CardName.Woodcutter, cards.get(15).getCardName());
		assertEquals("First card in the list should be a chancellor\n", Card.CardName.Chancellor, cards.get(16).getCardName());
		assertEquals("First card in the list should be a moat\n", Card.CardName.Moat, cards.get(17).getCardName());
		assertEquals("First card in the list should be a cellar\n", Card.CardName.Cellar, cards.get(18).getCardName());
		assertEquals("First card in the list should be a chapel\n", Card.CardName.Chapel, cards.get(19).getCardName());
	}
	
	public void getTreasureValueTest() {
		List<Card> cards;
		
		cards = new ArrayList<Card>(Card.createCards());
		
		assertEquals("Incorrect treasure value for Gold", 3, cards.get(0).getTreasureValue());
		assertEquals("Incorrect treasure value for Silver", 2, cards.get(1).getTreasureValue());
		assertEquals("Incorrect treasure value for copper", 1, cards.get(2).getTreasureValue());
		assertEquals("Incorrect treasure value for non-treasure card", 0, cards.get(3).getTreasureValue());
	}
	
	public void getScoreTest() {
		List<Card> cards;
		
		cards = new ArrayList<Card>(Card.createCards());
		
		assertEquals("Incorrect score for Copper", 0, cards.get(2).getScore());
		assertEquals("Incorrect score for Province", 6, cards.get(3).getScore());
		assertEquals("Incorrect score for Estate", 3, cards.get(5).getScore());
		assertEquals("Incorrect score for Curse", -1, cards.get(6).getScore());
	}
}
