/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:04:30 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      CategoryAxis categoryAxis0 = new CategoryAxis(" `el[{r5[vN#Ei");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      PeriodAxis periodAxis0 = new PeriodAxis(" `el[{r5[vN#Ei");
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, periodAxis0, defaultBoxAndWhiskerCategoryDataset0, 10, 270, 500);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke((Stroke) null);
      Stroke stroke0 = statisticalBarRenderer0.getErrorIndicatorStroke();
      assertNull(stroke0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint((Paint) null);
      Paint paint0 = statisticalBarRenderer0.getErrorIndicatorPaint();
      assertNull(paint0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset((CategoryDataset) null, 0, 0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.findRangeBounds((CategoryDataset) slidingCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.SlidingCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      double[][] doubleArray0 = new double[8][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[5] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("1hv");
      LogAxis logAxis0 = new LogAxis("1hv");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, (CategoryItemRendererState) null, (Rectangle2D) null, combinedRangeCategoryPlot0, extendedCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 10, 2958465, 2958465);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT, categoryPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(32, 389);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState((PlotRenderingInfo) null);
      Object[][] objectArray0 = new Object[4][0];
      Object object0 = new Object();
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = object0;
      objectArray1[1] = (Object) bufferedImage0;
      JTable jTable0 = new JTable(objectArray0, objectArray1);
      Rectangle rectangle0 = jTable0.getCellRect(0, 856, true);
      Rectangle2D rectangle2D0 = categoryPlot0.DEFAULT_INSETS.createOutsetRectangle((Rectangle2D) rectangle0, false, false);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = statisticalBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, 10);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(graphics2D0, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 496, (-2373), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: 0
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Number[][] numberArray0 = new Number[0][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      DateAxis dateAxis0 = new DateAxis();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(500, 1.0E-8, 3.0, 5258.7113);
      CategoryAxis categoryAxis0 = new CategoryAxis("%>PKVw9QhF/q");
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D_Double0, (CategoryPlot) null, categoryAxis0, dateAxis0, defaultIntervalCategoryDataset0, 500, 5259, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(921.75056, 921.75056);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 6.0F, 960.50165F, 0.5F);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("cIs>;F");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(graphics2D0, categoryItemRendererState0, rectangle2D0, (CategoryPlot) null, extendedCategoryAxis0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, 1409, 1756, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((double) statisticalBarRenderer0.ZERO, 0.0, 2645.276515126, 945.419737885);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedDomainCategoryPlot0, (-3261), plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, 500, 0, (-2657));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -2657
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DateAxis dateAxis0 = new DateAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(taskSeriesCollection0, categoryAxis0, dateAxis0, statisticalBarRenderer0);
      Stroke stroke0 = categoryPlot0.getRangeZeroBaselineStroke();
      statisticalBarRenderer0.setErrorIndicatorStroke(stroke0);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      MeterPlot meterPlot0 = new MeterPlot();
      Paint paint0 = meterPlot0.getNeedlePaint();
      statisticalBarRenderer0.setErrorIndicatorPaint(paint0);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
      boolean boolean0 = statisticalBarRenderer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.jfree.chart.renderer.category.StatisticalBarRenderer";
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.renderer.category.StatisticalBarRenderer", stringArray0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(symbolAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("", combinedDomainXYPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.04, 3.0, 154.98, 1.0F);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(symbolAxis0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise(graphics2D0, rectangle2D_Double0, combinedRangeCategoryPlot0, 10, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      statisticalBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, categoryAxis0, symbolAxis0, (CategoryDataset) null, 15, 500, (-186));
      assertEquals(2.0F, symbolAxis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.jfree.chart.renderer.category.StatisticalBarRenderer";
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.renderer.category.StatisticalBarRenderer", stringArray0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(symbolAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("", combinedDomainXYPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.04, 3.0, 154.98, 1.0F);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(symbolAxis0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, categoryAxis0, symbolAxis0, (CategoryDataset) null, 0, (-186), (-1860));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Range range0 = statisticalBarRenderer0.findRangeBounds((CategoryDataset) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getBlue());
  }
}
