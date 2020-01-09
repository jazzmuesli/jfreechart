/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:32:24 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.BooleanList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BooleanList_ESTest extends BooleanList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      // Undeclared exception!
      try { 
        booleanList0.setBoolean((-3053), (Boolean) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      booleanList0.set(0, booleanList0);
      // Undeclared exception!
      try { 
        booleanList0.getBoolean(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.util.BooleanList cannot be cast to java.lang.Boolean
         //
         verifyException("org.jfree.chart.util.BooleanList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      Object object0 = booleanList0.clone();
      booleanList0.set(2877, object0);
      booleanList0.equals(object0);
      // Undeclared exception!
      booleanList0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      boolean boolean0 = booleanList0.equals(booleanList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      boolean boolean0 = booleanList0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      booleanList0.setBoolean(0, (Boolean) null);
      assertEquals(1, booleanList0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      Boolean boolean0 = booleanList0.getBoolean(0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BooleanList booleanList0 = new BooleanList();
      booleanList0.hashCode();
  }
}