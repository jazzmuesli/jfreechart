/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 21:40:20 GMT 2019
 */

package org.jfree.chart.plot.dial;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DialValueIndicator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.dial.DialValueIndicator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DialValueIndicator_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.plot.dial.ArcDialFrame",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.plot.dial.DialFrame",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.plot.dial.DialLayerChangeListener",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.dial.DialLayerChangeEvent",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.plot.dial.DialPointer",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.plot.dial.DialValueIndicator",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.plot.dial.DialScale",
      "org.jfree.chart.plot.dial.DialPlot",
      "org.jfree.chart.plot.dial.AbstractDialLayer",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.plot.dial.DialLayer",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.Value",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.entity.PlotEntity"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.FontMetrics", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.Graphics2D", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.font.FontRenderContext", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.geom.Point2D", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.geom.Rectangle2D", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.plot.PlotRenderingInfo", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.plot.PlotState", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.plot.dial.DialLayerChangeEvent", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.data.general.ValueDataset", false, DialValueIndicator_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DialValueIndicator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.plot.dial.AbstractDialLayer",
      "org.jfree.chart.plot.dial.DialValueIndicator",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.plot.dial.DialLayerChangeEvent",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.dial.DialPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.dial.ArcDialFrame",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.JFreeChart"
    );
  }
}
