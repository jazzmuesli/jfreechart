/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:08:56 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.PlotOrientation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CrosshairState_ESTest extends CrosshairState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setDatasetIndex(1);
      int int0 = crosshairState0.getDatasetIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(false);
      crosshairState0.setDatasetIndex((-1));
      int int0 = crosshairState0.getDatasetIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setCrosshairY(1745.7575);
      double double0 = crosshairState0.getCrosshairY();
      assertEquals(1745.7575, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setCrosshairY((-1.0));
      double double0 = crosshairState0.getCrosshairY();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setCrosshairX(841.28499223322);
      double double0 = crosshairState0.getCrosshairX();
      assertEquals(841.28499223322, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(false);
      crosshairState0.setCrosshairX((-827.6));
      double double0 = crosshairState0.getCrosshairX();
      assertEquals((-827.6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setCrosshairDistance(2963);
      double double0 = crosshairState0.getCrosshairDistance();
      assertEquals(2963.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(true);
      crosshairState0.setCrosshairDistance((-656.20029166349));
      double double0 = crosshairState0.getCrosshairDistance();
      assertEquals((-656.20029166349), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(true);
      crosshairState0.setAnchorY(1.0);
      double double0 = crosshairState0.getAnchorY();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setAnchorY((-111.6599136));
      double double0 = crosshairState0.getAnchorY();
      assertEquals((-111.6599136), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(true);
      crosshairState0.setAnchorX(788.5);
      double double0 = crosshairState0.getAnchorX();
      assertEquals(788.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setAnchorX((-3847.38945258244));
      double double0 = crosshairState0.getAnchorX();
      assertEquals((-3847.38945258244), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(false);
      crosshairState0.updateCrosshairY(0, (-1.3528372264170803), 0);
      assertEquals(0.0, crosshairState0.getAnchorY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(false);
      crosshairState0.updateCrosshairX((-1.3528372264170803), (-1.3528372264170803), 0);
      assertEquals(0.0, crosshairState0.getAnchorX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      crosshairState0.updateCrosshairPoint(2455.0, (-1), (-1), (-1), 2455.0, plotOrientation0);
      assertEquals(0.0, crosshairState0.getCrosshairDistance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      double double0 = crosshairState0.getCrosshairDistance();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      Point2D point2D0 = crosshairState0.getAnchor();
      assertNull(point2D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      double double0 = crosshairState0.getAnchorX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      double double0 = crosshairState0.getAnchorY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(false);
      double double0 = crosshairState0.getCrosshairX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      double double0 = crosshairState0.getCrosshairY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState(false);
      int int0 = crosshairState0.getDatasetIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CrosshairState crosshairState0 = new CrosshairState();
      crosshairState0.setAnchor((Point2D) null);
      assertEquals(0.0, crosshairState0.getAnchorX(), 0.01);
  }
}
