/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:08:24 GMT 2019
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.needle.PointerNeedle;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PointerNeedle_ESTest extends PointerNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(939.6457F, 0.0F, (-1.0F), 4764.0F);
      Point2D.Double point2D_Double0 = new Point2D.Double(2.0, 0.0F);
      pointerNeedle0.drawNeedle((Graphics2D) null, rectangle2D_Float0, point2D_Double0, (-2858.497547295517));
      assertEquals((-1.0F), rectangle2D_Float0.width, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Color color0 = Color.pink;
      pointerNeedle0.setOutlinePaint(color0);
      PointerNeedle pointerNeedle1 = new PointerNeedle();
      boolean boolean0 = pointerNeedle0.equals(pointerNeedle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      PointerNeedle pointerNeedle1 = new PointerNeedle();
      boolean boolean0 = pointerNeedle0.equals(pointerNeedle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      boolean boolean0 = pointerNeedle0.equals(pointerNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Object object0 = new Object();
      boolean boolean0 = pointerNeedle0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Color color0 = Color.pink;
      pointerNeedle0.setOutlinePaint(color0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(1, 1);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      pointerNeedle0.drawNeedle(graphics2D0, rectangle0, point2D_Double0, 0.0);
      assertEquals(0, rectangle0.x);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Color color0 = Color.WHITE;
      pointerNeedle0.setHighlightPaint(color0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(dimension0);
      pointerNeedle0.drawNeedle(graphics2D0, rectangle0, (Point2D) null, 0);
      assertEquals(0.0, rectangle0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Color color0 = Color.pink;
      pointerNeedle0.setFillPaint(color0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(1, 1);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      pointerNeedle0.drawNeedle(graphics2D0, rectangle0, point2D_Double0, 0.0);
      assertEquals(0, rectangle0.x);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Rectangle rectangle0 = new Rectangle(1, 1);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      pointerNeedle0.drawNeedle((Graphics2D) null, rectangle0, point2D_Double0, 5312.8);
      assertEquals(0.5, rectangle0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      Object object0 = pointerNeedle0.clone();
      assertNotSame(pointerNeedle0, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PointerNeedle pointerNeedle0 = new PointerNeedle();
      pointerNeedle0.hashCode();
  }
}
