/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:15:26 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.VectorDataItem;
import org.jfree.data.xy.VectorSeries;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class VectorSeriesCollection_ESTest extends VectorSeriesCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeries(4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem(0, 0, (-1538.2455975), (-1538.2455975));
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getY(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem(0, 0, (-1538.2455975), (-1538.2455975));
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getX(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem(0, 0, (-1538.2455975), (-1538.2455975));
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      int int0 = vectorSeriesCollection0.indexOf(vectorSeries0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.removeSeries((VectorSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.indexOf((VectorSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getYValue(2332, (-1046));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2332, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getXValue((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getX((-2240), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorYValue((-925), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorXValue(0, (-3821));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem((-2341.96414549744), 2214.097471221736, (-2341.96414549744), 2864.8051327606277);
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVector(0, (-83));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.addSeries((VectorSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeries((-714));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getYValue((-427), (-427));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      int int0 = vectorSeriesCollection0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getXValue(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem(0, 0, (-1538.2455975), (-1538.2455975));
      boolean boolean0 = vectorSeriesCollection0.equals(vectorDataItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem((-439.64), (-439.64), (-439.64), (-439.64));
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      vectorSeriesCollection0.removeAllSeries();
      assertTrue(vectorSeriesCollection0.getNotify());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem(0, 0, (-1538.2455975), (-1538.2455975));
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      boolean boolean0 = vectorSeriesCollection0.removeSeries(vectorSeries0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem((-2341.96414549744), 2214.097471221736, (-2341.96414549744), 2864.8051327606277);
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0);
      boolean boolean0 = vectorSeriesCollection0.removeSeries(vectorSeries0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorXValue((-74), (-74));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem(0, 0, (-1538.2455975), (-1538.2455975));
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      int int0 = vectorSeriesCollection0.indexOf(vectorSeries0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVectorYValue(8, 32);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 8, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getVector(0, 93);
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
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem(0, 0, 0, 1.7976931348623157E308);
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, false);
      vectorSeriesCollection0.addSeries(vectorSeries0);
      VectorSeries vectorSeries1 = vectorSeriesCollection0.getSeries(0);
      assertEquals(Integer.MAX_VALUE, vectorSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getSeriesKey(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getY((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        vectorSeriesCollection0.getItemCount((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.xy.VectorSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      Object object0 = vectorSeriesCollection0.clone();
      boolean boolean0 = vectorSeriesCollection0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, vectorSeriesCollection0);
  }
}