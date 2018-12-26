

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.charts.CategoryAxis;
import mx.charts.LinearAxis;
import mx.charts.CandlestickChart;
import mx.graphics.SolidColorStroke;
import mx.graphics.SolidColor;
import mx.collections.ArrayCollection;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property box (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'box' moved to '_97739box'
	 */

    [Bindable(event="propertyChange")]
    public function get box():mx.graphics.SolidColorStroke
    {
        return this._97739box;
    }

    public function set box(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._97739box;
        if (oldValue !== value)
        {
            this._97739box = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "box", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property candlestickchart (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'candlestickchart' moved to '_902977563candlestickchart'
	 */

    [Bindable(event="propertyChange")]
    public function get candlestickchart():mx.charts.CandlestickChart
    {
        return this._902977563candlestickchart;
    }

    public function set candlestickchart(value:mx.charts.CandlestickChart):void
    {
    	var oldValue:Object = this._902977563candlestickchart;
        if (oldValue !== value)
        {
            this._902977563candlestickchart = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "candlestickchart", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property down (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'down' moved to '_3089570down'
	 */

    [Bindable(event="propertyChange")]
    public function get down():mx.graphics.SolidColor
    {
        return this._3089570down;
    }

    public function set down(value:mx.graphics.SolidColor):void
    {
    	var oldValue:Object = this._3089570down;
        if (oldValue !== value)
        {
            this._3089570down = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "down", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property haxis (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'haxis' moved to '_99054601haxis'
	 */

    [Bindable(event="propertyChange")]
    public function get haxis():mx.charts.CategoryAxis
    {
        return this._99054601haxis;
    }

    public function set haxis(value:mx.charts.CategoryAxis):void
    {
    	var oldValue:Object = this._99054601haxis;
        if (oldValue !== value)
        {
            this._99054601haxis = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "haxis", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property up (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'up' moved to '_3739up'
	 */

    [Bindable(event="propertyChange")]
    public function get up():mx.graphics.SolidColor
    {
        return this._3739up;
    }

    public function set up(value:mx.graphics.SolidColor):void
    {
    	var oldValue:Object = this._3739up;
        if (oldValue !== value)
        {
            this._3739up = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "up", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property vaxis (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'vaxis' moved to '_111983895vaxis'
	 */

    [Bindable(event="propertyChange")]
    public function get vaxis():mx.charts.LinearAxis
    {
        return this._111983895vaxis;
    }

    public function set vaxis(value:mx.charts.LinearAxis):void
    {
    	var oldValue:Object = this._111983895vaxis;
        if (oldValue !== value)
        {
            this._111983895vaxis = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "vaxis", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property wick (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'wick' moved to '_3649210wick'
	 */

    [Bindable(event="propertyChange")]
    public function get wick():mx.graphics.SolidColorStroke
    {
        return this._3649210wick;
    }

    public function set wick(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._3649210wick;
        if (oldValue !== value)
        {
            this._3649210wick = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "wick", oldValue, value));
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
