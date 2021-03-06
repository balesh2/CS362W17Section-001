/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 00:29:01 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Card;
import org.cs362.dominion.Deck;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      player0.hand = null;
      // Undeclared exception!
      try {
        player0.discardAtIndex((-230));
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(" action(s)\n\t");
      player0.getMoves();
      player0.hand = null;
      Deck deck0 = player0.discard;
      // Undeclared exception!
      try {
        player0.discard();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      player0.sumTreasure();
      player0.discardAtIndex((-1413));
      Deck deck0 = player0.hand;
      deck0.printDeck();
      deck0.shuffle();
      Card card0 = new Card("");
      card0.setCost(23);
      card0.printCard();
      card0.setDescription("Bf;");
      deck0.addNumberOfCardType(23, card0);
      Card card1 = new Card("");
      deck0.addCard(card1);
      card1.setCoins((-1757));
      deck0.emptyDeckCard = card1;
      player0.drawDeck = deck0;
      player0.discardAtIndex((-1757));
      card1.setCoins(1383);
      card1.setValue((-2227));
      System.setCurrentTimeMillis(2218L);
      player0.draw();
      player0.getMoves();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      player0.hand = null;
      // Undeclared exception!
      try {
        player0.draw(43);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.hasMoves();
      assertFalse(boolean0);
      assertEquals("null", player0.getName());
      assertEquals(0, player0.getValues());

      player0.discardAll();
      player0.drawDeck = null;
      // Undeclared exception!
      try {
        player0.recycle();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      Deck deck0 = player0.drawDeck;
      player0.modifyBuys((-1));
      player0.draw(1036);
      player0.discardAll();
      player0.printHandType("dhM2j8l>*ewm0lQm");
      player0.discardAtIndex((-3775));
      player0.printAllDecks();
      player0.discardAtIndex(3888);
      player0.sumTreasure();
      player0.draw();
      player0.handContainsType("iY`tfI&e?*ZO");
      player0.hasMoves();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player("'s hand:");
      player0.printHandType("'s hand:");
      player0.discardAtIndex(1);
      player0.printAllDecks();
      player0.modifyVictoryPoints(281);
      player0.discardAtIndex(2299);
      player0.getBuys();
      player0.discard();
      Deck deck0 = player0.discard;
      deck0.hasType("'s hand:");
      player0.hand = deck0;
      Card card0 = player0.draw();
      deck0.emptyDeckCard = card0;
      deck0.tokens = 1;
      player0.draw(0);
      Deck deck1 = player0.hand;
      player0.discard = deck1;
      player0.starterPoints();
      player0.hand = deck1;
      deck0.addNumberOfCardType(5382, card0);
      player0.modifyVictoryPoints(896);
      player0.buy(deck1);
      deck0.emptyDeckCard = player0.hand.emptyDeckCard;
      player0.getBuys();
      player0.buy(deck0);
      player0.modifyBuys(1);
      // Undeclared exception!
      try {
        player0.sumTreasure();
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player("G9@U_&Q_VaPr`5X0sx");
      Card card0 = new Card();
      Deck deck0 = new Deck(0, card0);
      player0.hand = deck0;
      player0.discardAtIndex(5);
      Card card1 = player0.draw();
      card1.setBuys(5);
      player0.modifyBuys(864);
      player0.discard();
      Deck deck1 = new Deck(2053, card1);
      player0.endTurn();
      card1.setDescription("G9@U_&Q_VaPr`5X0sx");
      player0.hand = deck1;
      player0.discard = deck1;
      System.setCurrentTimeMillis(2053);
      player0.sumTreasure();
      player0.hasMoves();
      player0.getMoves();
      player0.getMoves();
      player0.hand = deck1;
      player0.hand = deck1;
      card0.setCost(2466);
      player0.hand = deck0;
      player0.draw();
      player0.draw();
      player0.hasActions();
      Player player1 = new Player("You have:\n\t0 action(s)\n\t0 pruchase(s)\n\t0 coin(s)");
      Deck deck2 = player1.drawDeck;
      System.setCurrentTimeMillis(1L);
      player0.hasActions();
      Deck deck3 = player1.drawDeck;
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player("org.apache.xerces.jaxp.datatype.DurationImpl");
      Deck deck0 = player0.discard;
      player0.hand = deck0;
      player0.endTurn();
      player0.getVictoryPoints();
      deck0.shuffle();
      player0.skipActionsPhase();
      player0.getValues();
      deck0.addNumberOfCardType(0, (Card) null);
      player0.draw();
      player0.discard();
      player0.discard("org.apache.xerces.jaxp.datatype.DurationImpl");
      deck0.drawCard((String) null);
      player0.drawDeck = deck0;
      player0.endTurn();
      deck0.tokens = 2514;
      player0.modifyActions(7601);
      player0.modifyActions(0);
      // Undeclared exception!
      try {
        player0.recycle();
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player("'^6E[elk7#Y-5&N");
      player0.draw();
      player0.modifyValues(24);
      player0.printAllDecks();
      player0.hasMoves();
      player0.printAllDecks();
      player0.draw();
      player0.modifyActions(24);
      player0.handContainsType("O|o>X1QjpzjJwdyk=y");
      player0.discard();
      player0.getValues();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.discardAll();
      Card card0 = player0.draw();
      player0.draw(8);
      Deck deck0 = player0.hand;
      deck0.shuffle();
      Card card1 = new Card();
      card1.setName("=qz");
      deck0.emptyDeckCard = card1;
      deck0.addNumberOfCardType(2736, card0);
      card1.setVictoryPoints(0);
      player0.buy(deck0);
      player0.showHand();
      player0.printHandType("");
      player0.modifyBuys(1337);
      player0.skipActionsPhase();
      player0.modifyValues(1337);
      player0.printAllDecks();
      player0.endTurn();
      // Undeclared exception!
      try {
        player0.handContainsType((String) null);
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      Deck deck0 = player0.hand;
      player0.discard();
      player0.discardAll();
      player0.discard();
      player0.draw(3088);
      player0.skipActionsPhase();
      player0.discard = deck0;
      // Undeclared exception!
      try {
        player0.discardAll();
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      player0.discard();
      player0.discard();
      player0.hand = null;
      player0.modifyVictoryPoints(0);
      // Undeclared exception!
      try {
        player0.discardAll();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player();
      player0.modifyBuys((-901));
      player0.getBuys();
      player0.printAllDecks();
      player0.recycle();
      player0.hasActions();
      player0.discard("'s discarded deck: ");
      player0.recycle();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player("H1u10?ejf5%TL6(<+l");
      player0.skipActionsPhase();
      player0.recycle();
      Deck deck0 = player0.hand;
      ArrayList<Card> arrayList0 = player0.drawDeck.deck;
      deck0.deck = arrayList0;
      ArrayList<Card> arrayList1 = deck0.deck;
      arrayList1.ensureCapacity((-2426));
      arrayList1.add((Card) null);
      player0.starterPoints();
      deck0.deck = arrayList1;
      // Undeclared exception!
      try {
        player0.sumTreasure();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.getMoves();
      player0.endTurn();
      player0.modifyActions((-7));
      player0.discard();
      player0.discardAll();
      Deck deck0 = new Deck("3#UEP*9T:e3 8k");
      player0.printHandType("r");
      player0.buy(deck0);
      player0.discard("r");
      player0.modifyVictoryPoints((-4650));
      player0.sumTreasure();
      Deck deck1 = player0.discard;
      Card card0 = new Card("You have:\n\t");
      card0.setCoins((-1));
      deck1.emptyDeckCard = card0;
      player0.skipActionsPhase();
      player0.getValues();
      deck1.drawCard();
      player0.draw(3595);
      player0.draw();
      player0.modifyBuys(0);
      player0.buy(deck1);
      player0.discard();
      player0.getActions();
      player0.modifyValues((-4650));
      player0.getValues();
      player0.recycle();
      player0.hand = deck1;
      player0.getVictoryPoints();
      player0.getActions();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player("");
      player0.handContainsType("");
      player0.printHandType("");
      player0.discardAll();
      player0.endTurn();
      player0.getName();
      player0.printHandType("");
      player0.modifyActions(0);
      player0.discard((String) null);
      player0.starterPoints();
      // Undeclared exception!
      try {
        player0.draw(60000);
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      player0.discard("cCG");
      player0.skipActionsPhase();
      player0.discard = null;
      player0.printHandType("r");
      player0.showHand();
      player0.starterPoints();
      player0.hasActions();
      // Undeclared exception!
      try {
        player0.printAllDecks();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player();
      player0.modifyActions(0);
      player0.draw();
      player0.sumTreasure();
      player0.discardAtIndex(1260);
      player0.handContainsType("estate");
      player0.discardAll();
      player0.hand = null;
      player0.skipActionsPhase();
      // Undeclared exception!
      try {
        player0.draw();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      player0.skipActionsPhase();
      // Undeclared exception!
      try {
        player0.buy((Deck) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      player0.starterPoints();
      player0.discard("");
      player0.modifyVictoryPoints(5406);
      player0.endTurn();
      player0.getVictoryPoints();
      Player player1 = new Player();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((String) null);
      player0.discard((String) null);
      player0.modifyActions(29);
      Deck deck0 = player0.hand;
      player0.modifyValues(0);
      deck0.hasType("treasure");
      deck0.resetTokens();
      deck0.hasCard("");
      player0.recycle();
      player0.modifyActions(1569);
      player0.draw(307);
      player0.discard();
      player0.getName();
      player0.showHand();
      player0.hasActions();
      player0.buy(deck0);
      player0.hasActions();
      Deck deck1 = player0.discard;
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      player0.sumTreasure();
      player0.discard();
      player0.recycle();
      Card card0 = player0.draw();
      Deck deck0 = new Deck(277, card0);
      player0.hand = deck0;
      Deck deck1 = player0.drawDeck;
      player0.discardAtIndex((-942));
      card0.setName("dutchy");
      player0.hasActions();
      card0.setCoins((-942));
      player0.showHand();
      player0.getBuys();
      player0.printHandType("'s discarded deck: ");
      player0.modifyActions((-560));
      player0.discard("dutchy");
      player0.draw();
      player0.discardAll();
      player0.getBuys();
      player0.getVictoryPoints();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player("");
      player0.discardAll();
      player0.getName();
      player0.handContainsType("");
      player0.sumTreasure();
      player0.discardAll();
      player0.showHand();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player();
      player0.discardAtIndex((-1243));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((String) null);
      player0.modifyValues(1555);
      player0.sumTreasure();
      // Undeclared exception!
      try {
        player0.printHandType((String) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(":bMIDs~`5\"~9");
      Deck deck0 = player0.drawDeck;
      deck0.resetTokens();
      player0.buy(deck0);
      player0.showHand();
      player0.starterPoints();
      player0.getActions();
      player0.getMoves();
      Player player1 = new Player();
      Deck deck1 = player1.discard;
      player1.discard();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player();
      player0.draw(1034);
      player0.sumTreasure();
      player0.starterPoints();
      player0.getMoves();
      player0.skipActionsPhase();
      player0.sumTreasure();
      player0.hasMoves();
      player0.draw();
      player0.handContainsType("");
      System.setCurrentTimeMillis(1034);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player("");
      player0.printAllDecks();
      player0.starterPoints();
      player0.modifyActions((-3350));
      player0.hasMoves();
      player0.modifyValues((-3350));
      player0.hasActions();
      player0.getActions();
      player0.modifyActions(0);
      player0.getBuys();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player();
      player0.hasActions();
      player0.starterPoints();
      player0.sumTreasure();
      player0.getName();
      player0.hasActions();
      player0.modifyVictoryPoints((-4507));
      player0.draw();
      player0.handContainsType("UnknownField");
      player0.hand = null;
      player0.recycle();
      player0.modifyBuys((-4507));
      player0.skipActionsPhase();
      // Undeclared exception!
      try {
        player0.handContainsType("UnknownField");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player("'s hand:");
      player0.getMoves();
      player0.skipActionsPhase();
      player0.discardAll();
      player0.draw();
      player0.discardAll();
      player0.hasMoves();
      player0.draw((-2161));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player();
      player0.getName();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player("'s hand:");
      player0.printHandType("'s hand:");
      player0.discardAtIndex(1);
      player0.printAllDecks();
      player0.modifyVictoryPoints(1);
      player0.discardAtIndex(1);
      player0.discard();
      Deck deck0 = new Deck();
      deck0.hasType("'s hand:");
      player0.draw();
      deck0.emptyDeckCard = null;
      player0.draw(1);
      Deck deck1 = player0.hand;
      player0.modifyVictoryPoints(896);
      player0.buy(deck1);
      player0.getBuys();
      player0.buy(deck0);
      player0.modifyBuys(0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player();
      player0.modifyBuys(1272);
      player0.hasMoves();
      player0.discard("]");
      player0.getActions();
      player0.discardAll();
      player0.showHand();
      Deck deck0 = player0.hand;
      deck0.modifyTokens(0);
      player0.drawDeck = deck0;
      player0.getMoves();
      player0.recycle();
      deck0.deck = player0.drawDeck.deck;
      player0.draw(1);
      player0.discard();
      player0.sumTreasure();
      assertEquals(1272, player0.getBuys());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player("org.cs362.dominion.Player");
      player0.discard();
      player0.modifyActions(12);
      player0.draw();
      player0.draw();
      player0.sumTreasure();
      player0.hasMoves();
      player0.discard("org.cs362.dominion.Player");
      player0.recycle();
      Deck deck0 = player0.drawDeck;
      player0.discard();
      player0.printAllDecks();
      player0.printHandType("vro");
      player0.modifyValues(0);
      player0.draw(0);
      player0.draw();
      player0.handContainsType("org.cs362.dominion.Player");
      player0.skipActionsPhase();
      player0.sumTreasure();
      player0.getVictoryPoints();
      player0.getMoves();
      assertEquals(1, player0.getValues());

      Deck deck1 = player0.hand;
      player0.endTurn();
      player0.discardAll();
      player0.getMoves();
      player0.recycle();
      player0.sumTreasure();
      player0.hasActions();
      Deck deck2 = player0.hand;
      assertTrue(deck2.empty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player();
      player0.getValues();
      player0.modifyVictoryPoints(0);
      player0.starterPoints();
      player0.getMoves();
      player0.hasActions();
      player0.showHand();
      player0.discardAtIndex(0);
      player0.recycle();
      Deck deck0 = player0.hand;
      player0.draw();
      player0.modifyActions(715);
      player0.hasMoves();
      player0.hasActions();
      player0.modifyVictoryPoints(3);
      player0.discard();
      player0.drawDeck = player0.hand;
      assertEquals(3, player0.getVictoryPoints());
      assertEquals(716, player0.getActions());
  }
}
