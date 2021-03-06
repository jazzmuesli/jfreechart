/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:02:09 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Dimension2D;
import java.awt.geom.Line2D;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PlotRenderingInfo_ESTest extends PlotRenderingInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      PlotRenderingInfo plotRenderingInfo1 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      ChartEntity chartEntity0 = new ChartEntity(rectangle0, "", "");
      chartEntity0.setToolTipText("");
      plotRenderingInfo1.setDataArea(rectangle0);
      chartEntity0.clone();
      StandardEntityCollection standardEntityCollection1 = new StandardEntityCollection();
      standardEntityCollection0.addAll(standardEntityCollection1);
      standardEntityCollection0.add(chartEntity0);
      chartRenderingInfo0.setEntityCollection(standardEntityCollection0);
      plotRenderingInfo0.equals(chartRenderingInfo0);
      polygon0.getBounds2D();
      Rectangle rectangle1 = new Rectangle((-694), (-748));
      plotRenderingInfo0.setPlotArea(rectangle1);
      chartRenderingInfo0.clear();
      chartRenderingInfo0.clone();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getSubplotCount();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo1.getDataArea();
      // Undeclared exception!
      try { 
        plotRenderingInfo1.getSubplotInfo(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Line2D.Double line2D_Double0 = new Line2D.Double((-1.0), 0.0, (-2112.2894), (-794.830818251));
      Rectangle rectangle0 = line2D_Double0.getBounds();
      plotRenderingInfo0.setDataArea(rectangle0);
      plotRenderingInfo0.getSubplotCount();
      plotRenderingInfo0.getDataArea();
      plotRenderingInfo0.getSubplotCount();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.equals(chartRenderingInfo0);
      Point2D.Float point2D_Float0 = new Point2D.Float();
      point2D_Float0.y = (-3157.0278F);
      point2D_Float0.clone();
      point2D_Float0.clone();
      plotRenderingInfo0.getSubplotIndex(point2D_Float0);
      point2D_Float0.clone();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1.0, 1.0, (-3157.0278F), 3773.7164);
      rectangle2D_Double0.setFrameFromDiagonal(1.0, 0.0, (double) (-3157.0278F), 0.0);
      rectangle2D_Double0.clone();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getFrame();
      plotRenderingInfo0.setDataArea(rectangle2D0);
      plotRenderingInfo0.clone();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getDataArea();
      plotRenderingInfo0.clone();
      plotRenderingInfo0.clone();
      plotRenderingInfo0.getSubplotIndex(point2D_Float0);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getSubplotCount();
      plotRenderingInfo0.getDataArea();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo(2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Point2D.Float point2D_Float0 = new Point2D.Float(0.0F, 0.0F);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      plotRenderingInfo0.setDataArea(rectangle2D_Double0);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.equals(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, (-1336.3479F), (-4275.844F));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1336.3479F), (-4275.844F), (-1336.3479F), (-1336.3479F));
      plotRenderingInfo0.setPlotArea(rectangle2D_Float0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.setDataArea(rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      plotRenderingInfo0.setPlotArea((Rectangle2D) null);
      plotRenderingInfo0.getOwner();
      plotRenderingInfo0.getOwner();
      plotRenderingInfo0.getSubplotCount();
      AffineTransform affineTransform0 = new AffineTransform(0, 0, 0, (-1.0), 0.0, 1.0);
      Point point0 = new Point(0, 0);
      Point point1 = new Point();
      Point2D point2D0 = affineTransform0.transform((Point2D) point0, (Point2D) point1);
      try { 
        affineTransform0.inverseTransform(point2D0, (Point2D) point1);
        fail("Expecting exception: NoninvertibleTransformException");
      
      } catch(NoninvertibleTransformException e) {
         //
         // Determinant is 0
         //
         verifyException("java.awt.geom.AffineTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      standardEntityCollection0.clone();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      standardEntityCollection0.getEntity(0.0, 1648.0971445924163);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, (-2026.84740090432), 0.0);
      chartRenderingInfo0.clear();
      rectangle2D_Double0.setRect(1648.0971445924163, 0.0, 1648.0971445924163, (-2026.84740090432));
      standardEntityCollection0.getEntity((-2026.84740090432), (-2026.84740090432));
      plotRenderingInfo0.setPlotArea(rectangle2D_Double0);
      plotRenderingInfo0.clone();
      ChartRenderingInfo chartRenderingInfo1 = plotRenderingInfo0.getOwner();
      plotRenderingInfo0.getPlotArea();
      PlotRenderingInfo plotRenderingInfo1 = new PlotRenderingInfo(chartRenderingInfo1);
      Object object0 = plotRenderingInfo0.clone();
      chartRenderingInfo1.equals(object0);
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      PlotRenderingInfo plotRenderingInfo2 = new PlotRenderingInfo(chartRenderingInfo1);
      plotRenderingInfo1.getPlotArea();
      PlotRenderingInfo plotRenderingInfo3 = (PlotRenderingInfo)plotRenderingInfo1.clone();
      plotRenderingInfo3.clone();
      PlotRenderingInfo plotRenderingInfo4 = chartRenderingInfo1.getPlotInfo();
      PlotRenderingInfo plotRenderingInfo5 = (PlotRenderingInfo)plotRenderingInfo0.clone();
      plotRenderingInfo4.equals(plotRenderingInfo5);
      plotRenderingInfo0.clone();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.clone();
      plotRenderingInfo1.addSubplotInfo(plotRenderingInfo4);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.addSubplotInfo((PlotRenderingInfo) null);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 1371.518412531601, 0.0);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(0.0);
      Point point0 = new Point();
      Point point1 = new Point(point0);
      point1.translate(0, (-2349));
      rectangle2D_Double0.setFrameFromCenter((-2480.31843854231), (-1.0), (double) 0, (-1.0));
      Point2D point2D0 = affineTransform0.transform((Point2D) point1, (Point2D) point1);
      Dimension dimension0 = new Dimension((-2349), (-959));
      rectangle2D_Double0.setFrame(point2D0, (Dimension2D) dimension0);
      plotRenderingInfo0.setDataArea(rectangle2D_Double0);
      plotRenderingInfo0.getDataArea();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      standardEntityCollection0.getEntity(0.0, 1648.0971445924163);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, (-2026.84740090432), 0.0);
      chartRenderingInfo0.clear();
      rectangle2D_Double0.setRect(1648.0971445924163, 0.0, 1648.0971445924163, (-2026.84740090432));
      standardEntityCollection0.getEntity((-2026.84740090432), (-2026.84740090432));
      plotRenderingInfo0.setPlotArea(rectangle2D_Double0);
      plotRenderingInfo0.clone();
      ChartRenderingInfo chartRenderingInfo1 = plotRenderingInfo0.getOwner();
      plotRenderingInfo0.getPlotArea();
      PlotRenderingInfo plotRenderingInfo1 = new PlotRenderingInfo(chartRenderingInfo1);
      Object object0 = new Object();
      chartRenderingInfo1.equals(object0);
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo1.clone();
      plotRenderingInfo1.getPlotArea();
      plotRenderingInfo1.clone();
      // Undeclared exception!
      try { 
        plotRenderingInfo1.getSubplotInfo(3058);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3058, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      PlotRenderingInfo plotRenderingInfo1 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo1.clone();
      plotRenderingInfo1.addSubplotInfo(plotRenderingInfo0);
      plotRenderingInfo1.addSubplotInfo(plotRenderingInfo0);
      plotRenderingInfo1.addSubplotInfo(plotRenderingInfo0);
      plotRenderingInfo1.getOwner();
      plotRenderingInfo1.getSubplotInfo(0);
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 0);
      plotRenderingInfo0.getSubplotIndex(point2D_Double0);
      plotRenderingInfo0.getSubplotCount();
      plotRenderingInfo1.getPlotArea();
      // Undeclared exception!
      try { 
        chartRenderingInfo0.setChartArea((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.Rectangle2D$Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      chartRenderingInfo0.setEntityCollection(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      int[] intArray0 = new int[3];
      intArray0[0] = 6;
      StandardEntityCollection standardEntityCollection1 = new StandardEntityCollection();
      chartRenderingInfo0.setEntityCollection(standardEntityCollection1);
      intArray0[1] = 1;
      intArray0[2] = 0;
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      rectangle0.setFrameFromDiagonal(0.0, 0.0, (double) 0, (double) 0);
      plotRenderingInfo0.setDataArea(rectangle0);
      plotRenderingInfo0.getOwner();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getPlotArea();
      Rectangle rectangle1 = new Rectangle(0, 0, (-1396), 0);
      rectangle1.add(1, 1);
      plotRenderingInfo0.setDataArea(rectangle1);
      plotRenderingInfo0.setPlotArea(rectangle1);
      Object object0 = new Object();
      plotRenderingInfo0.equals(object0);
      plotRenderingInfo0.equals((Object) null);
      plotRenderingInfo0.equals("`r]]Q5ky");
      Object object1 = new Object();
      plotRenderingInfo0.equals(object1);
      plotRenderingInfo0.getDataArea();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      int int0 = 0;
      PlotRenderingInfo plotRenderingInfo2 = plotRenderingInfo0.getSubplotInfo(0);
      plotRenderingInfo2.getOwner();
      plotRenderingInfo2.equals(chartRenderingInfo0);
      Rectangle2D rectangle2D0 = null;
      // Undeclared exception!
      try { 
        chartRenderingInfo0.setChartArea((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.Rectangle2D$Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      chartRenderingInfo0.equals(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.equals(standardEntityCollection0);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Point point0 = new Point(0, (-5261));
      rectangle0.setFrameFromDiagonal(0.0, 0.0, 0.0, 0.0);
      point0.setLocation((-2219.24), (-2851.527691));
      rectangle0.setLocation(point0);
      plotRenderingInfo0.setDataArea(rectangle0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(3953.1268721329425, (-1.0), (-1.0), 3953.1268721329425);
      Rectangle2D.union(rectangle0, rectangle2D_Double0, rectangle2D_Double0);
      Rectangle rectangle1 = rectangle2D_Double0.getBounds();
      rectangle1.x = (-2852);
      plotRenderingInfo0.setPlotArea(rectangle1);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getSubplotIndex(point0);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Point point0 = new Point();
      Point point1 = new Point(point0);
      Dimension dimension0 = new Dimension((-1), 0);
      Rectangle rectangle0 = new Rectangle(point1, dimension0);
      plotRenderingInfo0.setPlotArea(rectangle0);
      PlotRenderingInfo plotRenderingInfo1 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo1.getSubplotCount();
      plotRenderingInfo0.getSubplotCount();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, (-1310.6935F), (-4275.844F));
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      Rectangle2D rectangle2D1 = plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.setDataArea(rectangle2D1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1.0), 1815.163077, (-1.0), (-1836.2820150637));
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      Rectangle rectangle1 = new Rectangle(rectangle0);
      plotRenderingInfo0.setDataArea(rectangle1);
      plotRenderingInfo0.getDataArea();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      Point point0 = new Point();
      Rectangle rectangle0 = new Rectangle(point0);
      rectangle0.add(point0);
      Rectangle2D rectangle2D0 = rectangle0.getBounds2D();
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      plotRenderingInfo0.clone();
      plotRenderingInfo0.getSubplotCount();
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getDataArea();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      chartRenderingInfo0.clear();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.getSubplotCount();
      chartRenderingInfo0.equals(plotRenderingInfo0);
      plotRenderingInfo0.addSubplotInfo((PlotRenderingInfo) null);
      Point2D.Float point2D_Float0 = new Point2D.Float();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotIndex(point2D_Float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PlotRenderingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      StandardEntityCollection standardEntityCollection1 = new StandardEntityCollection();
      standardEntityCollection0.addAll(standardEntityCollection1);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 1.0F, 430.822F, 0.0F);
      Rectangle rectangle0 = new Rectangle((-2206), (-1509));
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createIntersection(rectangle0);
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      plotRenderingInfo0.setPlotArea(rectangle2D_Float0);
      chartRenderingInfo0.equals((Object) null);
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 0.0);
      point2D_Double0.x = (double) 430.822F;
      plotRenderingInfo0.getSubplotIndex(point2D_Double0);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getSubplotIndex(point2D_Double0);
      plotRenderingInfo0.getSubplotIndex(point2D_Double0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Point2D.Float point2D_Float0 = new Point2D.Float(0.0F, 0.0F);
      plotRenderingInfo0.getSubplotIndex(point2D_Float0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      plotRenderingInfo0.setDataArea(rectangle2D_Double0);
      plotRenderingInfo0.getPlotArea();
      Object object0 = plotRenderingInfo0.clone();
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.clone();
      PlotRenderingInfo plotRenderingInfo1 = new PlotRenderingInfo(chartRenderingInfo0);
      Point point0 = new Point(0, (-1407));
      point0.clone();
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      plotRenderingInfo1.setPlotArea(rectangle2D0);
      plotRenderingInfo1.getSubplotIndex(point0);
      plotRenderingInfo1.clone();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo1.addSubplotInfo(plotRenderingInfo0);
      Rectangle2D rectangle2D1 = plotRenderingInfo1.getDataArea();
      plotRenderingInfo0.setPlotArea(rectangle2D1);
      plotRenderingInfo1.getDataArea();
      plotRenderingInfo1.getSubplotIndex(point0);
      plotRenderingInfo1.getPlotArea();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.addSubplotInfo((PlotRenderingInfo) null);
      Point2D.Double point2D_Double0 = new Point2D.Double((-1745.279), 1417.2888959113);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotIndex(point2D_Double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PlotRenderingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Rectangle2D rectangle2D0 = null;
      plotRenderingInfo0.addSubplotInfo((PlotRenderingInfo) null);
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PlotRenderingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      ChartRenderingInfo chartRenderingInfo1 = new ChartRenderingInfo();
      chartRenderingInfo0.clone();
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo1.getPlotInfo();
      chartRenderingInfo0.clear();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo0.clone();
      Point point0 = new Point(1, 1);
      Point point1 = new Point(point0);
      point1.setLocation((double) 1, (double) 1);
      plotRenderingInfo1.getSubplotIndex(point1);
      plotRenderingInfo0.getSubplotCount();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 1637.0276F, 0.0F, 0.0F);
      chartRenderingInfo0.equals(rectangle2D_Float0);
      standardEntityCollection0.equals(chartRenderingInfo0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.equals(standardEntityCollection0);
      plotRenderingInfo0.getOwner();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 1.0, 1.0, 1.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      plotRenderingInfo0.setDataArea(rectangle0);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.setPlotArea((Rectangle2D) null);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotIndex((Point2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'source' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo1 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo1.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo0.setDataArea(rectangle2D0);
      plotRenderingInfo0.getOwner();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      Object object0 = new Object();
      chartRenderingInfo0.equals(object0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.clone();
      Point2D.Float point2D_Float0 = new Point2D.Float();
      plotRenderingInfo0.getSubplotIndex(point2D_Float0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2827.6011302, (-100.5), (-100.5), (-112.3));
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      rectangle2D_Double0.intersects(rectangle2D0);
      chartRenderingInfo0.equals(rectangle2D_Double0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.getDataArea();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.getSubplotCount();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo((-697));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      chartRenderingInfo0.clone();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      standardEntityCollection0.equals("");
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo(1752);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1752, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      plotRenderingInfo0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.setPlotArea((Rectangle2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.getPlotArea();
      Point2D.Float point2D_Float0 = new Point2D.Float(1.0F, 1.0F);
      plotRenderingInfo0.getSubplotIndex(point2D_Float0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Object object0 = plotRenderingInfo0.clone();
      standardEntityCollection0.getEntity(0.0, 0.0);
      plotRenderingInfo0.equals(object0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 197.0, 0.0);
      plotRenderingInfo0.setDataArea(rectangle2D_Double0);
      plotRenderingInfo0.getDataArea();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo0.equals(standardEntityCollection0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.setFrame((-1378.8), 0.0, 0.0, (-1378.8));
      rectangle2D_Double0.setFrameFromCenter(0.0, 3344.646118652, 0.0, 3344.646118652);
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getFrame();
      chartRenderingInfo0.clone();
      plotRenderingInfo0.setDataArea(rectangle2D0);
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      PlotRenderingInfo plotRenderingInfo1 = new PlotRenderingInfo(chartRenderingInfo0);
      plotRenderingInfo1.setDataArea(rectangle2D0);
      plotRenderingInfo1.setDataArea(rectangle2D_Double0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      plotRenderingInfo0.equals(rectangle2D_Float0);
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo0.getDataArea();
      plotRenderingInfo0.getOwner();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      plotRenderingInfo0.clone();
      plotRenderingInfo1.addSubplotInfo(plotRenderingInfo0);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo1.getPlotArea();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo0.getPlotInfo();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo1);
      chartRenderingInfo0.equals(plotRenderingInfo0);
      Polygon polygon0 = new Polygon();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      chartRenderingInfo0.clear();
      point2D_Double0.x = 0.0;
      point2D_Double0.y = 0.0;
      plotRenderingInfo0.getSubplotIndex(point2D_Double0);
      point2D_Double0.clone();
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      plotRenderingInfo0.getSubplotIndex(point2D_Double0);
      chartRenderingInfo0.setChartArea(rectangle2D0);
      plotRenderingInfo0.getSubplotCount();
      plotRenderingInfo0.getOwner();
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      plotRenderingInfo0.setPlotArea(rectangle2D0);
      plotRenderingInfo1.getSubplotCount();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Object object0 = plotRenderingInfo0.clone();
      chartRenderingInfo0.equals(object0);
      plotRenderingInfo0.getPlotArea();
      plotRenderingInfo0.getDataArea();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      PlotRenderingInfo plotRenderingInfo1 = (PlotRenderingInfo)plotRenderingInfo0.clone();
      PlotRenderingInfo plotRenderingInfo2 = new PlotRenderingInfo(chartRenderingInfo0);
      assertTrue(plotRenderingInfo2.equals((Object)plotRenderingInfo1));
      
      Point point0 = new Point(0, (-1407));
      point0.clone();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)chartRenderingInfo0.getChartArea();
      plotRenderingInfo2.setPlotArea(rectangle2D_Double0);
      plotRenderingInfo2.getSubplotIndex(point0);
      PlotRenderingInfo plotRenderingInfo3 = (PlotRenderingInfo)plotRenderingInfo1.clone();
      boolean boolean0 = plotRenderingInfo2.equals(plotRenderingInfo3);
      assertFalse(boolean0);
      
      plotRenderingInfo2.clone();
      plotRenderingInfo0.addSubplotInfo(plotRenderingInfo2);
      plotRenderingInfo2.addSubplotInfo(plotRenderingInfo0);
      plotRenderingInfo0.equals(plotRenderingInfo1);
      Rectangle2D.Double rectangle2D_Double1 = (Rectangle2D.Double)plotRenderingInfo2.getDataArea();
      plotRenderingInfo0.setPlotArea(rectangle2D_Double1);
      plotRenderingInfo2.getDataArea();
      plotRenderingInfo2.getSubplotIndex(point0);
      plotRenderingInfo2.getPlotArea();
      assertFalse(plotRenderingInfo2.equals((Object)plotRenderingInfo1));
  }
}
