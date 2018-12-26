
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
import mx.charts.BubbleChart;
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
import mx.charts.series.BubbleSeries;
import mx.containers.Panel;
import mx.charts.Legend;
import mx.core.Application;

public class BubbleChartExample extends mx.core.Application
{
	public function BubbleChartExample() {}

	[Bindable]
	public var sc1 : mx.graphics.SolidColor;
	[Bindable]
	public var stroke1 : mx.graphics.SolidColorStroke;
	[Bindable]
	public var bubblechart : mx.charts.BubbleChart;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/codingground/flash/TourDeFlex3/mx/charts/BubbleChartExample/BubbleChartExample.mxml:25,35";

}}
