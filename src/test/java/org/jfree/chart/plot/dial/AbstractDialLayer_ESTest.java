/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:17:43 GMT 2019
 */

package org.jfree.chart.plot.dial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.awt.Paint;
import java.util.EventListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.plot.dial.ArcDialFrame;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialLayerChangeEvent;
import org.jfree.chart.plot.dial.DialLayerChangeListener;
import org.jfree.chart.plot.dial.DialPointer;
import org.jfree.chart.plot.dial.DialTextAnnotation;
import org.jfree.chart.plot.dial.DialValueIndicator;
import org.jfree.chart.plot.dial.StandardDialFrame;
import org.jfree.chart.plot.dial.StandardDialRange;
import org.jfree.chart.plot.dial.StandardDialScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractDialLayer_ESTest extends AbstractDialLayer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardDialScale standardDialScale0 = new StandardDialScale();
      DialLayerChangeListener dialLayerChangeListener0 = mock(DialLayerChangeListener.class, new ViolatedAssumptionAnswer());
      standardDialScale0.addChangeListener(dialLayerChangeListener0);
      DialLayerChangeListener dialLayerChangeListener1 = mock(DialLayerChangeListener.class, new ViolatedAssumptionAnswer());
      standardDialScale0.addChangeListener(dialLayerChangeListener1);
      standardDialScale0.setTickRadius(1834.26);
      assertTrue(standardDialScale0.isVisible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DialPointer.Pin dialPointer_Pin0 = new DialPointer.Pin((-2113));
      DialLayerChangeListener dialLayerChangeListener0 = mock(DialLayerChangeListener.class, new ViolatedAssumptionAnswer());
      dialPointer_Pin0.removeChangeListener(dialLayerChangeListener0);
      assertTrue(dialPointer_Pin0.isVisible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DialValueIndicator dialValueIndicator0 = new DialValueIndicator(23);
      dialValueIndicator0.notifyListeners((DialLayerChangeEvent) null);
      assertTrue(dialValueIndicator0.isVisible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardDialRange standardDialRange0 = new StandardDialRange();
      standardDialRange0.hashCode();
      assertTrue(standardDialRange0.isVisible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArcDialFrame arcDialFrame0 = new ArcDialFrame((-3808.173841173349), 3111.0);
      DialLayerChangeListener dialLayerChangeListener0 = mock(DialLayerChangeListener.class, new ViolatedAssumptionAnswer());
      arcDialFrame0.addChangeListener(dialLayerChangeListener0);
      assertTrue(arcDialFrame0.isVisible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DialValueIndicator dialValueIndicator0 = new DialValueIndicator(0);
      assertTrue(dialValueIndicator0.isVisible());
      
      dialValueIndicator0.setVisible(false);
      boolean boolean0 = dialValueIndicator0.isVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DialTextAnnotation dialTextAnnotation0 = new DialTextAnnotation("");
      EventListener eventListener0 = mock(EventListener.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = dialTextAnnotation0.hasListener(eventListener0);
      assertFalse(boolean0);
      assertTrue(dialTextAnnotation0.isVisible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DialPointer.Pin dialPointer_Pin0 = new DialPointer.Pin();
      Paint paint0 = dialPointer_Pin0.getPaint();
      DialBackground dialBackground0 = new DialBackground(paint0);
      dialBackground0.equals(dialPointer_Pin0);
      assertTrue(dialBackground0.isVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DialPointer.Pin dialPointer_Pin0 = new DialPointer.Pin();
      DialPointer.Pin dialPointer_Pin1 = (DialPointer.Pin)dialPointer_Pin0.clone();
      assertNotSame(dialPointer_Pin1, dialPointer_Pin0);
      assertTrue(dialPointer_Pin1.isVisible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardDialFrame standardDialFrame0 = new StandardDialFrame();
      StandardDialFrame standardDialFrame1 = (StandardDialFrame)standardDialFrame0.clone();
      boolean boolean0 = standardDialFrame0.equals(standardDialFrame1);
      assertTrue(boolean0);
      assertNotSame(standardDialFrame1, standardDialFrame0);
      assertTrue(standardDialFrame1.isVisible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardDialFrame standardDialFrame0 = new StandardDialFrame();
      StandardDialFrame standardDialFrame1 = (StandardDialFrame)standardDialFrame0.clone();
      standardDialFrame1.setVisible(false);
      boolean boolean0 = standardDialFrame0.equals(standardDialFrame1);
      assertFalse(standardDialFrame1.isVisible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DialValueIndicator dialValueIndicator0 = new DialValueIndicator(0);
      boolean boolean0 = dialValueIndicator0.isVisible();
      assertTrue(boolean0);
  }
}
