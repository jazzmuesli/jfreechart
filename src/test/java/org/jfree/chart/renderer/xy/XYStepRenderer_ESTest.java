/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:30:46 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYAreaRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.time.DateRange;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XYStepRenderer_ESTest extends XYStepRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      assertEquals(1.0, xYStepRenderer0.getStepPoint(), 0.01);
      
      xYStepRenderer0.setStepPoint((double) xYStepRenderer0.ZERO);
      XYStepRenderer xYStepRenderer1 = new XYStepRenderer();
      boolean boolean0 = xYStepRenderer1.equals(xYStepRenderer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      xYStepRenderer0.setStepPoint(1.0);
      assertFalse(xYStepRenderer0.getDefaultShapesVisible());
      assertEquals(1.0, xYStepRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      assertEquals(1.0, xYStepRenderer0.getStepPoint(), 0.01);
      
      xYStepRenderer0.setStepPoint(0.0);
      double double0 = xYStepRenderer0.getStepPoint();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      Boolean boolean0 = new Boolean(true);
      xYStepRenderer0.setSeriesShapesFilled(2666, boolean0);
      Object object0 = xYStepRenderer0.clone();
      // Undeclared exception!
      xYStepRenderer0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer(true, true);
      // Undeclared exception!
      try { 
        xYStepRenderer0.equals(xYLineAndShapeRenderer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.renderer.xy.XYLineAndShapeRenderer cannot be cast to org.jfree.chart.renderer.xy.XYStepRenderer
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator();
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer(standardXYToolTipGenerator0, (XYURLGenerator) null);
      RingPlot ringPlot0 = new RingPlot((PieDataset) null);
      JFreeChart jFreeChart0 = new JFreeChart("{0}: ({1}, {2})", xYStepRenderer0.DEFAULT_VALUE_LABEL_FONT, ringPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 3742.827, 90.0, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      DateAxis dateAxis0 = new DateAxis((String) null);
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, dateAxis0, dateAxis0, xYStepRenderer0);
      XYItemRendererState xYItemRendererState0 = xYStepRenderer0.initialise(graphics2D0, rectangle2D_Float0, xYPlot0, xYSeriesCollection0, (PlotRenderingInfo) null);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      // Undeclared exception!
      try { 
        xYStepRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D_Float0, (PlotRenderingInfo) null, xYPlot0, dateAxis0, dateAxis0, xYSeriesCollection0, 10, 10, categoryCrosshairState0, 15);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle rectangle0 = new Rectangle(2145690587, 2145690587);
      XYPlot xYPlot0 = new XYPlot();
      xYStepRenderer0.setPlot(xYPlot0);
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = xYAreaRenderer0.initialise(graphics2D0, rectangle0, xYPlot0, (XYDataset) null, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3.385106670502724);
      CrosshairState crosshairState0 = new CrosshairState(false);
      // Undeclared exception!
      try { 
        xYStepRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle0, plotRenderingInfo0, xYPlot0, cyclicNumberAxis0, cyclicNumberAxis0, (XYDataset) null, (-889), 2, crosshairState0, 1250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1953, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("", dateRange0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(moduloAxis0);
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[1];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(true, oHLCDataItemArray0);
      XYBarDataset xYBarDataset0 = new XYBarDataset(defaultOHLCDataset0, 0.0);
      XYItemRendererState xYItemRendererState0 = stackedXYAreaRenderer0.initialise(graphics2D0, rectangle2D0, combinedDomainXYPlot0, xYBarDataset0, plotRenderingInfo0);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      // Undeclared exception!
      try { 
        xYStepRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D0, plotRenderingInfo0, combinedDomainXYPlot0, moduloAxis0, moduloAxis0, defaultOHLCDataset0, 15, 500, categoryCrosshairState0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 500
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator();
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer(standardXYToolTipGenerator0, (XYURLGenerator) null);
      XYStepRenderer xYStepRenderer1 = (XYStepRenderer)xYStepRenderer0.clone();
      boolean boolean0 = xYStepRenderer0.equals(xYStepRenderer1);
      assertEquals(1.0, xYStepRenderer1.getStepPoint(), 0.01);
      assertTrue(boolean0);
      assertFalse(xYStepRenderer1.getDefaultShapesVisible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator();
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer(standardXYToolTipGenerator0, (XYURLGenerator) null);
      boolean boolean0 = xYStepRenderer0.equals(xYStepRenderer0);
      assertTrue(boolean0);
      assertFalse(xYStepRenderer0.getDefaultShapesVisible());
      assertEquals(1.0, xYStepRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator();
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer(standardXYToolTipGenerator0, (XYURLGenerator) null);
      boolean boolean0 = xYStepRenderer0.equals((Object) null);
      assertFalse(xYStepRenderer0.getDefaultShapesVisible());
      assertEquals(1.0, xYStepRenderer0.getStepPoint(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(0.0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, true, true);
      Rectangle2D rectangle2D0 = xYSplineRenderer0.DEFAULT_VALUE_LABEL_FONT.getStringBounds("aWsL&vA|X)++(n9", fontRenderContext0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      TaskSeriesCollection taskSeriesCollection0 = mock(TaskSeriesCollection.class, new ViolatedAssumptionAnswer());
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = xYSplineRenderer0.initialise((Graphics2D) null, rectangle2D0, combinedDomainXYPlot0, xYTaskDataset0, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      // Undeclared exception!
      try { 
        xYStepRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D0, plotRenderingInfo0, combinedDomainXYPlot0, dateAxis0, dateAxis0, defaultTableXYDataset0, 9999, (-1616), categoryCrosshairState0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      // Undeclared exception!
      try { 
        xYStepRenderer0.setStepPoint(1769);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires stepPoint in [0.0;1.0]
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      xYStepRenderer0.setStepPoint((double) xYStepRenderer0.ZERO);
      XYStepRenderer xYStepRenderer1 = new XYStepRenderer();
      boolean boolean0 = xYStepRenderer0.equals(xYStepRenderer1);
      assertFalse(boolean0);
      assertEquals(0.0, xYStepRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("");
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer(standardXYZToolTipGenerator0, standardXYURLGenerator0);
      // Undeclared exception!
      try { 
        xYStepRenderer0.setStepPoint((-819.609745932834));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires stepPoint in [0.0;1.0]
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      xYStepRenderer0.hashCode();
      assertFalse(xYStepRenderer0.getDefaultShapesVisible());
      assertEquals(1.0, xYStepRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator();
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer(standardXYToolTipGenerator0, (XYURLGenerator) null);
      double double0 = xYStepRenderer0.getStepPoint();
      assertEquals(1.0, double0, 0.01);
      assertFalse(xYStepRenderer0.getDefaultShapesVisible());
  }
}
