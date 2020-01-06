/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:03:21 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.XYIntervalSeries;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYIntervalSeriesCollection_ESTest extends XYIntervalSeriesCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.removeSeries(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds.
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartY(29, 22);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.removeSeries((XYIntervalSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getYValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getY((-2476), 3683);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getX((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartYValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartY((-910), (-910));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartXValue(1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartX((-480), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndYValue((-1), 5219);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndY(2595, 2595);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2595, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndXValue(3662, (-1450));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3662, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndX(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getSeries((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getSeries(1477);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getX(4039, 869);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4039, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getYValue((-5117), (-5117));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      int int0 = xYIntervalSeriesCollection0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndYValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      Object object0 = xYIntervalSeriesCollection0.clone();
      xYIntervalSeriesCollection0.equals(object0);
      assertNotSame(object0, xYIntervalSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      boolean boolean0 = xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      boolean boolean0 = xYIntervalSeriesCollection0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      xYIntervalSeriesCollection0.removeAllSeries();
      assertTrue(xYIntervalSeriesCollection0.getNotify());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.removeSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds.
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.removeSeries((-2336));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds.
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getItemCount((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndX((-692), (-873));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getY(89, 89);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 89, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartX(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndXValue((-1124), 801);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getEndY((-2161), (-781));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getSeriesKey(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.addSeries((XYIntervalSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartXValue((-399), 1148);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getStartYValue((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        xYIntervalSeriesCollection0.getItemCount(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.XYIntervalSeriesCollection", e);
      }
  }
}
