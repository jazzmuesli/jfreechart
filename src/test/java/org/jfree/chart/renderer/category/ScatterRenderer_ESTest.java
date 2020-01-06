/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:25:22 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.GanttCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScatterRenderer_ESTest extends ScatterRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LogAxis logAxis0 = new LogAxis("");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logAxis0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = scatterRenderer0.createState(plotRenderingInfo0);
      Number[][] numberArray0 = new Number[3][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        scatterRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, defaultCaret0, combinedRangeCategoryPlot0, (CategoryAxis) null, logAxis0, defaultIntervalCategoryDataset0, 0, 0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.category.DefaultIntervalCategoryDataset cannot be cast to org.jfree.data.statistics.MultiValueCategoryDataset
         //
         verifyException("org.jfree.chart.renderer.category.ScatterRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setItemMargin(1.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires 0.0 <= margin < 1.0.
         //
         verifyException("org.jfree.chart.renderer.category.ScatterRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      
      scatterRenderer0.setUseOutlinePaint(true);
      boolean boolean0 = scatterRenderer0.getUseOutlinePaint();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      assertFalse(scatterRenderer0.getUseFillPaint());
      
      scatterRenderer0.setUseFillPaint(true);
      boolean boolean0 = scatterRenderer0.getUseFillPaint();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesShapesFilled(779, false);
      boolean boolean0 = scatterRenderer0.getItemShapeFilled(779, 779);
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(boolean0);
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      assertFalse(scatterRenderer0.getDrawOutlines());
      
      scatterRenderer0.setDrawOutlines(true);
      boolean boolean0 = scatterRenderer0.getDrawOutlines();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      
      scatterRenderer0.setBaseShapesFilled(false);
      boolean boolean0 = scatterRenderer0.getBaseShapesFilled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Number[][] numberArray0 = new Number[1][4];
      Number[] numberArray1 = new Number[3];
      numberArray1[0] = (Number) scatterRenderer0.ZERO;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      scatterRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3738.41285;
      double[][] doubleArray1 = new double[7][5];
      doubleArray1[0] = doubleArray0;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray1, doubleArray1);
      scatterRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      defaultCategoryDataset0.addValue((-1194.0420584314), (Comparable) scatterRenderer0.ZERO, (Comparable) scatterRenderer0.ZERO);
      scatterRenderer0.findRangeBounds(defaultCategoryDataset0);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesShapesFilled((-2436), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesShapesFilled((-2288), (Boolean) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset((GanttCategoryDataset) null, 0, 1654);
      // Undeclared exception!
      try { 
        scatterRenderer0.findRangeBounds(slidingGanttCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.gantt.SlidingGanttCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      double[][] doubleArray0 = new double[9][1];
      double[] doubleArray1 = new double[9];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        scatterRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, (Border) null, 21, (-700), (-1887), 21);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      LogAxis logAxis0 = new LogAxis();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        scatterRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle0, categoryPlot0, (CategoryAxis) null, logAxis0, taskSeriesCollection0, (-1887), (-1), 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.ScatterRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getSeriesShapesFilled((-1));
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertTrue(boolean0);
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      scatterRenderer0.findRangeBounds(defaultStatisticalCategoryDataset0);
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseFillPaint());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.equals((Object) null);
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(boolean0);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.equals(scatterRenderer0);
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertTrue(boolean0);
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertTrue(scatterRenderer0.getBaseShapesFilled());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.getLegendItem(0, 2439);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Dimension dimension0 = new Dimension(5, 5);
      Rectangle rectangle0 = new Rectangle(dimension0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = new CategoryAxis("OUTSIDE1");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-274.1135750075575), "OUTSIDE1");
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        scatterRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle0, combinedDomainCategoryPlot0, categoryAxis0, cyclicNumberAxis0, defaultKeyedValues2DDataset0, 500, 5, 5);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.general.DefaultKeyedValues2DDataset cannot be cast to org.jfree.data.statistics.MultiValueCategoryDataset
         //
         verifyException("org.jfree.chart.renderer.category.ScatterRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1261.9612051324), 1716.0, 0.2, (double) scatterRenderer0.ZERO);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LogAxis logAxis0 = new LogAxis("");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logAxis0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedRangeCategoryPlot0, 0, plotRenderingInfo0);
      Number[][] numberArray0 = new Number[3][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      scatterRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, defaultCaret0, combinedRangeCategoryPlot0, (CategoryAxis) null, logAxis0, defaultIntervalCategoryDataset0, 0, 0, 0);
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesShapesFilled(0, false);
      boolean boolean0 = scatterRenderer0.getSeriesShapesFilled(0);
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(boolean0);
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(scatterRenderer0.getBaseShapesFilled());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setItemMargin(7.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires 0.0 <= margin < 1.0.
         //
         verifyException("org.jfree.chart.renderer.category.ScatterRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      
      scatterRenderer0.setItemMargin(0.0);
      double double0 = scatterRenderer0.getItemMargin();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setItemMargin((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires 0.0 <= margin < 1.0.
         //
         verifyException("org.jfree.chart.renderer.category.ScatterRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      
      scatterRenderer0.setUseSeriesOffset(false);
      boolean boolean0 = scatterRenderer0.getUseSeriesOffset();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getUseSeriesOffset();
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertTrue(boolean0);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Object object0 = scatterRenderer0.clone();
      assertTrue(object0.equals((Object)scatterRenderer0));
      
      scatterRenderer0.setSeriesItemLabelGenerator((-1591), (CategoryItemLabelGenerator) null, true);
      boolean boolean0 = scatterRenderer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getUseFillPaint();
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertFalse(boolean0);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getBaseShapesFilled();
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      double double0 = scatterRenderer0.getItemMargin();
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertEquals(0.2, double0, 0.01);
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertTrue(scatterRenderer0.getBaseShapesFilled());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setUseOutlinePaint(true);
      ScatterRenderer scatterRenderer1 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.equals(scatterRenderer1);
      assertFalse(boolean0);
      assertTrue(scatterRenderer0.getUseOutlinePaint());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getDrawOutlines();
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(boolean0);
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesShapesFilled(305, (Boolean) null);
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getUseOutlinePaint();
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertTrue(scatterRenderer0.getBaseShapesFilled());
      assertFalse(boolean0);
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
      assertFalse(scatterRenderer0.getUseFillPaint());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("sQ|;DY\nh]m");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "Requires 0.0 <= margin < 1.0.");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultCategoryDataset0, subCategoryAxis0, cyclicNumberAxis0, scatterRenderer0);
      // Undeclared exception!
      try { 
        scatterRenderer0.getLegendItem(924, 15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getItemShapeFilled(2773, (-1));
      assertEquals(0.2, scatterRenderer0.getItemMargin(), 0.01);
      assertFalse(scatterRenderer0.getDrawOutlines());
      assertTrue(boolean0);
      assertFalse(scatterRenderer0.getUseFillPaint());
      assertFalse(scatterRenderer0.getUseOutlinePaint());
      assertTrue(scatterRenderer0.getUseSeriesOffset());
  }
}
