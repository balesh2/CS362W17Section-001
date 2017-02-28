/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 14 17:15:27 GMT 2017
 */

package com.omalleya.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.omalleya.app.Card;
import com.omalleya.app.GameState;
import com.omalleya.app.Player;
import com.omalleya.app.Randomness;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.initializePlayerTurn();
      String string0 = player0.toString();
      assertEquals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 1coins: 0numBuys: 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "~Y+FPV");
      player0.numActions = (-3736);
      String string0 = player0.toString();
      assertEquals(" --- ~Y+FPV ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: -3736coins: 0numBuys: 0\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = linkedList0;
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 1619, 1619);
      linkedList0.add(card0);
      linkedList0.add(card0);
      int int0 = player0.scoreFor();
      assertEquals(3238, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.initializePlayerTurn();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = linkedList0;
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      linkedList0.add(card0);
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      player1.gain((Card) null);
      player1.coins = (-306);
      // Undeclared exception!
      try { 
        player1.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.initializePlayerTurn();
      player0.gain((Card) null);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.initializePlayerTurn();
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, (-831));
      card0.play(player0, (GameState) null);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      player0.drawCard();
      player0.coins = (-1);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "JPiGRMfymRL^v9eY");
      player0.playedCards = (List<Card>) stack0;
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 6398, 6398, 577);
      player0.drawCard();
      stack0.add(card0);
      player0.cleanUp();
      Random.setNextRandom(577);
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "pd#Ot");
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 3533, 1242, 3533);
      arrayList0.add(card0);
      GameState gameState1 = new GameState((List<Card>) arrayList0);
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.buy(gameState1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "YFMDcAi~aK");
      GameState gameState1 = gameState0.clone();
      player0.buy(gameState1);
      assertNotSame(gameState1, gameState0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list1 = Card.filter(list0, card_Type0);
      GameState gameState0 = new GameState(list1);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      Card card0 = Card.sortCost(list1, list0, 754);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      arrayList0.add(card0);
      player1.hand = arrayList0;
      arrayList0.add(card0);
      player1.buy(gameState0);
      assertNotSame(player1, player0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "JPiGRMfymRL^v9eY");
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 13, 13, 13);
      stack0.add(card0);
      player0.playedCards = (List<Card>) stack0;
      player0.cleanUp();
      player0.numActions = 13;
      player0.drawCard();
      player0.action();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "fq@d!OV(ZGe(hgGk");
      player0.numActions = (-1);
      player0.action();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "';*b[gU'dgv5");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTreasureCards();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "`JL!sxHbX;R");
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.gain(card0);
      Randomness.random = null;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, ")");
      player0.drawCard();
      player0.discarded = null;
      // Undeclared exception!
      try { 
        player0.discard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "F+oT");
      Player player1 = player0.clone();
      player1.hand = null;
      // Undeclared exception!
      try { 
        player1.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      LinkedList<Card> linkedList0 = player1.deck;
      player0.discarded = linkedList0;
      player1.discarded = linkedList0;
      player0.playedCards = (List<Card>) player1.discarded;
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.cleanUp();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 13, 13, 13);
      stack0.add(card0);
      player0.playedCards = (List<Card>) stack0;
      player0.discarded = null;
      // Undeclared exception!
      try { 
        player0.cleanUp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 13, 13, 13);
      stack0.add(card0);
      player0.playedCards = (List<Card>) stack0;
      player0.buy(gameState0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list1 = Card.filter(list0, card_Type0);
      GameState gameState0 = new GameState(list1);
      Player player0 = new Player(gameState0, "");
      Card card0 = Card.sortCost(list1, list0, 754);
      player0.gain(card0);
      player0.drawCard();
      player0.playTreasureCards();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Card card0 = Card.sortCost(list0, list0, 754);
      player0.gain(card0);
      int int0 = player0.scoreFor();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "xrUf}");
      ArrayList<Card> arrayList0 = player0.hand;
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-4692), (-4692), (-4692));
      arrayList0.add(card0);
      int int0 = player0.scoreFor();
      assertEquals((-4692), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, ")");
      player0.drawCard();
      player0.discard((Card) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "~Y+FPV");
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.discard(card0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      LinkedList<Card> linkedList0 = player0.deck;
      player0.discarded = linkedList0;
      player0.drawCard();
      player0.cleanUp();
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Feast;
      player0.playedCards = (List<Card>) stack0;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 6398, 6398, 13);
      stack0.add(card0);
      player0.initializePlayerTurn();
      player0.cleanUp();
      player0.drawCard();
      Random.setNextRandom(6398);
      // Undeclared exception!
      try { 
        player0.buy(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      player0.initializePlayerTurn();
      Random.setNextRandom(6398);
      // Undeclared exception!
      try { 
        player0.buy(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      player0.initializePlayerTurn();
      Random.setNextRandom(13);
      // Undeclared exception!
      try { 
        player0.buy(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      player0.action();
  }
}