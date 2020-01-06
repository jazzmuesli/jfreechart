/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:37:04 GMT 2019
 */

package org.jfree.chart.title;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.chart.ui.Size2D;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShortTextTitle_ESTest extends ShortTextTitle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("eg!");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((-2596.0981), 12.0, 0.0).when(range0).getLowerBound();
      doReturn((double)2147483645, (-1495.45763430461), 2.147483645E9, (double)2147483645).when(range0).getUpperBound();
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn((-1935.0)).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn(180.0).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range0).when(rectangleConstraint0).getWidthRange();
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle(";i,y<$X[J6=7:fh");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(range0).getUpperBound();
      Size2D size2D0 = shortTextTitle0.arrangeRR(graphics2D0, range0, range0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("eg!");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(2147483645).when(fontMetrics0).getAscent();
      doReturn(2147483645).when(fontMetrics0).getHeight();
      doReturn(2147483645).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(3.4028234663852886E38, (double)2147483645).when(range0).getUpperBound();
      Size2D size2D0 = shortTextTitle0.arrangeRR(graphics2D0, range0, range0);
      assertEquals(2.147483645E9, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("eg!");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(955).when(fontMetrics0).getAscent();
      doReturn((-300)).when(fontMetrics0).getHeight();
      doReturn((-300)).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)(-300)).when(range0).getUpperBound();
      Size2D size2D0 = shortTextTitle0.arrangeRR(graphics2D0, range0, range0);
      assertEquals((-300.0), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("Requires 'count' > 0.");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn((-2569)).when(fontMetrics0).getAscent();
      doReturn((-1718)).when(fontMetrics0).getHeight();
      doReturn((-1677)).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(range0).contains(anyDouble());
      Size2D size2D0 = shortTextTitle0.arrangeRN(graphics2D0, range0);
      assertEquals((-1677.0), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("Ir'S");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      shortTextTitle0.setBackgroundPaint((Paint) null);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, (FontMetrics) null).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(range0).constrain(anyDouble());
      doReturn(false).when(range0).contains(anyDouble());
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeRN(graphics2D0, range0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("Ir'S");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(2146816703).when(fontMetrics0).getAscent();
      doReturn(1073741824).when(fontMetrics0).getHeight();
      doReturn(2145402752).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(range0).contains(anyDouble());
      Size2D size2D0 = shortTextTitle0.arrangeRN(graphics2D0, range0);
      assertEquals(2.145402752E9, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Size2D size2D0 = shortTextTitle0.arrangeNN(graphics2D0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("WD-O.~BG^K");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(40).when(fontMetrics0).getAscent();
      doReturn(40).when(fontMetrics0).getHeight();
      doReturn(39).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Size2D size2D0 = shortTextTitle0.arrangeNN(graphics2D0);
      assertEquals(39.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("3Qvr0UTKF");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn((-2123884926)).when(fontMetrics0).getAscent();
      doReturn((-2123884926)).when(fontMetrics0).getHeight();
      doReturn((-2123884926)).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Size2D size2D0 = shortTextTitle0.arrangeNN(graphics2D0);
      assertEquals((-2.123884926E9), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("goD>&");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn((-321)).when(fontMetrics0).getAscent();
      doReturn((-321)).when(fontMetrics0).getHeight();
      doReturn((-321)).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Size2D size2D0 = shortTextTitle0.arrangeFN(graphics2D0, 270.0);
      assertEquals(270.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(2145727733).when(fontMetrics0).getAscent();
      doReturn(2144536786).when(fontMetrics0).getHeight();
      doReturn((-693)).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Size2D size2D0 = shortTextTitle0.arrangeFN(graphics2D0, 0.0);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(2.144536786E9, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn((-363)).when(fontMetrics0).getAscent();
      doReturn((-363)).when(fontMetrics0).getHeight();
      doReturn((-363)).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Size2D size2D0 = shortTextTitle0.arrangeFN(graphics2D0, (-363));
      assertEquals((-363.0), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("bQn`G)Q\u0001ASff3`((");
      Rectangle2D rectangle2D0 = shortTextTitle0.getBounds();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        shortTextTitle0.draw(graphics2D0, (Rectangle2D) null, (Object) rectangle2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("'(.J=$");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((FontMetrics) null).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      Range range1 = mock(Range.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeRR(graphics2D0, range0, range1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeNN((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((FontMetrics) null).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      // Undeclared exception!
      try { 
        shortTextTitle0.arrangeFN(graphics2D0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangleConstraint0).getHeight();
      doReturn((LengthConstraintType) null).when(rectangleConstraint0).getHeightConstraintType();
      doReturn((Range) null).when(rectangleConstraint0).getHeightRange();
      doReturn(0.0).when(rectangleConstraint0).getWidth();
      doReturn((LengthConstraintType) null).when(rectangleConstraint0).getWidthConstraintType();
      doReturn((Range) null).when(rectangleConstraint0).getWidthRange();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'widthConstraintType' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = null;
      try {
        shortTextTitle0 = new ShortTextTitle((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = shortTextTitle0.getBounds();
      Object object0 = shortTextTitle0.draw(graphics2D0, rectangle2D0, (Object) "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("a-K`/-@#yn|M`F");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(193).when(fontMetrics0).getAscent();
      doReturn(2145384445).when(fontMetrics0).getHeight();
      doReturn((-6120)).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((double)0.0F, (double)0.0F).when(range0).getUpperBound();
      Size2D size2D0 = shortTextTitle0.arrangeRR(graphics2D0, range0, range0);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(1031).when(fontMetrics0).getAscent();
      doReturn(1031).when(fontMetrics0).getHeight();
      doReturn(1031).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Size2D size2D0 = shortTextTitle0.arrangeFN(graphics2D0, 0.0);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("a-K`/-@#yn|M`F");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn((-6120)).when(fontMetrics0).getAscent();
      doReturn((-6120)).when(fontMetrics0).getHeight();
      doReturn((-6120)).when(fontMetrics0).stringWidth(anyString());
      FontMetrics fontMetrics1 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(193).when(fontMetrics1).getAscent();
      doReturn(1024).when(fontMetrics1).getHeight();
      doReturn((-2147483647)).when(fontMetrics1).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, fontMetrics1).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(3.4028234663852886E38, (double)0.0F).when(range0).getLowerBound();
      doReturn(3.4028234663852886E38, 3.4028234663852886E38).when(range0).getUpperBound();
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      Range range1 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(3.4028234663852886E38, 2.145810788E9).when(range1).getLowerBound();
      doReturn(3.4028234663852886E38, 3.4028234663852886E38).when(range1).getUpperBound();
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(3.4028234663852886E38).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn(3.4028234663852886E38).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType1).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range1).when(rectangleConstraint0).getWidthRange();
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(1026.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("org.jfree.chart.title.ShortTextTitle");
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(1.073741824E9).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn((Range) null).when(rectangleConstraint0).getHeightRange();
      doReturn((-2.123884926E9)).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getWidthConstraintType();
      doReturn((Range) null).when(rectangleConstraint0).getWidthRange();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("eg!");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((-1495.45763430461), (double)1, 0.0).when(range0).getLowerBound();
      doReturn(0.0, (double)2147483645, 3.4028234663852886E38, (-1495.45763430461)).when(range0).getUpperBound();
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.FIXED;
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn((double)2147483645).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn(2695.4297897).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType1).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range0).when(rectangleConstraint0).getWidthRange();
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("org.jfree.chart.title.ShortTextTitle");
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(1.073741824E9).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn((Range) null).when(rectangleConstraint0).getHeightRange();
      doReturn((-2.123884926E9)).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType1).when(rectangleConstraint0).getWidthConstraintType();
      doReturn((Range) null).when(rectangleConstraint0).getWidthRange();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("eg!");
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(fontMetrics0).getAscent();
      doReturn(2144541889).when(fontMetrics0).getHeight();
      doReturn(2144541889).when(fontMetrics0).stringWidth(anyString());
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((-1089.068), (-1089.068)).when(range0).getLowerBound();
      doReturn(5010.67310011, 180.0, (-2592.987463254939), 3327.333892974442).when(range0).getUpperBound();
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(2124.772363685925).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn(2695.4297897).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range0).when(rectangleConstraint0).getWidthRange();
      Size2D size2D0 = shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("eg!");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((-1495.45763430461), (double)1, 0.0).when(range0).getLowerBound();
      doReturn(0.0, (double)2147483645, 3.4028234663852886E38, (-1495.45763430461)).when(range0).getUpperBound();
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.FIXED;
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn((double)2147483645).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn(2695.4297897).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType1).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range0).when(rectangleConstraint0).getWidthRange();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((-1.921720328E9), (-300.0)).when(range0).getLowerBound();
      doReturn((-1.921720328E9), 0.0, 1.0, 6.0).when(range0).getUpperBound();
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(211.0).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn(1031.0).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType1).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range0).when(rectangleConstraint0).getWidthRange();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("eg!");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((FontMetrics) null).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(range0).getLowerBound();
      doReturn(0.0, 0.0, 0.0, 0.0).when(range0).getUpperBound();
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(29.0).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn((-1.0)).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range0).when(rectangleConstraint0).getWidthRange();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ShortTextTitle shortTextTitle0 = new ShortTextTitle("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((double)1031, (-829.430867109353), 0.0).when(range0).getLowerBound();
      doReturn((double)2145727733, 2.144536786E9, (-137.0), (double)2145727733).when(range0).getUpperBound();
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(2.144536786E9).when(rectangleConstraint0).getHeight();
      doReturn(lengthConstraintType0).when(rectangleConstraint0).getHeightConstraintType();
      doReturn(range0).when(rectangleConstraint0).getHeightRange();
      doReturn(0.0).when(rectangleConstraint0).getWidth();
      doReturn(lengthConstraintType1).when(rectangleConstraint0).getWidthConstraintType();
      doReturn(range0).when(rectangleConstraint0).getWidthRange();
      // Undeclared exception!
      try { 
        shortTextTitle0.arrange(graphics2D0, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.ShortTextTitle", e);
      }
  }
}
