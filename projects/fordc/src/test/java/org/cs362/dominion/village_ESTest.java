/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:40:30 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.board;
import org.cs362.dominion.deck;
import org.cs362.dominion.player;
import org.cs362.dominion.village;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class village_ESTest extends village_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      village village0 = new village();
      player[] playerArray0 = new player[8];
      player player0 = new player();
      playerArray0[0] = player0;
      deck deck0 = player0.player_deck;
      board board0 = new board();
      deck0.num_cards = 0;
      board0.buy_curse(player0, board0);
      village0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      village village0 = new village();
      player[] playerArray0 = new player[8];
      player player0 = new player();
      playerArray0[0] = player0;
      deck deck0 = player0.player_deck;
      board board0 = new board();
      deck0.num_cards = 0;
      // Undeclared exception!
      try { 
        village0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("org.cs362.dominion.deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      village village0 = new village();
      player[] playerArray0 = new player[8];
      player player0 = new player();
      playerArray0[0] = player0;
      board board0 = new board();
      village0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      village village0 = new village();
      board board0 = new board();
      // Undeclared exception!
      try { 
        village0.perform_attack((player[]) null, (-590), board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.village", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      player[] playerArray0 = new player[8];
      player player0 = new player();
      playerArray0[1] = player0;
      deck deck0 = player0.player_deck;
      board board0 = new board();
      deck0.num_cards = 0;
      board0.buy_curse(player0, board0);
      village village0 = new village();
      village0.perform_attack(playerArray0, 1, board0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      village village0 = new village();
      village0.description();
  }
}
