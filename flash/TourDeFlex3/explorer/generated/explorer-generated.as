
/**
 *  Generated by mxmlc 4.0
 *
 *  Package:    
 *  Class:      explorer
 *  Source:     F:\codingground\flash\TourDeFlex3\explorer\explorer.mxml
 *  Template:   flex2/compiler/mxml/gen/ClassDef.vm
 *  Time:       2017.01.04 21:38:06 JST
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
import loaderPanel;
import mx.binding.*;
import mx.binding.IBindingClient;
import mx.containers.HBox;
import mx.containers.HDividedBox;
import mx.containers.Panel;
import mx.containers.VBox;
import mx.containers.VDividedBox;
import mx.controls.Image;
import mx.controls.Label;
import mx.controls.Spacer;
import mx.controls.Tree;
import mx.core.Application;
import mx.core.ClassFactory;
import mx.core.DeferredInstanceFromClass;
import mx.core.DeferredInstanceFromFunction;
import mx.core.IDeferredInstance;
import mx.core.IFactory;
import mx.core.IFlexModuleFactory;
import mx.core.IPropertyChangeNotifier;
import mx.core.UIComponentDescriptor;
import mx.core.mx_internal;
import mx.events.FlexEvent;
import mx.events.ListEvent;
import mx.filters.*;
import mx.styles.*;
import viewsource;


[SWF( heightPercent='100%', pageTitle='{TITLE}', widthPercent='100%')]
[Frame(extraClass="_explorer_FlexInit")]

[Frame(factoryClass="_explorer_mx_managers_SystemManager")]


public class explorer
    extends mx.core.Application
    implements mx.binding.IBindingClient
{

/**
 * @private
 **/
    public var _explorer_Label1 : mx.controls.Label;

/**
 * @private
 **/
    public var _explorer_Label2 : mx.controls.Label;

/**
 * @private
 **/
    public var _explorer_Panel1 : mx.containers.Panel;

    [Bindable]
	/**
 * @private
 **/
    public var compLibTree : mx.controls.Tree;

    [Bindable]
	/**
 * @private
 **/
    public var explorerTree : XML;

    [Bindable]
	/**
 * @private
 **/
    public var swfLoader : loaderPanel;

    [Bindable]
	/**
 * @private
 **/
    public var vs : viewsource;




