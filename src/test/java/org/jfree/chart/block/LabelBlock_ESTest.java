/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:53:58 GMT 2019
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.BlockParams;
import org.jfree.chart.block.LabelBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.ui.RectangleAnchor;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LabelBlock_ESTest extends LabelBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("sz?");
      Object object0 = labelBlock0.clone();
      boolean boolean0 = labelBlock0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("sz?");
      SystemColor systemColor0 = SystemColor.info;
      labelBlock0.setPaint(systemColor0);
      boolean boolean0 = labelBlock0.equals(labelBlock0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, LabelBlock> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, LabelBlock>();
      Font font0 = new Font(hashMap0);
      Color color0 = Color.red;
      LabelBlock labelBlock0 = new LabelBlock("", font0, color0);
      Color color1 = (Color)labelBlock0.getPaint();
      assertEquals((-65536), color1.getRGB());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, Object> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, Object>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      SystemColor systemColor0 = SystemColor.activeCaptionBorder;
      LabelBlock labelBlock0 = new LabelBlock("W!.tC,d OB7<", font0, systemColor0);
      labelBlock0.setFont(font0);
      assertFalse(font0.isTransformed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, BlockParams> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, BlockParams>();
      Font font0 = new Font(hashMap0);
      LabelBlock labelBlock0 = new LabelBlock("b", font0);
      labelBlock0.setURLText("b");
      String string0 = labelBlock0.getURLText();
      assertEquals("b", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Font font0 = new Font("J<fes> ra_$-qk*", 0, (-206));
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      LabelBlock labelBlock0 = new LabelBlock("J<fes> ra_$-qk*", font0, systemColor0);
      labelBlock0.setToolTipText("J<fes> ra_$-qk*");
      String string0 = labelBlock0.getToolTipText();
      assertEquals("J<fes> ra_$-qk*", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.windowText;
      LabelBlock labelBlock0 = new LabelBlock("", (Font) null, systemColor0);
      Font font0 = labelBlock0.getFont();
      assertNull(font0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Font font0 = new Font("", (-2792), 4);
      float[] floatArray0 = new float[8];
      AffineTransform affineTransform0 = new AffineTransform(floatArray0);
      Font font1 = font0.deriveFont((-1919), affineTransform0);
      LabelBlock labelBlock0 = new LabelBlock("4{Wv&f%U", font1);
      Font font2 = labelBlock0.getFont();
      assertNotSame(font2, font0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Font font0 = new Font("981n}~*JLg#", 87, 0);
      LabelBlock labelBlock0 = new LabelBlock("981n}~*JLg#", font0);
      Font font1 = labelBlock0.getFont();
      assertEquals(0, font1.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Font font0 = new Font("", (-2039), (-3454));
      Font font1 = font0.deriveFont((-1.0F));
      Color color0 = new Color(0);
      LabelBlock labelBlock0 = new LabelBlock("", font1, color0);
      Font font2 = labelBlock0.getFont();
      assertEquals("", font2.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      // Undeclared exception!
      try { 
        labelBlock0.setFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, Polygon> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, Polygon>();
      Font font0 = new Font(hashMap0);
      LabelBlock labelBlock0 = null;
      try {
        labelBlock0 = new LabelBlock((String) null, font0, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LabelBlock labelBlock0 = null;
      try {
        labelBlock0 = new LabelBlock(";(TpUq$JC?=", (Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.text.TextLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LabelBlock labelBlock0 = null;
      try {
        labelBlock0 = new LabelBlock((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Font font0 = new Font("J<fes> ra_$-qk*", 0, (-206));
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      LabelBlock labelBlock0 = new LabelBlock("J<fes> ra_$-qk*", font0, systemColor0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Polygon polygon0 = new Polygon();
      // Undeclared exception!
      try { 
        labelBlock0.draw((Graphics2D) null, (Rectangle2D) rectangle2D_Float0, (Object) polygon0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("sz?");
      Object object0 = labelBlock0.clone();
      assertTrue(object0.equals((Object)labelBlock0));
      
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_LEFT;
      labelBlock0.setContentAlignmentPoint(textBlockAnchor0);
      boolean boolean0 = labelBlock0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      LabelBlock labelBlock1 = (LabelBlock)labelBlock0.clone();
      assertTrue(labelBlock1.equals((Object)labelBlock0));
      
      labelBlock1.setURLText("org.jfree.chart.block.LabelBlock");
      boolean boolean0 = labelBlock0.equals(labelBlock1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      Object object0 = labelBlock0.clone();
      assertTrue(object0.equals((Object)labelBlock0));
      
      labelBlock0.setToolTipText("");
      boolean boolean0 = object0.equals(labelBlock0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("szL");
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      labelBlock0.setPaint(systemColor0);
      LabelBlock labelBlock1 = new LabelBlock("szL");
      boolean boolean0 = labelBlock0.equals(labelBlock1);
      assertFalse(labelBlock1.equals((Object)labelBlock0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("xQ},p*Ky");
      LabelBlock labelBlock1 = new LabelBlock("vbshF4 `&");
      boolean boolean0 = labelBlock0.equals(labelBlock1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("r");
      Rectangle rectangle0 = new Rectangle((-1795), (-1795), 0, 0);
      boolean boolean0 = labelBlock0.equals(rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Font font0 = new Font((Map<? extends AttributedCharacterIterator.Attribute, ?>) null);
      LabelBlock labelBlock0 = new LabelBlock("H4f&1'FX; bu7O3}XF/", font0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      labelBlock0.setTextAnchor(rectangleAnchor0);
      assertEquals(0.0, labelBlock0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      TextBlockAnchor textBlockAnchor0 = labelBlock0.getContentAlignmentPoint();
      assertEquals(TextBlockAnchor.CENTER, textBlockAnchor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Font font0 = new Font((Map<? extends AttributedCharacterIterator.Attribute, ?>) null);
      LabelBlock labelBlock0 = new LabelBlock("H4f&1'FX; bu7O3}XF/", font0);
      String string0 = labelBlock0.getToolTipText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("szL");
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((Range) null, 1159.5);
      // Undeclared exception!
      try { 
        labelBlock0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      labelBlock0.setToolTipText("");
      String string0 = labelBlock0.getToolTipText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      String string0 = labelBlock0.getURLText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      RectangleAnchor rectangleAnchor0 = labelBlock0.getTextAnchor();
      assertEquals(RectangleAnchor.CENTER, rectangleAnchor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      Object object0 = labelBlock0.clone();
      assertTrue(object0.equals((Object)labelBlock0));
      
      Font font0 = Font.decode("");
      labelBlock0.setFont(font0);
      boolean boolean0 = object0.equals(labelBlock0);
      assertFalse(object0.equals((Object)labelBlock0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      Rectangle rectangle0 = new Rectangle();
      // Undeclared exception!
      try { 
        labelBlock0.draw((Graphics2D) null, (Rectangle2D) rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Font font0 = new Font("!KMc", (-162), (-162));
      LabelBlock labelBlock0 = new LabelBlock("!KMc", font0);
      // Undeclared exception!
      try { 
        labelBlock0.setPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Font font0 = new Font("!KMc", (-162), (-162));
      LabelBlock labelBlock0 = new LabelBlock("!KMc", font0);
      Font font1 = labelBlock0.getFont();
      assertEquals("!KMc", font1.getName());
  }
}
