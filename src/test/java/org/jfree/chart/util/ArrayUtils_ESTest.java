/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:27:37 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.ArrayUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayUtils_ESTest extends ArrayUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparable<Integer>[] comparableArray0 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 2);
      comparableArray0[0] = (Comparable<Integer>) 0;
      Integer integer0 = Integer.getInteger((String) null, 19);
      Comparable<Integer>[] comparableArray1 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 7);
      comparableArray1[0] = (Comparable<Integer>) integer0;
      int int0 = ArrayUtils.compareVersionArrays(comparableArray1, comparableArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      float[][] floatArray0 = new float[3][6];
      float[][] floatArray1 = new float[8][9];
      boolean boolean0 = ArrayUtils.equal(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      float[][] floatArray0 = new float[5][8];
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(objectArray0, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArrayUtils.hasDuplicateItems((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ArrayUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArrayUtils.compareVersionArrays((Comparable[]) null, (Comparable[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ArrayUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparable<Integer>[] comparableArray0 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 2);
      comparableArray0[0] = (Comparable<Integer>) 0;
      Integer integer0 = Integer.getInteger((String) null, 19);
      Comparable<Integer>[] comparableArray1 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 7);
      comparableArray1[0] = (Comparable<Integer>) integer0;
      int int0 = ArrayUtils.compareVersionArrays(comparableArray0, comparableArray1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparable<Integer>[] comparableArray0 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 2);
      comparableArray0[1] = (Comparable<Integer>) 0;
      Comparable<Integer>[] comparableArray1 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 7);
      int int0 = ArrayUtils.compareVersionArrays(comparableArray0, comparableArray1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparable<Integer>[] comparableArray0 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 2);
      Integer integer0 = Integer.getInteger((String) null, 19);
      Comparable<Integer>[] comparableArray1 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 7);
      comparableArray1[0] = (Comparable<Integer>) integer0;
      int int0 = ArrayUtils.compareVersionArrays(comparableArray0, comparableArray1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparable<Integer>[] comparableArray0 = (Comparable<Integer>[]) Array.newInstance(Comparable.class, 2);
      comparableArray0[1] = (Comparable<Integer>) 0;
      int int0 = ArrayUtils.compareVersionArrays(comparableArray0, comparableArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      float[][] floatArray0 = new float[3][8];
      float[] floatArray1 = new float[6];
      floatArray0[0] = floatArray1;
      float[][] floatArray2 = new float[3][1];
      floatArray2[0] = floatArray0[0];
      floatArray2[1] = floatArray1;
      boolean boolean0 = ArrayUtils.hasDuplicateItems(floatArray2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[3] = object0;
      boolean boolean0 = ArrayUtils.hasDuplicateItems(objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float[][] floatArray0 = new float[5][8];
      boolean boolean0 = ArrayUtils.hasDuplicateItems(floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      float[][] floatArray0 = new float[3][8];
      float[][] floatArray1 = new float[3][1];
      boolean boolean0 = ArrayUtils.equal(floatArray1, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      float[][] floatArray0 = new float[3][6];
      float[][] floatArray1 = new float[0][7];
      boolean boolean0 = ArrayUtils.equal(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      float[][] floatArray0 = new float[4][2];
      boolean boolean0 = ArrayUtils.equal(floatArray0, (float[][]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      float[][] floatArray0 = new float[0][2];
      boolean boolean0 = ArrayUtils.equal((float[][]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = ArrayUtils.equal((float[][]) null, (float[][]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      float[][] floatArray0 = new float[17][5];
      boolean boolean0 = ArrayUtils.equal(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      float[][] floatArray0 = new float[17][5];
      float[][] floatArray1 = ArrayUtils.clone(floatArray0);
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Comparable<Object>[] comparableArray0 = (Comparable<Object>[]) Array.newInstance(Comparable.class, 1);
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(objectArray0, comparableArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      float[][] floatArray0 = new float[17][5];
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(objectArray0, objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object[] objectArray1 = new Object[7];
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(objectArray0, (Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      boolean boolean0 = ArrayUtils.equalReferencesInArrays((Object[]) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ArrayUtils.equalReferencesInArrays((Object[]) null, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      float[][] floatArray0 = new float[1][8];
      boolean boolean0 = ArrayUtils.equalReferencesInArrays(objectArray0, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      float[][] floatArray0 = ArrayUtils.clone((float[][]) null);
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      float[][] floatArray0 = new float[0][2];
      float[][] floatArray1 = ArrayUtils.clone(floatArray0);
      assertNotSame(floatArray1, floatArray0);
      assertNotNull(floatArray1);
  }
}
