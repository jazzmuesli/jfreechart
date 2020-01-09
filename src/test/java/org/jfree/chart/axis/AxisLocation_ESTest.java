/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:26:10 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.AxisLocation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AxisLocation_ESTest extends AxisLocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AxisLocation[] axisLocationArray0 = AxisLocation.values();
      assertEquals(4, axisLocationArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AxisLocation axisLocation0 = AxisLocation.valueOf("TOP_OR_LEFT");
      assertEquals(AxisLocation.TOP_OR_LEFT, axisLocation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        AxisLocation.getOpposite((AxisLocation) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'location' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_RIGHT;
      AxisLocation axisLocation1 = AxisLocation.getOpposite(axisLocation0);
      assertEquals(AxisLocation.TOP_OR_LEFT, axisLocation1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_RIGHT;
      AxisLocation axisLocation1 = AxisLocation.getOpposite(axisLocation0);
      assertEquals(AxisLocation.BOTTOM_OR_LEFT, axisLocation1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_LEFT;
      AxisLocation axisLocation1 = AxisLocation.getOpposite(axisLocation0);
      assertEquals(AxisLocation.BOTTOM_OR_RIGHT, axisLocation1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_RIGHT;
      AxisLocation axisLocation1 = axisLocation0.getOpposite();
      assertEquals(AxisLocation.TOP_OR_LEFT, axisLocation1);
      
      AxisLocation axisLocation2 = axisLocation1.getOpposite();
      assertEquals(AxisLocation.BOTTOM_OR_RIGHT, axisLocation2);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_LEFT;
      AxisLocation axisLocation1 = AxisLocation.getOpposite(axisLocation0);
      assertEquals(AxisLocation.TOP_OR_RIGHT, axisLocation1);
      
      AxisLocation axisLocation2 = axisLocation1.getOpposite();
      assertEquals(AxisLocation.BOTTOM_OR_LEFT, axisLocation2);
  }
}