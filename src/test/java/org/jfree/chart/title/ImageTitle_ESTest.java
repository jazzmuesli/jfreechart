/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:43:15 GMT 2019
 */

package org.jfree.chart.title;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.title.ImageTitle;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.LengthAdjustmentType;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.chart.ui.Size2D;
import org.jfree.chart.ui.VerticalAlignment;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ImageTitle_ESTest extends ImageTitle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
      
      imageTitle0.setHeight(0);
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createOutsetRectangle(rectangle2D0);
      imageTitle0.drawVertical(graphics2D0, rectangle2D1);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 11, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Size2D size2D0 = imageTitle0.drawVertical(graphics2D0, rectangle2D0);
      assertEquals(13.0, size2D0.height, 0.01);
      assertEquals(1.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.RIGHT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      RectangleInsets rectangleInsets0 = new RectangleInsets(7.0, (-1), 1980.3, 0);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, 0, 418, rectangleEdge0, horizontalAlignment0, verticalAlignment0, rectangleInsets0);
      // Undeclared exception!
      try { 
        imageTitle0.drawVertical(graphics2D0, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
      
      imageTitle0.setHeight(0);
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createOutsetRectangle(rectangle2D0);
      imageTitle0.draw(graphics2D0, rectangle2D1);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createOutsetRectangle(rectangle2D0);
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D2 = imageTitle0.DEFAULT_PADDING.createAdjustedRectangle(rectangle2D1, lengthAdjustmentType0, lengthAdjustmentType0);
      imageTitle0.draw(graphics2D0, rectangle2D2);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 11, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      imageTitle0.draw(graphics2D0, rectangle2D0);
      assertEquals(1.0, imageTitle0.getWidth(), 0.01);
      assertEquals(11.0, imageTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      Image image0 = bufferedImage0.getScaledInstance(1046, 700, (-2198));
      RectangleInsets rectangleInsets0 = new RectangleInsets();
      ImageTitle imageTitle0 = new ImageTitle(image0, 0, 0, rectangleEdge0, horizontalAlignment0, verticalAlignment0, rectangleInsets0);
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Rectangle2D rectangle2D1 = rectangleInsets0.createOutsetRectangle(rectangle2D0, true, true);
      // Undeclared exception!
      try { 
        imageTitle0.drawHorizontal((Graphics2D) null, rectangle2D1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createAdjustedRectangle(rectangle2D0, lengthAdjustmentType0, lengthAdjustmentType0);
      Rectangle2D rectangle2D2 = imageTitle0.DEFAULT_PADDING.createInsetRectangle(rectangle2D1);
      Size2D size2D0 = imageTitle0.drawVertical(graphics2D0, rectangle2D2);
      assertEquals(302.0, size2D0.height, 0.01);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createOutsetRectangle(rectangle2D0);
      Size2D size2D0 = imageTitle0.drawHorizontal(graphics2D0, rectangle2D1);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
      assertEquals(302.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createInsetRectangle(rectangle2D0, true, true);
      Size2D size2D0 = imageTitle0.drawHorizontal(graphics2D0, rectangle2D1);
      assertEquals(3.0, size2D0.height, 0.01);
      assertEquals(1.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      imageTitle0.setMargin((double) 0, 0.0, 75.0, (-334.5406847559743));
      imageTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.RIGHT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      RectangleInsets rectangleInsets0 = new RectangleInsets(7.0, (-1), 1980.3, 0);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, 0, 418, rectangleEdge0, horizontalAlignment0, verticalAlignment0, rectangleInsets0);
      // Undeclared exception!
      try { 
        imageTitle0.draw(graphics2D0, (Rectangle2D) null, (Object) horizontalAlignment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.RIGHT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      ImageTitle imageTitle0 = null;
      try {
        imageTitle0 = new ImageTitle((Image) null, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      ImageTitle imageTitle0 = null;
      try {
        imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, (VerticalAlignment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'verticalAlignment' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.CENTER;
      ImageTitle imageTitle0 = null;
      try {
        imageTitle0 = new ImageTitle((Image) null, 1, 1, rectangleEdge0, horizontalAlignment0, verticalAlignment0, (RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'padding' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImageTitle imageTitle0 = null;
      try {
        imageTitle0 = new ImageTitle((Image) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      ImageTitle imageTitle1 = (ImageTitle)imageTitle0.clone();
      boolean boolean0 = imageTitle0.equals(imageTitle1);
      assertTrue(boolean0);
      assertEquals(300.0, imageTitle1.getWidth(), 0.01);
      assertEquals(300.0, imageTitle1.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      boolean boolean0 = imageTitle0.equals(imageTitle0);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
      assertTrue(boolean0);
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createOutsetRectangle(rectangle2D0);
      boolean boolean0 = imageTitle0.equals(rectangle2D1);
      assertFalse(boolean0);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.RIGHT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      // Undeclared exception!
      try { 
        imageTitle0.drawHorizontal((Graphics2D) null, rectangle2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.RIGHT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createInsetRectangle(rectangle2D0, false, false);
      // Undeclared exception!
      try { 
        imageTitle0.draw((Graphics2D) null, rectangle2D1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0, rectangleEdge0, horizontalAlignment0, verticalAlignment0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      imageTitle0.draw(graphics2D0, rectangle2D0);
      assertEquals(1.0, imageTitle0.getWidth(), 0.01);
      assertEquals(1.0, imageTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      // Undeclared exception!
      try { 
        imageTitle0.setImage((Image) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null 'image' argument.
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      imageTitle0.setImage(bufferedImage0);
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      ImageTitle imageTitle0 = null;
      try {
        imageTitle0 = new ImageTitle((Image) null, 39, 39, rectangleEdge0, horizontalAlignment0, verticalAlignment0, rectangleInsets0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null 'image' argument.
         //
         verifyException("org.jfree.chart.title.ImageTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = imageTitle0.getBounds();
      Rectangle2D rectangle2D1 = imageTitle0.DEFAULT_PADDING.createOutsetRectangle(rectangle2D0);
      imageTitle0.draw(graphics2D0, rectangle2D1, (Object) graphics2D0);
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      imageTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(300, 300, 1);
      ImageTitle imageTitle0 = new ImageTitle(bufferedImage0);
      imageTitle0.getImage();
      assertEquals(300.0, imageTitle0.getHeight(), 0.01);
      assertEquals(300.0, imageTitle0.getWidth(), 0.01);
  }
}
