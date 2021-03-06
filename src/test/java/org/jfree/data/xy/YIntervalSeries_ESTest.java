/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:34:27 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.ComparableObjectItem;
import org.jfree.data.xy.YIntervalDataItem;
import org.jfree.data.xy.YIntervalSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YIntervalSeries_ESTest extends YIntervalSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      doReturn(0.0).when(yIntervalDataItem1).getYValue();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      double double0 = yIntervalSeries0.getYValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(comparable0);
      yIntervalSeries0.add((-2251.8200720154), (-2251.8200720154), (-2251.8200720154), 0.0);
      double double0 = yIntervalSeries0.getYValue(0);
      assertEquals((-2251.8200720154), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      doReturn((double)0).when(yIntervalDataItem1).getYLowValue();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      double double0 = yIntervalSeries0.getYLowValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      doReturn(1.0).when(yIntervalDataItem1).getYLowValue();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      double double0 = yIntervalSeries0.getYLowValue(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      doReturn(0.0).when(yIntervalDataItem1).getYLowValue();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      double double0 = yIntervalSeries0.getYLowValue(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(yIntervalDataItem1).toString();
      doReturn(1.0, 0.0).when(yIntervalDataItem1).getYHighValue();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      yIntervalSeries0.getYHighValue(0);
      double double0 = yIntervalSeries0.getYHighValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      doReturn((-1.7976931348623157E308)).when(yIntervalDataItem1).getYHighValue();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      double double0 = yIntervalSeries0.getYHighValue(0);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      doReturn((Double) null).when(yIntervalDataItem1).getX();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      Number number0 = yIntervalSeries0.getX(0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      Double double0 = new Double(1.0);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      doReturn(double0).when(yIntervalDataItem1).getX();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      Number number0 = yIntervalSeries0.getX(0);
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, false, false);
      yIntervalSeries0.add((-1.0), (-1614.790186), 557.99, (double) 0);
      Number number0 = yIntervalSeries0.getX(0);
      assertEquals((-1.0), number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(yIntervalDataItem1).toString();
      yIntervalSeries0.add(yIntervalDataItem1, true);
      ComparableObjectItem comparableObjectItem0 = yIntervalSeries0.getDataItem(0);
      assertNotNull(comparableObjectItem0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(comparable0, false, false);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYValue((-1099));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, false, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYLowValue((-2086));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYHighValue((-1269));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getX((-94));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(comparable0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getDataItem((-302));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, false, false);
      YIntervalDataItem yIntervalDataItem1 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      yIntervalSeries0.add(yIntervalDataItem1, false);
      YIntervalDataItem yIntervalDataItem2 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        yIntervalSeries0.add(yIntervalDataItem2, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.ComparableObjectSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.add((YIntervalDataItem) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(comparable0);
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(yIntervalDataItem0).compareTo(any());
      yIntervalSeries0.add(yIntervalDataItem0, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.add((-2251.8200720154), 1.0, (-2251.8200720154), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YIntervalSeries yIntervalSeries0 = null;
      try {
        yIntervalSeries0 = new YIntervalSeries((Comparable) null, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YIntervalSeries yIntervalSeries0 = null;
      try {
        yIntervalSeries0 = new YIntervalSeries((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getDataItem(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(comparable0);
      yIntervalSeries0.add((-2251.8200720154), 1.0, (-2251.8200720154), 0.0);
      double double0 = yIntervalSeries0.getYValue(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYLowValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(comparable0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = mock(YIntervalDataItem.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(yIntervalDataItem0, true, true);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getYHighValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      YIntervalSeries yIntervalSeries0 = new YIntervalSeries(comparable0);
      // Undeclared exception!
      try { 
        yIntervalSeries0.getX(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
