/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:12:23 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeriesDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeSeriesDataItem_ESTest extends TimeSeriesDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      doReturn((-1894)).when(regularTimePeriod0).compareTo(any());
      doReturn("#S'aUB").when(regularTimePeriod0).toString();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      RegularTimePeriod regularTimePeriod1 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(regularTimePeriod1).toString();
      TimeSeriesDataItem timeSeriesDataItem1 = new TimeSeriesDataItem(regularTimePeriod1, (double) (-1894));
      int int0 = timeSeriesDataItem0.compareTo(timeSeriesDataItem1);
      assertEquals((-1894), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (Number) null);
      Number number0 = timeSeriesDataItem0.getValue();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 0.0);
      Number number0 = timeSeriesDataItem0.getValue();
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(regularTimePeriod0).compareTo(any());
      doReturn((String) null, (String) null).when(regularTimePeriod0).toString();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1.0));
      int int0 = timeSeriesDataItem0.compareTo(timeSeriesDataItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1.0));
      Number number0 = timeSeriesDataItem0.getValue();
      TimeSeriesDataItem timeSeriesDataItem1 = null;
      try {
        timeSeriesDataItem1 = new TimeSeriesDataItem((RegularTimePeriod) null, number0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeSeriesDataItem timeSeriesDataItem0 = null;
      try {
        timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) null, (-681.03));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      doReturn("#S'aUB").when(regularTimePeriod0).toString();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      RegularTimePeriod regularTimePeriod1 = timeSeriesDataItem0.getPeriod();
      assertSame(regularTimePeriod1, regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      int int0 = timeSeriesDataItem0.compareTo((Object) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      timeSeriesDataItem0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      Object object0 = timeSeriesDataItem0.clone();
      assertTrue(object0.equals((Object)timeSeriesDataItem0));
      
      timeSeriesDataItem0.setValue(1);
      boolean boolean0 = timeSeriesDataItem0.equals(object0);
      assertFalse(object0.equals((Object)timeSeriesDataItem0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      RegularTimePeriod regularTimePeriod1 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem1 = new TimeSeriesDataItem(regularTimePeriod1, (double) (-1894));
      boolean boolean0 = timeSeriesDataItem1.equals(timeSeriesDataItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      boolean boolean0 = timeSeriesDataItem0.equals(timeSeriesDataItem0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      boolean boolean0 = timeSeriesDataItem0.equals("#S'aUB");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      Number number0 = timeSeriesDataItem0.getValue();
      assertEquals(1566.7260987262823, number0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 1566.7260987262823);
      Object object0 = timeSeriesDataItem0.clone();
      boolean boolean0 = timeSeriesDataItem0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegularTimePeriod regularTimePeriod0 = mock(RegularTimePeriod.class, new ViolatedAssumptionAnswer());
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (Number) null);
      timeSeriesDataItem0.hashCode();
  }
}
