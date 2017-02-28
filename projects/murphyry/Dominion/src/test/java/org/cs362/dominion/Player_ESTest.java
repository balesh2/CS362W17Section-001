/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 00:46:49 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.numActions = (-1);
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.coins = 1;
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.endTurn();
      player0.hand = gameState0.cards;
      player0.coins = 1;
      Player player1 = player0.clone();
      player1.playTtreasureCard();
      player1.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.endTurn();
      player0.coins = 8;
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.endTurn();
      player0.coins = 1;
      GameState gameState1 = new GameState(gameState0.cards);
      player0.buyCard(gameState1);
      assertEquals(1, player0.getnumActions());
  }
/*
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((GameState) null, "org.cs362.dominion.Card$CardName");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.gain(card0);
      player0.drawCard();
      player0.numActions = 10;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }
*/
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.endTurn();
      player0.numBuys = 17;
      player0.hand = gameState0.cards;
      player0.playKingdomCard();
      assertEquals(19, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.numActions = (-1);
      player0.playKingdomCard();
      assertEquals(-1, player0.getnumActions());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.discard = gameState0.cards;
      player0.coins = 1;
      player0.drawCard();
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.numActions = (-1);
      int int0 = player0.getnumBuys();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "jXEr");
      player0.endTurn();
      int int0 = player0.getnumBuys();
      assertEquals(1, player0.getnumActions());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      player0.endTurn();
      int int0 = player0.getnumActions();
      assertEquals(1, player0.getnumBuys());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.numActions = (-1);
      int int0 = player0.getnumActions();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.coins = 1;
      int int0 = player0.getCoins();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.coins = (-9);
      int int0 = player0.getCoins();
      assertEquals((-9), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.discard = gameState0.cards;
      player0.initializePlayerTurn();
      player0.drawCard();
      assertEquals(1, player0.getnumActions());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.discard = gameState0.cards;
      player0.drawCard();
      player0.initializePlayerTurn();
      player0.drawCard();
      assertEquals(1, player0.getnumActions());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "Laboratory");
      player0.numBuys = (-125);
      Player player1 = player0.clone();
      assertNotSame(player1, player0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.numActions = (-1);
      Player player1 = player0.clone();
      assertNotSame(player1, player0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "Embargo");
      player0.coins = (-1838);
      Player player1 = player0.clone();
      assertNotSame(player1, player0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((GameState) null, "o1J9y-*M[JW^VIc5[");
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "numActions: ");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "jXEr");
      player0.endTurn();
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "Silver");
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.discard = gameState0.cards;
      player0.hand = list0;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((GameState) null, "org.cs362.dominion.Card$Type");
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "Y`nRfj[QN");
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.endTurn();
      player0.coins = 6;
      // Undeclared exception!
      try { 
        player0.buyCard((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "\"");
      player0.printStateGame();
      assertEquals(0, player0.getnumBuys());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Player.actionPhase Card:");
      player0.hand = gameState0.cards;
      player0.endTurn();
      player0.coins = 1;
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "jXEr");
      player0.playedCards = list0;
      player0.endTurn();
      assertEquals(1, player0.getnumBuys());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.endTurn();
      player0.coins = 17;
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "jXEr");
      player0.endTurn();
      player0.buyCard(gameState0);
      assertEquals(1, player0.getnumActions());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.playTtreasureCard();
      assertEquals(0, player0.getCoins());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "8YY^%/)i|");
      player0.discard = gameState0.cards;
      int int0 = player0.scoreFor();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "O{tm9A@");
      player0.endTurn();
      player0.coins = 6;
      player0.buyCard(gameState0);
      int int0 = player0.scoreFor();
      assertEquals(1, player0.getnumActions());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      player0.discard = gameState0.cards;
      player0.initializePlayerTurn();
      int int0 = player0.scoreFor();
      assertEquals(1, player0.getnumBuys());
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player((GameState) null, "org.cs362.dominion.Card$CardName");
      int int0 = player0.getCoins();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player((GameState) null, "org.cs362.dominion.Card$CardName");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.discard(card0);
      assertEquals(0, player0.getCoins());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ",s^)L;?'Yo6vtrnfa");
      int int0 = player0.getnumActions();
      assertEquals(0, int0);
  }
}
