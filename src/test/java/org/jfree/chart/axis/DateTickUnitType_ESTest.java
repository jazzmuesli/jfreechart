/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:02:46 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.DateTickUnitType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTickUnitType_ESTest extends DateTickUnitType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.DAY;
      DateTickUnitType dateTickUnitType1 = DateTickUnitType.MONTH;
      boolean boolean0 = dateTickUnitType0.equals(dateTickUnitType1);
      assertFalse(dateTickUnitType1.equals((Object)dateTickUnitType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.MILLISECOND;
      DateTickUnitType dateTickUnitType1 = DateTickUnitType.YEAR;
      boolean boolean0 = dateTickUnitType0.equals(dateTickUnitType1);
      assertFalse(dateTickUnitType1.equals((Object)dateTickUnitType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.MILLISECOND;
      boolean boolean0 = dateTickUnitType0.equals(dateTickUnitType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.MILLISECOND;
      boolean boolean0 = dateTickUnitType0.equals("DateTickUnitType.MILLISECOND");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.MILLISECOND;
      int int0 = dateTickUnitType0.getCalendarField();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.MILLISECOND;
      String string0 = dateTickUnitType0.toString();
      assertEquals("DateTickUnitType.MILLISECOND", string0);
  }
}
