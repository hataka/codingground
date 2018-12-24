

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.controls.CheckBox;
import spark.components.TextArea;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property breadCB (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'breadCB' moved to '_141034327breadCB'
	 */

    [Bindable(event="propertyChange")]
    public function get breadCB():mx.controls.CheckBox
    {
        return this._141034327breadCB;
    }

    public function set breadCB(value:mx.controls.CheckBox):void
    {
    	var oldValue:Object = this._141034327breadCB;
        if (oldValue !== value)
        {
            this._141034327breadCB = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "breadCB", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property cartItems (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'cartItems' moved to '_192704640cartItems'
	 */

    [Bindable(event="propertyChange")]
    public function get cartItems():spark.components.TextArea
    {
        return this._192704640cartItems;
    }

    public function set cartItems(value:spark.components.TextArea):void
    {
    	var oldValue:Object = this._192704640cartItems;
        if (oldValue !== value)
        {
            this._192704640cartItems = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "cartItems", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property couponCB (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'couponCB' moved to '_370315515couponCB'
	 */

    [Bindable(event="propertyChange")]
    public function get couponCB():mx.controls.CheckBox
    {
        return this._370315515couponCB;
    }

    public function set couponCB(value:mx.controls.CheckBox):void
    {
    	var oldValue:Object = this._370315515couponCB;
        if (oldValue !== value)
        {
            this._370315515couponCB = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "couponCB", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property eggsCB (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'eggsCB' moved to '_1305119251eggsCB'
	 */

    [Bindable(event="propertyChange")]
    public function get eggsCB():mx.controls.CheckBox
    {
        return this._1305119251eggsCB;
    }

    public function set eggsCB(value:mx.controls.CheckBox):void
    {
    	var oldValue:Object = this._1305119251eggsCB;
        if (oldValue !== value)
        {
            this._1305119251eggsCB = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "eggsCB", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property milkCB (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'milkCB' moved to '_1074097734milkCB'
	 */

    [Bindable(event="propertyChange")]
    public function get milkCB():mx.controls.CheckBox
    {
        return this._1074097734milkCB;
    }

    public function set milkCB(value:mx.controls.CheckBox):void
    {
    	var oldValue:Object = this._1074097734milkCB;
        if (oldValue !== value)
        {
            this._1074097734milkCB = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "milkCB", oldValue, value));
        }
    }



}
