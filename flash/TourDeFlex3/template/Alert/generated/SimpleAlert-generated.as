
/**
 *  Generated by mxmlc 4.0
 *
 *  Package:    
 *  Class:      SimpleAlert
 *  Source:     F:\Flash\ApacheFlex\mx\controls\Alert\SimpleAlert.mxml
 *  Template:   flex2/compiler/mxml/gen/ClassDef.vm
 *  Time:       2017.01.04 19:26:51 JST
 */

package 
{

import flash.accessibility.*;
import flash.debugger.*;
import flash.display.*;
import flash.errors.*;
import flash.events.*;
import flash.events.MouseEvent;
import flash.external.*;
import flash.geom.*;
import flash.media.*;
import flash.net.*;
import flash.printing.*;
import flash.profiler.*;
import flash.system.*;
import flash.text.*;
import flash.ui.*;
import flash.utils.*;
import flash.xml.*;
import mx.binding.*;
import mx.controls.HRule;
import mx.core.ClassFactory;
import mx.core.DeferredInstanceFromClass;
import mx.core.DeferredInstanceFromFunction;
import mx.core.IDeferredInstance;
import mx.core.IFactory;
import mx.core.IFlexModuleFactory;
import mx.core.IPropertyChangeNotifier;
import mx.core.mx_internal;
import mx.filters.*;
import mx.styles.*;
import spark.components.Application;
import spark.components.Button;
import spark.components.Label;
import spark.components.Panel;
import spark.components.VGroup;


[Frame(extraClass="_SimpleAlert_FlexInit")]

[Frame(factoryClass="_SimpleAlert_mx_managers_SystemManager")]


public class SimpleAlert
    extends spark.components.Application
{

    [Bindable]
	/**
 * @private
 **/
    public var status : spark.components.Label;





    /**
     * @private
     **/
    public function SimpleAlert()
    {
        super();

        mx_internal::_document = this;




        // layer initializers

       
        // properties
        this.mxmlContentFactory = new mx.core.DeferredInstanceFromFunction(_SimpleAlert_Array1_c);


        // events












    }

    /**
     * @private
     **/ 
    private var __moduleFactoryInitialized:Boolean = false;

    /**
     * @private
     * Override the module factory so we can defer setting style declarations
     * until a module factory is set. Without the correct module factory set
     * the style declaration will end up in the wrong style manager.
     **/ 
    override public function set moduleFactory(factory:IFlexModuleFactory):void
    {
        super.moduleFactory = factory;
        
        if (__moduleFactoryInitialized)
            return;

        __moduleFactoryInitialized = true;


        // our style settings


        // ambient styles
        mx_internal::_SimpleAlert_StylesInit();

                         
    }
 
    /**
     * @private
     **/
    override public function initialize():void
    {


        super.initialize();
    }



            import mx.controls.Alert;
            import mx.events.CloseEvent;

            // Event handler function uses a static method to show
            // a pop-up window with the title, message, and requested buttons.
            private function clickHandler(evt:Event):void {
                Alert.show("Do you want to save your changes?", "Save Changes", Alert.YES|Alert.NO, this, alertClickHandler);
            }

            // Event handler function for displaying the selected Alert button.
            private function alertClickHandler(evt:CloseEvent):void {
                if (evt.detail == Alert.YES) {
                    status.text = "You answered Yes";
                } else {
                    status.text = "You answered No";
                }
            }

            // Event handler function changes the default Button labels and sets the
            // Button widths. If you later use an Alert with the default Buttons, 
            // you must reset these values.
            private function secondClickHandler(evt:Event):void {
                Alert.buttonWidth = 100;
                Alert.yesLabel = "Magenta";
                Alert.noLabel = "Blue";
                Alert.cancelLabel = "Green";

                Alert.show("Select a color:", "Color Selection", Alert.YES|Alert.NO|Alert.CANCEL, this);

                // Set the labels back to normal:
                Alert.yesLabel = "Yes";
                Alert.noLabel = "No";
            }
        



    //  supporting function definitions for properties, events, styles, effects
private function _SimpleAlert_Array1_c() : Array
{
	var temp : Array = [_SimpleAlert_Panel1_c()];
	return temp;
}

private function _SimpleAlert_Panel1_c() : spark.components.Panel
{
	var temp : spark.components.Panel = new spark.components.Panel();
	temp.title = "Halo Alert Control Example";
	temp.percentWidth = 75.0;
	temp.horizontalCenter = 0;
	temp.verticalCenter = 0;
	temp.mxmlContentFactory = new mx.core.DeferredInstanceFromFunction(_SimpleAlert_Array2_c);
	if (!temp.document) temp.document = this;
	return temp;
}

private function _SimpleAlert_Array2_c() : Array
{
	var temp : Array = [_SimpleAlert_VGroup1_c()];
	return temp;
}

private function _SimpleAlert_VGroup1_c() : spark.components.VGroup
{
	var temp : spark.components.VGroup = new spark.components.VGroup();
	temp.left = 10;
	temp.right = 10;
	temp.top = 10;
	temp.bottom = 10;
	temp.mxmlContent = [_SimpleAlert_Label1_c(), _SimpleAlert_Button1_c(), _SimpleAlert_HRule1_c(), _SimpleAlert_Label2_c(), _SimpleAlert_Button2_c(), _SimpleAlert_Label3_i(), _SimpleAlert_HRule2_c(), _SimpleAlert_Label4_c(), _SimpleAlert_Button3_c()];
	if (!temp.document) temp.document = this;
	return temp;
}

private function _SimpleAlert_Label1_c() : spark.components.Label
{
	var temp : spark.components.Label = new spark.components.Label();
	temp.text = "Click the button below to display a simple Alert window.";
	temp.setStyle("color", 255);
	if (!temp.document) temp.document = this;
	return temp;
}

private function _SimpleAlert_Button1_c() : spark.components.Button
{
	var temp : spark.components.Button = new spark.components.Button();
	temp.label = "Click Me";
	temp.addEventListener("click", ___SimpleAlert_Button1_click);
	if (!temp.document) temp.document = this;
	return temp;
}

/**
 * @private
 **/
public function ___SimpleAlert_Button1_click(event:flash.events.MouseEvent):void
{
	Alert.show('Hello World!', 'Message');
}

private function _SimpleAlert_HRule1_c() : mx.controls.HRule
{
	var temp : mx.controls.HRule = new mx.controls.HRule();
	temp.percentWidth = 100.0;
	if (!temp.document) temp.document = this;
	return temp;
}

private function _SimpleAlert_Label2_c() : spark.components.Label
{
	var temp : spark.components.Label = new spark.components.Label();
	temp.text = "Click the button below to display an Alert window and capture the button pressed by the user.";
	temp.setStyle("color", 255);
	if (!temp.document) temp.document = this;
	return temp;
}

private function _SimpleAlert_Button2_c() : spark.components.Button
{
	var temp : spark.components.Button = new spark.components.Button();
	temp.label = "Click Me";
	temp.addEventListener("click", ___SimpleAlert_Button2_click);
	if (!temp.document) temp.document = this;
	return temp;
}

/**
 * @private
 **/
public function ___SimpleAlert_Button2_click(event:flash.events.MouseEvent):void
{
	clickHandler(event);
}

private function _SimpleAlert_Label3_i() : spark.components.Label
{
	var temp : spark.components.Label = new spark.components.Label();
	temp.setStyle("fontWeight", "bold");
	temp.id = "status";
	if (!temp.document) temp.document = this;
	status = temp;
	mx.binding.BindingManager.executeBindings(this, "status", status);
	return temp;
}

private function _SimpleAlert_HRule2_c() : mx.controls.HRule
{
	var temp : mx.controls.HRule = new mx.controls.HRule();
	temp.percentWidth = 100.0;
	if (!temp.document) temp.document = this;
	return temp;
}

private function _SimpleAlert_Label4_c() : spark.components.Label
{
	var temp : spark.components.Label = new spark.components.Label();
	temp.text = "Click the button below to display an Alert window that uses custom Button labels.";
	temp.setStyle("color", 255);
	if (!temp.document) temp.document = this;
	return temp;
}

private function _SimpleAlert_Button3_c() : spark.components.Button
{
	var temp : spark.components.Button = new spark.components.Button();
	temp.label = "Click Me";
	temp.addEventListener("click", ___SimpleAlert_Button3_click);
	if (!temp.document) temp.document = this;
	return temp;
}

/**
 * @private
 **/
public function ___SimpleAlert_Button3_click(event:flash.events.MouseEvent):void
{
	secondClickHandler(event);
}




    mx_internal var _SimpleAlert_StylesInit_done:Boolean = false;

    mx_internal function _SimpleAlert_StylesInit():void
    {
        //  only add our style defs to the style manager once
        if (mx_internal::_SimpleAlert_StylesInit_done)
            return;
        else
            mx_internal::_SimpleAlert_StylesInit_done = true;
            
        var style:CSSStyleDeclaration;
        var effects:Array;
                    

        var conditions:Array;
        var condition:CSSCondition;
        var selector:CSSSelector;

        styleManager.initProtoChainRoots();
    }




}

}
