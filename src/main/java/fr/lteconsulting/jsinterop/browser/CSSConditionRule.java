package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSConditionRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293529
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293625
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSConditionRule")
public class CSSConditionRule extends CSSGroupingRule
{

    /*
        Constructors
    */
    public CSSConditionRule(){
    }

    /*
        Properties
    */

    public String conditionText;

    @JsProperty( name = "conditionText")
    public native String getConditionText();

    @JsProperty( name = "conditionText")
    public native void setConditionText( String value );
}
