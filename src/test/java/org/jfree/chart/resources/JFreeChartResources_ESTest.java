/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:38:37 GMT 2019
 */

package org.jfree.chart.resources;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.resources.JFreeChartResources;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JFreeChartResources_ESTest extends JFreeChartResources_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JFreeChartResources jFreeChartResources0 = new JFreeChartResources();
      Object[][] objectArray0 = jFreeChartResources0.getContents();
      assertEquals(4, objectArray0.length);
  }
}
