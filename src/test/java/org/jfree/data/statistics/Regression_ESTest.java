/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:23:43 GMT 2019
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.Regression;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.VectorDataItem;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Regression_ESTest extends Regression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1704.0881, 2634.0224721388327, 1704.0881, (-360.6991066663));
      XYSeries xYSeries0 = new XYSeries(vectorDataItem0, true, true);
      BigInteger bigInteger0 = BigInteger.ZERO;
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, bigInteger0);
      xYSeries0.add(xYDataItem0, true);
      xYSeries0.addOrUpdate((-1.7976931348623157E308), Double.NaN);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      Regression.getPowerRegression((XYDataset) xYSeriesCollection0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[4];
      doubleArray1[1] = (-3313.06335262618);
      doubleArray0[0] = doubleArray1;
      Regression.getPowerRegression(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 593.302276494;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      Regression.getPowerRegression(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[5][8];
      Regression.getPowerRegression(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      MockDate mockDate0 = new MockDate();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 2267.630939327241, 2267.630939327241, 2267.630939327241, (-1257.8), 2267.630939327241);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      oHLCDataItemArray0[2] = oHLCDataItem0;
      MockDate mockDate1 = new MockDate(8, 3, (-326), (-326), (-326), 3);
      OHLCDataItem oHLCDataItem1 = new OHLCDataItem(mockDate1, (-1257.8), 3373.1, (-1257.8), 0.0, (-1257.8));
      oHLCDataItemArray0[3] = oHLCDataItem1;
      oHLCDataItemArray0[4] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      double[] doubleArray0 = Regression.getOLSRegression((XYDataset) defaultOHLCDataset0, 3);
      assertArrayEquals(new double[] {(-738.1985542625173), (-3.7316718058996425E-10)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = Double.NEGATIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = Regression.getOLSRegression(doubleArray0);
      assertEquals(2, doubleArray2.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-810.5474958920124);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = Regression.getOLSRegression(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[5][8];
      double[] doubleArray1 = Regression.getOLSRegression(doubleArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) histogramDataset0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1679), (-1679), (-1679), (-1679), (-4796), (-5334));
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, (-4796), (-1679), Double.NEGATIVE_INFINITY);
      Date[] dateArray0 = new Date[6];
      dateArray0[0] = (Date) mockDate0;
      dateArray0[1] = (Date) mockDate0;
      dateArray0[2] = (Date) mockDate0;
      dateArray0[3] = (Date) mockDate0;
      double[] doubleArray0 = new double[3];
      DefaultHighLowDataset defaultHighLowDataset0 = new DefaultHighLowDataset(oHLCDataItem0, dateArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) defaultHighLowDataset0, 4215);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "`?Amhxw", 0, 0, 0, 2656, (-1671), 0, 2656, 0, 12);
      Locale locale0 = Locale.KOREAN;
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset(simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(timeTableXYDataset0, (-1146), (-1146));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(histogramDataset0, 6, 6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(histogramDataset0, (-187), (-86));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        Regression.getOLSRegression(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) histogramDataset0, 1160);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1160, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      MockDate mockDate0 = new MockDate();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 2267.630939327241, 2267.630939327241, 2267.630939327241, (-1257.8479619041), 342.160404024);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItem0;
      oHLCDataItemArray0[2] = oHLCDataItem0;
      oHLCDataItemArray0[3] = oHLCDataItemArray0[2];
      oHLCDataItemArray0[4] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      double[] doubleArray0 = Regression.getPolynomialRegression(defaultOHLCDataset0, 3342, 2);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      MockDate mockDate0 = new MockDate();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 2267.630939327241, 2267.630939327241, 2267.630939327241, (-1257.8479619041), 342.160404024);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItemArray0[0];
      oHLCDataItemArray0[2] = oHLCDataItem0;
      oHLCDataItemArray0[3] = oHLCDataItemArray0[1];
      oHLCDataItemArray0[4] = oHLCDataItem0;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      double[] doubleArray0 = Regression.getPolynomialRegression(defaultOHLCDataset0, 0, 0);
      assertArrayEquals(new double[] {(-1257.8479619041), Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      MockDate mockDate0 = new MockDate();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 2267.630939327241, 2267.630939327241, 2267.630939327241, (-1257.8), 2267.630939327241);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      oHLCDataItemArray0[1] = oHLCDataItemArray0[0];
      oHLCDataItemArray0[2] = oHLCDataItem0;
      MockDate mockDate1 = new MockDate(8, 3, (-326), (-326), (-326), 3);
      OHLCDataItem oHLCDataItem1 = new OHLCDataItem(mockDate1, (-1257.8), 3373.1, (-1257.8), 0.0, (-1257.8));
      oHLCDataItemArray0[3] = oHLCDataItem1;
      OHLCDataItem oHLCDataItem2 = new OHLCDataItem(mockDate1, (-1257.8), 0.0, (-862.483176138), 3373.1, 0.0);
      oHLCDataItemArray0[4] = oHLCDataItem2;
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      double[] doubleArray0 = Regression.getPolynomialRegression(defaultOHLCDataset0, 2, 4);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(timeTableXYDataset0, 100, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        Regression.getPolynomialRegression(defaultOHLCDataset0, 8, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1704.0881, 1704.0881, 1704.0881, (-360.6991066663));
      XYSeries xYSeries0 = new XYSeries(vectorDataItem0, true, true);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) xYSeriesCollection0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        Regression.getPowerRegression((XYDataset) defaultOHLCDataset0, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[0][7];
      // Undeclared exception!
      try { 
        Regression.getPowerRegression(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      // Undeclared exception!
      try { 
        Regression.getPowerRegression(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) timeTableXYDataset0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[5];
      DefaultOHLCDataset defaultOHLCDataset0 = new DefaultOHLCDataset((Comparable) null, oHLCDataItemArray0);
      // Undeclared exception!
      try { 
        Regression.getOLSRegression((XYDataset) defaultOHLCDataset0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultOHLCDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      // Undeclared exception!
      try { 
        Regression.getOLSRegression(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not enough data.
         //
         verifyException("org.jfree.data.statistics.Regression", e);
      }
  }
}
