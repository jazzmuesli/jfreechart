/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 20:32:54 GMT 2019
 */

package org.jfree.chart.axis;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LogarithmicAxis_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.axis.LogarithmicAxis"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LogarithmicAxis_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.chart.renderer.xy.XYShapeRenderer",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.renderer.xy.VectorRenderer",
      "org.jfree.chart.renderer.xy.DeviationRenderer$State",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.renderer.category.BarPainter",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.ChartMouseEvent",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.needle.LongNeedle",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.chart.entity.XYAnnotationEntity",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.renderer.xy.XYBarRenderer$XYBarRendererState",
      "org.jfree.chart.util.ShadowGenerator",
      "org.jfree.data.time.Second",
      "org.jfree.data.xy.YIntervalDataItem",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.needle.PlumNeedle",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.data.KeyedValues",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.data.xy.XYZDataset",
      "org.jfree.chart.event.OverlayChangeListener",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.date.MonthConstants",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.needle.PointerNeedle",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer$StackedXYAreaRendererState",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.imagemap.URLTagFragmentGenerator",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.ItemKey",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.renderer.xy.SamplingXYLineRenderer$State",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.needle.ShipNeedle",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.Value",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.data.gantt.Task",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.panel.Overlay",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.chart.plot.PieLabelRecord",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.annotations.XYDataImageAnnotation",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.title.Title",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.data.time.Day",
      "org.jfree.chart.renderer.xy.SamplingXYLineRenderer",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.title.LegendItemBlockContainer",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.ChartHints",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.data.DataUtils",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.needle.LineNeedle",
      "org.jfree.data.xy.Vector",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.event.OverlayChangeEvent",
      "org.jfree.chart.annotations.XYAnnotationBoundsInfo",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.ChartColor",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.labels.StandardPieToolTipGenerator",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.xy.VectorXYDataset",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.ui.LengthAdjustmentType",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.LogTick",
      "org.jfree.chart.needle.MiddlePinNeedle",
      "org.jfree.data.general.SeriesException",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.renderer.xy.XYDotRenderer",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.chart.urls.PieURLGenerator",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.labels.StandardXYItemLabelGenerator",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.urls.CustomXYURLGenerator",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.ui.Layer",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.data.xy.XYDomainInfo",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.data.function.Function2D",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.data.xy.XYIntervalDataItem",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.data.xy.VectorDataItem",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.data.RangeType",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.data.time.Month",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.data.xy.WindDataset",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.ui.GradientPaintTransformer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.xy.YIntervalRenderer",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.renderer.xy.XYBarPainter",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.data.xy.XYRangeInfo",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.time.Year",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.renderer.xy.XYAreaRenderer$XYAreaRendererState",
      "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.needle.PinNeedle",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.statistics.BoxAndWhiskerXYDataset",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.chart.axis.TickType",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.data.time.Week",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.renderer.PaintScale",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.StrokeMap",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.chart.entity.LegendItemEntity",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.LogAxis"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LogarithmicAxis_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.chart.event.PlotChangeEvent",
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
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.labels.StandardPieToolTipGenerator",
      "org.jfree.chart.urls.CustomXYURLGenerator",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartUtils",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYItemLabelGenerator",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.data.time.Week",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.renderer.xy.YIntervalRenderer",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.chart.renderer.xy.XYShapeRenderer",
      "org.jfree.chart.annotations.XYDataImageAnnotation",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.renderer.xy.VectorRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.renderer.xy.SamplingXYLineRenderer",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.data.DataUtils",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.LegendItem",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.title.LegendItemBlockContainer",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.entity.LegendItemEntity",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.chart.renderer.xy.XYDotRenderer",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.data.RangeType",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.util.TableOrder"
    );
  }
}
