/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:46:17 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.time.Instant;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.data.time.DateRange;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XYDotRenderer_ESTest extends XYDotRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      // Undeclared exception!
      try { 
        xYDotRenderer0.setLegendShape((Shape) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("ofl6NL", spiderWebPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      XYDifferenceRenderer xYDifferenceRenderer0 = new XYDifferenceRenderer();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1411.3402F), 0.0F, 1.0F, (-1138.79F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      XYPlot xYPlot0 = new XYPlot();
      XYItemRendererState xYItemRendererState0 = xYDifferenceRenderer0.initialise(graphics2D0, rectangle2D0, xYPlot0, (XYDataset) null, (PlotRenderingInfo) null);
      CrosshairState crosshairState0 = new CrosshairState();
      // Undeclared exception!
      try { 
        xYDotRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D0, (PlotRenderingInfo) null, xYPlot0, (ValueAxis) null, (ValueAxis) null, (XYDataset) null, 15, 10, crosshairState0, 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYDotRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      Object object0 = xYDotRenderer0.clone();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0.0, (double) ((AbstractRenderer) object0).ZERO, (double) xYDotRenderer0.ZERO, (double) ((AbstractRenderer) object0).ZERO, 0.0, (double) xYDotRenderer0.ZERO, 0);
      assertTrue(object0.equals((Object)xYDotRenderer0));
      
      xYDotRenderer0.setLegendShape((Shape) arc2D_Double0);
      boolean boolean0 = xYDotRenderer0.equals(object0);
      assertFalse(object0.equals((Object)xYDotRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      XYDotRenderer xYDotRenderer1 = new XYDotRenderer();
      xYDotRenderer1.setDotHeight(3705);
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer1);
      assertEquals(3705, xYDotRenderer1.getDotHeight());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      Object object0 = xYDotRenderer0.clone();
      xYDotRenderer0.setDotWidth(4);
      boolean boolean0 = xYDotRenderer0.equals(object0);
      assertEquals(4, xYDotRenderer0.getDotWidth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer0);
      assertEquals(1, xYDotRenderer0.getDotHeight());
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      Instant instant0 = MockInstant.now();
      boolean boolean0 = xYDotRenderer0.equals(instant0);
      assertEquals(1, xYDotRenderer0.getDotHeight());
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      xYDotRenderer0.getLegendItem(1, 2188);
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertEquals(1, xYDotRenderer0.getDotHeight());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      XYPlot xYPlot0 = new XYPlot();
      xYDotRenderer0.setPlot(xYPlot0);
      xYDotRenderer0.getLegendItem(0, 1383);
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertEquals(1, xYDotRenderer0.getDotHeight());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      BufferedImage bufferedImage0 = new BufferedImage(6, 1, 1);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      XYSeries xYSeries0 = new XYSeries(0.0F, false, false);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis((String) null, dateRange0);
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, moduloAxis0, moduloAxis0, xYDotRenderer0);
      CrosshairState crosshairState0 = new CrosshairState();
      // Undeclared exception!
      try { 
        xYDotRenderer0.drawItem(graphics2D0, (XYItemRendererState) null, rectangle2D_Float0, (PlotRenderingInfo) null, xYPlot0, moduloAxis0, moduloAxis0, xYSeriesCollection0, 10, 10, crosshairState0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      // Undeclared exception!
      try { 
        xYDotRenderer0.setDotHeight(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires h > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYDotRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      // Undeclared exception!
      try { 
        xYDotRenderer0.setDotWidth(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires w > 0.
         //
         verifyException("org.jfree.chart.renderer.xy.XYDotRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      XYDotRenderer xYDotRenderer1 = (XYDotRenderer)xYDotRenderer0.clone();
      boolean boolean0 = xYDotRenderer0.equals(xYDotRenderer1);
      assertEquals(1, xYDotRenderer1.getDotWidth());
      assertEquals(1, xYDotRenderer1.getDotHeight());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      int int0 = xYDotRenderer0.getDotHeight();
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      int int0 = xYDotRenderer0.getDotWidth();
      assertEquals(1, int0);
      assertEquals(1, xYDotRenderer0.getDotHeight());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)xYDotRenderer0.getLegendShape();
      xYDotRenderer0.setLegendShape((Shape) rectangle2D_Double0);
      assertEquals(3.0, rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals(1, xYDotRenderer0.getDotWidth());
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01);
      assertEquals(1, xYDotRenderer0.getDotHeight());
  }
}
