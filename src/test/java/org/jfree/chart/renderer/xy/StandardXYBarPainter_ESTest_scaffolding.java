/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 21:47:47 GMT 2019
 */

package org.jfree.chart.renderer.xy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class StandardXYBarPainter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.renderer.xy.StandardXYBarPainter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StandardXYBarPainter_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.ui.GradientPaintTransformer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.xy.XYBarPainter",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.renderer.xy.XYBarRenderer$XYBarRendererState",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ui.Layer",
      "org.jfree.chart.PaintMap",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.data.ItemKey",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.renderer.xy.StandardXYBarPainter",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.entity.PlotEntity"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.Graphics2D", false, StandardXYBarPainter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.Point", false, StandardXYBarPainter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StandardXYBarPainter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.renderer.xy.StandardXYBarPainter",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.data.xy.XYItemKey",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.ChartHints",
      "org.jfree.data.Range",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.MultiplePiePlot",
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
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYBoxAnnotation",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.annotations.XYPolygonAnnotation",
      "org.jfree.chart.annotations.XYLineAnnotation",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.data.RangeType",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.chart.annotations.XYImageAnnotation",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.annotations.XYDataImageAnnotation",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.data.DataUtils",
      "org.jfree.chart.renderer.xy.YIntervalRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.data.time.Year",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.PlotOrientation"
    );
  }
}
