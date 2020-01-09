/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:17:37 GMT 2019
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DefaultKeyedValues2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DefaultKeyedValues2D_ESTest extends DefaultKeyedValues2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      Float float0 = new Float(219.0F);
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.addValue(float0, float0, comparable0);
      defaultKeyedValues2D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      defaultKeyedValues2D0.removeRow((Comparable) long0);
      assertEquals(1, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((Comparable) 0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised columnKey: null
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(comparable0).toString();
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      defaultKeyedValues2D0.addValue(float0, float0, float0);
      Object object0 = defaultKeyedValues2D0.clone();
      boolean boolean0 = defaultKeyedValues2D0.equals(object0);
      assertEquals(2, defaultKeyedValues2D0.getColumnCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Double double0 = new Double(0.0);
      defaultKeyedValues2D0.setValue(double0, double0, double0);
      Number number0 = defaultKeyedValues2D0.getValue((Comparable) double0, (Comparable) double0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Integer integer0 = new Integer(789);
      defaultKeyedValues2D0.addValue(integer0, integer0, integer0);
      Number number0 = defaultKeyedValues2D0.getValue((Comparable) integer0, (Comparable) integer0);
      assertEquals(789, number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float(371.63F);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      defaultKeyedValues2D0.removeColumn(0);
      defaultKeyedValues2D0.addValue(float0, float0, float0);
      Number number0 = defaultKeyedValues2D0.getValue(0, 1);
      assertEquals(371.63F, number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Integer integer0 = Integer.valueOf((-1));
      defaultKeyedValues2D0.setValue(integer0, integer0, integer0);
      Comparable comparable0 = defaultKeyedValues2D0.getRowKey(0);
      assertEquals((-1), comparable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Integer integer0 = Integer.valueOf((-1));
      defaultKeyedValues2D0.setValue(integer0, integer0, integer0);
      int int0 = defaultKeyedValues2D0.getRowIndex(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.setValue(long0, long0, long0);
      Short short0 = new Short((short)2);
      defaultKeyedValues2D0.setValue(short0, short0, short0);
      int int0 = defaultKeyedValues2D0.getRowIndex(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Double double0 = new Double(1.0);
      defaultKeyedValues2D0.addValue(double0, double0, double0);
      int int0 = defaultKeyedValues2D0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(1932L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      Comparable comparable0 = defaultKeyedValues2D0.getColumnKey(0);
      assertEquals(1932L, comparable0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      defaultKeyedValues2D0.removeColumn(0);
      int int0 = defaultKeyedValues2D0.getColumnIndex(long0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      int int0 = defaultKeyedValues2D0.getColumnIndex(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Short short0 = Short.valueOf((short)4244);
      defaultKeyedValues2D0.addValue(short0, short0, short0);
      int int0 = defaultKeyedValues2D0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.setValue((Number) null, (Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeValue((Comparable) null, "\rDHJG9 t");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-2115)).when(comparable0).compareTo(any());
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeValue(comparable0, comparable0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeRow((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeRow((-641));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeColumn((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeColumn((-776));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((Comparable) long0, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((-2), 6945);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getRowKey((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getRowIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Integer integer0 = new Integer(789);
      defaultKeyedValues2D0.addValue(integer0, integer0, integer0);
      Comparable<DefaultKeyedValues2D> comparable0 = (Comparable<DefaultKeyedValues2D>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getRowIndex(comparable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.lang.Comparable$MockitoMock$688523340 cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getColumnKey((-1920));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getColumnIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.addValue((Number) null, (Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Double double0 = new Double((-1044.9F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.setValue(double0, double0, comparable0);
      Float float0 = new Float((-1044.9F));
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.addValue(float0, float0, float0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.lang.Double
         //
         verifyException("java.lang.Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Integer integer0 = Integer.valueOf((-1));
      defaultKeyedValues2D0.setValue(integer0, integer0, integer0);
      defaultKeyedValues2D0.setValue(integer0, integer0, integer0);
      assertEquals(1, defaultKeyedValues2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Comparable<DefaultKeyedValues> comparable0 = (Comparable<DefaultKeyedValues>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      int int0 = defaultKeyedValues2D0.getRowIndex(comparable0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      Number number0 = defaultKeyedValues2D0.getValue(0, 1);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      defaultKeyedValues2D0.removeColumn(0);
      defaultKeyedValues2D0.addValue(float0, float0, float0);
      Number number0 = defaultKeyedValues2D0.getValue(0, 1);
      assertEquals((-1.0F), number0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getColumnKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      List list0 = defaultKeyedValues2D0.getRowKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeRow(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      int int0 = defaultKeyedValues2D0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      int int0 = defaultKeyedValues2D0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      List list0 = defaultKeyedValues2D0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(comparable0).toString();
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D)defaultKeyedValues2D0.clone();
      Byte byte0 = new Byte((byte)81);
      defaultKeyedValues2D1.setValue(byte0, float0, byte0);
      boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
      assertEquals(2, defaultKeyedValues2D1.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long((-53L));
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      DefaultKeyedValues2D defaultKeyedValues2D1 = new DefaultKeyedValues2D();
      boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Object object0 = new Object();
      boolean boolean0 = defaultKeyedValues2D0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      boolean boolean0 = defaultKeyedValues2D0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Byte byte0 = new Byte((byte)2);
      defaultKeyedValues2D0.setValue(byte0, byte0, byte0);
      defaultKeyedValues2D0.removeColumn((Comparable) byte0);
      assertEquals(1, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeColumn((Comparable) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown key: -1
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Byte byte0 = new Byte((byte)2);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeRow((Comparable) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown key: 2
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      Byte byte0 = new Byte((byte)27);
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.addValue(byte0, comparable0, comparable0);
      defaultKeyedValues2D0.removeValue(byte0, 1);
      assertEquals(1, defaultKeyedValues2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Byte byte0 = new Byte((byte)27);
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)27, (int)(byte)27).when(comparable0).compareTo(anyString());
      defaultKeyedValues2D0.addValue(byte0, comparable0, comparable0);
      defaultKeyedValues2D0.removeValue(byte0, 1);
      assertEquals(1, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long((-53L));
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((Comparable) comparable0, (Comparable) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised rowKey: null
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Short short0 = Short.valueOf((short)4244);
      defaultKeyedValues2D0.addValue(short0, short0, short0);
      Number number0 = defaultKeyedValues2D0.getValue((Comparable) short0, (Comparable) short0);
      assertEquals((short)4244, number0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Float float0 = new Float((double) 0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.addValue(float0, float0, comparable0);
      defaultKeyedValues2D0.removeRow(0);
      assertEquals(1, defaultKeyedValues2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(comparable0).toString();
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      Object object0 = defaultKeyedValues2D0.clone();
      boolean boolean0 = defaultKeyedValues2D0.equals(object0);
      assertEquals(2, defaultKeyedValues2D0.getColumnCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.setValue(float0, float0, comparable0);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float((-1.0F));
      int int0 = defaultKeyedValues2D0.getColumnIndex(float0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getRowKey(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      defaultKeyedValues2D0.clear();
      assertEquals(0, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      defaultKeyedValues2D0.removeRow((Comparable) long0);
      assertEquals(1, defaultKeyedValues2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeColumn(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}