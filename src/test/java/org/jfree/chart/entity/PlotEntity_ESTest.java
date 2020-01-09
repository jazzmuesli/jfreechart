/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:18:44 GMT 2019
 */

package org.jfree.chart.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Shape;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.entity.PlotEntity;
import org.jfree.chart.plot.Plot;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PlotEntity_ESTest extends PlotEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = null;
      try {
        plotEntity0 = new PlotEntity(shape0, (Plot) null, " })x", " })x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = null;
      try {
        plotEntity0 = new PlotEntity(shape0, (Plot) null, "41iw~}=w$8lr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = null;
      try {
        plotEntity0 = new PlotEntity((Shape) null, plot0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'area' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0, "", "");
      Object object0 = plotEntity0.clone();
      assertTrue(object0.equals((Object)plotEntity0));
      
      plotEntity0.setURLText("PlotEntity: tooltip = ");
      boolean boolean0 = plotEntity0.equals(object0);
      assertFalse(object0.equals((Object)plotEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0);
      Object object0 = plotEntity0.clone();
      boolean boolean0 = plotEntity0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0, "9n)?bM0OX+FB^n:Gwzv");
      Plot plot1 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity1 = new PlotEntity(plot0.DEFAULT_LEGEND_ITEM_BOX, plot1, "9n)?bM0OX+FB^n:Gwzv");
      boolean boolean0 = plotEntity0.equals(plotEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0);
      boolean boolean0 = plotEntity0.equals(plotEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      doReturn("AxisLocation not recognised.").when(plot0).toString();
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0, "", "");
      Plot plot1 = plotEntity0.getPlot();
      boolean boolean0 = plotEntity0.equals(plot1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0);
      Object object0 = plotEntity0.clone();
      assertTrue(object0.equals((Object)plotEntity0));
      
      plotEntity0.setToolTipText("");
      boolean boolean0 = plotEntity0.equals(object0);
      assertFalse(object0.equals((Object)plotEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0);
      String string0 = plotEntity0.toString();
      assertEquals("PlotEntity: tooltip = null", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Plot plot0 = mock(Plot.class, new ViolatedAssumptionAnswer());
      PlotEntity plotEntity0 = new PlotEntity(shape0, plot0);
      plotEntity0.hashCode();
  }
}