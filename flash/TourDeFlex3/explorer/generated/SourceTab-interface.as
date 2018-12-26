
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
import mx.containers.VBox;
import mx.controls.TextArea;
import mx.core.ClassFactory;
import mx.core.DeferredInstanceFromClass;
import mx.core.DeferredInstanceFromFunction;
import mx.core.IDeferredInstance;
import mx.core.IFactory;
import mx.core.IFlexModuleFactory;
import mx.core.IPropertyChangeNotifier;
import mx.core.mx_internal;
import mx.filters.*;
import mx.rpc.http.mxml.HTTPService;
import mx.styles.*;
import mx.controls.Spacer;
import mx.containers.VBox;
import mx.controls.Button;
import mx.containers.HBox;

public class SourceTab extends mx.containers.VBox
{
	public function SourceTab() {}

	[Bindable]
	public var srv : mx.rpc.http.mxml.HTTPService;
	[Bindable]
	public var ta : mx.controls.TextArea;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/codingground/flash/TourDeFlex3/explorer/SourceTab.mxml:25,73";

}}
