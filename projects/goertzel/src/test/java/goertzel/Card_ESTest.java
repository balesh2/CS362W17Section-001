/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 21:44:01 GMT 2017
 */

package goertzel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import goertzel.Card;
import goertzel.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.stats((Card.CardName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("goertzel.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.matchType((Card.CardName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("goertzel.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = null;
      try {
        card0 = new Card((Card.CardName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("goertzel.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.VILLAGE;
      Card card0 = new Card(card_CardName0);
      String string0 = card0.toString();
      assertEquals("VILLAGE\t\tACTION\t\tCost: 3 \tVP: 0\tTr_Val: 0", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GREAT_HALL;
      int[] intArray0 = Card.stats(card_CardName0);
      assertArrayEquals(new int[] {3, 0, 0, 1, 1, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GARDENS;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.EMBARGO;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.VILLAGE;
      Card.CardType card_CardType0 = Card.matchType(card_CardName0);
      assertEquals("ACTION", card_CardType0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.SALVAGER;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.SMITHY;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.MINE;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GREAT_HALL;
      Card.CardType card_CardType0 = Card.matchType(card_CardName0);
      assertEquals("ACTION", card_CardType0.name());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GARDENS;
      Card.CardType card_CardType0 = Card.matchType(card_CardName0);
      assertEquals("VICTORY", card_CardType0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.FEAST;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CUTPURSE;
      Card card0 = new Card(card_CardName0);
      String string0 = card0.toString();
      assertEquals("CUTPURSE\t\tACTION\t\tCost: 4 \tVP: 0\tTr_Val: 0", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.BARON;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.AMBASSADOR;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CURSE;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.ESTATE;
      Card card0 = new Card(card_CardName0);
      String string0 = card0.toString();
      assertEquals("ESTATE\t\tVICTORY\t\tCost: 3 \tVP: 1\tTr_Val: 0", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.DUCHY;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.PROVINCE;
      Card card0 = new Card(card_CardName0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.SILVER;
      Card card0 = new Card(card_CardName0);
      // Undeclared exception!
      try { 
        card0.play((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("goertzel.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GOLD;
      Card card0 = new Card(card_CardName0);
      // Undeclared exception!
      try { 
        card0.play((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("goertzel.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.ADVENTURER;
      Card card0 = new Card(card_CardName0);
      // Undeclared exception!
      try { 
        card0.play((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("goertzel.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.COPPER;
      Card card0 = new Card(card_CardName0);
      // Undeclared exception!
      try { 
        card0.play((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("goertzel.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.COUNCIL_ROOM;
      Card card0 = new Card(card_CardName0);
      String string0 = card0.toString();
      assertEquals("COUNCIL_ROOM\t\tACTION\t\tCost: 5 \tVP: 0\tTr_Val: 0", string0);
  }
}
