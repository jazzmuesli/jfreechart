/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:13:41 GMT 2019
 */

package org.jfree.chart.urls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StandardXYURLGenerator_ESTest extends StandardXYURLGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator("index.html", "series", "index.html");
      boolean boolean0 = standardXYURLGenerator1.equals(standardXYURLGenerator0);
      assertFalse(boolean0);
      assertFalse(standardXYURLGenerator0.equals((Object)standardXYURLGenerator1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      String string0 = standardXYURLGenerator0.generateURL(xYDataset0, 10, (-3360));
      assertEquals("index.html?series=10&amp;item=-3360", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = null;
      try {
        standardXYURLGenerator0 = new StandardXYURLGenerator((String) null, "", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = null;
      try {
        standardXYURLGenerator0 = new StandardXYURLGenerator((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator();
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator("index.html", "series", "index.html");
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertFalse(boolean0);
      assertFalse(standardXYURLGenerator1.equals((Object)standardXYURLGenerator0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha");
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator("Sx!Pug-6I)&_ha");
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha");
      boolean boolean0 = standardXYURLGenerator0.equals("Sx!Pug-6I)&_ha");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha");
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator("Sx!Pug-6I)&_ha?Sx!Pug-6I)&_ha=2&amp;Sx!Pug-6I)&_ha=2");
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha", "Sx!Pug-6I)&_ha");
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      String string0 = standardXYURLGenerator0.generateURL(xYDataset0, 2, 2);
      assertEquals("Sx!Pug-6I)&_ha?Sx!Pug-6I)&_ha=2&amp;Sx!Pug-6I)&_ha=2", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("Sx!Pug-6I)&_ha?Sx!Pug-6I)&_ha=2&amp;Sx!Pug-6I)&_ha=2");
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      String string0 = standardXYURLGenerator0.generateURL(xYDataset0, 2, 2);
      assertEquals("Sx!Pug-6I)&_ha?Sx!Pug-6I)&_ha=2&amp;Sx!Pug-6I)&_ha=2&amp;series=2&amp;item=2", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator0);
      assertTrue(boolean0);
  }
}
