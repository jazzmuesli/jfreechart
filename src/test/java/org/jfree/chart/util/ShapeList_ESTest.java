/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:10:01 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.ShapeList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ShapeList_ESTest extends ShapeList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Polygon polygon0 = new Polygon();
      shapeList0.setShape(5220, polygon0);
      Polygon polygon1 = new Polygon();
      polygon1.invalidate();
      Point2D.Float point2D_Float0 = new Point2D.Float();
      point2D_Float0.setLocation((float) 8, 2323.13F);
      point2D_Float0.x = (float) 8;
      polygon1.contains((Point2D) point2D_Float0);
      shapeList0.equals(polygon1);
      shapeList0.equals(polygon1);
      shapeList0.clone();
      ShapeList shapeList1 = new ShapeList();
      shapeList1.clear();
      // Undeclared exception!
      shapeList0.equals(shapeList1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Object object0 = shapeList0.clone();
      shapeList0.clone();
      Point point0 = new Point(1, 8);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      shapeList0.setShape(1, line2D_Double0);
      shapeList0.clear();
      shapeList0.set(477, object0);
      shapeList0.hashCode();
      Object object1 = new Object();
      shapeList0.equals(object1);
      Object object2 = shapeList0.clone();
      // Undeclared exception!
      try { 
        shapeList0.equals(object2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.util.ShapeList cannot be cast to java.awt.Shape
         //
         verifyException("org.jfree.chart.util.ShapeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.clone();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.setFrameFromDiagonal((double) 8, 0.0, 1.0, (-2516.4879011007115));
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      shapeList0.setShape(0, rectangle0);
      Dimension dimension0 = new Dimension();
      Rectangle rectangle1 = new Rectangle(dimension0);
      Rectangle2D.Double rectangle2D_Double1 = new Rectangle2D.Double();
      Rectangle2D rectangle2D0 = rectangle2D_Double1.getBounds2D();
      Rectangle2D rectangle2D1 = rectangle1.createUnion(rectangle2D0);
      shapeList0.setShape(0, rectangle2D1);
      shapeList0.set(0, "");
      shapeList0.equals("");
      shapeList0.clone();
      shapeList0.getShape(872);
      shapeList0.clone();
      shapeList0.setShape(872, (Shape) null);
      shapeList0.equals((Object) null);
      // Undeclared exception!
      try { 
        shapeList0.getShape(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.awt.Shape
         //
         verifyException("org.jfree.chart.util.ShapeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Line2D.Float line2D_Float0 = new Line2D.Float(244.0F, 1159.6567F, 0, 0);
      shapeList0.setShape(0, line2D_Float0);
      shapeList0.getShape(0);
      shapeList0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      ShapeList shapeList1 = new ShapeList();
      Object object0 = shapeList0.clone();
      shapeList0.equals(shapeList1);
      shapeList0.equals(shapeList1);
      Object object1 = new Object();
      shapeList1.equals(object1);
      shapeList1.set(0, object0);
      shapeList0.hashCode();
      shapeList1.getShape(8);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.clone();
      shapeList0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.getShape(2818);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.clone();
      int int0 = 0;
      Point point0 = new Point(0, 0);
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      // Undeclared exception!
      try { 
        shapeList0.setShape((-2043), rectangle2D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.equals((Object) null);
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      shapeList0.setShape(0, rectangle0);
      ShapeList shapeList1 = new ShapeList();
      shapeList1.set(8, shapeList0);
      shapeList0.equals(shapeList1);
      shapeList1.clone();
      shapeList0.clone();
      shapeList0.clone();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.set(966, "!WH'UB>Rh,wO^&II15");
      shapeList0.hashCode();
      shapeList0.clone();
      Object object0 = shapeList0.clone();
      ShapeList shapeList1 = new ShapeList();
      // Undeclared exception!
      try { 
        object0.equals(shapeList1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.awt.Shape
         //
         verifyException("org.jfree.chart.util.ShapeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.hashCode();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle rectangle0 = new Rectangle(8, 17, 0, 2013);
      Rectangle rectangle1 = new Rectangle(rectangle0);
      Rectangle2D rectangle2D0 = rectangle1.getBounds2D();
      rectangle2D_Float0.contains(rectangle2D0);
      AffineTransform affineTransform0 = new AffineTransform(2013, 2013, 17, (-93.4), 8, 1.0);
      rectangle1.getPathIterator(affineTransform0, (-730.95727185856));
      rectangle2D_Float0.setRect((double) 17, (double) 0, (double) 0, (double) 0);
      Rectangle2D.union(rectangle2D_Float0, rectangle2D_Float0, rectangle2D_Float0);
      ShapeList shapeList1 = (ShapeList)shapeList0.clone();
      shapeList0.setShape(17, rectangle2D_Float0);
      shapeList0.hashCode();
      Rectangle2D.Float rectangle2D_Float1 = (Rectangle2D.Float)shapeList0.getShape(17);
      shapeList0.equals(rectangle2D_Float0);
      shapeList0.setShape(1612, rectangle2D_Float0);
      ShapeList shapeList2 = (ShapeList)shapeList0.clone();
      shapeList0.equals(shapeList2);
      shapeList0.equals("dC0DWgy");
      shapeList0.equals(rectangle2D_Float1);
      shapeList0.equals(shapeList0);
      shapeList0.hashCode();
      shapeList0.clear();
      shapeList1.getShape(8);
      shapeList0.clone();
      shapeList0.getShape(1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Object object0 = new Object();
      shapeList0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Object object0 = shapeList0.clone();
      shapeList0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      shapeList0.setShape(0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.getShape((-2538));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Rectangle rectangle0 = new Rectangle();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.clone();
      shapeList0.clone();
      Object object0 = shapeList0.clone();
      Polygon polygon0 = new Polygon();
      polygon0.contains(0.0, (double) 8);
      shapeList0.set(1923, polygon0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.setFrameFromDiagonal((double) 8, 0.0, (double) 0, 0.0);
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getBounds2D();
      polygon0.contains(rectangle2D0);
      shapeList0.equals(object0);
      shapeList0.clone();
      shapeList0.setShape(1923, polygon0);
  }
}