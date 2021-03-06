/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:29:49 GMT 2019
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleHistogramBin_ESTest extends SimpleHistogramBin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2432.2609839424), 458.70993064587);
      Object object0 = simpleHistogramBin0.clone();
      simpleHistogramBin0.setItemCount(1);
      boolean boolean0 = simpleHistogramBin0.equals(object0);
      assertEquals(1, simpleHistogramBin0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 307.794491527887, true, false);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin(0.0, 1.0, false, true);
      boolean boolean0 = simpleHistogramBin1.equals(simpleHistogramBin0);
      assertFalse(boolean0);
      assertEquals(1.0, simpleHistogramBin1.getUpperBound(), 0.01);
      assertEquals(0.0, simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-453.9378), 0, true, true);
      boolean boolean0 = simpleHistogramBin0.equals(simpleHistogramBin1);
      assertFalse(boolean0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals((-453.9378), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-309.127), 0.0, true, true);
      double double0 = simpleHistogramBin0.getUpperBound();
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-309.127), simpleHistogramBin0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2432.2609839424), 458.70993064587);
      double double0 = simpleHistogramBin0.getUpperBound();
      assertEquals((-2432.2609839424), simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(458.70993064587, double0, 0.01);
      assertEquals(0, simpleHistogramBin0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      double double0 = simpleHistogramBin0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals(2580.536660767122, simpleHistogramBin0.getUpperBound(), 0.01);
      assertEquals(0, simpleHistogramBin0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(1.0, 2425.8);
      double double0 = simpleHistogramBin0.getLowerBound();
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals(1.0, double0, 0.01);
      assertEquals(2425.8, simpleHistogramBin0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2432.2609839424), 458.70993064587);
      assertEquals(0, simpleHistogramBin0.getItemCount());
      
      simpleHistogramBin0.setItemCount(1);
      int int0 = simpleHistogramBin0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-883.19), (-1.0));
      simpleHistogramBin0.setItemCount((-1));
      int int0 = simpleHistogramBin0.getItemCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = null;
      try {
        simpleHistogramBin0 = new SimpleHistogramBin(1185.2464, 557.828, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid bounds
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramBin", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2851.0), 10.618662061745184);
      Object object0 = simpleHistogramBin0.clone();
      simpleHistogramBin0.setItemCount((-540));
      boolean boolean0 = simpleHistogramBin0.equals(object0);
      assertEquals((-540), simpleHistogramBin0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-928.75226746), 224.1, true, false);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-928.75226746), 224.1);
      boolean boolean0 = simpleHistogramBin0.equals(simpleHistogramBin1);
      assertEquals((-928.75226746), simpleHistogramBin1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(224.1, simpleHistogramBin1.getUpperBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2851.0), 10.618662061745184);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-2851.0), 10.618662061745184, false, true);
      boolean boolean0 = simpleHistogramBin0.equals(simpleHistogramBin1);
      assertFalse(boolean0);
      assertEquals(10.618662061745184, simpleHistogramBin1.getUpperBound(), 0.01);
      assertEquals((-2851.0), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 307.794491527887, true, true);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin(0.0, 1.0, true, true);
      boolean boolean0 = simpleHistogramBin0.equals(simpleHistogramBin1);
      assertFalse(boolean0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertFalse(simpleHistogramBin1.equals((Object)simpleHistogramBin0));
      assertEquals(0.0, simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(1.0, simpleHistogramBin1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-453.9378), 0, true, true);
      boolean boolean0 = simpleHistogramBin1.equals(simpleHistogramBin0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals((-453.9378), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2851.0), 10.618662061745184);
      Object object0 = new Object();
      boolean boolean0 = simpleHistogramBin0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals((-2851.0), simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(10.618662061745184, simpleHistogramBin0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      boolean boolean0 = simpleHistogramBin0.equals(simpleHistogramBin0);
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals((-453.9378), simpleHistogramBin0.getUpperBound(), 0.01);
      assertTrue(boolean0);
      assertEquals((-576.6), simpleHistogramBin0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1602.93267), 1573.15207794127);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-1602.93267), (-897.5221));
      int int0 = simpleHistogramBin0.compareTo(simpleHistogramBin1);
      assertEquals(1, int0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals((-1602.93267), simpleHistogramBin1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-3984.4569), (-1.0));
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-3984.4569), (-581.8), true, false);
      int int0 = simpleHistogramBin1.compareTo(simpleHistogramBin0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals((-3984.4569), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-453.9378), 0, true, true);
      int int0 = simpleHistogramBin1.compareTo(simpleHistogramBin0);
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
      assertEquals(1, int0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals((-453.9378), simpleHistogramBin1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-4374.67595311), 0.0, false, false);
      int int0 = simpleHistogramBin1.compareTo(simpleHistogramBin0);
      assertEquals((-1), int0);
      assertEquals((-4374.67595311), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      Object object0 = new Object();
      int int0 = simpleHistogramBin0.compareTo(object0);
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals(0.0, simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(2580.536660767122, simpleHistogramBin0.getUpperBound(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      int int0 = simpleHistogramBin0.compareTo(simpleHistogramBin0);
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals((-576.6), simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(0, int0);
      assertEquals((-453.9378), simpleHistogramBin0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-4374.67595311), 0.0, false, false);
      boolean boolean0 = simpleHistogramBin0.overlapsWith(simpleHistogramBin1);
      assertFalse(boolean0);
      assertEquals((-4374.67595311), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 1458.77303, false, false);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-5174), 0, false, true);
      boolean boolean0 = simpleHistogramBin0.overlapsWith(simpleHistogramBin1);
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
      assertEquals((-5174.0), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-453.9378), 0, true, true);
      boolean boolean0 = simpleHistogramBin1.overlapsWith(simpleHistogramBin0);
      assertTrue(boolean0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 1458.77303, false, false);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-5174), 0, false, true);
      boolean boolean0 = simpleHistogramBin1.overlapsWith(simpleHistogramBin0);
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
      assertEquals((-5174.0), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-453.9378), 0, true, true);
      boolean boolean0 = simpleHistogramBin0.overlapsWith(simpleHistogramBin1);
      assertTrue(boolean0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-4374.67595311), 0.0, false, false);
      boolean boolean0 = simpleHistogramBin1.overlapsWith(simpleHistogramBin0);
      assertEquals(0.0, simpleHistogramBin1.getUpperBound(), 0.01);
      assertFalse(boolean0);
      assertEquals((-4374.67595311), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-4374.67595311), (-450.13441017898), false, false);
      boolean boolean0 = simpleHistogramBin0.overlapsWith(simpleHistogramBin1);
      assertFalse(boolean0);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals((-450.13441017898), simpleHistogramBin1.getUpperBound(), 0.01);
      assertEquals((-4374.67595311), simpleHistogramBin1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      SimpleHistogramBin simpleHistogramBin1 = new SimpleHistogramBin((-4374.67595311), (-450.13441017898), false, false);
      boolean boolean0 = simpleHistogramBin1.overlapsWith(simpleHistogramBin0);
      assertEquals((-4374.67595311), simpleHistogramBin1.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin1.getItemCount());
      assertEquals((-450.13441017898), simpleHistogramBin1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      boolean boolean0 = simpleHistogramBin0.overlapsWith(simpleHistogramBin0);
      assertTrue(boolean0);
      assertEquals(2580.536660767122, simpleHistogramBin0.getUpperBound(), 0.01);
      assertEquals(0.0, simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1602.93267), 1573.15207794127);
      boolean boolean0 = simpleHistogramBin0.accepts(0.0);
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2851.0), 10.618662061745184);
      boolean boolean0 = simpleHistogramBin0.accepts((-2851.0));
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertTrue(boolean0);
      assertEquals(10.618662061745184, simpleHistogramBin0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-4374.67595311), 0.0, false, false);
      boolean boolean0 = simpleHistogramBin0.accepts(1948.0);
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertFalse(boolean0);
      assertEquals((-4374.67595311), simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(0.0, simpleHistogramBin0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2580.536660767122);
      boolean boolean0 = simpleHistogramBin0.accepts((-210.21));
      assertEquals(2580.536660767122, simpleHistogramBin0.getUpperBound(), 0.01);
      assertEquals(0.0, simpleHistogramBin0.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(0, simpleHistogramBin0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      boolean boolean0 = simpleHistogramBin0.accepts((-453.9378));
      assertEquals((-453.9378), simpleHistogramBin0.getUpperBound(), 0.01);
      assertTrue(boolean0);
      assertEquals((-576.6), simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(0, simpleHistogramBin0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = null;
      try {
        simpleHistogramBin0 = new SimpleHistogramBin((-591.3), (-1305.1746662));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid bounds
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramBin", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      double double0 = simpleHistogramBin0.getLowerBound();
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals((-453.9378), simpleHistogramBin0.getUpperBound(), 0.01);
      assertEquals((-576.6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-576.6), (-453.9378));
      double double0 = simpleHistogramBin0.getUpperBound();
      assertEquals(0, simpleHistogramBin0.getItemCount());
      assertEquals((-453.9378), double0, 0.01);
      assertEquals((-576.6), simpleHistogramBin0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1.0), 0.0);
      // Undeclared exception!
      try { 
        simpleHistogramBin0.overlapsWith((SimpleHistogramBin) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.SimpleHistogramBin", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 1458.77303, false, false);
      int int0 = simpleHistogramBin0.getItemCount();
      assertEquals(0.0, simpleHistogramBin0.getLowerBound(), 0.01);
      assertEquals(1458.77303, simpleHistogramBin0.getUpperBound(), 0.01);
      assertEquals(0, int0);
  }
}
