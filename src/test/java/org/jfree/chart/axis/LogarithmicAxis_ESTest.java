/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 20:32:54 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.ui.LengthAdjustmentType;
import org.jfree.chart.ui.RectangleAnchor;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.chart.ui.Size2D;
import org.jfree.data.Range;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LogarithmicAxis_ESTest extends LogarithmicAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("RxV)[sI(Bu8pyj7@p/5");
      logarithmicAxis0.zoomRange((-2673.886136041589), (-2673.886136041589));
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", logarithmicAxis0.DEFAULT_TICK_LABEL_FONT, spiderWebPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 2295);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      float[] floatArray0 = new float[8];
      Kernel kernel0 = new Kernel((-2419), 0, floatArray0);
      ConvolveOp convolveOp0 = new ConvolveOp(kernel0, 0, ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D rectangle2D0 = convolveOp0.getBounds2D(bufferedImage0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      logarithmicAxis0.refreshTicksVertical(graphics2D0, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(dimension0);
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D0 = logarithmicAxis0.DEFAULT_TICK_LABEL_INSETS.createAdjustedRectangle(rectangle0, lengthAdjustmentType0, lengthAdjustmentType0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      logarithmicAxis0.java2DToValue(0.0, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("%Jg)y");
      logarithmicAxis0.zoomRange(2057.154979, 2057.154979);
      Size2D size2D0 = new Size2D(0.0, (-1.0));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 2.0F, 1.0E-8, rectangleAnchor0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      logarithmicAxis0.valueToJava2D(0.0, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("`@znDIV~t*w)\"(Gc");
      logarithmicAxis0.computeLogFloor(0.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      // Undeclared exception!
      try { 
        logarithmicAxis0.zoomRange(1.7075701760979363, 1.0E-8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (2.2135610433963366) <= upper (7.131709741277821E-9).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("`@znDIV~t*w)\"(Gc");
      logarithmicAxis0.switchedLog10(10);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setupNumberFmtObj();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      Point point0 = new Point(1553, 1553);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      logarithmicAxis0.valueToJava2D(1902.495765, rectangle0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(803.5, 0.05, 0.8, (-1772.255824643228));
      Line2D.Double line2D_Double0 = new Line2D.Double(803.5, 0.0F, 100.0, (-1772.255824643228));
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createUnion(rectangle0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      logarithmicAxis0.valueToJava2D(1187.4632608818, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("%4:= rPhU48)3G]t]T");
      logarithmicAxis0.switchedPow10(0.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      logarithmicAxis0.switchedPow10((-4140.976309));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      logarithmicAxis0.switchedLog10(0.0F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.switchedLog10((-1855.257));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~jJNGLF;L^");
      logarithmicAxis0.resizeRange2(0.7751907000479412, 0.001);
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      logarithmicAxis0.java2DToValue((-1930.6171182), rectangle0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("xBt</\"OEraTBv");
      logarithmicAxis0.setStrictValuesFlag(false);
      logarithmicAxis0.getStrictValuesFlag();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.log10TickLabelsFlag = true;
      logarithmicAxis0.getLog10TickLabelsFlag();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setAutoRangeNextLogFlag(true);
      logarithmicAxis0.getAutoRangeNextLogFlag();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setAllowNegativesFlag(true);
      logarithmicAxis0.getAllowNegativesFlag();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("$_OOlRYD9hHw;hj");
      logarithmicAxis0.computeLogCeil((-82.6840119482298));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      logarithmicAxis0.adjustedLog10(283.0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("lxg:@\"");
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      // Undeclared exception!
      try { 
        logarithmicAxis0.valueToJava2D(154.5, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.LogarithmicAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      // Undeclared exception!
      try { 
        logarithmicAxis0.setRange((Range) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(".MX+^x6f$dXN<c0iH");
      logarithmicAxis0.makeTickLabel((-2971.28062690269), true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, true);
      Rectangle rectangle0 = chartPanel0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      logarithmicAxis0.valueToJava2D((-1.5707963267948966), rectangle0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.autoAdjustRange();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("N6vpVJZ.|O:;q?");
      logarithmicAxis0.adjustedPow10(0.0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("$_OOlRYD9hHw;hj");
      logarithmicAxis0.adjustedPow10((-82.0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.adjustedPow10(4.0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.adjustedLog10(0.0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.adjustedLog10((-787.415280607397));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.switchedPow10(1.0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~jJNGLF;L^");
      logarithmicAxis0.resizeRange2(0.7751907000479412, 0.001);
      logarithmicAxis0.switchedPow10(825.204017915);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setRange(logarithmicAxis0.DEFAULT_RANGE);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~jJNGLF;L^");
      logarithmicAxis0.setExpTickLabelsFlag(true);
      logarithmicAxis0.makeTickLabel(100.0, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.centerRange(3201.1898);
      logarithmicAxis0.setLowerBound((-1262.7859F));
      logarithmicAxis0.refreshTicksVertical((Graphics2D) null, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.centerRange(3201.1898);
      logarithmicAxis0.smallLogFlag = true;
      logarithmicAxis0.refreshTicksVertical((Graphics2D) null, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.smallLogFlag = true;
      logarithmicAxis0.refreshTicksVertical((Graphics2D) null, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      logarithmicAxis0.refreshTicksHorizontal((Graphics2D) null, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.centerRange(3201.1898);
      logarithmicAxis0.refreshTicksHorizontal((Graphics2D) null, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.setLowerBound((-1262.7859F));
      logarithmicAxis0.refreshTicksHorizontal((Graphics2D) null, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.zoomRange((-1.7976931348623157E308), (-366.18424574));
      BufferedImage bufferedImage0 = new BufferedImage(10, 10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.zoomRange(0.0, 3.4028234663852886E38);
      logarithmicAxis0.refreshTicksHorizontal(graphics2D0, (Rectangle2D) null, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.centerRange(3201.1898);
      logarithmicAxis0.smallLogFlag = true;
      logarithmicAxis0.refreshTicksHorizontal((Graphics2D) null, rectangle2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      logarithmicAxis0.smallLogFlag = true;
      List list0 = logarithmicAxis0.refreshTicksHorizontal((Graphics2D) null, rectangle2D0, rectangleEdge0);
      assertEquals(1001, list0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.chart.plot.PiePlot");
      byte[][] byteArray0 = new byte[6][5];
      ByteLookupTable byteLookupTable0 = new ByteLookupTable(500, byteArray0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logarithmicAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeCategoryPlot0);
      RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
      LookupOp lookupOp0 = new LookupOp(byteLookupTable0, renderingHints0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2044, (int) (byte)119);
      Rectangle2D rectangle2D0 = lookupOp0.getBounds2D(bufferedImage0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      List list0 = logarithmicAxis0.refreshTicksHorizontal((Graphics2D) null, rectangle2D0, rectangleEdge0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.chart.plot.CombinedRangeCategoryPlot");
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      // Undeclared exception!
      try { 
        logarithmicAxis0.java2DToValue(3.4028234663852886E38, (Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.LogarithmicAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~jJNGLF;L^");
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      double double0 = logarithmicAxis0.java2DToValue((-1930.6171182), rectangle0, rectangleEdge0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      double double0 = logarithmicAxis0.valueToJava2D(1000L, (Rectangle2D) null, (RectangleEdge) null);
      assertEquals(0.0, double0, 0.01);
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      float[][] floatArray0 = new float[6][7];
      FastScatterPlot fastScatterPlot0 = null;
      try {
        fastScatterPlot0 = new FastScatterPlot(floatArray0, logarithmicAxis0, logarithmicAxis0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Values less than or equal to zero not allowed with logarithmic axis
         //
         verifyException("org.jfree.chart.axis.LogarithmicAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("3RGgxTS3#;");
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      PolarPlot polarPlot0 = new PolarPlot((XYDataset) null, logarithmicAxis0, defaultPolarItemRenderer0);
      logarithmicAxis0.autoAdjustRange();
      assertEquals(2.0, logarithmicAxis0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      double double0 = logarithmicAxis0.computeLogCeil(0);
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertEquals(0.0, double0, 0.01);
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      
      logarithmicAxis0.setAllowNegativesFlag(true);
      double double0 = logarithmicAxis0.computeLogCeil(0.05);
      assertTrue(logarithmicAxis0.getAllowNegativesFlag());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      
      logarithmicAxis0.setAllowNegativesFlag(true);
      double double0 = logarithmicAxis0.computeLogCeil(51.0);
      assertTrue(logarithmicAxis0.getAllowNegativesFlag());
      assertEquals(100.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~jJNGLF;L^");
      double double0 = logarithmicAxis0.computeLogCeil(100.0);
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
      assertEquals(100.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      double double0 = logarithmicAxis0.computeLogFloor(216.173825);
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
      assertEquals(100.0, double0, 0.01);
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("}jy:F2Rd");
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      
      logarithmicAxis0.setAllowNegativesFlag(true);
      double double0 = logarithmicAxis0.computeLogFloor(0.01);
      assertTrue(logarithmicAxis0.getAllowNegativesFlag());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">MNTT)-");
      double double0 = logarithmicAxis0.computeLogFloor((-787.415280607397));
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
      assertEquals((-788.0), double0, 0.01);
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      logarithmicAxis0.setupSmallLogFlag();
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("}jy:F2Rd");
      logarithmicAxis0.setAllowNegativesFlag(true);
      logarithmicAxis0.zoomRange((-895.1762168310671), 0.0);
      assertTrue(logarithmicAxis0.getAllowNegativesFlag());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      boolean boolean0 = logarithmicAxis0.getExpTickLabelsFlag();
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(boolean0);
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.resizeRange(0.05);
      // Undeclared exception!
      try { 
        logarithmicAxis0.zoomRange(10000.0, 2.302585092994046);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (Infinity) <= upper (0.5981044975570912).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      boolean boolean0 = logarithmicAxis0.getLog10TickLabelsFlag();
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(boolean0);
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      String string0 = logarithmicAxis0.makeTickLabel(1000L);
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
      assertEquals("1000", string0);
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~jJNGLF;L^");
      boolean boolean0 = logarithmicAxis0.getAllowNegativesFlag();
      assertFalse(boolean0);
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~jJNGLF;L^");
      boolean boolean0 = logarithmicAxis0.getAutoRangeNextLogFlag();
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertTrue(logarithmicAxis0.getStrictValuesFlag());
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertFalse(boolean0);
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      
      logarithmicAxis0.setAllowNegativesFlag(true);
      double double0 = logarithmicAxis0.computeLogFloor(100.0);
      assertTrue(logarithmicAxis0.getAllowNegativesFlag());
      assertEquals(100.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      
      logarithmicAxis0.setLog10TickLabelsFlag(true);
      assertTrue(logarithmicAxis0.getLog10TickLabelsFlag());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      
      logarithmicAxis0.setExpTickLabelsFlag(true);
      boolean boolean0 = logarithmicAxis0.getExpTickLabelsFlag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0E0");
      boolean boolean0 = logarithmicAxis0.getStrictValuesFlag();
      assertFalse(logarithmicAxis0.getExpTickLabelsFlag());
      assertFalse(logarithmicAxis0.getAutoRangeNextLogFlag());
      assertFalse(logarithmicAxis0.getAllowNegativesFlag());
      assertFalse(logarithmicAxis0.getLog10TickLabelsFlag());
      assertTrue(boolean0);
  }
}
