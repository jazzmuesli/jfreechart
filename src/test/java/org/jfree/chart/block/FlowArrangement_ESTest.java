/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:21:13 GMT 2019
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.FlowArrangement;
import org.jfree.chart.block.LabelBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.Size2D;
import org.jfree.chart.ui.VerticalAlignment;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.Hour;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FlowArrangement_ESTest extends FlowArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(524.964432322149, 2.0);
      Size2D size2D0 = flowArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, (-1917.0), (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 2.0);
      Size2D size2D0 = flowArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, 524.964432322149);
      blockContainer0.add((Block) colorBlock0);
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 2.0);
      Size2D size2D0 = flowArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(1053.928864644298, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Hour hour0 = new Hour();
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(2092, 2092, hour0);
      Range range0 = dynamicTimeSeriesCollection0.getRangeBounds(false);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeRR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(Double.NaN, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(0.0, 0.0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeRR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer(flowArrangement0);
      Range range0 = new Range((-1829.6058430695716), 0.0);
      Range range1 = Range.shift(range0, (-1829.6058430695716), true);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, range1, lengthConstraintType0, 0.0, range0, lengthConstraintType0);
      Size2D size2D0 = flowArrangement0.arrangeRN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1829.6058430695716), size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, (-1.0));
      Size2D size2D0 = flowArrangement0.arrangeRN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1915.0), size2D0.height, 0.01);
      assertEquals(Double.NaN, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      Range range0 = new Range(2.0, 2.0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeRF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1915.0), size2D0.height, 0.01);
      assertEquals(2.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, (-1917.0), (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      Size2D size2D0 = flowArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals((-1917.0), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = flowArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 2.0);
      Size2D size2D0 = flowArrangement0.arrangeNF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(524.964432322149, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, (-895.4), (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 2.0);
      Size2D size2D0 = flowArrangement0.arrangeNF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-895.4), size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 2.0, (-184.9655206794));
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(0, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(2.0, range0);
      Size2D size2D0 = flowArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer(flowArrangement0);
      Range range0 = new Range((-1829.6058430695716), 0.0);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1829.6058430695716), range0, lengthConstraintType0, 0.0, range0, lengthConstraintType0);
      Size2D size2D0 = flowArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1172.591384), 2.0);
      Size2D size2D0 = flowArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1510.2595960963, 1510.2595960963);
      Size2D size2D0 = flowArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer(flowArrangement0);
      Range range0 = new Range(1.0, 2.0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-163.154620189), range0);
      Size2D size2D0 = flowArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(2, 2);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = flowArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1915.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 2.0);
      Size2D size2D0 = flowArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1915.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-271.5779622323), 0.0);
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeRR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.FlowArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 2.0);
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeRN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.FlowArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1172.591384), 2.0);
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeRF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.FlowArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer(flowArrangement0);
      LabelBlock labelBlock0 = new LabelBlock("]mgU!n*qEU5iW");
      blockContainer0.add((Block) labelBlock0);
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-960.0496784061), (-3372.228157108));
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeNF((BlockContainer) null, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.FlowArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-1917.0), (Range) null);
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.FlowArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer(flowArrangement0);
      LabelBlock labelBlock0 = new LabelBlock("]mgU!n*q.EUliO");
      blockContainer0.add((Block) labelBlock0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(1.0, 1.0);
      flowArrangement0.add(emptyBlock0, emptyBlock0);
      assertEquals(1.0, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      FlowArrangement flowArrangement1 = new FlowArrangement();
      boolean boolean0 = flowArrangement0.equals(flowArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.CENTER;
      FlowArrangement flowArrangement1 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 0.0, 0.5);
      boolean boolean0 = flowArrangement0.equals(flowArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.RIGHT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      FlowArrangement flowArrangement1 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 0.0, 0.5);
      boolean boolean0 = flowArrangement0.equals(flowArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      FlowArrangement flowArrangement1 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 0.0, 0.5);
      boolean boolean0 = flowArrangement0.equals(flowArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      boolean boolean0 = flowArrangement0.equals(flowArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 2.0, (-184.9655206794));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, 0, 0, 0, 0, 0, 0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(simpleTimeZone0);
      boolean boolean0 = flowArrangement0.equals(timeSeriesCollection0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 2.0, (-184.9655206794));
      BlockContainer blockContainer0 = new BlockContainer();
      BlockContainer blockContainer1 = new BlockContainer(flowArrangement0);
      blockContainer0.add((Block) blockContainer1, (Object) null);
      Range range0 = new Range(0, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeRN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, 524.964432322149);
      blockContainer0.add((Block) colorBlock0);
      blockContainer0.add((Block) colorBlock0);
      Size2D size2D0 = flowArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(1051.928864644298, size2D0.width, 0.01);
      assertEquals(524.964432322149, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 2.0, (-184.9655206794));
      BlockContainer blockContainer0 = new BlockContainer();
      BlockContainer blockContainer1 = new BlockContainer(flowArrangement0);
      blockContainer0.add((Block) blockContainer1, (Object) null);
      Range range0 = new Range(0, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeRN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 2.0, (-184.9655206794));
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.add((Block) blockContainer0, (Object) null);
      Range range0 = new Range(0, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeRN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 2.0, (-184.9655206794));
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(0, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeRF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer(flowArrangement0);
      Range range0 = new Range((-1829.6058430695716), 0.0);
      Range range1 = Range.shift(range0, (-1829.6058430695716), true);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, range1, lengthConstraintType0, 0.0, range0, lengthConstraintType0);
      Size2D size2D0 = flowArrangement0.arrangeRF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals((-1829.6058430695716), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(2, 2);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(2.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, 2.0, (-184.9655206794));
      BlockContainer blockContainer0 = new BlockContainer();
      BlockContainer blockContainer1 = new BlockContainer(flowArrangement0);
      blockContainer0.add((Block) blockContainer1, (Object) null);
      Range range0 = new Range(0, 0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = flowArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.window;
      ColorBlock colorBlock0 = new ColorBlock(systemColor0, 524.964432322149, (-1917.0));
      blockContainer0.add((Block) colorBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 2.0);
      Size2D size2D0 = flowArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-1915.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(2, 2);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toUnconstrainedHeight();
      Size2D size2D0 = flowArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint1);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(2.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((Range) null, 0.0);
      // Undeclared exception!
      try { 
        flowArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.FlowArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = flowArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-271.5779622323), 0.0);
      Size2D size2D0 = flowArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals((-271.5779622323), size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-271.5779622323), 0.0);
      Size2D size2D0 = flowArrangement0.arrangeNF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      BlockContainer blockContainer0 = new BlockContainer(flowArrangement0);
      LabelBlock labelBlock0 = new LabelBlock("");
      blockContainer0.add((Block) labelBlock0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, 0.0);
      // Undeclared exception!
      try { 
        flowArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FlowArrangement flowArrangement0 = new FlowArrangement();
      flowArrangement0.clear();
  }
}
