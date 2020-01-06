/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 22:36:36 GMT 2019
 */

package org.jfree.chart.labels;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StandardPieToolTipGenerator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.labels.StandardPieToolTipGenerator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StandardPieToolTipGenerator_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.HashUtils",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.general.Series",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.data.general.PieDataset",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.DataUtils",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.util.Args",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.labels.StandardPieToolTipGenerator",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.Values",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.general.DefaultKeyedValues2DDataset"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StandardPieToolTipGenerator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieToolTipGenerator",
      "org.jfree.chart.util.Args",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.HashUtils",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.map.ValuePool",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.DataUtils",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Week",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.xy.XYIntervalDataItem",
      "org.jfree.data.xy.XYInterval",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.xy.XIntervalDataItem",
      "org.jfree.data.xy.YWithXInterval",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.xy.CategoryTableXYDataset"
    );
  }
}
