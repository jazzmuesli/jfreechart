/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 21:56:47 GMT 2019
 */

package org.jfree.chart.block;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BlockContainer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.block.BlockContainer"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/projects/jfreechart"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BlockContainer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.data.Values2D",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.ui.LengthAdjustmentType",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.block.FlowArrangement"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.Graphics2D", false, BlockContainer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.Point", false, BlockContainer_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BlockContainer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.Range",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.util.UnitType"
    );
  }
}