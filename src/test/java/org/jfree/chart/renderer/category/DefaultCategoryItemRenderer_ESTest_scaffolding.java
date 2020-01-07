/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 22:34:55 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DefaultCategoryItemRenderer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultCategoryItemRenderer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.data.Values2D",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.ItemKey",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.labels.CategoryToolTipGenerator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultCategoryItemRenderer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.data.KeyedValues2DItemKey",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.ChartHints",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.util.PaintUtils"
    );
  }
}
