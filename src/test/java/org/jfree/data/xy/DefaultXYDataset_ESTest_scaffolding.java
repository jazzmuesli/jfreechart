/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 21:44:05 GMT 2019
 */

package org.jfree.data.xy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DefaultXYDataset_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.data.xy.DefaultXYDataset"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultXYDataset_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.xy.YInterval",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.xy.XYCoordinate",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.xy.Vector",
      "org.jfree.chart.util.Args",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.YIntervalDataItem",
      "org.jfree.data.xy.VectorDataItem",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.general.DatasetChangeEvent"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultXYDataset_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.util.Args",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.xy.YIntervalDataItem",
      "org.jfree.data.xy.YInterval",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.xy.XIntervalDataItem",
      "org.jfree.data.xy.YWithXInterval",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.XIntervalSeries",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.data.xy.VectorDataItem",
      "org.jfree.data.xy.XYCoordinate",
      "org.jfree.data.xy.Vector",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.data.xy.XYIntervalDataItem",
      "org.jfree.data.xy.XYInterval",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DataUtils",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType"
    );
  }
}
