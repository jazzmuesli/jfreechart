/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:09:35 GMT 2019
 */

package org.jfree.chart.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextAnchor_ESTest extends TextAnchor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      TextAnchor textAnchor1 = TextAnchor.CENTER_RIGHT;
      boolean boolean0 = textAnchor0.equals(textAnchor1);
      assertFalse(boolean0);
      assertFalse(textAnchor1.equals((Object)textAnchor0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      TextAnchor textAnchor1 = TextAnchor.BOTTOM_LEFT;
      boolean boolean0 = textAnchor0.equals(textAnchor1);
      assertFalse(boolean0);
      assertFalse(textAnchor1.equals((Object)textAnchor0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_CENTER;
      boolean boolean0 = textAnchor0.equals(textAnchor0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      boolean boolean0 = textAnchor0.equals("xJj^4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.CENTER_RIGHT;
      boolean boolean0 = textAnchor0.isVerticalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      boolean boolean0 = textAnchor0.isVerticalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      boolean boolean0 = textAnchor0.isVerticalCenter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.CENTER_LEFT;
      boolean boolean0 = textAnchor0.isVerticalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      boolean boolean0 = textAnchor0.isHalfAscent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      boolean boolean0 = textAnchor0.isHalfAscent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      boolean boolean0 = textAnchor0.isHalfAscent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_LEFT;
      boolean boolean0 = textAnchor0.isHalfAscent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_RIGHT;
      boolean boolean0 = textAnchor0.isBaseline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_CENTER;
      boolean boolean0 = textAnchor0.isBaseline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_LEFT;
      boolean boolean0 = textAnchor0.isBaseline();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_LEFT;
      boolean boolean0 = textAnchor0.isBaseline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_RIGHT;
      boolean boolean0 = textAnchor0.isBottom();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      boolean boolean0 = textAnchor0.isBottom();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_LEFT;
      boolean boolean0 = textAnchor0.isBottom();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_LEFT;
      boolean boolean0 = textAnchor0.isBottom();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_LEFT;
      boolean boolean0 = textAnchor0.isTop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_RIGHT;
      boolean boolean0 = textAnchor0.isTop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      boolean boolean0 = textAnchor0.isTop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_LEFT;
      boolean boolean0 = textAnchor0.isTop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_LEFT;
      boolean boolean0 = textAnchor0.isHorizontalCenter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      boolean boolean0 = textAnchor0.isHorizontalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      boolean boolean0 = textAnchor0.isHorizontalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      boolean boolean0 = textAnchor0.isHorizontalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      boolean boolean0 = textAnchor0.isHorizontalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_CENTER;
      boolean boolean0 = textAnchor0.isHorizontalCenter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_RIGHT;
      boolean boolean0 = textAnchor0.isRight();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      boolean boolean0 = textAnchor0.isRight();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      boolean boolean0 = textAnchor0.isRight();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_RIGHT;
      boolean boolean0 = textAnchor0.isRight();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.CENTER_RIGHT;
      boolean boolean0 = textAnchor0.isRight();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_RIGHT;
      boolean boolean0 = textAnchor0.isRight();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.TOP_LEFT;
      boolean boolean0 = textAnchor0.isLeft();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_LEFT;
      boolean boolean0 = textAnchor0.isLeft();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.CENTER_LEFT;
      boolean boolean0 = textAnchor0.isLeft();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_LEFT;
      boolean boolean0 = textAnchor0.isLeft();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_RIGHT;
      boolean boolean0 = textAnchor0.isLeft();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_LEFT;
      boolean boolean0 = textAnchor0.isLeft();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_CENTER;
      String string0 = textAnchor0.toString();
      assertEquals("TextAnchor.BASELINE_CENTER", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.BASELINE_CENTER;
      textAnchor0.hashCode();
  }
}
