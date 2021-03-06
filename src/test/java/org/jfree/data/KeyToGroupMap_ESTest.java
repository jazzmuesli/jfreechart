/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:35:00 GMT 2019
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.KeyToGroupMap;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class KeyToGroupMap_ESTest extends KeyToGroupMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Comparable<KeyToGroupMap> comparable0 = (Comparable<KeyToGroupMap>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyToGroupMap0.mapKeyToGroup(comparable0, comparable0);
      keyToGroupMap0.mapKeyToGroup("gByV&", "gByV&");
      int int0 = keyToGroupMap0.getGroupIndex("gByV&");
      assertEquals(3, keyToGroupMap0.getGroupCount());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap(comparable0);
      // Undeclared exception!
      try { 
        keyToGroupMap0.mapKeyToGroup((Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap(comparable0);
      // Undeclared exception!
      try { 
        keyToGroupMap0.getKeyCount((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'group' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap(comparable0);
      // Undeclared exception!
      try { 
        keyToGroupMap0.getGroup((Comparable) null);
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
      KeyToGroupMap keyToGroupMap0 = null;
      try {
        keyToGroupMap0 = new KeyToGroupMap((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'defaultGroup' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Integer integer0 = new Integer(278);
      keyToGroupMap0.mapKeyToGroup(integer0, integer0);
      int int0 = keyToGroupMap0.getKeyCount(integer0);
      assertEquals(2, keyToGroupMap0.getGroupCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Integer integer0 = new Integer(278);
      keyToGroupMap0.mapKeyToGroup(integer0, integer0);
      keyToGroupMap0.getGroup(integer0);
      assertEquals(2, keyToGroupMap0.getGroupCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Comparable<KeyToGroupMap> comparable0 = (Comparable<KeyToGroupMap>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      Comparable<String> comparable1 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(comparable1).toString();
      keyToGroupMap0.mapKeyToGroup(comparable0, comparable1);
      keyToGroupMap0.clone();
      assertEquals(2, keyToGroupMap0.getGroupCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Comparable comparable1 = keyToGroupMap0.getGroup(comparable0);
      Object object0 = keyToGroupMap0.clone();
      assertTrue(object0.equals((Object)keyToGroupMap0));
      
      keyToGroupMap0.mapKeyToGroup(comparable1, comparable1);
      boolean boolean0 = keyToGroupMap0.equals(object0);
      assertFalse(object0.equals((Object)keyToGroupMap0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap(comparable0);
      KeyToGroupMap keyToGroupMap1 = new KeyToGroupMap();
      boolean boolean0 = keyToGroupMap0.equals(keyToGroupMap1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      boolean boolean0 = keyToGroupMap0.equals(keyToGroupMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      boolean boolean0 = keyToGroupMap0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Comparable<KeyToGroupMap> comparable0 = (Comparable<KeyToGroupMap>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyToGroupMap0.mapKeyToGroup(comparable0, comparable0);
      Comparable<String> comparable1 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      int int0 = keyToGroupMap0.getKeyCount(comparable1);
      assertEquals(2, keyToGroupMap0.getGroupCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      keyToGroupMap0.mapKeyToGroup("gByV&", "gByV&");
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyToGroupMap0.mapKeyToGroup(comparable0, "gByV&");
      keyToGroupMap0.mapKeyToGroup("gByV&", (Comparable) null);
      assertEquals(2, keyToGroupMap0.getGroupCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      keyToGroupMap0.mapKeyToGroup("gByV&", "gByV&");
      assertEquals(2, keyToGroupMap0.getGroupCount());
      
      keyToGroupMap0.mapKeyToGroup("gByV&", (Comparable) null);
      assertEquals(1, keyToGroupMap0.getGroupCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      keyToGroupMap0.mapKeyToGroup("gByV&", "gByV&");
      keyToGroupMap0.mapKeyToGroup("gByV&", "gByV&");
      assertEquals(2, keyToGroupMap0.getGroupCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Comparable comparable1 = keyToGroupMap0.getGroup(comparable0);
      int int0 = keyToGroupMap0.getGroupIndex(comparable1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      int int0 = keyToGroupMap0.getGroupIndex(comparable0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      keyToGroupMap0.mapKeyToGroup("gByV&", "gByV&");
      int int0 = keyToGroupMap0.getGroupIndex("gByV&");
      assertEquals(2, keyToGroupMap0.getGroupCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Comparable<KeyToGroupMap> comparable0 = (Comparable<KeyToGroupMap>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      keyToGroupMap0.mapKeyToGroup(comparable0, comparable0);
      keyToGroupMap0.getGroups();
      assertEquals(2, keyToGroupMap0.getGroupCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      Object object0 = keyToGroupMap0.clone();
      boolean boolean0 = keyToGroupMap0.equals(object0);
      assertNotSame(object0, keyToGroupMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyToGroupMap keyToGroupMap0 = new KeyToGroupMap();
      int int0 = keyToGroupMap0.getGroupCount();
      assertEquals(1, int0);
  }
}
