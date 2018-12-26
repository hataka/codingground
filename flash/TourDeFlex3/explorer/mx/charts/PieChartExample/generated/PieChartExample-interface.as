
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
import mx.charts.PieChart;
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
import Array;
import mx.charts.series.PieSeries;
import mx.containers.Panel;
import mx.charts.Legend;
import mx.core.Application;

public class PieChartExample extends mx.core.Application
{
	public function PieChartExample() {}

	[Bindable]
	public var sc1 : mx.graphics.SolidColor;
	[Bindable]
	public var sc2 : mx.graphics.SolidColor;
	[Bindable]
	public var sc3 : mx.graphics.SolidColor;
	[Bindable]
	public var callouts : mx.graphics.SolidColorStroke;
	[Bindable]
	public var radial : mx.graphics.SolidColorStroke;
	[Bindable]
	public var pieborder : mx.graphics.SolidColorStroke;
	[Bindable]
	public var chart : mx.charts.PieChart;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/GitHub/hataka/codingground/flash/TourDeFlex3/explorer/mx/charts/PieChartExample/PieChartExample.mxml:25,38";

}}
