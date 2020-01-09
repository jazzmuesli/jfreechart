/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 20:50:45 GMT 2019
 */

package org.jfree.chart.panel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.panel.CrosshairOverlay;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CrosshairOverlay_ESTest extends CrosshairOverlay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      // Undeclared exception!
      try { 
        crosshairOverlay0.drawVerticalCrosshair((Graphics2D) null, rectangle2D_Double0, 0.0, crosshair0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.panel.CrosshairOverlay", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      crosshairOverlay0.addRangeCrosshair(crosshair0);
      List<Crosshair> list0 = crosshairOverlay0.getRangeCrosshairs();
      assertTrue(list0.contains(crosshair0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      crosshairOverlay0.addDomainCrosshair(crosshair0);
      List<Crosshair> list0 = crosshairOverlay0.getDomainCrosshairs();
      assertTrue(list0.contains(crosshair0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      // Undeclared exception!
      try { 
        crosshairOverlay0.removeRangeCrosshair((Crosshair) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'crosshair' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      // Undeclared exception!
      try { 
        crosshairOverlay0.removeDomainCrosshair((Crosshair) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'crosshair' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Font font0 = Axis.DEFAULT_TICK_LABEL_FONT;
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("", font0, combinedDomainCategoryPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true);
      // Undeclared exception!
      try { 
        crosshairOverlay0.paintOverlay((Graphics2D) null, chartPanel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.panel.CrosshairOverlay", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(categoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 10, 768.0, (-234.706954), chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 142, 64, 3076, 10, 999, 15, false, false, false, false, false, true);
      // Undeclared exception!
      try { 
        crosshairOverlay0.paintOverlay(graphics2D0, chartPanel0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.plot.CategoryPlot cannot be cast to org.jfree.chart.plot.XYPlot
         //
         verifyException("org.jfree.chart.panel.CrosshairOverlay", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(334, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      float[] floatArray0 = new float[9];
      floatArray0[0] = (float) 15;
      floatArray0[3] = (float) 10;
      sunGraphics2D0.transformState = 10;
      AffineTransform affineTransform0 = new AffineTransform(floatArray0);
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(affineTransform0, sunGraphics2D0.hints);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)affineTransformOp0.getBounds2D(bufferedImage0);
      Crosshair crosshair0 = new Crosshair(0, sunGraphics2D0.backgroundColor, sunGraphics2D0.stroke);
      // Undeclared exception!
      try { 
        crosshairOverlay0.drawVerticalCrosshair(sunGraphics2D0, rectangle2D_Float0, 2210.18994140625, crosshair0);
        fail("Expecting exception: InternalError");
      
      } catch(InternalError e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      // Undeclared exception!
      try { 
        crosshairOverlay0.drawHorizontalCrosshair((Graphics2D) null, rectangle2D_Double0, 0.0, crosshair0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.panel.CrosshairOverlay", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      crosshairOverlay0.xCrosshairs = null;
      // Undeclared exception!
      try { 
        crosshairOverlay0.clone();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'collection' argument.
         //
         verifyException("org.jfree.chart.util.ObjectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      crosshairOverlay0.yCrosshairs = null;
      // Undeclared exception!
      try { 
        crosshairOverlay0.clearRangeCrosshairs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      crosshairOverlay0.xCrosshairs = null;
      // Undeclared exception!
      try { 
        crosshairOverlay0.clearDomainCrosshairs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      crosshairOverlay0.yCrosshairs = null;
      SystemColor systemColor0 = SystemColor.controlShadow;
      BasicStroke basicStroke0 = (BasicStroke)Plot.DEFAULT_OUTLINE_STROKE;
      Crosshair crosshair0 = new Crosshair((-1066.328383664418), systemColor0, basicStroke0);
      // Undeclared exception!
      try { 
        crosshairOverlay0.addRangeCrosshair(crosshair0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.panel.CrosshairOverlay", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      // Undeclared exception!
      try { 
        crosshairOverlay0.addRangeCrosshair((Crosshair) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'crosshair' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      // Undeclared exception!
      try { 
        crosshairOverlay0.addDomainCrosshair((Crosshair) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'crosshair' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      CrosshairOverlay crosshairOverlay1 = new CrosshairOverlay();
      assertTrue(crosshairOverlay1.equals((Object)crosshairOverlay0));
      
      crosshairOverlay0.addRangeCrosshair(crosshair0);
      boolean boolean0 = crosshairOverlay1.equals(crosshairOverlay0);
      assertFalse(crosshairOverlay1.equals((Object)crosshairOverlay0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      List<Crosshair> list0 = crosshairOverlay0.yCrosshairs;
      crosshairOverlay0.xCrosshairs = list0;
      Crosshair crosshair0 = new Crosshair((-435.307888318));
      Object object0 = crosshairOverlay0.clone();
      assertTrue(object0.equals((Object)crosshairOverlay0));
      
      crosshairOverlay0.addRangeCrosshair(crosshair0);
      boolean boolean0 = crosshairOverlay0.equals(object0);
      assertFalse(boolean0);
      assertFalse(object0.equals((Object)crosshairOverlay0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      CrosshairOverlay crosshairOverlay1 = new CrosshairOverlay();
      crosshairOverlay1.addRangeCrosshair(crosshair0);
      crosshairOverlay0.addRangeCrosshair(crosshair0);
      crosshairOverlay1.addDomainCrosshair(crosshair0);
      assertFalse(crosshairOverlay1.equals((Object)crosshairOverlay0));
      
      crosshairOverlay0.removeRangeCrosshair(crosshair0);
      assertFalse(crosshairOverlay0.equals((Object)crosshairOverlay1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      boolean boolean0 = crosshairOverlay0.equals(crosshair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(334, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      float[] floatArray0 = new float[9];
      floatArray0[0] = (float) 15;
      floatArray0[2] = (float) 10;
      floatArray0[1] = (float) 10;
      AffineTransform affineTransform0 = new AffineTransform(floatArray0);
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(affineTransform0, sunGraphics2D0.hints);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)affineTransformOp0.getBounds2D(bufferedImage0);
      Crosshair crosshair0 = new Crosshair(0.0F);
      crosshairOverlay0.drawVerticalCrosshair(sunGraphics2D0, rectangle2D_Float0, 1425.8848728269, crosshair0);
      assertEquals(140, sunGraphics2D0.lcdTextContrast);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(334, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(sunGraphics2D0.transform, sunGraphics2D0.hints);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)affineTransformOp0.getBounds2D(bufferedImage0);
      Crosshair crosshair0 = new Crosshair(0.0F);
      crosshairOverlay0.drawVerticalCrosshair(sunGraphics2D0, rectangle2D_Float0, 1425.8848728269, crosshair0);
      assertEquals(0, sunGraphics2D0.transformState);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair(1.0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(2, 115.5, 2, 0.0);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      crosshairOverlay0.drawVerticalCrosshair((Graphics2D) null, rectangle2D0, 0.0, crosshair0);
      assertEquals(3.0, crosshair0.getLabelYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(334, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(((SunGraphics2D) graphics2D0).transform, ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)affineTransformOp0.getBounds2D(bufferedImage0);
      Crosshair crosshair0 = new Crosshair(0.0F);
      crosshairOverlay0.drawHorizontalCrosshair(graphics2D0, rectangle2D_Float0, 0.0, crosshair0);
      assertEquals(10.0F, rectangle2D_Float0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair((-1.0));
      Rectangle rectangle0 = new Rectangle(1024, (-1374), 1560, 768);
      crosshairOverlay0.drawHorizontalCrosshair((Graphics2D) null, rectangle0, 10, crosshair0);
      assertEquals(3.0, crosshair0.getLabelXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(334, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      float[] floatArray0 = new float[9];
      floatArray0[0] = (float) 15;
      floatArray0[3] = (float) 10;
      floatArray0[5] = (float) 334;
      AffineTransform affineTransform0 = new AffineTransform(floatArray0);
      AffineTransformOp affineTransformOp0 = new AffineTransformOp(affineTransform0, sunGraphics2D0.hints);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)affineTransformOp0.getBounds2D(bufferedImage0);
      Crosshair crosshair0 = new Crosshair(0, sunGraphics2D0.backgroundColor, multiplePiePlot0.DEFAULT_OUTLINE_STROKE);
      crosshairOverlay0.drawHorizontalCrosshair(sunGraphics2D0, rectangle2D_Float0, 0.0, crosshair0);
      assertEquals(1, sunGraphics2D0.interpolationType);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      crosshairOverlay0.clearRangeCrosshairs();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      crosshairOverlay0.addRangeCrosshair(crosshair0);
      crosshairOverlay0.clearRangeCrosshairs();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair(1.0);
      crosshairOverlay0.removeRangeCrosshair(crosshair0);
      assertTrue(crosshair0.isVisible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      crosshairOverlay0.clearDomainCrosshairs();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      crosshairOverlay0.addDomainCrosshair(crosshair0);
      crosshairOverlay0.clearDomainCrosshairs();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      crosshairOverlay0.removeDomainCrosshair(crosshair0);
      assertEquals(3.0, crosshair0.getLabelYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      List<Crosshair> list0 = crosshairOverlay0.getRangeCrosshairs();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Object object0 = crosshairOverlay0.clone();
      boolean boolean0 = crosshairOverlay0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, crosshairOverlay0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      crosshairOverlay0.addDomainCrosshair(crosshair0);
      crosshairOverlay0.removeDomainCrosshair(crosshair0);
      assertFalse(crosshair0.isLabelVisible());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      Crosshair crosshair0 = new Crosshair();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(crosshair0, "org.jfree.data.general.DatasetGroup", "org.jfree.data.general.DatasetGroup", crosshairOverlay0);
      crosshairOverlay0.propertyChange(propertyChangeEvent0);
      assertEquals("org.jfree.data.general.DatasetGroup", propertyChangeEvent0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CrosshairOverlay crosshairOverlay0 = new CrosshairOverlay();
      List<Crosshair> list0 = crosshairOverlay0.getDomainCrosshairs();
      assertTrue(list0.isEmpty());
  }
}