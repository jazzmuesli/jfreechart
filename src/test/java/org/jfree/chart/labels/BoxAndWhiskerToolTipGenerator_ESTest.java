/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:27:10 GMT 2019
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BoxAndWhiskerToolTipGenerator_ESTest extends BoxAndWhiskerToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      Float float0 = new Float(0.0F);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ").when(categoryDataset0).getRowKey(anyInt());
      doReturn(float0).when(categoryDataset0).getValue(anyInt() , anyInt());
      String string0 = boxAndWhiskerToolTipGenerator0.generateLabelString(categoryDataset0, 2, (-1));
      assertEquals("X: 0 Mean: null Median: null Min: null Max: null Q1: null Q3: null ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray((CategoryDataset) null, 4, 866);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(defaultStatisticalCategoryDataset0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset0).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset0).getValue(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset0, 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      String[] stringArray0 = new String[1];
      Number[][] numberArray0 = new Number[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(defaultIntervalCategoryDataset0, 469, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(defaultStatisticalCategoryDataset0, (-1217), 1621);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = null;
      try {
        boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator((String) null, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      Object object0 = boxAndWhiskerToolTipGenerator0.clone();
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals(boxAndWhiskerToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals("yrRf5+)-TQiG<*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      BigInteger bigInteger0 = BigInteger.TEN;
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ").when(categoryDataset0).getRowKey(anyInt());
      doReturn(bigInteger0).when(categoryDataset0).getValue(anyInt() , anyInt());
      Object[] objectArray0 = boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset0, 1351, 1351);
      assertEquals(8, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("1Jm{TxO'^w7-]=", decimalFormat0);
      assertEquals("1Jm{TxO'^w7-]=", boxAndWhiskerToolTipGenerator0.getLabelFormat());
  }
}
