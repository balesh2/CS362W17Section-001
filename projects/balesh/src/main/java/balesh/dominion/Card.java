package balesh.dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Card {
	/*
	 * BEGIN CLASS PARAM DEFINITIONS
	 */
	
	/** 
 	 * @param enum CardName ist he name of the card
	 * @param enum Type is the type of the card
	 * @param int cost is the cost of the card
	 * @param int score is the score of the card when the game is over
	 * @param treasureValue is the value of the treasure cards
	 **/


	/* Defines types of cards - Type */
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	/* Defines the names of the types of cards - CardName */
	public static enum CardName {
		Gold, Silver, Copper,
		Province, Duchy, Estate, Curse,
		Adventurer, Witch, Mine, Laboratory, Thief, Moneylender, Woodcutter, Chancellor,
	        Moat, Cellar, Chapel, Smithy, Village;
	}

	/* Define all the other params */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

	/* Define the card */
	private Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cardName = cardName;
		this.realType = type;
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
	}

	/*
	 * BEGIN ACCESSOR FUNCTIONS 
	 */

	/* Returns the Card's name */
	public CardName getCardName() {
		return cardName;
	}

	/* Returns the Card's type */
	public Type getType() {
		return realType;
	}

	/* Returns the Card's cost */
	public int getCost() {
		return cost;
	}

	/* Returns the Card's score */
	public int getScore() {
		return score;
	}

	/* Returns the Card's treasure value */
	public int getTreasureValue() {
		return treasureValue;
	}

	/*
	 * BEGIN GAME FUNCTIONS
	 */

	/* Creates a Linked List of Cards */
	public static List<Card> createCards() {
		//Create Linked list of cards
		List<Card> retVal = new LinkedList<Card>();

		//Treasure Cards
		Card c = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		retVal.add(c);
		c = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		retVal.add(c);
		c = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1);
		retVal.add(c);

		//Victory Cards
		c = new Card(CardName.Province, Type.VICTORY, 8, 6, 0);
		retVal.add(c);
		c = new Card(CardName.Duchy, Type.VICTORY, 5, 1, 0);
		retVal.add(c);
		c = new Card(CardName.Estate, Type.VICTORY, 2, 3, 0);
		retVal.add(c);
		c = new Card(CardName.Curse, Type.VICTORY, 0, -1, 0);
		retVal.add(c);

		//Kingdom Cards
		c = new Card(CardName.Adventurer, Type.ACTION, 6, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Witch, Type.ACTION, 5, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Mine, Type.ACTION, 5, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Laboratory, Type.ACTION, 5, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Thief, Type.ACTION, 4, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Smithy, Type.ACTION, 4, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Moneylender, Type.ACTION, 4, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Village, Type.ACTION, 3, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Woodcutter, Type.ACTION, 3, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Chancellor, Type.ACTION, 3, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Moat, Type.ACTION, 2, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Cellar, Type.ACTION, 2, 0, 0);
		retVal.add(c);
		c = new Card(CardName.Chapel, Type.ACTION, 2, 0, 0);
		retVal.add(c);

		//return the list of cards
		return retVal;
	}

	//Play the game!
	public void play(Player player, GameState state) {
		switch(this.cardName) {
			case Adventurer:
				//actions
				Card temp;
				int count = 0;

				while(count < 2) {
					temp = player.drawCard();
					System.out.println("TYPE: " + temp.getType());

					if(temp.getType() == Type.TREASURE) {
						System.out.println(temp);
						count++;
					} else {
						player.discard(temp);
					}

				}

				System.out.println(
						"Reveal cards from your deck until you reveal 2 Treasure cards." +
						"Put those Treasure cards in your hand and discard the other revealed cards."
						);
				return;
			case Witch:
				System.out.println(
						"+2 Cards" +
						"Each other player gains a Curse card."
						);
				
				//get two cards
				player.drawCard();
				player.drawCard();
				
				//give the other players curses
				//iterate through the players
				for(int i = 0; i < state.players.size(); i++) {
					//if the player is the current player, skip them
					if(state.players.get(i).player_username != player.player_username){
						state.players.get(i).gain(Card.getCard(state.players.get(i).deck, Card.CardName.Curse));
					}
				}

				return;
			case Mine:
				System.out.println(
						"Trash a Treasure card from your hand." +
						"Gain a Treasure card costing up to $3 more; put it into your hand."
						);

				//filter out all treasure cards from hand
				List<Card> TreasureCards = Card.filter(player.hand, Type.TREASURE);

				Card tmp = null;

				if(TreasureCards.size() != 0) {
					//look through all the treasure cards
					for (int i = 0; i < TreasureCards.size(); i++) {
						//if the card is silver, replace it with a gold
						if(TreasureCards.get(i).getTreasureValue() == 2) {
							//search through the cards for a gold
							for(int x = 0; x < state.cards.size(); x++) {
								if (state.cards.get(x).cardName == CardName.Gold) {
									tmp = state.cards.get(x);
									break;
								}
							}

							if(state.gameBoard.get(tmp) > 0) {
								System.out.println(tmp);
								System.out.println(state.gameBoard.get(tmp));
								state.gameBoard.put(tmp, state.gameBoard.get(tmp) - 1);
								System.out.println(state.gameBoard.get(tmp));
								player.gain(tmp);
								player.Trash.add(player.hand.get(i));
							}
						}

						//if the cards is copper, replace with a silver
						if(TreasureCards.get(i).getTreasureValue() == 1) {
							//search through cards for a silver
							for(int x=0; x < state.cards.size(); x++) {
								if(state.cards.get(x).cardName == CardName.Silver) {
									tmp = state.cards.get(x);
									break;
								}
							}

							if(state.gameBoard.get(tmp) > 0) {
								System.out.println(tmp);
								System.out.println(state.gameBoard.get(tmp));
								state.gameBoard.put(tmp, state.gameBoard.get(tmp) - 1);
								System.out.println(state.gameBoard.get(tmp));
								player.gain(tmp);
								player.Trash.add(player.hand.get(i));
							}
						}
					}
				}

				return;
			case Laboratory:
				System.out.println(
						"+2 Cards;" +
						"+1 Action."
						);
				player.drawCard();
				player.drawCard();
				player.numActions += 1;

				return;
			case Thief:
				System.out.println(
						"Each other player reveals the top 2 cards of his deck." +
						"If they revealed any Treasure cards, they trash one of them that you choose." +
						"You may gain any or all of these trashed cards." +
						"They discard the other revealed cards."
						);

				Card tempCard1, tempCard2;
				//iterate through the players
				for(int i = 0; i < state.players.size(); i++) {
					//if the player is the current player, skip them
					if(state.players.get(i).player_username != player.player_username){
						//draw the top two cards from the deck
						tempCard1 = state.players.get(i).drawCard();
						tempCard2 = state.players.get(i).drawCard();

						//filter out treasure cards
						if(tempCard1.getType() == Type.TREASURE) {
							if(tempCard1.getTreasureValue() == 3) {
								state.players.get(i).Trash.add(tempCard1);
								state.players.get(i).discard(tempCard2);
								player.gain(tempCard1);
							} else if(tempCard2.getType() == Type.TREASURE) {
								if(tempCard2.getTreasureValue() > tempCard1.getTreasureValue()) {
									state.players.get(i).Trash.add(tempCard2);
									state.players.get(i).discard(tempCard1);
									player.gain(tempCard2);
								} else {
									state.players.get(i).Trash.add(tempCard1);
									state.players.get(i).discard(tempCard2);
									player.gain(tempCard1);
								}
							}
						} else if(tempCard2.getType() == Type.TREASURE) {
							state.players.get(i).Trash.add(tempCard2);
							state.players.get(i).discard(tempCard1);
							player.gain(tempCard2);
						}
							
					}
				}

				return;
			case Smithy:
				System.out.println(
						"+3 Cards."
						);
				player.drawCard();
				player.drawCard();
				player.drawCard();
				return;
			case Moneylender:
				System.out.println(
						"Trash a Copper from your hand." +
						"If you do, +$3."
						);

				TreasureCards = Card.filter(player.hand, Type.TREASURE);

				if(TreasureCards.size() != 0) {
					//look through all the treasure cards
					for (int i = 0; i < TreasureCards.size(); i++) {
						//if the cards is copper, trash it and add $3
						if(TreasureCards.get(i).getTreasureValue() == 1) {
							player.Trash.add(TreasureCards.get(i));
							player.coins += 3;
							return;
						}
					}
				}

				return;
			case Village:
				System.out.println(
						"+1 Card;" +
						"+2 Actions."
						);
				player.drawCard();
				player.numActions += 2;
				return;
			case Woodcutter:
				System.out.println(
						"+1 Buy;" +
						"+$2."
						);
				player.numBuys += 1;
				player.coins += 2;

				return;
			case Chancellor:
				System.out.println(
						"+$2;" +
						"You may immediately put your deck into your discard pile."
						);
				player.coins += 2;
				
				//discard deck
				while(player.deck.size() > 0) {
					player.deck.removeFirst();
				}
				
				return;
			case Moat:
				System.out.println(
						"+2 Cards;" +
						"When another player plays an Attack card, you may reveal this from your hand." +
						"If you do, you are unaffected by that Attack."
						);
				player.drawCard();
				player.drawCard();
		
				return;
			case Cellar:
				System.out.println(
						"+1 Action;" +
						"Discard any number of cards." +
						"+1 Card per card discarded."
						);
				player.numActions += 1;
				//don't discard anything
				return;
			case Chapel:
				System.out.println(
						"Trash up to 4 cards from your hand."
						);
				//trash first four cards
				for(int i=0; i<4; i++) {
					player.Trash.add(player.hand.get(i));
				}

				return;
			default: return;
		}
	}

	//Gets a card from a linked list by name
	public static Card getCard(List<Card> cards, CardName cardName) {
		//iterate for each card in the linked list
		for(int i=0; i<cards.size(); i++) {
			if(cards.get(i).cardName.equals(cardName)) {
				return cards.get(i);
			}
		}

		//return nothing if the card was not in the list
		return null;
	
	}

	//filters out all cards of some type
	public static List<Card> filter(Iterable<Card> cards, Type t) {
		List<Card> retVal = new ArrayList<Card>();

		//iterate for each card in the linked list
		for (Card c : cards) {
			if(c.getType() == t) {
				retVal.add(c);
			}
		}

		return retVal;
	
	}

	/*
	 * BEGIN OVERRIDES
	 */

	//prints out all constant cards
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" \n\t" + this.getCardName());

		return sb.toString();

	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
		       return true;
		}

		if(!super.equals(o)) { 
			return false;
		}

		//return false if the object given is not a card
		if(!(o instanceof Card)) {
		       return false;
		}

		//by default return the card name
		return cardName.equals(((Card) o).cardName);
	}

	
	//from here to end is pulled from java example on canvas
	public int compareTo(Card o) {
		//TODO auto-generated method stub
		return cardName.compareTo(o.cardName);
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}
