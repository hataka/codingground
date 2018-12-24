

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import spark.components.Label;
import mx.collections.ArrayCollection;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property myData (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'myData' moved to '_1060521098myData'
	 */

    [Bindable(event="propertyChange")]
    public function get myData():spark.components.Label
    {
        return this._1060521098myData;
    }

    public function set myData(value:spark.components.Label):void
    {
    	var oldValue:Object = this._1060521098myData;
        if (oldValue !== value)
        {
            this._1060521098myData = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "myData", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property myLabel (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'myLabel' moved to '_1490955432myLabel'
	 */

    [Bindable(event="propertyChange")]
    public function get myLabel():spark.components.Label
    {
        return this._1490955432myLabel;
    }

    public function set myLabel(value:spark.components.Label):void
    {
    	var oldValue:Object = this._1490955432myLabel;
        if (oldValue !== value)
        {
            this._1490955432myLabel = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "myLabel", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property cards (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'cards' moved to '_94431075cards'
	 */

    [Bindable(event="propertyChange")]
    public function get cards():ArrayCollection
    {
        return this._94431075cards;
    }

    public function set cards(value:ArrayCollection):void
    {
    	var oldValue:Object = this._94431075cards;
        if (oldValue !== value)
        {
            this._94431075cards = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "cards", oldValue, value));
        }
    }



}
