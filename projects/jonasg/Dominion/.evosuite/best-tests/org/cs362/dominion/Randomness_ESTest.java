/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 03:59:20 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Randomness_ESTest extends Randomness_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom(1998);
      int int0 = Randomness.nextRandomInt((-2856));
      assertEquals(1998, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt((-792));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Randomness.reset();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Randomness randomness0 = new Randomness();
      assertEquals(0L, Randomness.SEED);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = Randomness.nextRandomInt((-2856));
      assertEquals(0, int0);
  }
}