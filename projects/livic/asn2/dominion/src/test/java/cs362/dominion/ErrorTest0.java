
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i1 = dominion.Randomness.nextRandomInt((-1));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i1 = dominion.Randomness.nextRandomInt((int)(byte)10);

  }

}
