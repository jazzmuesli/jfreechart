/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 21:53:58 GMT 2019
 */

package org.jfree.chart.block;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LabelBlock_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.block.LabelBlock"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LabelBlock_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.data.Range",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.ui.HorizontalAlignment"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LabelBlock_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.Range",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Month",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.block.LengthConstraintType"
    );
  }
}
