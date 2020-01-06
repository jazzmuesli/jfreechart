/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:36:23 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.data.general.WaferMapDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WaferMapPlot_ESTest extends WaferMapPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(134, 50);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-2001.607F), 1, 134, 2652.8945F);
      Ellipse2D ellipse2D0 = waferMapPlot0.getWaferEdge(rectangle2D_Float0);
      assertEquals(1394.447265625, ellipse2D0.getMaxY(), 0.01);
      assertEquals((-1867.6070556640625), ellipse2D0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 0);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, false);
      chartPanel0.setSize(20, (-11));
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)waferMapPlot0.getWaferEdge(rectangle0);
      assertEquals((-5.5), ellipse2D_Double0.getCenterY(), 0.01);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01);
      assertEquals(4.5, ellipse2D_Double0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1934014173), (-3323));
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder((-1934014173));
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) null, 1, (-2080), (-3323), (-2125791893));
      Ellipse2D ellipse2D0 = waferMapPlot0.getWaferEdge(rectangle0);
      assertEquals((-1.06289761E9), ellipse2D0.getMaxX(), 0.01);
      assertEquals((-1.0628980265E9), ellipse2D0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 0);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      LegendItemCollection legendItemCollection0 = waferMapPlot0.getLegendItems();
      assertEquals(0, legendItemCollection0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, (WaferMapRenderer) null);
      WaferMapDataset waferMapDataset0 = waferMapPlot0.getDataset();
      assertNull(waferMapDataset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 0);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      WaferMapDataset waferMapDataset1 = waferMapPlot0.getDataset();
      assertTrue(waferMapDataset1.getNotify());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(2, 2);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      WaferMapDataset waferMapDataset1 = waferMapPlot0.getDataset();
      assertSame(waferMapDataset0, waferMapDataset1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, (-449));
      waferMapDataset0.setChipSpace(0.0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, (WaferMapRenderer) null);
      WaferMapDataset waferMapDataset1 = waferMapPlot0.getDataset();
      assertEquals(0.0, waferMapDataset1.getChipSpace(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(832, 1504);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      // Undeclared exception!
      try { 
        waferMapPlot0.getWaferEdge((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      DefaultComboBoxModel<String> defaultComboBoxModel0 = new DefaultComboBoxModel<String>();
      JList<String> jList0 = new JList<String>(defaultComboBoxModel0);
      TitledBorder titledBorder0 = new TitledBorder((Border) null, "qEN=wX`We(");
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jList0, (Border) titledBorder0, 212, 10, 212, 322);
      // Undeclared exception!
      try { 
        waferMapPlot0.drawWaferEdge((Graphics2D) null, rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      BufferedImage bufferedImage0 = new BufferedImage(3124, 865, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      // Undeclared exception!
      try { 
        waferMapPlot0.drawChipGrid(graphics2D0, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = null;
      try {
        waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null, waferMapRenderer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.WaferMapRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, 1, 15, 2301, 10, 2301, 0, true, false, false, false, false, false);
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea(216, (-1));
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)waferMapPlot0.getWaferEdge(rectangle2D0);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01);
      assertEquals(0.0, ellipse2D_Double0.height, 0.01);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1934014173), (-3323));
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      BufferedImage bufferedImage0 = new BufferedImage(8, 10, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder((-1934014173));
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) null, 1, (-2080), (-3323), (-2125791893));
      waferMapPlot0.drawChipGrid(sunGraphics2D0, rectangle0);
      assertEquals(255, sunGraphics2D0.pixel);
      assertEquals((-1), sunGraphics2D0.eargb);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null);
      Font font0 = Axis.DEFAULT_TICK_LABEL_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("", font0, waferMapPlot0, false);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(20, 304, 10, (ChartRenderingInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(17, 17);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      PlotState plotState0 = new PlotState();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      waferMapPlot0.draw((Graphics2D) null, rectangle2D0, (Point2D) null, plotState0, plotRenderingInfo0);
      assertEquals(1.0F, Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      Font font0 = AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("WMAP_Plot", font0, waferMapPlot0, false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(999, 10, 10, chartRenderingInfo0);
      assertEquals(10, bufferedImage0.getHeight());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      waferMapPlot0.setRenderer((WaferMapRenderer) null);
      assertEquals(1.0F, waferMapPlot0.getForegroundAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      // Undeclared exception!
      try { 
        waferMapPlot0.setRenderer(waferMapRenderer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.WaferMapRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot((WaferMapDataset) null);
      waferMapPlot0.setDataset((WaferMapDataset) null);
      assertEquals(1.0F, waferMapPlot0.getForegroundAlpha(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(20, 20);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, (WaferMapRenderer) null);
      waferMapPlot0.setDataset(waferMapDataset0);
      assertEquals(1.0F, Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 0);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      waferMapPlot0.setRenderer(waferMapRenderer0);
      assertTrue(waferMapPlot0.isNotify());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 1970, 1.0F);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent("WMAP_Plot");
      waferMapPlot0.rendererChanged(rendererChangeEvent0);
      assertEquals(1.0F, Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1934014173), (-3323));
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      String string0 = waferMapPlot0.getPlotType();
      assertEquals("WMAP_Plot", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 1970, 1.0F);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      // Undeclared exception!
      try { 
        waferMapPlot0.getLegendItems();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.WaferMapPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1934014173), (-3323));
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      WaferMapDataset waferMapDataset1 = waferMapPlot0.getDataset();
      assertEquals((-1934014173), waferMapDataset1.getMaxChipX());
  }
}
