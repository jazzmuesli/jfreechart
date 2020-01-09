/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:14:18 GMT 2019
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.labels.StandardCrosshairLabelGenerator;
import org.jfree.chart.plot.Crosshair;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StandardCrosshairLabelGenerator_ESTest extends StandardCrosshairLabelGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("gkI.#1/fwqVd.aG)`>", numberFormat0);
      NumberFormat numberFormat1 = standardCrosshairLabelGenerator0.getNumberFormat();
      assertEquals(0, numberFormat1.getMaximumFractionDigits());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      decimalFormat0.applyLocalizedPattern("e@t%XJc9*378LSC!");
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("e@t%XJc9*378LSC!", decimalFormat0);
      DecimalFormat decimalFormat1 = (DecimalFormat)standardCrosshairLabelGenerator0.getNumberFormat();
      assertEquals("e@t%XJc9*378LSC!", decimalFormat1.getPositivePrefix());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("", numberFormat0);
      String string0 = standardCrosshairLabelGenerator0.getLabelTemplate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("", numberFormat0);
      Color color0 = Color.MAGENTA;
      BasicStroke basicStroke0 = new BasicStroke();
      Crosshair crosshair0 = new Crosshair((-1.7976931348623157E308), color0, basicStroke0);
      String string0 = standardCrosshairLabelGenerator0.generateLabel(crosshair0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      // Undeclared exception!
      try { 
        standardCrosshairLabelGenerator0.generateLabel((Crosshair) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.StandardCrosshairLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0);
      DecimalFormat decimalFormat0 = jSpinner_NumberEditor0.getFormat();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("+<+zm{^)`Q4zd[ Q", decimalFormat0);
      Crosshair crosshair0 = new Crosshair();
      // Undeclared exception!
      try { 
        standardCrosshairLabelGenerator0.generateLabel(crosshair0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("value");
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("bRazO]5s ", choiceFormat0);
      Crosshair crosshair0 = new Crosshair();
      // Undeclared exception!
      try { 
        standardCrosshairLabelGenerator0.generateLabel(crosshair0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      Locale locale0 = Locale.CANADA_FRENCH;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator1 = new StandardCrosshairLabelGenerator("{0}", numberFormat0);
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(standardCrosshairLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("TOP", numberFormat0);
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator1 = new StandardCrosshairLabelGenerator("", numberFormat0);
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(standardCrosshairLabelGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator1 = new StandardCrosshairLabelGenerator();
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(standardCrosshairLabelGenerator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(standardCrosshairLabelGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      Object object0 = new Object();
      boolean boolean0 = standardCrosshairLabelGenerator0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = null;
      try {
        standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("", (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'numberFormat' argument.
         //
         verifyException("org.jfree.chart.labels.StandardCrosshairLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = null;
      try {
        standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator((String) null, decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelTemplate' argument.
         //
         verifyException("org.jfree.chart.labels.StandardCrosshairLabelGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      NumberFormat numberFormat0 = standardCrosshairLabelGenerator0.getNumberFormat();
      assertEquals(3, numberFormat0.getMaximumFractionDigits());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      Crosshair crosshair0 = new Crosshair((-1365.648583495206));
      String string0 = standardCrosshairLabelGenerator0.generateLabel(crosshair0);
      assertEquals("-1,365.649", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator();
      standardCrosshairLabelGenerator0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      StandardCrosshairLabelGenerator standardCrosshairLabelGenerator0 = new StandardCrosshairLabelGenerator("DHJ", numberFormat0);
      String string0 = standardCrosshairLabelGenerator0.getLabelTemplate();
      assertEquals("DHJ", string0);
  }
}