/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:41:36 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.SystemColor;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.PaintAlpha;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PaintAlpha_ESTest extends PaintAlpha_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = PaintAlpha.setLegacyAlpha(true);
      boolean boolean1 = PaintAlpha.setLegacyAlpha(true);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        PaintAlpha.cloneImage((BufferedImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.PaintAlpha", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(334, 4, 4);
      BufferedImage bufferedImage1 = PaintAlpha.cloneImage(bufferedImage0);
      assertNotSame(bufferedImage0, bufferedImage1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Paint paint0 = PaintAlpha.darker((Paint) null);
      assertNull(paint0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PaintAlpha paintAlpha0 = new PaintAlpha();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      SystemColor systemColor0 = SystemColor.window;
      GradientPaint gradientPaint0 = new GradientPaint(point2D_Double0, systemColor0, point2D_Double0, systemColor0, true);
      Paint paint0 = PaintAlpha.darker(gradientPaint0);
      assertNotSame(paint0, gradientPaint0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.menuText;
      Color color0 = (Color)PaintAlpha.darker(systemColor0);
      assertEquals(0, color0.getRed());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PaintAlpha.setLegacyAlpha(true);
      Paint paint0 = PaintAlpha.darker((Paint) null);
      assertNull(paint0);
  }
}
