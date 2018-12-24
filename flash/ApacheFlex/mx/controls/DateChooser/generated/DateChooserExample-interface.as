
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
import mx.controls.DateChooser;
import mx.core.ClassFactory;
import mx.core.DeferredInstanceFromClass;
import mx.core.DeferredInstanceFromFunction;
import mx.core.IDeferredInstance;
import mx.core.IFactory;
import mx.core.IFlexModuleFactory;
import mx.core.IPropertyChangeNotifier;
import mx.core.mx_internal;
import mx.filters.*;
import mx.formatters.DateFormatter;
import mx.styles.*;
import spark.components.Application;
import spark.components.Label;
import spark.components.Label;
import spark.components.HGroup;
import spark.components.Application;
import spark.components.VGroup;
import spark.components.Panel;

public class DateChooserExample extends spark.components.Application
{
	public function DateChooserExample() {}

	[Bindable]
	public var df : mx.formatters.DateFormatter;
	[Bindable]
	public var dateChooser1 : mx.controls.DateChooser;
	[Bindable]
	public var selection : spark.components.Label;
	[Bindable]
	public var dateChooser2 : mx.controls.DateChooser;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/Flash/ApacheFlex/mx/controls/DateChooser/DateChooserExample.mxml:8,19";

}}
