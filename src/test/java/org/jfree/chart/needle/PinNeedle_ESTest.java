/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:18:45 GMT 2019
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.needle.PinNeedle;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PinNeedle_ESTest extends PinNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0)).when(rectangle2D0).getMaxY();
      doReturn((-1.0)).when(rectangle2D0).getMinX();
      doReturn((-462.650012272)).when(rectangle2D0).getMinY();
      doReturn(3610.497061465, 29.718909187).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      pinNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, 0.0);
      assertEquals(0.5, pinNeedle0.getRotateX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-1.0)).when(rectangle2D0).getMaxY();
      doReturn(1.0).when(rectangle2D0).getMinX();
      doReturn(117.95614539367).when(rectangle2D0).getMinY();
      doReturn((-1.0), 701.9910376).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      pinNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, 0.0);
      assertEquals(0.5, pinNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(rectangle2D0).getMaxY();
      doReturn(0.0).when(rectangle2D0).getMinX();
      doReturn(0.0).when(rectangle2D0).getMinY();
      doReturn(0.0, 0.0).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(point2D0).getX();
      doReturn(0.0).when(point2D0).getY();
      pinNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, (-409.427324032351));
      assertEquals(0.5, pinNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      PinNeedle pinNeedle1 = new PinNeedle();
      boolean boolean0 = pinNeedle0.equals(pinNeedle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      boolean boolean0 = pinNeedle0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      boolean boolean0 = pinNeedle0.equals(pinNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 77.96385768658669).when(rectangle2D0).getMaxY();
      doReturn(77.96385768658669).when(rectangle2D0).getMinX();
      doReturn(77.96385768658669).when(rectangle2D0).getMinY();
      doReturn(0.0, 77.96385768658669).when(rectangle2D0).getWidth();
      pinNeedle0.drawNeedle(graphics2D0, rectangle2D0, (Point2D) null, 0.0);
      assertEquals(0.5, pinNeedle0.getRotateX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      Object object0 = pinNeedle0.clone();
      assertTrue(object0.equals((Object)pinNeedle0));
      
      pinNeedle0.setRotateY((-286.38));
      boolean boolean0 = pinNeedle0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PinNeedle pinNeedle0 = new PinNeedle();
      pinNeedle0.hashCode();
  }
}
