

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.collections.GroupingCollection2;
import mx.collections.ArrayCollection;
import mx.controls.AdvancedDataGrid;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property gc (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'gc' moved to '_3292gc'
	 */

    [Bindable(event="propertyChange")]
    public function get gc():mx.collections.GroupingCollection2
    {
        return this._3292gc;
    }

    public function set gc(value:mx.collections.GroupingCollection2):void
    {
    	var oldValue:Object = this._3292gc;
        if (oldValue !== value)
        {
            this._3292gc = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "gc", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property myADG (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'myADG' moved to '_104333144myADG'
	 */

    [Bindable(event="propertyChange")]
    public function get myADG():mx.controls.AdvancedDataGrid
    {
        return this._104333144myADG;
    }

    public function set myADG(value:mx.controls.AdvancedDataGrid):void
    {
    	var oldValue:Object = this._104333144myADG;
        if (oldValue !== value)
        {
            this._104333144myADG = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "myADG", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property dpFlat (private)
	 * - generated setter
	 * - generated getter
	 * - original private var 'dpFlat' moved to '_1326425563dpFlat'
	 */

    [Bindable(event="propertyChange")]
    private function get dpFlat():ArrayCollection
    {
        return this._1326425563dpFlat;
    }

    private function set dpFlat(value:ArrayCollection):void
    {
    	var oldValue:Object = this._1326425563dpFlat;
        if (oldValue !== value)
        {
            this._1326425563dpFlat = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "dpFlat", oldValue, value));
        }
    }



}
