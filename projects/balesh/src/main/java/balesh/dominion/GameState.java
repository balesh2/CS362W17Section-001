package balesh.dominion;

//import java.lag.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class GameState {
	public List<Player> players = new ArrayList<Player>();
	public List<Card> cards ;
	public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	


	public GameState(List<Card> cards) {
		this.cards=cards;

	}

	public void addPlayer(Player player) {
		players.add(player);
	}   

	public void initializeGame() {
		if(players.size() > 4 || players.size() < 2) {
			System.err.println("The Number of players must be between 2 and 4.");
			return;
		}

		int selectedKingdom = 0;
		int Kingdom_Cards_Selected = 13; //because only 13 kingdom cards are defined

		while(selectedKingdom < Kingdom_Cards_Selected) {
			int random = (int) Randomness.random.nextInt(cards.size());
			Card temp = cards.get(random);
			if(temp.getType() != Card.Type.ACTION) continue; //check that the card drawn is not an ACTION card
			if(gameBoard.containsKey(temp)) continue;
			gameBoard.put(temp, 10);
			selectedKingdom++;
		}

		//set number of CURSE cards
		gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);
		//set number of VICTORY cards
		gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
		gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
		gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 8);
		//set number of TREASURE cards
		gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 8);
		gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 8);
		gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 8);

		for(Player p : players) {
			for(int i=0; i<7; i++) {
				p.gain(Card.getCard(cards, Card.CardName.Copper));
			}
			for(int i=0; i<3; i++) {
				p.gain(Card.getCard(cards, Card.CardName.Estate));
			}

			p.coins = 0;
			p.numActions = 1;
			p.numBuys = 1;

			//draw 5 cards from the deck
			for(int i=0; i<5; i++) {
				p.drawCard();
			}
		}
	}

	public HashMap<Player, Integer> play() {
		int turn = 0;

		while(!isGameOver()) {
			turn += 1;

			for(Player p : players) {
				//start turn
				System.out.println("Player: " + p.player_username + " is playing");

				//play action card
				p.playKingdomCard();
				//play treasure card
				p.playTreasureCard();
				//buy cards
				p.buyCard();
				
				//end turn
				p.endTurn();
			}

			if(turn == 2) {
				break;
			}
		}

		return this.getWinners();
	}

	public boolean isGameOver() {
		//end the game is there are no more Province cards
		if((this.gameBoard.get(Card.getCard(cards, Card.CardName.Province)) == null) || (this.gameBoard.get(Card.getCard(cards, Card.CardName.Province)) == 0)) {
			return true;
		}

		//end the game if there are three or more empty supply piles
		int numEmpty = 0;
		for(int v : gameBoard.values()) {
			if(v == 0) {
				numEmpty++;
			}

			if(numEmpty >= 3) {
				return true;
			}
		}

		return false;
	}

	public HashMap<Player, Integer> getWinners() {
		HashMap<Player, Integer> playerScore = new HashMap<Player, Integer>();

		//get scores
		for(Player p : players) {
			int score = p.scoreFor();
			playerScore.put(p, score);
		}

		return playerScore;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (gameBoard.isEmpty())
			sb.append("The board game is empty. Please initialize the game.");
		else {
			for (Player player : players)
				sb.append(" --- " + player.toString() + "\n");
			sb.append(" --- gameBoard --- \n");
			sb.append("Cards on the table: \n");
			sb.append("Card Name \t\t NumberCards: \n");
			//Map<Card, Integer> treeMap = new TreeMap<Card, Integer>(gameBoard);
			//for (Card card : treeMap.keySet())
				//sb.append("\t " + card.getCardName() + "\t\t "
						//+ treeMap.get(card) + "\n");
		}
		return sb.toString();
	}   

	private GameState(List<Card> cards, List<Player> players, HashMap<Card, Integer> gameBoard) {
		this.cards=cards;
		this.players=players;
		this.gameBoard=gameBoard;

	}

	public GameState clone() throws CloneNotSupportedException {
		List<Player> clonePlayers = new ArrayList<Player>();
		List<Card> cloneCards = new ArrayList<Card>();
		HashMap<Card, Integer> cloneGameBoard = new HashMap<Card, Integer>();	

		for (Player player : players) 
			clonePlayers.add((Player) player.clone());
		for (Card card : cards) 
			cloneCards.add((Card) card.clone());
		for (Card card : gameBoard.keySet())
			cloneGameBoard.put((Card) card.clone(),gameBoard.get(card));

		final GameState cloneState= new GameState(cloneCards,clonePlayers,cloneGameBoard);
		return  cloneState;
	}

}
