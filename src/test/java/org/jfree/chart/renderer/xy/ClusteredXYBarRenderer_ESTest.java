/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:21:34 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.ClusteredXYBarRenderer;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultWindDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClusteredXYBarRenderer_ESTest extends ClusteredXYBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      XYSeries xYSeries0 = new XYSeries(clusteredXYBarRenderer0.ZERO);
      xYSeries0.add((Number) clusteredXYBarRenderer0.ZERO, (Number) clusteredXYBarRenderer0.ZERO);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      XYDataItem xYDataItem0 = new XYDataItem((Number) clusteredXYBarRenderer0.ZERO, (Number) clusteredXYBarRenderer0.ZERO);
      xYSeries0.addOrUpdate(xYDataItem0);
      Range range0 = clusteredXYBarRenderer0.findDomainBoundsWithOffset(xYSeriesCollection0);
      assertNotNull(range0);
      assertEquals((-0.5), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      Day day0 = new Day();
      Date date0 = day0.getStart();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(date0, date0);
      timeTableXYDataset0.add((TimePeriod) simpleTimePeriod0, (Number) clusteredXYBarRenderer0.ZERO, (Comparable) day0, true);
      Range range0 = clusteredXYBarRenderer0.findDomainBoundsWithOffset(timeTableXYDataset0);
      assertEquals(1.39240928132E12, range0.getCentralValue(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      Day day0 = new Day();
      Date date0 = day0.getStart();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(date0, date0);
      timeTableXYDataset0.add((TimePeriod) simpleTimePeriod0, (Number) clusteredXYBarRenderer0.ZERO, (Comparable) day0, true);
      Range range0 = clusteredXYBarRenderer0.findDomainBounds(timeTableXYDataset0);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      XYSeries xYSeries0 = new XYSeries(clusteredXYBarRenderer0.ZERO);
      xYSeries0.add((Number) clusteredXYBarRenderer0.ZERO, (Number) clusteredXYBarRenderer0.ZERO);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      Range range0 = clusteredXYBarRenderer0.findDomainBounds(xYSeriesCollection0);
      assertEquals((-0.5), range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer((-2495.135203095), true);
      // Undeclared exception!
      try { 
        clusteredXYBarRenderer0.findDomainBoundsWithOffset((IntervalXYDataset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer(1.0, false);
      BufferedImage bufferedImage0 = new BufferedImage(1017, 1017, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DefaultXYItemRenderer defaultXYItemRenderer0 = new DefaultXYItemRenderer();
      Line2D.Double line2D_Double0 = new Line2D.Double(360.0, 1017, 360.0, 360.0);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      XYPlot xYPlot0 = new XYPlot();
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      XYItemRendererState xYItemRendererState0 = defaultXYItemRenderer0.initialise(graphics2D0, rectangle2D0, xYPlot0, defaultTableXYDataset0, (PlotRenderingInfo) null);
      JFreeChart jFreeChart0 = new JFreeChart(xYPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, false, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis("The 'data' array must contain two arrays with equal length.");
      // Undeclared exception!
      try { 
        clusteredXYBarRenderer0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D0, plotRenderingInfo0, xYPlot0, dateAxis0, dateAxis0, defaultTableXYDataset0, 1489, 1, (CrosshairState) null, 7);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1489, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer(857.6061030092582, true);
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = xYStepAreaRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, (XYPlot) null, defaultWindDataset0, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis("bB/");
      CrosshairState crosshairState0 = new CrosshairState();
      // Undeclared exception!
      try { 
        clusteredXYBarRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D_Double0, plotRenderingInfo0, (XYPlot) null, dateAxis0, dateAxis0, defaultWindDataset0, 100, 3, crosshairState0, (-3390));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.DefaultWindDataset cannot be cast to org.jfree.data.xy.IntervalXYDataset
         //
         verifyException("org.jfree.chart.renderer.xy.ClusteredXYBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(true, true);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, 0.0F, 482.21475F, 1873.8F);
      Rectangle rectangle0 = new Rectangle((-218), 41, 0, 41);
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createUnion(rectangle0);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logarithmicAxis0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      XYItemRendererState xYItemRendererState0 = deviationRenderer0.initialise((Graphics2D) null, rectangle2D0, combinedRangeXYPlot0, timePeriodValuesCollection0, (PlotRenderingInfo) null);
      CrosshairState crosshairState0 = new CrosshairState();
      // Undeclared exception!
      try { 
        clusteredXYBarRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D_Float0, (PlotRenderingInfo) null, combinedRangeXYPlot0, logarithmicAxis0, logarithmicAxis0, timePeriodValuesCollection0, (-1461), 0, crosshairState0, 2020);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      ClusteredXYBarRenderer clusteredXYBarRenderer1 = new ClusteredXYBarRenderer((double) clusteredXYBarRenderer0.ZERO, true);
      boolean boolean0 = clusteredXYBarRenderer0.equals(clusteredXYBarRenderer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      Object object0 = clusteredXYBarRenderer0.clone();
      boolean boolean0 = object0.equals(clusteredXYBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      boolean boolean0 = clusteredXYBarRenderer0.equals(clusteredXYBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer(90.0, true);
      Shape shape0 = clusteredXYBarRenderer0.lookupLegendShape(0);
      boolean boolean0 = clusteredXYBarRenderer0.equals(shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      Rectangle rectangle0 = new Rectangle((-1481), 481, (-1073741824), 2399);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = samplingXYLineRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, (XYPlot) null, (XYDataset) null, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) samplingXYLineRenderer0.ZERO);
      LogAxis logAxis0 = new LogAxis("");
      CrosshairState crosshairState0 = new CrosshairState();
      // Undeclared exception!
      try { 
        clusteredXYBarRenderer0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle0, plotRenderingInfo0, (XYPlot) null, cyclicNumberAxis0, logAxis0, (XYDataset) null, (-1073741824), (-1481), crosshairState0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.ClusteredXYBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      XYSeries xYSeries0 = new XYSeries(clusteredXYBarRenderer0.ZERO);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      Range range0 = clusteredXYBarRenderer0.findDomainBoundsWithOffset(xYSeriesCollection0);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer(90.0, true);
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset(clusteredXYBarRenderer0.ZERO);
      // Undeclared exception!
      try { 
        clusteredXYBarRenderer0.findDomainBounds(defaultBoxAndWhiskerXYDataset0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset cannot be cast to org.jfree.data.xy.IntervalXYDataset
         //
         verifyException("org.jfree.chart.renderer.xy.ClusteredXYBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer(3697.03528953, true);
      Range range0 = clusteredXYBarRenderer0.findDomainBounds((XYDataset) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer();
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset((Comparable) null);
      // Undeclared exception!
      try { 
        clusteredXYBarRenderer0.findDomainBounds(defaultBoxAndWhiskerXYDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.general.AbstractSeriesDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer((-2495.135203095), true);
      int int0 = clusteredXYBarRenderer0.getPassCount();
      assertEquals(2, int0);
  }
}