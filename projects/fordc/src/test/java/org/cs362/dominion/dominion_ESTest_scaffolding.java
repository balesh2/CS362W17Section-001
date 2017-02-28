/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Feb 28 05:19:08 GMT 2017
 */

package org.cs362.dominion;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class dominion_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.cs362.dominion.dominion"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init(); 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.8"); 
            java.lang.System.setProperty("java.home", "C:\\Program Files\\Java\\jdk\\jre"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Casey Ford"); 
            java.lang.System.setProperty("java.awt.headless", "true"); 
                                java.lang.System.setProperty("user.dir", "C:\\Program Files\\DOMINION\\Dominion"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\CASEYF~1\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("line.separator", "\r\n"); 
      }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(dominion_ESTest_scaffolding.class.getClassLoader() ,
      "org.cs362.dominion.mine",
      "org.cs362.dominion.great_hall",
      "org.cs362.dominion.card",
      "org.cs362.dominion.curse",
      "org.cs362.dominion.province",
      "org.cs362.dominion.ambassador",
      "org.cs362.dominion.embargo",
      "org.cs362.dominion.estate",
      "org.cs362.dominion.gold",
      "org.cs362.dominion.smithy",
      "org.cs362.dominion.feast",
      "org.cs362.dominion.council_room",
      "org.cs362.dominion.deck",
      "org.cs362.dominion.village",
      "org.cs362.dominion.discard",
      "org.cs362.dominion.silver",
      "org.cs362.dominion.copper",
      "org.cs362.dominion.hand",
      "org.cs362.dominion.duchy",
      "org.cs362.dominion.gardens",
      "org.cs362.dominion.pile",
      "org.cs362.dominion.board",
      "org.cs362.dominion.adventurer",
      "org.cs362.dominion.dominion",
      "org.cs362.dominion.salvager",
      "org.cs362.dominion.cutpurse",
      "org.cs362.dominion.player",
      "org.cs362.dominion.baron"
    );
  } 

  private static void resetClasses() {
  }
}