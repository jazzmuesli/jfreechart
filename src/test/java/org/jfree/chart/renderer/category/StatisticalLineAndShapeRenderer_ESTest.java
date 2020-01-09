/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:15:48 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.text.TextFragment;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.GanttCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StatisticalLineAndShapeRenderer_ESTest extends StatisticalLineAndShapeRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0, (-2973.4678F), 0.0F, (-2937.1602F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      LogAxis logAxis0 = new LogAxis();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, subCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0, (-2973.4678F), 0.0F, (-2937.1602F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = statisticalLineAndShapeRenderer0.initialise((Graphics2D) null, rectangle2D0, combinedDomainCategoryPlot0, (-629), plotRenderingInfo0);
      LogAxis logAxis0 = new LogAxis();
      statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, subCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, (-629), 1, (-629));
      assertTrue(statisticalLineAndShapeRenderer0.getAutoPopulateSeriesShape());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-4452.0F), (-3035.77F), (-3035.77F), 3359.43F);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("qDa8[%/xbK]sI4&n ");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logarithmicAxis0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis("#9lM+JYjJ");
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Float0, combinedRangeCategoryPlot0, categoryAxis0, logarithmicAxis0, taskSeriesCollection0, 10, 1, 1630);
      assertEquals(1.0F, combinedRangeCategoryPlot0.getBackgroundAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      BasicStroke basicStroke0 = (BasicStroke)XYPlot.DEFAULT_GRIDLINE_STROKE;
      statisticalLineAndShapeRenderer0.setErrorIndicatorStroke(basicStroke0);
      BasicStroke basicStroke1 = (BasicStroke)statisticalLineAndShapeRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke1.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Color color0 = (Color)TextFragment.DEFAULT_PAINT;
      statisticalLineAndShapeRenderer0.setErrorIndicatorPaint(color0);
      Color color1 = (Color)statisticalLineAndShapeRenderer0.getErrorIndicatorPaint();
      assertEquals(0, color1.getBlue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      defaultKeyedValues2DDataset0.setValue((double) statisticalLineAndShapeRenderer0.ZERO, (Comparable) statisticalLineAndShapeRenderer0.ZERO, (Comparable) statisticalLineAndShapeRenderer0.ZERO);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultKeyedValues2DDataset0);
      assertEquals(0.0, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      double[][] doubleArray0 = new double[7][4];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1.0E-8;
      doubleArray0[6] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      assertEquals(5.0E-9, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      defaultKeyedValues2DDataset0.setValue((-1.0), (Comparable) statisticalLineAndShapeRenderer0.ZERO, (Comparable) statisticalLineAndShapeRenderer0.ZERO);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultKeyedValues2DDataset0);
      assertEquals((-1.0), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      double[][] doubleArray0 = new double[8][9];
      double[] doubleArray1 = new double[8];
      doubleArray0[1] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(extendedCategoryAxis0);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, (Rectangle2D) null, combinedDomainCategoryPlot0, extendedCategoryAxis0, (ValueAxis) null, (CategoryDataset) null, 10, (-146), 2569);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LineAndShapeRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset((GanttCategoryDataset) null, 768, 768);
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(slidingGanttCategoryDataset0, 768, 768);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.findRangeBounds(slidingCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.gantt.SlidingGanttCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer1 = new StatisticalLineAndShapeRenderer();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(statisticalLineAndShapeRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(statisticalLineAndShapeRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(xYDatasetTableModel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0, 1, 0.0F, (-2937.1602F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      LogAxis logAxis0 = new LogAxis();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D0, combinedDomainCategoryPlot0, subCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 1, 500, (-629));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = statisticalLineAndShapeRenderer0.createState(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("{0}: ({1} - {2}), ({5} - {6})");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10);
      Number[][] numberArray0 = new Number[9][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Float0, categoryPlot0, extendedCategoryAxis0, cyclicNumberAxis0, defaultIntervalCategoryDataset0, (-6), 500, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      statisticalLineAndShapeRenderer0.setErrorIndicatorPaint(defaultPolarItemRenderer0.DEFAULT_PAINT);
      assertTrue(statisticalLineAndShapeRenderer0.getAutoPopulateSeriesPaint());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      BasicStroke basicStroke0 = new BasicStroke(0.0F);
      statisticalLineAndShapeRenderer0.setErrorIndicatorStroke(basicStroke0);
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer1 = new StatisticalLineAndShapeRenderer();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(statisticalLineAndShapeRenderer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Paint paint0 = statisticalLineAndShapeRenderer0.getErrorIndicatorPaint();
      assertNull(paint0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Stroke stroke0 = statisticalLineAndShapeRenderer0.getErrorIndicatorStroke();
      assertNull(stroke0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds((CategoryDataset) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.hashCode();
  }
}