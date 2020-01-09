/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:22:23 GMT 2019
 */

package org.jfree.chart.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.entity.LegendItemEntity;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultHeatMapDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LegendItemEntity_ESTest extends LegendItemEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(37, (-1281));
      Rectangle2D rectangle2D0 = rectangle0.getFrame();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle2D0);
      DefaultHeatMapDataset defaultHeatMapDataset0 = new DefaultHeatMapDataset(580, 37, 0, 1476.678726, (-1281), (-1.0));
      legendItemEntity0.setDataset(defaultHeatMapDataset0);
      DefaultHeatMapDataset defaultHeatMapDataset1 = (DefaultHeatMapDataset)legendItemEntity0.getDataset();
      assertEquals((-1281.0), defaultHeatMapDataset1.getMinimumYValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LegendItemEntity legendItemEntity0 = null;
      try {
        legendItemEntity0 = new LegendItemEntity((Shape) null);
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
      Rectangle rectangle0 = new Rectangle();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      LegendItemEntity legendItemEntity1 = (LegendItemEntity)legendItemEntity0.clone();
      assertTrue(legendItemEntity1.equals((Object)legendItemEntity0));
      
      DefaultHeatMapDataset defaultHeatMapDataset0 = new DefaultHeatMapDataset(17, 17, 0, 17, 0, 0);
      legendItemEntity1.setDataset(defaultHeatMapDataset0);
      boolean boolean0 = legendItemEntity0.equals(legendItemEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      Object object0 = legendItemEntity0.clone();
      legendItemEntity0.setSeriesKey("LegendItemEntity: seriesKey=null, dataset=null");
      boolean boolean0 = legendItemEntity0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      boolean boolean0 = legendItemEntity0.equals(legendItemEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      boolean boolean0 = legendItemEntity0.equals("LegendItemEntity: seriesKey=null, dataset=null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      String string0 = legendItemEntity0.toString();
      assertEquals("LegendItemEntity: seriesKey=null, dataset=null", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      Comparable comparable0 = legendItemEntity0.getSeriesKey();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      legendItemEntity0.setSeriesKey("LegendItemEntity: seriesKey=null, dataset=null");
      Comparable comparable0 = legendItemEntity0.getSeriesKey();
      assertEquals("LegendItemEntity: seriesKey=null, dataset=null", comparable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      Object object0 = legendItemEntity0.clone();
      boolean boolean0 = legendItemEntity0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(rectangle0);
      Dataset dataset0 = legendItemEntity0.getDataset();
      assertNull(dataset0);
  }
}