/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:27:40 GMT 2019
 */

package org.jfree.data.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.function.PowerFunction2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PowerFunction2D_ESTest extends PowerFunction2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      PowerFunction2D powerFunction2D1 = new PowerFunction2D(0.0, 1.0);
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertFalse(powerFunction2D1.equals((Object)powerFunction2D0));
      assertEquals(0.0, powerFunction2D1.getA(), 0.01);
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(3765.7828090463922, (-678.99392494118));
      PowerFunction2D powerFunction2D1 = new PowerFunction2D((-1443.927838), (-678.99392494118));
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertEquals((-1443.927838), powerFunction2D1.getA(), 0.01);
      assertEquals((-678.99392494118), powerFunction2D1.getB(), 0.01);
      assertFalse(boolean0);
      assertFalse(powerFunction2D1.equals((Object)powerFunction2D0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(1463.057322, 1463.057322);
      double double0 = powerFunction2D0.getValue(2994.0357138);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-1.0), 0.0);
      double double0 = powerFunction2D0.getValue((-3033.355));
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(1463.057322, 1463.057322);
      double double0 = powerFunction2D0.getB();
      assertEquals(1463.057322, double0, 0.01);
      assertEquals(1463.057322, powerFunction2D0.getA(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(3765.7828090463922, (-678.99392494118));
      double double0 = powerFunction2D0.getB();
      assertEquals(3765.7828090463922, powerFunction2D0.getA(), 0.01);
      assertEquals((-678.99392494118), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      double double0 = powerFunction2D0.getA();
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(2393.6360939, 2729.7905698959585);
      double double0 = powerFunction2D0.getA();
      assertEquals(2393.6360939, double0, 0.01);
      assertEquals(2729.7905698959585, powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      PowerFunction2D powerFunction2D1 = new PowerFunction2D(0.0, (-690.5853));
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertFalse(powerFunction2D1.equals((Object)powerFunction2D0));
      assertFalse(boolean0);
      assertEquals(0.0, powerFunction2D1.getA(), 0.01);
      assertEquals((-690.5853), powerFunction2D1.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      PowerFunction2D powerFunction2D1 = new PowerFunction2D(2393.6360939, 2729.7905698959585);
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertEquals(2393.6360939, powerFunction2D1.getA(), 0.01);
      assertFalse(boolean0);
      assertEquals(2729.7905698959585, powerFunction2D1.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      boolean boolean0 = powerFunction2D0.equals("");
      assertFalse(boolean0);
      assertEquals(0.0, powerFunction2D0.getA(), 0.01);
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D0);
      assertEquals(0.0, powerFunction2D0.getA(), 0.01);
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      double double0 = powerFunction2D0.getB();
      assertEquals(0.0, powerFunction2D0.getA(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      double double0 = powerFunction2D0.getValue(0.0);
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-2181.7096), 0.0);
      powerFunction2D0.hashCode();
      assertEquals((-2181.7096), powerFunction2D0.getA(), 0.01);
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-2181.7096), 0.0);
      double double0 = powerFunction2D0.getA();
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
      assertEquals((-2181.7096), double0, 0.01);
  }
}
