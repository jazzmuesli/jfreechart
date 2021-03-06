/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:12:59 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.XYInterval;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XYInterval_ESTest extends XYInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 143.9);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = xYInterval1.equals(xYInterval0);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertFalse(boolean0);
      assertFalse(xYInterval0.equals((Object)xYInterval1));
      assertEquals(0.0, xYInterval1.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, (-2594.195), 0.0);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval1.getY(), 0.01);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
      assertFalse(xYInterval1.equals((Object)xYInterval0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(2906.62916192388, 2906.62916192388, 2906.62916192388, (-2649.0), 2906.62916192388);
      XYInterval xYInterval1 = new XYInterval(2906.62916192388, 2906.62916192388, 1.0, 1.0, (-1.0));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(2906.62916192388, xYInterval0.getY(), 0.01);
      assertEquals((-1.0), xYInterval1.getYHigh(), 0.01);
      assertEquals(2906.62916192388, xYInterval1.getXHigh(), 0.01);
      assertEquals(1.0, xYInterval1.getY(), 0.01);
      assertEquals(2906.62916192388, xYInterval1.getXLow(), 0.01);
      assertFalse(boolean0);
      assertEquals((-2649.0), xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, (-1140.894221));
      XYInterval xYInterval1 = new XYInterval(0.0, (-1140.894221), 0.0, (-1140.894221), 2168.1631888344396);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(2168.1631888344396, xYInterval1.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
      assertEquals((-1140.894221), xYInterval1.getYLow(), 0.01);
      assertEquals(0.0, xYInterval1.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals((-1140.894221), xYInterval1.getXHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 2085.9387261, 1123.7013531865314, 1123.7013531865314, 2085.9387261);
      XYInterval xYInterval1 = new XYInterval(1489.0, 2085.9387261, 1123.7013531865314, 1123.7013531865314, 2085.9387261);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertFalse(boolean0);
      assertEquals(2085.9387261, xYInterval1.getYHigh(), 0.01);
      assertFalse(xYInterval1.equals((Object)xYInterval0));
      assertEquals(1123.7013531865314, xYInterval1.getY(), 0.01);
      assertEquals(2085.9387261, xYInterval1.getXHigh(), 0.01);
      assertEquals(1489.0, xYInterval1.getXLow(), 0.01);
      assertEquals(1123.7013531865314, xYInterval1.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 2907.104753153684, 2907.104753153684);
      double double0 = xYInterval0.getYLow();
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(2907.104753153684, double0, 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(2907.104753153684, xYInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(2906.62916192388, 2906.62916192388, 2906.62916192388, (-2649.0), 2906.62916192388);
      double double0 = xYInterval0.getYLow();
      assertEquals(2906.62916192388, xYInterval0.getY(), 0.01);
      assertEquals(2906.62916192388, xYInterval0.getXLow(), 0.01);
      assertEquals(2906.62916192388, xYInterval0.getXHigh(), 0.01);
      assertEquals((-2649.0), double0, 0.01);
      assertEquals(2906.62916192388, xYInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 2907.104753153684, 2907.104753153684);
      double double0 = xYInterval0.getYHigh();
      assertEquals(2907.104753153684, double0, 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(2907.104753153684, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1.0), (-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = xYInterval0.getYHigh();
      assertEquals((-1.0), xYInterval0.getY(), 0.01);
      assertEquals((-1.0), xYInterval0.getXHigh(), 0.01);
      assertEquals((-1.0), xYInterval0.getYLow(), 0.01);
      assertEquals((-1.0), xYInterval0.getXLow(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 143.9, 0.0, 0.0);
      double double0 = xYInterval0.getY();
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(143.9, double0, 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(1.0, (-647.753565181), (-1122.45820841656), (-658.03382047), 0.0);
      double double0 = xYInterval0.getY();
      assertEquals((-647.753565181), xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals((-658.03382047), xYInterval0.getYLow(), 0.01);
      assertEquals(1.0, xYInterval0.getXLow(), 0.01);
      assertEquals((-1122.45820841656), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(1489.0, 2085.9387261, 1123.7013531865314, 1123.7013531865314, 2085.9387261);
      double double0 = xYInterval0.getXLow();
      assertEquals(1489.0, double0, 0.01);
      assertEquals(1123.7013531865314, xYInterval0.getYLow(), 0.01);
      assertEquals(1123.7013531865314, xYInterval0.getY(), 0.01);
      assertEquals(2085.9387261, xYInterval0.getYHigh(), 0.01);
      assertEquals(2085.9387261, xYInterval0.getXHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval((-1.0), (-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = xYInterval0.getXLow();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), xYInterval0.getXHigh(), 0.01);
      assertEquals((-1.0), xYInterval0.getY(), 0.01);
      assertEquals((-1.0), xYInterval0.getYLow(), 0.01);
      assertEquals((-1.0), xYInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 271.0, 271.0, 857.71395016, (-815.4316214584));
      double double0 = xYInterval0.getXHigh();
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(271.0, xYInterval0.getY(), 0.01);
      assertEquals(857.71395016, xYInterval0.getYLow(), 0.01);
      assertEquals(271.0, double0, 0.01);
      assertEquals((-815.4316214584), xYInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, (-1140.894221), 0.0, (-1140.894221), 2168.1631888344396);
      double double0 = xYInterval0.getXHigh();
      assertEquals((-1140.894221), double0, 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(2168.1631888344396, xYInterval0.getYHigh(), 0.01);
      assertEquals((-1140.894221), xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 143.9);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertFalse(xYInterval1.equals((Object)xYInterval0));
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval1.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, 2907.104753153684, 2907.104753153684);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval1.getY(), 0.01);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
      assertEquals(2907.104753153684, xYInterval1.getYLow(), 0.01);
      assertEquals(2907.104753153684, xYInterval1.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 143.9);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 143.9, 0.0, 0.0);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(143.9, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals(143.9, xYInterval1.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval1.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 271.0, 0.0, 857.71395016);
      XYInterval xYInterval1 = new XYInterval(0.0, 271.0, 271.0, 857.71395016, (-815.4316214584));
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(271.0, xYInterval1.getXHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(857.71395016, xYInterval1.getYLow(), 0.01);
      assertEquals((-815.4316214584), xYInterval1.getYHigh(), 0.01);
      assertEquals(271.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(2215.0, 2215.0, 2215.0, 538.5319063185331, 0.0);
      XYInterval xYInterval1 = new XYInterval(538.5319063185331, 1214.262, (-222.1), (-2316.096545), 1383.6126597583636);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(1383.6126597583636, xYInterval1.getYHigh(), 0.01);
      assertEquals(538.5319063185331, xYInterval1.getXLow(), 0.01);
      assertEquals(1214.262, xYInterval1.getXHigh(), 0.01);
      assertEquals((-2316.096545), xYInterval1.getYLow(), 0.01);
      assertFalse(boolean0);
      assertEquals((-222.1), xYInterval1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      XYInterval xYInterval1 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = xYInterval0.equals(xYInterval1);
      assertEquals(0.0, xYInterval1.getXLow(), 0.01);
      assertEquals(0.0, xYInterval1.getYLow(), 0.01);
      assertEquals(0.0, xYInterval1.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, xYInterval1.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval1.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = xYInterval0.equals(xYInterval0);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      Object object0 = new Object();
      boolean boolean0 = xYInterval0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getYHigh();
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getY();
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getXLow();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getXHigh();
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYInterval xYInterval0 = new XYInterval(0.0, 0.0, 0.0, 0.0, 0.0);
      double double0 = xYInterval0.getYLow();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, xYInterval0.getXLow(), 0.01);
      assertEquals(0.0, xYInterval0.getY(), 0.01);
      assertEquals(0.0, xYInterval0.getXHigh(), 0.01);
      assertEquals(0.0, xYInterval0.getYHigh(), 0.01);
  }
}
