/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:27:10 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.DateTick;
import org.jfree.chart.axis.TickType;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTick_ESTest extends DateTick_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TickType tickType0 = TickType.MAJOR;
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = null;
      try {
        dateTick0 = new DateTick(tickType0, (Date) null, "", textAnchor0, textAnchor0, 3987.534775);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.DateTick", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TickType tickType0 = TickType.MINOR;
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(date0).getTime();
      doReturn((String) null).when(date0).toString();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = new DateTick(tickType0, date0, ".P,c'wK>n{m[", textAnchor0, textAnchor0, (-3748.33628707));
      Date date1 = dateTick0.getDate();
      DateTick dateTick1 = null;
      try {
        dateTick1 = new DateTick(tickType0, date1, ".P,c'wK>n{m[", (TextAnchor) null, (TextAnchor) null, 1975.5738321);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'textAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = null;
      try {
        dateTick0 = new DateTick((Date) null, "org.jfree.chart.axis.DateTick", textAnchor0, textAnchor0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.DateTick", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(date0).getTime();
      DateTick dateTick0 = null;
      try {
        dateTick0 = new DateTick(date0, "w(ZVs", (TextAnchor) null, (TextAnchor) null, 996.88739356904);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'textAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TickType tickType0 = TickType.MINOR;
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(3373L).when(date0).getTime();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = new DateTick(tickType0, date0, "7yZc@Iuthe<T;i@e+%", textAnchor0, textAnchor0, (-2426.6165608072));
      Object object0 = dateTick0.clone();
      boolean boolean0 = dateTick0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TickType tickType0 = TickType.MINOR;
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(3373L).when(date0).getTime();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = new DateTick(tickType0, date0, "7yZc@Iuthe<T;i@e+%", textAnchor0, textAnchor0, (-2426.6165608072));
      boolean boolean0 = dateTick0.equals(tickType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TickType tickType0 = TickType.MINOR;
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(3373L).when(date0).getTime();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = new DateTick(tickType0, date0, "7yZc@Iuthe<T;i@e+%", textAnchor0, textAnchor0, (-2426.6165608072));
      boolean boolean0 = dateTick0.equals(dateTick0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(date0).getTime();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = new DateTick(date0, "org.jfree.chart.axis.DateTick", textAnchor0, textAnchor0, 1.0);
      TickType tickType0 = TickType.MINOR;
      Date date1 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(date1).getTime();
      TextAnchor textAnchor1 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick1 = new DateTick(tickType0, date1, "org.jfree.chart.axis.DateTick", textAnchor1, textAnchor1, 1.0);
      boolean boolean0 = dateTick0.equals(dateTick1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(date0).getTime();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      DateTick dateTick0 = new DateTick(date0, "org.jfree.chart.axis.DateTick", textAnchor0, textAnchor0, 1.0);
      dateTick0.hashCode();
  }
}