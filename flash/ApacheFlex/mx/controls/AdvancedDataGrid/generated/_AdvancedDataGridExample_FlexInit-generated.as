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
import mx.accessibility.PanelAccImpl;
import mx.accessibility.AdvancedDataGridAccImpl;
import mx.accessibility.ListBaseAccImpl;
import mx.accessibility.ButtonAccImpl;
import mx.accessibility.UIComponentAccProps;
import flash.net.registerClassAlias;
import flash.net.getClassByAlias;
import mx.managers.SystemManagerGlobals;
import mx.resources.ResourceManager;
import mx.collections.ArrayCollection;
import mx.collections.ArrayList;
import mx.utils.ObjectProxy;
import mx.effects.EffectManager;
import mx.core.mx_internal;

[Mixin]
public class _AdvancedDataGridExample_FlexInit
{
   public function _AdvancedDataGridExample_FlexInit()
   {
       super();
   }
   public static function init(fbs:IFlexModuleFactory):void
   {
       new ChildManager(fbs);
       var styleManager:IStyleManager2;
       styleManager = new StyleManagerImpl(fbs);
       EffectManager.mx_internal::registerEffectTrigger("addedEffect", "added");
       EffectManager.mx_internal::registerEffectTrigger("creationCompleteEffect", "creationComplete");
       EffectManager.mx_internal::registerEffectTrigger("focusInEffect", "focusIn");
       EffectManager.mx_internal::registerEffectTrigger("focusOutEffect", "focusOut");
       EffectManager.mx_internal::registerEffectTrigger("hideEffect", "hide");
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
          mx.accessibility.PanelAccImpl.enableAccessibility();
          mx.accessibility.AdvancedDataGridAccImpl.enableAccessibility();
          mx.accessibility.ListBaseAccImpl.enableAccessibility();
          mx.accessibility.ButtonAccImpl.enableAccessibility();
          mx.accessibility.UIComponentAccProps.enableAccessibility();
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

       var styleNames:Array = ["sortFontSize", "lineHeight", "unfocusedTextSelectionColor", "kerning", "iconColor", "listAutoPadding", "textDecoration", "showErrorTip", "dominantBaseline", "fontThickness", "textShadowColor", "depthColors", "blockProgression", "textAlignLast", "listStylePosition", "textShadowAlpha", "textAlpha", "chromeColor", "rollOverColor", "fontSize", "paragraphEndIndent", "fontWeight", "breakOpportunity", "leading", "renderingMode", "symbolColor", "paragraphStartIndent", "layoutDirection", "footerColors", "contentBackgroundColor", "paragraphSpaceAfter", "digitWidth", "ligatureLevel", "touchDelay", "firstBaselineOffset", "fontLookup", "paragraphSpaceBefore", "fontFamily", "lineThrough", "alignmentBaseline", "trackingLeft", "separatorColor", "fontStyle", "dropShadowColor", "accentColor", "selectionColor", "disabledIconColor", "textJustify", "focusColor", "alternatingItemColors", "typographicCase", "showErrorSkin", "textRollOverColor", "digitCase", "inactiveTextSelectionColor", "justificationRule", "trackingRight", "leadingModel", "selectionDisabledColor", "letterSpacing", "focusedTextSelectionColor", "baselineShift", "barColor", "sortFontStyle", "fontSharpness", "modalTransparencyDuration", "justificationStyle", "listStyleType", "wordSpacing", "contentBackgroundAlpha", "textRotation", "fontAntiAliasType", "direction", "cffHinting", "errorColor", "locale", "horizontalGridLineColor", "backgroundDisabledColor", "modalTransparencyColor", "textIndent", "clearFloats", "themeColor", "verticalGridLineColor", "tabStops", "modalTransparency", "textAlign", "headerColors", "sortFontWeight", "textSelectedColor", "interactionMode", "whiteSpaceCollapse", "fontGridFitType", "proposedColor", "disabledColor", "modalTransparencyBlur", "downColor", "color", "sortFontFamily"];

       for (var i:int = 0; i < styleNames.length; i++)
       {
          styleManager.registerInheritingStyle(styleNames[i]);
       }
   }
}  // FlexInit
}  // package
