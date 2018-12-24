

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import spark.components.TextArea;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property myTA (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'myTA' moved to '_3366169myTA'
	 */

    [Bindable(event="propertyChange")]
    public function get myTA():spark.components.TextArea
    {
        return this._3366169myTA;
    }

    public function set myTA(value:spark.components.TextArea):void
    {
    	var oldValue:Object = this._3366169myTA;
        if (oldValue !== value)
        {
            this._3366169myTA = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "myTA", oldValue, value));
        }
    }



}
