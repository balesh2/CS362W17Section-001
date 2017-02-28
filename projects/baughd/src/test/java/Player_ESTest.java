/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 23:55:39 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState(arrayList0);
      Player player0 = new Player(gameState0, " gains ");
      player0.numBuys = Integer.MIN_VALUE;
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "[6");
      player0.endTurn();
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " --- --------------------------- --- ");
      player0.endTurn();
      player0.coins = (-484);
      player0.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState(arrayList0);
      Player player0 = new Player(gameState0, " gains ");
      player0.numBuys = Integer.MIN_VALUE;
      player0.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState(stack0);
      Player player0 = new Player(gameState0, "");
      player0.numActions = (-1194);
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.initializePlayerTurn();
      player0.playKingdomCard();
      Random.setNextRandom(527);
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "[6");
      player0.discard = list0;
      player0.drawCard();
      player0.drawCard();
      player0.endTurn();
      player0.initializePlayerTurn();
      player0.playTreasureCard();
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      player0.discard = list0;
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((GameState) null, "&CuOM{U");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.initializePlayerTurn();
      player0.numActions = 7;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Ic$G[n'pdI@<Tu.");
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
  public void test12()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "\nDiscard: ");
      player0.discard = null;
      // Undeclared exception!
      try { 
        player0.gain((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "c.D");
      player0.playedCards = null;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState(vector0);
      Player player0 = new Player(gameState0, "");
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " --- ------------------------ -- ");
      player0.numBuys = 3584;
      player0.coins = 725;
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
  public void test16()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "-D!");
      player0.endTurn();
      player0.coins = 7;
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      player0.discard = list0;
      player0.initializePlayerTurn();
      Random.setNextRandom(527);
      player0.playTreasureCard();
      player0.buyCard(gameState0);
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.playTreasureCard();
      player0.buyCard(gameState0);
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " --- --------------------------- --- ");
      player0.endTurn();
      player0.coins = 5;
      player0.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "[6");
      player0.discard = list0;
      Card card0 = player0.drawCard();
      player0.discard(card0);
      player0.initializePlayerTurn();
      player0.playTreasureCard();
      player0.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "-D!");
      player0.endTurn();
      player0.coins = 2;
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " --- ------------------------ -- ");
      player0.endTurn();
      player0.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState(arrayList0);
      Player player0 = new Player(gameState0, " gains ");
      player0.playTreasureCard();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      player0.discard = list0;
      player0.gain((Card) null);
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " --- ------------------------ -- ");
      player0.discard = list0;
      player0.drawCard();
      player0.endTurn();
      int int0 = player0.scoreFor();
      assertFalse(list0.isEmpty());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "-D!");
      player0.endTurn();
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V[6");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.initializePlayerTurn();
      player0.playKingdomCard();
      assertEquals(10, list0.size());
      
      player0.endTurn();
      assertEquals(20, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " --- --------------------------- --- ");
      player0.printStateGame();
  }
}
