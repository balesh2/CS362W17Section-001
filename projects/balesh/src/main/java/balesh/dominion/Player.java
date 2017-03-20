package balesh.dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import balesh.dominion.Card.Type;

public class Player {
	//Creates the player's hand, deck, discard pile, and played cards pile
		//Each player has these four piles of cards
		List<Card> hand = new ArrayList<Card>();
		LinkedList<Card> deck = new LinkedList<Card>();
		List<Card> discard = new ArrayList<Card>();
		List<Card> playedCards = new ArrayList<Card>();
		List<Card> Trash = new ArrayList<Card>();

		String player_username;

		int numActions;
		int numBuys;
		int coins;

		final GameState gameState;

		public Player(GameState gameState, String player_username) {
			this.player_username = player_username;
			this.gameState = gameState;
			//this.initializePlayerTurn();
		}

		final Card drawCard() {
			if(deck.isEmpty()) {
				//shuffle discard pile back into deck
				System.out.println("Shuffle the deck of " + player_username + " to draw FIVE cards");
				while (discard.size() > 0) {
					int c = (int) Randomness.nextRandomInt(discard.size());
					//Move discarded card to the deck
					deck.add(discard.remove(c));
				}
			}

			//draw a card from the deck
			Card toDraw = deck.poll();
			//add card to hand
			hand.add(toDraw);

			//print out the card that was drawn
			System.out.println("draw " + toDraw);
			//Collections.sort(hand); //sort the cards in the hand

			//return drawn card
			return toDraw;
		}

		final void initializePlayerTurn() {
			//init the players turns
			numActions = 1;
			coins = 0;
			numBuys = 1;

			//draw five cards and put them in the player's hand
			for(int i=0; i<5; i++) {
				System.out.println("INIT DRAW #" + (i+1));
				drawCard();
			}

		}

		/* BEGIN PLAYER MOVES */
		
		final boolean gain(Card c) {
			discard.add(c);
			System.out.println("Player: " + this.player_username + " gains " + c);

			return true;
		}

		final void discard(Card c) {
			hand.remove(c);
			discard.add(c);
			System.out.println("Player: " + this.player_username + " discards " + c);
		}

		public void playKingdomCard() {
			while(numActions > 0) {
				//filters out the action cards into a hand of action cards
				List<Card> actionCards = Card.filter(hand, Type.ACTION);

				if(actionCards.size() == 0) {
					return;
				}

				Card c = (Card)actionCards.get(0);
				if(c == null) {
					return;
				}
				System.out.println("Player.actionPhase Card: " + c.toString());

				playedCards.add(c);
				numActions -= 1;
				
				c.play(this, gameState);
			}
		}

		final int scoreFor() {
			int score = 0;
			
			//add in score from hand
			for(Card card : hand) {
				score += card.getScore();
			}

			//add in score from discard
			for(Card card : discard) {
				score += card.getScore();
			}

			//add in score from deck
			for(Card card : deck) {
				score += card.getScore();
			}

			return score;
		}

		public void playTreasureCard() {
			System.out.println("--- -------------------------- ---");
			System.out.println("PLAYING TREASURE CARD");
			
			//Filter out the treasure cards
			List<Card> TreasureCards = Card.filter(hand, Type.TREASURE);
			System.out.println(TreasureCards.size());
			System.out.println("Player coins before adding TREASURE cards: " + this.coins);

			//if there are no treasure cards
			if (TreasureCards.size() == 0) {
				return;
			}
			
			Card tempTreasure;
			
			for(int i = 0; i < TreasureCards.size(); i++){
				   tempTreasure = TreasureCards.get(i);
				   System.out.println(tempTreasure);
				   this.coins += tempTreasure.getTreasureValue();
				   System.out.println("Player coins after adding TREASURE cards: " + this.coins);
			}
			System.out.println("--- -------------------------- ---");
		}

		public void buyCard() {
			System.out.println("--- -------------------------- ---");
			System.out.println("BUYING CARDS");
			
			Card tempBuy;
			
			System.out.println(gameState.cards);
			System.out.println(gameState.cards.size());
			System.out.println(gameState.cards.get(0).getCost());
			System.out.println(coins);
			
			//Repeat for the max number of buys available
			while(numBuys > 0){
				int tempCoins = coins;
				boolean bought = false;
				
				//keep trying to buy something of price tempCoins until there is an item of price tempCoins
				//or until we run out of coins
				do {
					//for simplicity, the most expensive item will be bought by each player
					for(int i = 0; i < gameState.cards.size();i++) {
						//finds the most expensive thing it can afford
						if(gameState.cards.get(i).getCost() == tempCoins) {
							tempBuy = gameState.cards.get(i);
							if(gameState.gameBoard.get(tempBuy) > 0) {
								bought = true;
								gain(tempBuy);
								System.out.println(gameState.gameBoard.get(tempBuy));
								gameState.gameBoard.put(tempBuy, gameState.gameBoard.get(tempBuy) - 1);
								System.out.println("After" + gameState.gameBoard.get(tempBuy));
								numBuys-=1;
								coins-=gameState.cards.get(i).getCost();
								tempCoins-=gameState.cards.get(i).getCost();
								break;
							}
						}
					}
					
					//decrement tempCoins to change the cost of the item we are looking for on the next loop
					tempCoins--;
				} while(!bought && coins > 0);
			}
			
			System.out.println("--- -------------------------- ---");
		}

		final void endTurn() {
			System.out.println("--- -------------------------- ---");
			System.out.println("ENDING TURN");
			
			//discard the player's hand
			if(this.hand.size() != 0){
				System.out.println("HAND: " + this.hand.size() + "\n" + this.hand);
				while(!this.hand.isEmpty()) {
					   System.out.println("HAND TO REMOVE " + this.hand.get(0));
					   discard(this.hand.get(0));
				}
			}
			
			//draw a new hand of five cards
			for(int i = 0; i < 5; i++){
		   		this.drawCard();
			}
			
			//reset turn counters
			this.numActions = 1;
			this.coins = 0;
			this.numBuys = 1;
			
			System.out.println("--- -------------------------- ---");
		}

		public void printStateGame() {
			System.out.println("--- " + this.player_username + " ---");
			System.out.println("--- -------------------------- ---");
			System.out.println(this.gameState.toString());
			System.out.println("--- -------------------------- ---");
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Hand: " + this.hand);
			sb.append("Discard: " + this.discard);
			sb.append("Deck: " + this.deck);
			sb.append("Played Cards: " + this.playedCards);
			sb.append("numAtions: " + this.numActions);
			sb.append("coins:" + this.coins);
			sb.append("numBuys: " + this.numBuys);
			sb.append("\n");

			return sb.toString();
		}

		protected Player clone() throws CloneNotSupportedException {
			Player clonePlayer = (Player) super.clone();
			clonePlayer.hand = new ArrayList<Card>(hand);
			clonePlayer.deck = new LinkedList<Card>(deck);
			clonePlayer.discard = new ArrayList<Card>(discard);
			clonePlayer.playedCards = new ArrayList<Card>(playedCards);

			return clonePlayer;
		}

}
