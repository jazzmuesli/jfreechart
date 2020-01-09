/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:11:05 GMT 2019
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GrayPaintScale_ESTest extends GrayPaintScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-3971.865513120828), (-487.4049));
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-3971.865513120828), 1.0, 0);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertFalse(boolean0);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals((-3971.865513120828), grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(0, grayPaintScale1.getAlpha());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-1.0), 0.5569805130887336);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(255, grayPaintScale1.getAlpha());
      assertEquals(0.5569805130887336, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals((-1.0), grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-3971.865513120828), (-487.4049));
      Color color0 = (Color)grayPaintScale0.getPaint((-487.4049));
      assertEquals((-1), color0.getRGB());
      assertEquals((-3971.865513120828), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1.0), 1.0);
      Color color0 = (Color)grayPaintScale0.getPaint((-2767.08475943));
      assertEquals((-16777216), color0.getRGB());
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals((-1.0), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-422.10099), 0.0);
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals((-422.10099), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-3971.865513120828), (-487.4049));
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals((-487.4049), double0, 0.01);
      assertEquals((-3971.865513120828), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(255, 3401.7);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(255.0, double0, 0.01);
      assertEquals(3401.7, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1695.7643895243, 0);
      int int0 = grayPaintScale0.getAlpha();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0, int0);
      assertEquals(1695.7643895243, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(735.5455, 735.5455, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1108.80043123), 1.0);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-1108.80043123), (-1.3934584469032534));
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals((-1108.80043123), grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertEquals(255, grayPaintScale1.getAlpha());
      assertEquals((-1.3934584469032534), grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(14.512302208171032, 86.09);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(14.512302208171032, grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(86.09, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale1.getAlpha());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1108.80043123), 1.0);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
      assertTrue(boolean0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals((-1108.80043123), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1108.80043123), 1.0);
      boolean boolean0 = grayPaintScale0.equals("");
      assertEquals((-1108.80043123), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(255, grayPaintScale0.getAlpha());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(849, 2678.0, 849);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires alpha in the range 0 to 255.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(1.0, 1814.6633278, (-1307632254));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires alpha in the range 0 to 255.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale((-1.0), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1108.80043123), 1.0);
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals((-1108.80043123), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1108.80043123), 1.0);
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertTrue(boolean0);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals((-1108.80043123), grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(255, grayPaintScale1.getAlpha());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1108.80043123), 1.0);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals((-1108.80043123), double0, 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      grayPaintScale0.hashCode();
      assertEquals(255, grayPaintScale0.getAlpha());
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1108.80043123), 1.0);
      int int0 = grayPaintScale0.getAlpha();
      assertEquals(255, int0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals((-1108.80043123), grayPaintScale0.getLowerBound(), 0.01);
  }
}