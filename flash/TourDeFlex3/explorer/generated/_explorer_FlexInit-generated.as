package {
import flash.display.DisplayObject;
import flash.utils.*;
import mx.core.IFlexModuleFactory;
import mx.styles.IStyleManager2;
import mx.events.Request;
import mx.styles.StyleManagerImpl;
import mx.managers.systemClasses.ChildManager;
import mx.core.TextFieldFactory; TextFieldFactory;
import flash.system.*
import mx.accessibility.LabelAccImpl;
import mx.accessibility.UIComponentAccProps;
import mx.accessibility.ButtonAccImpl;
import mx.accessibility.TreeAccImpl;
import spark.accessibility.TextBaseAccImpl;
import mx.accessibility.PanelAccImpl;
import mx.accessibility.AlertAccImpl;
import mx.accessibility.TabBarAccImpl;
import mx.accessibility.ListAccImpl;
import mx.accessibility.ListBaseAccImpl;
import flash.net.registerClassAlias;
import flash.net.getClassByAlias;
import mx.managers.SystemManagerGlobals;
import mx.resources.ResourceManager;
import mx.collections.ArrayCollection;
import mx.collections.ArrayList;
import mx.messaging.config.ConfigMap;
import mx.messaging.messages.AcknowledgeMessage;
import mx.messaging.messages.AcknowledgeMessageExt;
import mx.messaging.messages.AsyncMessage;
import mx.messaging.messages.AsyncMessageExt;
import mx.messaging.messages.CommandMessage;
import mx.messaging.messages.CommandMessageExt;
import mx.messaging.messages.ErrorMessage;
import mx.messaging.messages.HTTPRequestMessage;
import mx.messaging.messages.MessagePerformanceInfo;
import mx.utils.ObjectProxy;
import mx.effects.EffectManager;
import mx.core.mx_internal;

[Mixin]
public class _explorer_FlexInit
{
   public function _explorer_FlexInit()
   {
       super();
   }
   public static function init(fbs:IFlexModuleFactory):void
   {
       new ChildManager(fbs);
       var styleManager:IStyleManager2;
       styleManager = new StyleManagerImpl(fbs);
       EffectManager.mx_internal::registerEffectTrigger("addedEffect", "added");
       EffectManager.mx_internal::registerEffectTrigger("completeEffect", "complete");
       EffectManager.mx_internal::registerEffectTrigger("creationCompleteEffect", "creationComplete");
       EffectManager.mx_internal::registerEffectTrigger("focusInEffect", "focusIn");
       EffectManager.mx_internal::registerEffectTrigger("focusOutEffect", "focusOut");
       EffectManager.mx_internal::registerEffectTrigger("hideEffect", "hide");
       EffectManager.mx_internal::registerEffectTrigger("itemsChangeEffect", "itemsChange");
       EffectManager.mx_internal::registerEffectTrigger("mouseDownEffect", "mouseDown");
       EffectManager.mx_internal::registerEffectTrigger("mouseUpEffect", "mouseUp");
       EffectManager.mx_internal::registerEffectTrigger("moveEffect", "move");
       EffectManager.mx_internal::registerEffectTrigger("removedEffect", "removed");
       EffectManager.mx_internal::registerEffectTrigger("resizeEffect", "resize");
       EffectManager.mx_internal::registerEffectTrigger("resizeEndEffect", "resizeEnd");
       EffectManager.mx_internal::registerEffectTrigger("resizeStartEffect", "resizeStart");
       EffectManager.mx_internal::registerEffectTrigger("rollOutEffect", "rollOut");
       EffectManager.mx_internal::registerEffectTrigger("rollOverEffect", "rollOver");
       EffectManager.mx_internal::registerEffectTrigger("showEffect", "show");
       // trace("Flex accessibility startup: " + Capabilities.hasAccessibility);
       if (Capabilities.hasAccessibility) {
          mx.accessibility.LabelAccImpl.enableAccessibility();
          mx.accessibility.UIComponentAccProps.enableAccessibility();
          mx.accessibility.ButtonAccImpl.enableAccessibility();
          mx.accessibility.TreeAccImpl.enableAccessibility();
          spark.accessibility.TextBaseAccImpl.enableAccessibility();
          mx.accessibility.PanelAccImpl.enableAccessibility();
          mx.accessibility.AlertAccImpl.enableAccessibility();
          mx.accessibility.TabBarAccImpl.enableAccessibility();
          mx.accessibility.ListAccImpl.enableAccessibility();
          mx.accessibility.ListBaseAccImpl.enableAccessibility();
       }
       // mx.collections.ArrayCollection
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.io.ArrayCollection") != mx.collections.ArrayCollection) 
           { 
               flash.net.registerClassAlias("flex.messaging.io.ArrayCollection", mx.collections.ArrayCollection); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.io.ArrayCollection", mx.collections.ArrayCollection); 
       } 

       // mx.collections.ArrayList
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.io.ArrayList") != mx.collections.ArrayList) 
           { 
               flash.net.registerClassAlias("flex.messaging.io.ArrayList", mx.collections.ArrayList); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.io.ArrayList", mx.collections.ArrayList); 
       } 

       // mx.messaging.config.ConfigMap
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.config.ConfigMap") != mx.messaging.config.ConfigMap) 
           { 
               flash.net.registerClassAlias("flex.messaging.config.ConfigMap", mx.messaging.config.ConfigMap); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.config.ConfigMap", mx.messaging.config.ConfigMap); 
       } 

       // mx.messaging.messages.AcknowledgeMessage
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.messages.AcknowledgeMessage") != mx.messaging.messages.AcknowledgeMessage) 
           { 
               flash.net.registerClassAlias("flex.messaging.messages.AcknowledgeMessage", mx.messaging.messages.AcknowledgeMessage); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.messages.AcknowledgeMessage", mx.messaging.messages.AcknowledgeMessage); 
       } 

       // mx.messaging.messages.AcknowledgeMessageExt
       try 
       { 
           if (flash.net.getClassByAlias("DSK") != mx.messaging.messages.AcknowledgeMessageExt) 
           { 
               flash.net.registerClassAlias("DSK", mx.messaging.messages.AcknowledgeMessageExt); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("DSK", mx.messaging.messages.AcknowledgeMessageExt); 
       } 

       // mx.messaging.messages.AsyncMessage
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.messages.AsyncMessage") != mx.messaging.messages.AsyncMessage) 
           { 
               flash.net.registerClassAlias("flex.messaging.messages.AsyncMessage", mx.messaging.messages.AsyncMessage); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.messages.AsyncMessage", mx.messaging.messages.AsyncMessage); 
       } 

       // mx.messaging.messages.AsyncMessageExt
       try 
       { 
           if (flash.net.getClassByAlias("DSA") != mx.messaging.messages.AsyncMessageExt) 
           { 
               flash.net.registerClassAlias("DSA", mx.messaging.messages.AsyncMessageExt); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("DSA", mx.messaging.messages.AsyncMessageExt); 
       } 

       // mx.messaging.messages.CommandMessage
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.messages.CommandMessage") != mx.messaging.messages.CommandMessage) 
           { 
               flash.net.registerClassAlias("flex.messaging.messages.CommandMessage", mx.messaging.messages.CommandMessage); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.messages.CommandMessage", mx.messaging.messages.CommandMessage); 
       } 

       // mx.messaging.messages.CommandMessageExt
       try 
       { 
           if (flash.net.getClassByAlias("DSC") != mx.messaging.messages.CommandMessageExt) 
           { 
               flash.net.registerClassAlias("DSC", mx.messaging.messages.CommandMessageExt); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("DSC", mx.messaging.messages.CommandMessageExt); 
       } 

       // mx.messaging.messages.ErrorMessage
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.messages.ErrorMessage") != mx.messaging.messages.ErrorMessage) 
           { 
               flash.net.registerClassAlias("flex.messaging.messages.ErrorMessage", mx.messaging.messages.ErrorMessage); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.messages.ErrorMessage", mx.messaging.messages.ErrorMessage); 
       } 

       // mx.messaging.messages.HTTPRequestMessage
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.messages.HTTPMessage") != mx.messaging.messages.HTTPRequestMessage) 
           { 
               flash.net.registerClassAlias("flex.messaging.messages.HTTPMessage", mx.messaging.messages.HTTPRequestMessage); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.messages.HTTPMessage", mx.messaging.messages.HTTPRequestMessage); 
       } 

       // mx.messaging.messages.MessagePerformanceInfo
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.messages.MessagePerformanceInfo") != mx.messaging.messages.MessagePerformanceInfo) 
           { 
               flash.net.registerClassAlias("flex.messaging.messages.MessagePerformanceInfo", mx.messaging.messages.MessagePerformanceInfo); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.messages.MessagePerformanceInfo", mx.messaging.messages.MessagePerformanceInfo); 
       } 

       // mx.utils.ObjectProxy
       try 
       { 
           if (flash.net.getClassByAlias("flex.messaging.io.ObjectProxy") != mx.utils.ObjectProxy) 
           { 
               flash.net.registerClassAlias("flex.messaging.io.ObjectProxy", mx.utils.ObjectProxy); 
           } 
       } 
       catch (e:Error) 
       { 
           flash.net.registerClassAlias("flex.messaging.io.ObjectProxy", mx.utils.ObjectProxy); 
       } 

       var styleNames:Array = ["paragraphStartIndent", "kerning", "breakOpportunity", "alternatingItemColors", "leading", "wordSpacing", "fontAntiAliasType", "selectionColor", "cffHinting", "contentBackgroundAlpha", "fontFamily", "digitCase", "textSelectedColor", "clearFloats", "layoutDirection", "paragraphEndIndent", "ligatureLevel", "dropShadowColor", "downColor", "fontWeight", "dividerColor", "interactionMode", "dominantBaseline", "textAlign", "accentColor", "fontSharpness", "justificationStyle", "footerColors", "headerColors", "whiteSpaceCollapse", "contentBackgroundColor", "textDecoration", "fontLookup", "fontStyle", "chromeColor", "digitWidth", "focusColor", "themeColor", "listAutoPadding", "blockProgression", "listStyleType", "fontSize", "textRollOverColor", "textAlignLast", "selectionDisabledColor", "fontGridFitType", "trackingRight", "showErrorSkin", "errorColor", "paragraphSpaceAfter", "justificationRule", "color", "backgroundDisabledColor", "textShadowColor", "unfocusedTextSelectionColor", "paragraphSpaceBefore", "textIndent", "locale", "barColor", "textAlpha", "baselineShift", "fontThickness", "touchDelay", "textShadowAlpha", "renderingMode", "textJustify", "textRotation", "tabStops", "direction", "firstBaselineOffset", "lineThrough", "symbolColor", "depthColors", "focusedTextSelectionColor", "letterSpacing", "disabledColor", "alignmentBaseline", "trackingLeft", "modalTransparencyColor", "rollOverColor", "modalTransparencyBlur", "listStylePosition", "modalTransparencyDuration", "modalTransparency", "inactiveTextSelectionColor", "lineHeight", "leadingModel", "showErrorTip", "typographicCase"];

       for (var i:int = 0; i < styleNames.length; i++)
       {
          styleManager.registerInheritingStyle(styleNames[i]);
       }
   }
}  // FlexInit
}  // package
