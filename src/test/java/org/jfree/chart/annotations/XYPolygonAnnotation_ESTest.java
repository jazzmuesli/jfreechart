/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:46:33 GMT 2019
 */

package org.jfree.chart.annotations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.annotations.XYPolygonAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XYPolygonAnnotation_ESTest extends XYPolygonAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      assertTrue(xYPolygonAnnotation0.getNotify());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, paint0);
      double[] doubleArray1 = xYPolygonAnnotation0.getPolygonCoordinates();
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, paint0, (Paint) null);
      Stroke stroke0 = xYPolygonAnnotation0.getOutlineStroke();
      assertNull(stroke0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, stroke0, (Paint) null);
      Paint paint0 = xYPolygonAnnotation0.getOutlinePaint();
      assertNull(paint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      XYPlot xYPlot0 = mock(XYPlot.class, new ViolatedAssumptionAnswer());
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, valueAxis0.DEFAULT_AXIS_LINE_PAINT, xYPlot0.DEFAULT_CROSSHAIR_PAINT);
      Color color0 = (Color)xYPolygonAnnotation0.getOutlinePaint();
      assertEquals(128, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      XYPlot xYPlot0 = mock(XYPlot.class, new ViolatedAssumptionAnswer());
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, valueAxis0.DEFAULT_AXIS_LINE_PAINT, xYPlot0.DEFAULT_CROSSHAIR_PAINT);
      Color color0 = (Color)xYPolygonAnnotation0.getFillPaint();
      assertEquals(255, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = mock(XYPlot.class, new ViolatedAssumptionAnswer());
      doReturn((AxisLocation) null).when(xYPlot0).getDomainAxisLocation();
      doReturn((PlotOrientation) null).when(xYPlot0).getOrientation();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        xYPolygonAnnotation0.draw(graphics2D0, xYPlot0, (Rectangle2D) null, valueAxis0, valueAxis0, 10, plotRenderingInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'location' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      XYPolygonAnnotation xYPolygonAnnotation0 = null;
      try {
        xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'polygon' array must contain an even number of items.
         //
         verifyException("org.jfree.chart.annotations.XYPolygonAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = null;
      try {
        xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, stroke0, paint0, paint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'polygon' array must contain an even number of items.
         //
         verifyException("org.jfree.chart.annotations.XYPolygonAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, stroke0, paint0, paint0);
      xYPolygonAnnotation0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, paint0);
      xYPolygonAnnotation0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, paint0);
      XYPolygonAnnotation xYPolygonAnnotation1 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, (Paint) null);
      boolean boolean0 = xYPolygonAnnotation0.equals(xYPolygonAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Paint paint1 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation1 = new XYPolygonAnnotation(doubleArray0, stroke0, paint0, paint1);
      boolean boolean0 = xYPolygonAnnotation0.equals(xYPolygonAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      double[] doubleArray1 = new double[0];
      XYPolygonAnnotation xYPolygonAnnotation1 = new XYPolygonAnnotation(doubleArray1);
      boolean boolean0 = xYPolygonAnnotation0.equals(xYPolygonAnnotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      Object object0 = xYPolygonAnnotation0.clone();
      boolean boolean0 = xYPolygonAnnotation0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      boolean boolean0 = xYPolygonAnnotation0.equals(xYPolygonAnnotation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      boolean boolean0 = xYPolygonAnnotation0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[20];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_LEFT;
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      XYPlot xYPlot0 = mock(XYPlot.class, new ViolatedAssumptionAnswer());
      doReturn(axisLocation0).when(xYPlot0).getDomainAxisLocation();
      doReturn(plotOrientation0).when(xYPlot0).getOrientation();
      doReturn(axisLocation0).when(xYPlot0).getRangeAxisLocation();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-646.6046446544699), (-646.6046446544699), (double)10, (-904.0)).when(valueAxis0).valueToJava2D(anyDouble() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      EntityCollection entityCollection0 = mock(EntityCollection.class, new ViolatedAssumptionAnswer());
      ChartRenderingInfo chartRenderingInfo0 = mock(ChartRenderingInfo.class, new ViolatedAssumptionAnswer());
      doReturn(entityCollection0).when(chartRenderingInfo0).getEntityCollection();
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      doReturn(chartRenderingInfo0).when(plotRenderingInfo0).getOwner();
      xYPolygonAnnotation0.draw(graphics2D0, xYPlot0, (Rectangle2D) null, valueAxis0, valueAxis0, 10, plotRenderingInfo0);
      assertNull(xYPolygonAnnotation0.getToolTipText());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = mock(XYPlot.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      xYPolygonAnnotation0.draw(graphics2D0, xYPlot0, rectangle2D0, valueAxis0, valueAxis0, 0, plotRenderingInfo0);
      assertTrue(xYPolygonAnnotation0.getNotify());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[20];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_LEFT;
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      XYPlot xYPlot0 = mock(XYPlot.class, new ViolatedAssumptionAnswer());
      doReturn(axisLocation0).when(xYPlot0).getDomainAxisLocation();
      doReturn(plotOrientation0).when(xYPlot0).getOrientation();
      doReturn(axisLocation0).when(xYPlot0).getRangeAxisLocation();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      doReturn((-635.8933573162785), 0.0, (-635.8933573162785), 1753.0, 1753.0).when(valueAxis0).valueToJava2D(anyDouble() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      doReturn((ChartRenderingInfo) null).when(plotRenderingInfo0).getOwner();
      // Undeclared exception!
      try { 
        xYPolygonAnnotation0.draw(graphics2D0, xYPlot0, (Rectangle2D) null, valueAxis0, valueAxis0, 10, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.annotations.AbstractXYAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = null;
      try {
        xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, stroke0, paint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'polygon' array must contain an even number of items.
         //
         verifyException("org.jfree.chart.annotations.XYPolygonAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, (Stroke) null, paint0);
      Paint paint1 = xYPolygonAnnotation0.getFillPaint();
      assertNull(paint1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0);
      double[] doubleArray1 = xYPolygonAnnotation0.getPolygonCoordinates();
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(stroke0).toString();
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(paint0).toString();
      XYPolygonAnnotation xYPolygonAnnotation0 = new XYPolygonAnnotation(doubleArray0, stroke0, paint0, paint0);
      Paint paint1 = xYPolygonAnnotation0.getOutlinePaint();
      Stroke stroke1 = xYPolygonAnnotation0.getOutlineStroke();
      XYPolygonAnnotation xYPolygonAnnotation1 = new XYPolygonAnnotation(doubleArray0, stroke1, paint1);
      boolean boolean0 = xYPolygonAnnotation0.equals(xYPolygonAnnotation1);
      assertFalse(boolean0);
  }
}
