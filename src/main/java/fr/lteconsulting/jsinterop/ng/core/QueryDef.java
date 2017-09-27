package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".QueryDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:8217
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="QueryDef")
public class QueryDef
{

    /*
        Properties
    */

    public Array<QueryBindingDef> bindings;

    @JsProperty( name = "bindings")
    public native Array<QueryBindingDef> getBindings();

    @JsProperty( name = "bindings")
    public native void setBindings( Array<QueryBindingDef> value );

    public Number filterId;

    @JsProperty( name = "filterId")
    public native Number getFilterId();

    @JsProperty( name = "filterId")
    public native void setFilterId( Number value );

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );
}
