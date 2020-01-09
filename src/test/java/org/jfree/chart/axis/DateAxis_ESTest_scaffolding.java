/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 20:37:54 GMT 2019
 */

package org.jfree.chart.axis;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class DateAxis_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.axis.DateAxis"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DateAxis_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.renderer.xy.XYShapeRenderer",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.MouseWheelHandler",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.renderer.category.BarPainter",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.needle.LongNeedle",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.text.AttributedStringUtils",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.chart.urls.PieURLGenerator",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.util.ShadowGenerator",
      "org.jfree.data.time.Second",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.needle.PlumNeedle",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.data.xy.XYZDataset",
      "org.jfree.data.DomainInfo",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.chart.event.OverlayChangeListener",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.date.MonthConstants",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.ui.Layer",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.needle.PointerNeedle",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.data.RangeType",
      "org.jfree.data.time.Month",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.category.CategoryRangeInfo",
      "org.jfree.chart.imagemap.URLTagFragmentGenerator",
      "org.jfree.data.ItemKey",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.needle.ShipNeedle",
      "org.jfree.data.Value",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.chart.panel.Overlay",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.plot.PieLabelRecord",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.ui.GradientPaintTransformer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.block.Block",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.needle.LineNeedle",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.event.OverlayChangeEvent",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.time.Year",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.needle.PinNeedle",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.ui.LengthAdjustmentType",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.renderer.PaintScale",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.StrokeMap",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.LogTick",
      "org.jfree.chart.needle.MiddlePinNeedle",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DateAxis_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ChartUtils",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.renderer.xy.XYShapeRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.data.RangeType",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.text.AttributedStringUtils",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.time.Month",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.axis.LogTick",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.ui.RectangleAnchor"
    );
  }
}