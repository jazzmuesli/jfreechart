/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:32:25 GMT 2019
 */

package org.jfree.chart.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.SystemColor;
import java.awt.geom.Path2D;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.text.TextLine;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.Size2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TextBlock_ESTest extends TextBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextLine textLine0 = new TextLine();
      textBlock0.addLine(textLine0);
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER;
      textBlock0.draw((Graphics2D) null, (-1.0F), 4548.0F, textBlockAnchor0, (-685.542F), (-2802.811F), (-834.1334085793897));
      assertEquals(HorizontalAlignment.CENTER, textBlock0.getLineAlignment());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextLine textLine0 = new TextLine("6b|f)YnL%g.`_Ug|>Yj");
      textBlock0.addLine(textLine0);
      textBlock0.addLine(textLine0);
      TextLine textLine1 = textBlock0.getLastLine();
      assertSame(textLine1, textLine0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Font font0 = Font.decode("Null 'alignment' argument.");
      SystemColor systemColor0 = SystemColor.inactiveCaptionText;
      textBlock0.addLine("", font0, (Paint) systemColor0);
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      // Undeclared exception!
      try { 
        textBlock0.draw((Graphics2D) null, 0.0F, 0.0F, textBlockAnchor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextLine textLine0 = new TextLine("");
      textBlock0.addLine(textLine0);
      // Undeclared exception!
      try { 
        textBlock0.calculateDimensions((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Font font0 = Font.decode("");
      Color color0 = Color.green;
      textBlock0.addLine("", font0, (Paint) color0);
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      // Undeclared exception!
      try { 
        textBlock0.calculateBounds((Graphics2D) null, 0.0F, 0.0F, textBlockAnchor0, 0.0F, 987.0F, (-398.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextLine textLine0 = new TextLine();
      textBlock0.addLine(textLine0);
      Size2D size2D0 = textBlock0.calculateDimensions((Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      textBlock0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlock textBlock1 = new TextBlock();
      boolean boolean0 = textBlock0.equals(textBlock1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      boolean boolean0 = textBlock0.equals(textBlock0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      boolean boolean0 = textBlock0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_LEFT;
      Path2D.Double path2D_Double0 = (Path2D.Double)textBlock0.calculateBounds((Graphics2D) null, 987.0F, 1118.9829F, textBlockAnchor0, 2.731411F, 0.0F, 0.0);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      textBlock0.draw((Graphics2D) null, (-2074.341F), 904.3028F, textBlockAnchor0, 904.3028F, (-802.939F), (double) 904.3028F);
      assertEquals(HorizontalAlignment.CENTER, textBlock0.getLineAlignment());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_LEFT;
      textBlock0.draw((Graphics2D) null, (-1024.8035F), (-1.0F), textBlockAnchor0, 987.0F, 2.731411F, 886.41153);
      assertEquals(HorizontalAlignment.CENTER, textBlock0.getLineAlignment());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_RIGHT;
      textBlock0.draw((Graphics2D) null, (-1.0F), (-1024.8035F), textBlockAnchor0);
      assertEquals(HorizontalAlignment.CENTER, textBlock0.getLineAlignment());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      Path2D.Double path2D_Double0 = (Path2D.Double)textBlock0.calculateBounds((Graphics2D) null, 0.0F, 0.0F, textBlockAnchor0, 2175.84F, 0.0F, 0.0F);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      Path2D.Double path2D_Double0 = (Path2D.Double)textBlock0.calculateBounds((Graphics2D) null, 2172, 0.0F, textBlockAnchor0, 2172, 2727, 2172);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_RIGHT;
      Path2D.Double path2D_Double0 = (Path2D.Double)textBlock0.calculateBounds((Graphics2D) null, 0.0F, 0.0F, textBlockAnchor0, 2.731411F, 987.0F, (-398.0));
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_RIGHT;
      textBlock0.addLine((TextLine) null);
      // Undeclared exception!
      try { 
        textBlock0.draw((Graphics2D) null, 0.0F, 0.0F, textBlockAnchor0, (-1615.738F), 0.0F, (double) (-1615.738F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextLine textLine0 = textBlock0.getLastLine();
      assertNull(textLine0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      // Undeclared exception!
      try { 
        textBlock0.setLineAlignment((HorizontalAlignment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'alignment' argument.
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      textBlock0.setLineAlignment(horizontalAlignment0);
      assertEquals(HorizontalAlignment.LEFT, textBlock0.getLineAlignment());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextLine textLine0 = new TextLine();
      textBlock0.addLine(textLine0);
      TextLine textLine1 = textBlock0.getLastLine();
      assertSame(textLine1, textLine0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      assertEquals(HorizontalAlignment.CENTER, horizontalAlignment0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_CENTER;
      textBlock0.draw((Graphics2D) null, (-662.33704F), 2831.4F, textBlockAnchor0);
      assertEquals(HorizontalAlignment.CENTER, textBlock0.getLineAlignment());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      List list0 = textBlock0.getLines();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Color color0 = Color.getHSBColor((-309.5246F), (-309.5246F), (-309.5246F));
      // Undeclared exception!
      try { 
        textBlock0.addLine("65Ll,N!za~C.L>v}}", (Font) null, (Paint) color0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.text.TextLine", e);
      }
  }
}