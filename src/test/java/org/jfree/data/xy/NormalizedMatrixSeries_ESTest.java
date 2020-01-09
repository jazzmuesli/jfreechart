/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:39:51 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.xy.NormalizedMatrixSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NormalizedMatrixSeries_ESTest extends NormalizedMatrixSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.getItem(4);
      normalizedMatrixSeries0.setScaleFactor(1.0);
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.data = null;
      normalizedMatrixSeries0.getScaleFactor();
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(4, 4, 1.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      normalizedMatrixSeries0.update(0, 0, 10);
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      NormalizedMatrixSeries normalizedMatrixSeries1 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      normalizedMatrixSeries1.getItem(4);
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.zeroAll();
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.addPropertyChangeListener(propertyChangeListener0);
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.update(4, 4, 1.0);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      NormalizedMatrixSeries normalizedMatrixSeries1 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      NormalizedMatrixSeries normalizedMatrixSeries2 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      normalizedMatrixSeries2.getItem(4);
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.equals("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.getScaleFactor();
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries1.removePropertyChangeListener(propertyChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries2.update(0, 0, 1.0);
      normalizedMatrixSeries1.update(0, 0, (-439.94814));
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 10.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      NormalizedMatrixSeries normalizedMatrixSeries1 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      NormalizedMatrixSeries normalizedMatrixSeries2 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      normalizedMatrixSeries2.getItem(4);
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.equals((Object) null);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries1.update(0, 0, (-439.94814));
      normalizedMatrixSeries1.getItem(4);
      normalizedMatrixSeries0.getItem(0);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 10.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 10;
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      normalizedMatrixSeries0.clone();
      int int1 = 0;
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      NormalizedMatrixSeries normalizedMatrixSeries1 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries1.addPropertyChangeListener(propertyChangeListener0);
      normalizedMatrixSeries1.getItem(4);
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.data = null;
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.equals("org.jfree.data.xy.NormalizedMatrixSeries");
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.zeroAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      NormalizedMatrixSeries normalizedMatrixSeries1 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      normalizedMatrixSeries1.setScaleFactor((-1.7976931348623157E308));
      normalizedMatrixSeries0.equals(normalizedMatrixSeries1);
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.equals("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries1.getScaleFactor();
      normalizedMatrixSeries0.getScaleFactor();
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 10.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      NormalizedMatrixSeries normalizedMatrixSeries1 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      double[][] doubleArray0 = new double[9][8];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (double) 10;
      doubleArray1[1] = 1.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = (double) 10;
      doubleArray1[4] = 1.0;
      doubleArray1[5] = (double) 10;
      doubleArray1[6] = 1.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 1.0;
      doubleArray2[1] = 1.0;
      doubleArray2[2] = 1.0;
      doubleArray2[3] = 1.0;
      doubleArray2[4] = (double) 10;
      doubleArray2[5] = 1.0;
      doubleArray2[6] = (double) 10;
      doubleArray2[7] = (double) 10;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[4];
      doubleArray3[0] = 1.0;
      doubleArray3[1] = (-954.9874134);
      doubleArray3[2] = (double) 10;
      doubleArray3[3] = 1.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[1];
      doubleArray4[0] = (-950.5657534815634);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[9];
      doubleArray5[0] = (double) 10;
      doubleArray5[1] = 1.0;
      doubleArray5[2] = 1.0;
      doubleArray5[3] = (-950.5657534815634);
      doubleArray5[4] = 1.0;
      doubleArray5[5] = (-954.9874134);
      doubleArray5[6] = (-954.9874134);
      doubleArray5[7] = (double) 10;
      doubleArray5[8] = (-954.9874134);
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[0];
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[5];
      doubleArray7[0] = (-509.7);
      doubleArray7[1] = 1.0;
      doubleArray7[2] = 0.0;
      doubleArray7[3] = (-954.9874134);
      doubleArray7[4] = 1.0;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[5];
      doubleArray8[0] = (-954.9874134);
      doubleArray8[1] = 0.0;
      doubleArray8[2] = (-950.5657534815634);
      doubleArray8[3] = 1.0;
      doubleArray8[4] = (-950.5657534815634);
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[6];
      doubleArray9[0] = (double) 10;
      doubleArray9[1] = (-950.5657534815634);
      doubleArray9[2] = (-509.7);
      doubleArray9[3] = (-1572.65067545181);
      doubleArray9[4] = (double) 10;
      doubleArray9[5] = 1.0;
      doubleArray0[8] = doubleArray9;
      normalizedMatrixSeries1.data = doubleArray0;
      normalizedMatrixSeries0.equals(normalizedMatrixSeries1);
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.equals("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.getItem(0);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      NormalizedMatrixSeries normalizedMatrixSeries1 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      NormalizedMatrixSeries normalizedMatrixSeries2 = (NormalizedMatrixSeries)normalizedMatrixSeries0.clone();
      normalizedMatrixSeries2.getItem(4);
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.equals("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries1.update(0, 0, (-439.94814));
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 10.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListener propertyChangeListener1 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListener propertyChangeListener2 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListener propertyChangeListener3 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 578, 8);
      normalizedMatrixSeries0.update(263, 0, 0);
      assertEquals(1.0, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 5060;
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.general.DatasetGroup", 5060, 0);
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 1.0;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.addPropertyChangeListener(propertyChangeListener0);
      doubleArray1[1] = (double) 5060;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = 1.0;
      doubleArray1[5] = (double) 5060;
      doubleArray1[6] = (double) 5060;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (double) 0;
      doubleArray2[2] = 1.0;
      doubleArray0[1] = doubleArray2;
      normalizedMatrixSeries0.data = doubleArray0;
      normalizedMatrixSeries0.getScaleFactor();
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.zeroAll();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("I+A", 7, 7);
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 7;
      doubleArray1[1] = 2584.616817323;
      doubleArray1[2] = (double) 7;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 916.8302242933364;
      doubleArray2[1] = 1.0;
      doubleArray2[2] = (double) 7;
      doubleArray2[3] = 2584.616817323;
      doubleArray2[4] = 2584.616817323;
      doubleArray2[5] = 1.0;
      doubleArray2[6] = (double) 7;
      doubleArray2[7] = 1.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[0] = (double) 7;
      doubleArray3[1] = 916.8302242933364;
      doubleArray3[2] = 1.0;
      doubleArray3[3] = (double) 7;
      doubleArray3[4] = 1.0;
      doubleArray3[5] = 916.8302242933364;
      doubleArray3[6] = 916.8302242933364;
      doubleArray3[7] = (double) 7;
      doubleArray0[2] = doubleArray3;
      normalizedMatrixSeries0.data = doubleArray0;
      normalizedMatrixSeries0.setNotify(false);
      normalizedMatrixSeries0.equals("I+A");
      normalizedMatrixSeries0.getItem(7);
      normalizedMatrixSeries0.equals("I+A");
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.setScaleFactor(2255.95);
      assertEquals(2255.95, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      Object object0 = normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.equals(object0);
      int int0 = 0;
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setDescription("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      double double0 = 0.0;
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.setScaleFactor(0.0);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.equals("org.jfree.data.xy.NormalizedMatrixSeries");
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.getScaleFactor();
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 10.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 4887, 0);
      normalizedMatrixSeries0.setScaleFactor(4887);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removePropertyChangeListener(propertyChangeListener0);
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeVetoableChangeListener(vetoableChangeListener0);
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeChangeListener(seriesChangeListener0);
      normalizedMatrixSeries0.setNotify(false);
      SeriesChangeListener seriesChangeListener1 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.isEmpty();
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener1);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(0, 0, 747.7255673322);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 1;
      int int1 = 0;
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("mCn[ddW@[ma\"A|(}h0:", 1, 0);
      normalizedMatrixSeries0.isEmpty();
      int int2 = 10;
      int int3 = 0;
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.update(10, 0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("W]?3Ac|S3aeuNV", 1409, 1);
      double double0 = 0.0;
      normalizedMatrixSeries0.setScaleFactor(0.0);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.removeChangeListener(seriesChangeListener0);
      normalizedMatrixSeries0.addPropertyChangeListener(propertyChangeListener0);
      normalizedMatrixSeries0.setScaleFactor(1);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.getItem(1);
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.setKey("W]?3Ac|S3aeuNV");
      int int0 = 2778;
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.getItem(2778);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2778
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "\"Cbpe\\";
      int int0 = 6;
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("\"Cbpe", 6, 553);
      normalizedMatrixSeries0.setKey("\"Cbpe");
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      normalizedMatrixSeries0.zeroAll();
      int int1 = 0;
      normalizedMatrixSeries0.getItem(0);
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setDescription("\"Cbpe");
      normalizedMatrixSeries0.setScaleFactor(553);
      normalizedMatrixSeries0.setKey("\"Cbpe");
      // Undeclared exception!
      normalizedMatrixSeries0.zeroAll();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "";
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 4298, 0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setKey(comparable0);
      normalizedMatrixSeries0.setScaleFactor(0.0);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.isEmpty();
      normalizedMatrixSeries0.removePropertyChangeListener(propertyChangeListener0);
      normalizedMatrixSeries0.getScaleFactor();
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.getItem(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 1, 0);
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.data = null;
      normalizedMatrixSeries0.data = null;
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.setScaleFactor(1);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.getScaleFactor();
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.getItem(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("nz@$w@f@*AB8h,[Ox", 1, 0);
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      normalizedMatrixSeries0.setScaleFactor((-1489.74410339));
      normalizedMatrixSeries0.addChangeListener(seriesChangeListener0);
      normalizedMatrixSeries0.setNotify(true);
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.zeroAll();
      normalizedMatrixSeries0.setNotify(true);
      normalizedMatrixSeries0.setScaleFactor((-2864.812746650329));
      int int1 = (-1);
      // Undeclared exception!
      try { 
        normalizedMatrixSeries0.getItem((-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = null;
      try {
        normalizedMatrixSeries0 = new NormalizedMatrixSeries((String) null, 1984, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("R/Etv=_26sS/7>}*p", 93, 93);
      Number number0 = normalizedMatrixSeries0.getItem(93);
      assertEquals(0.0, number0);
      
      double double0 = normalizedMatrixSeries0.getScaleFactor();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = null;
      try {
        normalizedMatrixSeries0 = new NormalizedMatrixSeries("/7FUy`.4u,S0k^raf()", 5485, (-97));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.MatrixSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 2000;
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("{]+1_Nvgb1", 2000, 2000);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "org.jfree.data.xy.NormalizedMatrixSeries";
      int int0 = 1416;
      NormalizedMatrixSeries normalizedMatrixSeries0 = null;
      try {
        normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 0, 1416);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("date", 91, 91);
      normalizedMatrixSeries0.clone();
      normalizedMatrixSeries0.isEmpty();
      normalizedMatrixSeries0.setScaleFactor(91);
      assertEquals(91.0, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("i 'e};;(d[|?o)E8~.", 1, 1);
      normalizedMatrixSeries0.zeroAll();
      assertEquals(1.0, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = null;
      try {
        normalizedMatrixSeries0 = new NormalizedMatrixSeries("", 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NormalizedMatrixSeries normalizedMatrixSeries0 = new NormalizedMatrixSeries("org.jfree.data.xy.NormalizedMatrixSeries", 10, 10);
      normalizedMatrixSeries0.getItem(4);
      normalizedMatrixSeries0.setScaleFactor(10);
      normalizedMatrixSeries0.getScaleFactor();
      normalizedMatrixSeries0.update(4, 4, 1.0);
      assertEquals(10.0, normalizedMatrixSeries0.getScaleFactor(), 0.01);
  }
}