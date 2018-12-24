
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
import mx.collections.GroupingCollection2;
import mx.controls.AdvancedDataGrid;
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
import mx.containers.Panel;
import mx.controls.advancedDataGridClasses.AdvancedDataGridColumn;
import spark.components.Application;
import mx.collections.Grouping;
import mx.collections.GroupingField;

public class AdvancedDataGridExample extends spark.components.Application
{
	public function AdvancedDataGridExample() {}

	[Bindable]
	public var myADG : mx.controls.AdvancedDataGrid;
	[Bindable]
	public var gc : mx.collections.GroupingCollection2;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/HomePage/travel.coocan-kahata/Flash/ApacheFlex/mx/controls/AdvancedDataGrid/AdvancedDataGridExample.mxml:7,29";

}}
