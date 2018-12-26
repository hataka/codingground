
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
import loaderPanel;
import mx.binding.*;
import mx.controls.Tree;
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
import mx.styles.*;
import viewsource;
import mx.controls.Spacer;
import mx.containers.VDividedBox;
import mx.containers.VBox;
import mx.containers.HDividedBox;
import mx.containers.Panel;
import mx.controls.Image;
import mx.core.Application;
import mx.containers.HBox;
import mx.controls.Label;

public class explorer extends mx.core.Application
{
	public function explorer() {}

	[Bindable]
	public var explorerTree : XML;
	[Bindable]
	public var compLibTree : mx.controls.Tree;
	[Bindable]
	public var swfLoader : loaderPanel;
	[Bindable]
	public var vs : viewsource;

	mx_internal var _bindings : Array;
	mx_internal var _watchers : Array;
	mx_internal var _bindingsByDestination : Object;
	mx_internal var _bindingsBeginWithWord : Object;

include "F:/codingground/flash/TourDeFlex3/explorer/explorer.mxml:25,150";

}}
