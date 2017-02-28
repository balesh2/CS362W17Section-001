/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 06:00:16 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class randomTester_ESTest extends randomTester_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        randomTester.random_range(6, 5);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Card> arrayList0 = randomTester.random_kingdoms();
      randomTester randomTester0 = new randomTester();
      Random.setNextRandom(239);
      randomTester.random_range(228, 6);
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      randomTester0.random_players = arrayList1;
      System.setCurrentTimeMillis(239);
      randomTester0.kingdoms_in_play = arrayList0;
      randomTester randomTester1 = new randomTester();
      randomTester1.kingdoms_in_play = arrayList0;
      Player player0 = new Player(")8O");
      arrayList1.add(player0);
      randomTester1.random_players = arrayList1;
      randomTester randomTester2 = new randomTester();
      String[] stringArray0 = new String[8];
      stringArray0[0] = ")8O";
      stringArray0[1] = ")8O";
      stringArray0[2] = ")8O";
      stringArray0[3] = ")8O";
      stringArray0[4] = ")8O";
      stringArray0[5] = ")8O";
      stringArray0[6] = ")8O";
      stringArray0[7] = ")8O";
      // Undeclared exception!
      try { 
        randomTester.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      randomTester.random_range((-3530), 0);
      randomTester randomTester0 = new randomTester();
      String string0 = "\n cost:  ";
      Player player0 = new Player("\n cost:  ");
      ArrayList<Card> arrayList0 = player0.in_play;
      randomTester0.kingdoms_in_play = arrayList0;
      randomTester randomTester1 = new randomTester();
      randomTester.random_kingdoms();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "\n cost:  ";
      stringArray0[1] = "\n cost:  ";
      stringArray0[2] = "\n cost:  ";
      stringArray0[3] = "\n cost:  ";
      stringArray0[4] = "\n cost:  ";
      // Undeclared exception!
      try { 
        randomTester.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      randomTester randomTester0 = new randomTester();
      ArrayList<Card> arrayList0 = randomTester0.kingdoms_in_play;
      randomTester0.kingdoms_in_play = arrayList0;
      randomTester0.kingdoms_in_play = arrayList0;
      randomTester.random_kingdoms();
      randomTester randomTester1 = new randomTester();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      randomTester randomTester0 = new randomTester();
      int int0 = 0;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "cellar";
      stringArray0[1] = "number_of_players: ";
      // Undeclared exception!
      try { 
        randomTester.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      randomTester randomTester0 = new randomTester();
      String[] stringArray0 = null;
      randomTester.random_range(1787, (-523));
      // Undeclared exception!
      try { 
        randomTester.main((String[]) null);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      randomTester randomTester0 = new randomTester();
      ArrayList<Card> arrayList0 = randomTester0.kingdoms_in_play;
      randomTester randomTester1 = new randomTester();
      ArrayList<Card> arrayList1 = randomTester1.kingdoms_in_play;
      ArrayList<Player> arrayList2 = randomTester1.random_players;
      randomTester1.random_players = arrayList2;
      randomTester.random_range(3078, (-1));
      randomTester0.kingdoms_in_play = arrayList1;
      randomTester.random_range(0, 0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Tg@z9[G+6B";
      stringArray0[1] = "V<[ S@Y>SF0FP^`E=O~";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "province";
      stringArray0[5] = "i'|B^7lR'x2<x-bJ<";
      stringArray0[6] = " ";
      stringArray0[7] = "action";
      stringArray0[8] = "'s in_play pile:";
      // Undeclared exception!
      try { 
        randomTester.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }
}