/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:49:31 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeSeriesTableModel_ESTest extends TimeSeriesTableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(78, 0).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      timeSeriesTableModel0.getRowCount();
      timeSeriesTableModel0.setValueAt((Object) null, 5, (-1562));
      assertEquals(2, timeSeriesTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      boolean boolean0 = timeSeriesTableModel0.isCellEditable(3828, (-4090));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel();
      Object object0 = timeSeriesTableModel0.getValueAt((-735), (-735));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel();
      Object object0 = timeSeriesTableModel0.getValueAt(0, 9);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0, 2).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      timeSeriesTableModel0.getRowCount();
      int int0 = timeSeriesTableModel0.getRowCount();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      String string0 = timeSeriesTableModel0.getColumnName(0);
      assertEquals("Period:", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      Class class0 = timeSeriesTableModel0.getColumnClass(1);
      // Undeclared exception!
      try { 
        timeSeriesTableModel0.setValueAt(class0, 0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel();
      // Undeclared exception!
      try { 
        timeSeriesTableModel0.getValueAt((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = null;
      try {
        timeSeriesTableModel0 = new TimeSeriesTableModel((TimeSeries) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeriesTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = null;
      try {
        timeSeriesTableModel0 = new TimeSeriesTableModel((TimeSeries) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeriesTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel();
      // Undeclared exception!
      try { 
        timeSeriesTableModel0.setValueAt((Object) null, 4, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, false);
      timeSeriesTableModel0.setValueAt(timeSeriesTableModel0, 1297, 0);
      assertEquals(6, timeSeriesTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel();
      Class<TimeSeriesTableModel> class0 = TimeSeriesTableModel.class;
      timeSeriesTableModel0.setValueAt(class0, (-3151), 1);
      assertEquals(0, timeSeriesTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0, 2).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      Class class0 = timeSeriesTableModel0.getColumnClass(0);
      assertNotNull(class0);
      
      timeSeriesTableModel0.getRowCount();
      timeSeriesTableModel0.setValueAt(class0, 0, 1537);
      assertEquals("class java.lang.String", class0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      boolean boolean0 = timeSeriesTableModel0.isCellEditable(0, 2433);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      boolean boolean0 = timeSeriesTableModel0.isCellEditable(0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      boolean boolean0 = timeSeriesTableModel0.isCellEditable(0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      boolean boolean0 = timeSeriesTableModel0.isCellEditable(3110, 11);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      Object object0 = timeSeriesTableModel0.getValueAt(7, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      Object object0 = timeSeriesTableModel0.getValueAt((-892), 8);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(regularTimePeriod0).toString();
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeSeries0).getItemCount();
      doReturn(regularTimePeriod0).when(timeSeries0).getTimePeriod(anyInt());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      Object object0 = timeSeriesTableModel0.getValueAt((-707), 0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeSeries0).getItemCount();
      doReturn((Number) null).when(timeSeries0).getValue(anyInt());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      Object object0 = timeSeriesTableModel0.getValueAt((-1182), 1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      Object object0 = timeSeriesTableModel0.getValueAt(81, (-2455));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      String string0 = timeSeriesTableModel0.getColumnName((-1));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0);
      timeSeriesTableModel0.findColumn("Number format excption");
      assertEquals(2, timeSeriesTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      Class class0 = timeSeriesTableModel0.getColumnClass((-4716));
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      int int0 = timeSeriesTableModel0.getColumnCount();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      doReturn((-3000)).when(timeSeries0).getItemCount();
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      int int0 = timeSeriesTableModel0.getRowCount();
      assertEquals((-3000), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel();
      Object object0 = timeSeriesTableModel0.getValueAt(1, 1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeSeries timeSeries0 = mock(TimeSeries.class, new ViolatedAssumptionAnswer());
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, true);
      SeriesChangeEvent seriesChangeEvent0 = mock(SeriesChangeEvent.class, new ViolatedAssumptionAnswer());
      timeSeriesTableModel0.seriesChanged(seriesChangeEvent0);
      assertEquals(2, timeSeriesTableModel0.getColumnCount());
  }
}