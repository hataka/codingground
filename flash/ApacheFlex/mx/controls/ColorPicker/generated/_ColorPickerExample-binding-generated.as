

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.controls.ColorPicker;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property cp (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'cp' moved to '_3181cp'
	 */

    [Bindable(event="propertyChange")]
    public function get cp():mx.controls.ColorPicker
    {
        return this._3181cp;
    }

    public function set cp(value:mx.controls.ColorPicker):void
    {
    	var oldValue:Object = this._3181cp;
        if (oldValue !== value)
        {
            this._3181cp = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "cp", oldValue, value));
        }
    }



}
