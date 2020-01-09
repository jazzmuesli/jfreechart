/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:33:42 GMT 2019
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.MouseEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.ChartEntity;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ChartMouseEvent_ESTest extends ChartMouseEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JFreeChart jFreeChart0 = mock(JFreeChart.class, new ViolatedAssumptionAnswer());
      ChartEntity chartEntity0 = mock(ChartEntity.class, new ViolatedAssumptionAnswer());
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, (MouseEvent) null, chartEntity0);
      MouseEvent mouseEvent0 = chartMouseEvent0.getTrigger();
      assertNull(mouseEvent0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JFreeChart jFreeChart0 = mock(JFreeChart.class, new ViolatedAssumptionAnswer());
      MouseEvent mouseEvent0 = mock(MouseEvent.class, new ViolatedAssumptionAnswer());
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseEvent0, (ChartEntity) null);
      ChartEntity chartEntity0 = chartMouseEvent0.getEntity();
      assertNull(chartEntity0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MouseEvent mouseEvent0 = mock(MouseEvent.class, new ViolatedAssumptionAnswer());
      ChartEntity chartEntity0 = mock(ChartEntity.class, new ViolatedAssumptionAnswer());
      ChartMouseEvent chartMouseEvent0 = null;
      try {
        chartMouseEvent0 = new ChartMouseEvent((JFreeChart) null, mouseEvent0, chartEntity0);
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
      JFreeChart jFreeChart0 = mock(JFreeChart.class, new ViolatedAssumptionAnswer());
      MouseEvent mouseEvent0 = mock(MouseEvent.class, new ViolatedAssumptionAnswer());
      ChartEntity chartEntity0 = mock(ChartEntity.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(chartEntity0).toString();
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, mouseEvent0, chartEntity0);
      ChartEntity chartEntity1 = chartMouseEvent0.getEntity();
      assertSame(chartEntity1, chartEntity0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JFreeChart jFreeChart0 = mock(JFreeChart.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jFreeChart0).toString();
      ChartEntity chartEntity0 = mock(ChartEntity.class, new ViolatedAssumptionAnswer());
      ChartMouseEvent chartMouseEvent0 = new ChartMouseEvent(jFreeChart0, (MouseEvent) null, chartEntity0);
      JFreeChart jFreeChart1 = chartMouseEvent0.getChart();
      assertFalse(jFreeChart1.getElementHinting());
  }
}