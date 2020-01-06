/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:24:04 GMT 2019
 */

package org.jfree.data.gantt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.VectorDataItem;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TaskSeriesCollection_ESTest extends TaskSeriesCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      VectorDataItem vectorDataItem0 = new VectorDataItem((-1495.71411257), (-1495.71411257), (-1495.71411257), (-1495.71411257));
      VectorDataItem vectorDataItem1 = (VectorDataItem)vectorDataItem0.clone();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getPercentComplete((Comparable) vectorDataItem1, (Comparable) vectorDataItem0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Week week0 = new Week();
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getStartValue((Comparable) regularTimePeriod0, (Comparable) week0, 305);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getStartValue(0, (-1), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MockDate mockDate0 = new MockDate(983);
      Year year0 = new Year(mockDate0);
      Week week0 = new Week(983, year0);
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSubIntervalCount((Comparable) week0, (Comparable) year0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYDataItem xYDataItem0 = new XYDataItem((-1.0), (-1.0));
      Millisecond millisecond0 = new Millisecond();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getPercentComplete((Comparable) xYDataItem0, (Comparable) millisecond0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MockDate mockDate0 = new MockDate(0L);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.US;
      Month month0 = new Month(mockDate0, timeZone0, locale0);
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getEndValue((Comparable) month0, (Comparable) mockDate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYDataItem xYDataItem0 = new XYDataItem((-1079.08), 1.0);
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getValue((Comparable) 0, (Comparable) xYDataItem0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.remove(17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // TaskSeriesCollection.remove(): index outside valid range.
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSeries(1075);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("(-.G/e8P~'m&");
      taskSeriesCollection0.add(taskSeries0);
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getPercentComplete(0, (-9999), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("]FdE#B");
      taskSeries0.setNotify(false);
      taskSeriesCollection0.add(taskSeries0);
      TaskSeries taskSeries1 = taskSeriesCollection0.getSeries((Comparable) "]FdE#B");
      assertSame(taskSeries1, taskSeries0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("");
      taskSeriesCollection0.add(taskSeries0);
      List list0 = taskSeriesCollection0.getRowKeys();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYDataItem xYDataItem0 = new XYDataItem(0.0, (double) 0);
      int int0 = taskSeriesCollection0.getColumnIndex(xYDataItem0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.remove((TaskSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getValue((-1), (-1000));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSubIntervalCount(2243, 2243);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2243, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getStartValue((-1), (-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getStartValue((-3007), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSeriesKey(52);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 52, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getRowKey((-3161));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getPercentComplete(13, 1027);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 13, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getEndValue((Comparable) month0, (Comparable) mockDate0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getEndValue(0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getEndValue((-308), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getColumnKey(1708);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1708, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.add((TaskSeries) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'series' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Month month0 = new Month();
      int int0 = taskSeriesCollection0.getRowIndex(month0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getRowKey(1713);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1713, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      int int0 = taskSeriesCollection0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      int int0 = taskSeriesCollection0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getStartValue(151, 1900);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 151, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeriesCollection taskSeriesCollection1 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("|8 .K[m>'=+%");
      taskSeriesCollection1.add(taskSeries0);
      boolean boolean0 = taskSeriesCollection0.equals(taskSeriesCollection1);
      assertFalse(taskSeriesCollection1.equals((Object)taskSeriesCollection0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeriesCollection taskSeriesCollection1 = new TaskSeriesCollection();
      boolean boolean0 = taskSeriesCollection0.equals(taskSeriesCollection1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      boolean boolean0 = taskSeriesCollection0.equals("}K6vJ,1`iv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("(-.G/e8P~'m&");
      taskSeriesCollection0.add(taskSeries0);
      Number number0 = taskSeriesCollection0.getPercentComplete((Comparable) "(-.G/e8P~'m&", (Comparable) "(-.G/e8P~'m&", 1);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("]FdE#B");
      taskSeriesCollection0.add(taskSeries0);
      Number number0 = taskSeriesCollection0.getStartValue((Comparable) "]FdE#B", (Comparable) "]FdE#B", 1705);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("]FdE#B");
      taskSeriesCollection0.add(taskSeries0);
      Number number0 = taskSeriesCollection0.getPercentComplete((Comparable) "]FdE#B", (Comparable) "]FdE#B");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("]FdE#B");
      taskSeriesCollection0.add(taskSeries0);
      taskSeriesCollection0.removeAll();
      assertEquals(0, taskSeriesCollection0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.remove(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // TaskSeriesCollection.remove(): index outside valid range.
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.remove((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // TaskSeriesCollection.remove(): index outside valid range.
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("");
      taskSeriesCollection0.remove(taskSeries0);
      assertNull(taskSeries0.getDescription());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MockDate mockDate0 = new MockDate(0L);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = new Locale("", "", "");
      TaskSeries taskSeries0 = new TaskSeries("");
      taskSeriesCollection0.add(taskSeries0);
      Hour hour0 = new Hour(mockDate0, timeZone0, locale0);
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getStartValue((Comparable) hour0, (Comparable) zoneOffset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSeries(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSeries((-129));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Series index out of bounds
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("]FdE#B");
      taskSeriesCollection0.add(taskSeries0);
      TaskSeries taskSeries1 = taskSeriesCollection0.getSeries((Comparable) "]FdE#B");
      assertEquals(0, taskSeries1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSeries((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.gantt.TaskSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = taskSeriesCollection0.getSeries((Comparable) "]FdE#B");
      assertNull(taskSeries0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getEndValue((-1946), 1988, 1988);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      List list0 = taskSeriesCollection0.getRowKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      List list0 = taskSeriesCollection0.getColumnKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getPercentComplete((-342), (-342));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getColumnIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getEndValue(1705, 1705);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1705, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getValue(2706, 2706);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2706, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSeriesKey((-260));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getPercentComplete(486, (-1418), (-5308));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 486, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getStartValue(52, 52, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 52, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MockDate mockDate0 = new MockDate(1L);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      SeriesChangeEvent seriesChangeEvent0 = new SeriesChangeEvent(timeSeries0);
      taskSeriesCollection0.seriesChanged(seriesChangeEvent0);
      assertEquals(0, taskSeriesCollection0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSubIntervalCount((-208), (-1675));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Object object0 = taskSeriesCollection0.clone();
      assertNotSame(object0, taskSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      int int0 = taskSeriesCollection0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getColumnKey((-882));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
