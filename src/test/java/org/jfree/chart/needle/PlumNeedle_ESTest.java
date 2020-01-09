/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:19:33 GMT 2019
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.needle.PlumNeedle;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PlumNeedle_ESTest extends PlumNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangle2D0).getHeight();
      doReturn(0.0).when(rectangle2D0).getMinX();
      doReturn(0.0).when(rectangle2D0).getMinY();
      doReturn(0.0).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(point2D0).getX();
      doReturn(0.0).when(point2D0).getY();
      plumNeedle0.drawNeedle((Graphics2D) null, rectangle2D0, point2D0, (-1337.744));
      assertEquals(5, plumNeedle0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(270.0).when(rectangle2D0).getHeight();
      doReturn(270.0).when(rectangle2D0).getMinX();
      doReturn(270.0).when(rectangle2D0).getMinY();
      doReturn(1.0).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      doReturn(270.0).when(point2D0).getX();
      doReturn(270.0).when(point2D0).getY();
      plumNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, 1445.63902337);
      assertEquals(0.5, plumNeedle0.getRotateX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics2D0).getColor();
      doReturn((Stroke) null).when(graphics2D0).getStroke();
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn((-658.103704)).when(rectangle2D0).getHeight();
      doReturn((-658.103704)).when(rectangle2D0).getMinX();
      doReturn((-658.103704)).when(rectangle2D0).getMinY();
      doReturn((-658.103704)).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      plumNeedle0.draw(graphics2D0, rectangle2D0, point2D0, 0.0);
      assertEquals(0.5, plumNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      plumNeedle0.hashCode();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      PlumNeedle plumNeedle1 = new PlumNeedle();
      boolean boolean0 = plumNeedle0.equals(plumNeedle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      boolean boolean0 = plumNeedle0.equals("org.jfree.chart.needle.MeterNeedle");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      boolean boolean0 = plumNeedle0.equals(plumNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      PlumNeedle plumNeedle1 = new PlumNeedle();
      assertTrue(plumNeedle1.equals((Object)plumNeedle0));
      
      plumNeedle0.setRotateX(0.0);
      boolean boolean0 = plumNeedle0.equals(plumNeedle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PlumNeedle plumNeedle0 = new PlumNeedle();
      Object object0 = plumNeedle0.clone();
      assertTrue(object0.equals((Object)plumNeedle0));
  }
}