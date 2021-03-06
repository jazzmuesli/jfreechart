/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:16:41 GMT 2019
 */

package org.jfree.chart.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.editor.DefaultPolarPlotEditor;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DefaultPolarPlotEditor_ESTest extends DefaultPolarPlotEditor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      defaultPolarPlotEditor0.createPlotTabs(polarPlot0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      // Undeclared exception!
      try { 
        defaultPolarPlotEditor0.updatePlotProperties((Plot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.editor.DefaultPlotEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(dateAxis0);
      // Undeclared exception!
      try { 
        defaultPolarPlotEditor0.updatePlotProperties(combinedRangeXYPlot0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.plot.CombinedRangeXYPlot cannot be cast to org.jfree.chart.plot.PolarPlot
         //
         verifyException("org.jfree.chart.editor.DefaultPolarPlotEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("_,>bqT%[0|x%5'");
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      PolarPlot polarPlot0 = new PolarPlot(defaultXYDataset0, logarithmicAxis0, defaultPolarItemRenderer0);
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      // Undeclared exception!
      try { 
        defaultPolarPlotEditor0.focusLost((FocusEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.editor.DefaultPolarPlotEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      ActionEvent actionEvent0 = new ActionEvent(polarPlot0, 10, (String) null, 10);
      // Undeclared exception!
      try { 
        defaultPolarPlotEditor0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolarPlot polarPlot0 = mock(PolarPlot.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(polarPlot0).getBackgroundPaint();
      doReturn((RectangleInsets) null).when(polarPlot0).getInsets();
      doReturn((Paint) null).when(polarPlot0).getOutlinePaint();
      doReturn((Stroke) null).when(polarPlot0).getOutlineStroke();
      doReturn(0.0).when(polarPlot0).getAngleOffset();
      doReturn((TickUnit) null).when(polarPlot0).getAngleTickUnit();
      doReturn((ValueAxis) null).when(polarPlot0).getAxis();
      doReturn((String) null).when(polarPlot0).getPlotType();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = null;
      try {
        defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.editor.DefaultPolarPlotEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      defaultPolarPlotEditor0.validateTickUnit();
      assertFalse(defaultPolarPlotEditor0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      ActionEvent actionEvent0 = new ActionEvent("JM83S;G%", 10, "JM83S;G%", (-2296));
      defaultPolarPlotEditor0.actionPerformed(actionEvent0);
      assertFalse(defaultPolarPlotEditor0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      FocusEvent focusEvent0 = new FocusEvent(defaultPolarPlotEditor0, 121);
      defaultPolarPlotEditor0.focusLost(focusEvent0);
      assertFalse(defaultPolarPlotEditor0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      FocusEvent focusEvent0 = new FocusEvent(defaultPolarPlotEditor0, 121);
      defaultPolarPlotEditor0.focusGained(focusEvent0);
      assertFalse(focusEvent0.isTemporary());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      defaultPolarPlotEditor0.updatePlotProperties(polarPlot0);
      assertEquals((-90.0), polarPlot0.getAngleOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolarPlot polarPlot0 = new PolarPlot();
      DefaultPolarPlotEditor defaultPolarPlotEditor0 = new DefaultPolarPlotEditor(polarPlot0);
      defaultPolarPlotEditor0.validateAngleOffset();
      assertFalse(defaultPolarPlotEditor0.isFocusTraversalPolicyProvider());
  }
}
