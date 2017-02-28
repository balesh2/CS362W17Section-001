/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:11:07 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "9<G(B0EXSj");
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.getWinners();
      Random.setNextRandom(81);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Stack<Player> stack0 = new Stack<Player>();
      gameState0.players = (List<Player>) stack0;
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState0, "`u'4]_V}/1K)a.-X{fY");
      stack0.add(player0);
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState1, "`u'4]_V}/1K)a.-X{fY");
      stack0.add(player1);
      stack0.add(player0);
      stack0.removeElement(gameState0.players);
      gameState1.toString();
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Randomness.reset(0L);
      Randomness.reset(0L);
      Randomness.reset(0L);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card.getCard(linkedList0, card_CardName0);
      Integer integer0 = new Integer((-506));
      hashMap0.put((Card) null, integer0);
      gameState0.gameBoard = hashMap0;
      List<Player> list0 = gameState0.players;
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.players = null;
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      LinkedList<Player> linkedList0 = new LinkedList<Player>((Collection<? extends Player>) gameState0.players);
      gameState0.players = (List<Player>) linkedList0;
      gameState0.clone();
      Player player0 = new Player(gameState0, "^@8h9m/Ns\"p");
      player0.numActions = 2209;
      player0.numActions = 171;
      player0.toString();
      linkedList0.add(player0);
      Card.createCards();
      Card.Type.values();
      linkedList0.add(player0);
      gameState0.clone();
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "`u'4]_V}/1K)a.-X{fY");
      gameState0.addPlayer(player0);
      gameState0.toString();
      gameState0.play();
      gameState0.isGameOver();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName.values();
      Randomness.reset(838L);
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.getCard(linkedList0, card_CardName0);
      vector0.add((Card) null);
      gameState0.players = null;
      vector0.addAll((Collection<? extends Card>) gameState0.cards);
      // Undeclared exception!
      try { 
        gameState0.addPlayer((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState1.play();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState1.getWinners();
      Player player0 = new Player(gameState0, (String) null);
      List<Card> list1 = player0.hand;
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.getCard(list1, card_CardName0);
      Integer integer0 = new Integer(46);
      Card.getCard(list1, card_CardName0);
      hashMap0.put((Card) null, integer0);
      gameState0.gameBoard = hashMap0;
      Card.Type.values();
      gameState0.isGameOver();
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = player0.playedCards;
      GameState gameState0 = new GameState(list0);
      player0.playTtreasureCard();
      gameState0.initializeGame();
      gameState0.isGameOver();
      gameState0.gameBoard = null;
      gameState0.players = null;
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Randomness.random = null;
      Stack<Card> stack0 = new Stack<Card>();
      stack0.clone();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.isGameOver();
      gameState0.getWinners();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "C");
      Player player1 = new Player(gameState0, "C");
      gameState0.addPlayer(player1);
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      gameState0.gameBoard.put(card0, (Integer) null);
      // Undeclared exception!
      try { 
        gameState0.toString();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Stack<Player> stack0 = new Stack<Player>();
      gameState0.players = (List<Player>) stack0;
      Player player0 = new Player(gameState0, "`u'4]_V}/1K)a.-X{fY");
      gameState0.addPlayer(player0);
      stack0.add(player0);
      gameState0.toString();
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Stack<Player> stack0 = new Stack<Player>();
      gameState0.players = (List<Player>) stack0;
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState0, "`u'4]_V}/1K)a.-X{fY");
      gameState0.addPlayer(player0);
      HashMap<Player, Integer> hashMap0 = new HashMap<Player, Integer>();
      player0.drawCard();
      GameState.addEmbargo((Card) null);
      stack0.setSize(123);
      stack0.removeElement(gameState0.players);
      gameState1.play();
      gameState0.initializeGame();
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.getCard(linkedList0, card_CardName0);
      Integer integer0 = new Integer(1);
      gameState0.gameBoard.put((Card) null, integer0);
      gameState0.gameBoard = gameState0.gameBoard;
      LinkedList<Player> linkedList1 = new LinkedList<Player>();
      gameState0.play();
      Card.Type.values();
      gameState0.isGameOver();
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player0);
      gameState0.initializeGame();
      gameState0.clone();
      Card.CardName[] card_CardNameArray0 = Card.CardName.values();
      assertNotNull(card_CardNameArray0);
  }
}
