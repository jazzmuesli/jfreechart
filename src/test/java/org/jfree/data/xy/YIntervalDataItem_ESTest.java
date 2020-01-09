/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:27:25 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.YIntervalDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YIntervalDataItem_ESTest extends YIntervalDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-1.0), 0.0, 1525.799173469924, 1525.799173469924);
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-1.0), (-1.0), (-1.0), 2236.8769805166);
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 0.0, 0.0, 0.0);
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-0.4237890580885522), (-0.4237890580885522), (-0.4237890580885522), (-0.4237890580885522));
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals((-0.4237890580885522), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 0.0, 0.0, 0.0);
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-0.4237890580885522), (-0.4237890580885522), (-0.4237890580885522), (-0.4237890580885522));
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals((-0.4237890580885522), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(Double.NaN, Double.NaN, 0.0, Double.NaN);
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 0.0, 0.0, 0.0);
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(191.2615376, 191.2615376, 3501.8358798407876, (-1257.0));
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(191.2615376, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-2264.252657682947), 421.63636745, (-2264.252657682947), 795.5493778590694);
      Double double0 = yIntervalDataItem0.getX();
      assertEquals((-2264.252657682947), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(1.908, 1.908, 1.908, 1.908);
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals(1.908, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(1.908, 1.908, 1.908, 1.908);
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals(1.908, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(1.908, 1.908, 1.908, 1.908);
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals(1.908, double0, 0.01);
  }
}
