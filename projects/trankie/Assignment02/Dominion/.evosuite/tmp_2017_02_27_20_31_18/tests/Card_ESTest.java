/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:44:52 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.testcase.execution.CodeUnderTestException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.getCard(stack0, card_CardName0);
      stack0.add((Card) null);
      // Undeclared exception!
      try { 
        Card.getCard(stack0, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.addAllCards();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.addAllCards();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      List<Card> list1 = Card.cmp(list0, 0);
      List<Card> list2 = Card.cmp(list1, 0);
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card.getCard(list2, card_CardName0);
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card.filter(list0, card_Type0);
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      vector0.add((Card) null);
      Card.Type card_Type0 = Card.Type.VICTORY;
      // Undeclared exception!
      try { 
        Card.filter(vector0, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Market;
      Card.getCard(linkedList0, card_CardName0);
      linkedList0.add((Card) null);
      Card.addAllCards();
      List<Card> list0 = Card.addAllCards();
      Card.CardName card_CardName1 = Card.CardName.Laboratory;
      Card.getCard(list0, card_CardName1);
      linkedList0.add((Card) null);
      Card.addAllCards();
      // Undeclared exception!
      try { 
        Card.cmp(linkedList0, 2888);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.addAllCards();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.addAllCards();
      Card.CardName.values();
      List<Card> list1 = Card.createCards();
      List<Card> list2 = Card.addAllCards();
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.filter(list0, card_Type0);
      Card.Type.values();
      Card.Type card_Type1 = Card.Type.VICTORY;
      List<Card> list3 = Card.filter(list1, card_Type1);
      Card.cmp(list1, 1593);
      Card.Type card_Type2 = Card.Type.ACTION;
      Card.filter(list1, card_Type2);
      Card.filter(list3, card_Type2);
      Random.setNextRandom(917);
      Card.CardName card_CardName0 = Card.CardName.Laboratory;
      Card.getCard(list2, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.addAllCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.addAllCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.addAllCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.getCard(list0, card_CardName0);
      Card.cmp(list0, (-1902));
  }
}