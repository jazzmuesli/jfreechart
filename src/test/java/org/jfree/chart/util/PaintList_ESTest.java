/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:04:45 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import java.awt.SystemColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.AbstractObjectList;
import org.jfree.chart.util.PaintList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PaintList_ESTest extends PaintList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      boolean boolean0 = paintList0.equals(paintList0);
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      SystemColor systemColor0 = SystemColor.controlLtHighlight;
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals((-2039584), systemColor0.getRGB());
      assertEquals(224, systemColor0.getRed());
      assertEquals(224, systemColor0.getBlue());
      assertEquals(224, systemColor0.getGreen());
      assertNotNull(systemColor0);
      
      paintList0.setPaint(124, systemColor0);
      assertEquals(125, paintList0.size());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals((-2039584), systemColor0.getRGB());
      assertEquals(224, systemColor0.getRed());
      assertEquals(224, systemColor0.getBlue());
      assertEquals(224, systemColor0.getGreen());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      
      SystemColor systemColor1 = (SystemColor)paintList0.getPaint(124);
      assertSame(systemColor1, systemColor0);
      assertEquals(125, paintList0.size());
      assertEquals(224, systemColor1.getBlue());
      assertEquals(255, systemColor1.getAlpha());
      assertEquals(224, systemColor1.getGreen());
      assertEquals((-2039584), systemColor1.getRGB());
      assertEquals(1, systemColor1.getTransparency());
      assertEquals(224, systemColor1.getRed());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(systemColor1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      // Undeclared exception!
      try { 
        paintList0.setPaint((-1), (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      paintList0.set(0, paintList0);
      assertEquals(1, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      
      // Undeclared exception!
      try { 
        paintList0.getPaint(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.util.PaintList cannot be cast to java.awt.Paint
         //
         verifyException("org.jfree.chart.util.PaintList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      PaintList paintList1 = new PaintList();
      assertEquals(0, paintList1.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertTrue(paintList1.equals((Object)paintList0));
      assertNotNull(paintList1);
      
      paintList0.set(2103, paintList1);
      assertNotSame(paintList0, paintList1);
      assertNotSame(paintList1, paintList0);
      assertEquals(2104, paintList0.size());
      assertEquals(0, paintList1.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertTrue(paintList1.equals((Object)paintList0));
      
      // Undeclared exception!
      try { 
        paintList0.equals(paintList1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.util.PaintList cannot be cast to java.awt.Paint
         //
         verifyException("org.jfree.chart.util.PaintList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      Paint paint0 = paintList0.getPaint((-831));
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNull(paint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      SystemColor systemColor0 = SystemColor.textHighlightText;
      assertEquals(255, systemColor0.getBlue());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getGreen());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-1), systemColor0.getRGB());
      assertNotNull(systemColor0);
      
      PaintList paintList1 = (PaintList)paintList0.clone();
      assertNotSame(paintList0, paintList1);
      assertNotSame(paintList1, paintList0);
      assertEquals(0, paintList0.size());
      assertEquals(0, paintList1.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertTrue(paintList1.equals((Object)paintList0));
      assertNotNull(paintList1);
      
      paintList0.setPaint(0, systemColor0);
      assertNotSame(paintList0, paintList1);
      assertEquals(1, paintList0.size());
      assertEquals(255, systemColor0.getBlue());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getGreen());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertFalse(paintList0.equals((Object)paintList1));
      
      boolean boolean0 = paintList0.equals(paintList1);
      assertNotSame(paintList0, paintList1);
      assertNotSame(paintList1, paintList0);
      assertEquals(1, paintList0.size());
      assertEquals(0, paintList1.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertFalse(paintList0.equals((Object)paintList1));
      assertTrue(paintList1.equals((Object)paintList0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      SystemColor systemColor0 = SystemColor.textHighlightText;
      assertEquals(255, systemColor0.getGreen());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getBlue());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getRed());
      assertNotNull(systemColor0);
      
      boolean boolean0 = paintList0.equals(systemColor0);
      assertEquals(0, paintList0.size());
      assertEquals(255, systemColor0.getGreen());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getBlue());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getRed());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertNotNull(paintList0);
      
      boolean boolean0 = paintList0.equals((Object) null);
      assertEquals(0, paintList0.size());
      assertEquals(8, AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      paintList0.setPaint(0, systemColor0);
      Object object0 = paintList0.clone();
      boolean boolean0 = object0.equals(paintList0);
      assertEquals(1, paintList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PaintList paintList0 = new PaintList();
      paintList0.hashCode();
  }
}