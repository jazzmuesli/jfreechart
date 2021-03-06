/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:07:05 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.util.LogFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LogFormat_ESTest extends LogFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("*$M;Ar5KPZ6");
      logFormat0.setExponentFormat(choiceFormat0);
      LogFormat logFormat1 = new LogFormat((-5350.915437), "*$M;Ar5KPZ6", true);
      Object object0 = logFormat1.clone();
      logFormat0.equals(object0);
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((-476));
      fieldPosition0.setBeginIndex(1);
      // Undeclared exception!
      try { 
        logFormat0.format((-1L), stringBuffer0, fieldPosition0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("*$M;Ar5KPZ6");
      logFormat0.setExponentFormat(choiceFormat0);
      logFormat0.setMaximumIntegerDigits(1724);
      LogFormat logFormat1 = new LogFormat();
      Object object0 = logFormat1.clone();
      logFormat0.equals(object0);
      logFormat0.getExponentFormat();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      logFormat0.clone();
      StringBuffer stringBuffer0 = new StringBuffer(1415);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, (-620));
      StringBuffer stringBuffer1 = logFormat0.format((double) 1L, stringBuffer0, fieldPosition0);
      StringBuffer stringBuffer2 = new StringBuffer(stringBuffer1);
      logFormat0.format(1L, stringBuffer2, fieldPosition0);
      ParsePosition parsePosition0 = new ParsePosition((-620));
      logFormat0.parse("", parsePosition0);
      logFormat0.parse((String) null, parsePosition0);
      LogFormat logFormat1 = new LogFormat();
      logFormat0.equals(logFormat1);
      logFormat1.setMaximumIntegerDigits((-620));
      logFormat0.setExponentFormat(logFormat1);
      logFormat0.getExponentFormat();
      StringBuffer stringBuffer3 = logFormat0.format((double) (-620), stringBuffer2, fieldPosition0);
      logFormat1.format((-2187L), stringBuffer3, fieldPosition0);
      logFormat1.format(2701.59368010423, stringBuffer0, fieldPosition0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-2489.9485), "", false);
      logFormat0.equals(logFormat0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-3521.947106780026), "org.jfree.chart.util.Args", "6/!@{+CT@yGfq-", true);
      LogFormat logFormat1 = new LogFormat((-3521.947106780026), "' (", "org.jfree.chart.util.Args", true);
      logFormat0.equals(logFormat1);
      long long0 = 0L;
      DecimalFormat decimalFormat0 = new DecimalFormat("6/!@{+CT@yGfq-");
      LogFormat logFormat2 = new LogFormat();
      FieldPosition fieldPosition0 = new FieldPosition((-1));
      StringBuffer stringBuffer0 = logFormat2.format(2112.8462516307145, (StringBuffer) null, fieldPosition0);
      // Undeclared exception!
      try { 
        decimalFormat0.format((Object) "6/!@{+CT@yGfq-", stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat(1753.5363681446, "", true);
      ParsePosition parsePosition0 = new ParsePosition(392);
      parsePosition0.setErrorIndex(392);
      logFormat0.parse("", parsePosition0);
      logFormat0.parse("", parsePosition0);
      StringBuffer stringBuffer0 = new StringBuffer("");
      StringBuffer stringBuffer1 = stringBuffer0.append("");
      stringBuffer0.setLength(392);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      stringBuffer1.setCharAt(0, 'v');
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 392);
      parsePosition0.setErrorIndex(1);
      fieldPosition0.setBeginIndex(392);
      logFormat0.format((-551.0), stringBuffer0, fieldPosition0);
      NumberFormat numberFormat0 = null;
      // Undeclared exception!
      try { 
        logFormat0.setExponentFormat((NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'format' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat(902.27403759638, "", "", false);
      Locale locale0 = Locale.FRENCH;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>(linkedList0);
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) list0);
      NumberFormat.getInstance(locale0);
      logFormat0.getExponentFormat();
      String string0 = "q`gv@+P-Ww";
      LogFormat logFormat1 = new LogFormat((-1096.334942806), "q`gv@+P-Ww", false);
      logFormat0.equals(logFormat1);
      long long0 = 415L;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      linkedList0.listIterator();
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      decimalFormatSymbols0.setInternationalCurrencySymbol("");
      decimalFormatSymbols0.getCurrency();
      // Undeclared exception!
      try { 
        logFormat0.setCurrency((Currency) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.NumberFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-3521.667581843669), "", true);
      LogFormat logFormat1 = new LogFormat();
      logFormat0.equals(logFormat1);
      // Undeclared exception!
      try { 
        NumberFormat.getCurrencyInstance((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      NumberFormat.getInstance();
      logFormat0.clone();
      Object object0 = new Object();
      logFormat0.equals(object0);
      Object object1 = logFormat0.clone();
      NumberFormat.getCurrencyInstance();
      int int0 = (-1733);
      ParsePosition parsePosition0 = new ParsePosition((-1733));
      int int1 = (-2559);
      parsePosition0.setIndex((-1733));
      parsePosition0.setErrorIndex((-2559));
      logFormat0.parse("s}3.5,#S>iMe~6[", parsePosition0);
      logFormat0.equals(object1);
      logFormat0.clone();
      logFormat0.getExponentFormat();
      logFormat0.parse("]|i[rMUxkm", parsePosition0);
      StringBuffer stringBuffer0 = null;
      try {
        stringBuffer0 = new StringBuffer((-58));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      Locale locale0 = Locale.ITALIAN;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      logFormat0.setExponentFormat(numberFormat0);
      logFormat0.getExponentFormat();
      NumberFormat.getNumberInstance(locale0);
      NumberFormat.getNumberInstance(locale0);
      long long0 = (-3098L);
      NumberFormat numberFormat1 = NumberFormat.getInstance();
      long long1 = 0L;
      double double0 = (-1003.8);
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      int int0 = (-1);
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, (-1));
      StringBuffer stringBuffer1 = logFormat0.format((-1003.8), stringBuffer0, fieldPosition0);
      numberFormat1.setGroupingUsed(true);
      // Undeclared exception!
      try { 
        stringBuffer1.insert((-1), ";+^'ir61U%2|Gy<HU");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogFormat logFormat0 = null;
      try {
        logFormat0 = new LogFormat((-1943.391493708), (String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'baseLabel' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      String string1 = "baseLabel";
      LogFormat logFormat0 = new LogFormat((-2065.131), "", "baseLabel", false);
      NumberFormat.getInstance();
      Locale locale0 = Locale.PRC;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1, locale_FilteringMode0);
      linkedList1.add(locale0);
      LogFormat logFormat1 = null;
      try {
        logFormat1 = new LogFormat((-2065.131), "Tg`eX8?St'l,mv4", (String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'powerLabel' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      LogFormat logFormat1 = new LogFormat();
      logFormat0.setExponentFormat(logFormat1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat(0.0, "D", "", false);
      logFormat0.clone();
      Locale locale0 = Locale.forLanguageTag("K'XU");
      locale0.getDisplayLanguage();
      NumberFormat.getIntegerInstance(locale0);
      Locale locale1 = Locale.KOREAN;
      NumberFormat.getInstance(locale1);
      logFormat0.format(0L);
      NumberFormat.getNumberInstance();
      logFormat0.setMinimumFractionDigits(0);
      logFormat0.setMaximumIntegerDigits(2634);
      logFormat0.clone();
      logFormat0.getExponentFormat();
      logFormat0.clone();
      logFormat0.clone();
      ParsePosition parsePosition0 = new ParsePosition(0);
      logFormat0.parse("org.jfree.chart.util.LogFormat", parsePosition0);
      logFormat0.equals("");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-1702.71742), "org.jfree.chart.util.LogFormat", "org.jfree.chart.util.LogFormat", false);
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((-1));
      logFormat0.format((-1844.45121), stringBuffer0, fieldPosition0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-1.0), "", false);
      ParsePosition parsePosition0 = new ParsePosition(1842);
      logFormat0.parse("", parsePosition0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      ParsePosition parsePosition0 = new ParsePosition((-1));
      logFormat0.parse("", parsePosition0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat(0.0, "", "", true);
      FieldPosition fieldPosition0 = new FieldPosition((Format.Field) null);
      StringBuffer stringBuffer0 = logFormat0.format(0L, (StringBuffer) null, fieldPosition0);
      logFormat0.format(0.0, stringBuffer0, fieldPosition0);
      logFormat0.getExponentFormat();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      logFormat0.format(952.0188740779585);
      // Undeclared exception!
      try { 
        NumberFormat.getCurrencyInstance((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      Locale locale0 = Locale.ENGLISH;
      NumberFormat.getPercentInstance(locale0);
      logFormat0.setMaximumIntegerDigits(0);
      logFormat0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat(0.0, "powerLabel", "powerLabel", true);
      DecimalFormat decimalFormat0 = (DecimalFormat)logFormat0.getExponentFormat();
      assertEquals(0, decimalFormat0.getGroupingSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat(1007.722984562, "0.0#", true);
      StringBuffer stringBuffer0 = logFormat0.format(1.0, (StringBuffer) null, (FieldPosition) null);
      assertNotNull(stringBuffer0);
      assertEquals("0.0#^0.0", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-2489.9485), "J", false);
      boolean boolean0 = logFormat0.equals(logFormat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-3521.947106780026), "org.jfree.chart.util.Args", "6/!@{+CT@yGfq-", true);
      LogFormat logFormat1 = new LogFormat((-3521.947106780026), "6/!@{+CT@yGfq-", "org.jfree.chart.util.Args", true);
      boolean boolean0 = logFormat0.equals(logFormat1);
      assertFalse(boolean0);
      
      DecimalFormat decimalFormat0 = new DecimalFormat("6/!@{+CT@yGfq-");
      NumberFormat.getCurrencyInstance();
      LogFormat logFormat2 = new LogFormat();
      FieldPosition fieldPosition0 = new FieldPosition((-1));
      StringBuffer stringBuffer0 = logFormat2.format(2112.8462516307145, (StringBuffer) null, fieldPosition0);
      assertEquals("10^3.32", stringBuffer0.toString());
      
      StringBuffer stringBuffer1 = logFormat0.format((double) 11L, (StringBuffer) null, fieldPosition0);
      assertNotNull(stringBuffer1);
      
      StringBuffer stringBuffer2 = logFormat1.format(11L, stringBuffer1, fieldPosition0);
      assertEquals("6/!@{+CT@yGfq-org.jfree.chart.util.Args\uFFFD", stringBuffer2.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      LogFormat logFormat1 = (LogFormat)logFormat0.clone();
      assertTrue(logFormat1.equals((Object)logFormat0));
      
      StringBuffer stringBuffer0 = new StringBuffer(1415);
      ParsePosition parsePosition0 = new ParsePosition((-620));
      logFormat0.parse((String) null, parsePosition0);
      logFormat0.setExponentFormat(logFormat1);
      LogFormat logFormat2 = new LogFormat();
      boolean boolean0 = logFormat0.equals(logFormat2);
      assertFalse(boolean0);
      
      logFormat0.setExponentFormat(logFormat2);
      logFormat0.getExponentFormat();
      LogFormat logFormat3 = (LogFormat)logFormat1.clone();
      assertNotSame(logFormat3, logFormat0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      LogFormat logFormat1 = (LogFormat)logFormat0.clone();
      StringBuffer stringBuffer0 = new StringBuffer(1415);
      ParsePosition parsePosition0 = new ParsePosition((-620));
      logFormat0.parse((String) null, parsePosition0);
      LogFormat logFormat2 = new LogFormat();
      logFormat0.equals(logFormat2);
      assertTrue(logFormat2.equals((Object)logFormat0));
      
      logFormat0.setExponentFormat(logFormat2);
      logFormat0.getExponentFormat();
      LogFormat logFormat3 = (LogFormat)logFormat1.clone();
      assertFalse(logFormat3.equals((Object)logFormat0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-1430.4562711392362), "", false);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      char[] charArray0 = new char[4];
      charArray0[0] = '~';
      charArray0[1] = 'i';
      charArray0[2] = '_';
      charArray0[3] = '0';
      stringBuffer0.insert(0, charArray0, 0, 0);
      FieldPosition fieldPosition0 = new FieldPosition(3243);
      StringBuffer stringBuffer1 = logFormat0.format((-3540.0), stringBuffer0, fieldPosition0);
      StringBuffer stringBuffer2 = logFormat0.format((-1430.4562711392362), stringBuffer1, fieldPosition0);
      StringBuffer stringBuffer3 = logFormat0.format((-636L), stringBuffer2, fieldPosition0);
      assertNotSame(stringBuffer3, stringBuffer2);
      assertEquals(1, stringBuffer2.length());
      assertEquals(1, stringBuffer3.length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("*$M;Ar5KPZ6");
      logFormat0.setExponentFormat(choiceFormat0);
      LogFormat logFormat1 = new LogFormat((-5350.915437), "*$M;Ar5KPZ6", true);
      Object object0 = logFormat1.clone();
      boolean boolean0 = logFormat0.equals(object0);
      assertFalse(object0.equals((Object)logFormat1));
      assertNotSame(object0, logFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LogFormat logFormat0 = new LogFormat((-2489.9485), "", false);
      Object object0 = logFormat0.clone();
      boolean boolean0 = logFormat0.equals(object0);
      assertFalse(boolean0);
  }
}
