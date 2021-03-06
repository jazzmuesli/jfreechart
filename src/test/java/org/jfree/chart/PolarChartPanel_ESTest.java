/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:56:32 GMT 2019
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.PolarChartPanel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PolarChartPanel_ESTest extends PolarChartPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolarChartPanel polarChartPanel0 = null;
      try {
        polarChartPanel0 = new PolarChartPanel((JFreeChart) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.PolarChartPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolarChartPanel polarChartPanel0 = null;
      try {
        polarChartPanel0 = new PolarChartPanel((JFreeChart) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.PolarChartPanel", e);
      }
  }
}
