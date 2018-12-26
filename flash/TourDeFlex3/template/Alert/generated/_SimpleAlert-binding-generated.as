

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import spark.components.Label;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property status (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'status' moved to '_892481550status'
	 */

    [Bindable(event="propertyChange")]
    public function get status():spark.components.Label
    {
        return this._892481550status;
    }

    public function set status(value:spark.components.Label):void
    {
    	var oldValue:Object = this._892481550status;
        if (oldValue !== value)
        {
            this._892481550status = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "status", oldValue, value));
        }
    }



}
