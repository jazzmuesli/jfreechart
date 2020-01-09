/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:09:11 GMT 2019
 */

package org.jfree.chart.annotations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Paint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.annotations.TextAnnotation;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TextAnnotation_ESTest extends TextAnnotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("font");
      textAnnotation0.setRotationAngle((-1657.105521));
      textAnnotation0.hashCode();
      assertEquals((-1657.105521), textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("E");
      textAnnotation0.setRotationAngle((-3206.637));
      TextAnnotation textAnnotation1 = new TextAnnotation("E");
      boolean boolean0 = textAnnotation0.equals(textAnnotation1);
      assertEquals((-3206.637), textAnnotation0.getRotationAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("");
      Paint paint0 = textAnnotation0.getPaint();
      textAnnotation0.setPaint(paint0);
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("");
      boolean boolean0 = textAnnotation0.equals(textAnnotation0);
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("");
      textAnnotation0.getText();
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("");
      textAnnotation0.setRotationAngle(3.141592653589793);
      double double0 = textAnnotation0.getRotationAngle();
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("$onBQ-$5RE)3mK(~q");
      textAnnotation0.setRotationAngle((-1077.0));
      double double0 = textAnnotation0.getRotationAngle();
      assertEquals((-1077.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("Pie_3D_Plot");
      // Undeclared exception!
      try { 
        textAnnotation0.setTextAnchor((TextAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("7qs*/A@\"");
      // Undeclared exception!
      try { 
        textAnnotation0.setRotationAnchor((TextAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("_s:QL*<3F");
      // Undeclared exception!
      try { 
        textAnnotation0.setFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextAnnotation textAnnotation0 = null;
      try {
        textAnnotation0 = new TextAnnotation((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("5");
      textAnnotation0.getRotationAnchor();
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("5");
      textAnnotation0.getFont();
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("5");
      double double0 = textAnnotation0.getRotationAngle();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("5");
      textAnnotation0.getTextAnchor();
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("5");
      textAnnotation0.getText();
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("SansSerif");
      textAnnotation0.setText("0p");
      TextAnnotation textAnnotation1 = new TextAnnotation("SansSerif");
      boolean boolean0 = textAnnotation0.equals(textAnnotation1);
      assertFalse(boolean0);
      assertEquals(0.0, textAnnotation1.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("/");
      boolean boolean0 = textAnnotation0.equals("/");
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("/");
      textAnnotation0.setRotationAngle(1157.9);
      TextAnnotation textAnnotation1 = new TextAnnotation("/");
      boolean boolean0 = textAnnotation0.equals(textAnnotation1);
      assertEquals(1157.9, textAnnotation0.getRotationAngle(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("/");
      textAnnotation0.setRotationAnchor(textAnnotation0.DEFAULT_TEXT_ANCHOR);
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("SansSerif");
      textAnnotation0.setTextAnchor(textAnnotation0.DEFAULT_TEXT_ANCHOR);
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("/");
      textAnnotation0.setFont(textAnnotation0.DEFAULT_FONT);
      assertEquals(0.0, textAnnotation0.getRotationAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("SansSerif");
      TextAnnotation textAnnotation1 = (TextAnnotation)textAnnotation0.clone();
      boolean boolean0 = textAnnotation0.equals(textAnnotation1);
      assertEquals(0.0, textAnnotation1.getRotationAngle(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("z9oX_V@,Ne#+S'OL$");
      // Undeclared exception!
      try { 
        textAnnotation0.setPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation("*<K4y^`oI.CDud%Ub");
      // Undeclared exception!
      try { 
        textAnnotation0.setText((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }
}