/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:39:51 GMT 2019
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
import org.jfree.chart.event.ChartProgressEvent;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ChartProgressEvent_ESTest extends ChartProgressEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent("", (JFreeChart) null, 0, 0);
      int int0 = chartProgressEvent0.getType();
      assertEquals(0, int0);
      assertEquals(0, chartProgressEvent0.getPercent());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent("f^t2iAGc-)", (JFreeChart) null, 0, 0);
      int int0 = chartProgressEvent0.getPercent();
      assertEquals(0, int0);
      assertEquals(0, chartProgressEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JFreeChart jFreeChart0 = mock(JFreeChart.class, new ViolatedAssumptionAnswer());
      ChartProgressEvent chartProgressEvent0 = null;
      try {
        chartProgressEvent0 = new ChartProgressEvent((Object) null, jFreeChart0, 3248, 785);
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
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent(" E|x%^X+ oc*~{", (JFreeChart) null, 1, 1);
      int int0 = chartProgressEvent0.getType();
      assertEquals(1, int0);
      assertEquals(1, chartProgressEvent0.getPercent());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent(" E|x%^X+ oc*~{", (JFreeChart) null, 1, 1);
      chartProgressEvent0.setChart((JFreeChart) null);
      assertEquals(1, chartProgressEvent0.getType());
      assertEquals(1, chartProgressEvent0.getPercent());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent(" E|x%^X+ oc*~{", (JFreeChart) null, 1, 1);
      chartProgressEvent0.setPercent((-963));
      int int0 = chartProgressEvent0.getPercent();
      assertEquals((-963), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent(" E|x%^X+ oc*~{", (JFreeChart) null, 1, 1);
      int int0 = chartProgressEvent0.getPercent();
      assertEquals(1, int0);
      assertEquals(1, chartProgressEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent(" E|x%^X+ oc*~{", (JFreeChart) null, 1, 1);
      chartProgressEvent0.setType((-963));
      int int0 = chartProgressEvent0.getType();
      assertEquals((-963), int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ChartProgressEvent chartProgressEvent0 = new ChartProgressEvent(" E|x%^X+ oc*~{", (JFreeChart) null, 1, 1);
      chartProgressEvent0.getChart();
      assertEquals(1, chartProgressEvent0.getType());
      assertEquals(1, chartProgressEvent0.getPercent());
  }
}
