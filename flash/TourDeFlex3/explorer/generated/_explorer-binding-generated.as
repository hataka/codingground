

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import flash.media.*;
import flash.text.*;
import flash.external.*;
import flash.geom.*;
import flash.accessibility.*;
import flash.printing.*;
import flash.debugger.*;
import mx.controls.Tree;
import flash.display.*;
import mx.styles.*;
import flash.errors.*;
import flash.net.*;
import flash.xml.*;
import flash.system.*;
import flash.events.*;
import mx.filters.*;
import loaderPanel;
import viewsource;
import flash.ui.*;
import mx.binding.*;
import flash.utils.*;
import flash.profiler.*;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property compLibTree (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'compLibTree' moved to '_2130482764compLibTree'
	 */

    [Bindable(event="propertyChange")]
    public function get compLibTree():mx.controls.Tree
    {
        return this._2130482764compLibTree;
    }

    public function set compLibTree(value:mx.controls.Tree):void
    {
    	var oldValue:Object = this._2130482764compLibTree;
        if (oldValue !== value)
        {
            this._2130482764compLibTree = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "compLibTree", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property explorerTree (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'explorerTree' moved to '_1925511043explorerTree'
	 */

    [Bindable(event="propertyChange")]
    public function get explorerTree():XML
    {
        return this._1925511043explorerTree;
    }

    public function set explorerTree(value:XML):void
    {
    	var oldValue:Object = this._1925511043explorerTree;
        if (oldValue !== value)
        {
            this._1925511043explorerTree = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "explorerTree", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property swfLoader (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'swfLoader' moved to '_2145423051swfLoader'
	 */

    [Bindable(event="propertyChange")]
    public function get swfLoader():loaderPanel
    {
        return this._2145423051swfLoader;
    }

    public function set swfLoader(value:loaderPanel):void
    {
    	var oldValue:Object = this._2145423051swfLoader;
        if (oldValue !== value)
        {
            this._2145423051swfLoader = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "swfLoader", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property vs (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'vs' moved to '_3773vs'
	 */

    [Bindable(event="propertyChange")]
    public function get vs():viewsource
    {
        return this._3773vs;
    }

    public function set vs(value:viewsource):void
    {
    	var oldValue:Object = this._3773vs;
        if (oldValue !== value)
        {
            this._3773vs = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "vs", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property noExamples (protected)
	 * - generated setter
	 * - generated getter
	 * - original protected var 'noExamples' moved to '_1198375638noExamples'
	 */

    [Bindable(event="propertyChange")]
    protected function get noExamples():int
    {
        return this._1198375638noExamples;
    }

    protected function set noExamples(value:int):void
    {
    	var oldValue:Object = this._1198375638noExamples;
        if (oldValue !== value)
        {
            this._1198375638noExamples = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "noExamples", oldValue, value));
        }
    }



}
