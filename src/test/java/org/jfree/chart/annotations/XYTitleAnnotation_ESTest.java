/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:35:48 GMT 2019
 */

package org.jfree.chart.annotations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JTextPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.TextAnnotation;
import org.jfree.chart.annotations.XYTitleAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.ColumnArrangement;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.DateTitle;
import org.jfree.chart.title.ImageTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.RectangleAnchor;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.chart.ui.VerticalAlignment;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYTitleAnnotation_ESTest extends XYTitleAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart("r7k??5Xe#t2A", meterPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 1, (double) (-1), (double) 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) null);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1257.26307, "/WJSpzD%&'=C@X");
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        xYTitleAnnotation0.draw(graphics2D0, combinedDomainXYPlot0, rectangle2D_Float0, cyclicNumberAxis0, (ValueAxis) null, 557, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.annotations.XYTitleAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      TextTitle textTitle0 = new TextTitle("L.jWakIk@C", categoryAxis0.DEFAULT_AXIS_LABEL_FONT);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(0.0, 0.0, textTitle0);
      double double0 = xYTitleAnnotation0.getY();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      double double0 = xYTitleAnnotation0.getY();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals((-876.0), double0, 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(0.0, 0.0, dateTitle0);
      double double0 = xYTitleAnnotation0.getX();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-5.0), 1131.499568716243, dateTitle0);
      double double0 = xYTitleAnnotation0.getX();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals((-5.0), double0, 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(1131.499568716243, xYTitleAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      ColumnArrangement columnArrangement0 = new ColumnArrangement(horizontalAlignment0, verticalAlignment0, 0.0, 0.0);
      BlockContainer blockContainer0 = new BlockContainer(columnArrangement0);
      CompositeTitle compositeTitle0 = new CompositeTitle(blockContainer0);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(803.4, 0.0, compositeTitle0);
      compositeTitle0.visible = false;
      xYTitleAnnotation0.getTitle();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(803.4, xYTitleAnnotation0.getX(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      shortTextTitle0.setWidth((-876.0));
      xYTitleAnnotation0.getTitle();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getY(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      dateTitle0.setNotify(false);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(0.0, 0.0, dateTitle0);
      xYTitleAnnotation0.getTitle();
      assertEquals(0.0, xYTitleAnnotation0.getX(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2238, 10);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), 261.9079619761946, imageTitle0);
      xYTitleAnnotation0.getTitle();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(261.9079619761946, xYTitleAnnotation0.getY(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart("r7k??5Xe#t2A", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend();
      legendTitle0.setBorder(0.5F, (-2305.792), 1723.3144929522, 1.5707963267948966);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), legendTitle0);
      xYTitleAnnotation0.getTitle();
      assertEquals((-876.0), xYTitleAnnotation0.getX(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("TC_B9h(");
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(2340.6, (-1.0), textTitle0);
      xYTitleAnnotation0.setMaxWidth(1732.4510501467);
      double double0 = xYTitleAnnotation0.getMaxWidth();
      assertEquals(1732.4510501467, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PiePlot piePlot0 = new PiePlot();
      JFreeChart jFreeChart0 = new JFreeChart("iLu/", piePlot0.DEFAULT_LABEL_FONT, piePlot0, true);
      TextTitle textTitle0 = jFreeChart0.getTitle();
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(0.4, 10, textTitle0);
      xYTitleAnnotation0.setMaxHeight(0.08);
      double double0 = xYTitleAnnotation0.getMaxHeight();
      assertEquals(0.08, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("GU1");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(1.0, 1.0, textTitle0, rectangleAnchor0);
      xYTitleAnnotation0.setMaxHeight((-3546.05648));
      double double0 = xYTitleAnnotation0.getMaxHeight();
      assertEquals((-3546.05648), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      XYTitleAnnotation xYTitleAnnotation0 = null;
      try {
        xYTitleAnnotation0 = new XYTitleAnnotation(0.0, 3009.17003519986, (Title) null, rectangleAnchor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'title' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYTitleAnnotation xYTitleAnnotation0 = null;
      try {
        xYTitleAnnotation0 = new XYTitleAnnotation(642.45, 642.45, (Title) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'title' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart("r7k??5Xe#t2A", meterPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend();
      XYTitleAnnotation xYTitleAnnotation1 = new XYTitleAnnotation((-876.0), (-876.0), legendTitle0);
      boolean boolean0 = xYTitleAnnotation1.equals(xYTitleAnnotation0);
      assertFalse(boolean0);
      assertEquals((-876.0), xYTitleAnnotation1.getY(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation1.getX(), 0.01);
      assertEquals(0.0, xYTitleAnnotation1.getMaxHeight(), 0.01);
      assertEquals(0.0, xYTitleAnnotation1.getMaxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      Object object0 = xYTitleAnnotation0.clone();
      xYTitleAnnotation0.setMaxWidth(2583.556505);
      boolean boolean0 = xYTitleAnnotation0.equals(object0);
      assertEquals(2583.556505, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("horizontalAlignment");
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(0.6428571428571429, 0.6428571428571429, textTitle0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      XYTitleAnnotation xYTitleAnnotation1 = new XYTitleAnnotation(0.6428571428571429, (-4513.91), textTitle0, rectangleAnchor0);
      boolean boolean0 = xYTitleAnnotation0.equals(xYTitleAnnotation1);
      assertEquals(0.0, xYTitleAnnotation1.getMaxHeight(), 0.01);
      assertEquals(0.0, xYTitleAnnotation1.getMaxWidth(), 0.01);
      assertEquals(0.6428571428571429, xYTitleAnnotation1.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals((-4513.91), xYTitleAnnotation1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      LegendTitle legendTitle0 = new LegendTitle(layeredBarRenderer0);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(2052.921, 2052.921, legendTitle0);
      AreaRenderer areaRenderer0 = new AreaRenderer();
      XYTitleAnnotation xYTitleAnnotation1 = new XYTitleAnnotation((double) areaRenderer0.ZERO, 0.0, legendTitle0);
      boolean boolean0 = xYTitleAnnotation1.equals(xYTitleAnnotation0);
      assertEquals(0.0, xYTitleAnnotation1.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation1.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, xYTitleAnnotation1.getMaxHeight(), 0.01);
      assertEquals(0.0, xYTitleAnnotation1.getMaxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      boolean boolean0 = xYTitleAnnotation0.equals(xYTitleAnnotation0);
      assertEquals((-876.0), xYTitleAnnotation0.getX(), 0.01);
      assertTrue(boolean0);
      assertEquals((-876.0), xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Font font0 = TextAnnotation.DEFAULT_FONT;
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", font0, combinedDomainXYPlot0, false);
      TextTitle textTitle0 = jFreeChart0.getTitle();
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(1.0, (-4558.091350432), textTitle0);
      boolean boolean0 = xYTitleAnnotation0.equals(textTitle0);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals((-4558.091350432), xYTitleAnnotation0.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, xYTitleAnnotation0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Font font0 = TextAnnotation.DEFAULT_FONT;
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", font0, combinedDomainXYPlot0, false);
      TextTitle textTitle0 = jFreeChart0.getTitle();
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(1.0, (-4558.091350432), textTitle0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 10, 1432.403024, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      JTextPane jTextPane0 = new JTextPane();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTextPane0, 2146652757, 10, 121, 2146652757, (-2146438094), (-3518), 10, 10, true, 1011, 2146652757, 2146652757);
      Point point0 = mouseWheelEvent0.getPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      LogAxis logAxis0 = new LogAxis();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      xYTitleAnnotation0.draw(graphics2D0, combinedDomainXYPlot0, rectangle2D0, logAxis0, logAxis0, 10, plotRenderingInfo0);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(1.0, xYTitleAnnotation0.getX(), 0.01);
      assertEquals((-4558.091350432), xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      ColumnArrangement columnArrangement0 = new ColumnArrangement(horizontalAlignment0, verticalAlignment0, 0.0, 0.0);
      BlockContainer blockContainer0 = new BlockContainer(columnArrangement0);
      CompositeTitle compositeTitle0 = new CompositeTitle(blockContainer0);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(803.4, 0.0, compositeTitle0);
      xYTitleAnnotation0.setMaxWidth((-30.0));
      double double0 = xYTitleAnnotation0.getMaxWidth();
      assertEquals((-30.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      LegendTitle legendTitle0 = new LegendTitle(layeredBarRenderer0);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(2052.921, 2052.921, legendTitle0);
      double double0 = xYTitleAnnotation0.getY();
      assertEquals(2052.921, double0, 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(2052.921, xYTitleAnnotation0.getX(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      LegendTitle legendTitle0 = new LegendTitle(layeredBarRenderer0);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(2052.921, 2052.921, legendTitle0);
      double double0 = xYTitleAnnotation0.getMaxHeight();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2052.921, xYTitleAnnotation0.getX(), 0.01);
      assertEquals(2052.921, xYTitleAnnotation0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("TC_B9h(");
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(2340.6, (-1.0), textTitle0);
      double double0 = xYTitleAnnotation0.getX();
      assertEquals((-1.0), xYTitleAnnotation0.getY(), 0.01);
      assertEquals(2340.6, double0, 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      LegendTitle legendTitle0 = new LegendTitle(layeredBarRenderer0);
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(2052.921, 2052.921, legendTitle0);
      xYTitleAnnotation0.getCoordinateType();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals(2052.921, xYTitleAnnotation0.getX(), 0.01);
      assertEquals(2052.921, xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      double double0 = xYTitleAnnotation0.getMaxWidth();
      assertEquals((-876.0), xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getX(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      XYTitleAnnotation xYTitleAnnotation1 = (XYTitleAnnotation)xYTitleAnnotation0.clone();
      boolean boolean0 = xYTitleAnnotation0.equals(xYTitleAnnotation1);
      assertEquals(0.0, xYTitleAnnotation1.getMaxWidth(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation1.getX(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation1.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, xYTitleAnnotation1.getMaxHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("/WJSpzD%&'=C@X");
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation((-876.0), (-876.0), shortTextTitle0, rectangleAnchor0);
      xYTitleAnnotation0.hashCode();
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getY(), 0.01);
      assertEquals((-876.0), xYTitleAnnotation0.getX(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Font font0 = TextAnnotation.DEFAULT_FONT;
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", font0, combinedDomainXYPlot0, false);
      TextTitle textTitle0 = jFreeChart0.getTitle();
      XYTitleAnnotation xYTitleAnnotation0 = new XYTitleAnnotation(1.0, (-4558.091350432), textTitle0);
      xYTitleAnnotation0.getTitleAnchor();
      assertEquals(0.0, xYTitleAnnotation0.getMaxWidth(), 0.01);
      assertEquals((-4558.091350432), xYTitleAnnotation0.getY(), 0.01);
      assertEquals(0.0, xYTitleAnnotation0.getMaxHeight(), 0.01);
      assertEquals(1.0, xYTitleAnnotation0.getX(), 0.01);
  }
}
