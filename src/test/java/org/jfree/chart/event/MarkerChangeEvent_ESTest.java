/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:39:06 GMT 2019
 */

package org.jfree.chart.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.plot.Marker;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MarkerChangeEvent_ESTest extends MarkerChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MarkerChangeEvent markerChangeEvent0 = null;
      try {
        markerChangeEvent0 = new MarkerChangeEvent((Marker) null);
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
      Marker marker0 = mock(Marker.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(marker0).toString();
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(marker0);
      Marker marker1 = markerChangeEvent0.getMarker();
      assertNull(marker1.getLabelOffsetType());
  }
}
