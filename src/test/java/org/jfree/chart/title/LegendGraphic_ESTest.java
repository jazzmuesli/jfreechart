/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:17:38 GMT 2019
 */

package org.jfree.chart.title;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.swing.MockDefaultListSelectionModel;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.title.LegendGraphic;
import org.jfree.chart.ui.GradientPaintTransformer;
import org.jfree.chart.ui.LengthAdjustmentType;
import org.jfree.chart.ui.RectangleAnchor;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.chart.util.UnitType;
import org.jfree.data.Range;
import org.jfree.data.time.TimeSeriesTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LegendGraphic_ESTest extends LegendGraphic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, (-435.24F), 0.0F, 0.0F);
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D_Float0, systemColor0);
      GradientPaintTransformer gradientPaintTransformer0 = legendGraphic0.getFillPaintTransformer();
      legendGraphic0.setFillPaintTransformer(gradientPaintTransformer0);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D0 = rectangleInsets0.createAdjustedRectangle(rectangle2D_Float0, lengthAdjustmentType0, lengthAdjustmentType0);
      MockDefaultListSelectionModel mockDefaultListSelectionModel0 = new MockDefaultListSelectionModel();
      JTable jTable0 = new JTable((TableModel) null, (TableColumnModel) null, mockDefaultListSelectionModel0);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.setLineVisible(true);
      boolean boolean0 = legendGraphic0.isLineVisible();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setLinePaint(systemColor0);
      legendGraphic0.getLinePaint();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JTable jTable0 = new JTable(615, 999);
      Rectangle rectangle0 = jTable0.getCellRect(999, (-2573), true);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setLine(rectangle0);
      legendGraphic0.getLine();
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D0 = rectangleInsets0.createAdjustedRectangle(rectangle2D_Float0, lengthAdjustmentType0, lengthAdjustmentType0);
      MockDefaultListSelectionModel mockDefaultListSelectionModel0 = new MockDefaultListSelectionModel();
      JTable jTable0 = new JTable((TableModel) null, (TableColumnModel) null, mockDefaultListSelectionModel0);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.arrangeNN((Graphics2D) null);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      UnitType unitType0 = UnitType.RELATIVE;
      RectangleInsets rectangleInsets0 = new RectangleInsets(unitType0, 527, 0, (-3826.2734462686), 252);
      legendGraphic0.setMargin(rectangleInsets0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(252, 1293);
      legendGraphic0.arrange((Graphics2D) null, rectangleConstraint0);
      assertEquals(529.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setBorder((-3826.2734462686), (-986.406084369634), 252, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.5, 0);
      legendGraphic0.arrange((Graphics2D) null, rectangleConstraint0);
      assertEquals((-984.406084369634), legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      UnitType unitType0 = UnitType.RELATIVE;
      RectangleInsets rectangleInsets0 = new RectangleInsets(unitType0, 510, 0, 0, 0.5);
      legendGraphic0.setMargin(rectangleInsets0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      legendGraphic0.arrange((Graphics2D) null, rectangleConstraint0);
      assertEquals(512.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      // Undeclared exception!
      try { 
        legendGraphic0.setShapeLocation((RectangleAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'location' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable((TableModel) null, defaultTableColumnModel0);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      RectangleInsets rectangleInsets0 = new RectangleInsets();
      Rectangle2D rectangle2D0 = rectangleInsets0.createOutsetRectangle((Rectangle2D) rectangle0, true, true);
      // Undeclared exception!
      try { 
        legendGraphic0.draw((Graphics2D) null, rectangle2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      // Undeclared exception!
      try { 
        legendGraphic0.arrange((Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      LegendGraphic legendGraphic0 = null;
      try {
        legendGraphic0 = new LegendGraphic(rectangle0, (Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'fillPaint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      boolean boolean0 = legendGraphic0.equals("q0t5{6hqIsO");
      assertFalse(boolean0);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.5, (Range) null);
      // Undeclared exception!
      try { 
        legendGraphic0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toFixedWidth(0);
      // Undeclared exception!
      try { 
        legendGraphic0.arrange((Graphics2D) null, rectangleConstraint1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((Range) null, (Range) null);
      // Undeclared exception!
      try { 
        legendGraphic0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(271, 271);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((Range) null, 2327.0);
      // Undeclared exception!
      try { 
        legendGraphic0.arrange((Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.LegendGraphic", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      LegendGraphic legendGraphic1 = (LegendGraphic)legendGraphic0.clone();
      assertTrue(legendGraphic1.isShapeVisible());
      assertEquals(2.0, legendGraphic1.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic1.getContentXOffset(), 0.01);
      assertTrue(legendGraphic1.isShapeFilled());
      assertNotSame(legendGraphic1, legendGraphic0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(271, 271);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setLine(rectangle0);
      legendGraphic0.arrangeNN((Graphics2D) null);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      boolean boolean0 = legendGraphic0.isShapeFilled();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(boolean0);
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable((TableModel) null, defaultTableColumnModel0);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.getOutlineStroke();
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setFillPaint((Paint) null);
      legendGraphic0.getFillPaint();
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.getLinePaint();
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2940.195417404, 2940.195417404, 0.0, 0.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      SystemColor systemColor0 = SystemColor.controlShadow;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.getShape();
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.getOutlinePaint();
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D0 = rectangleInsets0.createAdjustedRectangle(rectangle2D_Float0, lengthAdjustmentType0, lengthAdjustmentType0);
      JTable jTable0 = new JTable((TableModel) null, (TableColumnModel) null);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.setShape(rectangle2D_Float0);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      boolean boolean0 = legendGraphic0.isShapeVisible();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(boolean0);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable(timeSeriesTableModel0, defaultTableColumnModel0);
      Rectangle rectangle0 = jTable0.getCellRect(207, 207, false);
      Color color0 = Color.YELLOW;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.getShapeLocation();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setOutlineStroke((Stroke) null);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D0 = rectangleInsets0.createAdjustedRectangle(rectangle2D_Float0, lengthAdjustmentType0, lengthAdjustmentType0);
      JTable jTable0 = new JTable((TableModel) null, (TableColumnModel) null);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.getLine();
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D0 = rectangleInsets0.createAdjustedRectangle(rectangle2D_Float0, lengthAdjustmentType0, lengthAdjustmentType0);
      JTable jTable0 = new JTable((TableModel) null, (TableColumnModel) null);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.getFillPaint();
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.CONTRACT;
      Rectangle2D rectangle2D0 = rectangleInsets0.createAdjustedRectangle(rectangle2D_Float0, lengthAdjustmentType0, lengthAdjustmentType0);
      JTable jTable0 = new JTable((TableModel) null, (TableColumnModel) null);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D0, color0);
      legendGraphic0.hashCode();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.getLineStroke();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.setShapeOutlineVisible(true);
      boolean boolean0 = legendGraphic0.isShapeOutlineVisible();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(271, 271);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.isShapeOutlineVisible();
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      legendGraphic0.setShapeLocation(rectangleAnchor0);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 0.0, 0.0);
      SystemColor systemColor0 = SystemColor.textText;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D_Double0, systemColor0);
      // Undeclared exception!
      try { 
        legendGraphic0.setFillPaintTransformer((GradientPaintTransformer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'transformer' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable((TableModel) null, defaultTableColumnModel0);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.setOutlinePaint(color0);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      assertTrue(legendGraphic0.isShapeVisible());
      
      legendGraphic0.setShapeVisible(false);
      boolean boolean0 = legendGraphic0.isShapeVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable((TableModel) null, defaultTableColumnModel0);
      Color color0 = jTable0.getSelectionBackground();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, color0);
      legendGraphic0.setLineStroke((Stroke) null);
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.getShapeAnchor();
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeVisible());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(984.0, (-623.545084), (-1641.37369682029), (-623.545084));
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle2D_Double0, color0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      legendGraphic0.setShapeAnchor(rectangleAnchor0);
      assertTrue(legendGraphic0.isShapeVisible());
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertTrue(legendGraphic0.isShapeFilled());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      assertTrue(legendGraphic0.isShapeFilled());
      
      legendGraphic0.setShapeFilled(false);
      boolean boolean0 = legendGraphic0.isShapeFilled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      legendGraphic0.isLineVisible();
      assertTrue(legendGraphic0.isShapeVisible());
      assertTrue(legendGraphic0.isShapeFilled());
      assertEquals(2.0, legendGraphic0.getContentXOffset(), 0.01);
      assertEquals(2.0, legendGraphic0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(252, 252);
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      LegendGraphic legendGraphic0 = new LegendGraphic(rectangle0, systemColor0);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke((-2034), (-2034));
      // Undeclared exception!
      try { 
        legendGraphic0.draw((Graphics2D) null, (Rectangle2D) rectangle0, (Object) aWTKeyStroke0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }
}