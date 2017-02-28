/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 22 23:54:59 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EnumSet;
import java.util.NoSuchElementException;
import org.cs362.dominion.Card;
import org.cs362.dominion.CardType;
import org.cs362.dominion.Game;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card card0 = Card.CUTPURSE;
      // Undeclared exception!
      try { 
        card0.play((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card[] cardArray0 = Card.values();
      Card card0 = Card.MINION;
      Game game0 = new Game(cardArray0);
      Player player0 = new Player(game0);
      card0.play(game0);
      assertFalse(game0.started);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = Card.BARON;
      // Undeclared exception!
      try { 
        card0.play((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = Card.REMODEL;
      // Undeclared exception!
      try { 
        card0.play((Game) null);
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
      Card card0 = Card.TREASURE_MAP;
      // Undeclared exception!
      try { 
        card0.play((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card[] cardArray0 = Card.values();
      Card card0 = Card.SALVAGER;
      Game game0 = new Game(cardArray0);
      // Undeclared exception!
      try { 
        card0.play(game0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("org.cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card[] cardArray0 = Card.values();
      Card card0 = Card.EMBARGO;
      Game game0 = new Game(cardArray0);
      Player player0 = new Player(game0);
      card0.play(game0);
      assertTrue(game0.bot());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card card0 = Card.ADVENTURER;
      // Undeclared exception!
      try { 
        card0.play((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card card0 = Card.ESTATE;
      int int0 = card0.victoryPoints();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card card0 = Card.CURSE;
      int int0 = card0.victoryPoints();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = Card.valueOf("CURSE");
      assertEquals("Curse", card0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = Card.valueOf("COPPER");
      assertEquals(0, card0.ordinal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = Card.valueOf("GREAT_HALL");
      assertEquals(1, card0.victoryPoints());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Card.strToName("|(cBb16*u9");
      assertEquals("|(CBB16*U9", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card card0 = Card.GOLD;
      int int0 = card0.gold();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card card0 = Card.SMITHY;
      int int0 = card0.draws();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = Card.CURSE;
      int int0 = card0.cost();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card card0 = Card.COUNCIL_ROOM;
      int int0 = card0.buys();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card card0 = Card.MINION;
      int int0 = card0.actions();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.valueOf("|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.|
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.strToName((String) null);
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
      Card card0 = Card.REMODEL;
      EnumSet<CardType> enumSet0 = card0.getType();
      assertEquals(1, enumSet0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card card0 = Card.REMODEL;
      String string0 = card0.getName();
      assertEquals("Remodel", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card card0 = Card.CURSE;
      // Undeclared exception!
      try { 
        card0.play((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card[] cardArray0 = Card.values();
      Card card0 = Card.SEA_HAG;
      Game game0 = new Game(cardArray0);
      Player player0 = new Player(game0);
      card0.play(game0);
      assertFalse(game0.started);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card card0 = Card.MINE;
      Card[] cardArray0 = Card.values();
      Game game0 = new Game(cardArray0);
      Player player0 = new Player(game0);
      card0.play(game0);
      assertTrue(game0.bot());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card[] cardArray0 = Card.values();
      Card card0 = Card.FEAST;
      Game game0 = new Game(cardArray0);
      Player player0 = new Player(game0);
      card0.play(game0);
      assertTrue(game0.bot());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card card0 = Card.STEWARD;
      // Undeclared exception!
      try { 
        card0.play((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Card card0 = Card.BARON;
      int int0 = card0.victoryPoints();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Card card0 = Card.CUTPURSE;
      int int0 = card0.cost();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Card card0 = Card.MINION;
      int int0 = card0.buys();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Card card0 = Card.EMBARGO;
      int int0 = card0.actions();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Card card0 = Card.EMBARGO;
      int int0 = card0.draws();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Card card0 = Card.BARON;
      int int0 = card0.gold();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = Card.strToName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Card[] cardArray0 = Card.values();
      Card card0 = Card.COUNCIL_ROOM;
      Game game0 = new Game(cardArray0);
      Player player0 = new Player(game0);
      // Undeclared exception!
      try { 
        card0.play(game0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }
}
