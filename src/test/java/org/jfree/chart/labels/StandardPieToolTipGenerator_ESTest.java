/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:36:36 GMT 2019
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StandardPieToolTipGenerator_ESTest extends StandardPieToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator(">q`E=PL");
      String string0 = standardPieToolTipGenerator0.generateToolTip((PieDataset) null, ">q`E=PL");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("org.jfree.data.time.Week");
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultKeyedValues2DDataset0, tableOrder0, 0);
      String string0 = standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, "org.jfree.data.time.Week");
      assertEquals("org.jfree.data.time.Week", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("");
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(taskSeriesCollection0, tableOrder0, 1);
      String string0 = standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("org.jfree.data.time.Week");
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultKeyedValues2DDataset0, tableOrder0, 0);
      // Undeclared exception!
      try { 
        standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultKeyedValues2DDataset0, tableOrder0, 2537);
      defaultKeyedValues2DDataset0.setValue(0.0, (Comparable) "{0}: ({1}, {2})", (Comparable) tableOrder0);
      // Undeclared exception!
      try { 
        standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, tableOrder0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2537, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("", (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator((String) null, locale0);
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
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator((String) null, decimalFormat0, decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("");
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        standardPieToolTipGenerator0.generateToolTip(defaultPieDataset0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key not found: 
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator(locale0);
      assertEquals("{0}: ({1}, {2})", standardPieToolTipGenerator0.getLabelFormat());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("1 ?__Z \"&.");
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("1 ?__Z \"&.", choiceFormat0, choiceFormat0);
      assertEquals("1 ?__Z \"&.", standardPieToolTipGenerator0.getLabelFormat());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator(",j?sn", locale0);
      double[][] doubleArray0 = new double[8][3];
      double[] doubleArray1 = new double[1];
      doubleArray0[3] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultIntervalCategoryDataset0, tableOrder0, 1);
      // Undeclared exception!
      try { 
        standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator();
      Object object0 = standardPieToolTipGenerator0.clone();
      assertNotSame(standardPieToolTipGenerator0, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator();
      double[][] doubleArray0 = new double[7][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultIntervalCategoryDataset0, tableOrder0, (-226));
      // Undeclared exception!
      try { 
        standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, (-1345.202));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): category index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }
}
