
package 
{
import flash.accessibility.*;
import flash.debugger.*;
import flash.display.*;
import flash.errors.*;
import flash.events.*;
import flash.external.*;
import flash.geom.*;
import flash.media.*;
import flash.net.*;
import flash.printing.*;
import flash.profiler.*;
import flash.system.*;
import flash.text.*;
import flash.ui.*;
import flash.utils.*;
import flash.xml.*;
import mx.binding.*;
import mx.charts.AreaChart;
import mx.charts.LineChart;
import mx.core.ClassFactory;
import mx.core.DeferredInstanceFromClass;
import mx.core.DeferredInstanceFromFunction;
import mx.core.IDeferredInstance;
import mx.core.IFactory;
import mx.core.IFlexModuleFactory;
import mx.core.IPropertyChangeNotifier;
import mx.core.mx_internal;
import mx.filters.*;
import mx.graphics.SolidColor;
import mx.graphics.SolidColorStroke;
import mx.styles.*;
import spark.components.Application;
import mx.charts.CategoryAxis;
import mx.charts.series.LineSeries;
import spark.components.Application;
import mx.containers.Panel;
import mx.charts.Legend;
import mx.charts.series.AreaSeries;

public class AreaChartExample extends spark.components.Application
{
	public function AreaChartExample() {}

	[Bindable]
	public var sc1 : mx.graphics.SolidColor;
	[Bindable]
	public var sc2 : mx.graphics.SolidColor;
	[Bindable]
	public var sc3 : mx.graphics.SolidColor;
	[Bindable]
	public var s1 : mx.graphics.SolidColorStroke;
	[Bindable]
	public var s2 : mx.graphics.SolidColorStroke;
	[Bindable]
	public var s3 : mx.graphics.SolidColorStroke;
	[Bindable]
	public var linechart : mx.charts.LineChart;
	[Bindable]
	public var Areachart : mx.charts.AreaChart;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/Flash/ApacheFlex/mx/charts/AreaChart/AreaChartExample.mxml:26,37";

}}
