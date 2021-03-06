/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:26:48 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.board;
import org.cs362.dominion.deck;
import org.cs362.dominion.feast;
import org.cs362.dominion.hand;
import org.cs362.dominion.pile;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class feast_ESTest extends feast_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      feast feast0 = new feast();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      board board0 = new board();
      // Undeclared exception!
      try { 
        feast0.perform_attack(playerArray0, (-1481), board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1481
         //
         assertThrownBy("org.cs362.dominion.feast", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      feast feast0 = new feast();
      feast0.description();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      feast0.card = 1554;
      feast0.type = "";
      feast0.cost = 5;
      playerArray0[0] = player0;
      board board0 = new board();
      pile pile0 = board0.curse;
      board0.smithy = pile0;
      pile0.num_cards = 17;
      board0.num_empty = 5;
      board0.print_board();
      feast feast1 = new feast();
      // Undeclared exception!
      try { 
        feast0.perform_attack(playerArray0, 5, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("org.cs362.dominion.feast", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      feast feast0 = new feast();
      player[] playerArray0 = new player[6];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      playerArray0[1] = player1;
      player player2 = new player();
      playerArray0[2] = player2;
      deck deck0 = new deck();
      player1.player_deck = deck0;
      playerArray0[3] = playerArray0[0];
      player0.gold = 3449;
      playerArray0[4] = playerArray0[1];
      player player3 = new player();
      playerArray0[5] = player3;
      hand hand0 = player0.player_hand;
      player1.player_hand = hand0;
      board board0 = new board();
      // Undeclared exception!
      try { 
        feast0.perform_attack(playerArray0, (-1721), board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1721
         //
         assertThrownBy("org.cs362.dominion.feast", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      feast feast0 = new feast();
      feast feast1 = new feast();
      feast1.description();
      feast1.description();
      player[] playerArray0 = new player[8];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      playerArray0[1] = player1;
      player player2 = new player();
      playerArray0[2] = player2;
      player player3 = new player();
      playerArray0[3] = player3;
      player player4 = new player();
      feast0.type = ">d{ow^IcfQfENjqX:";
      playerArray0[4] = player4;
      player player5 = new player();
      playerArray0[5] = player5;
      playerArray0[6] = playerArray0[4];
      feast1.card = 0;
      player player6 = new player();
      playerArray0[7] = player6;
      board board0 = new board();
      feast0.perform_attack(playerArray0, 0, board0);
      feast0.perform_attack(playerArray0, 0, board0);
      feast0.perform_attack(playerArray0, 0, board0);
      feast feast2 = new feast();
      feast1.description();
      assertFalse(feast1.equals((Object)feast2));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      feast feast0 = new feast();
      feast feast1 = new feast();
      feast1.description();
      feast1.description();
      player[] playerArray0 = new player[8];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      playerArray0[1] = player1;
      player player2 = new player();
      playerArray0[2] = player2;
      player player3 = new player();
      playerArray0[3] = player3;
      player player4 = new player();
      feast0.type = ">d{ow^IcfQfENjqX:";
      playerArray0[4] = player4;
      player player5 = new player();
      playerArray0[6] = player3;
      board board0 = new board();
      feast0.perform_attack(playerArray0, 0, board0);
      feast0.perform_attack(playerArray0, 0, board0);
      feast0.perform_attack(playerArray0, 0, board0);
      feast1.perform_attack(playerArray0, 0, board0);
      assertFalse(feast1.equals((Object)feast0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      board board0 = new board();
      feast feast0 = new feast();
      // Undeclared exception!
      try { 
        feast0.perform_attack((player[]) null, 10, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.feast", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      feast feast0 = new feast();
      feast0.description();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      feast0.card = 1554;
      feast0.cost = 5;
      playerArray0[0] = player0;
      board board0 = new board();
      pile pile0 = board0.curse;
      board0.smithy = pile0;
      pile0.num_cards = 17;
      pile0.num_cards = 0;
      board0.print_board();
      feast0.perform_attack(playerArray0, 0, board0);
      feast0.description();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      feast feast0 = new feast();
      feast0.description();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      feast0.card = 1554;
      feast0.type = "";
      feast0.cost = 5;
      playerArray0[0] = player0;
      board board0 = new board();
      pile pile0 = board0.curse;
      pile0.num_cards = 17;
      pile0.num_cards = 0;
      board0.num_empty = 5;
      board0.print_board();
      feast0.perform_attack(playerArray0, 0, board0);
      feast feast1 = new feast();
      feast0.description();
      feast0.description();
      assertFalse(feast0.equals((Object)feast1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      feast feast0 = new feast();
      feast0.description();
      player[] playerArray0 = new player[1];
      feast0.type = "|;b{.\\X9/s(Xr#F";
      player player0 = new player();
      playerArray0[0] = player0;
      feast0.name = "&akatkN&";
      board board0 = new board();
      feast0.perform_attack(playerArray0, 0, board0);
      board board1 = new board();
      feast0.action = 0;
      player0.print_player();
      feast0.perform_attack(playerArray0, 0, board1);
      feast0.perform_attack(playerArray0, 0, board1);
      feast0.perform_attack(playerArray0, 0, board1);
      feast feast1 = new feast();
      feast feast2 = new feast();
      assertFalse(feast2.equals((Object)feast1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      feast feast0 = new feast();
      player[] playerArray0 = new player[1];
      feast0.type = "|;b{.\\X9/s(Xr#F";
      player player0 = new player();
      playerArray0[0] = player0;
      feast0.name = "&akatkN&";
      board board0 = new board();
      player0.print_player();
      feast0.perform_attack(playerArray0, 0, board0);
      feast0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      feast feast0 = new feast();
      feast0.description();
      player[] playerArray0 = new player[1];
      feast0.type = "|;b{.\\X9/s(Xr#F";
      player player0 = new player();
      playerArray0[0] = player0;
      feast0.name = "&akatkN&";
      board board0 = new board();
      feast0.perform_attack(playerArray0, 0, board0);
      board board1 = new board();
      feast0.action = 0;
      player0.print_player();
      feast0.perform_attack(playerArray0, 0, board1);
      feast feast1 = new feast();
      feast0.perform_attack(playerArray0, 0, board1);
      assertFalse(board1.equals((Object)board0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      feast feast0 = new feast();
      feast0.description();
      player[] playerArray0 = new player[1];
      feast0.type = "|;b{.\\X9/s(Xr#F";
      player player0 = new player();
      playerArray0[0] = player0;
      feast0.name = "&akatkN&";
      board board0 = new board();
      feast0.perform_attack(playerArray0, 0, board0);
      board board1 = new board();
      feast0.action = 0;
      player0.print_player();
      feast0.perform_attack(playerArray0, 0, board1);
      feast0.perform_attack(playerArray0, 0, board1);
      feast feast1 = new feast();
      feast feast2 = new feast();
      assertFalse(feast2.equals((Object)feast1));
  }
}
