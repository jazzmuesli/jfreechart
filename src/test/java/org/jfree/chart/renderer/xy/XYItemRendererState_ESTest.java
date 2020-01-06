/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:36:30 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYItemRendererState_ESTest extends XYItemRendererState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      xYItemRendererState0.startSeriesPass(xYDataset0, 2064, 2064, (-1129), (-770), (-770));
      int int0 = xYItemRendererState0.getLastItemIndex();
      assertEquals(2064, xYItemRendererState0.getFirstItemIndex());
      assertEquals((-1129), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      xYItemRendererState0.startSeriesPass(xYDataset0, 2064, 2064, (-1129), (-770), (-770));
      int int0 = xYItemRendererState0.getFirstItemIndex();
      assertEquals((-1129), xYItemRendererState0.getLastItemIndex());
      assertEquals(2064, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      xYItemRendererState0.startSeriesPass(xYDataset0, (-1693), (-1693), (-1693), (-1693), 0);
      int int0 = xYItemRendererState0.getFirstItemIndex();
      assertEquals((-1693), xYItemRendererState0.getLastItemIndex());
      assertEquals((-1693), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      xYItemRendererState0.endSeriesPass(xYDataset0, 1, (-1693), 3334, 0, 3334);
      assertTrue(xYItemRendererState0.getProcessVisibleItemsOnly());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      int int0 = xYItemRendererState0.getFirstItemIndex();
      assertEquals(0, int0);
      assertTrue(xYItemRendererState0.getProcessVisibleItemsOnly());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      xYItemRendererState0.startSeriesPass(xYDataset0, 0, (-3611), 1493, 0, 1493);
      int int0 = xYItemRendererState0.getLastItemIndex();
      assertEquals((-3611), xYItemRendererState0.getFirstItemIndex());
      assertEquals(1493, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      boolean boolean0 = xYItemRendererState0.getProcessVisibleItemsOnly();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      assertTrue(xYItemRendererState0.getProcessVisibleItemsOnly());
      
      xYItemRendererState0.setProcessVisibleItemsOnly(false);
      boolean boolean0 = xYItemRendererState0.getProcessVisibleItemsOnly();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      int int0 = xYItemRendererState0.getLastItemIndex();
      assertEquals(0, int0);
      assertTrue(xYItemRendererState0.getProcessVisibleItemsOnly());
  }
}