private var _documentDescriptor_ : mx.core.UIComponentDescriptor = 
new mx.core.UIComponentDescriptor({
  type: mx.core.Application
  ,
  propertiesFactory: function():Object { return {
    childDescriptors: [
      new mx.core.UIComponentDescriptor({
        type: mx.containers.HBox
        ,
        propertiesFactory: function():Object { return {
          percentWidth: 100.0,
          childDescriptors: [
            new mx.core.UIComponentDescriptor({
              type: mx.controls.Image
              ,
              events: {
                click: "___explorer_Image1_click"
              }
              ,
              propertiesFactory: function():Object { return {
                source: "./mx/controls/assets/ApacheFlexIcon.png",
                useHandCursor: true,
                buttonMode: true
              }}
            })
          ,
            new mx.core.UIComponentDescriptor({
              type: mx.controls.Label
              ,
              id: "_explorer_Label1"
              ,
              stylesFactory: function():void {
                this.fontSize = 20;
                this.fontWeight = "bold";
              }
            })
          ,
            new mx.core.UIComponentDescriptor({
              type: mx.controls.Spacer
              ,
              propertiesFactory: function():Object { return {
                percentWidth: 100.0
              }}
            })
          ,
            new mx.core.UIComponentDescriptor({
              type: mx.controls.Label
              ,
              id: "_explorer_Label2"
            })
          ]
        }}
      })
    ,
      new mx.core.UIComponentDescriptor({
        type: mx.containers.HDividedBox
        ,
        propertiesFactory: function():Object { return {
          percentWidth: 100.0,
          percentHeight: 100.0,
          childDescriptors: [
            new mx.core.UIComponentDescriptor({
              type: mx.containers.Panel
              ,
              id: "_explorer_Panel1"
              ,
              stylesFactory: function():void {
                this.dropShadowVisible = false;
              }
              ,
              propertiesFactory: function():Object { return {
                percentWidth: 30.0,
                percentHeight: 100.0,
                childDescriptors: [
                  new mx.core.UIComponentDescriptor({
                    type: mx.controls.Tree
                    ,
                    id: "compLibTree"
                    ,
                    events: {
                      change: "__compLibTree_change"
                    }
                    ,
                    stylesFactory: function():void {
                      this.borderStyle = "none";
                    }
                    ,
                    propertiesFactory: function():Object { return {
                      percentWidth: 100.0,
                      percentHeight: 100.0,
                      showRoot: false,
                      labelField: "@label"
                    }}
                  })
                ]
              }}
            })
          ,
            new mx.core.UIComponentDescriptor({
              type: mx.containers.VDividedBox
              ,
              propertiesFactory: function():Object { return {
                percentWidth: 100.0,
                percentHeight: 100.0,
                childDescriptors: [
                  new mx.core.UIComponentDescriptor({
                    type: loaderPanel
                    ,
                    id: "swfLoader"
                    ,
                    propertiesFactory: function():Object { return {
                      percentWidth: 100.0,
                      percentHeight: 50.0
                    }}
                  })
                ,
                  new mx.core.UIComponentDescriptor({
                    type: mx.containers.VBox
                    ,
                    stylesFactory: function():void {
                      this.backgroundColor = 16777215;
                    }
                    ,
                    propertiesFactory: function():Object { return {
                      percentWidth: 100.0,
                      percentHeight: 50.0,
                      childDescriptors: [
                        new mx.core.UIComponentDescriptor({
                          type: viewsource
                          ,
                          id: "vs"
                          ,
                          propertiesFactory: function():Object { return {
                            percentWidth: 100.0,
                            percentHeight: 100.0
                          }}
                        })
                      ]
                    }}
                  })
                ]
              }}
            })
          ]
        }}
      })
    ,
      new mx.core.UIComponentDescriptor({
        type: mx.containers.HBox
        ,
        propertiesFactory: function():Object { return {
          percentWidth: 100.0,
          childDescriptors: [
            new mx.core.UIComponentDescriptor({
              type: mx.controls.Label
              ,
              stylesFactory: function():void {
                this.fontSize = 9;
              }
              ,
              propertiesFactory: function():Object { return {
                percentWidth: 100.0,
                text: "Copyright © 2014 The Apache Software Foundation, Licensed under the Apache License, Version 2.0. Apache Flex is trademark of The Apache Software Foundation."
              }}
            })
          ]
        }}
      })
    ]
  }}
})

    /**
     * @private
     **/
    public function explorer()
    {
        super();

        mx_internal::_document = this;


        var bindings:Array = _explorer_bindingsSetup();
        var watchers:Array = [];

        var target:Object = this;

        if (_watcherSetupUtil == null)
        {
            var watcherSetupUtilClass:Object = getDefinitionByName("_explorerWatcherSetupUtil");
            watcherSetupUtilClass["init"](null);
        }

        _watcherSetupUtil.setup(this,
                    function(propertyName:String):* { return target[propertyName]; },
                    function(propertyName:String):* { return explorer[propertyName]; },
                    bindings,
                    watchers);

        mx_internal::_bindings = mx_internal::_bindings.concat(bindings);
        mx_internal::_watchers = mx_internal::_watchers.concat(watchers);


        // layer initializers

       
        // properties
        this.layout = "vertical";
        _explorer_XML1_i();


        // events
        this.addEventListener("initialize", ___explorer_Application1_initialize);
        this.addEventListener("creationComplete", ___explorer_Application1_creationComplete);










        for (var i:uint = 0; i < bindings.length; i++)
        {
            Binding(bindings[i]).execute();
        }


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
            this.paddingBottom = 2;
            this.paddingTop = 2;
            this.paddingLeft = 2;
            this.paddingRight = 2;
        };


        // ambient styles
        mx_internal::_explorer_StylesInit();

                         
    }
 
    /**
     * @private
     **/
    override public function initialize():void
    {
        mx_internal::setDocumentDescriptor(_documentDescriptor_);


        super.initialize();
    }



		import mx.core.FlexGlobals;

		static protected const VERSION:String = "1.2";	
		static protected const TITLE:String = "Tour De Flex Component Explorer";
		static protected const FULL_TITLE:String = "Apache Flex® Tour De Flex Component Explorer " + VERSION;

		[Embed(source="explorer.xml", mimeType="application/octet-stream")]
		private var XMLData:Class;
			
		[Bindable]
		protected var noExamples:int = 0;
			
		private function init():void
		{
			var data:XML = XML(new XMLData());
			
            explorerTree = XML(data.node);
            compLibTree.dataProvider = explorerTree;
			
			noExamples = (explorerTree..node.(hasOwnProperty("@app") && @app.length() > 0)).length();
			
			var loader:URLLoader = new URLLoader();
			var request:URLRequest = new URLRequest("3rdparty.xml");
			loader.addEventListener(Event.COMPLETE, load3rdParty);
			loader.load(request);
		}
			
		protected function load3rdParty(event:Event):void
		{
		  var loader:URLLoader = URLLoader(event.target);
		  var newNode:XML = new XML(loader.data);
		  
		  if (newNode..node.length() > 0) {
			  explorerTree.appendChild(newNode.node);
              compLibTree.dataProvider = explorerTree;
			  noExamples += (newNode..node.(hasOwnProperty("@app") && @app.length() > 0)).length();
		  }
		}
					
		protected function checkParameters():void
		{		
			var parameters:Object = FlexGlobals.topLevelApplication.parameters;
			
			if (parameters.hasOwnProperty("app")) {
				var application:String = parameters.app;
				var source:String = explorerTree..node.(hasOwnProperty("@app") && @app == application).@src;
				loadApp(application, source, false);
				openNode(application);
			}
			else {
				loadApp("Welcome", null, false);
			}
		}

        private function treeChanged(event:Event):void
        {
            var nodeApp:String = compLibTree.selectedItem.@app;
			var link:String = compLibTree.selectedItem.hasOwnProperty("@link") ? compLibTree.selectedItem.@link : "";
			var thirdParty:Boolean = compLibTree.selectedItem.hasOwnProperty("@thirdParty")
				&& compLibTree.selectedItem.@thirdParty == "true";
			
            if (nodeApp != null && nodeApp != "")
            {
				loadApp(nodeApp, compLibTree.selectedItem.@src, thirdParty, link);
            }
            else
            {
                compLibTree.expandItem(compLibTree.selectedItem, true, true);
            }
        }
			
		private function loadApp(application:String, source:String, thirdParty:Boolean, link:String=""):void
		{
			if (application.indexOf(".swf") > 0) {
				swfLoader.loadApp(application);
			}
			else if(application.indexOf(".jpg") > 0 || application.indexOf(".png") > 0)
			{
				swfLoader.loadApp(application,link);
			}
			else {
				swfLoader.loadApp(application + ".swf");
			}
			if (thirdParty) {
				vs.thirdPartyWarning();
			}
			else {
            	vs.loadSource(application, source);
			}
		}
			
		private function gotoHome(event:Event):void
		{
			var urlRequest:URLRequest = new URLRequest("http://flex.apache.org/download-tourdeflex.html");
			navigateToURL(urlRequest);
		}
		
		private function openNode(application:String):void
		{
			var node:XML = explorerTree..node.(hasOwnProperty("@app") && @app == application)[0];
			var parent:XML;
			var nodes:Array = [];
			 
			if (!node) {
				return;
			}
			
			parent = node.parent();
			 
			while (parent != null) {
			    if (!compLibTree.isItemOpen(parent)) {
			        nodes.push(parent);
			    }
			    parent = parent.parent();
			}
			 
			for each (var expand:XML in nodes) {
			    compLibTree.expandItem(expand, true);
			}
			 
			compLibTree.selectedIndex = compLibTree.getItemIndex(node);
			compLibTree.scrollToIndex(explorerTree.selectedIndex);
		}
	
		



    //  supporting function definitions for properties, events, styles, effects
