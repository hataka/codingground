

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.IEventDispatcher;
import mx.core.IPropertyChangeNotifier;
import mx.events.PropertyChangeEvent;
import mx.utils.ObjectProxy;
import mx.utils.UIDUtil;

import mx.charts.PieChart;
import mx.graphics.SolidColorStroke;
import mx.graphics.SolidColor;
import mx.collections.ArrayCollection;

class BindableProperty
{
	/*
	 * generated bindable wrapper for property callouts (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'callouts' moved to '_171813309callouts'
	 */

    [Bindable(event="propertyChange")]
    public function get callouts():mx.graphics.SolidColorStroke
    {
        return this._171813309callouts;
    }

    public function set callouts(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._171813309callouts;
        if (oldValue !== value)
        {
            this._171813309callouts = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "callouts", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property chart (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'chart' moved to '_94623710chart'
	 */

    [Bindable(event="propertyChange")]
    public function get chart():mx.charts.PieChart
    {
        return this._94623710chart;
    }

    public function set chart(value:mx.charts.PieChart):void
    {
    	var oldValue:Object = this._94623710chart;
        if (oldValue !== value)
        {
            this._94623710chart = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "chart", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property pieborder (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'pieborder' moved to '_95276216pieborder'
	 */

    [Bindable(event="propertyChange")]
    public function get pieborder():mx.graphics.SolidColorStroke
    {
        return this._95276216pieborder;
    }

    public function set pieborder(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._95276216pieborder;
        if (oldValue !== value)
        {
            this._95276216pieborder = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "pieborder", oldValue, value));
        }
    }

	/*
	 * generated bindable wrapper for property radial (public)
	 * - generated setter
	 * - generated getter
	 * - original public var 'radial' moved to '_938579425radial'
	 */

    [Bindable(event="propertyChange")]
    public function get radial():mx.graphics.SolidColorStroke
    {
        return this._938579425radial;
    }

    public function set radial(value:mx.graphics.SolidColorStroke):void
    {
    	var oldValue:Object = this._938579425radial;
        if (oldValue !== value)
        {
            this._938579425radial = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "radial", oldValue, value));
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
	 * generated bindable wrapper for property medalsAC (private)
	 * - generated setter
	 * - generated getter
	 * - original private var 'medalsAC' moved to '_907816578medalsAC'
	 */

    [Bindable(event="propertyChange")]
    private function get medalsAC():ArrayCollection
    {
        return this._907816578medalsAC;
    }

    private function set medalsAC(value:ArrayCollection):void
    {
    	var oldValue:Object = this._907816578medalsAC;
        if (oldValue !== value)
        {
            this._907816578medalsAC = value;
           if (this.hasEventListener("propertyChange"))
               this.dispatchEvent(mx.events.PropertyChangeEvent.createUpdateEvent(this, "medalsAC", oldValue, value));
        }
    }



}
