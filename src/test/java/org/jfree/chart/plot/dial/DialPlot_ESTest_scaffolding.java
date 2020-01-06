/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 21:15:00 GMT 2019
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
public class DialPlot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.dial.DialPlot"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DialPlot_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.MouseWheelHandler",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.plot.dial.DialPointer$Pointer",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.data.general.HeatMapDataset",
      "org.jfree.chart.plot.dial.DialValueIndicator",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.plot.dial.StandardDialScale",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.plot.dial.DialBackground",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.entity.XYAnnotationEntity",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.chart.plot.dial.DialPlot",
      "org.jfree.chart.plot.dial.AbstractDialLayer",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.urls.PieURLGenerator",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ShadowGenerator",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.plot.dial.ArcDialFrame",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.dial.DialFrame",
      "org.jfree.chart.event.OverlayChangeListener",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.ui.Layer",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.plot.dial.DialPointer",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.data.RangeType",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.imagemap.URLTagFragmentGenerator",
      "org.jfree.chart.plot.dial.StandardDialFrame",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.plot.dial.DialLayer",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.data.Value",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.plot.dial.DialPointer$Pin",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.chart.panel.Overlay",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.plot.PieLabelRecord",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.ui.GradientPaintTransformer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.annotations.XYDataImageAnnotation",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.dial.DialLayerChangeEvent",
      "org.jfree.chart.plot.dial.DialTextAnnotation",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.plot.dial.DialScale",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.event.OverlayChangeEvent",
      "org.jfree.chart.annotations.XYAnnotationBoundsInfo",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.plot.dial.DialLayerChangeListener",
      "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.dial.DialCap",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.annotations.XYLineAnnotation",
      "org.jfree.chart.ui.Align",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.ui.LengthAdjustmentType",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.StrokeMap",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.axis.CategoryLabelWidthType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.font.FontRenderContext", false, DialPlot_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.image.TileObserver", false, DialPlot_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.text.DecimalFormatSymbols", false, DialPlot_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.entity.EntityCollection", false, DialPlot_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DialPlot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.dial.DialPlot",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.dial.AbstractDialLayer",
      "org.jfree.chart.plot.dial.ArcDialFrame",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.util.Args",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.plot.dial.StandardDialScale",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.Range",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.plot.dial.DialLayerChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.plot.dial.DialValueIndicator",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.dial.DialPointer",
      "org.jfree.chart.plot.dial.DialPointer$Pointer",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.plot.dial.DialPointer$Pin",
      "org.jfree.chart.plot.dial.DialBackground",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.plot.dial.DialTextAnnotation",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.chart.plot.dial.StandardDialRange",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.plot.dial.StandardDialFrame",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.dial.DialCap",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.annotations.XYLineAnnotation",
      "org.jfree.chart.annotations.XYPolygonAnnotation",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.annotations.XYImageAnnotation",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.annotations.XYTitleAnnotation",
      "org.jfree.chart.util.XYCoordinateType",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.title.ShortTextTitle",
      "org.jfree.data.general.Series",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.annotations.XYDrawableAnnotation",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.ui.Align",
      "org.jfree.chart.annotations.XYDataImageAnnotation",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.ui.RectangleAnchor"
    );
  }
}