private function _explorer_XML1_i() : XML
{
	var temp : XML = null;
	explorerTree = temp;
	mx.binding.BindingManager.executeBindings(this, "explorerTree", explorerTree);
	return temp;
}

/**
 * @private
 **/
public function ___explorer_Application1_initialize(event:mx.events.FlexEvent):void
{
	init()
}

/**
 * @private
 **/
public function ___explorer_Application1_creationComplete(event:mx.events.FlexEvent):void
{
	checkParameters()
}

/**
 * @private
 **/
public function ___explorer_Image1_click(event:flash.events.MouseEvent):void
{
	gotoHome(event)
}

/**
 * @private
 **/
public function __compLibTree_change(event:mx.events.ListEvent):void
{
	treeChanged(event)
}


    //  binding mgmt
    private function _explorer_bindingsSetup():Array
    {
        var result:Array = [];

        result[0] = new mx.binding.Binding(this,
            function():String
            {
                var result:* = (FULL_TITLE);
                return (result == undefined ? null : String(result));
            },
            null,
            "_explorer_Label1.text"
            );

        result[1] = new mx.binding.Binding(this,
            function():String
            {
                var result:* = (noExamples) + " examples";
                return (result == undefined ? null : String(result));
            },
            null,
            "_explorer_Label2.text"
            );

        result[2] = new mx.binding.Binding(this,
            function():String
            {
                var result:* = (TITLE);
                return (result == undefined ? null : String(result));
            },
            null,
            "_explorer_Panel1.title"
            );


        return result;
    }


    /**
     * @private
     **/
    public static function set watcherSetupUtil(watcherSetupUtil:IWatcherSetupUtil2):void
    {
        (explorer)._watcherSetupUtil = watcherSetupUtil;
    }

    private static var _watcherSetupUtil:IWatcherSetupUtil2;


    mx_internal var _explorer_StylesInit_done:Boolean = false;

    mx_internal function _explorer_StylesInit():void
    {
        //  only add our style defs to the style manager once
        if (mx_internal::_explorer_StylesInit_done)
            return;
        else
            mx_internal::_explorer_StylesInit_done = true;
            
        var style:CSSStyleDeclaration;
        var effects:Array;
                    

        var conditions:Array;
        var condition:CSSCondition;
        var selector:CSSSelector;

        styleManager.initProtoChainRoots();
    }



    /**
     * @private
     **/
    mx_internal var _bindings : Array = [];
    /**
     * @private
     **/
    mx_internal var _watchers : Array = [];
    /**
     * @private
     **/
    mx_internal var _bindingsByDestination : Object = {};
    /**
     * @private
     **/
    mx_internal var _bindingsBeginWithWord : Object = {};

}

}