/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 07:55:48 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Board;
import dominion.Card;
import dominion.Player;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Board board0 = new Board((-3247));
      int[] intArray0 = new int[8];
      intArray0[1] = (-3247);
      intArray0[2] = (-3247);
      intArray0[3] = (-1361);
      intArray0[5] = (-3247);
      intArray0[6] = (-3247);
      intArray0[7] = (-2941);
      board0.embargo = intArray0;
      Player player0 = new Player(board0, (-3247));
      player0.draw();
      player0.showPoubelle();
      player0.showHand();
      Card card0 = board0.giveCard(7);
      List<Card> list0 = player0.defausse;
      List<Card> list1 = player0.defausse;
      player0.defausse = list1;
      player0.getMoney();
      player0.id = 2652;
      player0.gameTurn();
      player0.play(card0);
      player0.draw();
      player0.poubelle = list0;
      player0.hand = list1;
      player0.playTreasure();
      player0.draw();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Board board0 = new Board((-1391));
      Card card0 = board0.giveCard((-1391));
      Player player0 = new Player(board0, (-1391));
      player0.play(card0);
      int[] intArray0 = new int[3];
      intArray0[0] = (-1391);
      player0.showHand();
      card0.pointVictoire = (-4371);
      player0.displayAction();
      Card card1 = new Card((-4371));
      intArray0[1] = 0;
      Card[] cardArray0 = new Card[6];
      cardArray0[0] = card0;
      cardArray0[1] = card0;
      cardArray0[2] = card0;
      cardArray0[3] = card0;
      cardArray0[4] = card1;
      cardArray0[5] = card0;
      board0.pioche_card = cardArray0;
      intArray0[2] = (-4371);
      board0.copperToTrash = intArray0;
      card1.print();
      player0.id = (-4371);
      player0.mix();
      card1.print();
      player0.displayAction();
      board0.embargo = intArray0;
      player0.mix();
      Player player1 = new Player(board0, 0);
      player0.achat(0, board0);
      player1.deck = player0.hand;
      player1.displayAction();
      player0.getScore();
      player1.draw();
      player1.hand = player0.deck;
      Player player2 = new Player(board0, 0);
      player2.hand = player0.hand;
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Board board0 = new Board(11);
      Player player0 = new Player(board0, 11);
      Card card0 = new Card(11);
      player0.playTreasure();
      card0.nom = "W";
      player0.play(card0);
      player0.id = 11;
      Random.setNextRandom(5);
      player0.showBoard();
      List<Card> list0 = player0.poubelle;
      player0.playTreasure();
      player0.id = 2098;
      List<Card> list1 = player0.hand;
      board0.giveCard(451);
      Player player1 = new Player(board0, (-4729));
      player0.deck = player1.hand;
      player1.removeTreasure();
      List<Card> list2 = player0.poubelle;
      player1.showBoard();
      int int0 = player1.id;
      player0.getScore();
      player0.getScore();
      player0.showPoubelle();
      player1.clear();
      player0.showBoard();
      player1.getMoney();
      player1.mix();
      player1.draw();
      Random.setNextRandom(0);
      player1.getAction();
      player1.getMoney();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Board board0 = new Board(11);
      Player player0 = new Player(board0, 11);
      Card card0 = board0.giveCard(11);
      player0.playTreasure();
      card0.nom = "W";
      player0.id = 2;
      player0.play(card0);
      player0.id = 11;
      Random.setNextRandom(5);
      player0.showBoard();
      List<Card> list0 = player0.poubelle;
      player0.playTreasure();
      player0.id = 2117;
      List<Card> list1 = player0.hand;
      board0.giveCard(451);
      Player player1 = new Player(board0, (-4729));
      player0.deck = player1.hand;
      player1.removeTreasure();
      List<Card> list2 = player0.poubelle;
      player1.showBoard();
      int int0 = player1.id;
      player0.getScore();
      player0.getScore();
      player0.showPoubelle();
      player1.clear();
      player0.showBoard();
      player1.getMoney();
      player1.mix();
      player1.draw();
      Random.setNextRandom(0);
      List<Card> list3 = player0.deck;
      player1.hand = list3;
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Board board0 = new Board(4770);
      Player player0 = new Player(board0, 9);
      player0.getScore();
      Card card0 = board0.giveCard(9);
      player0.displayAction();
      Random.setNextRandom(4770);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 9;
      board0.copperToTrash = intArray0;
      List<Card> list0 = player0.deck;
      card0.valeur = 4770;
      board0.pioche_number = intArray0;
      player0.poubelle = list0;
      player0.hand = list0;
      card0.prix = 2;
      player0.displayAction();
      Random.setNextRandom(0);
      player0.play(card0);
      player0.play(card0);
      player0.showPoubelle();
      Random.setNextRandom((-6));
      player0.removeTreasure();
      player0.removeTreasure();
      Player player1 = new Player(board0, (-3625));
      player1.defausse = player0.hand;
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Board board0 = new Board(1350);
      Player player0 = new Player(board0, 1350);
      Card card0 = new Card(14);
      // Undeclared exception!
      try { 
        player0.play(card0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Board board0 = new Board(17);
      Player player0 = new Player(board0, 17);
      int[] intArray0 = new int[3];
      player0.mix();
      intArray0[0] = 17;
      board0.embargo = intArray0;
      intArray0[1] = 17;
      player0.mix();
      intArray0[2] = 17;
      board0.pioche_number = intArray0;
      List<Card> list0 = player0.deck;
      Random.setNextRandom(7);
      player0.getAction();
      player0.defausse = list0;
      player0.clear();
      // Undeclared exception!
      try { 
        player0.gameTurn();
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
      Board board0 = new Board((-3534));
      Player player0 = new Player(board0, (-3534));
      Card[] cardArray0 = new Card[5];
      Card card0 = board0.giveCard((-3534));
      cardArray0[0] = card0;
      Card card1 = new Card(560);
      cardArray0[1] = card1;
      Card card2 = new Card(0);
      cardArray0[1] = card2;
      Card card3 = new Card(5);
      card3.print();
      cardArray0[3] = card3;
      Card card4 = board0.giveCard(849);
      card4.valeur = 2260;
      cardArray0[4] = card4;
      board0.pioche_card = cardArray0;
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.getScore();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Board board0 = new Board(257);
      Player player0 = new Player(board0, 257);
      int[] intArray0 = new int[8];
      intArray0[0] = 257;
      intArray0[1] = 257;
      intArray0[2] = 433;
      intArray0[3] = 257;
      intArray0[4] = 257;
      Card card0 = new Card(10);
      card0.print();
      player0.play(card0);
      intArray0[5] = 257;
      intArray0[6] = 257;
      intArray0[7] = 257;
      player0.clear();
      board0.embargo = intArray0;
      player0.clear();
      player0.mix();
      player0.gameTurn();
      board0.copperToTrash = intArray0;
      player0.mix();
      player0.getMoney();
      player0.showPoubelle();
      Player player1 = new Player(board0, 4957);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((Board) null, 7);
      List<Card> list0 = player0.poubelle;
      player0.getScore();
      player0.deck = list0;
      player0.poubelle = null;
      player0.displayAction();
      Card card0 = new Card(7);
      card0.nom = "0xFU'K)LTW";
      card0.type = "adventurer";
      card0.nom = "gTi#_e!P*U..*";
      player0.play(card0);
      player0.getAchat();
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.removeTreasure();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Board board0 = new Board((-295));
      int[] intArray0 = new int[8];
      intArray0[0] = (-295);
      intArray0[1] = (-295);
      intArray0[2] = (-295);
      intArray0[3] = (-295);
      intArray0[4] = (-295);
      intArray0[5] = (-295);
      intArray0[6] = (-295);
      intArray0[7] = (-295);
      board0.embargo = intArray0;
      board0.copperToTrash = intArray0;
      Player player0 = new Player(board0, 931);
      player0.showBoard();
      int[] intArray1 = new int[0];
      board0.embargo = intArray1;
      board0.pioche_number = intArray0;
      player0.poubelle = null;
      player0.displayAction();
      // Undeclared exception!
      try { 
        player0.showPoubelle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Board board0 = new Board(0);
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = (-578);
      intArray0[6] = 0;
      intArray0[7] = 0;
      intArray0[8] = 0;
      board0.embargo = intArray0;
      Player player0 = new Player(board0, 0);
      int[] intArray1 = new int[1];
      intArray1[0] = 0;
      List<Card> list0 = player0.deck;
      player0.deck = list0;
      board0.pioche_number = intArray1;
      player0.achat(0, board0);
      player0.removeTreasure();
      player0.clear();
      player0.showBoard();
      List<Card> list1 = player0.poubelle;
      player0.showPoubelle();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Board board0 = new Board((-416));
      Player player0 = new Player(board0, (-416));
      List<Card> list0 = player0.defausse;
      player0.draw();
      player0.defausse = list0;
      player0.defausse = list0;
      player0.defausse = list0;
      player0.deck = list0;
      player0.showBoard();
      player0.getAchat();
      player0.poubelle = list0;
      Player player1 = new Player(board0, 1591);
      player1.showHand();
      // Undeclared exception!
      try { 
        player0.clear();
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
      Board board0 = new Board(2);
      Player player0 = new Player(board0, (-1453));
      List<Card> list0 = player0.deck;
      player0.deck = list0;
      player0.achat(2, board0);
      player0.showHand();
      List<Card> list1 = player0.deck;
      Card card0 = board0.giveCard(2);
      player0.play(card0);
      card0.print();
      card0.prix = (-1453);
      player0.achat(3, board0);
      Player player1 = new Player(board0, (-1453));
      player1.id = (-1453);
      player0.mix();
      player0.showPoubelle();
      player0.achat(0, board0);
      player1.displayAction();
      player0.getAchat();
      player0.showHand();
      player0.showBoard();
      List<Card> list2 = player0.hand;
      player1.deck = player0.hand;
      player0.getAction();
      player1.displayAction();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((Board) null, 0);
      // Undeclared exception!
      try { 
        player0.achat(0, (Board) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Board board0 = new Board(3);
      Player player0 = new Player(board0, 3);
      // Undeclared exception!
      try { 
        player0.play((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Board board0 = new Board(1350);
      Card card0 = board0.giveCard(12);
      Player player0 = new Player(board0, 1350);
      player0.achat(0, board0);
      player0.play(card0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Board board0 = new Board(7);
      Player player0 = new Player(board0, 565);
      Card card0 = board0.giveCard(1833);
      card0.nom = "md";
      player0.play(card0);
      player0.removeTreasure();
      int[] intArray0 = new int[7];
      intArray0[0] = 7;
      intArray0[1] = (-1);
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 1833;
      intArray0[5] = (-1);
      intArray0[6] = 0;
      board0.pioche_number = intArray0;
      player0.deck = null;
      player0.defausse = null;
      // Undeclared exception!
      try { 
        player0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Board board0 = new Board((-13));
      Player player0 = new Player(board0, (-3158));
      player0.removeTreasure();
      List<Card> list0 = player0.deck;
      player0.hand = list0;
      int[] intArray0 = new int[2];
      intArray0[0] = (-3158);
      player0.removeTreasure();
      intArray0[1] = (-3158);
      board0.embargo = intArray0;
      player0.clear();
      player0.draw();
      player0.getMoney();
      player0.getScore();
      Random.setNextRandom((-13));
      player0.draw();
      player0.displayAction();
      List<Card> list1 = player0.deck;
      player0.defausse = list0;
      player0.playTreasure();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Board board0 = new Board((-1));
      board0.giveCard(2433);
      Player player0 = new Player(board0, 52);
      player0.showBoard();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.hand = (List<Card>) linkedList0;
      Card card0 = new Card(52);
      linkedList0.add(card0);
      player0.removeTreasure();
      player0.draw();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Board board0 = new Board(829);
      int[] intArray0 = new int[4];
      intArray0[0] = 6;
      intArray0[1] = 829;
      intArray0[2] = 1889;
      intArray0[3] = 829;
      board0.pioche_number = intArray0;
      Player player0 = new Player(board0, 1889);
      player0.showPoubelle();
      player0.mix();
      player0.defausse = null;
      player0.showHand();
      List<Card> list0 = player0.deck;
      player0.hand = list0;
      // Undeclared exception!
      try { 
        player0.gameTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((Board) null, 2131);
      player0.showHand();
      List<Card> list0 = player0.deck;
      player0.poubelle = list0;
      player0.getAchat();
      player0.removeTreasure();
      int int0 = player0.id;
      player0.clear();
      player0.getMoney();
      player0.showHand();
      player0.removeTreasure();
      int int1 = player0.id;
      player0.clear();
      player0.defausse = list0;
      player0.displayAction();
      List<Card> list1 = player0.deck;
      player0.getMoney();
      // Undeclared exception!
      try { 
        player0.getScore();
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
      Board board0 = new Board(1350);
      Player player0 = new Player(board0, 1350);
      Card card0 = new Card(16);
      player0.play(card0);
      player0.getScore();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((Board) null, 2771);
      player0.showPoubelle();
      player0.draw();
      player0.showHand();
      List<Card> list0 = player0.deck;
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Board board0 = new Board((-438));
      Player player0 = new Player(board0, 2424);
      player0.playTreasure();
      List<Card> list0 = player0.defausse;
      player0.poubelle = list0;
      player0.showPoubelle();
      // Undeclared exception!
      try { 
        player0.gameTurn();
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
      Player player0 = new Player((Board) null, 349);
      player0.getAction();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Board board0 = new Board((-3247));
      int[] intArray0 = new int[8];
      intArray0[0] = (-3247);
      intArray0[1] = (-3247);
      intArray0[2] = (-3247);
      intArray0[3] = (-1361);
      intArray0[4] = (-3247);
      intArray0[5] = (-3247);
      intArray0[6] = (-3247);
      intArray0[7] = (-2941);
      board0.embargo = intArray0;
      Player player0 = new Player(board0, (-3247));
      player0.draw();
      player0.showPoubelle();
      Card card0 = board0.giveCard(7);
      List<Card> list0 = player0.defausse;
      player0.deck = list0;
      List<Card> list1 = player0.defausse;
      player0.defausse = list1;
      player0.getMoney();
      player0.id = 2652;
      player0.gameTurn();
      player0.play(card0);
      player0.draw();
      player0.poubelle = list0;
      player0.hand = list1;
      player0.playTreasure();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player((Board) null, 974);
      List<Card> list0 = player0.poubelle;
      player0.mix();
      player0.hand = list0;
      player0.mix();
      player0.draw();
      player0.playTreasure();
      player0.getMoney();
      player0.getMoney();
      player0.defausse = list0;
      player0.defausse = list0;
      player0.showHand();
      // Undeclared exception!
      try { 
        player0.showBoard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Board board0 = new Board(11);
      Player player0 = new Player(board0, 11);
      Card card0 = board0.giveCard(11);
      player0.playTreasure();
      card0.nom = "W";
      player0.play(card0);
      player0.id = 11;
      Random.setNextRandom(5);
      player0.showBoard();
      List<Card> list0 = player0.poubelle;
      player0.id = 2098;
      List<Card> list1 = player0.hand;
      board0.giveCard(451);
      Player player1 = new Player(board0, (-4729));
      player0.deck = player1.hand;
      player1.removeTreasure();
      List<Card> list2 = player0.poubelle;
      player1.showBoard();
      int int0 = player1.id;
      player0.getScore();
      player0.getScore();
      player0.showPoubelle();
      player1.clear();
      player0.showBoard();
      player1.getMoney();
      player1.mix();
      player1.draw();
      Random.setNextRandom(0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Board board0 = new Board(1365);
      Player player0 = new Player(board0, 1365);
      Card card0 = board0.giveCard(16);
      player0.play(card0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Board board0 = new Board(0);
      int[] intArray0 = new int[4];
      intArray0[0] = 6;
      intArray0[1] = 6;
      intArray0[2] = 0;
      intArray0[3] = 6;
      board0.copperToTrash = intArray0;
      Player player0 = new Player(board0, 6);
      List<Card> list0 = player0.hand;
      player0.draw();
      player0.defausse = list0;
      player0.hand = list0;
      player0.gameTurn();
      player0.gameTurn();
      player0.getAchat();
      player0.gameTurn();
      board0.giveCard(130);
      player0.gameTurn();
      player0.playTreasure();
      player0.getMoney();
      player0.clear();
      player0.playTreasure();
      player0.poubelle = list0;
      // Undeclared exception!
      try { 
        player0.gameTurn();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-206);
      intArray0[1] = (-206);
      intArray0[2] = (-206);
      intArray0[4] = (-206);
      Card[] cardArray0 = new Card[3];
      Card card0 = new Card(0);
      cardArray0[2] = card0;
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Board board0 = new Board(40);
      Player player0 = new Player(board0, 40);
      player0.showBoard();
      player0.showHand();
      player0.draw();
      Card card0 = board0.giveCard(40);
      player0.play(card0);
      player0.displayAction();
      player0.getAchat();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Board board0 = new Board((-1391));
      Card card0 = board0.giveCard((-1391));
      Player player0 = new Player(board0, (-1391));
      player0.play(card0);
      int[] intArray0 = new int[3];
      intArray0[0] = (-1391);
      player0.showHand();
      card0.pointVictoire = (-4371);
      player0.displayAction();
      Card card1 = new Card((-4371));
      intArray0[1] = 0;
      card0.valeur = (-28);
      intArray0[2] = (-4371);
      card0.valeur = (-28);
      board0.copperToTrash = intArray0;
      card1.print();
      player0.id = (-4371);
      player0.mix();
      card1.print();
      player0.displayAction();
      board0.embargo = intArray0;
      player0.mix();
      Player player1 = new Player(board0, 0);
      player0.achat(0, board0);
      player1.deck = player0.hand;
      player1.displayAction();
      player0.getScore();
      player1.draw();
      player1.hand = player0.deck;
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Board board0 = new Board(977);
      int[] intArray0 = new int[9];
      intArray0[0] = 977;
      intArray0[1] = 977;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 977;
      board0.pioche_number = intArray0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      intArray0[8] = 977;
      board0.copperToTrash = intArray0;
      Player player0 = new Player(board0, 0);
      board0.pioche_number = intArray0;
      player0.achat(2, board0);
      List<Card> list0 = player0.poubelle;
      List<Card> list1 = player0.deck;
      List<Card> list2 = player0.poubelle;
      List<Card> list3 = player0.defausse;
      player0.getAchat();
      player0.clear();
      Player player1 = new Player(board0, 0);
      player1.showBoard();
      player1.deck = player0.hand;
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Board board0 = new Board(130);
      Player player0 = new Player(board0, 130);
      player0.clear();
      List<Card> list0 = player0.poubelle;
      player0.deck = list0;
      int[] intArray0 = new int[2];
      intArray0[0] = 130;
      intArray0[1] = 130;
      board0.pioche_number = intArray0;
      player0.showHand();
      board0.embargo = null;
      Player player1 = new Player(board0, 130);
      player1.defausse = player0.deck;
      player1.gameTurn();
      player0.draw();
      player1.deck = list0;
      player1.gameTurn();
      player1.mix();
      player1.getMoney();
      player1.showPoubelle();
      player1.getAction();
      player1.hand = player0.hand;
      player0.getAchat();
      player0.getMoney();
      player1.getMoney();
      player0.removeTreasure();
      player0.getScore();
      // Undeclared exception!
      try { 
        player0.achat(2160, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}