/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:30:45 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.DomainOrder;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.MatrixSeries;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.jfree.data.xy.XYBarDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractXYDataset_ESTest extends AbstractXYDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      DomainOrder domainOrder0 = defaultXYDataset0.getDomainOrder();
      assertEquals(DomainOrder.NONE, domainOrder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      // Undeclared exception!
      try { 
        defaultIntervalXYDataset0.getYValue((-1547), (-1547));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MatrixSeries matrixSeries0 = mock(MatrixSeries.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(matrixSeries0).getItemRow(anyInt());
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection(matrixSeries0);
      double double0 = matrixSeriesCollection0.getYValue(0, (-1350));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MatrixSeries matrixSeries0 = mock(MatrixSeries.class, new ViolatedAssumptionAnswer());
      doReturn(1313).when(matrixSeries0).getItemColumn(anyInt());
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection(matrixSeries0);
      XYBarDataset xYBarDataset0 = new XYBarDataset(matrixSeriesCollection0, 0.0);
      double double0 = xYBarDataset0.getEndXValue(0, (-20));
      assertEquals(1313.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      DomainOrder domainOrder0 = defaultTableXYDataset0.getDomainOrder();
      assertEquals(DomainOrder.NONE, domainOrder0);
  }
}
