/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:05:59 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.util.Stack;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LayeredBarRenderer_ESTest extends LayeredBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setSeriesBarWidth(0, 2419.0160244);
      double double0 = layeredBarRenderer0.getSeriesBarWidth(0);
      assertEquals(2419.0160244, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(meterPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 270, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState((PlotRenderingInfo) null);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawVerticalItem(graphics2D0, categoryItemRendererState0, (Rectangle2D) null, (CategoryPlot) null, categoryAxis0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 270, 10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 270, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      Stack<String> stack0 = new Stack<String>();
      JTable jTable0 = new JTable(stack0, stack0);
      Rectangle rectangle0 = jTable0.getCellRect((-238), 10, false);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      double[][] doubleArray0 = new double[2][9];
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle0, (CategoryPlot) null, subCategoryAxis0, (ValueAxis) null, defaultIntervalCategoryDataset0, (-238), (-790));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      JFreeChart jFreeChart0 = new JFreeChart("t_o&S{k?\"f)ea4<%G`~", waferMapPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(3933, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(2374, 0.5F, 1024, 1.0F);
      LogAxis logAxis0 = new LogAxis("t_o&S{k?\"f)ea4<%G`~");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logAxis0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'unit' argument.");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1818.406115, 1818.406115);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawVerticalItem(graphics2D0, categoryStepRenderer_State0, rectangle2D_Float0, combinedRangeCategoryPlot0, subCategoryAxis0, cyclicNumberAxis0, defaultKeyedValues2DDataset0, (-476), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(40, 10, 0.0, (-1.0), chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("|emr9im9tyNvF=!");
      PeriodAxis periodAxis0 = new PeriodAxis("TywbJ,f= VNK*hPoXl");
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, (Rectangle2D) null, (CategoryPlot) null, extendedCategoryAxis0, periodAxis0, defaultBoxAndWhiskerCategoryDataset0, 15, 10, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LayeredBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = layeredBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, 10);
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D_Float0, combinedDomainCategoryPlot0, categoryAxis0, symbolAxis0, defaultKeyedValues2DDataset0, 10, 0, 40);
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
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      String[] stringArray0 = new String[1];
      Number[][] numberArray0 = new Number[0][5];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      NumberAxis numberAxis0 = new NumberAxis("#f_nyLsSLp^b'H");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis0, numberAxis0, statisticalBarRenderer0);
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.initialise(graphics2D0, rectangle2D_Double0, categoryPlot0, 15, (PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D_Double0, categoryPlot0, categoryAxis0, numberAxis0, defaultIntervalCategoryDataset0, 3, 15, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      JFreeChart jFreeChart0 = new JFreeChart("t_o&S{k?\"f)ea4<%G`~", waferMapPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(3933, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(2374, 0.5F, 1024, 1.0F);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'unit' argument.");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1818.406115, 1818.406115);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawHorizontalItem(graphics2D0, categoryStepRenderer_State0, rectangle2D_Float0, combinedDomainCategoryPlot0, subCategoryAxis0, cyclicNumberAxis0, taskSeriesCollection0, 2, 52);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Line2D.Double line2D_Double0 = new Line2D.Double(1025.37105847336, 3884.17112, 1988.56589257, 3.0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise((Graphics2D) null, rectangle0, combinedRangeCategoryPlot0, 10, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      String[] stringArray0 = new String[4];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      double[][] doubleArray0 = new double[1][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, rectangle0, combinedRangeCategoryPlot0, categoryAxis0, symbolAxis0, defaultIntervalCategoryDataset0, 964, 151);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      float[] floatArray0 = new float[8];
      JFreeChart jFreeChart0 = new JFreeChart("", combinedDomainCategoryPlot0);
      RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
      RescaleOp rescaleOp0 = new RescaleOp(floatArray0, floatArray0, renderingHints0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 2618);
      Rectangle2D rectangle2D0 = rescaleOp0.getBounds2D(bufferedImage0);
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(graphics2D0, rectangle2D0, combinedDomainCategoryPlot0, 10, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawHorizontalItem(graphics2D0, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, cyclicNumberAxis0, taskSeriesCollection0, (-1), 500);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      Stack<String> stack0 = new Stack<String>();
      JTable jTable0 = new JTable(stack0, stack0);
      Rectangle rectangle0 = jTable0.getCellRect((-238), 10, false);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      double[][] doubleArray0 = new double[2][9];
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle0, (CategoryPlot) null, subCategoryAxis0, (ValueAxis) null, defaultIntervalCategoryDataset0, 0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LayeredBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float(1185.517F, 1.0F, 1.0F, 1.0F, 462.67368F, 3.4028235E38F);
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(dateAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeCategoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 15, 10, (-3), 500, 10, (-2623), false, false, true, true, true, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.initialise((Graphics2D) null, rectangle2D0, combinedRangeCategoryPlot0, 232, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D0, combinedRangeCategoryPlot0, categoryAxis0, dateAxis0, defaultBoxAndWhiskerCategoryDataset0, (-3143), (-3), 1764);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      double[][] doubleArray0 = new double[8][0];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis0, valueAxis0, layeredBarRenderer0);
      Rectangle rectangle0 = new Rectangle(10, 10);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.calculateBarWidth(categoryPlot0, rectangle0, 0, (CategoryItemRendererState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LayeredBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      double[][] doubleArray0 = new double[8][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis0, valueAxis0, layeredBarRenderer0);
      Rectangle rectangle0 = new Rectangle(10, 10);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.calculateBarWidth(categoryPlot0, rectangle0, 0, (CategoryItemRendererState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.LayeredBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      float[] floatArray0 = new float[8];
      JFreeChart jFreeChart0 = new JFreeChart("", combinedDomainCategoryPlot0);
      RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
      RescaleOp rescaleOp0 = new RescaleOp(floatArray0, floatArray0, renderingHints0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 2618);
      Rectangle2D rectangle2D0 = rescaleOp0.getBounds2D(bufferedImage0);
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(graphics2D0, rectangle2D0, combinedDomainCategoryPlot0, 10, plotRenderingInfo0);
      layeredBarRenderer0.calculateBarWidth(combinedDomainCategoryPlot0, rectangle2D0, 2618, categoryItemRendererState0);
      assertEquals(1.0F, Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setSeriesBarWidth(0, 0);
      double double0 = layeredBarRenderer0.getSeriesBarWidth(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      double double0 = layeredBarRenderer0.getSeriesBarWidth(674);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.setSeriesBarWidth((-1264), (-1264));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
