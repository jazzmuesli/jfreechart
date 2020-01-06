/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 22:19:03 GMT 2019
 */

package org.jfree.chart.entity;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PieSectionEntity_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.entity.PieSectionEntity"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PieSectionEntity_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.chart.imagemap.URLTagFragmentGenerator",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.general.Series",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.util.Args",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.KeyedValues",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.general.DatasetChangeEvent"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, PieSectionEntity_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PieSectionEntity_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.util.Args",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.HashUtils",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.map.ValuePool",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGenerator",
      "org.jfree.chart.imagemap.ImageMapUtils",
      "org.jfree.chart.imagemap.StandardURLTagFragmentGenerator",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.DataUtils",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.time.Month",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.statistics.SimpleHistogramDataset"
    );
  }
}
