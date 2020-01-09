/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:57:09 GMT 2019
 */

package org.jfree.chart.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ui.RectangleEdge;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class RectangleEdge_ESTest extends RectangleEdge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RectangleEdge[] rectangleEdgeArray0 = RectangleEdge.values();
      assertEquals(4, rectangleEdgeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.valueOf("LEFT");
      assertEquals(RectangleEdge.LEFT, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(866.0, (-878.868985521805), 1509.917636, (-878.868985521805));
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      double double0 = RectangleEdge.coordinate(rectangle2D_Double0, rectangleEdge0);
      assertEquals(866.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 354.88265821905, 0.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      rectangle0.grow((-1142), (-1142));
      double double0 = RectangleEdge.coordinate(rectangle0, rectangleEdge0);
      assertEquals((-787.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      double double0 = RectangleEdge.coordinate(rectangle2D_Double0, (RectangleEdge) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        RectangleEdge.coordinate((Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.RectangleEdge", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      Rectangle rectangle0 = new Rectangle(404, 404);
      double double0 = RectangleEdge.coordinate(rectangle0, rectangleEdge0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(dimension0);
      double double0 = RectangleEdge.coordinate(rectangle0, rectangleEdge0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      assertEquals(RectangleEdge.LEFT, rectangleEdge1);
      
      RectangleEdge rectangleEdge2 = RectangleEdge.opposite(rectangleEdge1);
      assertEquals(RectangleEdge.RIGHT, rectangleEdge2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      assertEquals(RectangleEdge.TOP, rectangleEdge1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      assertEquals(RectangleEdge.BOTTOM, rectangleEdge1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      boolean boolean0 = RectangleEdge.isLeftOrRight(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.opposite((RectangleEdge) null);
      boolean boolean0 = RectangleEdge.isLeftOrRight(rectangleEdge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      boolean boolean0 = RectangleEdge.isLeftOrRight(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      boolean boolean0 = RectangleEdge.isTopOrBottom(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      boolean boolean0 = RectangleEdge.isTopOrBottom(rectangleEdge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      boolean boolean0 = RectangleEdge.isTopOrBottom(rectangleEdge0);
      assertTrue(boolean0);
  }
}