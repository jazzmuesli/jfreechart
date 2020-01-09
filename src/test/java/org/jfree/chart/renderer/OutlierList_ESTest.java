/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:30:08 GMT 2019
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.renderer.Outlier;
import org.jfree.chart.renderer.OutlierList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class OutlierList_ESTest extends OutlierList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn((Point2D) null).when(outlier0).getPoint();
      doReturn((String) null).when(outlier0).toString();
      OutlierList outlierList0 = new OutlierList(outlier0);
      Outlier outlier1 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn(1063.2197955).when(outlier1).getX();
      doReturn(1063.2197955).when(outlier1).getY();
      outlierList0.add(outlier1);
      // Undeclared exception!
      try { 
        outlierList0.updateAveragedOutlier();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.OutlierList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn(point2D0).when(outlier0).getPoint();
      doReturn(0.0).when(outlier0).getX();
      doReturn(0.0).when(outlier0).getY();
      doReturn("96Ov>.0", (String) null).when(outlier0).toString();
      OutlierList outlierList0 = new OutlierList(outlier0);
      Outlier outlier1 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(outlier1).getX();
      doReturn((-1.0)).when(outlier1).getY();
      outlierList0.add(outlier1);
      Outlier outlier2 = outlierList0.getAveragedOutlier();
      outlierList0.add(outlier2);
      outlierList0.updateAveragedOutlier();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(outlier0).toString();
      OutlierList outlierList0 = new OutlierList(outlier0);
      Outlier outlier1 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(outlier1).overlaps(any(org.jfree.chart.renderer.Outlier.class));
      outlierList0.isOverlapped(outlier1);
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutlierList outlierList0 = new OutlierList((Outlier) null);
      assertFalse(outlierList0.isMultiple());
      
      outlierList0.setMultiple(true);
      boolean boolean0 = outlierList0.isMultiple();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutlierList outlierList0 = new OutlierList((Outlier) null);
      outlierList0.getAveragedOutlier();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn("96Ov>.0").when(outlier0).toString();
      OutlierList outlierList0 = new OutlierList(outlier0);
      Outlier outlier1 = outlierList0.getAveragedOutlier();
      outlierList0.setAveragedOutlier(outlier1);
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.getItemCount();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutlierList outlierList0 = new OutlierList((Outlier) null);
      boolean boolean0 = outlierList0.isOverlapped((Outlier) null);
      assertFalse(outlierList0.isMultiple());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      OutlierList outlierList0 = new OutlierList(outlier0);
      Outlier outlier1 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      outlierList0.add(outlier1);
      outlierList0.getItemCount();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      doReturn(point2D0).when(outlier0).getPoint();
      doReturn("96Ov>.0").when(outlier0).toString();
      OutlierList outlierList0 = new OutlierList(outlier0);
      outlierList0.updateAveragedOutlier();
      assertFalse(outlierList0.isMultiple());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Outlier outlier0 = mock(Outlier.class, new ViolatedAssumptionAnswer());
      OutlierList outlierList0 = new OutlierList(outlier0);
      boolean boolean0 = outlierList0.isMultiple();
      assertFalse(boolean0);
  }
}
