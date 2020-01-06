/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:01:00 GMT 2019
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.statistics.HistogramBin;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistogramBin_ESTest extends HistogramBin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-745.2), (-745.2));
      HistogramBin histogramBin1 = new HistogramBin(0.0, 0.0);
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-137.99992), 0.0);
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-137.99992), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      double double0 = histogramBin0.getEndBoundary();
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(541.54804276, 541.54804276);
      double double0 = histogramBin0.getEndBoundary();
      assertEquals(541.54804276, double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-1.0), (-1.0));
      histogramBin0.incrementCount();
      int int0 = histogramBin0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-781.280491733), 1.0);
      double double0 = histogramBin0.getBinWidth();
      assertEquals(782.280491733, double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      HistogramBin histogramBin1 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(0.0, histogramBin1.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      HistogramBin histogramBin1 = new HistogramBin(0.0, 510.7290497923);
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(0, histogramBin1.getCount());
      assertFalse(boolean0);
      assertEquals(510.7290497923, histogramBin1.getBinWidth(), 0.01);
      assertEquals(0.0, histogramBin1.getStartBoundary(), 0.01);
      assertFalse(histogramBin1.equals((Object)histogramBin0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(510.7290497923, 510.7290497923);
      HistogramBin histogramBin1 = new HistogramBin(0.0, 0.0);
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertFalse(boolean0);
      assertEquals(0, histogramBin1.getCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(18.378631024940663, 18.378631024940663);
      boolean boolean0 = histogramBin0.equals("");
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      HistogramBin histogramBin1 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      histogramBin0.incrementCount();
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(1, histogramBin0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      boolean boolean0 = histogramBin0.equals((Object) null);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      boolean boolean0 = histogramBin0.equals(histogramBin0);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HistogramBin histogramBin0 = null;
      try {
        histogramBin0 = new HistogramBin(1898.82598, 209.9889);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HistogramBin():  startBoundary > endBoundary.
         //
         verifyException("org.jfree.data.statistics.HistogramBin", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      HistogramBin histogramBin1 = (HistogramBin)histogramBin0.clone();
      histogramBin1.incrementCount();
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(1, histogramBin1.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-30.02741992898978), (-30.02741992898978));
      double double0 = histogramBin0.getEndBoundary();
      assertEquals((-30.02741992898978), double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-30.02741992898978), histogramBin0.getStartBoundary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(510.7290497923, 510.7290497923);
      double double0 = histogramBin0.getBinWidth();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(510.7290497923, 510.7290497923);
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(510.7290497923, double0, 0.01);
      assertEquals(510.7290497923, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(510.7290497923, 510.7290497923);
      int int0 = histogramBin0.getCount();
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, int0);
  }
}
