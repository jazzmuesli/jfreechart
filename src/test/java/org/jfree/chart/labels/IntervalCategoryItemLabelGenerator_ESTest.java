/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:20:55 GMT 2019
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
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntervalCategoryItemLabelGenerator_ESTest extends IntervalCategoryItemLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      Long long0 = new Long((-1224L));
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("({0}, {1}) = {3} - {4}").when(categoryDataset0).getColumnKey(anyInt());
      doReturn("({0}, {1}) = {3} - {4}").when(categoryDataset0).getRowKey(anyInt());
      doReturn(long0).when(categoryDataset0).getValue(anyInt() , anyInt());
      Object[] objectArray0 = intervalCategoryItemLabelGenerator0.createItemArray(categoryDataset0, (-1005), 3782);
      assertEquals(5, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateFormat dateFormat0 = mock(DateFormat.class, new ViolatedAssumptionAnswer());
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", dateFormat0);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset0).getColumnKey(anyInt());
      doReturn("({0}, {1}) = {3} - {4}").when(categoryDataset0).getRowKey(anyInt());
      // Undeclared exception!
      try { 
        intervalCategoryItemLabelGenerator0.createItemArray(categoryDataset0, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        intervalCategoryItemLabelGenerator0.createItemArray(defaultStatisticalCategoryDataset0, 104, (-29));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 104, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      String[] stringArray0 = new String[9];
      Number[][] numberArray0 = new Number[0][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        intervalCategoryItemLabelGenerator0.createItemArray(defaultIntervalCategoryDataset0, (-1), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", numberFormat0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        intervalCategoryItemLabelGenerator0.createItemArray(defaultBoxAndWhiskerCategoryDataset0, (-1144), 52);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = null;
      try {
        intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator((String) null, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateFormat dateFormat0 = mock(DateFormat.class, new ViolatedAssumptionAnswer());
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = null;
      try {
        intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator((String) null, dateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateFormat dateFormat0 = mock(DateFormat.class, new ViolatedAssumptionAnswer());
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", dateFormat0);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("({0}, {1}) = {3} - {4}").when(categoryDataset0).getColumnKey(anyInt());
      doReturn("({0}, {1}) = {3} - {4}").when(categoryDataset0).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset0).getValue(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        intervalCategoryItemLabelGenerator0.createItemArray(categoryDataset0, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Date
         //
         verifyException("java.text.DateFormat", e);
      }
  }
}
