/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:54:41 GMT 2019
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HighLowItemLabelGenerator_ESTest extends HighLowItemLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[1];
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0);
      Date date0 = simpleTimePeriod0.getStart();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, 0.0, 1842.4488, 0, (-712.20802898), (-712.20802898));
      oHLCDataItemArray0[0] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        highLowItemLabelGenerator0.generateToolTip(defaultOHLCDataset0, 127, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      HighLowItemLabelGenerator highLowItemLabelGenerator1 = new HighLowItemLabelGenerator();
      boolean boolean0 = highLowItemLabelGenerator0.equals(highLowItemLabelGenerator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      boolean boolean0 = highLowItemLabelGenerator0.equals(mockSimpleDateFormat0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      boolean boolean0 = highLowItemLabelGenerator0.equals(highLowItemLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      DateFormat dateFormat0 = MockDateFormat.getDateInstance(0);
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      HighLowItemLabelGenerator highLowItemLabelGenerator1 = new HighLowItemLabelGenerator(dateFormat0, numberFormat0);
      boolean boolean0 = highLowItemLabelGenerator0.equals(highLowItemLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      Object object0 = highLowItemLabelGenerator0.clone();
      assertNotSame(object0, highLowItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      String string0 = highLowItemLabelGenerator0.generateToolTip(categoryTableXYDataset0, 0, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[1];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        highLowItemLabelGenerator0.generateToolTip(defaultOHLCDataset0, 305, 1259);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1259
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateInstance();
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = null;
      try {
        highLowItemLabelGenerator0 = new HighLowItemLabelGenerator(dateFormat0, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'numberFormatter' argument.
         //
         verifyException("org.jfree.chart.labels.HighLowItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = null;
      try {
        highLowItemLabelGenerator0 = new HighLowItemLabelGenerator((DateFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dateFormatter' argument.
         //
         verifyException("org.jfree.chart.labels.HighLowItemLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[1];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      String string0 = highLowItemLabelGenerator0.generateLabel(defaultOHLCDataset0, (-5), 305);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      highLowItemLabelGenerator0.hashCode();
  }
}
