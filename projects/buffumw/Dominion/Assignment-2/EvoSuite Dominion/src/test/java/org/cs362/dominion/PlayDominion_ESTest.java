/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 05:43:44 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import org.cs362.dominion.PlayDominion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class PlayDominion_ESTest extends PlayDominion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom(448);
      PlayDominion.main();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Random.setNextRandom((-1382));
      PlayDominion.main();
      PlayDominion.main();
      PlayDominion.main();
      Random.setNextRandom((-1));
      PlayDominion.main();
      Random.setNextRandom((-492));
      PlayDominion.main();
      PlayDominion.main();
      PlayDominion.main();
      Random.setNextRandom(0);
      PlayDominion.main();
      PlayDominion.main();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlayDominion playDominion0 = new PlayDominion();
  }
}
