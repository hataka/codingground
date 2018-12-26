

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.containers.Accordion;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property accordion (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'accordion' moved to '_1830107832accordion'
	 */

    [Bindable(event="propertyChange")]
    public function get accordion():mx.containers.Accordion
    {
        return this._1830107832accordion;
    }

    public function set accordion(value:mx.containers.Accordion):void
    {
    	var oldValue:Object = this._1830107832accordion;
        if (oldValue !== value)
        {
            this._1830107832accordion = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "accordion", oldValue, value));
        }
    }



}
