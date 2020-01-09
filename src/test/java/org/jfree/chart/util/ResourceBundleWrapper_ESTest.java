/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:26:31 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;
import java.util.Locale;
import java.util.MissingResourceException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jfree.chart.util.ResourceBundleWrapper;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ResourceBundleWrapper_ESTest extends ResourceBundleWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ResourceBundleWrapper.getBundle("O=soC", (Locale) null, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URL[] uRLArray0 = new URL[1];
      uRLArray0[0] = uRL0;
      URLClassLoader uRLClassLoader0 = new URLClassLoader(uRLArray0);
      ResourceBundleWrapper.removeCodeBase(uRL0, uRLClassLoader0);
      // Undeclared exception!
      try { 
        ResourceBundleWrapper.getBundle("N gRURY`jp!altrj#0R", (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        ResourceBundleWrapper.getBundle("?XgoXt;[kX(B", locale0);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name ?XgoXt;[kX(B, locale zh_CN
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("In~C%<`&", "In~C%<`&", 2941, "In~C%<`&", uRLStreamHandler0);
      URL[] uRLArray0 = new URL[4];
      uRLArray0[1] = uRL0;
      uRLArray0[2] = uRL0;
      uRLArray0[3] = uRL0;
      uRLArray0[0] = uRL0;
      URLClassLoader uRLClassLoader0 = URLClassLoader.newInstance(uRLArray0);
      ResourceBundleWrapper.removeCodeBase(uRL0, uRLClassLoader0);
      // Undeclared exception!
      try { 
        ResourceBundleWrapper.getBundle((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceBundleWrapper.getBundle("");
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name , locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("In~C%<`&", "In~C%<`&", 2941, "In~C%<`&", uRLStreamHandler0);
      URL[] uRLArray0 = new URL[4];
      uRLArray0[0] = uRL0;
      URLClassLoader uRLClassLoader0 = URLClassLoader.newInstance(uRLArray0);
      // Undeclared exception!
      try { 
        ResourceBundleWrapper.removeCodeBase(uRL0, uRLClassLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        ResourceBundleWrapper.getBundle("`t`D5uW`y", locale0, classLoader0);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name `t`D5uW`y, locale en_CA
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }
}
