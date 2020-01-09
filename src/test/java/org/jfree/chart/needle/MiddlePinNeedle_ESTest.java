/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:13:17 GMT 2019
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.needle.MiddlePinNeedle;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MiddlePinNeedle_ESTest extends MiddlePinNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(547.0648399262396).when(rectangle2D0).getMaxY();
      doReturn(547.0648399262396).when(rectangle2D0).getMinX();
      doReturn((-1.0)).when(rectangle2D0).getMinY();
      doReturn(0.0, 25.177945256344994).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      doReturn(3773.6721097155).when(point2D0).getX();
      doReturn((-550.2145154217786)).when(point2D0).getY();
      middlePinNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, (-1536.8171993507567));
      assertEquals(0.5, middlePinNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      boolean boolean0 = middlePinNeedle0.equals(middlePinNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      Stroke stroke0 = middlePinNeedle0.getOutlineStroke();
      boolean boolean0 = middlePinNeedle0.equals(stroke0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangle2D0).getMaxY();
      doReturn(0.0).when(rectangle2D0).getMinX();
      doReturn(0.0).when(rectangle2D0).getMinY();
      doReturn(0.0, 0.0).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(point2D0).getX();
      doReturn(0.0).when(point2D0).getY();
      middlePinNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, 1167.0);
      assertEquals(0.5, middlePinNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn((-352.2966003)).when(rectangle2D0).getMaxY();
      doReturn((-1.0)).when(rectangle2D0).getMinX();
      doReturn((-2330.0)).when(rectangle2D0).getMinY();
      doReturn((-2330.0), (-1.0)).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      middlePinNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, 0.0);
      assertEquals(0.5, middlePinNeedle0.getRotateX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn((-201.2406524579)).when(rectangle2D0).getMaxY();
      doReturn((-2330.0)).when(rectangle2D0).getMinX();
      doReturn(2551.085130582642).when(rectangle2D0).getMinY();
      doReturn((-4696.632723778411), 747.7300769467352).when(rectangle2D0).getWidth();
      middlePinNeedle0.drawNeedle(graphics2D0, rectangle2D0, (Point2D) null, (-3503.993620765));
      assertEquals(0.5, middlePinNeedle0.getRotateX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      Object object0 = middlePinNeedle0.clone();
      boolean boolean0 = middlePinNeedle0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MiddlePinNeedle middlePinNeedle0 = new MiddlePinNeedle();
      middlePinNeedle0.hashCode();
  }
}
