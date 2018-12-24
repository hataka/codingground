
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
import mx.controls.CheckBox;
import mx.core.ClassFactory;
import mx.core.DeferredInstanceFromClass;
import mx.core.DeferredInstanceFromFunction;
import mx.core.IDeferredInstance;
import mx.core.IFactory;
import mx.core.IFlexModuleFactory;
import mx.core.IPropertyChangeNotifier;
import mx.core.mx_internal;
import mx.filters.*;
import mx.styles.*;
import spark.components.Application;
import spark.components.TextArea;
import spark.components.Application;
import spark.components.VGroup;
import spark.components.Label;
import spark.components.HGroup;
import spark.components.Panel;

public class CheckBoxExample extends spark.components.Application
{
	public function CheckBoxExample() {}

	[Bindable]
	public var milkCB : mx.controls.CheckBox;
	[Bindable]
	public var eggsCB : mx.controls.CheckBox;
	[Bindable]
	public var breadCB : mx.controls.CheckBox;
	[Bindable]
	public var cartItems : spark.components.TextArea;
	[Bindable]
	public var couponCB : mx.controls.CheckBox;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/Flash/ApacheFlex/mx/controls/CheckBox/CheckBoxExample.mxml:8,36";

}}
