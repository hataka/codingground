

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.controls.SWFLoader;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property myLoader (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'myLoader' moved to '_1012123425myLoader'
	 */

    [Bindable(event="propertyChange")]
    public function get myLoader():mx.controls.SWFLoader
    {
        return this._1012123425myLoader;
    }

    public function set myLoader(value:mx.controls.SWFLoader):void
    {
    	var oldValue:Object = this._1012123425myLoader;
        if (oldValue !== value)
        {
            this._1012123425myLoader = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "myLoader", oldValue, value));
        }
    }



}
