/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 25 23:22:38 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.mainPlayer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class mainPlayer_ESTest extends mainPlayer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[12];
      // Undeclared exception!
      try { 
        mainPlayer.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      mainPlayer mainPlayer0 = new mainPlayer();
  }
}
