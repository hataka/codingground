

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.graphics.SolidColorStroke;
import mx.charts.BubbleChart;
import mx.graphics.SolidColor;
import mx.collections.ArrayCollection;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property bubblechart (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'bubblechart' moved to '_782310098bubblechart'
	 */

    [Bindable(event="propertyChange")]
    public function get bubblechart():mx.charts.BubbleChart
    {
        return this._782310098bubblechart;
    }

    public function set bubblechart(value:mx.charts.BubbleChart):void
    {
    	var oldValue:Object = this._782310098bubblechart;
        if (oldValue !== value)
        {
            this._782310098bubblechart = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "bubblechart", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property sc1 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'sc1' moved to '_113633sc1'
	 */

    [Bindable(event="propertyChange")]
    public function get sc1():mx.graphics.SolidColor
    {
        return this._113633sc1;
    }

    public function set sc1(value:mx.graphics.SolidColor):void
    {
    	var oldValue:Object = this._113633sc1;
        if (oldValue !== value)
        {
            this._113633sc1 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "sc1", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property stroke1 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'stroke1' moved to '_1881583367stroke1'
	 */

    [Bindable(event="propertyChange")]
    public function get stroke1():mx.graphics.SolidColorStroke
    {
        return this._1881583367stroke1;
    }

    public function set stroke1(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._1881583367stroke1;
        if (oldValue !== value)
        {
            this._1881583367stroke1 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "stroke1", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property expensesAC (private)
	 * - generated setter
	 * - generated getter
	 * - original private var 'expensesAC' moved to '_190844803expensesAC'
	 */

    [Bindable(event="propertyChange")]
    private function get expensesAC():ArrayCollection
    {
        return this._190844803expensesAC;
    }

    private function set expensesAC(value:ArrayCollection):void
    {
    	var oldValue:Object = this._190844803expensesAC;
        if (oldValue !== value)
        {
            this._190844803expensesAC = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "expensesAC", oldValue, value));
        }
    }



}
