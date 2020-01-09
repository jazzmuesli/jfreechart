/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:34:03 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.xy.XYIntervalDataItem;
import org.jfree.data.xy.XYIntervalSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XYIntervalSeries_ESTest extends XYIntervalSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, false, false);
      xYIntervalSeries0.add((double) (-5136), 856.472098722414, (double) 0, (double) 325, 856.472098722414, (double) 325);
      double double0 = xYIntervalSeries0.getYValue(0);
      assertEquals(325.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      xYIntervalSeries0.add((-24.894264026455126), (-1.0), 470.401750777777, (double) (-763), (-1.0), 31.572747262580485);
      double double0 = xYIntervalSeries0.getYValue(0);
      assertEquals((-763.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      xYIntervalSeries0.add((-24.894264026455126), (-704.39152717849), 470.401750777777, (double) (-763), 528.427278, 0.0);
      double double0 = xYIntervalSeries0.getYLowValue(0);
      assertEquals(528.427278, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      xYIntervalSeries0.add((-24.894264026455126), (-1.0), 470.401750777777, (double) (-763), (-1.0), 31.572747262580485);
      double double0 = xYIntervalSeries0.getYLowValue(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      xYIntervalSeries0.add((-1.0), (-704.391527178), 470.401750777777, (double) (-763), 528.427278, 0.0);
      double double0 = xYIntervalSeries0.getYHighValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0);
      xYIntervalSeries0.add((double) 0, 0.0, (-184.82), (-184.82), (-62.3725290313055), 1196.940287);
      double double0 = xYIntervalSeries0.getYHighValue(0);
      assertEquals(1196.940287, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0);
      xYIntervalSeries0.add((double) 0, 0.0, (-184.82), (-184.82), (-62.3725290313055), 1196.940287);
      double double0 = xYIntervalSeries0.getXLowValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      xYIntervalSeries0.add((-24.894264026455126), (-1.0), 470.401750777777, (double) (-763), (-1.0), 31.572747262580485);
      double double0 = xYIntervalSeries0.getXHighValue(0);
      assertEquals(470.401750777777, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, false, false);
      xYIntervalSeries0.add((double) (-5136), 856.472098722414, (double) 0, (double) 325, 856.472098722414, (double) 325);
      Number number0 = xYIntervalSeries0.getX(0);
      assertEquals((-5136.0), number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getYValue(1009);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1009, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, true, true);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getYLowValue((-5136));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, false, false);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getYHighValue((-5136));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparable<XYIntervalDataItem> comparable0 = (Comparable<XYIntervalDataItem>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, true, true);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getXLowValue(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, true, true);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getXHighValue((-5136));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries("", false, true);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getX((-196));
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
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, true, true);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getDataItem((-38));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparable<XYIntervalDataItem> comparable0 = (Comparable<XYIntervalDataItem>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, true, true);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.add((XYIntervalDataItem) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      XYIntervalDataItem xYIntervalDataItem0 = mock(XYIntervalDataItem.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYIntervalDataItem0).compareTo(any());
      xYIntervalSeries0.add(xYIntervalDataItem0, false);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.add((-1.0), (-704.39152717849), 470.401750777777, (double) (-942), 528.427278, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = null;
      try {
        xYIntervalSeries0 = new XYIntervalSeries((Comparable) null, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = null;
      try {
        xYIntervalSeries0 = new XYIntervalSeries((Comparable) null);
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
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getDataItem(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getYHighValue(24);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 24, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getXHighValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      xYIntervalSeries0.add((-24.894264026455126), (-1.0), 470.401750777777, (double) (-763), (-1.0), 31.572747262580485);
      xYIntervalSeries0.add(3706.386442648809, 0.0, (double) (-1277), 4403.747673743186, 3706.386442648809, Double.NEGATIVE_INFINITY);
      double double0 = xYIntervalSeries0.getXHighValue(1);
      assertEquals((-1277.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(".$5YMA#Ez4Gn&Qd(");
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getYLowValue(0);
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
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0, true, true);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getXLowValue((-5136));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getYValue((-1381));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(comparable0);
      // Undeclared exception!
      try { 
        xYIntervalSeries0.getX(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}