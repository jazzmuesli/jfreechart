/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:29:51 GMT 2019
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.data.category.CategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StandardCategoryToolTipGenerator_ESTest extends StandardCategoryToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("Ad7Q", numberFormat0);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("({0}, {1}) = {2}").when(categoryDataset0).getColumnKey(anyInt());
      doReturn("Ad7Q").when(categoryDataset0).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset0).getValue(anyInt() , anyInt());
      String string0 = standardCategoryToolTipGenerator0.generateToolTip(categoryDataset0, (-1187), (-1090));
      assertEquals("Ad7Q", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateFormat dateFormat0 = mock(DateFormat.class, new ViolatedAssumptionAnswer());
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", dateFormat0);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("").when(categoryDataset0).getColumnKey(anyInt());
      doReturn("").when(categoryDataset0).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset0).getValue(anyInt() , anyInt());
      String string0 = standardCategoryToolTipGenerator0.generateToolTip(categoryDataset0, 2, 2);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = null;
      try {
        standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateFormat dateFormat0 = mock(DateFormat.class, new ViolatedAssumptionAnswer());
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = null;
      try {
        standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator((String) null, dateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator1 = new StandardCategoryToolTipGenerator("({0}, {1}) = {2}", numberFormat0);
      boolean boolean0 = standardCategoryToolTipGenerator0.equals(standardCategoryToolTipGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      boolean boolean0 = standardCategoryToolTipGenerator0.equals(standardCategoryToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateFormat dateFormat0 = mock(DateFormat.class, new ViolatedAssumptionAnswer());
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", dateFormat0);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset0).getRowKey(anyInt());
      // Undeclared exception!
      try { 
        standardCategoryToolTipGenerator0.generateToolTip(categoryDataset0, 1, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      boolean boolean0 = standardCategoryToolTipGenerator0.equals("({0}, {1}) = {2}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("^nVD0M_9k)", numberFormat0);
      // Undeclared exception!
      try { 
        standardCategoryToolTipGenerator0.generateToolTip((CategoryDataset) null, (-19), (-19));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }
}
