/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:07:22 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator;
import org.jfree.chart.labels.IntervalXYToolTipGenerator;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.HighLowRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.urls.CustomXYURLGenerator;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.time.DateRange;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XYStepAreaRenderer_ESTest extends XYStepAreaRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      GeneralPath generalPath0 = new GeneralPath(xYStepAreaRenderer0.DEFAULT_SHAPE);
      Rectangle rectangle0 = generalPath0.getBounds();
      double double0 = XYStepAreaRenderer.restrictValueToDataArea(10, combinedDomainXYPlot0, rectangle0);
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertEquals(3.0, double0, 0.01);
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      XYStepAreaRenderer xYStepAreaRenderer1 = (XYStepAreaRenderer)xYStepAreaRenderer0.clone();
      assertEquals(1.0, xYStepAreaRenderer1.getStepPoint(), 0.01);
      
      xYStepAreaRenderer1.setStepPoint(0);
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      xYStepAreaRenderer0.setStepPoint(1);
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      xYStepAreaRenderer0.setShapesFilled(true);
      boolean boolean0 = xYStepAreaRenderer0.isShapesFilled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      assertFalse(xYStepAreaRenderer0.isOutline());
      
      xYStepAreaRenderer0.setOutline(true);
      boolean boolean0 = xYStepAreaRenderer0.isOutline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3);
      boolean boolean0 = xYStepAreaRenderer0.getShapesVisible();
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertTrue(boolean0);
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3);
      xYStepAreaRenderer0.setRangeBase(1.0);
      double double0 = xYStepAreaRenderer0.getRangeBase();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-1));
      xYStepAreaRenderer0.setRangeBase((-1));
      double double0 = xYStepAreaRenderer0.getRangeBase();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      boolean boolean0 = xYStepAreaRenderer0.getPlotArea();
      assertTrue(boolean0);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      Vector<String> vector0 = new Vector<String>();
      JTable jTable0 = new JTable(vector0, vector0);
      Rectangle rectangle0 = jTable0.getCellRect((-2091), 2, false);
      // Undeclared exception!
      try { 
        XYStepAreaRenderer.restrictValueToDataArea((double) xYStepAreaRenderer0.ZERO, (XYPlot) null, rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepAreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(103);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.01, 817.345010640419, 1, 1);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.chart.util.Args");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logarithmicAxis0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = xYStepAreaRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedRangeXYPlot0, (XYDataset) null, plotRenderingInfo0);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D_Double0, plotRenderingInfo0, combinedDomainXYPlot0, logarithmicAxis0, logarithmicAxis0, (XYDataset) null, 10, 429, categoryCrosshairState0, 500);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepAreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3);
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("", dateRange0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(moduloAxis0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(4.0, (double) xYStepAreaRenderer0.ZERO, 0.0, 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      CrosshairState crosshairState0 = new CrosshairState(false);
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D0, plotRenderingInfo0, combinedRangeXYPlot0, moduloAxis0, moduloAxis0, defaultTableXYDataset0, 10, 3, crosshairState0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index outside valid range.
         //
         verifyException("org.jfree.data.xy.DefaultTableXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-3058));
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultBoxAndWhiskerCategoryDataset0, tableOrder0, (-3058));
      RingPlot ringPlot0 = new RingPlot(categoryToPieDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(ringPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1912, 1912);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      HighLowRenderer highLowRenderer0 = new HighLowRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-711.7), 10, 1.0E-5, 3);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      XYItemRendererState xYItemRendererState0 = highLowRenderer0.initialise(graphics2D0, rectangle2D_Double0, combinedRangeXYPlot0, timeTableXYDataset0, plotRenderingInfo0);
      LogAxis logAxis0 = new LogAxis("BSAC?YcTwhD]eD6|");
      CrosshairState crosshairState0 = new CrosshairState();
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D_Double0, plotRenderingInfo0, combinedRangeXYPlot0, logAxis0, logAxis0, timeTableXYDataset0, 10, (-475), crosshairState0, 953);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3, (XYToolTipGenerator) null, standardXYURLGenerator0);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertTrue(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(1, 1);
      Locale locale0 = new Locale("8a1`rZiDOuirfMG");
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      IntervalXYToolTipGenerator intervalXYToolTipGenerator0 = new IntervalXYToolTipGenerator("wr)x}Y8IN", dateFormat0, numberFormat0);
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(1, intervalXYToolTipGenerator0, customXYURLGenerator0);
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(xYStepAreaRenderer0.getShapesVisible());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator();
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(2, standardXYZToolTipGenerator0, customXYURLGenerator0);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      double double0 = XYStepAreaRenderer.restrictValueToDataArea(10, combinedDomainXYPlot0, rectangle2D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3);
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("", dateRange0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(moduloAxis0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(4.0, (double) xYStepAreaRenderer0.ZERO, 0.0, 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      rectangle2D0.setRect((-267.9443206), (double) 500, 1262.88233, 4953.164258344394);
      double double0 = XYStepAreaRenderer.restrictValueToDataArea(0.0, combinedRangeXYPlot0, rectangle2D0);
      assertEquals(500.0, double0, 0.01);
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(xYStepAreaRenderer0.getShapesVisible());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3);
      DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("", dateRange0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(moduloAxis0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(4.0, (double) xYStepAreaRenderer0.ZERO, 0.0, 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      double double0 = XYStepAreaRenderer.restrictValueToDataArea(0.0, combinedRangeXYPlot0, rectangle2D0);
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertTrue(xYStepAreaRenderer0.getShapesVisible());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      Object object0 = xYStepAreaRenderer0.clone();
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      
      xYStepAreaRenderer0.setStepPoint(0);
      boolean boolean0 = xYStepAreaRenderer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-1));
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      xYStepAreaRenderer0.setRangeBase((-165.274));
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Locale locale0 = Locale.GERMAN;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      BoxAndWhiskerXYToolTipGenerator boxAndWhiskerXYToolTipGenerator0 = new BoxAndWhiskerXYToolTipGenerator("+CfNQ4i%r0}4GQ6", mockSimpleDateFormat0, numberFormat0);
      XYStepAreaRenderer xYStepAreaRenderer1 = new XYStepAreaRenderer((byte) (-29), boxAndWhiskerXYToolTipGenerator0, standardXYURLGenerator0);
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertEquals((-165.274), xYStepAreaRenderer0.getRangeBase(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-1));
      XYStepAreaRenderer xYStepAreaRenderer1 = new XYStepAreaRenderer();
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertFalse(xYStepAreaRenderer0.getPlotArea());
      assertFalse(boolean0);
      assertEquals(1.0, xYStepAreaRenderer1.getStepPoint(), 0.01);
      assertFalse(xYStepAreaRenderer1.isOutline());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer1.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      XYStepAreaRenderer xYStepAreaRenderer1 = (XYStepAreaRenderer)xYStepAreaRenderer0.clone();
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer1);
      assertEquals(1.0, xYStepAreaRenderer1.getStepPoint(), 0.01);
      assertFalse(xYStepAreaRenderer1.getPlotArea());
      assertFalse(xYStepAreaRenderer1.isOutline());
      assertTrue(boolean0);
      assertFalse(xYStepAreaRenderer1.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-1));
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer0);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(boolean0);
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertFalse(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      boolean boolean0 = xYStepAreaRenderer0.equals(xYStepAreaRenderer0.SHAPES);
      assertFalse(xYStepAreaRenderer0.getPlotArea());
      assertFalse(boolean0);
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.setStepPoint(3033);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires stepPoint in [0.0;1.0]
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepAreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      
      xYStepAreaRenderer0.setStepPoint(0);
      double double0 = xYStepAreaRenderer0.getStepPoint();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(2143925855);
      // Undeclared exception!
      try { 
        xYStepAreaRenderer0.setStepPoint((-2828.9697568467));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires stepPoint in [0.0;1.0]
         //
         verifyException("org.jfree.chart.renderer.xy.XYStepAreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      boolean boolean0 = xYStepAreaRenderer0.getPlotArea();
      assertFalse(boolean0);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      
      xYStepAreaRenderer0.setPlotArea(false);
      assertFalse(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      Object object0 = xYStepAreaRenderer0.clone();
      xYStepAreaRenderer0.setShapesFilled(true);
      boolean boolean0 = xYStepAreaRenderer0.equals(object0);
      assertTrue(xYStepAreaRenderer0.isShapesFilled());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      double double0 = xYStepAreaRenderer0.getStepPoint();
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      boolean boolean0 = xYStepAreaRenderer0.isOutline();
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(boolean0);
      assertFalse(xYStepAreaRenderer0.getPlotArea());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      xYStepAreaRenderer0.isShapesFilled();
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertTrue(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-1));
      boolean boolean0 = xYStepAreaRenderer0.getShapesVisible();
      assertFalse(xYStepAreaRenderer0.getPlotArea());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(3);
      assertTrue(xYStepAreaRenderer0.getShapesVisible());
      
      xYStepAreaRenderer0.setShapesVisible(false);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(0);
      double double0 = xYStepAreaRenderer0.getRangeBase();
      assertEquals(1.0, xYStepAreaRenderer0.getStepPoint(), 0.01);
      assertFalse(xYStepAreaRenderer0.getShapesVisible());
      assertFalse(xYStepAreaRenderer0.isOutline());
      assertFalse(xYStepAreaRenderer0.getPlotArea());
      assertEquals(0.0, double0, 0.01);
  }
}
