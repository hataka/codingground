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
import spark.accessibility.PanelAccImpl;
import mx.accessibility.UIComponentAccProps;
import mx.accessibility.ButtonAccImpl;
import spark.accessibility.TextBaseAccImpl;
import mx.accessibility.PanelAccImpl;
import mx.accessibility.AlertAccImpl;
import spark.accessibility.ButtonBaseAccImpl;
import flash.net.registerClassAlias;
import flash.net.getClassByAlias;
import mx.managers.SystemManagerGlobals;
import mx.resources.ResourceManager;
import mx.utils.ObjectProxy;
import mx.effects.EffectManager;
import mx.core.mx_internal;

[Mixin]
public class _SimpleAlert_FlexInit
{
   public function _SimpleAlert_FlexInit()
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
          spark.accessibility.PanelAccImpl.enableAccessibility();
          mx.accessibility.UIComponentAccProps.enableAccessibility();
          mx.accessibility.ButtonAccImpl.enableAccessibility();
          spark.accessibility.TextBaseAccImpl.enableAccessibility();
          mx.accessibility.PanelAccImpl.enableAccessibility();
          mx.accessibility.AlertAccImpl.enableAccessibility();
          spark.accessibility.ButtonBaseAccImpl.enableAccessibility();
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

       var styleNames:Array = ["paragraphStartIndent", "breakOpportunity", "kerning", "alternatingItemColors", "wordSpacing", "leading", "fontAntiAliasType", "cffHinting", "contentBackgroundAlpha", "fontFamily", "digitCase", "textSelectedColor", "clearFloats", "paragraphEndIndent", "layoutDirection", "ligatureLevel", "strokeColor", "downColor", "dropShadowColor", "shadowColor", "fontWeight", "interactionMode", "dominantBaseline", "textAlign", "accentColor", "justificationStyle", "fontSharpness", "footerColors", "whiteSpaceCollapse", "headerColors", "contentBackgroundColor", "textDecoration", "fontLookup", "fontStyle", "chromeColor", "digitWidth", "focusColor", "themeColor", "listAutoPadding", "blockProgression", "listStyleType", "fontSize", "textRollOverColor", "textAlignLast", "strokeWidth", "trackingRight", "fontGridFitType", "paragraphSpaceAfter", "showErrorSkin", "errorColor", "justificationRule", "color", "backgroundDisabledColor", "textShadowColor", "unfocusedTextSelectionColor", "paragraphSpaceBefore", "textIndent", "textAlpha", "locale", "baselineShift", "barColor", "fontThickness", "touchDelay", "textShadowAlpha", "renderingMode", "textJustify", "textRotation", "tabStops", "direction", "firstBaselineOffset", "lineThrough", "symbolColor", "focusedTextSelectionColor", "letterSpacing", "disabledColor", "alignmentBaseline", "trackingLeft", "modalTransparencyColor", "rollOverColor", "listStylePosition", "modalTransparencyBlur", "modalTransparencyDuration", "modalTransparency", "inactiveTextSelectionColor", "lineHeight", "leadingModel", "showErrorTip", "typographicCase"];

       for (var i:int = 0; i < styleNames.length; i++)
       {
          styleManager.registerInheritingStyle(styleNames[i]);
       }
   }
}  // FlexInit
}  // package
