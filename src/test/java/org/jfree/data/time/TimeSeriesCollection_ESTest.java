/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:16:58 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyChangeEvent;
import java.text.DateFormatSymbols;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseDate;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.Stack;
import java.util.TimeZone;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.ComparableObjectSeries;
import org.jfree.data.DomainOrder;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYIntervalSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeriesCollection_ESTest extends TimeSeriesCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      timeSeries0.setMaximumItemCount(2);
      timeSeriesCollection0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      Stack<String> stack0 = new Stack<String>();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      Range range1 = timeSeriesCollection0.getRangeBounds((List) stack0, range0, true);
      assertNull(range1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minute minute0 = new Minute();
      RegularTimePeriod regularTimePeriod0 = minute0.previous();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.add(regularTimePeriod0, (Number) 59, true);
      timeSeries0.add((RegularTimePeriod) minute0, (Number) 0, false);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      Range range0 = timeSeriesCollection0.getDomainBounds(false);
      assertEquals(1.39240928132E12, range0.getLowerBound(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'series' argument is out of bounds (0).
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2855, 2855, 2855);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      timeSeriesCollection0.removeSeries(timeSeries0);
      assertEquals(0, timeSeriesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1L);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "Untitled", "Untitled");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getX(0, 4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("?;V/");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      TimeSeries timeSeries0 = new TimeSeries("?;V/", "ebcs~E/", "");
      int int0 = timeSeriesCollection0.indexOf(timeSeries0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      Second second0 = new Second();
      long long0 = timeSeriesCollection0.getX((RegularTimePeriod) second0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("[*|Z]#8>w`LA");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      MockDate mockDate0 = new MockDate((-677), (-677), (-677), (-677), 2161, 1376);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      long long0 = timeSeriesCollection0.getX((RegularTimePeriod) fixedMillisecond0);
      assertEquals((-25413755764000L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(clock0);
      TimeSeries timeSeries0 = new TimeSeries(japaneseDate0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      Comparable comparable0 = timeSeriesCollection0.getSeriesKey(0);
      assertSame(japaneseDate0, comparable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      int int0 = timeSeriesCollection0.getSeriesCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.add((RegularTimePeriod) minute0, (Number) 0, false);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      Range range0 = timeSeriesCollection0.getRangeBounds(false);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.add((RegularTimePeriod) minute0, (Number) 0, true);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      int int0 = timeSeriesCollection0.getItemCount(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2996), "h}y,");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(simpleTimeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.vetoableChange((PropertyChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2855, 2855, 2855);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.removeSeries((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'series' argument is out of bounds (-1).
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection((TimeSeries) null);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.indexOf((TimeSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MOX");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getY((-598), (-598));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Year year0 = new Year(355);
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "S`yp}w64]vB");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getXValue((-1301), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("1o7m%[d 0%'emb");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getX((RegularTimePeriod) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(simpleTimeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getX((-145), 47);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(clock0);
      TimeSeries timeSeries0 = new TimeSeries(japaneseDate0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getSurroundingItems((-3054), (-3054));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'series' argument is out of bounds (-3054).
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getStartY((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getStartX((-3353), (-3353));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getSeriesIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-2166L), (-2166L));
      Date date0 = Date.from(instant0);
      Year year0 = new Year(date0);
      TimeSeries timeSeries0 = new TimeSeries(year0, "6T!`MAjU,}VsKh?LQ^", "X|-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getRangeBounds((List) null, (Range) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0, "org.jfree.data.DefaultKeyedValues2D", "pB{PY7\"-zO%-1_\"Q,");
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getItemCount(1566);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'series' argument is out of bounds (1566).
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-2166L), (-2166L));
      Date date0 = Date.from(instant0);
      Year year0 = new Year(date0);
      TimeSeries timeSeries0 = new TimeSeries(year0, "6T!`MAjU,}VsKh?LQ^", "X|-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getEndY((-4108), 9999);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection((TimeSeries) null);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getEndX((-1198), 244);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "Ok_8KaUAnG");
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      Range range0 = timeSeriesCollection0.getDomainBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getSeries((-1075));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'series' argument is out of bounds (-1075).
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Month month0 = new Month(1, 4302);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, (TimeZone) null);
      assertEquals(DomainOrder.ASCENDING, timeSeriesCollection0.getDomainOrder());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getY(120, (-3679));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 120, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection((TimeSeries) null);
      int int0 = timeSeriesCollection0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-2166L), (-2166L));
      Date date0 = Date.from(instant0);
      Year year0 = new Year(date0);
      TimeSeries timeSeries0 = new TimeSeries(year0, "6T!`MAjU,}VsKh?LQ^", "X|-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      TimeZone timeZone0 = TimeZone.getTimeZone("6T!`MAjU,}VsKh?LQ^");
      TimeSeriesCollection timeSeriesCollection1 = new TimeSeriesCollection(timeZone0);
      boolean boolean0 = timeSeriesCollection0.equals(timeSeriesCollection1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      TimeZone timeZone0 = TimeZone.getTimeZone("6T!`MAjU,}VsKh?L/^");
      TimeSeriesCollection timeSeriesCollection1 = new TimeSeriesCollection(timeZone0);
      boolean boolean0 = timeSeriesCollection0.equals(timeSeriesCollection1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(182, "_ailed to addconed tem.");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(simpleTimeZone0);
      boolean boolean0 = timeSeriesCollection0.equals(simpleTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(minute0, "", timeSeriesCollection0, minute0);
      timeSeriesCollection0.vetoableChange(propertyChangeEvent0);
      assertEquals("", propertyChangeEvent0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection((TimeSeries) null);
      HashSet<ComparableObjectSeries> hashSet0 = new HashSet<ComparableObjectSeries>();
      LinkedList<ComparableObjectSeries> linkedList0 = new LinkedList<ComparableObjectSeries>(hashSet0);
      Hour hour0 = new Hour();
      XYIntervalSeries xYIntervalSeries0 = new XYIntervalSeries(hour0, false, false);
      linkedList0.add((ComparableObjectSeries) xYIntervalSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getRangeBounds((List) linkedList0, (Range) null, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.XYIntervalSeries cannot be cast to java.lang.Comparable
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0, "org.jfree.data.DefaultKeyedValues2D", "pB{PY7\"-zO%-1_\"Q,");
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      Range range0 = timeSeriesCollection0.getRangeBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "!y!nwD-", "!y!nwD-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      Vector<String> vector0 = new Vector<String>();
      vector0.add("!y!nwD-");
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getDomainBounds((List) vector0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "!y!nwD-", "!y!nwD-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      Vector<String> vector0 = new Vector<String>();
      Range range0 = timeSeriesCollection0.getDomainBounds((List) vector0, true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.add((RegularTimePeriod) minute0, (Number) 0, true);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      Range range0 = timeSeriesCollection0.getDomainBounds(true);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      double double0 = timeSeriesCollection0.getDomainUpperBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2855, 2855, 2855);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      double double0 = timeSeriesCollection0.getDomainLowerBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      Year year0 = new Year();
      long long0 = timeSeriesCollection0.getX((RegularTimePeriod) year0);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      timeSeriesCollection0.removeAllSeries();
      assertEquals(0, timeSeriesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "!y!nwD-", "!y!nwD-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      timeSeriesCollection0.removeSeries(0);
      assertEquals(0, timeSeriesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "!y!nwD-", "!y!nwD-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      int int0 = timeSeriesCollection0.getSeriesIndex(millisecond0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0, 59, true, true);
      int int0 = timeSeriesCollection0.getSeriesIndex(simpleHistogramBin0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeZone timeZone0 = TimeZone.getDefault();
      RegularTimePeriod regularTimePeriod0 = week0.next();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      TimeSeries timeSeries1 = timeSeriesCollection0.getSeries((Comparable) regularTimePeriod0);
      assertNull(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "!y!nwD-", "!y!nwD-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      TimeSeries timeSeries1 = timeSeriesCollection0.getSeries((Comparable) millisecond0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = new Locale("Key", "Key", "HPD6");
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection((TimeSeries) null, timeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getSeriesKey((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'series' argument is out of bounds (-1).
         //
         verifyException("org.jfree.data.time.TimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      DomainOrder domainOrder0 = timeSeriesCollection0.getDomainOrder();
      assertEquals(DomainOrder.ASCENDING, domainOrder0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("1o7m%[d 0%'emb");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      TimePeriodAnchor timePeriodAnchor0 = timeSeriesCollection0.getXPosition();
      assertEquals(TimePeriodAnchor.START, timePeriodAnchor0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection((TimeSeries) null);
      Object object0 = timeSeriesCollection0.clone();
      assertNotSame(object0, timeSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      int int0 = timeSeriesCollection0.indexOf(timeSeries0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "!y!nwD-", "!y!nwD-");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getEndY(0, 775);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 775, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getStartX(29, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      // Undeclared exception!
      try { 
        timeSeriesCollection0.removeSeries((TimeSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.START;
      timeSeriesCollection0.setXPosition(timePeriodAnchor0);
      assertEquals(0, timeSeriesCollection0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      List list0 = timeSeriesCollection0.getSeries();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getXValue(9999, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 9999, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getEndX(106, 106);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 106, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      MockDate mockDate0 = new MockDate(152, 1331, 1566, 1331, 3716, (-1844));
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute(152, hour0);
      TimeSeries timeSeries0 = new TimeSeries(minute0, "org.jfree.data.time.TimePeriodValue", (String) null);
      timeSeriesCollection0.addSeries(timeSeries0);
      assertNull(timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      int int0 = timeSeriesCollection0.getItemCount(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      // Undeclared exception!
      try { 
        timeSeriesCollection0.getStartY(59, (-671));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
