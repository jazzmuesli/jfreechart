/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:08:07 GMT 2019
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.ui.RectangleInsets;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BlockBorder_ESTest extends BlockBorder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BlockBorder blockBorder0 = new BlockBorder(672.277, (-2015.0), 2092.50049952, 557.77, paint0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0).when(rectangle2D0).getX();
      doReturn(0.0).when(rectangle2D0).getY();
      blockBorder0.draw(graphics2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder(803.760748266, 803.760748266, 803.760748266, 803.760748266);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(803.760748266, (-290.008533777), (-290.008533777)).when(rectangle2D0).getHeight();
      doReturn((-312.1435330980006), (-312.1435330980006), (-617.57283)).when(rectangle2D0).getWidth();
      doReturn(0.0).when(rectangle2D0).getX();
      doReturn((-312.1435330980006)).when(rectangle2D0).getY();
      blockBorder0.draw(graphics2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder(1.0, (-1.0), (-1.0), (-1.0));
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0).when(rectangle2D0).getX();
      doReturn(0.0).when(rectangle2D0).getY();
      blockBorder0.draw(graphics2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockBorder blockBorder0 = null;
      try {
        blockBorder0 = new BlockBorder(0.0, (-1.0), 0.0, 507.32615164097507, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder((-1.0), 0.0, (-1.0), (-1.0));
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0).when(rectangle2D0).getX();
      doReturn(0.0).when(rectangle2D0).getY();
      blockBorder0.draw(graphics2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BlockBorder blockBorder0 = new BlockBorder((-272.75683671), (-823.785), (-823.785), (-272.75683671), paint0);
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      assertEquals((-823.785), rectangleInsets0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder(1.0, (-1.0), (-1.0), (-1.0));
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      assertEquals((-1.0), rectangleInsets0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockBorder blockBorder0 = BlockBorder.NONE;
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0).when(rectangle2D0).getX();
      doReturn(0.0).when(rectangle2D0).getY();
      // Undeclared exception!
      try { 
        blockBorder0.draw((Graphics2D) null, rectangle2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BlockBorder blockBorder0 = null;
      try {
        blockBorder0 = new BlockBorder((RectangleInsets) null, paint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlockBorder blockBorder0 = null;
      try {
        blockBorder0 = new BlockBorder((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BlockBorder blockBorder1 = new BlockBorder(paint0);
      boolean boolean0 = blockBorder0.equals(blockBorder1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BlockBorder blockBorder0 = new BlockBorder(paint0);
      BlockBorder blockBorder1 = new BlockBorder(0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = blockBorder0.equals(blockBorder1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlockBorder blockBorder0 = BlockBorder.NONE;
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      Paint paint0 = blockBorder0.getPaint();
      BlockBorder blockBorder1 = new BlockBorder(rectangleInsets0, paint0);
      boolean boolean0 = blockBorder0.equals(blockBorder1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlockBorder blockBorder0 = BlockBorder.NONE;
      boolean boolean0 = blockBorder0.NONE.equals(blockBorder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockBorder blockBorder0 = BlockBorder.NONE;
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      boolean boolean0 = blockBorder0.equals(rectangleInsets0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlockBorder blockBorder0 = BlockBorder.NONE;
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0).when(rectangle2D0).getX();
      doReturn(0.0).when(rectangle2D0).getY();
      blockBorder0.draw(graphics2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlockBorder blockBorder0 = new BlockBorder();
      RectangleInsets rectangleInsets0 = blockBorder0.getInsets();
      assertEquals(1.0, rectangleInsets0.getTop(), 0.01);
  }
}
