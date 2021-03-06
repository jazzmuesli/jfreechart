/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:14:09 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JTextPane;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StackedBarRenderer_ESTest extends StackedBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      assertFalse(groupedStackedBarRenderer0.getRenderAsPercentages());
      
      groupedStackedBarRenderer0.setRenderAsPercentages(true);
      boolean boolean0 = groupedStackedBarRenderer0.getRenderAsPercentages();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      defaultKeyedValues2DDataset0.setValue((double) 0.0F, (Comparable) 1.0F, (Comparable) 10);
      Range range0 = stackedBarRenderer0.findRangeBounds((CategoryDataset) defaultKeyedValues2DDataset0);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      defaultCategoryDataset0.setValue((-576.048233975), (Comparable) 0.2, (Comparable) 10);
      Range range0 = stackedBarRenderer0.findRangeBounds((CategoryDataset) defaultCategoryDataset0);
      assertNotNull(range0);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      String[] stringArray0 = new String[6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        stackedBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      Number[][] numberArray0 = new Number[7][9];
      Number[] numberArray1 = new Number[6];
      numberArray0[1] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, (-1.0F), (-1.0F));
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = mock(ChartRenderingInfo.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise(graphics2D0, rectangle2D_Float0, categoryPlot0, 10, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis("");
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset((CategoryDataset) null, 1221, 10);
      // Undeclared exception!
      try { 
        stackedBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D_Float0, categoryPlot0, (CategoryAxis) null, dateAxis0, slidingCategoryDataset0, 30, 878, 1221);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.SlidingCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      CategoryPlot categoryPlot0 = new CategoryPlot(taskSeriesCollection0, categoryAxis0, numberAxis0, groupedStackedBarRenderer0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.drawItem(graphics2D0, categoryStepRenderer_State0, (Rectangle2D) null, categoryPlot0, categoryAxis0, numberAxis0, taskSeriesCollection0, (-3467), 10, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedBarRenderer0.calculateBarWidth((CategoryPlot) null, defaultCaret0, 0, categoryItemRendererState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StackedBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = groupedStackedBarRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.calculateBarWidth(combinedDomainCategoryPlot0, (Rectangle2D) null, (-306), categoryItemRendererState0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Require 'index' (-306) to be non-negative.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      boolean boolean0 = stackedBarRenderer0.equals(groupedStackedBarRenderer0);
      assertFalse(boolean0);
      assertFalse(groupedStackedBarRenderer0.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      StackedBarRenderer stackedBarRenderer1 = (StackedBarRenderer)stackedBarRenderer0.clone();
      boolean boolean0 = stackedBarRenderer0.equals(stackedBarRenderer1);
      assertTrue(boolean0);
      assertFalse(stackedBarRenderer1.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      boolean boolean0 = stackedBarRenderer0.equals(stackedBarRenderer0);
      assertTrue(boolean0);
      assertFalse(stackedBarRenderer0.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      JTextPane jTextPane0 = new JTextPane();
      boolean boolean0 = stackedBarRenderer0.equals(jTextPane0);
      assertFalse(stackedBarRenderer0.getRenderAsPercentages());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      stackedBarRenderer0.setRenderAsPercentages(false);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryMarker categoryMarker0 = new CategoryMarker(3.0, stackedBarRenderer0.DEFAULT_VALUE_LABEL_PAINT, boxAndWhiskerRenderer0.DEFAULT_STROKE);
      RectangleInsets rectangleInsets0 = categoryMarker0.getLabelOffset();
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle2D rectangle2D0 = rectangleInsets0.createOutsetRectangle((Rectangle2D) rectangle0, true, false);
      CategoryAxis categoryAxis0 = new CategoryAxis("lmP8GJ}b|jE8J?");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      ChartRenderingInfo chartRenderingInfo0 = mock(ChartRenderingInfo.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(graphics2D0, rectangle2D0, combinedDomainCategoryPlot0, 902, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      Number[][] numberArray0 = new Number[2][1];
      Number[] numberArray1 = new Number[3];
      numberArray1[0] = (Number) 0;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        stackedBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, dateAxis0, defaultIntervalCategoryDataset0, 0, 0, 9999);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: 0
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryMarker categoryMarker0 = new CategoryMarker(3.0, stackedBarRenderer0.DEFAULT_VALUE_LABEL_PAINT, boxAndWhiskerRenderer0.DEFAULT_STROKE);
      RectangleInsets rectangleInsets0 = categoryMarker0.getLabelOffset();
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle2D rectangle2D0 = rectangleInsets0.createOutsetRectangle((Rectangle2D) rectangle0, true, false);
      CategoryAxis categoryAxis0 = new CategoryAxis("lmP8GJ}b|jE8J?");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      ChartRenderingInfo chartRenderingInfo0 = mock(ChartRenderingInfo.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(graphics2D0, rectangle2D0, combinedDomainCategoryPlot0, 902, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      Number[][] numberArray0 = new Number[2][1];
      Number[] numberArray1 = new Number[3];
      numberArray1[0] = (Number) 0;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        stackedBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, dateAxis0, defaultIntervalCategoryDataset0, 0, 0, 9999);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: 0
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, (-2175.54F));
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State((PlotRenderingInfo) null);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Fourth");
      // Undeclared exception!
      try { 
        stackedBarRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D0, categoryPlot0, subCategoryAxis0, (ValueAxis) null, taskSeriesCollection0, 3, 10, 10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, (-2175.54F));
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State((PlotRenderingInfo) null);
      stackedBarRenderer0.calculateBarWidth(categoryPlot0, rectangle2D0, 10, categoryStepRenderer_State0);
      assertFalse(stackedBarRenderer0.getRenderAsPercentages());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      Number[][] numberArray0 = new Number[1][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Range range0 = stackedBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
      assertNotNull(range0);
      assertEquals(1.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      Range range0 = stackedBarRenderer0.findRangeBounds((CategoryDataset) null);
      assertTrue(stackedBarRenderer0.getRenderAsPercentages());
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      boolean boolean0 = groupedStackedBarRenderer0.getRenderAsPercentages();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      int int0 = groupedStackedBarRenderer0.getPassCount();
      assertFalse(groupedStackedBarRenderer0.getRenderAsPercentages());
      assertEquals(3, int0);
  }
}
