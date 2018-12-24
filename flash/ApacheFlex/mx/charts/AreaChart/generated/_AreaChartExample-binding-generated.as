

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.charts.LineChart;
import mx.graphics.SolidColorStroke;
import mx.charts.AreaChart;
import mx.graphics.SolidColor;
import mx.collections.ArrayCollection;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property Areachart (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'Areachart' moved to '_1906669393Areachart'
	 */

    [Bindable(event="propertyChange")]
    public function get Areachart():mx.charts.AreaChart
    {
        return this._1906669393Areachart;
    }

    public function set Areachart(value:mx.charts.AreaChart):void
    {
    	var oldValue:Object = this._1906669393Areachart;
        if (oldValue !== value)
        {
            this._1906669393Areachart = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "Areachart", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property linechart (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'linechart' moved to '_1792737174linechart'
	 */

    [Bindable(event="propertyChange")]
    public function get linechart():mx.charts.LineChart
    {
        return this._1792737174linechart;
    }

    public function set linechart(value:mx.charts.LineChart):void
    {
    	var oldValue:Object = this._1792737174linechart;
        if (oldValue !== value)
        {
            this._1792737174linechart = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "linechart", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property s1 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 's1' moved to '_3614s1'
	 */

    [Bindable(event="propertyChange")]
    public function get s1():mx.graphics.SolidColorStroke
    {
        return this._3614s1;
    }

    public function set s1(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._3614s1;
        if (oldValue !== value)
        {
            this._3614s1 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "s1", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property s2 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 's2' moved to '_3615s2'
	 */

    [Bindable(event="propertyChange")]
    public function get s2():mx.graphics.SolidColorStroke
    {
        return this._3615s2;
    }

    public function set s2(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._3615s2;
        if (oldValue !== value)
        {
            this._3615s2 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "s2", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property s3 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 's3' moved to '_3616s3'
	 */

    [Bindable(event="propertyChange")]
    public function get s3():mx.graphics.SolidColorStroke
    {
        return this._3616s3;
    }

    public function set s3(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._3616s3;
        if (oldValue !== value)
        {
            this._3616s3 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "s3", oldValue, value));
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
	 * generated bindable wrapper for property sc2 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'sc2' moved to '_113634sc2'
	 */

    [Bindable(event="propertyChange")]
    public function get sc2():mx.graphics.SolidColor
    {
        return this._113634sc2;
    }

    public function set sc2(value:mx.graphics.SolidColor):void
    {
    	var oldValue:Object = this._113634sc2;
        if (oldValue !== value)
        {
            this._113634sc2 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "sc2", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property sc3 (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'sc3' moved to '_113635sc3'
	 */

    [Bindable(event="propertyChange")]
    public function get sc3():mx.graphics.SolidColor
    {
        return this._113635sc3;
    }

    public function set sc3(value:mx.graphics.SolidColor):void
    {
    	var oldValue:Object = this._113635sc3;
        if (oldValue !== value)
        {
            this._113635sc3 = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "sc3", oldValue, value));
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
