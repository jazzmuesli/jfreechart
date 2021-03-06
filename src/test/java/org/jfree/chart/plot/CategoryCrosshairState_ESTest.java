/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:17:39 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.PlotOrientation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CategoryCrosshairState_ESTest extends CategoryCrosshairState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      categoryCrosshairState0.setRowKey(plotOrientation0);
      Comparable comparable0 = categoryCrosshairState0.getRowKey();
      assertEquals(PlotOrientation.HORIZONTAL, comparable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      categoryCrosshairState0.setColumnKey(plotOrientation0);
      Comparable comparable0 = categoryCrosshairState0.getColumnKey();
      assertEquals(PlotOrientation.HORIZONTAL, comparable0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      categoryCrosshairState0.updateCrosshairX((Comparable) plotOrientation0, (Comparable) null, 0, (double) 0, plotOrientation0);
      assertEquals(0, categoryCrosshairState0.getDatasetIndex());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      categoryCrosshairState0.updateCrosshairPoint((Comparable) null, (Comparable) null, (double) 0, 0, (double) 0, (double) 0, plotOrientation0);
      assertEquals(0.0, categoryCrosshairState0.getCrosshairY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      Comparable comparable0 = categoryCrosshairState0.getRowKey();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      Comparable comparable0 = categoryCrosshairState0.getColumnKey();
      assertNull(comparable0);
  }
}
