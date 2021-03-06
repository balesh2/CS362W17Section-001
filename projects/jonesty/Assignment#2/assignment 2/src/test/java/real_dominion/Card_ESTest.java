/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 22:48:42 PST 2017
 */

package real_dominion;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1265, 1265, (-680), 1265);
      HashSet<Card> hashSet0 = new HashSet<Card>();
      LinkedList<Card> linkedList0 = new LinkedList<Card>((Collection<? extends Card>) hashSet0);
      int[] intArray0 = new int[7];
      GameState gameState0 = new GameState((List<Card>) linkedList0, intArray0);
      Player player0 = new Player(gameState0, "");
      int int0 = card0.score(player0);
      assertEquals(1265, int0);
      assertEquals(1265, card0.cost);
      assertEquals(1265, card0.numberof);
      assertEquals((-680), card0.treasureValue);
  }

  @Test
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 1821, 0, 0);
      int int0 = card0.getValue();
      assertEquals(0, card0.numberof);
      assertEquals(0, card0.cost);
      assertEquals(0, int0);
      assertEquals(1821, card0.score);
  }

  @Test
  public void test02()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1265, 1265, (-680), 1265);
      int int0 = card0.getValue();
      assertEquals(1265, card0.numberof);
      assertEquals(1265, card0.cost);
      assertEquals(1265, card0.score);
      assertEquals((-680), int0);
  }

  @Test
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1265, 1265, (-680), 1265);
      card0.getType();
      assertEquals((-680), card0.treasureValue);
      assertEquals(1265, card0.score);
      assertEquals(1265, card0.cost);
      assertEquals(1265, card0.numberof);
  }

  @Test
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 91, 91, 91, 91);
      int int0 = card0.getTreasureValue();
      assertEquals(91, card0.score);
      assertEquals(91, int0);
      assertEquals(91, card0.numberof);
      assertEquals(91, card0.cost);
  }

  @Test
  public void test05()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 6, (-1982), 2046, 6);
      assertEquals(6, card0.numberof);
      
      card0.numberof = 0;
      int int0 = card0.getNumberof();
      assertEquals(0, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 20, 1879);
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(20, card0.treasureValue);
      assertEquals(1879, card0.numberof);
      assertEquals(0, card0.score);
  }

  @Test
  public void test07()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, (-2018), (-2018), 5, 5);
      card0.getCardName();
      assertEquals(5, card0.treasureValue);
      assertEquals(5, card0.numberof);
      assertEquals((-2018), card0.score);
      assertEquals((-2018), card0.cost);
  }

  @Test
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "");
      int int0 = card0.score(player0);
      assertEquals(6, card0.cost);
      assertEquals(0, int0);
      assertEquals(30, card0.numberof);
      assertEquals(3, card0.treasureValue);
  }

  @Test
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Councilroom;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertEquals(10, card0.numberof);
      
      card0.numberof = 0;
      assertEquals(0, card0.getValue());
  }

  @Test
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.valueOf("Estate");
      List<Card> list0 = Card.createCards();
      Card card0 = Card.getCard(list0, card_CardName0);
      assertEquals(2, card0.cost);
      
      card0.cost = 0;
      assertEquals(3, card0.score);
  }

  @Test
  public void test11()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2006), (-2006), (-2006), (-1837));
      arrayList0.add(card0);
      Card card1 = Card.getCard(arrayList0, card_CardName0);
      assertEquals((-2006), card1.treasureValue);
      assertNotNull(card1);
      assertEquals((-2006), card1.score);
      assertEquals((-1837), card1.numberof);
      assertEquals((-2006), card1.cost);
  }

  @Test
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card.Type card_Type0 = Card.Type.ACTION;
      Card.CardName card_CardName1 = Card.CardName.Cutpurse;
      Card card1 = new Card(card_CardName1, card_Type0, 10, 0, 7, 15);
      int int0 = card0.compareTo(card1);
      assertEquals(10, card1.cost);
      assertEquals(15, card1.numberof);
      assertEquals(2, int0);
      assertEquals(7, card1.treasureValue);
      assertEquals(0, card1.score);
  }

  @Test
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 1798, 0, 1798);
      Card.CardName card_CardName1 = Card.CardName.Feast;
      Card card1 = new Card(card_CardName1, card_Type0, 1798, 1798, 12, 0);
      int int0 = card0.compareTo(card1);
      assertEquals(1798, card0.numberof);
      assertEquals(12, card1.treasureValue);
      assertEquals((-7), int0);
      assertEquals(1798, card0.score);
      assertEquals(1798, card1.cost);
      assertEquals(0, card1.numberof);
  }

  @Test
  public void test14()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 30, 30, (-1536), 3876);
      int int0 = card0.getNumberof();
      assertEquals(30, card0.cost);
      assertEquals(30, card0.score);
      assertEquals((-1536), card0.treasureValue);
      assertEquals(3876, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 30, 30, (-1536), 3876);
      int int0 = card0.getTreasureValue();
      assertEquals(3876, card0.numberof);
      assertEquals((-1536), int0);
      assertEquals(30, card0.score);
      assertEquals(30, card0.cost);
  }

  @Test
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-900), 3510, 3510, (-900));
      int int0 = card0.getCost();
      assertEquals(3510, card0.treasureValue);
      assertEquals((-900), card0.numberof);
      assertEquals((-900), int0);
      assertEquals(3510, card0.score);
  }

  @Test
  public void test17()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 20, 20, 20, 20);
      int[] intArray0 = new int[5];
      GameState gameState0 = new GameState((List<Card>) null, intArray0);
      Player player0 = new Player(gameState0, "WKgUqDh");
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("real_dominion.Card", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("real_dominion.Card", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("real_dominion.Card", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 1821, 0, 0);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("real_dominion.Card", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(arrayList0, card_CardName0);
      assertNull(card0);
  }

  @Test
  public void test22()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 30, 30, (-1536), 3876);
      card0.getCardName();
      assertEquals((-1536), card0.treasureValue);
      assertEquals(30, card0.score);
      assertEquals(30, card0.cost);
      assertEquals(3876, card0.numberof);
  }

  @Test
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = new Card(card_CardName0, (Card.Type) null, 20, 20, 20, 20);
      card0.getType();
      assertEquals(20, card0.numberof);
      assertEquals(20, card0.treasureValue);
      assertEquals(20, card0.cost);
      assertEquals(20, card0.score);
  }

  @Test
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Councilroom;
      Card card0 = Card.getCard(list0, card_CardName0);
      boolean boolean0 = card0.equals(card0);
      assertEquals(0, card0.score);
      assertEquals(6, card0.cost);
      assertTrue(boolean0);
      assertEquals(10, card0.numberof);
      assertEquals(0, card0.treasureValue);
  }

  @Test
  public void test25()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, (-2018), (-2018), 5, 5);
      boolean boolean0 = card0.equals((Object) null);
      assertEquals(5, card0.numberof);
      assertEquals((-2018), card0.score);
      assertEquals((-2018), card0.cost);
      assertEquals(5, card0.treasureValue);
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[1];
      Card.CardName card_CardName0 = Card.CardName.Councilroom;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1741, 0, 0, 0);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, intArray0);
      Player player0 = new Player(gameState0, "W7Mj6s}q3i)w`[}");
      card0.play(player0, gameState0);
      assertEquals(0, card0.numberof);
      assertEquals(0, card0.treasureValue);
      assertEquals(1741, card0.cost);
      assertEquals(0, card0.score);
  }

  @Test
  public void test27()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 6, (-1982), 2046, 6);
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[6];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "TREASURE");
      card0.play(player0, gameState0);
      assertEquals(6, card0.numberof);
      assertEquals(2046, card0.treasureValue);
      assertEquals(6, card0.cost);
      assertEquals((-1982), card0.score);
  }

  @Test
  public void test28()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Spy;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2018), (-2018), (-2018), 5);
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[0];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "M)wS");
      card0.play(player0, gameState0);
      assertEquals((-2018), card0.cost);
      assertEquals((-2018), card0.treasureValue);
      assertEquals(5, card0.numberof);
      assertEquals((-2018), card0.score);
  }

  @Test
  public void test29()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 14, 480, 480, 5);
      ArrayList<Card> arrayList0 = new ArrayList<Card>(14);
      int[] intArray0 = new int[9];
      GameState gameState0 = new GameState((List<Card>) arrayList0, intArray0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(5, card0.numberof);
      assertEquals(14, card0.cost);
      assertEquals(480, card0.treasureValue);
      assertEquals(480, card0.score);
  }

  @Test
  public void test30()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 28, 28, 28, 5);
      ArrayList<Card> arrayList0 = new ArrayList<Card>(28);
      int[] intArray0 = new int[9];
      GameState gameState0 = new GameState((List<Card>) arrayList0, intArray0);
      Player player0 = new Player(gameState0, "-l");
      card0.play(player0, gameState0);
      assertEquals(5, card0.numberof);
      assertEquals(28, card0.score);
      assertEquals(28, card0.cost);
      assertEquals(28, card0.treasureValue);
  }

  @Test
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[6];
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(10, card0.numberof);
      assertEquals(0, card0.score);
      assertEquals(6, card0.cost);
      assertEquals(0, card0.treasureValue);
  }

  @Test
  public void test32()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Great_hall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 11, 11, 11, 11);
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[7];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(11, card0.treasureValue);
      assertEquals(11, card0.numberof);
      assertEquals(11, card0.cost);
      assertEquals(11, card0.score);
  }

  @Test
  public void test33()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 223, 223, 223, 611);
      HashSet<Card> hashSet0 = new HashSet<Card>(1471, 223);
      List<Card> list0 = Card.filter(hashSet0, card_Type0);
      int[] intArray0 = new int[5];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(223, card0.treasureValue);
      assertEquals(611, card0.numberof);
      assertEquals(223, card0.cost);
      assertEquals(223, card0.score);
  }

  @Test
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(6, card0.cost);
      assertEquals(10, card0.numberof);
      assertEquals(0, card0.score);
      assertEquals(0, card0.treasureValue);
  }

  @Test
  public void test35()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.VICTORY;
      int[] intArray0 = new int[1];
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = new Card(card_CardName0, card_Type0, 1741, 0, 0, 0);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, intArray0);
      Player player0 = new Player(gameState0, "W7Mj6s}qzi}`[}");
      card0.play(player0, gameState0);
      assertEquals(1741, card0.cost);
      assertEquals(0, card0.treasureValue);
      assertEquals(0, card0.numberof);
      assertEquals(0, card0.score);
  }

  @Test
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      int[] intArray0 = new int[0];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, (String) null);
      card0.play(player0, gameState0);
      assertEquals(10, card0.numberof);
      assertEquals(6, card0.cost);
      assertEquals(0, card0.score);
  }

  @Test
  public void test37()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 8, 0, 0, (-866));
      Vector<Card> vector0 = new Vector<Card>(0, (-866));
      int[] intArray0 = new int[6];
      GameState gameState0 = new GameState((List<Card>) vector0, intArray0);
      Player player0 = new Player(gameState0, "Curse");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score);
      assertEquals(8, card0.cost);
      assertEquals((-866), card0.numberof);
      assertEquals(0, card0.treasureValue);
  }

  @Test
  public void test38()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 20, 20, 20, 20);
      int[] intArray0 = new int[5];
      GameState gameState0 = new GameState((List<Card>) null, intArray0);
      Player player0 = new Player(gameState0, "WKgUqDh");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = new Card(card_CardName0, (Card.Type) null, 20, 20, 20, 20);
      int[] intArray0 = new int[5];
      GameState gameState0 = new GameState((List<Card>) null, intArray0);
      Player player0 = new Player(gameState0, "WKgUqDh");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 262, (-1289), 0, 0);
      Player player0 = new Player((GameState) null, "Jvx");
      int int0 = card0.score(player0);
      assertEquals(0, card0.numberof);
      assertEquals(262, card0.cost);
      assertEquals((-1289), int0);
      assertEquals(0, card0.treasureValue);
  }

  @Test
  public void test41()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, (-2018), (-2018), 5, 5);
      card0.updateNumof(1112);
      assertEquals(1112, card0.numberof);
  }

  @Test
  public void test42()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 1069, 503, (-395));
      int int0 = card0.getValue();
      assertEquals((-395), card0.numberof);
      assertEquals(0, card0.cost);
      assertEquals(503, int0);
      assertEquals(1069, card0.score);
  }

  @Test
  public void test43()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 30, 30, (-1536), 3876);
      int int0 = card0.getCost();
      assertEquals(30, int0);
      assertEquals((-1536), card0.treasureValue);
      assertEquals(30, card0.score);
      assertEquals(3876, card0.numberof);
  }

  @Test
  public void test44()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 1798, 0, 1798);
      card0.compareTo(card0);
      assertEquals(1798, card0.score);
      assertEquals(0, card0.treasureValue);
      assertEquals(0, card0.cost);
      assertEquals(1798, card0.numberof);
  }

  @Test
  public void test45()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.createCards();
      List<Card> list1 = Card.filter(list0, card_Type0);
      assertEquals(13, list1.size());
  }

  @Test
  public void test46()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 30, 30, (-1536), 3876);
      String string0 = card0.toString();
      assertEquals((-1536), card0.treasureValue);
      assertEquals(30, card0.cost);
      assertEquals(30, card0.score);
      assertEquals(3876, card0.numberof);
      assertEquals("\tEstate", string0);
  }

  @Test
  public void test47()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 4780, (-2656), 55, (-2656));
      int int0 = card0.getNumberof();
      assertEquals((-2656), int0);
      assertEquals(4780, card0.cost);
      assertEquals((-2656), card0.score);
      assertEquals(55, card0.treasureValue);
  }

  @Test
  public void test48()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Councilroom;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      int int0 = card0.getTreasureValue();
      assertEquals(0, int0);
      assertEquals(10, card0.numberof);
      assertEquals(6, card0.cost);
      assertEquals(0, card0.score);
  }
}
