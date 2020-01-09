/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:25:32 GMT 2019
 */

package org.jfree.data.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.function.NormalDistributionFunction2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NormalDistributionFunction2D_ESTest extends NormalDistributionFunction2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(274.35864717489784, 258.3);
      NormalDistributionFunction2D normalDistributionFunction2D1 = new NormalDistributionFunction2D(274.35864717489784, 274.35864717489784);
      boolean boolean0 = normalDistributionFunction2D1.equals(normalDistributionFunction2D0);
      assertFalse(normalDistributionFunction2D0.equals((Object)normalDistributionFunction2D1));
      assertEquals(274.35864717489784, normalDistributionFunction2D0.getMean(), 0.01);
      assertFalse(boolean0);
      assertEquals(274.35864717489784, normalDistributionFunction2D1.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(0.0, 6.283185307179586);
      NormalDistributionFunction2D normalDistributionFunction2D1 = new NormalDistributionFunction2D((-3508.0), 6.283185307179586);
      boolean boolean0 = normalDistributionFunction2D0.equals(normalDistributionFunction2D1);
      assertFalse(normalDistributionFunction2D1.equals((Object)normalDistributionFunction2D0));
      assertEquals(6.283185307179586, normalDistributionFunction2D1.getStandardDeviation(), 0.01);
      assertFalse(boolean0);
      assertEquals((-3508.0), normalDistributionFunction2D1.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D((-439.5), 2.0);
      double double0 = normalDistributionFunction2D0.getValue((-1927.8));
      assertEquals(2.0, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-439.5), normalDistributionFunction2D0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(0.0, 1.0);
      double double0 = normalDistributionFunction2D0.getMean();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D((-636.63504403129), 1811.18798144);
      double double0 = normalDistributionFunction2D0.getMean();
      assertEquals((-636.63504403129), double0, 0.01);
      assertEquals(1811.18798144, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(2487.7074, 258.3562249365487);
      NormalDistributionFunction2D normalDistributionFunction2D1 = new NormalDistributionFunction2D(2487.7074, 2487.7074);
      boolean boolean0 = normalDistributionFunction2D0.equals(normalDistributionFunction2D1);
      assertEquals(2487.7074, normalDistributionFunction2D0.getMean(), 0.01);
      assertFalse(normalDistributionFunction2D1.equals((Object)normalDistributionFunction2D0));
      assertFalse(boolean0);
      assertEquals(2487.7074, normalDistributionFunction2D1.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(0.3674056746793477, 4.6905415220803);
      NormalDistributionFunction2D normalDistributionFunction2D1 = new NormalDistributionFunction2D(4.6905415220803, 4.6905415220803);
      boolean boolean0 = normalDistributionFunction2D0.equals(normalDistributionFunction2D1);
      assertEquals(4.6905415220803, normalDistributionFunction2D1.getMean(), 0.01);
      assertEquals(4.6905415220803, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
      assertFalse(normalDistributionFunction2D1.equals((Object)normalDistributionFunction2D0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(0.3674056746793477, 4.6905415220803);
      boolean boolean0 = normalDistributionFunction2D0.equals("1M#?.d:>;o(-");
      assertEquals(0.3674056746793477, normalDistributionFunction2D0.getMean(), 0.01);
      assertFalse(boolean0);
      assertEquals(4.6905415220803, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(2487.7074, 258.3562249365487);
      boolean boolean0 = normalDistributionFunction2D0.equals(normalDistributionFunction2D0);
      assertEquals(2487.7074, normalDistributionFunction2D0.getMean(), 0.01);
      assertTrue(boolean0);
      assertEquals(258.3562249365487, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = null;
      try {
        normalDistributionFunction2D0 = new NormalDistributionFunction2D((-2895.704360061798), (-2895.704360061798));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires 'std' > 0.
         //
         verifyException("org.jfree.data.function.NormalDistributionFunction2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(2487.7074, 258.3562249365487);
      double double0 = normalDistributionFunction2D0.getValue(2487.7074);
      assertEquals(258.3562249365487, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
      assertEquals(0.0015441558665730288, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(2487.7074, 258.3562249365487);
      double double0 = normalDistributionFunction2D0.getMean();
      assertEquals(258.3562249365487, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
      assertEquals(2487.7074, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(2487.7074, 258.3562249365487);
      normalDistributionFunction2D0.hashCode();
      assertEquals(258.3562249365487, normalDistributionFunction2D0.getStandardDeviation(), 0.01);
      assertEquals(2487.7074, normalDistributionFunction2D0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NormalDistributionFunction2D normalDistributionFunction2D0 = new NormalDistributionFunction2D(0.3674056746793477, 4.6905415220803);
      double double0 = normalDistributionFunction2D0.getStandardDeviation();
      assertEquals(4.6905415220803, double0, 0.01);
      assertEquals(0.3674056746793477, normalDistributionFunction2D0.getMean(), 0.01);
  }
}
