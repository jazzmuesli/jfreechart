/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:40:03 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer2;
import org.jfree.chart.renderer.xy.XYAreaRenderer2;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.ui.Layer;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYAreaRenderer2_ESTest extends XYAreaRenderer2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYToolTipGenerator xYToolTipGenerator0 = mock(XYToolTipGenerator.class, new ViolatedAssumptionAnswer());
      XYURLGenerator xYURLGenerator0 = mock(XYURLGenerator.class, new ViolatedAssumptionAnswer());
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2(xYToolTipGenerator0, xYURLGenerator0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYItemRendererState xYItemRendererState0 = xYAreaRenderer2_0.initialise(graphics2D0, rectangle2D0, (XYPlot) null, xYDataset0, plotRenderingInfo0);
      Rectangle2D rectangle2D1 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo1 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      ValueAxis valueAxis1 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0.05).when(xYDataset1).getXValue(anyInt() , anyInt());
      doReturn(0.0).when(xYDataset1).getYValue(anyInt() , anyInt());
      CrosshairState crosshairState0 = mock(CrosshairState.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        xYAreaRenderer2_0.drawItem(graphics2D0, xYItemRendererState0, rectangle2D1, plotRenderingInfo1, (XYPlot) null, valueAxis0, valueAxis1, xYDataset1, (-1), 29, crosshairState0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.xy.XYAreaRenderer2", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      // Undeclared exception!
      try { 
        xYAreaRenderer2_0.setLegendArea((Shape) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'area' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(0, 25.5, 1467.0413406);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, false, false);
      Rectangle2D rectangle2D0 = samplingXYLineRenderer0.DEFAULT_VALUE_LABEL_FONT.getStringBounds("", fontRenderContext0);
      DateAxis dateAxis0 = new DateAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(dateAxis0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(true);
      XYItemRendererState xYItemRendererState0 = samplingXYLineRenderer0.initialise((Graphics2D) null, rectangle2D0, (XYPlot) null, simpleHistogramDataset0, plotRenderingInfo0);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      // Undeclared exception!
      try { 
        stackedXYAreaRenderer2_0.drawItem((Graphics2D) null, xYItemRendererState0, rectangle2D0, plotRenderingInfo0, combinedDomainXYPlot0, dateAxis0, dateAxis0, simpleHistogramDataset0, 0, (-3620), categoryCrosshairState0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.statistics.SimpleHistogramDataset cannot be cast to org.jfree.data.xy.TableXYDataset
         //
         verifyException("org.jfree.chart.renderer.xy.StackedXYAreaRenderer2", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      XYAnnotation xYAnnotation0 = mock(XYAnnotation.class, new ViolatedAssumptionAnswer());
      Layer layer0 = Layer.BACKGROUND;
      xYAreaRenderer2_0.addAnnotation(xYAnnotation0, layer0);
      // Undeclared exception!
      try { 
        xYAreaRenderer2_0.clone();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.CloneNotSupportedException: Object without clone() method is impossible.
         //
         verifyException("org.jfree.chart.util.CloneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYToolTipGenerator xYToolTipGenerator0 = mock(XYToolTipGenerator.class, new ViolatedAssumptionAnswer());
      XYURLGenerator xYURLGenerator0 = mock(XYURLGenerator.class, new ViolatedAssumptionAnswer());
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2(xYToolTipGenerator0, xYURLGenerator0);
      try { 
        xYAreaRenderer2_0.clone();
        fail("Expecting exception: CloneNotSupportedException");
      
      } catch(CloneNotSupportedException e) {
         //
         // Object without clone() method is impossible.
         //
         verifyException("org.jfree.chart.util.CloneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2(highLowItemLabelGenerator0, (XYURLGenerator) null);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(xYAreaRenderer2_0.ZERO);
      XYPlot xYPlot0 = new XYPlot(simpleHistogramDataset0, (ValueAxis) null, (ValueAxis) null, xYAreaRenderer2_0);
      xYAreaRenderer2_0.setLegendArea(xYPlot0.DEFAULT_LEGEND_ITEM_BOX);
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      boolean boolean0 = xYAreaRenderer2_0.equals(stackedXYAreaRenderer2_0);
      assertFalse(stackedXYAreaRenderer2_0.isOutline());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      boolean boolean0 = xYAreaRenderer2_0.equals(xYAreaRenderer2_0);
      assertFalse(xYAreaRenderer2_0.isOutline());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYToolTipGenerator xYToolTipGenerator0 = mock(XYToolTipGenerator.class, new ViolatedAssumptionAnswer());
      XYURLGenerator xYURLGenerator0 = mock(XYURLGenerator.class, new ViolatedAssumptionAnswer());
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2(xYToolTipGenerator0, xYURLGenerator0);
      boolean boolean0 = xYAreaRenderer2_0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(xYAreaRenderer2_0.isOutline());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2(highLowItemLabelGenerator0, (XYURLGenerator) null);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(xYAreaRenderer2_0.ZERO);
      XYPlot xYPlot0 = new XYPlot(simpleHistogramDataset0, (ValueAxis) null, (ValueAxis) null, xYAreaRenderer2_0);
      LegendItem legendItem0 = xYAreaRenderer2_0.getLegendItem(1, 1);
      assertNull(legendItem0);
      assertFalse(xYAreaRenderer2_0.isOutline());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      xYAreaRenderer2_0.getLegendItem(0, (-944));
      assertFalse(xYAreaRenderer2_0.isOutline());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      xYAreaRenderer2_0.getLegendArea();
      assertFalse(xYAreaRenderer2_0.isOutline());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      assertFalse(xYAreaRenderer2_0.isOutline());
      
      xYAreaRenderer2_0.setOutline(true);
      boolean boolean0 = xYAreaRenderer2_0.isOutline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      XYAreaRenderer2 xYAreaRenderer2_1 = (XYAreaRenderer2)xYAreaRenderer2_0.clone();
      boolean boolean0 = xYAreaRenderer2_0.equals(xYAreaRenderer2_1);
      assertTrue(boolean0);
      assertFalse(xYAreaRenderer2_1.isOutline());
      assertNotSame(xYAreaRenderer2_1, xYAreaRenderer2_0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYAreaRenderer2 xYAreaRenderer2_0 = new XYAreaRenderer2();
      boolean boolean0 = xYAreaRenderer2_0.isOutline();
      assertFalse(boolean0);
  }
}
