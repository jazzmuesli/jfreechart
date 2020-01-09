/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:09:12 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.NumberTickUnit;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TickUnit_ESTest extends TickUnit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-820.1858));
      numberTickUnit0.hashCode();
      assertEquals((-820.1858), numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(7.748389);
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(0.0);
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit1);
      assertFalse(numberTickUnit1.equals((Object)numberTickUnit0));
      assertFalse(boolean0);
      assertEquals(0.0, numberTickUnit1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.0);
      numberTickUnit0.valueToString(0.0);
      assertEquals(0.0, numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(1);
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn(stringBuffer0).when(numberFormat0).format(anyDouble() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(5056.487, numberFormat0);
      numberTickUnit0.valueToString(250);
      assertEquals(5056.487, numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.0);
      double double0 = numberTickUnit0.getSize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(460.727954669, numberFormat0);
      double double0 = numberTickUnit0.getSize();
      assertEquals(460.727954669, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(2777.863043, numberFormat0, 4536);
      int int0 = numberTickUnit0.getMinorTickCount();
      assertEquals(4536, int0);
      assertEquals(2777.863043, numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-820.1858));
      numberTickUnit0.equals("e&12DY\t");
      assertEquals((-820.1858), numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn((StringBuffer) null).when(numberFormat0).format(anyDouble() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(5056.487, numberFormat0);
      // Undeclared exception!
      try { 
        numberTickUnit0.valueToString(250);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.NumberFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-1.0), numberFormat0, (-2647));
      double double0 = numberTickUnit0.getSize();
      assertEquals((-2647), numberTickUnit0.getMinorTickCount());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(5056.487, decimalFormat0);
      numberTickUnit0.hashCode();
      assertEquals(5056.487, numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.0);
      numberTickUnit0.hashCode();
      assertEquals(0.0, numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.0);
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(0.0);
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit1);
      assertTrue(boolean0);
      assertEquals(0.0, numberTickUnit1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-1.0));
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(0.0, numberFormat0);
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit1);
      assertFalse(numberTickUnit1.equals((Object)numberTickUnit0));
      assertFalse(boolean0);
      assertEquals(0.0, numberTickUnit1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-1.0));
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(0.0, numberFormat0);
      int int0 = numberTickUnit0.compareTo(numberTickUnit1);
      assertEquals((-1), int0);
      assertEquals(0.0, numberTickUnit1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(3.910321789242012, numberFormat0);
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(0.0, numberFormat0);
      int int0 = numberTickUnit0.compareTo(numberTickUnit1);
      assertEquals(0.0, numberTickUnit1.getSize(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-1.0));
      int int0 = numberTickUnit0.compareTo(numberTickUnit0);
      assertEquals(0, int0);
      assertEquals((-1.0), numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.SECOND;
      DateTickUnit dateTickUnit0 = new DateTickUnit(dateTickUnitType0, 852);
      int int0 = dateTickUnit0.compareTo(dateTickUnitType0);
      assertEquals(852000.0, dateTickUnit0.getSize(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.0);
      int int0 = numberTickUnit0.getMinorTickCount();
      assertEquals(0, int0);
      assertEquals(0.0, numberTickUnit0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(5056.487, decimalFormat0);
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(5056.487, decimalFormat0, 250);
      boolean boolean0 = numberTickUnit0.equals(numberTickUnit1);
      assertEquals(5056.487, numberTickUnit0.getSize(), 0.01);
      assertEquals(250, numberTickUnit1.getMinorTickCount());
      assertEquals(5056.487, numberTickUnit1.getSize(), 0.01);
      assertFalse(boolean0);
      assertFalse(numberTickUnit1.equals((Object)numberTickUnit0));
  }
}