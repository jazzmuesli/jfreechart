/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:37:17 GMT 2019
 */

package org.jfree.chart.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeEventType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ChartChangeEvent_ESTest extends ChartChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JFreeChart jFreeChart0 = mock(JFreeChart.class, new ViolatedAssumptionAnswer());
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.NEW_DATASET;
      ChartChangeEvent chartChangeEvent0 = null;
      try {
        chartChangeEvent0 = new ChartChangeEvent((Object) null, jFreeChart0, chartChangeEventType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JFreeChart jFreeChart0 = mock(JFreeChart.class, new ViolatedAssumptionAnswer());
      ChartChangeEvent chartChangeEvent0 = null;
      try {
        chartChangeEvent0 = new ChartChangeEvent((Object) null, jFreeChart0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChartChangeEvent chartChangeEvent0 = null;
      try {
        chartChangeEvent0 = new ChartChangeEvent((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.NEW_DATASET;
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent("org.jfree.chart.event.ChartChangeEvent", (JFreeChart) null, chartChangeEventType0);
      assertEquals(ChartChangeEventType.NEW_DATASET, chartChangeEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent("org.jfree.chart.event.ChartChangeEvent", (JFreeChart) null);
      JFreeChart jFreeChart0 = chartChangeEvent0.getChart();
      assertNull(jFreeChart0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent("org.jfree.chart.event.ChartChangeEvent", (JFreeChart) null);
      ChartChangeEventType chartChangeEventType0 = chartChangeEvent0.getType();
      assertEquals(ChartChangeEventType.GENERAL, chartChangeEventType0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent("org.jfree.chart.event.ChartChangeEvent", (JFreeChart) null);
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.GENERAL;
      chartChangeEvent0.setType(chartChangeEventType0);
      assertEquals(ChartChangeEventType.GENERAL, chartChangeEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChartChangeEvent chartChangeEvent0 = new ChartChangeEvent("i3[PhZ@U:$$H`F=.?");
      chartChangeEvent0.setChart((JFreeChart) null);
      assertEquals(ChartChangeEventType.GENERAL, chartChangeEvent0.getType());
  }
}