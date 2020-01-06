/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:20:57 GMT 2019
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.Outlier;
import org.jfree.chart.renderer.OutlierListCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutlierListCollection_ESTest extends OutlierListCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      assertFalse(outlierListCollection0.isLowFarOut());
      
      outlierListCollection0.setLowFarOut(true);
      boolean boolean0 = outlierListCollection0.isLowFarOut();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      Outlier outlier0 = new Outlier((-253.72894), 1933.8, (-253.72894));
      outlierListCollection0.add(outlier0);
      outlier0.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlierListCollection0.add(outlier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.4922987859035939);
      outlierListCollection0.add(outlier0);
      Outlier outlier1 = new Outlier(0.0, 0.4922987859035939, 0.0);
      boolean boolean0 = outlierListCollection0.add(outlier1);
      assertFalse(outlierListCollection0.isLowFarOut());
      assertTrue(boolean0);
      assertFalse(outlierListCollection0.isHighFarOut());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      boolean boolean0 = outlierListCollection0.isHighFarOut();
      assertFalse(boolean0);
      assertFalse(outlierListCollection0.isLowFarOut());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.4922987859035939);
      outlierListCollection0.add(outlier0);
      boolean boolean0 = outlierListCollection0.add(outlier0);
      assertFalse(outlierListCollection0.isLowFarOut());
      assertTrue(boolean0);
      assertFalse(outlierListCollection0.isHighFarOut());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      boolean boolean0 = outlierListCollection0.isLowFarOut();
      assertFalse(boolean0);
      assertFalse(outlierListCollection0.isHighFarOut());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      outlierListCollection0.iterator();
      assertFalse(outlierListCollection0.isLowFarOut());
      assertFalse(outlierListCollection0.isHighFarOut());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OutlierListCollection outlierListCollection0 = new OutlierListCollection();
      assertFalse(outlierListCollection0.isHighFarOut());
      
      outlierListCollection0.setHighFarOut(true);
      boolean boolean0 = outlierListCollection0.isHighFarOut();
      assertTrue(boolean0);
  }
}
