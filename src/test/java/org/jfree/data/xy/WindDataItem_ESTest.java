/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:08:03 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.WindDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class WindDataItem_ESTest extends WindDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = Integer.valueOf(18);
      WindDataItem windDataItem0 = new WindDataItem(integer0, integer0, integer0);
      boolean boolean0 = windDataItem0.equals(windDataItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WindDataItem windDataItem0 = new WindDataItem((Number) null, (Number) null, (Number) null);
      Number number0 = windDataItem0.getX();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Long long0 = new Long((-3063L));
      WindDataItem windDataItem0 = new WindDataItem(long0, long0, long0);
      Number number0 = windDataItem0.getX();
      assertEquals((-3063L), number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Long long0 = Long.valueOf(0L);
      WindDataItem windDataItem0 = new WindDataItem(long0, long0, long0);
      Number number0 = windDataItem0.getX();
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Float float0 = new Float(1183.8438);
      WindDataItem windDataItem0 = new WindDataItem(float0, float0, float0);
      Number number0 = windDataItem0.getX();
      assertEquals(1183.8438F, number0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WindDataItem windDataItem0 = new WindDataItem((Number) null, (Number) null, (Number) null);
      Number number0 = windDataItem0.getWindForce();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long((-3063L));
      WindDataItem windDataItem0 = new WindDataItem(long0, long0, long0);
      Number number0 = windDataItem0.getWindForce();
      assertEquals((-3063L), number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = Long.valueOf(0L);
      WindDataItem windDataItem0 = new WindDataItem(long0, long0, long0);
      Number number0 = windDataItem0.getWindForce();
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Float float0 = new Float(1447.0F);
      WindDataItem windDataItem0 = new WindDataItem(float0, float0, float0);
      Number number0 = windDataItem0.getWindForce();
      assertEquals(1447.0F, number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WindDataItem windDataItem0 = new WindDataItem((Number) null, (Number) null, (Number) null);
      Number number0 = windDataItem0.getWindDirection();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Long long0 = new Long((-2920L));
      WindDataItem windDataItem0 = new WindDataItem(long0, long0, long0);
      Number number0 = windDataItem0.getWindDirection();
      assertEquals((-2920L), number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Short short0 = new Short((short)0);
      WindDataItem windDataItem0 = new WindDataItem(integer0, short0, short0);
      Number number0 = windDataItem0.getWindDirection();
      assertEquals((short)0, number0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Float float0 = new Float(1447.0F);
      WindDataItem windDataItem0 = new WindDataItem(float0, float0, float0);
      Number number0 = windDataItem0.getWindDirection();
      assertEquals(1447.0F, number0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WindDataItem windDataItem0 = new WindDataItem((Number) null, (Number) null, (Number) null);
      WindDataItem windDataItem1 = new WindDataItem((Number) null, (Number) null, (Number) null);
      // Undeclared exception!
      try { 
        windDataItem0.equals(windDataItem1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.WindDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WindDataItem windDataItem0 = new WindDataItem((Number) null, (Number) null, (Number) null);
      // Undeclared exception!
      try { 
        windDataItem0.compareTo(windDataItem0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.WindDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double(592.7);
      Integer integer0 = new Integer((-1));
      WindDataItem windDataItem0 = new WindDataItem(integer0, integer0, integer0);
      WindDataItem windDataItem1 = new WindDataItem(integer0, integer0, double0);
      boolean boolean0 = windDataItem0.equals(windDataItem1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(0);
      WindDataItem windDataItem0 = new WindDataItem(integer0, integer0, integer0);
      Float float0 = new Float((float) 0);
      Byte byte0 = new Byte((byte) (-68));
      WindDataItem windDataItem1 = new WindDataItem(integer0, float0, byte0);
      boolean boolean0 = windDataItem0.equals(windDataItem1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = new Double(592.7);
      WindDataItem windDataItem0 = new WindDataItem(double0, double0, double0);
      Integer integer0 = new Integer((-1));
      WindDataItem windDataItem1 = new WindDataItem(integer0, integer0, integer0);
      boolean boolean0 = windDataItem0.equals(windDataItem1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer((-1174));
      Float float0 = new Float((double) (-2833.958F));
      WindDataItem windDataItem0 = new WindDataItem(integer0, integer0, float0);
      WindDataItem windDataItem1 = new WindDataItem(integer0, integer0, float0);
      boolean boolean0 = windDataItem0.equals(windDataItem1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float(1.0F);
      WindDataItem windDataItem0 = new WindDataItem(float0, float0, float0);
      boolean boolean0 = windDataItem0.equals(float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer((-1174));
      Float float0 = new Float((double) (-2833.958F));
      WindDataItem windDataItem0 = new WindDataItem(integer0, integer0, float0);
      WindDataItem windDataItem1 = new WindDataItem(float0, integer0, integer0);
      int int0 = windDataItem1.compareTo(windDataItem0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer((-1174));
      Float float0 = new Float((double) (-2833.958F));
      WindDataItem windDataItem0 = new WindDataItem(integer0, integer0, float0);
      WindDataItem windDataItem1 = new WindDataItem(float0, integer0, integer0);
      int int0 = windDataItem0.compareTo(windDataItem1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Float float0 = new Float(1.0F);
      WindDataItem windDataItem0 = new WindDataItem(float0, float0, float0);
      int int0 = windDataItem0.compareTo(windDataItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Float float0 = new Float(1.0F);
      WindDataItem windDataItem0 = new WindDataItem(float0, float0, float0);
      // Undeclared exception!
      try { 
        windDataItem0.compareTo(float0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // WindDataItem.compareTo(error)
         //
         verifyException("org.jfree.data.xy.WindDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Float float0 = new Float(1.0F);
      WindDataItem windDataItem0 = new WindDataItem(float0, float0, float0);
      Number number0 = windDataItem0.getWindDirection();
      assertEquals(1.0F, number0);
  }
}
