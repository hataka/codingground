package
{

import flash.display.LoaderInfo;
import flash.text.Font;
import flash.text.TextFormat;
import flash.text.engine.TextBlock;
import flash.text.engine.TextLine;
import flash.system.ApplicationDomain;
import flash.system.Security
import flash.utils.Dictionary;
import flash.utils.getDefinitionByName;
import flashx.textLayout.compose.ISWFContext;
import mx.core.IFlexModule;
import mx.core.IFlexModuleFactory;
import mx.core.RSLData;
import mx.events.RSLEvent;
import mx.core.FlexVersion;
import mx.managers.SystemManager;
import mx.preloaders.SparkDownloadProgressBar;

[ExcludeClass]
public class _DividedBoxExample_mx_managers_SystemManager
    extends mx.managers.SystemManager
    implements IFlexModuleFactory, ISWFContext
{
    public function _DividedBoxExample_mx_managers_SystemManager()
    {

        super();
    }

    override     public function callInContext(fn:Function, thisArg:Object, argArray:Array, returns:Boolean=true):*
    {
        if (returns)
           return fn.apply(thisArg, argArray);
        else
           fn.apply(thisArg, argArray);
    }

    override     public function create(... params):Object
    {
        if (params.length > 0 && !(params[0] is String))
            return super.create.apply(this, params);

        var mainClassName:String = params.length == 0 ? "DividedBoxExample" : String(params[0]);
        var mainClass:Class = Class(getDefinitionByName(mainClassName));
        if (!mainClass)
            return null;

        var instance:Object = new mainClass();
        if (instance is IFlexModule)
            (IFlexModule(instance)).moduleFactory = this;
        return instance;
    }

    /**
     *  @private
     */
    private var _info:Object;

    override    public function info():Object
    {
        if (!_info)
        {
            _info = {
            compiledLocales: [ "en_US" ],
            compiledResourceBundleNames: [ "components", "containers", "core", "effects", "layout", "skins", "styles" ],
            currentDomain: ApplicationDomain.currentDomain,
            fontSize: "24",
            fontWeight: "normal",
            mainClassName: "DividedBoxExample",
            mixins: [ "_DividedBoxExample_FlexInit", "_DividedBoxExample_Styles" ],
            paddingBottom: "0",
            paddingLeft: "0",
            paddingRight: "0",
            paddingTop: "0",
            preloader: mx.preloaders.SparkDownloadProgressBar
            }
        }
        return _info;
    }


    /**
     *  @private
     */
    private var _preloadedRSLs:Dictionary; // key: LoaderInfo, value: Vector.<RSLData>

    /**
     *  @private
     */
    private var _allowDomainParameters:Vector.<Array>;

    /**
     *  @private
     */
    private var _allowInsecureDomainParameters:Vector.<Array>;

    /**
     *  @private
     *  The RSLs loaded by this system manager before the application
     *  starts. RSLs loaded by the application are not included in this list.
     */
    override public function get preloadedRSLs():Dictionary
    {
        if (_preloadedRSLs == null)
           _preloadedRSLs = new Dictionary(true);
        return _preloadedRSLs;
    }

    /**
     *  @private
     *  Calls Security.allowDomain() for the SWF associated with this IFlexModuleFactory
     *  plus all the SWFs assocatiated with RSLs preLoaded by this IFlexModuleFactory.
     *
     */
    override public function allowDomain(... domains):void
    {
        Security.allowDomain.apply(null, domains);

        for (var loaderInfo:Object in _preloadedRSLs)
        {
            if (loaderInfo.content && ("allowDomainInRSL" in loaderInfo.content))
                loaderInfo.content["allowDomainInRSL"].apply(null, domains);
        }

        if (!_allowDomainParameters)
            _allowDomainParameters = new Vector.<Array>();
        _allowDomainParameters.push(domains);

        // Run our handler before the default handlers so the RSL is trusted before the
        // default handlers run.
        addEventListener(RSLEvent.RSL_ADD_PRELOADED, addPreloadedRSLHandler, false, 50);
    }

    /**
     *  @private
     *  Calls Security.allowInsecureDomain() for the SWF associated with this IFlexModuleFactory
     *  plus all the SWFs assocatiated with RSLs preLoaded by this IFlexModuleFactory.
     *
     */
    override public function allowInsecureDomain(... domains):void
    {
        Security.allowInsecureDomain.apply(null, domains);

        for (var loaderInfo:Object in _preloadedRSLs)
        {
            if (loaderInfo.content && ("allowInsecureDomainInRSL" in loaderInfo.content))
                loaderInfo.content["allowInsecureDomainInRSL"].apply(null, domains);
        }
        if (!_allowInsecureDomainParameters)
            _allowInsecureDomainParameters = new Vector.<Array>();
        _allowInsecureDomainParameters.push(domains);

        // Run our handler before the default handlers so the RSL is trusted before the
        // default handlers run.
        addEventListener(RSLEvent.RSL_ADD_PRELOADED, addPreloadedRSLHandler, false, 50);
    }

    /**
     *  @private
     */
    private function addPreloadedRSLHandler(event:RSLEvent):void
    {
        var loaderInfo:LoaderInfo = event.loaderInfo;
        if (!loaderInfo || !loaderInfo.content)
            return;
        var domains:Array
        if (allowDomainsInNewRSLs && _allowDomainParameters)
        {
            for each (domains in _allowDomainParameters)
            {
                if ("allowDomainInRSL" in loaderInfo.content)
                    loaderInfo.content["allowDomainInRSL"].apply(null, domains);
            }
        }

        if (allowInsecureDomainsInNewRSLs && _allowInsecureDomainParameters)
        {
            for each (domains in _allowInsecureDomainParameters)
            {
                if ("allowInsecureDomainInRSL" in loaderInfo.content)
                    loaderInfo.content["allowInsecureDomainInRSL"].apply(null, domains);
            }
        }
    }


}

}
