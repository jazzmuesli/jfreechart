/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:38:21 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.Rotation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rotation_ESTest extends Rotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Rotation[] rotationArray0 = Rotation.values();
      assertEquals(2, rotationArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rotation rotation0 = Rotation.valueOf("ANTICLOCKWISE");
      assertEquals(1.0, rotation0.getFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Rotation rotation0 = Rotation.valueOf("CLOCKWISE");
      assertEquals(Rotation.CLOCKWISE, rotation0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Rotation rotation0 = Rotation.CLOCKWISE;
      double double0 = rotation0.getFactor();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Rotation rotation0 = Rotation.ANTICLOCKWISE;
      double double0 = rotation0.getFactor();
      assertEquals(1.0, double0, 0.01);
  }
}
