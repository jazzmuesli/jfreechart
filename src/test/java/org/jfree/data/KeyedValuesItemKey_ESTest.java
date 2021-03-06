/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:28:59 GMT 2019
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.KeyedValuesItemKey;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class KeyedValuesItemKey_ESTest extends KeyedValuesItemKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      keyedValuesItemKey0.key = null;
      Comparable<?> comparable1 = keyedValuesItemKey0.getKey();
      assertNull(comparable1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      keyedValuesItemKey0.key = null;
      // Undeclared exception!
      try { 
        keyedValuesItemKey0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      keyedValuesItemKey0.key = null;
      // Undeclared exception!
      try { 
        keyedValuesItemKey0.toJSONString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedValuesItemKey keyedValuesItemKey0 = null;
      try {
        keyedValuesItemKey0 = new KeyedValuesItemKey((Comparable<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      KeyedValuesItemKey keyedValuesItemKey1 = new KeyedValuesItemKey("[>.N}/i gSs541yHPl.");
      boolean boolean0 = keyedValuesItemKey0.equals(keyedValuesItemKey1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      KeyedValuesItemKey keyedValuesItemKey1 = new KeyedValuesItemKey(keyedValuesItemKey0.key);
      boolean boolean0 = keyedValuesItemKey0.equals(keyedValuesItemKey1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      boolean boolean0 = keyedValuesItemKey0.equals(keyedValuesItemKey0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      boolean boolean0 = keyedValuesItemKey0.equals("KeyedValuesItemKey[codegen.java.lang.Comparable$MockitoMock$1403436895@0000000002]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      String string0 = keyedValuesItemKey0.toString();
      keyedValuesItemKey0.key = null;
      KeyedValuesItemKey keyedValuesItemKey1 = new KeyedValuesItemKey(string0);
      // Undeclared exception!
      try { 
        keyedValuesItemKey0.equals(keyedValuesItemKey1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedValuesItemKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      String string0 = keyedValuesItemKey0.toJSONString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      KeyedValuesItemKey keyedValuesItemKey0 = new KeyedValuesItemKey(comparable0);
      Comparable<?> comparable1 = keyedValuesItemKey0.getKey();
      assertNotNull(comparable1);
  }
}
