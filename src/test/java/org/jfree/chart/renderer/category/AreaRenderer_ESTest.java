/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:31:39 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.AreaRendererEndType;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.data.category.CategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AreaRenderer_ESTest extends AreaRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.createState(plotRenderingInfo0);
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn(10).when(categoryDataset0).getColumnCount();
      doReturn(areaRenderer0.ZERO).when(categoryDataset0).getValue(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        areaRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D0, categoryPlot0, (CategoryAxis) null, (ValueAxis) null, categoryDataset0, 10, 0, 500);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      // Undeclared exception!
      try { 
        areaRenderer0.setEndType((AreaRendererEndType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'type' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset0).getRowKey(anyInt());
      CategoryAxis categoryAxis0 = mock(CategoryAxis.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot(categoryDataset0, categoryAxis0, (ValueAxis) null, areaRenderer0);
      // Undeclared exception!
      try { 
        areaRenderer0.getLegendItem(0, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      CategoryAxis categoryAxis0 = mock(CategoryAxis.class, new ViolatedAssumptionAnswer());
      doReturn((double)1.0F).when(categoryAxis0).getCategoryEnd(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      doReturn(areaRenderer0.ZERO).when(categoryAxis0).getCategoryMiddle(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      doReturn((double)1.0F).when(categoryAxis0).getCategoryStart(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      areaRenderer0.getRangeAxis(categoryPlot0, 10);
      CategoryPlot categoryPlot1 = new CategoryPlot(categoryDataset0, categoryAxis0, (ValueAxis) null, areaRenderer0);
      CategoryAxis categoryAxis1 = areaRenderer0.getDomainAxis(categoryPlot1, 480);
      CategoryDataset categoryDataset1 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn(10, 13).when(categoryDataset1).getColumnCount();
      doReturn(1.0F, 2.0F, (Number) null).when(categoryDataset1).getValue(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        areaRenderer0.drawItem(graphics2D0, (CategoryItemRendererState) null, rectangle2D0, categoryPlot0, categoryAxis1, (ValueAxis) null, categoryDataset1, 500, 10, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      boolean boolean0 = areaRenderer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      boolean boolean0 = areaRenderer0.equals(areaRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      AreaRendererEndType areaRendererEndType0 = AreaRendererEndType.TRUNCATE;
      areaRenderer0.setEndType(areaRendererEndType0);
      AreaRenderer areaRenderer1 = new AreaRenderer();
      boolean boolean0 = areaRenderer0.equals(areaRenderer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      CategoryAxis categoryAxis0 = mock(CategoryAxis.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(categoryAxis0).getCategoryEnd(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      doReturn(0.0).when(categoryAxis0).getCategoryMiddle(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      doReturn(2.0).when(categoryAxis0).getCategoryStart(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      CategoryPlot categoryPlot1 = new CategoryPlot(categoryDataset0, categoryAxis0, (ValueAxis) null, areaRenderer0);
      CategoryAxis categoryAxis1 = areaRenderer0.getDomainAxis(categoryPlot1, 480);
      CategoryDataset categoryDataset1 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn(480, 13).when(categoryDataset1).getColumnCount();
      doReturn(categoryAxis1.DEFAULT_AXIS_MARGIN, 1.0F, (Number) null).when(categoryDataset1).getValue(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        areaRenderer0.drawItem(graphics2D0, (CategoryItemRendererState) null, rectangle2D0, categoryPlot0, categoryAxis1, (ValueAxis) null, categoryDataset1, 500, 10, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      CategoryAxis categoryAxis0 = mock(CategoryAxis.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(categoryAxis0).getCategoryEnd(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      doReturn(0.0).when(categoryAxis0).getCategoryMiddle(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      doReturn(0.0).when(categoryAxis0).getCategoryStart(anyInt() , anyInt() , any(java.awt.geom.Rectangle2D.class) , any(org.jfree.chart.ui.RectangleEdge.class));
      ValueAxis valueAxis0 = areaRenderer0.getRangeAxis(categoryPlot0, 10);
      CategoryPlot categoryPlot1 = new CategoryPlot(categoryDataset0, categoryAxis0, (ValueAxis) null, areaRenderer0);
      CategoryAxis categoryAxis1 = areaRenderer0.getDomainAxis(categoryPlot1, 480);
      CategoryDataset categoryDataset1 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn(328, 1).when(categoryDataset1).getColumnCount();
      doReturn(valueAxis0.DEFAULT_AUTO_RANGE_MINIMUM_SIZE, 0.05).when(categoryDataset1).getValue(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        areaRenderer0.drawItem(graphics2D0, (CategoryItemRendererState) null, rectangle2D0, categoryPlot0, categoryAxis1, (ValueAxis) null, categoryDataset1, 500, 10, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AreaRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Number) null).when(categoryDataset0).getValue(anyInt() , anyInt());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.createState((PlotRenderingInfo) null);
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot();
      areaRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D0, categoryPlot0, (CategoryAxis) null, (ValueAxis) null, categoryDataset0, (-3418), 10, (-2524));
      assertFalse(CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn(true, (Comparable) null).when(categoryDataset0).getRowKey(anyInt());
      CategoryAxis categoryAxis0 = mock(CategoryAxis.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot(categoryDataset0, categoryAxis0, (ValueAxis) null, areaRenderer0);
      LegendItem legendItem0 = areaRenderer0.getLegendItem(0, 10);
      assertEquals(10, legendItem0.getSeriesIndex());
      assertNotNull(legendItem0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      LegendItem legendItem0 = areaRenderer0.getLegendItem(1, 1);
      assertNull(legendItem0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      CategoryPlot categoryPlot0 = new CategoryPlot(categoryDataset0, (CategoryAxis) null, (ValueAxis) null, areaRenderer0);
      // Undeclared exception!
      try { 
        areaRenderer0.getLegendItem(500, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      AreaRendererEndType areaRendererEndType0 = areaRenderer0.getEndType();
      assertEquals(AreaRendererEndType.TAPER, areaRendererEndType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Object object0 = areaRenderer0.clone();
      boolean boolean0 = areaRenderer0.equals(object0);
      assertTrue(boolean0);
  }
}
