
/**
 *  Generated by mxmlc 4.0
 *
 *  Package:    
 *  Class:      ThirdPartyTab
 *  Source:     F:\codingground\flash\TourDeFlex3\explorer\ThirdPartyTab.mxml
 *  Template:   flex2/compiler/mxml/gen/ClassDef.vm
 *  Time:       2017.01.04 21:38:07 JST
 */

package 
{

import flash.accessibility.*;
import flash.debugger.*;
import flash.display.*;
import flash.errors.*;
import flash.events.*;
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
import flashx.textLayout.elements.ParagraphElement;
import mx.binding.*;
import mx.containers.VBox;
import mx.core.ClassFactory;
import mx.core.DeferredInstanceFromClass;
import mx.core.DeferredInstanceFromFunction;
import mx.core.IDeferredInstance;
import mx.core.IFactory;
import mx.core.IFlexModuleFactory;
import mx.core.IPropertyChangeNotifier;
import mx.core.UIComponentDescriptor;
import mx.core.mx_internal;
import mx.filters.*;
import mx.styles.*;
import spark.components.RichText;



public class ThirdPartyTab
    extends mx.containers.VBox
{




private var _documentDescriptor_ : mx.core.UIComponentDescriptor = 
new mx.core.UIComponentDescriptor({
  type: mx.containers.VBox
  ,
  propertiesFactory: function():Object { return {
    childDescriptors: [
      new mx.core.UIComponentDescriptor({
        type: spark.components.RichText
        ,
        propertiesFactory: function():Object { return {
          percentWidth: 100.0,
          percentHeight: 100.0,
          content: ["\n\t\t", _ThirdPartyTab_ParagraphElement1_c(), "\n\t"]
        }}
      })
    ]
  }}
})

    /**
     * @private
     **/
    public function ThirdPartyTab()
    {
        super();

        mx_internal::_document = this;




        // layer initializers

       
        // properties
        this.label = "3rd Party Example";
        this.percentWidth = 100.0;
        this.percentHeight = 100.0;


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
        //  initialize component styles
        if (!this.styleDeclaration)
        {
            this.styleDeclaration = new CSSStyleDeclaration(null, styleManager);
        }

        this.styleDeclaration.defaultFactory = function():void
        {
            this.paddingTop = 10;
            this.paddingBottom = 10;
            this.paddingLeft = 20;
            this.paddingRight = 20;
            this.borderStyle = "solid";
        };



                         
    }
 
    /**
     * @private
     **/
    override public function initialize():void
    {
        mx_internal::setDocumentDescriptor(_documentDescriptor_);


        super.initialize();
    }




    //  supporting function definitions for properties, events, styles, effects
private function _ThirdPartyTab_ParagraphElement1_c() : flashx.textLayout.elements.ParagraphElement
{
	var temp : flashx.textLayout.elements.ParagraphElement = new flashx.textLayout.elements.ParagraphElement();
	temp.mxmlChildren = ["This example or component has been developed by a 3rd party and is hosted outside of the Tour De Flex site and may contain links to non ASF sites. It's code may not be Open Source or may be under a license other than the Apache license so please check carefully before using it. Neither the ASF or the Apache Flex PMC can endorse or recommend using this example but you may still find it useful."];
	temp.initialized(this, null)
	return temp;
}







}

}
