/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:41:00 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.LineUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LineUtils_ESTest extends LineUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1, 1, 1, 1);
      assertEquals(1, rectangle0.x);
      assertEquals(1, rectangle0.width);
      assertEquals(1, rectangle0.y);
      assertEquals(1, rectangle0.height);
      assertEquals(1.0, rectangle0.getWidth(), 0.01);
      assertEquals(1.0, rectangle0.getMinY(), 0.01);
      assertEquals(1.0, rectangle0.getMinX(), 0.01);
      assertEquals(1.0, rectangle0.getHeight(), 0.01);
      assertFalse(rectangle0.isEmpty());
      assertEquals(1.5, rectangle0.getCenterY(), 0.01);
      assertEquals(1.0, rectangle0.getX(), 0.01);
      assertEquals(2.0, rectangle0.getMaxY(), 0.01);
      assertEquals(1.0, rectangle0.getY(), 0.01);
      assertEquals(2.0, rectangle0.getMaxX(), 0.01);
      assertEquals(1.5, rectangle0.getCenterX(), 0.01);
      assertNotNull(rectangle0);
      
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0F, 1, 1, 1);
      assertEquals(0.0, line2D_Double0.x1, 0.01);
      assertEquals(1.0, line2D_Double0.y2, 0.01);
      assertEquals(1.0, line2D_Double0.y1, 0.01);
      assertEquals(1.0, line2D_Double0.x2, 0.01);
      assertNotNull(line2D_Double0);
      
      boolean boolean0 = LineUtils.clipLine(line2D_Double0, rectangle0);
      assertEquals(1, rectangle0.x);
      assertEquals(1, rectangle0.width);
      assertEquals(1, rectangle0.y);
      assertEquals(1, rectangle0.height);
      assertEquals(1.0, line2D_Double0.x1, 0.01);
      assertEquals(1.0, line2D_Double0.y2, 0.01);
      assertEquals(1.0, line2D_Double0.y1, 0.01);
      assertEquals(1.0, line2D_Double0.x2, 0.01);
      assertEquals(1.0, rectangle0.getWidth(), 0.01);
      assertEquals(1.0, rectangle0.getMinY(), 0.01);
      assertEquals(1.0, rectangle0.getMinX(), 0.01);
      assertEquals(1.0, rectangle0.getHeight(), 0.01);
      assertFalse(rectangle0.isEmpty());
      assertEquals(1.5, rectangle0.getCenterY(), 0.01);
      assertEquals(1.0, rectangle0.getX(), 0.01);
      assertEquals(2.0, rectangle0.getMaxY(), 0.01);
      assertEquals(1.0, rectangle0.getY(), 0.01);
      assertEquals(2.0, rectangle0.getMaxX(), 0.01);
      assertEquals(1.5, rectangle0.getCenterX(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      assertEquals(0.0, line2D_Double0.y1, 0.01);
      assertEquals(0.0, line2D_Double0.x1, 0.01);
      assertEquals(0.0, line2D_Double0.y2, 0.01);
      assertEquals(0.0, line2D_Double0.x2, 0.01);
      assertNotNull(line2D_Double0);
      
      line2D_Double0.setLine(3979.0, (-4.0), 2035.7285882, 6.514158189915044E7);
      assertEquals((-4.0), line2D_Double0.y1, 0.01);
      assertEquals(2035.7285882, line2D_Double0.x2, 0.01);
      assertEquals(6.514158189915044E7, line2D_Double0.y2, 0.01);
      assertEquals(3979.0, line2D_Double0.x1, 0.01);
      
      line2D_Double0.x2 = 6.514158189915044E7;
      Rectangle rectangle0 = line2D_Double0.getBounds();
      assertEquals((-4.0), line2D_Double0.y1, 0.01);
      assertEquals(6.514158189915044E7, line2D_Double0.y2, 0.01);
      assertEquals(3979.0, line2D_Double0.x1, 0.01);
      assertEquals(6.514158189915044E7, line2D_Double0.x2, 0.01);
      assertEquals(65137603, rectangle0.width);
      assertEquals(65141586, rectangle0.height);
      assertEquals((-4), rectangle0.y);
      assertEquals(3979, rectangle0.x);
      assertEquals(3979.0, rectangle0.getX(), 0.01);
      assertEquals(3.25727805E7, rectangle0.getCenterX(), 0.01);
      assertEquals(6.5137603E7, rectangle0.getWidth(), 0.01);
      assertEquals(6.5141582E7, rectangle0.getMaxX(), 0.01);
      assertEquals(6.5141582E7, rectangle0.getMaxY(), 0.01);
      assertEquals(3.2570789E7, rectangle0.getCenterY(), 0.01);
      assertEquals(3979.0, rectangle0.getMinX(), 0.01);
      assertEquals((-4.0), rectangle0.getMinY(), 0.01);
      assertEquals((-4.0), rectangle0.getY(), 0.01);
      assertEquals(6.5141586E7, rectangle0.getHeight(), 0.01);
      assertFalse(rectangle0.isEmpty());
      assertNotNull(rectangle0);
      
      Line2D.Double line2D_Double1 = (Line2D.Double)LineUtils.extendLine(line2D_Double0, 2726.8983691, 2726.8983691);
      assertEquals((-4.0), line2D_Double0.y1, 0.01);
      assertEquals(6.514158189915044E7, line2D_Double0.y2, 0.01);
      assertEquals(3979.0, line2D_Double0.x1, 0.01);
      assertEquals(6.514158189915044E7, line2D_Double0.x2, 0.01);
      assertEquals((-1.7763448435298087E11), line2D_Double1.y1, 0.01);
      assertEquals(1.776887646946759E11, line2D_Double1.x2, 0.01);
      assertEquals(1.7769962593088E11, line2D_Double1.y2, 0.01);
      assertEquals((-1.7762361913377676E11), line2D_Double1.x1, 0.01);
      assertFalse(line2D_Double1.equals((Object)line2D_Double0));
      assertNotSame(line2D_Double0, line2D_Double1);
      assertNotSame(line2D_Double1, line2D_Double0);
      assertNotNull(line2D_Double1);
      
      boolean boolean0 = LineUtils.clipLine(line2D_Double1, rectangle0);
      assertEquals((-4.0), line2D_Double0.y1, 0.01);
      assertEquals(6.514158189915044E7, line2D_Double0.y2, 0.01);
      assertEquals(3979.0, line2D_Double0.x1, 0.01);
      assertEquals(6.514158189915044E7, line2D_Double0.x2, 0.01);
      assertEquals(65137603, rectangle0.width);
      assertEquals(65141586, rectangle0.height);
      assertEquals((-4), rectangle0.y);
      assertEquals(3979, rectangle0.x);
      assertEquals((-4.0), line2D_Double1.y1, 0.01);
      assertEquals(6.5141582E7, line2D_Double1.y2, 0.01);
      assertEquals(3979.0, line2D_Double1.x1, 0.01);
      assertEquals(6.5141582E7, line2D_Double1.x2, 0.01);
      assertFalse(line2D_Double0.equals((Object)line2D_Double1));
      assertFalse(line2D_Double1.equals((Object)line2D_Double0));
      assertEquals(3979.0, rectangle0.getX(), 0.01);
      assertEquals(3.25727805E7, rectangle0.getCenterX(), 0.01);
      assertEquals(6.5137603E7, rectangle0.getWidth(), 0.01);
      assertEquals(6.5141582E7, rectangle0.getMaxX(), 0.01);
      assertEquals(6.5141582E7, rectangle0.getMaxY(), 0.01);
      assertEquals(3.2570789E7, rectangle0.getCenterY(), 0.01);
      assertEquals(3979.0, rectangle0.getMinX(), 0.01);
      assertEquals((-4.0), rectangle0.getMinY(), 0.01);
      assertEquals((-4.0), rectangle0.getY(), 0.01);
      assertEquals(6.5141586E7, rectangle0.getHeight(), 0.01);
      assertFalse(rectangle0.isEmpty());
      assertTrue(boolean0);
      assertNotSame(line2D_Double0, line2D_Double1);
      assertNotSame(line2D_Double1, line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        LineUtils.extendLine((Line2D) null, 335.0560794, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'line' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      assertEquals(0.0F, line2D_Float0.x2, 0.01F);
      assertEquals(0.0F, line2D_Float0.x1, 0.01F);
      assertEquals(0.0F, line2D_Float0.y2, 0.01F);
      assertEquals(0.0F, line2D_Float0.y1, 0.01F);
      assertNotNull(line2D_Float0);
      
      // Undeclared exception!
      try { 
        LineUtils.clipLine(line2D_Float0, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.LineUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, (-2690.9F), (-1.0F), (-771.7446F));
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertNotNull(line2D_Float0);
      
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)line2D_Float0.getBounds2D();
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-1.0F), rectangle2D_Float0.x, 0.01F);
      assertEquals(2.0F, rectangle2D_Float0.width, 0.01F);
      assertEquals(1919.1553F, rectangle2D_Float0.height, 0.01F);
      assertEquals((-2690.9F), rectangle2D_Float0.y, 0.01F);
      assertEquals((-2690.89990234375), rectangle2D_Float0.getMinY(), 0.01);
      assertEquals((-771.74462890625), rectangle2D_Float0.getMaxY(), 0.01);
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals((-1.0), rectangle2D_Float0.getMinX(), 0.01);
      assertEquals(0.0, rectangle2D_Float0.getCenterX(), 0.01);
      assertEquals((-1731.322265625), rectangle2D_Float0.getCenterY(), 0.01);
      assertNotNull(rectangle2D_Float0);
      
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, (-1093.138), 2.0F, (-5157.0926513671875));
      assertEquals((-1093.138), line2D_Double0.y1, 0.01);
      assertEquals(0.0, line2D_Double0.x1, 0.01);
      assertEquals((-5157.0926513671875), line2D_Double0.y2, 0.01);
      assertEquals(2.0, line2D_Double0.x2, 0.01);
      assertNotNull(line2D_Double0);
      
      boolean boolean0 = LineUtils.clipLine(line2D_Double0, rectangle2D_Float0);
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-1.0F), rectangle2D_Float0.x, 0.01F);
      assertEquals(2.0F, rectangle2D_Float0.width, 0.01F);
      assertEquals(1919.1553F, rectangle2D_Float0.height, 0.01F);
      assertEquals((-2690.9F), rectangle2D_Float0.y, 0.01F);
      assertEquals((-1093.138), line2D_Double0.y1, 0.01);
      assertEquals(0.0, line2D_Double0.x1, 0.01);
      assertEquals(0.7863089229139081, line2D_Double0.x2, 0.01);
      assertEquals((-2690.89990234375), line2D_Double0.y2, 0.01);
      assertEquals((-2690.89990234375), rectangle2D_Float0.getMinY(), 0.01);
      assertEquals((-771.74462890625), rectangle2D_Float0.getMaxY(), 0.01);
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals((-1.0), rectangle2D_Float0.getMinX(), 0.01);
      assertEquals(0.0, rectangle2D_Float0.getCenterX(), 0.01);
      assertEquals((-1731.322265625), rectangle2D_Float0.getCenterY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, (-2690.9F), (-1.0F), (-771.7446F));
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertNotNull(line2D_Float0);
      
      Line2D.Double line2D_Double0 = (Line2D.Double)LineUtils.extendLine(line2D_Float0, 1.0, 1.0);
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals((-3.0), line2D_Double0.x2, 0.01);
      assertEquals((-4610.05517578125), line2D_Double0.y1, 0.01);
      assertEquals(3.0, line2D_Double0.x1, 0.01);
      assertEquals(1147.41064453125, line2D_Double0.y2, 0.01);
      assertNotNull(line2D_Double0);
      
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)line2D_Float0.getBounds2D();
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals(1919.1553F, rectangle2D_Float0.height, 0.01F);
      assertEquals((-2690.9F), rectangle2D_Float0.y, 0.01F);
      assertEquals(2.0F, rectangle2D_Float0.width, 0.01F);
      assertEquals((-1.0F), rectangle2D_Float0.x, 0.01F);
      assertEquals((-2690.89990234375), rectangle2D_Float0.getMinY(), 0.01);
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals(0.0, rectangle2D_Float0.getCenterX(), 0.01);
      assertEquals((-1731.322265625), rectangle2D_Float0.getCenterY(), 0.01);
      assertEquals((-1.0), rectangle2D_Float0.getMinX(), 0.01);
      assertEquals((-771.74462890625), rectangle2D_Float0.getMaxY(), 0.01);
      assertNotNull(rectangle2D_Float0);
      
      rectangle2D_Float0.add((-4610.05517578125), (-605.597447038));
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals(2085.3025F, rectangle2D_Float0.height, 0.01F);
      assertEquals((-2690.9F), rectangle2D_Float0.y, 0.01F);
      assertEquals((-4610.055F), rectangle2D_Float0.x, 0.01F);
      assertEquals(4611.055F, rectangle2D_Float0.width, 0.01F);
      assertEquals((-2690.89990234375), rectangle2D_Float0.getMinY(), 0.01);
      assertEquals((-1648.2486572265625), rectangle2D_Float0.getCenterY(), 0.01);
      assertEquals((-605.597412109375), rectangle2D_Float0.getMaxY(), 0.01);
      assertEquals((-4610.05517578125), rectangle2D_Float0.getMinX(), 0.01);
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals((-2304.527587890625), rectangle2D_Float0.getCenterX(), 0.01);
      
      boolean boolean0 = LineUtils.clipLine(line2D_Double0, rectangle2D_Float0);
      assertEquals((-771.7446F), line2D_Float0.y2, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-1.0F), line2D_Float0.x2, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals((-605.597412109375), line2D_Double0.y2, 0.01);
      assertEquals((-1.1731461952000162), line2D_Double0.x2, 0.01);
      assertEquals(1.0, line2D_Double0.x1, 0.01);
      assertEquals((-2690.89990234375), line2D_Double0.y1, 0.01);
      assertEquals(2085.3025F, rectangle2D_Float0.height, 0.01F);
      assertEquals((-2690.9F), rectangle2D_Float0.y, 0.01F);
      assertEquals((-4610.055F), rectangle2D_Float0.x, 0.01F);
      assertEquals(4611.055F, rectangle2D_Float0.width, 0.01F);
      assertEquals((-2690.89990234375), rectangle2D_Float0.getMinY(), 0.01);
      assertEquals((-1648.2486572265625), rectangle2D_Float0.getCenterY(), 0.01);
      assertEquals((-605.597412109375), rectangle2D_Float0.getMaxY(), 0.01);
      assertEquals((-4610.05517578125), rectangle2D_Float0.getMinX(), 0.01);
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals((-2304.527587890625), rectangle2D_Float0.getCenterX(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, (-2690.9F), 0.84406567F, (-771.401F));
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals((-2690.9F), line2D_Float0.y1, 0.01F);
      assertEquals(0.84406567F, line2D_Float0.x2, 0.01F);
      assertEquals((-771.401F), line2D_Float0.y2, 0.01F);
      assertNotNull(line2D_Float0);
      
      line2D_Float0.y1 = 1.0F;
      Line2D.Double line2D_Double0 = (Line2D.Double)LineUtils.extendLine(line2D_Float0, 0.84406567F, 1.0F);
      assertEquals(1.0F, line2D_Float0.y1, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals(0.84406567F, line2D_Float0.x2, 0.01F);
      assertEquals((-771.401F), line2D_Float0.y2, 0.01F);
      assertEquals(0.6881313323974609, line2D_Double0.x2, 0.01);
      assertEquals((-1543.802001953125), line2D_Double0.y2, 0.01);
      assertEquals(652.9571654618485, line2D_Double0.y1, 0.01);
      assertEquals(1.1316188173432238, line2D_Double0.x1, 0.01);
      assertNotNull(line2D_Double0);
      
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)line2D_Float0.getBounds2D();
      assertEquals(1.0F, line2D_Float0.y1, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals(0.84406567F, line2D_Float0.x2, 0.01F);
      assertEquals((-771.401F), line2D_Float0.y2, 0.01F);
      assertEquals(0.84406567F, rectangle2D_Float0.x, 0.01F);
      assertEquals(772.401F, rectangle2D_Float0.height, 0.01F);
      assertEquals(0.15593433F, rectangle2D_Float0.width, 0.01F);
      assertEquals((-771.401F), rectangle2D_Float0.y, 0.01F);
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals(1.0, rectangle2D_Float0.getMaxY(), 0.01);
      assertEquals(0.9220328330993652, rectangle2D_Float0.getCenterX(), 0.01);
      assertEquals((-385.20050048828125), rectangle2D_Float0.getCenterY(), 0.01);
      assertEquals(0.8440656661987305, rectangle2D_Float0.getMinX(), 0.01);
      assertEquals((-771.4010009765625), rectangle2D_Float0.getMinY(), 0.01);
      assertNotNull(rectangle2D_Float0);
      
      rectangle2D_Float0.height = 0.84406567F;
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals(0.9220328330993652, rectangle2D_Float0.getCenterX(), 0.01);
      assertEquals(0.8440656661987305, rectangle2D_Float0.getMinX(), 0.01);
      assertEquals((-770.9789681434631), rectangle2D_Float0.getCenterY(), 0.01);
      assertEquals((-771.4010009765625), rectangle2D_Float0.getMinY(), 0.01);
      assertEquals((-770.5569353103638), rectangle2D_Float0.getMaxY(), 0.01);
      
      boolean boolean0 = LineUtils.clipLine(line2D_Double0, rectangle2D_Float0);
      assertEquals(1.0F, line2D_Float0.y1, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals(0.84406567F, line2D_Float0.x2, 0.01F);
      assertEquals((-771.401F), line2D_Float0.y2, 0.01F);
      assertEquals(0.8442360683825402, line2D_Double0.x1, 0.01);
      assertEquals(0.8440656661987305, line2D_Double0.x2, 0.01);
      assertEquals((-770.5569353103638), line2D_Double0.y1, 0.01);
      assertEquals((-771.4010009765624), line2D_Double0.y2, 0.01);
      assertEquals(0.84406567F, rectangle2D_Float0.height, 0.01F);
      assertEquals(0.84406567F, rectangle2D_Float0.x, 0.01F);
      assertEquals(0.15593433F, rectangle2D_Float0.width, 0.01F);
      assertEquals((-771.401F), rectangle2D_Float0.y, 0.01F);
      assertEquals(1.0, rectangle2D_Float0.getMaxX(), 0.01);
      assertEquals(0.9220328330993652, rectangle2D_Float0.getCenterX(), 0.01);
      assertEquals(0.8440656661987305, rectangle2D_Float0.getMinX(), 0.01);
      assertEquals((-770.9789681434631), rectangle2D_Float0.getCenterY(), 0.01);
      assertEquals((-771.4010009765625), rectangle2D_Float0.getMinY(), 0.01);
      assertEquals((-770.5569353103638), rectangle2D_Float0.getMaxY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, 0.0F, 2807.3877F, 1.0F);
      assertEquals(0.0F, line2D_Float0.y1, 0.01F);
      assertEquals(1.0F, line2D_Float0.x1, 0.01F);
      assertEquals(1.0F, line2D_Float0.y2, 0.01F);
      assertEquals(2807.3877F, line2D_Float0.x2, 0.01F);
      assertNotNull(line2D_Float0);
      
      line2D_Float0.setLine(0.0F, 2894.221F, 2894.221F, 2894.221F);
      assertEquals(2894.221F, line2D_Float0.y2, 0.01F);
      assertEquals(2894.221F, line2D_Float0.x2, 0.01F);
      assertEquals(0.0F, line2D_Float0.x1, 0.01F);
      assertEquals(2894.221F, line2D_Float0.y1, 0.01F);
      
      Rectangle rectangle0 = line2D_Float0.getBounds();
      assertEquals(2894.221F, line2D_Float0.y2, 0.01F);
      assertEquals(2894.221F, line2D_Float0.x2, 0.01F);
      assertEquals(0.0F, line2D_Float0.x1, 0.01F);
      assertEquals(2894.221F, line2D_Float0.y1, 0.01F);
      assertEquals(0, rectangle0.x);
      assertEquals(1, rectangle0.height);
      assertEquals(2895, rectangle0.width);
      assertEquals(2894, rectangle0.y);
      assertEquals(1.0, rectangle0.getHeight(), 0.01);
      assertEquals(2894.0, rectangle0.getY(), 0.01);
      assertFalse(rectangle0.isEmpty());
      assertEquals(2895.0, rectangle0.getWidth(), 0.01);
      assertEquals(1447.5, rectangle0.getCenterX(), 0.01);
      assertEquals(0.0, rectangle0.getMinX(), 0.01);
      assertEquals(2895.0, rectangle0.getMaxY(), 0.01);
      assertEquals(0.0, rectangle0.getX(), 0.01);
      assertEquals(2895.0, rectangle0.getMaxX(), 0.01);
      assertEquals(2894.5, rectangle0.getCenterY(), 0.01);
      assertEquals(2894.0, rectangle0.getMinY(), 0.01);
      assertNotNull(rectangle0);
      
      Line2D.Double line2D_Double0 = new Line2D.Double(1.0F, 0.0F, 0.0F, 2894.221F);
      assertEquals(1.0, line2D_Double0.x1, 0.01);
      assertEquals(0.0, line2D_Double0.y1, 0.01);
      assertEquals(0.0, line2D_Double0.x2, 0.01);
      assertEquals(2894.220947265625, line2D_Double0.y2, 0.01);
      assertNotNull(line2D_Double0);
      
      boolean boolean0 = LineUtils.clipLine(line2D_Double0, rectangle0);
      assertEquals(2894.221F, line2D_Float0.y2, 0.01F);
      assertEquals(2894.221F, line2D_Float0.x2, 0.01F);
      assertEquals(0.0F, line2D_Float0.x1, 0.01F);
      assertEquals(2894.221F, line2D_Float0.y1, 0.01F);
      assertEquals(0, rectangle0.x);
      assertEquals(1, rectangle0.height);
      assertEquals(2895, rectangle0.width);
      assertEquals(2894, rectangle0.y);
      assertEquals(0.0, line2D_Double0.x2, 0.01);
      assertEquals(2894.0, line2D_Double0.y1, 0.01);
      assertEquals(7.634084254481976E-5, line2D_Double0.x1, 0.01);
      assertEquals(2894.220947265625, line2D_Double0.y2, 0.01);
      assertEquals(1.0, rectangle0.getHeight(), 0.01);
      assertEquals(2894.0, rectangle0.getY(), 0.01);
      assertFalse(rectangle0.isEmpty());
      assertEquals(2895.0, rectangle0.getWidth(), 0.01);
      assertEquals(1447.5, rectangle0.getCenterX(), 0.01);
      assertEquals(0.0, rectangle0.getMinX(), 0.01);
      assertEquals(2895.0, rectangle0.getMaxY(), 0.01);
      assertEquals(0.0, rectangle0.getX(), 0.01);
      assertEquals(2895.0, rectangle0.getMaxX(), 0.01);
      assertEquals(2894.5, rectangle0.getCenterY(), 0.01);
      assertEquals(2894.0, rectangle0.getMinY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, 0.0F, 1010.64575F);
      Line2D.Double line2D_Double0 = (Line2D.Double)LineUtils.extendLine(line2D_Float0, 3378.3269002015, (-1.0F));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      boolean boolean0 = LineUtils.clipLine(line2D_Double0, rectangle2D_Double0);
      assertEquals((-3414291.7303976147), line2D_Double0.y1, 0.01);
      assertEquals((-1.0), line2D_Double0.x2, 0.01);
      assertEquals((-3379.3269002015), line2D_Double0.x1, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, line2D_Double0.y2, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LineUtils lineUtils0 = new LineUtils();
  }
}
