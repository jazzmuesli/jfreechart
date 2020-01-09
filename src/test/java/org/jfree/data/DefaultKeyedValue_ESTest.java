/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:10:16 GMT 2019
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.DefaultKeyedValue;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DefaultKeyedValue_ESTest extends DefaultKeyedValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-2431));
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, integer0);
      String string0 = defaultKeyedValue0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, (Number) null);
      Number number0 = defaultKeyedValue0.getValue();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(integer0, integer0);
      Number number0 = defaultKeyedValue0.getValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = Integer.valueOf(2840);
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(integer0, integer0);
      Number number0 = defaultKeyedValue0.getValue();
      assertEquals(2840, number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long long0 = new Long(555L);
      DefaultKeyedValue defaultKeyedValue0 = null;
      try {
        defaultKeyedValue0 = new DefaultKeyedValue((Comparable) null, long0);
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
      Comparable<DefaultKeyedValue> comparable0 = (Comparable<DefaultKeyedValue>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, (Number) null);
      defaultKeyedValue0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Long long0 = new Long(759L);
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, long0);
      defaultKeyedValue0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long(555L);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, long0);
      defaultKeyedValue0.setValue((Number) null);
      DefaultKeyedValue defaultKeyedValue1 = (DefaultKeyedValue)defaultKeyedValue0.clone();
      assertTrue(defaultKeyedValue1.equals((Object)defaultKeyedValue0));
      
      Integer integer0 = new Integer((-1776));
      defaultKeyedValue1.setValue(integer0);
      boolean boolean0 = defaultKeyedValue0.equals(defaultKeyedValue1);
      assertFalse(defaultKeyedValue1.equals((Object)defaultKeyedValue0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue("(", (Number) null);
      DefaultKeyedValue defaultKeyedValue1 = (DefaultKeyedValue)defaultKeyedValue0.clone();
      Byte byte0 = new Byte((byte)29);
      defaultKeyedValue1.setValue(byte0);
      DefaultKeyedValue defaultKeyedValue2 = (DefaultKeyedValue)defaultKeyedValue0.clone();
      boolean boolean0 = defaultKeyedValue1.equals(defaultKeyedValue2);
      assertTrue(defaultKeyedValue2.equals((Object)defaultKeyedValue0));
      assertFalse(defaultKeyedValue1.equals((Object)defaultKeyedValue0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Long long0 = new Long(555L);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, long0);
      defaultKeyedValue0.setValue((Number) null);
      Object object0 = defaultKeyedValue0.clone();
      boolean boolean0 = defaultKeyedValue0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-2431));
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, integer0);
      DefaultKeyedValue defaultKeyedValue1 = new DefaultKeyedValue(integer0, integer0);
      boolean boolean0 = defaultKeyedValue0.equals(defaultKeyedValue1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Long long0 = new Long(759L);
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, long0);
      boolean boolean0 = defaultKeyedValue0.equals(defaultKeyedValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-2431));
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, integer0);
      boolean boolean0 = defaultKeyedValue0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-2431));
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, integer0);
      Number number0 = defaultKeyedValue0.getValue();
      assertEquals((-2431), number0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("+L(f)/ ppi8[I04").when(comparable0).toString();
      Integer integer0 = new Integer((-2431));
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, integer0);
      Comparable comparable1 = defaultKeyedValue0.getKey();
      assertNotNull(comparable1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-2431));
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, integer0);
      Object object0 = defaultKeyedValue0.clone();
      boolean boolean0 = defaultKeyedValue0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparable<DefaultKeyedValue> comparable0 = (Comparable<DefaultKeyedValue>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      DefaultKeyedValue defaultKeyedValue0 = new DefaultKeyedValue(comparable0, (Number) null);
      // Undeclared exception!
      try { 
        defaultKeyedValue0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}