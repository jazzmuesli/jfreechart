/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:00:58 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.util.DirectionalGradientPaintTransformer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DirectionalGradientPaintTransformer_ESTest extends DirectionalGradientPaintTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = new Color(991);
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 0.0F, color0, 1.0F, 1.0F, color0, false);
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      rectangle0.height = (-1975);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertNotSame(gradientPaint0, gradientPaint1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = new Color(2206, true);
      Rectangle rectangle0 = new Rectangle(2206, (-570), (-570), (-570));
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 0.0F, color0, 2206, 3294.3F, color0, true);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertNotSame(gradientPaint0, gradientPaint1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.PINK;
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, (-3422.102F), color0, (-3422.102F), (-3422.102F), color0, true);
      Rectangle rectangle0 = new Rectangle(2300, 0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      GradientPaint gradientPaint2 = directionalGradientPaintTransformer0.transform(gradientPaint1, rectangle0);
      assertNotSame(gradientPaint0, gradientPaint2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.pink;
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 0.0F, color0, (-2476.965F), 0.0F, color0, false);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertFalse(gradientPaint1.equals((Object)gradientPaint0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Color color0 = Color.MAGENTA;
      GradientPaint gradientPaint0 = new GradientPaint(point2D_Double0, color0, point2D_Double0, color0, true);
      Polygon polygon0 = new Polygon();
      polygon0.addPoint((-4751), 0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, polygon0);
      assertNotSame(gradientPaint0, gradientPaint1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.PINK;
      Rectangle rectangle0 = new Rectangle();
      GradientPaint gradientPaint0 = new GradientPaint(0, 3247.028F, color0, (-1.0F), (-1.0F), color0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertEquals(1, gradientPaint1.getTransparency());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.LIGHT_GRAY;
      Rectangle rectangle0 = new Rectangle((-3103), (-3103));
      GradientPaint gradientPaint0 = new GradientPaint((-770.7593F), 0, color0, 0, (-761.0F), color0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertFalse(gradientPaint1.equals((Object)gradientPaint0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      // Undeclared exception!
      try { 
        directionalGradientPaintTransformer0.transform((GradientPaint) null, (Shape) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.DirectionalGradientPaintTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.MAGENTA;
      Point2D.Double point2D_Double0 = new Point2D.Double(1723.5106878735462, 1723.5106878735462);
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      GradientPaint gradientPaint0 = new GradientPaint(point2D_Double0, color0, point2D_Double0, color0, true);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertTrue(gradientPaint1.isCyclic());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.LIGHT_GRAY;
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 0.0F, color0, 0.0F, (-1.0F), color0);
      Rectangle rectangle0 = new Rectangle((-3103), (-3103));
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertFalse(gradientPaint1.equals((Object)gradientPaint0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.pink;
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 0.0F, color0, 0.0F, (-711.0F), color0, true);
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertFalse(gradientPaint1.equals((Object)gradientPaint0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Color color0 = Color.MAGENTA;
      Point2D.Double point2D_Double1 = new Point2D.Double(1723.5106878735462, 0.0);
      GradientPaint gradientPaint0 = new GradientPaint(point2D_Double0, color0, point2D_Double1, color0, true);
      Polygon polygon0 = new Polygon();
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, polygon0);
      assertFalse(gradientPaint1.equals((Object)gradientPaint0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.BLUE;
      Rectangle rectangle0 = new Rectangle(1, 1, 0, 0);
      GradientPaint gradientPaint0 = new GradientPaint(0, 0, color0, 1.0F, 1.0F, color0, true);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertNotSame(gradientPaint0, gradientPaint1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.BLUE;
      Rectangle rectangle0 = new Rectangle(1, 1, 0, 0);
      GradientPaint gradientPaint0 = new GradientPaint(0, 0, color0, 1.0F, 1.0F, color0, false);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertFalse(gradientPaint1.isCyclic());
  }
}
