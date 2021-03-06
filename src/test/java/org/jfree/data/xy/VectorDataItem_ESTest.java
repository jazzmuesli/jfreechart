/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:31:34 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.Vector;
import org.jfree.data.xy.VectorDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class VectorDataItem_ESTest extends VectorDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1366.0, 0.0, 0.0, 0.0);
      double double0 = vectorDataItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(0.0, (-1.0), (-1.0), (-1.0));
      double double0 = vectorDataItem0.getYValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(0.0, 1958.6, 1958.6, 1958.6);
      double double0 = vectorDataItem0.getXValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-351.5), (-1.0), (-1.0), (-351.5));
      double double0 = vectorDataItem0.getXValue();
      assertEquals((-351.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-1.0), 1237.0, 1237.0, 0.0);
      double double0 = vectorDataItem0.getVectorY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-5688.5), (-5688.5), (-1023.0572), (-5688.5));
      double double0 = vectorDataItem0.getVectorY();
      assertEquals((-5688.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1366.0, 0.0, 0.0, 0.0);
      double double0 = vectorDataItem0.getVectorX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(0.0, (-1.0), (-1.0), (-1.0));
      double double0 = vectorDataItem0.getVectorX();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(600.01974809764, (-1.0), (-1.0), 600.01974809764);
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals(1.5724629370644871, vector0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(1366.0, 0.0, 0.0, 0.0);
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals(0.0, vector0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem((-1.0), (-1.0), 0.0, (-1.0));
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals(1.0, vector0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(27.279832565724703, 27.279832565724703, 27.279832565724703, 27.279832565724703);
      double double0 = vectorDataItem0.getVectorY();
      assertEquals(27.279832565724703, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(27.279832565724703, 27.279832565724703, 27.279832565724703, 27.279832565724703);
      double double0 = vectorDataItem0.getVectorX();
      assertEquals(27.279832565724703, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(27.279832565724703, 27.279832565724703, 27.279832565724703, 27.279832565724703);
      double double0 = vectorDataItem0.getXValue();
      assertEquals(27.279832565724703, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(27.279832565724703, 27.279832565724703, 27.279832565724703, 27.279832565724703);
      double double0 = vectorDataItem0.getYValue();
      assertEquals(27.279832565724703, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VectorDataItem vectorDataItem0 = new VectorDataItem(27.279832565724703, 27.279832565724703, 27.279832565724703, 27.279832565724703);
      Vector vector0 = vectorDataItem0.getVector();
      assertEquals(38.579509193715104, vector0.getLength(), 0.01);
  }
}
