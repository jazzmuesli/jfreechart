/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 17 22:36:49 GMT 2019
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
public class WindItemRenderer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.renderer.xy.WindItemRenderer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WindItemRenderer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.HashUtils",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.ui.Layer",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.ItemKey",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.ui.LengthAdjustmentType",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.data.xy.WindDataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.Range",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.entity.XYItemEntity"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.Graphics2D", false, WindItemRenderer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.geom.Rectangle2D", false, WindItemRenderer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.axis.ValueAxis", false, WindItemRenderer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.plot.CrosshairState", false, WindItemRenderer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.plot.PlotRenderingInfo", false, WindItemRenderer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.data.xy.XYDataset", false, WindItemRenderer_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WindItemRenderer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
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
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.CloneUtils",
      "org.jfree.chart.HashUtils",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.PolarAxisLocation",
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
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.ChartUtils",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.text.TextUtils",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.IntervalXYItemLabelGenerator",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.chart.renderer.xy.SamplingXYLineRenderer",
      "org.jfree.chart.annotations.XYImageAnnotation",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.DefaultKeyedValues",
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
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.annotations.XYDrawableAnnotation",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.chart.urls.CustomXYURLGenerator",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.title.ShortTextTitle",
      "org.jfree.chart.annotations.XYTitleAnnotation",
      "org.jfree.chart.util.XYCoordinateType",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.chart.labels.IntervalXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.XYBarRenderer$XYBarRendererState",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.renderer.xy.SamplingXYLineRenderer$State",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Day",
      "org.jfree.chart.date.SerialDate",
      "org.jfree.chart.date.SpreadsheetDate",
      "org.jfree.chart.annotations.XYBoxAnnotation",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.data.time.Hour",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.annotations.XYPolygonAnnotation",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.renderer.xy.XYSplineRenderer",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.plot.PieLabelRecord",
      "org.jfree.chart.labels.StandardXYItemLabelGenerator",
      "org.jfree.chart.labels.BubbleXYItemLabelGenerator",
      "org.jfree.chart.plot.Crosshair",
      "org.jfree.chart.labels.StandardCrosshairLabelGenerator",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator"
    );
  }
}
