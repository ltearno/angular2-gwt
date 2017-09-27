package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ConfirmSiteSpecificExceptionsInformation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256426
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ConfirmSiteSpecificExceptionsInformation")
public class ConfirmSiteSpecificExceptionsInformation extends ExceptionInformation
{

    /*
        Properties
    */

    public Array<String> arrayOfDomainStrings;

    @JsProperty( name = "arrayOfDomainStrings")
    public native Array<String> getArrayOfDomainStrings();

    @JsProperty( name = "arrayOfDomainStrings")
    public native void setArrayOfDomainStrings( Array<String> value );
}
