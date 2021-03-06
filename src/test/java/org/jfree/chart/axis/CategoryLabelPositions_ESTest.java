/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:03:02 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.CategoryLabelWidthType;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.ui.RectangleAnchor;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CategoryLabelPositions_ESTest extends CategoryLabelPositions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
      assertTrue(categoryLabelPositions1.equals((Object)categoryLabelPositions0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 0.0F);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      CategoryLabelPosition categoryLabelPosition1 = categoryLabelPositions1.getLabelPosition(rectangleEdge0);
      assertEquals(0.0F, categoryLabelPosition1.getWidthRatio(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      CategoryLabelPosition categoryLabelPosition1 = categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      assertEquals(TextBlockAnchor.BOTTOM_CENTER, categoryLabelPosition1.getLabelAnchor());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_45;
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      CategoryLabelPosition categoryLabelPosition0 = categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      assertEquals(0.5F, categoryLabelPosition0.getWidthRatio(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_RIGHT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceRightPosition((CategoryLabelPositions) null, categoryLabelPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 0.7853981633974483, categoryLabelWidthType0, 1792.0F);
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceLeftPosition((CategoryLabelPositions) null, categoryLabelPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bottom' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = null;
      try {
        categoryLabelPositions0 = new CategoryLabelPositions((CategoryLabelPosition) null, (CategoryLabelPosition) null, (CategoryLabelPosition) null, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'top' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions((-1441.91));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      CategoryLabelPosition categoryLabelPosition0 = categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      assertEquals(1441.91, categoryLabelPosition0.getAngle(), 0.01);
      assertEquals(0.5F, categoryLabelPosition0.getWidthRatio(), 0.01F);
      assertEquals(TextBlockAnchor.TOP_LEFT, categoryLabelPosition0.getLabelAnchor());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_45;
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      CategoryLabelPosition categoryLabelPosition0 = categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      assertEquals(CategoryLabelWidthType.RANGE, categoryLabelPosition0.getWidthType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      boolean boolean0 = categoryLabelPositions1.equals(categoryLabelPositions0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.STANDARD;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition0);
      boolean boolean0 = categoryLabelPositions0.equals(categoryLabelPositions1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_90;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, (-717.381F));
      CategoryLabelPositions categoryLabelPositions1 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      boolean boolean0 = categoryLabelPositions1.equals(categoryLabelPositions0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_90;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      boolean boolean0 = categoryLabelPositions0.equals(categoryLabelWidthType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      boolean boolean0 = categoryLabelPositions0.equals(categoryLabelPositions0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions((-1441.91));
      CategoryLabelPosition categoryLabelPosition0 = categoryLabelPositions0.getLabelPosition((RectangleEdge) null);
      assertNull(categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_CENTER;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 1445.3030249874116, categoryLabelWidthType0, (-1370.422F));
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      CategoryLabelPosition categoryLabelPosition1 = categoryLabelPositions1.getLabelPosition(rectangleEdge0);
      assertEquals(RectangleAnchor.TOP, categoryLabelPosition1.getCategoryAnchor());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_90;
      categoryLabelPositions0.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions((-1441.91));
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      boolean boolean0 = categoryLabelPositions1.equals(categoryLabelPositions0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceTopPosition((CategoryLabelPositions) null, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_90;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, (-717.381F));
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
      boolean boolean0 = categoryLabelPositions1.DOWN_90.equals(categoryLabelPositions1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions((-1441.91));
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition0);
      assertFalse(categoryLabelPositions1.equals((Object)categoryLabelPositions0));
  }
}
