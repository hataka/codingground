

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import spark.components.Label;
import mx.formatters.DateFormatter;
import mx.controls.DateChooser;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property dateChooser1 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'dateChooser1' moved to '_226893860dateChooser1'
	 */

    [Bindable(event="propertyChange")]
    public function get dateChooser1():mx.controls.DateChooser
    {
        return this._226893860dateChooser1;
    }

    public function set dateChooser1(value:mx.controls.DateChooser):void
    {
    	var oldValue:Object = this._226893860dateChooser1;
        if (oldValue !== value)
        {
            this._226893860dateChooser1 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "dateChooser1", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property dateChooser2 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'dateChooser2' moved to '_226893861dateChooser2'
	 */

    [Bindable(event="propertyChange")]
    public function get dateChooser2():mx.controls.DateChooser
    {
        return this._226893861dateChooser2;
    }

    public function set dateChooser2(value:mx.controls.DateChooser):void
    {
    	var oldValue:Object = this._226893861dateChooser2;
        if (oldValue !== value)
        {
            this._226893861dateChooser2 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "dateChooser2", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property df (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'df' moved to '_3202df'
	 */

    [Bindable(event="propertyChange")]
    public function get df():mx.formatters.DateFormatter
    {
        return this._3202df;
    }

    public function set df(value:mx.formatters.DateFormatter):void
    {
    	var oldValue:Object = this._3202df;
        if (oldValue !== value)
        {
            this._3202df = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "df", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property selection (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'selection' moved to '_1715965556selection'
	 */

    [Bindable(event="propertyChange")]
    public function get selection():spark.components.Label
    {
        return this._1715965556selection;
    }

    public function set selection(value:spark.components.Label):void
    {
    	var oldValue:Object = this._1715965556selection;
        if (oldValue !== value)
        {
            this._1715965556selection = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "selection", oldValue, value));
        }
    }



}
