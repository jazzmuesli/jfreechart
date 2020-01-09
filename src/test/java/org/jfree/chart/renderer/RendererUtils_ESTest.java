/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:25:02 GMT 2019
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.jfree.chart.renderer.RendererUtils;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class RendererUtils_ESTest extends RendererUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Day day0 = new Day();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      Instant instant0 = MockInstant.ofEpochSecond((long) 243);
      Date date0 = Date.from(instant0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, (-366.642483), 580.664636, (-366.642483), 580.664636, 4547.5);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(day0, oHLCDataItemArray0);
      int[] intArray0 = RendererUtils.findLiveItems(defaultOHLCDataset0, (-2146791911), 1, Double.NaN);
      assertArrayEquals(new int[] {0, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsUpperBound(xIntervalSeriesCollection0, 0, 2.0, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires xLow < xHigh.
         //
         verifyException("org.jfree.chart.renderer.RendererUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsLowerBound(histogramDataset0, 3348, 957.803979187, 957.803979187);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires xLow < xHigh.
         //
         verifyException("org.jfree.chart.renderer.RendererUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsUpperBound(histogramDataset0, 93, 93, 2307.4886193161888);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 93, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsLowerBound(histogramDataset0, 2632, (-3226.0), 2632);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2632, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(2, 2);
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItems(dynamicTimeSeriesCollection0, 2, 1, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.DynamicTimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItems(histogramDataset0, 0, (-1.0), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(366);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(fixedMillisecond0);
      int int0 = RendererUtils.findLiveItemsUpperBound(simpleHistogramDataset0, 1500, 1500, 3216.40461107898);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      int int0 = RendererUtils.findLiveItemsLowerBound(timeTableXYDataset0, (-7), (-7), 1.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsLowerBound(histogramDataset0, 0, 2532.315397442143, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires xLow < xHigh.
         //
         verifyException("org.jfree.chart.renderer.RendererUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Day day0 = new Day();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      Instant instant0 = MockInstant.ofEpochSecond((long) 243);
      Date date0 = Date.from(instant0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, (-366.642483), 580.664636, (-366.642483), 580.664636, 4547.5);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItemArray0[0];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(day0, oHLCDataItemArray0);
      int int0 = RendererUtils.findLiveItemsUpperBound(defaultOHLCDataset0, (-2146791911), 2058, Double.NaN);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Day day0 = new Day();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      Instant instant0 = MockInstant.ofEpochSecond((long) 243);
      Date date0 = Date.from(instant0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, (-366.642483), 580.664636, (-366.642483), 580.664636, 4547.5);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItemArray0[0];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(day0, oHLCDataItemArray0);
      int int0 = RendererUtils.findLiveItemsUpperBound(defaultOHLCDataset0, 243, (-2146791911), (-1317.0));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Day day0 = new Day();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(day0, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsUpperBound(defaultOHLCDataset0, (-2146791911), 2058, Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsUpperBound(timeTableXYDataset0, 2176, 2176, 1.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires xLow < xHigh.
         //
         verifyException("org.jfree.chart.renderer.RendererUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Day day0 = new Day();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      Instant instant0 = MockInstant.ofEpochSecond((long) 243);
      Date date0 = Date.from(instant0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, (-366.642483), 580.664636, (-366.642483), 580.664636, 4547.5);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset(day0, oHLCDataItemArray0);
      int int0 = RendererUtils.findLiveItemsLowerBound(defaultOHLCDataset0, 243, Double.NaN, (-2146791911));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(2050, 2050, quarter0);
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItemsLowerBound(dynamicTimeSeriesCollection0, 4, 0, 1.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.DynamicTimeSeriesCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      // Undeclared exception!
      try { 
        RendererUtils.findLiveItems(vectorSeriesCollection0, (-2146514343), (-645.7933741836893), (-2146514343));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires xLow < xHigh.
         //
         verifyException("org.jfree.chart.renderer.RendererUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      int[] intArray0 = RendererUtils.findLiveItems(timeTableXYDataset0, (-6), 1804.18069990616, 1923.4343);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RendererUtils rendererUtils0 = new RendererUtils();
  }
}
