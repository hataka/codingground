

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import spark.components.TextArea;
import mx.controls.Button;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property iconButton (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'iconButton' moved to '_982691573iconButton'
	 */

    [Bindable(event="propertyChange")]
    public function get iconButton():mx.controls.Button
    {
        return this._982691573iconButton;
    }

    public function set iconButton(value:mx.controls.Button):void
    {
    	var oldValue:Object = this._982691573iconButton;
        if (oldValue !== value)
        {
            this._982691573iconButton = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "iconButton", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property message (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'message' moved to '_954925063message'
	 */

    [Bindable(event="propertyChange")]
    public function get message():spark.components.TextArea
    {
        return this._954925063message;
    }

    public function set message(value:spark.components.TextArea):void
    {
    	var oldValue:Object = this._954925063message;
        if (oldValue !== value)
        {
            this._954925063message = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "message", oldValue, value));
        }
    }



}
