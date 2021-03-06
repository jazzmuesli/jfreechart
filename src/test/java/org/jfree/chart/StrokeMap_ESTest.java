/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:11:16 GMT 2019
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.StrokeMap;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrokeMap_ESTest extends StrokeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      StrokeMap strokeMap1 = (StrokeMap)strokeMap0.clone();
      assertTrue(strokeMap1.equals((Object)strokeMap0));
      
      strokeMap1.put("", (Stroke) null);
      boolean boolean0 = strokeMap0.equals(strokeMap1);
      assertFalse(strokeMap1.equals((Object)strokeMap0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      BasicStroke basicStroke0 = new BasicStroke();
      strokeMap0.put((-2393.0263009), basicStroke0);
      BasicStroke basicStroke1 = (BasicStroke)strokeMap0.getStroke((-2393.0263009));
      assertEquals(0.0F, basicStroke1.getDashPhase(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      // Undeclared exception!
      try { 
        strokeMap0.put((Comparable) null, (Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      strokeMap0.put(comparable0, (Stroke) null);
      Integer integer0 = Integer.valueOf(0);
      // Undeclared exception!
      try { 
        strokeMap0.put(integer0, (Stroke) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.lang.Comparable$MockitoMock$833475168 cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      // Undeclared exception!
      try { 
        strokeMap0.getStroke((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      strokeMap0.put(comparable0, (Stroke) null);
      // Undeclared exception!
      try { 
        strokeMap0.getStroke("9!gI2");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparable0).compareTo(any());
      strokeMap0.put(comparable0, (Stroke) null);
      Object object0 = strokeMap0.clone();
      boolean boolean0 = strokeMap0.equals(object0);
      assertNotSame(object0, strokeMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      boolean boolean0 = strokeMap0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      boolean boolean0 = strokeMap0.equals(strokeMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      strokeMap0.put("", (Stroke) null);
      boolean boolean0 = strokeMap0.containsKey("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = strokeMap0.containsKey(comparable0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = strokeMap0.getStroke(comparable0);
      assertNull(stroke0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Object object0 = strokeMap0.clone();
      assertTrue(object0.equals((Object)strokeMap0));
      
      strokeMap0.put("", (Stroke) null);
      boolean boolean0 = strokeMap0.equals(object0);
      assertFalse(object0.equals((Object)strokeMap0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      strokeMap0.clear();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      BasicStroke basicStroke0 = new BasicStroke();
      strokeMap0.put((-2393.0263009), basicStroke0);
      StrokeMap strokeMap1 = (StrokeMap)strokeMap0.clone();
      assertTrue(strokeMap1.equals((Object)strokeMap0));
      
      strokeMap1.put((-2393.0263009), (Stroke) null);
      boolean boolean0 = strokeMap0.equals(strokeMap1);
      assertFalse(strokeMap1.equals((Object)strokeMap0));
      assertFalse(boolean0);
  }
}
