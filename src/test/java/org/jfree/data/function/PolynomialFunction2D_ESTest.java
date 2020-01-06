/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:31:01 GMT 2019
 */

package org.jfree.data.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.function.PolynomialFunction2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolynomialFunction2D_ESTest extends PolynomialFunction2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0;
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double double0 = polynomialFunction2D0.getValue(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1.0);
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double double0 = polynomialFunction2D0.getValue(2389.99294);
      assertEquals((-2389.99294), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      int int0 = polynomialFunction2D0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      int int0 = polynomialFunction2D0.getOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double[] doubleArray1 = polynomialFunction2D0.getCoefficients();
      PolynomialFunction2D polynomialFunction2D1 = new PolynomialFunction2D(doubleArray1);
      boolean boolean0 = polynomialFunction2D0.equals(polynomialFunction2D1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolynomialFunction2D polynomialFunction2D0 = null;
      try {
        polynomialFunction2D0 = new PolynomialFunction2D((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'coefficients' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[38];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      boolean boolean0 = polynomialFunction2D0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[38];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double double0 = polynomialFunction2D0.getValue(37);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[38];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      int int0 = polynomialFunction2D0.getOrder();
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[38];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      double[] doubleArray1 = polynomialFunction2D0.getCoefficients();
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[38];
      PolynomialFunction2D polynomialFunction2D0 = new PolynomialFunction2D(doubleArray0);
      polynomialFunction2D0.hashCode();
  }
}
