/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:08:43 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FixedMillisecond_ESTest extends FixedMillisecond_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      boolean boolean0 = fixedMillisecond0.equals(regularTimePeriod0);
      assertEquals(1392409281319L, regularTimePeriod0.getFirstMillisecond());
      assertFalse(regularTimePeriod0.equals((Object)fixedMillisecond0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      long long0 = fixedMillisecond0.getSerialIndex();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-9223372036854775808L));
      long long0 = fixedMillisecond0.getSerialIndex();
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1295L);
      Calendar calendar0 = MockCalendar.getInstance();
      long long0 = fixedMillisecond0.getMiddleMillisecond(calendar0);
      assertEquals(1295L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-9223372036854775808L));
      Calendar calendar0 = MockCalendar.getInstance();
      long long0 = fixedMillisecond0.getMiddleMillisecond(calendar0);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(823L);
      long long0 = fixedMillisecond0.getMiddleMillisecond();
      assertEquals(823L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-9223372036854775808L));
      long long0 = fixedMillisecond0.getMiddleMillisecond();
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(823L);
      Calendar calendar0 = MockCalendar.getInstance();
      long long0 = fixedMillisecond0.getLastMillisecond(calendar0);
      assertEquals(823L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1189L));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4827, "J;ITyhqay-8~7nckw");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      long long0 = fixedMillisecond0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals((-1189L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      long long0 = fixedMillisecond0.getLastMillisecond();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1189L));
      long long0 = fixedMillisecond0.getLastMillisecond();
      assertEquals((-1189L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(823L);
      Calendar calendar0 = MockCalendar.getInstance();
      long long0 = fixedMillisecond0.getFirstMillisecond(calendar0);
      assertEquals(823L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-4270L));
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      long long0 = fixedMillisecond0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals((-4270L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      long long0 = fixedMillisecond0.getFirstMillisecond();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-4270L));
      long long0 = fixedMillisecond0.getFirstMillisecond();
      assertEquals((-4270L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = null;
      try {
        fixedMillisecond0 = new FixedMillisecond((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.FixedMillisecond", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      int int0 = fixedMillisecond0.compareTo(week0);
      assertEquals(0, int0);
      assertEquals(1392409281320L, fixedMillisecond0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      assertNotNull(regularTimePeriod0);
      
      int int0 = ((FixedMillisecond) regularTimePeriod0).compareTo(fixedMillisecond0);
      assertEquals((-1), int0);
      assertEquals(1392409281319L, regularTimePeriod0.getMiddleMillisecond());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      int int0 = fixedMillisecond0.compareTo(fixedMillisecond0);
      assertEquals(0, int0);
      assertEquals(1392409281320L, fixedMillisecond0.getMiddleMillisecond());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.END;
      int int0 = fixedMillisecond0.compareTo(timePeriodAnchor0);
      assertEquals(1, int0);
      assertEquals(1392409281320L, fixedMillisecond0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      assertNotNull(regularTimePeriod0);
      
      boolean boolean0 = fixedMillisecond0.equals(regularTimePeriod0);
      assertEquals(1392409281321L, regularTimePeriod0.getFirstMillisecond());
      assertFalse(regularTimePeriod0.equals((Object)fixedMillisecond0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      boolean boolean0 = fixedMillisecond0.equals(fixedMillisecond0);
      assertTrue(boolean0);
      assertEquals(1392409281320L, fixedMillisecond0.getMiddleMillisecond());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-9223372036854775808L));
      Object object0 = new Object();
      boolean boolean0 = fixedMillisecond0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(9223372036854775807L);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      assertNull(regularTimePeriod0);
      assertEquals(9223372036854775807L, fixedMillisecond0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      assertNotNull(regularTimePeriod0);
      
      int int0 = fixedMillisecond0.compareTo(regularTimePeriod0);
      assertEquals((-1L), regularTimePeriod0.getSerialIndex());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-9223372036854775808L));
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      assertNull(regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      long long0 = fixedMillisecond0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      long long0 = fixedMillisecond0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      long long0 = fixedMillisecond0.getMiddleMillisecond((Calendar) mockGregorianCalendar0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      long long0 = fixedMillisecond0.getFirstMillisecond();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      long long0 = fixedMillisecond0.getLastMillisecond();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      fixedMillisecond0.hashCode();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      fixedMillisecond0.peg(mockGregorianCalendar0);
      assertEquals(0L, fixedMillisecond0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      long long0 = fixedMillisecond0.getSerialIndex();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      long long0 = fixedMillisecond0.getMiddleMillisecond();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Date date0 = fixedMillisecond0.getTime();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }
}
