package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/di".Query
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/di.d.ts:2981
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/di.d.ts:3167

  * Type of the Query metadata.
  * Base class for query metadata.
  * 
  * See {@link ContentChildren}, {@link ContentChild}, {@link ViewChildren}, {@link ViewChild} for
  * more information.
 */
@JsType(isNative=true, namespace="ng.core", name="Query")
public class Query
{

    /*
        Properties
    */

    public Boolean descendants;

    @JsProperty( name = "descendants")
    public native Boolean getDescendants();

    @JsProperty( name = "descendants")
    public native void setDescendants( Boolean value );

    public Boolean first;

    @JsProperty( name = "first")
    public native Boolean getFirst();

    @JsProperty( name = "first")
    public native void setFirst( Boolean value );

    public Boolean isViewQuery;

    @JsProperty( name = "isViewQuery")
    public native Boolean getIsViewQuery();

    @JsProperty( name = "isViewQuery")
    public native void setIsViewQuery( Boolean value );

    public Object read;

    @JsProperty( name = "read")
    public native Object getRead();

    @JsProperty( name = "read")
    public native void setRead( Object value );

    public Object selector;

    @JsProperty( name = "selector")
    public native Object getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( Object value );
}
