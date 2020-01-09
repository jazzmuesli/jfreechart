/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:16:55 GMT 2019
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.needle.WindNeedle;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class WindNeedle_ESTest extends WindNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      Point point0 = new Point(0, (-2093));
      // Undeclared exception!
      try { 
        windNeedle0.drawNeedle((Graphics2D) null, (Rectangle2D) null, point0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.needle.ArrowNeedle", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      WindNeedle windNeedle1 = new WindNeedle();
      boolean boolean0 = windNeedle0.equals(windNeedle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      boolean boolean0 = windNeedle0.equals(windNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      boolean boolean0 = windNeedle0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      Rectangle rectangle0 = new Rectangle(1, (-1), 1, 1);
      boolean boolean0 = windNeedle0.equals(rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      Rectangle rectangle0 = new Rectangle(1, (-1), 1, 1);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      windNeedle0.drawNeedle((Graphics2D) null, rectangle0, point2D_Double0, 1);
      assertEquals(1, rectangle0.x);
      assertEquals(1.5, rectangle0.getCenterX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      windNeedle0.drawNeedle((Graphics2D) null, rectangle2D_Double0, (Point2D) null, 0.0);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WindNeedle windNeedle0 = new WindNeedle();
      windNeedle0.hashCode();
  }
}
