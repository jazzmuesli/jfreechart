/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:43:34 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import javax.swing.Icon;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MinMaxCategoryRenderer_ESTest extends MinMaxCategoryRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Paint paint0 = minMaxCategoryRenderer0.getDefaultPaint();
      minMaxCategoryRenderer0.setGroupPaint(paint0);
      Color color0 = (Color)minMaxCategoryRenderer0.getGroupPaint();
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
      assertEquals((-16776961), color0.getRGB());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
      
      minMaxCategoryRenderer0.setDrawLines(true);
      boolean boolean0 = minMaxCategoryRenderer0.isDrawLines();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setObjectIcon((Icon) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'icon' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setMinIcon((Icon) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'icon' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setMaxIcon((Icon) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'icon' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setGroupStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setGroupPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      MinMaxCategoryRenderer minMaxCategoryRenderer1 = new MinMaxCategoryRenderer();
      boolean boolean0 = minMaxCategoryRenderer0.equals(minMaxCategoryRenderer1);
      assertFalse(minMaxCategoryRenderer1.isDrawLines());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setDrawLines(true);
      MinMaxCategoryRenderer minMaxCategoryRenderer1 = new MinMaxCategoryRenderer();
      boolean boolean0 = minMaxCategoryRenderer0.equals(minMaxCategoryRenderer1);
      assertTrue(minMaxCategoryRenderer0.isDrawLines());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Icon icon0 = minMaxCategoryRenderer0.getMinIcon();
      boolean boolean0 = minMaxCategoryRenderer0.equals(icon0);
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      boolean boolean0 = minMaxCategoryRenderer0.equals(minMaxCategoryRenderer0);
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Paint paint0 = minMaxCategoryRenderer0.getDefaultPaint();
      minMaxCategoryRenderer0.setGroupPaint(paint0);
      MinMaxCategoryRenderer minMaxCategoryRenderer1 = new MinMaxCategoryRenderer();
      boolean boolean0 = minMaxCategoryRenderer0.equals(minMaxCategoryRenderer1);
      assertFalse(minMaxCategoryRenderer1.isDrawLines());
      assertFalse(boolean0);
      assertFalse(minMaxCategoryRenderer1.equals((Object)minMaxCategoryRenderer0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setDrawLines(true);
      minMaxCategoryRenderer0.setDrawLines(true);
      assertTrue(minMaxCategoryRenderer0.isDrawLines());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Icon icon0 = minMaxCategoryRenderer0.getMinIcon();
      minMaxCategoryRenderer0.setMinIcon(icon0);
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      BasicStroke basicStroke0 = (BasicStroke)minMaxCategoryRenderer0.getGroupStroke();
      minMaxCategoryRenderer0.setGroupStroke(basicStroke0);
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.getMaxIcon();
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      boolean boolean0 = minMaxCategoryRenderer0.isDrawLines();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Icon icon0 = minMaxCategoryRenderer0.getMinIcon();
      minMaxCategoryRenderer0.setMaxIcon(icon0);
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Paint paint0 = minMaxCategoryRenderer0.lookupSeriesFillPaint(1);
      minMaxCategoryRenderer0.setGroupPaint(paint0);
      MinMaxCategoryRenderer minMaxCategoryRenderer1 = new MinMaxCategoryRenderer();
      boolean boolean0 = minMaxCategoryRenderer1.equals(minMaxCategoryRenderer0);
      assertFalse(minMaxCategoryRenderer0.equals((Object)minMaxCategoryRenderer1));
      assertFalse(minMaxCategoryRenderer1.isDrawLines());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Color color0 = (Color)minMaxCategoryRenderer0.getGroupPaint();
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Icon icon0 = minMaxCategoryRenderer0.getObjectIcon();
      minMaxCategoryRenderer0.setObjectIcon(icon0);
      assertFalse(minMaxCategoryRenderer0.isDrawLines());
  }
}
