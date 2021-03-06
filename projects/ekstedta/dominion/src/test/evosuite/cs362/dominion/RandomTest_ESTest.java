/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:56:09 GMT 2017
 */

package cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cs362.dominion.Card;
import cs362.dominion.Game;
import cs362.dominion.RandomTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomTest_ESTest extends RandomTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      // Undeclared exception!
      try { 
        RandomTest.swap((List<Card>) arrayList0, 3, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomTest randomTest0 = new RandomTest();
      // Undeclared exception!
      try { 
        RandomTest.swap((List<Object>) null, 1126, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.RandomTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomTest.printCards((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.RandomTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        RandomTest.swap((List<String>) linkedList0, 533, (-635));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 533, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerFirst("not enough coins");
      RandomTest.swap((List<String>) linkedList0, 4684, 4684);
      RandomTest randomTest0 = new RandomTest();
      // Undeclared exception!
      try { 
        RandomTest.playTreasures((Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.RandomTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RandomTest randomTest0 = new RandomTest();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int int0 = 5;
      RandomTest.swap((List<Integer>) linkedList0, 5, 5);
      int int1 = 8;
      // Undeclared exception!
      randomTest0.play(8);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Card card0 = Card.Adventurer;
      linkedList0.add((Object) card0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList1.add((Object) linkedList0);
      linkedList1.offer(linkedList0);
      linkedList0.addAll((Collection<?>) linkedList1);
      int int0 = 2479;
      // Undeclared exception!
      try { 
        RandomTest.swap((List<Object>) linkedList0, (-1), 2479);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 3
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RandomTest randomTest0 = new RandomTest();
      Game game0 = null;
      // Undeclared exception!
      try { 
        randomTest0.playAction((Game) null, 2138);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.RandomTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      RandomTest.main(stringArray0);
  }
}
