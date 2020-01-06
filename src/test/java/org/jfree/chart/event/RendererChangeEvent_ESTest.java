/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:37:38 GMT 2019
 */

package org.jfree.chart.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.event.RendererChangeEvent;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RendererChangeEvent_ESTest extends RendererChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RendererChangeEvent rendererChangeEvent0 = null;
      try {
        rendererChangeEvent0 = new RendererChangeEvent((Object) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RendererChangeEvent rendererChangeEvent0 = null;
      try {
        rendererChangeEvent0 = new RendererChangeEvent((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(object0, true);
      boolean boolean0 = rendererChangeEvent0.getSeriesVisibilityChanged();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(object0);
      boolean boolean0 = rendererChangeEvent0.getSeriesVisibilityChanged();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(object0);
      rendererChangeEvent0.getRenderer();
      assertFalse(rendererChangeEvent0.getSeriesVisibilityChanged());
  }
}
