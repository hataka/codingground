
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
import mx.charts.CandlestickChart;
import mx.charts.CategoryAxis;
import mx.charts.LinearAxis;
import mx.core.Application;
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
import mx.containers.Panel;
import mx.charts.AxisRenderer;
import mx.core.Application;
import mx.charts.series.CandlestickSeries;

public class CandlestickChartExample extends mx.core.Application
{
	public function CandlestickChartExample() {}

	[Bindable]
	public var up : mx.graphics.SolidColor;
	[Bindable]
	public var down : mx.graphics.SolidColor;
	[Bindable]
	public var wick : mx.graphics.SolidColorStroke;
	[Bindable]
	public var box : mx.graphics.SolidColorStroke;
	[Bindable]
	public var candlestickchart : mx.charts.CandlestickChart;
	[Bindable]
	public var vaxis : mx.charts.LinearAxis;
	[Bindable]
	public var haxis : mx.charts.CategoryAxis;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/codingground/flash/TourDeFlex3/mx/charts/CandlestickChartExample/CandlestickChartExample.mxml:25,40";

}}
