/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 20:47:15 GMT 2019
 */

package org.jfree.chart.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ThermometerPlot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.ThermometerPlot"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ThermometerPlot_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.time.Day",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.text.AttributedStringUtils",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.entity.XYAnnotationEntity",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.util.ShadowGenerator",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.event.OverlayChangeEvent",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.data.time.Quarter",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.data.time.Year",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.DomainInfo",
      "org.jfree.chart.event.OverlayChangeListener",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.imagemap.ToolTipTagFragmentGenerator",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.date.MonthConstants",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.ui.Layer",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.data.RangeType",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.time.Month",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.chart.imagemap.URLTagFragmentGenerator",
      "org.jfree.data.ItemKey",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.general.Series",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.ui.LengthAdjustmentType",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.Value",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.chart.panel.Overlay"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ThermometerPlot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.data.general.DatasetChangeEvent",
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
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.annotations.XYLineAnnotation",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.annotations.XYPolygonAnnotation",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.CenterTextMode",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.annotations.XYBoxAnnotation",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.data.time.Quarter",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.IntervalXYToolTipGenerator",
      "org.jfree.chart.annotations.XYTitleAnnotation",
      "org.jfree.chart.util.XYCoordinateType",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.data.time.Month",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.text.AttributedStringUtils",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.urls.StandardXYZURLGenerator",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.annotations.XYDataImageAnnotation",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.annotations.XYImageAnnotation",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.map.ValuePool",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.chart.annotations.XYDrawableAnnotation",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.axis.AxisLocation"
    );
  }
}
