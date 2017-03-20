package balesh.dominion;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class PlayDominionTest extends TestCase {

	public PlayDominionTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( PlayDominionTest.class );
	}

	/**
	 * Rigorous Test :-)
	 */
	public void testApp()
	{
		for(int x = 0; x <10; x++) {
			List<Card> cards;
			GameState state;

			Randomness.reset(10);

			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);

			int randNumPlay = ThreadLocalRandom.current().nextInt(2, 5);
			System.out.println("RANDOM NUMBER OF PLAYERS: "+randNumPlay);
			assertTrue("Number of players must be at least 2\n", randNumPlay >= 2);
			assertTrue("Number of players must be less than 6\n", randNumPlay < 6);

			for(int i=1; i<=randNumPlay; i++) {
				Player player = new Player(state, "player-"+i);
				assertEquals(player.player_username, "player-" + i);
				state.addPlayer(player);
			}

			//check the number of players
			assertEquals("Number of players created must equal random number generated\n", randNumPlay, state.players.size());


			//init game
			state.initializeGame();

			System.out.println("Initialization Dominion Board:\n" + state.toString());

			//check that all the players got cards
			for(int i=0; i<randNumPlay; i++) {
				assertEquals("Hand must contain 5 cards\n", 5, state.players.get(i).hand.size());
				assertEquals("Discard must be empty\n", 0, state.players.get(i).discard.size());
				assertEquals("Deck must contain 5 cards\n", 5, state.players.get(i).deck.size());
				assertEquals("Trash must be empty\n", 0, state.players.get(i).Trash.size());
				assertEquals("No cards should have been played\n", 0, state.players.get(i).playedCards.size());
			}

			//play the game
			HashMap<Player, Integer> winners = state.play();

			//print out end of game and winners
			System.out.println("Game Over\n");

			for(Player p : winners.keySet()) {
				System.out.println("Player Name: " + winners.get(p) + " , Score: " + winners.get(p) );
			}

			//check that there was a winner
			assertNotNull("A winner must have been decided\n", winners);
		}
	}

	public void test2Player()
	{
		for(int x = 0; x <10; x++) {
			List<Card> cards;
			GameState state;

			Randomness.reset(10);

			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);

			int randNumPlay = 2;
			assertTrue("Number of players must be 2\n", randNumPlay == 2);
			
			for(int i=1; i<=randNumPlay; i++) {
				Player player = new Player(state, "player-"+i);
				assertEquals(player.player_username, "player-" + i);
				state.addPlayer(player);
			}

			//check the number of players
			assertEquals("Number of players created must equal 2\n", 2, state.players.size());


			//init game
			state.initializeGame();

			System.out.println("Initialization Dominion Board:\n" + state.toString());

			//check that all the players got cards
			for(int i=0; i<randNumPlay; i++) {
				assertEquals("Hand must contain 5 cards\n", 5, state.players.get(i).hand.size());
				assertEquals("Discard must be empty\n", 0, state.players.get(i).discard.size());
				assertEquals("Deck must contain 5 cards\n", 5, state.players.get(i).deck.size());
				assertEquals("Trash must be empty\n", 0, state.players.get(i).Trash.size());
				assertEquals("No cards should have been played\n", 0, state.players.get(i).playedCards.size());
			}

			//play the game
			HashMap<Player, Integer> winners = state.play();

			//print out end of game and winners
			System.out.println("Game Over\n");

			for(Player p : winners.keySet()) {
				System.out.println("Player Name: " + winners.get(p) + " , Score: " + winners.get(p) );
			}

			//check that there was a winner
			assertNotNull("A winner must have been decided\n", winners);
		}
	
	}
}
