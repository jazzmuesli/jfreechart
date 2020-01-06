/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:17:38 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.ui.GradientPaintTransformType;
import org.jfree.chart.ui.GradientPaintTransformer;
import org.jfree.chart.ui.StandardGradientPaintTransformer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.Second;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYSplineRenderer_ESTest extends XYSplineRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(41);
      XYSplineRenderer xYSplineRenderer1 = new XYSplineRenderer(3);
      boolean boolean0 = xYSplineRenderer0.equals(xYSplineRenderer1);
      assertFalse(boolean0);
      assertEquals(3, xYSplineRenderer1.getPrecision());
      assertFalse(xYSplineRenderer1.equals((Object)xYSplineRenderer0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYSplineRenderer.FillType xYSplineRenderer_FillType0 = XYSplineRenderer.FillType.TO_ZERO;
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(623, xYSplineRenderer_FillType0);
      // Undeclared exception!
      try { 
        xYSplineRenderer0.setPrecision((-291));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires p > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYSplineRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYSplineRenderer.XYSplineState xYSplineRenderer_XYSplineState0 = new XYSplineRenderer.XYSplineState((PlotRenderingInfo) null);
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      Second second0 = new Second();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3983, "}.&,jsRgA:w;\"n@#");
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(3983, 3983, second0, simpleTimeZone0);
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      Rectangle rectangle0 = new Rectangle(59, (-2173), (-1244), (-2173));
      // Undeclared exception!
      try { 
        xYSplineRenderer0.drawPrimaryLineAsPath(xYSplineRenderer_XYSplineState0, (Graphics2D) null, (XYPlot) null, dynamicTimeSeriesCollection0, (-1243), 0, 30, periodAxis0, periodAxis0, rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYSplineRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYSplineRenderer.XYSplineState xYSplineRenderer_XYSplineState0 = new XYSplineRenderer.XYSplineState((PlotRenderingInfo) null);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0L);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2323, 572, (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      // Undeclared exception!
      try { 
        xYSplineRenderer0.drawPrimaryLineAsPath(xYSplineRenderer_XYSplineState0, graphics2D0, combinedRangeXYPlot0, histogramDataset0, 53, 2926, 2323, cyclicNumberAxis0, cyclicNumberAxis0, rectangle2D_Double0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2926, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      DefaultXYItemRenderer defaultXYItemRenderer0 = new DefaultXYItemRenderer();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0L);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2323, 572, (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      XYItemRendererState xYItemRendererState0 = defaultXYItemRenderer0.initialise(graphics2D0, rectangle2D_Double0, combinedRangeXYPlot0, histogramDataset0, (PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        xYSplineRenderer0.drawPrimaryLineAsPath(xYItemRendererState0, graphics2D0, combinedRangeXYPlot0, histogramDataset0, 53, 2926, 2323, cyclicNumberAxis0, cyclicNumberAxis0, rectangle2D_Double0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State cannot be cast to org.jfree.chart.renderer.xy.XYSplineRenderer$XYSplineState
         //
         verifyException("org.jfree.chart.renderer.xy.XYSplineRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYSplineRenderer.XYSplineState xYSplineRenderer_XYSplineState0 = new XYSplineRenderer.XYSplineState((PlotRenderingInfo) null);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0L);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2323, 563, (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      // Undeclared exception!
      try { 
        xYSplineRenderer0.drawPrimaryLineAsPath(xYSplineRenderer_XYSplineState0, graphics2D0, combinedRangeXYPlot0, histogramDataset0, 5, (-1), 140, cyclicNumberAxis0, cyclicNumberAxis0, rectangle2D_Double0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = null;
      try {
        xYSplineRenderer0 = new XYSplineRenderer(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires precision > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYSplineRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYSplineRenderer.FillType xYSplineRenderer_FillType0 = XYSplineRenderer.FillType.TO_ZERO;
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(46, xYSplineRenderer_FillType0);
      XYSplineRenderer xYSplineRenderer1 = (XYSplineRenderer)xYSplineRenderer0.clone();
      assertTrue(xYSplineRenderer1.equals((Object)xYSplineRenderer0));
      
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.CENTER_VERTICAL;
      StandardGradientPaintTransformer standardGradientPaintTransformer0 = new StandardGradientPaintTransformer(gradientPaintTransformType0);
      xYSplineRenderer1.setGradientPaintTransformer(standardGradientPaintTransformer0);
      boolean boolean0 = xYSplineRenderer0.equals(xYSplineRenderer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYSplineRenderer.FillType xYSplineRenderer_FillType0 = XYSplineRenderer.FillType.TO_LOWER_BOUND;
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(5, xYSplineRenderer_FillType0);
      XYSplineRenderer xYSplineRenderer1 = new XYSplineRenderer();
      boolean boolean0 = xYSplineRenderer0.equals(xYSplineRenderer1);
      assertFalse(boolean0);
      assertEquals(5, xYSplineRenderer1.getPrecision());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYSplineRenderer.FillType xYSplineRenderer_FillType0 = XYSplineRenderer.FillType.TO_ZERO;
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(46, xYSplineRenderer_FillType0);
      XYSplineRenderer xYSplineRenderer1 = (XYSplineRenderer)xYSplineRenderer0.clone();
      boolean boolean0 = xYSplineRenderer0.equals(xYSplineRenderer1);
      assertTrue(boolean0);
      assertEquals(46, xYSplineRenderer1.getPrecision());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      XYSplineRenderer.FillType xYSplineRenderer_FillType0 = XYSplineRenderer.FillType.TO_LOWER_BOUND;
      XYSplineRenderer xYSplineRenderer1 = new XYSplineRenderer(2492, xYSplineRenderer_FillType0);
      boolean boolean0 = xYSplineRenderer0.equals(xYSplineRenderer1);
      assertEquals(2492, xYSplineRenderer1.getPrecision());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      boolean boolean0 = xYSplineRenderer0.equals(xYSplineRenderer0);
      assertTrue(boolean0);
      assertEquals(5, xYSplineRenderer0.getPrecision());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      XYSplineRenderer.XYSplineState xYSplineRenderer_XYSplineState0 = new XYSplineRenderer.XYSplineState((PlotRenderingInfo) null);
      boolean boolean0 = xYSplineRenderer0.equals(xYSplineRenderer_XYSplineState0);
      assertEquals(5, xYSplineRenderer0.getPrecision());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      // Undeclared exception!
      try { 
        xYSplineRenderer0.setPrecision(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires p > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYSplineRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(893);
      xYSplineRenderer0.setPrecision(891);
      assertEquals(891, xYSplineRenderer0.getPrecision());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYSplineRenderer.FillType xYSplineRenderer_FillType0 = XYSplineRenderer.FillType.TO_UPPER_BOUND;
      XYSplineRenderer xYSplineRenderer0 = null;
      try {
        xYSplineRenderer0 = new XYSplineRenderer((-108), xYSplineRenderer_FillType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires precision > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYSplineRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      LogAxis logAxis0 = new LogAxis();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logAxis0);
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      xYSplineRenderer0.initialise((Graphics2D) null, rectangle0, combinedRangeXYPlot0, vectorSeriesCollection0, plotRenderingInfo0);
      assertTrue(xYSplineRenderer0.getDrawSeriesLineAsPath());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(893);
      xYSplineRenderer0.setGradientPaintTransformer((GradientPaintTransformer) null);
      xYSplineRenderer0.getGradientPaintTransformer();
      assertEquals(893, xYSplineRenderer0.getPrecision());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(893);
      xYSplineRenderer0.getGradientPaintTransformer();
      assertEquals(893, xYSplineRenderer0.getPrecision());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(893);
      xYSplineRenderer0.getFillType();
      assertEquals(893, xYSplineRenderer0.getPrecision());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer(893);
      int int0 = xYSplineRenderer0.getPrecision();
      assertEquals(893, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      XYSplineRenderer.FillType xYSplineRenderer_FillType0 = XYSplineRenderer.FillType.TO_ZERO;
      xYSplineRenderer0.setFillType(xYSplineRenderer_FillType0);
      assertEquals(5, xYSplineRenderer0.getPrecision());
  }
}
