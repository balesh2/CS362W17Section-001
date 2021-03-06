/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 07:48:02 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.AIPlayer;
import org.cs362.dominion.Card;
import org.cs362.dominion.Deck;
import org.cs362.dominion.Game;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Game_ESTest extends Game_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Game game0 = new Game((-1656), false);
      game0.curPlayerIdx = (-1656);
      game0.isGameOver();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = new Game((-601), true, arrayList0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Game game0 = new Game(4, true);
      Player player0 = new Player("", false);
      player0.addMoney(4);
      game0.currentPlayer = player0;
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      arrayList0.add(game0.currentPlayer);
      game0.players = arrayList0;
      game0.declareWinner();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Game game0 = new Game(4, true);
      Player player0 = new Player("", false);
      game0.currentPlayer = player0;
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      arrayList0.add(game0.currentPlayer);
      player0.setMoney((-2203));
      game0.players = arrayList0;
      game0.declareWinner();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Game game0 = new Game(1, true);
      AIPlayer aIPlayer0 = (AIPlayer)game0.declareWinner();
      aIPlayer0.setBuys(2736);
      game0.declareWinner();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Game game0 = new Game(4, true);
      Player player0 = new Player("", false);
      game0.currentPlayer = player0;
      game0.buyPhase();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      arrayList0.add(game0.currentPlayer);
      game0.players = arrayList0;
      game0.declareWinner();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Game game0 = new Game(4, true);
      Player player0 = new Player("", false);
      game0.currentPlayer = player0;
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      arrayList0.add(game0.currentPlayer);
      player0.setActions(1042);
      game0.players = arrayList0;
      game0.declareWinner();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Game game0 = new Game(3, true);
      AIPlayer aIPlayer0 = (AIPlayer)game0.declareWinner();
      aIPlayer0.addActions((-2201));
      game0.declareWinner();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Game game0 = new Game((-1781), true);
      Player player0 = new Player("", true);
      game0.currentPlayer = player0;
      // Undeclared exception!
      try { 
        game0.turn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Game game0 = new Game(4, true);
      // Undeclared exception!
      try { 
        game0.play();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Game game0 = new Game(0, false);
      game0.players = null;
      // Undeclared exception!
      try { 
        game0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Game game0 = new Game((-1304), true);
      // Undeclared exception!
      try { 
        game0.play();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Game game0 = new Game((-1656), false);
      game0.curPlayerIdx = (-1656);
      // Undeclared exception!
      try { 
        game0.play();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Game game0 = new Game(2, true);
      game0.board = null;
      // Undeclared exception!
      try { 
        game0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>(0);
      Game game0 = new Game(0, false, arrayList0);
      // Undeclared exception!
      try { 
        game0.isGameOver();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Game game0 = new Game(0, true);
      // Undeclared exception!
      try { 
        game0.declareWinner();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Game game0 = new Game(0, false);
      Player player0 = new Player("\n\n\n**************************\n\nWelcome to Dominion!!!!\n\n***************************\n\n", false);
      game0.currentPlayer = player0;
      player0.setActions(1049);
      game0.actionPhase();
      // Undeclared exception!
      try { 
        game0.cleanPhase();
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
      Game game0 = new Game((-625), false);
      // Undeclared exception!
      try { 
        game0.cleanPhase();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Game game0 = new Game(1, true);
      AIPlayer aIPlayer0 = (AIPlayer)game0.declareWinner();
      game0.currentPlayer = (Player) aIPlayer0;
      // Undeclared exception!
      try { 
        game0.buyPhase();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Game game0 = new Game(0, true);
      // Undeclared exception!
      try { 
        game0.buyPhase();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Game game0 = new Game(0, true);
      // Undeclared exception!
      try { 
        game0.actionPhase();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Deck deck0 = new Deck("");
      Game game0 = null;
      try {
        game0 = new Game(60000, true, deck0.deck);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Game game0 = null;
      try {
        game0 = new Game(0, false, (ArrayList<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = null;
      try {
        game0 = new Game(3, true, arrayList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Game game0 = null;
      try {
        game0 = new Game(Integer.MAX_VALUE, true);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Game game0 = null;
      try {
        game0 = new Game(975, false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Game game0 = null;
      try {
        game0 = new Game(16, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Game game0 = new Game(0, false);
      Player player0 = new Player("\n\n\n**************************\n\nWelcome to Dominion!!!!\n\n***************************\n\n", false);
      game0.currentPlayer = player0;
      // Undeclared exception!
      try { 
        game0.cleanPhase();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Game game0 = new Game((-39), true);
      Player player0 = new Player("'s hand\n", true);
      game0.currentPlayer = player0;
      player0.setActions(1052);
      game0.actionPhase();
      player0.deck = game0.currentPlayer.discard;
      game0.cleanPhase();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Game game0 = new Game((-39), true);
      Player player0 = new Player("'s hand\n", true);
      game0.currentPlayer = player0;
      player0.setActions(1052);
      player0.deck = game0.currentPlayer.discard;
      game0.turn();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Game game0 = new Game(1, true);
      AIPlayer aIPlayer0 = (AIPlayer)game0.declareWinner();
      game0.currentPlayer = (Player) aIPlayer0;
      game0.actionPhase();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Game game0 = new Game(4, true);
      Player player0 = new Player("", false);
      game0.currentPlayer = player0;
      player0.setActions(1042);
      // Undeclared exception!
      try { 
        game0.turn();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = null;
      try {
        game0 = new Game(72, false, arrayList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Game game0 = new Game(4, true);
      AIPlayer aIPlayer0 = (AIPlayer)game0.declareWinner();
      assertNotNull(aIPlayer0);
      
      ArrayList<Card> arrayList0 = aIPlayer0.discard.deck;
      Game game1 = new Game(4, true, arrayList0);
      assertEquals("Player_3", aIPlayer0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Game game0 = new Game(4, true);
      // Undeclared exception!
      try { 
        game0.turn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }
}
