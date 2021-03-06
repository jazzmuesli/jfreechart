/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:17:31 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.text.AttributedString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.axis.CategoryTick;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateTick;
import org.jfree.chart.axis.LogTick;
import org.jfree.chart.axis.NumberTick;
import org.jfree.chart.axis.TickType;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Tick_ESTest extends Tick_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = Integer.getInteger(",z<S_xiSAE7M1aq", (-2057));
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      CategoryTick categoryTick0 = new CategoryTick(integer0, textBlock0, textBlockAnchor0, textAnchor0, 1268.0053);
      CategoryTick categoryTick1 = new CategoryTick(integer0, textBlock0, textBlockAnchor0, textAnchor0, 0.0);
      boolean boolean0 = categoryTick0.equals(categoryTick1);
      assertFalse(boolean0);
      assertFalse(categoryTick1.equals((Object)categoryTick0));
      assertEquals(0.0, categoryTick1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Short short0 = new Short((short)0);
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_RIGHT;
      NumberTick numberTick0 = new NumberTick(short0, (String) null, textAnchor0, textAnchor0, 1655.0);
      numberTick0.toString();
      assertEquals(1655.0, numberTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TickType tickType0 = TickType.MAJOR;
      MockDate mockDate0 = new MockDate();
      TextAnchor textAnchor0 = TextAnchor.BASELINE_RIGHT;
      DateTick dateTick0 = new DateTick(tickType0, mockDate0, "oLT.l(`|", textAnchor0, textAnchor0, 362.196501447);
      dateTick0.toString();
      assertEquals(362.196501447, dateTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Short short0 = new Short((short)0);
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      NumberTick numberTick0 = new NumberTick(short0, "", textAnchor0, textAnchor0, (short)0);
      numberTick0.getTextAnchor();
      assertEquals(0.0, numberTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.CENTER_LEFT;
      MockDate mockDate0 = new MockDate();
      DateTick dateTick0 = new DateTick(mockDate0, "Hm{0{qyA`x]\u0007sL%Fe9", textAnchor0, textAnchor0, 0.0);
      dateTick0.getTextAnchor();
      assertEquals(0.0, dateTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TickType tickType0 = TickType.MAJOR;
      AttributedString attributedString0 = new AttributedString("org.jfree.chart.axis.ValueTick");
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_RIGHT;
      LogTick logTick0 = new LogTick(tickType0, 3397.238145, attributedString0, textAnchor0);
      logTick0.getTextAnchor();
      assertEquals(0.0, logTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TickType tickType0 = TickType.MAJOR;
      MockDate mockDate0 = new MockDate();
      TextAnchor textAnchor0 = TextAnchor.BASELINE_RIGHT;
      DateTick dateTick0 = new DateTick(tickType0, mockDate0, "oLT.l(`|", textAnchor0, textAnchor0, 362.196501447);
      dateTick0.getTextAnchor();
      assertEquals(362.196501447, dateTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TickType tickType0 = TickType.MAJOR;
      AttributedString attributedString0 = new AttributedString("org.jfree.chart.axis.Tick");
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      LogTick logTick0 = new LogTick(tickType0, (-100.75959), attributedString0, textAnchor0);
      logTick0.getText();
      assertEquals(0.0, logTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      CategoryTick categoryTick0 = new CategoryTick((Comparable) null, textBlock0, textBlockAnchor0, textAnchor0, 21.0472794144831);
      categoryTick0.getText();
      assertEquals(21.0472794144831, categoryTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparable<DateTick> comparable0 = (Comparable<DateTick>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      CategoryTick categoryTick0 = new CategoryTick(comparable0, textBlock0, textBlockAnchor0, textAnchor0, 3682.1);
      TextAnchor textAnchor1 = categoryTick0.getTextAnchor();
      TickType tickType0 = TickType.MAJOR;
      MockDate mockDate0 = new MockDate();
      DateTick dateTick0 = new DateTick(tickType0, mockDate0, "org.jfree.chart.text.TextBlock", textAnchor0, textAnchor1, 3165.747525002931);
      TextAnchor textAnchor2 = dateTick0.getRotationAnchor();
      assertEquals(3165.747525002931, dateTick0.getAngle(), 0.01);
      assertFalse(textAnchor2.isHalfAscent());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 40);
      TextAnchor textAnchor0 = TextAnchor.TOP_RIGHT;
      DateTick dateTick0 = new DateTick(mockDate0, "", textAnchor0, textAnchor0, 1.0);
      dateTick0.getRotationAnchor();
      assertEquals(1.0, dateTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1114), 871, 871, 2389, 6, 6);
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_LEFT;
      DateTick dateTick0 = new DateTick(mockDate0, "rangeType", textAnchor0, textAnchor0, 2389);
      dateTick0.getRotationAnchor();
      assertEquals(2389.0, dateTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TickType tickType0 = TickType.MAJOR;
      MockDate mockDate0 = new MockDate();
      TextAnchor textAnchor0 = TextAnchor.TOP_RIGHT;
      TextAnchor textAnchor1 = TextAnchor.BASELINE_CENTER;
      DateTick dateTick0 = new DateTick(tickType0, mockDate0, "\"(zUF9&!\"H)!W 5", textAnchor0, textAnchor1, 1797.4963009489463);
      TextAnchor textAnchor2 = dateTick0.getRotationAnchor();
      assertEquals(1797.4963009489463, dateTick0.getAngle(), 0.01);
      assertTrue(textAnchor2.isHorizontalCenter());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TickType tickType0 = TickType.MAJOR;
      AttributedString attributedString0 = new AttributedString("org.jfree.chart.axis.Tick");
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      LogTick logTick0 = new LogTick(tickType0, (-100.75959), attributedString0, textAnchor0);
      double double0 = logTick0.getAngle();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = Integer.getInteger(",z<S_xiSAE7M1aq", (-2057));
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      CategoryTick categoryTick0 = new CategoryTick(integer0, textBlock0, textBlockAnchor0, textAnchor0, 1268.0053);
      double double0 = categoryTick0.getAngle();
      assertEquals(1268.0053, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1851, 549, 4, 549);
      TextAnchor textAnchor0 = TextAnchor.BASELINE_LEFT;
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      CategoryTick categoryTick0 = new CategoryTick(mockDate0, textBlock0, textBlockAnchor0, textAnchor0, 0.0);
      categoryTick0.equals(categoryTick0);
      assertEquals(0.0, categoryTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparable<NumberTick> comparable0 = (Comparable<NumberTick>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      CategoryTick categoryTick0 = new CategoryTick(comparable0, textBlock0, textBlockAnchor0, textAnchor0, 1382.982143727816);
      Comparable<CyclicNumberAxis.CycleBoundTick> comparable1 = (Comparable<CyclicNumberAxis.CycleBoundTick>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      CategoryTick categoryTick1 = new CategoryTick(comparable1, textBlock0, textBlockAnchor0, textAnchor0, 2037.857);
      categoryTick0.equals(categoryTick1);
      assertEquals(2037.857, categoryTick1.getAngle(), 0.01);
      assertEquals(1382.982143727816, categoryTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_LEFT;
      TextAnchor textAnchor0 = TextAnchor.BASELINE_LEFT;
      CategoryTick categoryTick0 = new CategoryTick(comparable0, textBlock0, textBlockAnchor0, textAnchor0, (-1380.6));
      TextAnchor textAnchor1 = TextAnchor.CENTER;
      CategoryTick categoryTick1 = new CategoryTick("", textBlock0, textBlockAnchor0, textAnchor1, (-1380.6));
      categoryTick0.equals(categoryTick1);
      assertEquals((-1380.6), categoryTick1.getAngle(), 0.01);
      assertEquals((-1380.6), categoryTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1114), 871, 871, 2389, 6, 6);
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_LEFT;
      TextAnchor textAnchor1 = TextAnchor.CENTER;
      DateTick dateTick0 = new DateTick(mockDate0, "rangeType", textAnchor0, textAnchor1, 6);
      DateTick dateTick1 = new DateTick(mockDate0, "rangeType", textAnchor1, textAnchor0, 2389);
      boolean boolean0 = dateTick0.equals(dateTick1);
      assertFalse(boolean0);
      assertEquals(2389.0, dateTick1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      TickType tickType0 = TickType.MAJOR;
      MockDate mockDate0 = new MockDate();
      DateTick dateTick0 = new DateTick(tickType0, mockDate0, "org.jfree.chart.text.TextBlock", textAnchor0, textAnchor0, 3165.747525002931);
      DateTick dateTick1 = new DateTick(mockDate0, "eW~jtr}!JlDfw?nT", textAnchor0, textAnchor0, 3682.1);
      boolean boolean0 = dateTick0.equals(dateTick1);
      assertFalse(boolean0);
      assertEquals(3682.1, dateTick1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      TickType tickType0 = TickType.MAJOR;
      MockDate mockDate0 = new MockDate();
      DateTick dateTick0 = new DateTick(tickType0, mockDate0, "org.jfree.chart.text.TextBlock", textAnchor0, textAnchor0, 3165.747525002931);
      dateTick0.getRotationAnchor();
      assertEquals(3165.747525002931, dateTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      TickType tickType0 = TickType.MAJOR;
      MockDate mockDate0 = new MockDate();
      DateTick dateTick0 = new DateTick(tickType0, mockDate0, "org.jfree.chart.text.TextBlock", textAnchor0, textAnchor0, 3165.747525002931);
      dateTick0.getText();
      assertEquals(3165.747525002931, dateTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparable<DateTick> comparable0 = (Comparable<DateTick>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      CategoryTick categoryTick0 = new CategoryTick(comparable0, textBlock0, textBlockAnchor0, textAnchor0, 3682.1);
      categoryTick0.toString();
      assertEquals(3682.1, categoryTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      TickType tickType0 = TickType.MINOR;
      AttributedString attributedString0 = new AttributedString("26?1[-#0T<PHqJ-T`");
      LogTick logTick0 = new LogTick(tickType0, (-1010.2), attributedString0, textAnchor0);
      logTick0.getTextAnchor();
      assertEquals(0.0, logTick0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TickType tickType0 = TickType.MINOR;
      TextAnchor textAnchor0 = TextAnchor.TOP_RIGHT;
      NumberTick numberTick0 = new NumberTick(tickType0, (-1253.4846435796705), "", textAnchor0, textAnchor0, (-1253.4846435796705));
      double double0 = numberTick0.getAngle();
      assertEquals((-1253.4846435796705), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparable<NumberTick> comparable0 = (Comparable<NumberTick>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      TextBlock textBlock0 = new TextBlock();
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.CENTER;
      CategoryTick categoryTick0 = new CategoryTick(comparable0, textBlock0, textBlockAnchor0, textAnchor0, 1382.982143727816);
      CategoryTick categoryTick1 = (CategoryTick)categoryTick0.clone();
      boolean boolean0 = categoryTick0.equals(categoryTick1);
      assertTrue(boolean0);
      assertEquals(1382.982143727816, categoryTick1.getAngle(), 0.01);
      assertNotSame(categoryTick1, categoryTick0);
  }
}
