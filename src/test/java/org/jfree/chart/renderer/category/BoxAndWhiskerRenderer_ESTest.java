/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 20:54:10 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPasswordField;
import javax.swing.plaf.metal.MetalTreeUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BoxAndWhiskerRenderer_ESTest extends BoxAndWhiskerRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer1 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer1.setWhiskerWidth(0);
      boolean boolean0 = boxAndWhiskerRenderer1.equals(boxAndWhiskerRenderer0);
      assertEquals(0.0, boxAndWhiskerRenderer1.getWhiskerWidth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("^/;+!{/_qxu:W.?0", "^/;+!{/_qxu:W.?0", (-763.2416428), (-763.2416428));
      Paint paint0 = categoryPointerAnnotation0.getArrowPaint();
      boxAndWhiskerRenderer0.setArtifactPaint(paint0);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setMaximumBarWidth((-2238.175011217882));
      double double0 = boxAndWhiskerRenderer0.getMaximumBarWidth();
      assertEquals((-2238.175011217882), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      
      boxAndWhiskerRenderer0.setItemMargin(0.0);
      double double0 = boxAndWhiskerRenderer0.getItemMargin();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      defaultCategoryDataset0.addValue((Number) boxAndWhiskerRenderer0.ZERO, (Comparable) boxAndWhiskerRenderer0.ZERO, (Comparable) boxAndWhiskerRenderer0.ZERO);
      boxAndWhiskerRenderer0.findRangeBounds(defaultCategoryDataset0);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double[][] doubleArray0 = new double[1][4];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 30.0;
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      boxAndWhiskerRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      defaultCategoryDataset0.setValue((-1443.7), (Comparable) boxAndWhiskerRenderer0.ZERO, (Comparable) boxAndWhiskerRenderer0.ZERO);
      boxAndWhiskerRenderer0.findRangeBounds(defaultCategoryDataset0);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setArtifactPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(dimension0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.initialise((Graphics2D) null, rectangle0, (CategoryPlot) null, (-845), plotRenderingInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      String[] stringArray0 = new String[0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double[][] doubleArray0 = new double[5][5];
      double[] doubleArray1 = new double[2];
      doubleArray0[3] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)boxAndWhiskerRenderer0.lookupLegendShape(1653);
      BufferedImage bufferedImage0 = new BufferedImage(1653, 1653, 12);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedRangeCategoryPlot0, 6, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.drawVerticalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, categoryAxis0, logarithmicAxis0, defaultBoxAndWhiskerCategoryDataset0, 0, (-729));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.createState(plotRenderingInfo0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("!NZcyj6~6qQV?9|");
      PeriodAxis periodAxis0 = new PeriodAxis("!NZcyj6~6qQV?9|");
      String[] stringArray0 = new String[9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, (CategoryPlot) null, extendedCategoryAxis0, periodAxis0, defaultIntervalCategoryDataset0, 10, 10);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.category.DefaultIntervalCategoryDataset cannot be cast to org.jfree.data.statistics.BoxAndWhiskerCategoryDataset
         //
         verifyException("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) boxAndWhiskerRenderer0.ZERO, "`rQc0/qoXP?}UA");
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.createState(plotRenderingInfo0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("`rQc0/qoXP?}UA");
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, (Rectangle2D) null, (CategoryPlot) null, subCategoryAxis0, cyclicNumberAxis0, defaultCategoryDataset0, (-364), 2139095040);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.category.DefaultCategoryDataset cannot be cast to org.jfree.data.statistics.BoxAndWhiskerCategoryDataset
         //
         verifyException("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer1 = (BoxAndWhiskerRenderer)boxAndWhiskerRenderer0.clone();
      boxAndWhiskerRenderer1.setWhiskerWidth(0.0);
      boolean boolean0 = boxAndWhiskerRenderer0.equals(boxAndWhiskerRenderer1);
      assertFalse(boolean0);
      assertEquals(0.0, boxAndWhiskerRenderer1.getWhiskerWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Object object0 = boxAndWhiskerRenderer0.clone();
      boxAndWhiskerRenderer0.setMedianVisible(false);
      boolean boolean0 = boxAndWhiskerRenderer0.equals(object0);
      assertFalse(boxAndWhiskerRenderer0.isMedianVisible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer1 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setMeanVisible(false);
      boolean boolean0 = boxAndWhiskerRenderer1.equals(boxAndWhiskerRenderer0);
      assertFalse(boxAndWhiskerRenderer0.isMeanVisible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer1 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer1.equals(boxAndWhiskerRenderer0);
      assertTrue(boxAndWhiskerRenderer1.isMeanVisible());
      assertTrue(boolean0);
      assertTrue(boxAndWhiskerRenderer1.getFillBox());
      assertEquals(0.2, boxAndWhiskerRenderer1.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer1.isMedianVisible());
      assertFalse(boxAndWhiskerRenderer1.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer1.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer1.getWhiskerWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.equals(boxAndWhiskerRenderer0);
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.equals((Object) null);
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertFalse(boolean0);
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float((-1492), 459.0F, 8.0F, 0.0F, (-1492), 0.0F);
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.drawVerticalItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D0, combinedRangeCategoryPlot0, subCategoryAxis0, (ValueAxis) null, (CategoryDataset) null, 1543, 1543);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MetalTreeUI metalTreeUI0 = new MetalTreeUI();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, categoryPlot0, 0, plotRenderingInfo0);
      JPasswordField jPasswordField0 = new JPasswordField();
      Dimension dimension0 = metalTreeUI0.getMaximumSize(jPasswordField0);
      Rectangle rectangle0 = new Rectangle(dimension0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0F, 2280.0510760916);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, rectangle0, categoryPlot0, categoryAxis0, cyclicNumberAxis0, defaultBoxAndWhiskerCategoryDataset0, 366, (-340));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.getLegendItem((-1068), 31);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      boxAndWhiskerRenderer0.setPlot(combinedRangeCategoryPlot0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.getLegendItem(14, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      
      boxAndWhiskerRenderer0.setWhiskerWidth(1.0);
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setWhiskerWidth(4542);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value for whisker width out of range
         //
         verifyException("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      
      boxAndWhiskerRenderer0.setWhiskerWidth(0.0);
      double double0 = boxAndWhiskerRenderer0.getWhiskerWidth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setWhiskerWidth((-431.1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value for whisker width out of range
         //
         verifyException("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      
      boxAndWhiskerRenderer0.setUseOutlinePaintForWhiskers(false);
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      
      boxAndWhiskerRenderer0.setUseOutlinePaintForWhiskers(true);
      assertTrue(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      
      boxAndWhiskerRenderer0.setMedianVisible(true);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      
      boxAndWhiskerRenderer0.setMedianVisible(false);
      boolean boolean0 = boxAndWhiskerRenderer0.isMedianVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      
      boxAndWhiskerRenderer0.setMeanVisible(true);
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      
      boxAndWhiskerRenderer0.setMeanVisible(false);
      boolean boolean0 = boxAndWhiskerRenderer0.isMeanVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      boxAndWhiskerRenderer0.findRangeBounds(defaultBoxAndWhiskerCategoryDataset0);
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setItemMargin(2435.91033132);
      BoxAndWhiskerRenderer boxAndWhiskerRenderer1 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.equals(boxAndWhiskerRenderer1);
      assertEquals(2435.91033132, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.isMeanVisible();
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertTrue(boolean0);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.isMedianVisible();
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertTrue(boolean0);
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double double0 = boxAndWhiskerRenderer0.getItemMargin();
      assertEquals(0.2, double0, 0.01);
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setArtifactPaint(boxAndWhiskerRenderer0.DEFAULT_OUTLINE_PAINT);
      Color color0 = (Color)boxAndWhiskerRenderer0.getArtifactPaint();
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(128, color0.getGreen());
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      
      boxAndWhiskerRenderer0.setFillBox(false);
      boolean boolean0 = boxAndWhiskerRenderer0.getFillBox();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers();
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertFalse(boolean0);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double double0 = boxAndWhiskerRenderer0.getMaximumBarWidth();
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertEquals(1.0, double0, 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double double0 = boxAndWhiskerRenderer0.getWhiskerWidth();
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.getFillBox();
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boolean0);
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Color color0 = (Color)boxAndWhiskerRenderer0.getArtifactPaint();
      assertEquals(1.0, boxAndWhiskerRenderer0.getWhiskerWidth(), 0.01);
      assertEquals(0.2, boxAndWhiskerRenderer0.getItemMargin(), 0.01);
      assertTrue(boxAndWhiskerRenderer0.getFillBox());
      assertTrue(boxAndWhiskerRenderer0.isMeanVisible());
      assertEquals(0, color0.getBlue());
      assertTrue(boxAndWhiskerRenderer0.isMedianVisible());
      assertFalse(boxAndWhiskerRenderer0.getUseOutlinePaintForWhiskers());
      assertEquals(1.0, boxAndWhiskerRenderer0.getMaximumBarWidth(), 0.01);
  }
}
