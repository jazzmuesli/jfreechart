/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:20:35 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberTickUnit;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NumberTickUnit_ESTest extends NumberTickUnit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn(stringBuffer0).when(numberFormat0).format(anyDouble() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-1260.0450440849), numberFormat0, 0);
      String string0 = numberTickUnit0.valueToString(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(15.365651648871664);
      String string0 = numberTickUnit0.toString();
      assertEquals("[size=15.366]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn((StringBuffer) null).when(numberFormat0).format(anyDouble() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(1677.052, numberFormat0);
      // Undeclared exception!
      try { 
        numberTickUnit0.valueToString(1677.052);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.NumberFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("V,t]m");
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-897.54761831), choiceFormat0);
      // Undeclared exception!
      try { 
        numberTickUnit0.valueToString(1.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn((StringBuffer) null).when(numberFormat0).format(anyDouble() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-1.0), numberFormat0);
      // Undeclared exception!
      try { 
        numberTickUnit0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.NumberFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = null;
      try {
        numberTickUnit0 = new NumberTickUnit((-1.0), (NumberFormat) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = null;
      try {
        numberTickUnit0 = new NumberTickUnit(375.0, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(15.365651648871664);
      String string0 = numberTickUnit0.valueToString((-2476.7723));
      assertEquals("-2,476.772", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(15.365651648871664);
      numberTickUnit0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(15.365651648871664);
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(15.365651648871664);
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.0);
      boolean boolean0 = numberTickUnit0.equals("[size=0]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(15.365651648871664);
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(15.365651648871664);
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(15.365651648871664, numberFormat0, (-1787));
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-2031.814573684875));
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      NumberTickUnit numberTickUnit1 = new NumberTickUnit((-2031.814573684875), numberFormat0);
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("");
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(1.0, choiceFormat0);
      // Undeclared exception!
      try { 
        numberTickUnit0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }
}
