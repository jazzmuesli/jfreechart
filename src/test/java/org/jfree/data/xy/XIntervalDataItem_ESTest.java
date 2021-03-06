/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:28:58 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.XIntervalDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XIntervalDataItem_ESTest extends XIntervalDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(1.0, 0.0, 1.0, 0.0);
      double double0 = xIntervalDataItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem((-143.48135775554), 1.0, 0.0, 762.1202499);
      double double0 = xIntervalDataItem0.getYValue();
      assertEquals(762.1202499, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem((-191.7531209), (-191.7531209), 0.0, (-191.7531209));
      double double0 = xIntervalDataItem0.getYValue();
      assertEquals((-191.7531209), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(0.0, 0.0, 0.0, 1.0);
      double double0 = xIntervalDataItem0.getXLowValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(Double.NaN, 562.7635714269487, 562.7635714269487, 0.0);
      double double0 = xIntervalDataItem0.getXLowValue();
      assertEquals(562.7635714269487, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(0.0, (-3232.719195730662), (-3232.719195730662), 0.0);
      double double0 = xIntervalDataItem0.getXLowValue();
      assertEquals((-3232.719195730662), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(0.0, 0.0, 0.0, 0.0);
      double double0 = xIntervalDataItem0.getXHighValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(1.0, 1.0, 1.0, 0.0);
      double double0 = xIntervalDataItem0.getXHighValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem((-2264.0965), (-2264.0965), (-2264.0965), (-2264.0965));
      double double0 = xIntervalDataItem0.getXHighValue();
      assertEquals((-2264.0965), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(0.0, 0.0, 0.0, 0.0);
      Number number0 = xIntervalDataItem0.getX();
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem(307.771916267494, 307.771916267494, 307.771916267494, 0.0);
      Number number0 = xIntervalDataItem0.getX();
      assertEquals(307.771916267494, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XIntervalDataItem xIntervalDataItem0 = new XIntervalDataItem((-1.0), (-1.0), (-2106.487663629), (-1.0));
      Number number0 = xIntervalDataItem0.getX();
      assertEquals((-1.0), number0);
  }
}
