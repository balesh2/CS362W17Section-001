package balesh.dominion;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class PlayDominion {
	public static void main(String args[]) {
		List<Card> cards;
		GameState state;
		Randomness.reset(10);

		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		
		int randNumPlay = ThreadLocalRandom.current().nextInt(2, 5);
		System.out.println("RANDOM NUMBER OF PLAYERS: "+randNumPlay);

		for(int i=1; i<=randNumPlay; i++) {
			Player player = new Player(state, "player-"+i);
			state.addPlayer(player);
		}


		//init game
		state.initializeGame();

		System.out.println("Initialization Dominion Board:\n" + state.toString());

		//play the game
		HashMap<Player, Integer> winners = state.play();
		
		//print out end of game and winners
		System.out.println("Game Over\n");

		for(Player p : winners.keySet()) {
			System.out.println("Player Name: " + winners.get(p) + " , Score: " + winners.get(p) );
		}

		System.exit(0);
	}
}
