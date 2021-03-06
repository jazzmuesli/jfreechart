/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 20:42:43 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberTick;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.data.Range;
import org.jfree.data.general.PieDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CyclicNumberAxis_ESTest extends CyclicNumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.04, "");
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setAutoRangeMinimumSize((-385.0), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NumberAxis.setAutoRangeMinimumSize(double): must be > 0.0.
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2251.8), 0.0);
      PiePlot piePlot0 = new PiePlot();
      Stroke stroke0 = piePlot0.getDefaultSectionOutlineStroke();
      cyclicNumberAxis0.setAdvanceLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1185.1059913418658), (-1185.1059913418658));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 255.0, 944.5933029, 0.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      cyclicNumberAxis0.valueToJava2D(0.0, rectangle0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(239.0);
      Rectangle rectangle0 = new Rectangle(500, 0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      cyclicNumberAxis0.java2DToValue(1438.45542, rectangle0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.35, 0.35);
      cyclicNumberAxis0.setBoundMappedToLastCycle(true);
      cyclicNumberAxis0.isBoundMappedToLastCycle();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-697.0), "");
      cyclicNumberAxis0.getPeriod();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2381.7180317354), (-2381.7180317354), "FOREGROUND");
      cyclicNumberAxis0.getPeriod();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1.0));
      cyclicNumberAxis0.getOffset();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1824.86862), (-1.5707963267948966));
      cyclicNumberAxis0.getOffset();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1040.226);
      cyclicNumberAxis0.getCycleBound();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.1, 0.1, "k6Kq#Yz*;fpZG*");
      cyclicNumberAxis0.setUpperBound((-30.0));
      cyclicNumberAxis0.getCycleBound();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(239.0);
      cyclicNumberAxis0.advanceLinePaint = null;
      cyclicNumberAxis0.getAdvanceLinePaint();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis((String) null, stringArray0);
      cyclicNumberAxis0.setRange(symbolAxis0.DEFAULT_RANGE, true, true);
      cyclicNumberAxis0.centerRange(2.0F);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.valueToJava2D(2.0F, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CyclicNumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1.0));
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setRange((Range) null, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CyclicNumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(630.71110404, 630.71110404, (String) null);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(500);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.selectVerticalAutoTickUnit((Graphics2D) null, rectangle0, rectangle0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-504.93), "distributor");
      XYPlot xYPlot0 = new XYPlot();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 10.0, 0.0F, (-1485.9533182));
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.reserveSpace((Graphics2D) null, xYPlot0, rectangle0, rectangleEdge0, axisSpace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0, "");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.refreshVerticalTicks((Graphics2D) null, rectangle2D_Double0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CyclicNumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(Double.NaN, Double.NaN);
      Rectangle rectangle0 = new Rectangle(500, 2565, 47, (-922));
      Rectangle2D rectangle2D0 = cyclicNumberAxis0.DEFAULT_TICK_LABEL_INSETS.createInsetRectangle((Rectangle2D) rectangle0);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.refreshTicksHorizontal((Graphics2D) null, rectangle2D0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CyclicNumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2964.95));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.java2DToValue(1122.351471, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CyclicNumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(246.5, 246.5);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.drawTickMarksAndLabels((Graphics2D) null, 1927.3869227047119, (Rectangle2D) null, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(9.020459708635052, 2575.255293051859);
      Line2D.Double line2D_Double0 = new Line2D.Double(0.05, 0, 9.020459708635052, 9.020459708635052);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Null 'object' argument.", cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT, spiderWebPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.draw((Graphics2D) null, 9.020459708635052, rectangle2D0, rectangle2D0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, (-1.7976931348623157E308));
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      NumberTick numberTick0 = new NumberTick(0.0F, "%q[8AQ}DUooW!N3~\"", textAnchor0, textAnchor0, (-1215.603633046955));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.calculateAnchorPoint(numberTick0, 0.0, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CyclicNumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
      cyclicNumberAxis0.setRange(range0, true, true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1185.1059913418658), (-1185.1059913418658));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-3399.2574419936), 944.5933029, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      cyclicNumberAxis0.valueToJava2D(0.0, rectangle2D_Double0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.1, 0.1, "k6Kq#Yz*;fpZG*");
      cyclicNumberAxis0.setUpperBound((-30.0));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      cyclicNumberAxis0.valueToJava2D(0.0, rectangle2D_Float0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.1, 0.1, "k6Kq#Yz*;fpZG*");
      cyclicNumberAxis0.getCycleBound();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      cyclicNumberAxis0.setFixedAutoRange(0.0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0, 0.0, "");
      CyclicNumberAxis cyclicNumberAxis1 = new CyclicNumberAxis(0.0);
      cyclicNumberAxis0.equals(cyclicNumberAxis1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1185.1059913418658), (-1185.1059913418658));
      Object object0 = cyclicNumberAxis0.clone();
      cyclicNumberAxis0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1185.1059913418658), (-1185.1059913418658));
      cyclicNumberAxis0.equals(cyclicNumberAxis0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(Double.NaN, Double.NaN);
      cyclicNumberAxis0.equals(cyclicNumberAxis0.MAXIMUM_TICK_COUNT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(861.0, "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      AxisSpace axisSpace0 = new AxisSpace();
      cyclicNumberAxis0.reserveSpace(graphics2D0, multiplePiePlot0, rectangle2D0, rectangleEdge0, axisSpace0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(861.0, "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick");
      cyclicNumberAxis0.zoomRange(0.0, 861.0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.reserveSpace(graphics2D0, multiplePiePlot0, rectangle2D0, rectangleEdge0, axisSpace0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be finite.
         //
         verifyException("org.jfree.chart.axis.NumberTickUnitSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(239.0);
      cyclicNumberAxis0.setAutoRangeMinimumSize(1577.3, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-736.448));
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setAutoRangeMinimumSize((-736.448), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NumberAxis.setAutoRangeMinimumSize(double): must be > 0.0.
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(13.291989960470428, 13.291989960470428);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      cyclicNumberAxis0.valueToJava2D(0.08, rectangle2D_Double0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(784L, 784L);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      cyclicNumberAxis0.valueToJava2D(0.0F, rectangle2D_Float0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-4275.532829826611));
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(500);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      cyclicNumberAxis0.valueToJava2D((-4275.532829826611), rectangle0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(784L, 784L);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      cyclicNumberAxis0.java2DToValue((-2693.4), rectangle2D_Float0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      CompassPlot compassPlot0 = new CompassPlot((ValueDataset) null);
      JFreeChart jFreeChart0 = new JFreeChart("u&H6a%@VU.V{6}", compassPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(39, 39, 1.1, 0.0, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      AxisState axisState0 = cyclicNumberAxis0.drawTickMarksAndLabels(graphics2D0, (-1350.29291445915), rectangle2D_Double0, rectangle2D_Double0, rectangleEdge0);
      assertEquals(0.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals((-1334.65228945915), axisState0.getCursor(), 0.01);
      assertEquals(Double.NaN, cyclicNumberAxis0.getCycleBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1185.1059913418658), (-1185.1059913418658));
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("paint", false, 0.05, 500);
      CyclicNumberAxis.CycleBoundTick cyclicNumberAxis_CycleBoundTick0 = new CyclicNumberAxis.CycleBoundTick(true, 1.0E-8, "paint", categoryPointerAnnotation0.DEFAULT_TEXT_ANCHOR, categoryPointerAnnotation0.DEFAULT_ROTATION_ANCHOR, 3.0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 255.0, 944.5933029, 0.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      float[] floatArray0 = cyclicNumberAxis0.calculateAnchorPoint(cyclicNumberAxis_CycleBoundTick0, (-3399.2574419936), rectangle0, rectangleEdge0);
      assertTrue(cyclicNumberAxis_CycleBoundTick0.mapToLastCycle);
      assertArrayEquals(new float[] {(-3393.2573F), 255.0F}, floatArray0, 0.01F);
      assertFalse(cyclicNumberAxis0.isBoundMappedToLastCycle());
      assertEquals((-1185.1059913418658), cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals((-1185.1059913418658), cyclicNumberAxis0.getOffset(), 0.01);
      assertEquals(1185.1059913418658, cyclicNumberAxis0.getCycleBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(90.0, 90.0, "stroke");
      double double0 = cyclicNumberAxis0.getOffset();
      assertEquals(90.0, double0, 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
      assertEquals(0.0, cyclicNumberAxis0.getCycleBound(), 0.01);
      assertEquals(90.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis((String) null, stringArray0);
      cyclicNumberAxis0.setAdvanceLinePaint(symbolAxis0.DEFAULT_TICK_MARK_PAINT);
      assertEquals(0.0, cyclicNumberAxis0.getPeriod(), 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
      assertEquals(0.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(90.0, 90.0, "stroke");
      BasicStroke basicStroke0 = (BasicStroke)cyclicNumberAxis0.getAdvanceLineStroke();
      assertEquals(0.0, cyclicNumberAxis0.getCycleBound(), 0.01);
      assertNotNull(basicStroke0);
      assertEquals(90.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(90.0, cyclicNumberAxis0.getOffset(), 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(90.0, 90.0, "stroke");
      cyclicNumberAxis0.setPeriod(0.0);
      assertEquals(Double.NaN, cyclicNumberAxis0.getCycleBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, (-127.4046));
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      double double0 = cyclicNumberAxis0.java2DToValue(2618.0, rectangle2D0, rectangleEdge0);
      assertEquals(Double.NaN, cyclicNumberAxis0.getCycleBound(), 0.01);
      assertEquals((-127.4046), cyclicNumberAxis0.getOffset(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getPeriod(), 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
      assertEquals(0.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(90.0, 90.0, "stroke");
      double double0 = cyclicNumberAxis0.getPeriod();
      assertEquals(90.0, cyclicNumberAxis0.getOffset(), 0.01);
      assertEquals(90.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals(90.0, double0, 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, (-127.4046));
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.centerRange(0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A positive range length is required: Range[0.0,0.0]
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966, "");
      boolean boolean0 = cyclicNumberAxis0.isAdvanceLineVisible();
      assertEquals(0.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals(1.5707963267948966, cyclicNumberAxis0.getOffset(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getPeriod(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(270.0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultBoxAndWhiskerCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, spiderWebPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.selectHorizontalAutoTickUnit(graphics2D0, (Rectangle2D) null, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CyclicNumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(239.0);
      boolean boolean0 = cyclicNumberAxis0.isBoundMappedToLastCycle();
      assertEquals(239.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
      assertFalse(boolean0);
      assertEquals(0.0, cyclicNumberAxis0.getOffset(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getCycleBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966, "");
      Color color0 = (Color)cyclicNumberAxis0.getAdvanceLinePaint();
      assertEquals(1.5707963267948966, cyclicNumberAxis0.getOffset(), 0.01);
      assertNotNull(color0);
      assertEquals(0.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getPeriod(), 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
      assertEquals(128, color0.getRed());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(239.0);
      cyclicNumberAxis0.setOffset(1.0);
      assertEquals(1.0, cyclicNumberAxis0.getOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setAdvanceLineStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05);
      PiePlot piePlot0 = new PiePlot((PieDataset) null);
      JFreeChart jFreeChart0 = new JFreeChart(piePlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 902, 0.05, (-3235.5178), chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle rectangle0 = new Rectangle(15, 2144436691);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      cyclicNumberAxis0.selectVerticalAutoTickUnit(graphics2D0, rectangle0, rectangle0, rectangleEdge0);
      assertEquals(1.0, cyclicNumberAxis0.getCycleBound(), 0.01);
      assertEquals(0.05, cyclicNumberAxis0.getPeriod(), 0.01);
      assertTrue(cyclicNumberAxis0.isAutoTickUnitSelection());
      assertEquals(0.05, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
      assertEquals(0.0, cyclicNumberAxis0.getOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, (-127.4046));
      cyclicNumberAxis0.setAdvanceLineVisible(true);
      assertTrue(cyclicNumberAxis0.isAdvanceLineVisible());
      assertEquals((-127.4046), cyclicNumberAxis0.getOffset(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getPeriod(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getFixedAutoRange(), 0.01);
  }
}
