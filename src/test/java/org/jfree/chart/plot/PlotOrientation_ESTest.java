/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:39:03 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.PlotOrientation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PlotOrientation_ESTest extends PlotOrientation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlotOrientation[] plotOrientationArray0 = PlotOrientation.values();
      assertEquals(2, plotOrientationArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.valueOf("VERTICAL");
      assertEquals(PlotOrientation.VERTICAL, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      boolean boolean0 = plotOrientation0.isVertical();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      boolean boolean0 = plotOrientation0.isHorizontal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      boolean boolean0 = plotOrientation0.isHorizontal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      boolean boolean0 = plotOrientation0.isVertical();
      assertTrue(boolean0);
  }
}
