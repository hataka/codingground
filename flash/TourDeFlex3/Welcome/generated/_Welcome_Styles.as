
package 
{

import mx.core.IFlexModuleFactory;
import mx.core.mx_internal;
import mx.styles.CSSCondition;
import mx.styles.CSSSelector;
import mx.styles.CSSStyleDeclaration;
import mx.styles.IStyleManager2;
import mx.utils.ObjectUtil;
import spark.skins.spark.ErrorSkin;
import mx.skins.halo.HaloFocusRect;
import spark.skins.spark.FocusSkin;
import mx.skins.spark.PanelBorderSkin;
import mx.skins.spark.ScrollBarThumbSkin;
import mx.skins.halo.ToolTipBorder;
import mx.skins.spark.ContainerBorderSkin;
import mx.skins.spark.ScrollBarDownButtonSkin;
import spark.skins.spark.ImageSkin;
import mx.skins.spark.ScrollBarTrackSkin;
import mx.skins.spark.DefaultButtonSkin;
import mx.skins.spark.ButtonSkin;
import mx.core.UITextField;
import mx.skins.halo.BusyCursor;
import mx.skins.spark.ScrollBarUpButtonSkin;
import mx.core.UIComponent;
[ExcludeClass]

public class _Welcome_Styles
{
    [Embed(symbol='mx.skins.cursor.BusyCursor', _file='F:/VCSharp/Flashdevelop5.1.1-LL/FlashDevelop/Bin/Debug/Tools/flexsdk/frameworks/libs/framework.swc$defaults.css', original='Assets.swf', _resolvedSource='F:/VCSharp/Flashdevelop5.1.1-LL/FlashDevelop/Bin/Debug/Tools/flexsdk/frameworks/libs/framework.swc$Assets.swf', _pathsep='true', source='F:/VCSharp/Flashdevelop5.1.1-LL/FlashDevelop/Bin/Debug/Tools/flexsdk/frameworks/libs/framework.swc$Assets.swf', _line='194')]
    private static var _embed_css_Assets_swf__986477512_mx_skins_cursor_BusyCursor_418273095:Class;
    public static function init(fbs:IFlexModuleFactory):void
    {
        var styleManager:IStyleManager2 = fbs.getImplementation("mx.styles::IStyleManager2") as IStyleManager2;
        

        var conditions:Array = null;
        var condition:CSSCondition = null;
        var selector:CSSSelector = null;
        var style:CSSStyleDeclaration;
        var effects:Array;
        
        var mergedStyle:CSSStyleDeclaration;

        
        //
        // global
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("global", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("global");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.paragraphStartIndent = 0;
                this.shadowDistance = 2;
                this.breakOpportunity = "auto";
                this.kerning = "default";
                this.selectionDuration = 250;
                this.leading = 2;
                this.paddingRight = 0;
                this.rollOverOpenDelay = 200;
                this.liveDragging = true;
                this.slideDuration = 300;
                this.iconPlacement = "left";
                this.textFieldClass = mx.core.UITextField;
                this.layoutDirection = "ltr";
                this.borderStyle = "inset";
                this.ligatureLevel = "common";
                this.repeatDelay = 500;
                this.dropShadowColor = 0x000000;
                this.shadowColor = 0xeeeeee;
                this.verticalAlign = "top";
                this.interactionMode = "mouse";
                this.dominantBaseline = "auto";
                this.focusAlpha = 0.55;
                this.fontSharpness = 0;
                this.justificationStyle = "auto";
                this.whiteSpaceCollapse = "collapse";
                this.textDecoration = "none";
                this.fontStyle = "normal";
                this.shadowDirection = "center";
                this.version = "4.0.0";
                this.horizontalScrollPolicy = "auto";
                this.digitWidth = "default";
                this.indicatorGap = 14;
                this.lineBreak = "toFit";
                this.borderCapColor = 0x919999;
                this.focusColor = 0x70b2ee;
                this.themeColor = 0x70b2ee;
                this.fontSize = 12;
                this.textAlignLast = "start";
                this.paddingLeft = 0;
                this.selectionDisabledColor = 0xdddddd;
                this.trackingRight = 0;
                this.smoothScrolling = true;
                this.showErrorSkin = true;
                this.useRollOver = true;
                this.unfocusedTextSelectionColor = 0xe8e8e8;
                this.backgroundAlpha = 1.0;
                this.baselineShift = 0;
                this.textAlpha = 1.0;
                this.verticalGap = 6;
                this.closeDuration = 50;
                this.disabledAlpha = 0.5;
                this.fillColor = 0xffffff;
                this.roundedBottomCorners = true;
                this.highlightAlphas = [0.3, 0];
                this.horizontalAlign = "left";
                this.verticalGridLines = true;
                this.textRotation = "auto";
                this.dropShadowVisible = false;
                this.backgroundSize = "auto";
                this.horizontalGridLines = false;
                this.tabStops = null;
                this.softKeyboardEffectDuration = 150;
                this.firstBaselineOffset = "auto";
                this.focusRoundedCorners = "tl tr bl br";
                this.lineThrough = false;
                this.focusSkin = mx.skins.halo.HaloFocusRect;
                this.focusedTextSelectionColor = 0xa8c6ee;
                this.symbolColor = 0x000000;
                this.borderAlpha = 1.0;
                this.filled = true;
                this.openDuration = 1;
                this.disabledColor = 0xaab3b3;
                this.alignmentBaseline = "useDominantBaseline";
                this.modalTransparencyColor = 0xdddddd;
                this.embedFonts = false;
                this.modalTransparencyDuration = 100;
                this.modalTransparency = 0.5;
                this.backgroundImageFillMode = "scale";
                this.lineHeight = "120%";
                this.typographicCase = "default";
                this.borderColor = 0x696969;
                this.fontAntiAliasType = "advanced";
                this.selectionColor = 0xa8c6ee;
                this.cffHinting = "horizontalStem";
                this.contentBackgroundAlpha = 1;
                this.cornerRadius = 2;
                this.borderThickness = 1;
                this.fontFamily = "Arial";
                this.indentation = 17;
                this.paddingBottom = 0;
                this.digitCase = "default";
                this.repeatInterval = 35;
                this.textSelectedColor = 0;
                this.paragraphEndIndent = 0;
                this.disabledIconColor = 0x999999;
                this.fontWeight = "normal";
                this.borderVisible = true;
                this.focusBlendMode = "normal";
                this.textAlign = "start";
                this.accentColor = 0x0099ff;
                this.shadowCapColor = 0xd5dddd;
                this.contentBackgroundColor = 0xffffff;
                this.fontLookup = "embeddedCFF";
                this.chromeColor = 0xcccccc;
                this.columnGap = 20;
                this.focusThickness = 2;
                this.verticalGridLineColor = 0xd5dddd;
                this.blockProgression = "tb";
                this.textRollOverColor = 0;
                this.fillAlphas = [0.6, 0.4, 0.75, 0.65];
                this.horizontalGridLineColor = 0xf7f7f7;
                this.strokeWidth = 1;
                this.fontGridFitType = "pixel";
                this.errorColor = 0xfe0000;
                this.paragraphSpaceAfter = 0;
                this.justificationRule = "auto";
                this.borderSides = "left top right bottom";
                this.color = 0x000000;
                this.buttonColor = 0x6f7777;
                this.fillColors = [0xffffff, 0xcccccc, 0xffffff, 0xeeeeee];
                this.paragraphSpaceBefore = 0;
                this.locale = "en";
                this.textIndent = 0;
                this.fontThickness = 0;
                this.renderingMode = "cff";
                this.textJustify = "interWord";
                this.fullScreenHideControlsDelay = 3000;
                this.columnWidth = "auto";
                this.paddingTop = 0;
                this.direction = "ltr";
                this.fixedThumbSize = false;
                this.caretColor = 0x0167ff;
                this.letterSpacing = 0;
                this.borderWeight = 1;
                this.columnCount = "auto";
                this.bevel = true;
                this.verticalScrollPolicy = "auto";
                this.trackingLeft = 0;
                this.horizontalGap = 8;
                this.rollOverColor = 0xcedbef;
                this.modalTransparencyBlur = 3;
                this.stroked = false;
                this.iconColor = 0x111111;
                this.inactiveTextSelectionColor = 0xe8e8e8;
                this.leadingModel = "auto";
                this.showErrorTip = true;
                this.autoThumbVisibility = true;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .errorTip
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "errorTip");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".errorTip");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.borderColor = 0xce2929;
                this.paddingBottom = 4;
                this.color = 0xffffff;
                this.paddingRight = 4;
                this.fontSize = 10;
                this.paddingTop = 4;
                this.borderStyle = "errorTipRight";
                this.shadowColor = 0x000000;
                this.paddingLeft = 4;
                this.fontWeight = "bold";
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .headerDragProxyStyle
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "headerDragProxyStyle");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".headerDragProxyStyle");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.fontWeight = "bold";
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .dateFieldPopup
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "dateFieldPopup");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".dateFieldPopup");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.borderThickness = 1;
                this.backgroundColor = 0xffffff;
                this.dropShadowVisible = true;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .swatchPanelTextField
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "swatchPanelTextField");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".swatchPanelTextField");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.highlightColor = 0xc4cccc;
                this.backgroundColor = 0xffffff;
                this.borderColor = 0xd5dddd;
                this.borderCapColor = 0x919999;
                this.buttonColor = 0x6f7777;
                this.shadowCapColor = 0xd5dddd;
                this.paddingRight = 5;
                this.borderStyle = "inset";
                this.paddingLeft = 5;
                this.shadowColor = 0xd5dddd;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .todayStyle
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "todayStyle");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".todayStyle");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.color = 0;
                this.textAlign = "center";
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .weekDayStyle
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "weekDayStyle");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".weekDayStyle");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.textAlign = "center";
                this.fontWeight = "bold";
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .windowStatus
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "windowStatus");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".windowStatus");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.color = 0x666666;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }

        //
        // .windowStyles
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "windowStyles");
        conditions.push(condition); 
        selector = new CSSSelector("", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration(".windowStyles");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.fontWeight = "bold";
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.managers.CursorManager
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.managers.CursorManager", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.managers.CursorManager");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.busyCursor = mx.skins.halo.BusyCursor;
                this.busyCursorBackground = _embed_css_Assets_swf__986477512_mx_skins_cursor_BusyCursor_418273095;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.controls.ToolTip
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.controls.ToolTip", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.controls.ToolTip");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.backgroundColor = 0xffffcc;
                this.borderColor = 0x919999;
                this.paddingBottom = 2;
                this.paddingRight = 4;
                this.backgroundAlpha = 0.95;
                this.fontSize = 10;
                this.paddingTop = 2;
                this.borderSkin = mx.skins.halo.ToolTipBorder;
                this.borderStyle = "toolTip";
                this.paddingLeft = 4;
                this.cornerRadius = 2;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // spark.components.Image
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("spark.components.Image", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("spark.components.Image");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.showErrorSkin = false;
                this.enableLoadingState = false;
                this.smoothingQuality = "default";
                this.skinClass = spark.skins.spark.ImageSkin;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // spark.components.supportClasses.SkinnableComponent
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("spark.components.supportClasses.SkinnableComponent", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("spark.components.supportClasses.SkinnableComponent");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.errorSkin = spark.skins.spark.ErrorSkin;
                this.focusSkin = spark.skins.spark.FocusSkin;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // spark.components.supportClasses.TextBase
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("spark.components.supportClasses.TextBase", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("spark.components.supportClasses.TextBase");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.layoutDirection = "ltr";
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.core.Application
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.core.Application", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.core.Application");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.backgroundColor = 0xffffff;
                this.paddingBottom = 24;
                this.horizontalAlign = "center";
                this.paddingRight = 24;
                this.paddingTop = 24;
                this.paddingLeft = 24;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.controls.Button
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.controls.Button", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.controls.Button");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.horizontalGap = 2;
                this.textAlign = "center";
                this.paddingRight = 6;
                this.skin = mx.skins.spark.ButtonSkin;
                this.labelVerticalOffset = 1;
                this.verticalGap = 2;
                this.paddingLeft = 6;
                this.emphasizedSkin = mx.skins.spark.DefaultButtonSkin;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.core.Container
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.core.Container", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.core.Container");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.borderSkin = mx.skins.spark.ContainerBorderSkin;
                this.borderStyle = "none";
                this.cornerRadius = 0;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.containers.ControlBar
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.containers.ControlBar", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.containers.ControlBar");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.verticalAlign = "middle";
                this.paddingBottom = 11;
                this.paddingRight = 11;
                this.disabledOverlayAlpha = 0;
                this.paddingTop = 11;
                this.borderStyle = "none";
                this.paddingLeft = 11;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.containers.Panel
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.containers.Panel", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.containers.Panel");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.backgroundColor = 0xffffff;
                this.borderColor = 0;
                this.paddingRight = 0;
                this.borderAlpha = 0.5;
                this.resizeEndEffect = "Dissolve";
                this.statusStyleName = "windowStatus";
                this.borderSkin = mx.skins.spark.PanelBorderSkin;
                this.cornerRadius = 0;
                this.paddingBottom = 0;
                this.dropShadowVisible = true;
                this.titleBackgroundSkin = mx.core.UIComponent;
                this.paddingTop = 0;
                this.borderStyle = "default";
                this.paddingLeft = 0;
                this.titleStyleName = "windowStyles";
                this.resizeStartEffect = "Dissolve";
            };
        }

        effects = style.mx_internal::effects;
        if (!effects)
        {
            effects = style.mx_internal::effects = [];
        }


          effects.push("resizeEndEffect");
          effects.push("resizeStartEffect");

        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.controls.scrollClasses.ScrollBar
        //
        selector = null;
        conditions = null;
        conditions = null;
        selector = new CSSSelector("mx.controls.scrollClasses.ScrollBar", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.controls.scrollClasses.ScrollBar");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
                this.thumbSkin = mx.skins.spark.ScrollBarThumbSkin;
                this.paddingBottom = 0;
                this.thumbOffset = 0;
                this.paddingRight = 0;
                this.trackSkin = mx.skins.spark.ScrollBarTrackSkin;
                this.downArrowSkin = mx.skins.spark.ScrollBarDownButtonSkin;
                this.upArrowSkin = mx.skins.spark.ScrollBarUpButtonSkin;
                this.paddingTop = 0;
                this.paddingLeft = 0;
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.controls.HScrollBar.textAreaVScrollBarStyle
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "textAreaVScrollBarStyle");
        conditions.push(condition); 
        selector = new CSSSelector("mx.controls.HScrollBar", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.controls.HScrollBar.textAreaVScrollBarStyle");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }



        
        //
        // mx.controls.VScrollBar.textAreaHScrollBarStyle
        //
        selector = null;
        conditions = null;
        conditions = [];
        condition = new CSSCondition("class", "textAreaHScrollBarStyle");
        conditions.push(condition); 
        selector = new CSSSelector("mx.controls.VScrollBar", conditions, selector);
        mergedStyle = styleManager.getMergedStyleDeclaration("mx.controls.VScrollBar.textAreaHScrollBarStyle");
        style = new CSSStyleDeclaration(selector, styleManager, mergedStyle == null);

        if (style.defaultFactory == null)
        {
            style.defaultFactory = function():void
            {
            };
        }



        if (mergedStyle != null && 
            (mergedStyle.defaultFactory == null ||
            ObjectUtil.compare(new style.defaultFactory(), new mergedStyle.defaultFactory())))
        {
            styleManager.setStyleDeclaration(style.mx_internal::selectorString, style, false);
        }


    }
}

}
