/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:45:24 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.AbstractObjectList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractObjectList_ESTest extends AbstractObjectList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      AbstractObjectList abstractObjectList1 = new AbstractObjectList();
      AbstractObjectList abstractObjectList2 = new AbstractObjectList(2124);
      abstractObjectList0.set(2124, abstractObjectList2);
      abstractObjectList1.get(0);
      abstractObjectList1.set(8, (Object) null);
      abstractObjectList1.clone();
      abstractObjectList0.equals(abstractObjectList1);
      abstractObjectList0.hashCode();
      AbstractObjectList abstractObjectList3 = new AbstractObjectList(8, 0);
      abstractObjectList3.clone();
      abstractObjectList0.set(0, (Object) null);
      abstractObjectList0.equals(abstractObjectList3);
      // Undeclared exception!
      abstractObjectList0.equals(abstractObjectList3);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(8, 8);
      abstractObjectList0.equals(abstractObjectList0);
      abstractObjectList0.set(8, abstractObjectList0);
      abstractObjectList0.clone();
      Object object0 = new Object();
      abstractObjectList0.set(8, object0);
      abstractObjectList0.equals((Object) null);
      Object object1 = abstractObjectList0.clone();
      Object object2 = abstractObjectList0.clone();
      abstractObjectList0.equals(object1);
      abstractObjectList0.set(8, (Object) null);
      abstractObjectList0.size();
      object2.equals((Object) null);
      abstractObjectList0.clone();
      abstractObjectList0.equals(object2);
      abstractObjectList0.size();
      abstractObjectList0.clear();
      abstractObjectList0.clone();
      abstractObjectList0.clear();
      abstractObjectList0.clone();
      abstractObjectList0.equals(object0);
      Object object3 = new Object();
      abstractObjectList0.indexOf(object3);
      abstractObjectList0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      abstractObjectList0.clear();
      abstractObjectList0.clone();
      abstractObjectList0.hashCode();
      abstractObjectList0.clear();
      abstractObjectList0.clone();
      AbstractObjectList abstractObjectList1 = new AbstractObjectList(1243, 0);
      abstractObjectList0.set(1243, abstractObjectList1);
      abstractObjectList0.set(0, "c'Di 1p<m'0B");
      abstractObjectList0.clone();
      Object object0 = new Object();
      abstractObjectList1.clone();
      abstractObjectList1.indexOf(object0);
      Object object1 = abstractObjectList0.clone();
      abstractObjectList0.clone();
      abstractObjectList1.indexOf(object1);
      abstractObjectList1.clone();
      abstractObjectList0.size();
      abstractObjectList0.get(277);
      abstractObjectList0.indexOf((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(0, (-3735));
      abstractObjectList0.clone();
      Object object0 = abstractObjectList0.clone();
      abstractObjectList0.equals(object0);
      int int0 = 0;
      int int1 = 0;
      abstractObjectList0.get(0);
      abstractObjectList0.equals((Object) null);
      abstractObjectList0.clear();
      abstractObjectList0.clone();
      Object object1 = new Object();
      // Undeclared exception!
      try { 
        abstractObjectList0.set(0, object1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(0);
      int int0 = 0;
      int int1 = 1;
      abstractObjectList0.clone();
      int int2 = (-3489);
      String string0 = ">e?9R0p1e2\\+LC2Wu";
      abstractObjectList0.clone();
      // Undeclared exception!
      try { 
        abstractObjectList0.set(0, ">e?9R0p1e2+LC2Wu");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = (-1);
      AbstractObjectList abstractObjectList0 = null;
      try {
        abstractObjectList0 = new AbstractObjectList((-1), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(4786, 2576);
      abstractObjectList0.set(2576, "");
      abstractObjectList0.set(99, "");
      abstractObjectList0.get(2576);
      AbstractObjectList abstractObjectList1 = new AbstractObjectList(8, 8);
      abstractObjectList0.set(2576, abstractObjectList1);
      abstractObjectList0.set(2576, "");
      abstractObjectList1.equals(abstractObjectList0);
      // Undeclared exception!
      try { 
        abstractObjectList0.set((-2813), "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      abstractObjectList0.get((-90));
      abstractObjectList0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(0);
      // Undeclared exception!
      try { 
        abstractObjectList0.set(2500, "*d'#h");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2500
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = (-3020);
      AbstractObjectList abstractObjectList0 = null;
      try {
        abstractObjectList0 = new AbstractObjectList((-3020));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      abstractObjectList0.clear();
      AbstractObjectList abstractObjectList1 = new AbstractObjectList(0);
      abstractObjectList1.clear();
      abstractObjectList0.set(0, abstractObjectList1);
      abstractObjectList0.clone();
      Object object0 = abstractObjectList0.clone();
      abstractObjectList1.equals(object0);
      Object object1 = abstractObjectList0.clone();
      abstractObjectList1.clear();
      Object object2 = abstractObjectList0.clone();
      abstractObjectList1.clear();
      abstractObjectList0.hashCode();
      abstractObjectList0.size();
      abstractObjectList0.indexOf(abstractObjectList1);
      int int0 = (-1248);
      abstractObjectList0.set(0, object2);
      abstractObjectList0.equals(object1);
      // Undeclared exception!
      try { 
        abstractObjectList0.set((-1248), abstractObjectList1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      AbstractObjectList abstractObjectList1 = new AbstractObjectList();
      abstractObjectList0.equals(abstractObjectList1);
      Object object0 = new Object();
      abstractObjectList0.equals(object0);
      abstractObjectList0.clone();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      abstractObjectList0.clone();
      abstractObjectList0.set(0, (Object) null);
      abstractObjectList0.hashCode();
      abstractObjectList0.size();
      abstractObjectList0.get(1);
      abstractObjectList0.indexOf((Object) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(140, 140);
      abstractObjectList0.get(140);
      abstractObjectList0.set(140, (Object) null);
      Object object0 = new Object();
      abstractObjectList0.indexOf(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      abstractObjectList0.indexOf((Object) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      abstractObjectList0.clear();
      abstractObjectList0.size();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(2528, 2528);
      // Undeclared exception!
      try { 
        abstractObjectList0.set((-1145), "Mtq%x>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(1, 1);
      AbstractObjectList abstractObjectList1 = new AbstractObjectList(8, 8);
      abstractObjectList0.set(1, abstractObjectList1);
      abstractObjectList1.equals((Object) null);
      AbstractObjectList abstractObjectList2 = new AbstractObjectList(1, 8);
      abstractObjectList0.equals(abstractObjectList2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      abstractObjectList0.get(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(140, 140);
      abstractObjectList0.get(140);
      abstractObjectList0.set(140, (Object) null);
      abstractObjectList0.indexOf((Object) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(130);
      abstractObjectList0.get(130);
      abstractObjectList0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList();
      Object object0 = abstractObjectList0.clone();
      abstractObjectList0.set(8, object0);
      abstractObjectList0.equals(abstractObjectList0);
      abstractObjectList0.clear();
      abstractObjectList0.clear();
      AbstractObjectList abstractObjectList1 = (AbstractObjectList)abstractObjectList0.clone();
      abstractObjectList1.set(8, abstractObjectList0);
      Object object1 = new Object();
      abstractObjectList1.equals(object1);
      abstractObjectList0.set(1, "");
      abstractObjectList0.equals(abstractObjectList0);
      AbstractObjectList abstractObjectList2 = (AbstractObjectList)abstractObjectList0.clone();
      Object object2 = new Object();
      abstractObjectList0.size();
      abstractObjectList0.hashCode();
      abstractObjectList0.equals(object0);
      abstractObjectList0.indexOf(object2);
      abstractObjectList0.equals("");
      abstractObjectList0.get((-1));
      AbstractObjectList abstractObjectList3 = (AbstractObjectList)abstractObjectList0.clone();
      abstractObjectList0.indexOf(abstractObjectList3);
      object0.equals(abstractObjectList3);
      abstractObjectList2.indexOf(object1);
      boolean boolean0 = abstractObjectList3.equals("");
      assertEquals(2, abstractObjectList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AbstractObjectList abstractObjectList0 = new AbstractObjectList(713, 713);
      // Undeclared exception!
      try { 
        abstractObjectList0.set((-1350), abstractObjectList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
