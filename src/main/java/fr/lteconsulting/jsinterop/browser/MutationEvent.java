package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MutationEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:527684
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:528197
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MutationEvent")
public class MutationEvent extends Event
{

    /*
        Constructors
    */
    public MutationEvent(){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="MutationEvent", name="ADDITION")
    public static Number ADDITION;

    @JsProperty(namespace="MutationEvent", name="MODIFICATION")
    public static Number MODIFICATION;

    @JsProperty(namespace="MutationEvent", name="REMOVAL")
    public static Number REMOVAL;

    /*
        Properties
    */

    public Number attrChange;

    @JsProperty( name = "attrChange")
    public native Number getAttrChange();

    @JsProperty( name = "attrChange")
    public native void setAttrChange( Number value );

    public String attrName;

    @JsProperty( name = "attrName")
    public native String getAttrName();

    @JsProperty( name = "attrName")
    public native void setAttrName( String value );

    public String newValue;

    @JsProperty( name = "newValue")
    public native String getNewValue();

    @JsProperty( name = "newValue")
    public native void setNewValue( String value );

    public String prevValue;

    @JsProperty( name = "prevValue")
    public native String getPrevValue();

    @JsProperty( name = "prevValue")
    public native void setPrevValue( String value );

    public Node relatedNode;

    @JsProperty( name = "relatedNode")
    public native Node getRelatedNode();

    @JsProperty( name = "relatedNode")
    public native void setRelatedNode( Node value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initMutationEvent,289,,P(d1),P(d27),P(d27),P(d86),P(d1),P(d1),P(d1),P(d2))
      * TE Signature : S(initMutationEvent,P(d1),P(d27),P(d27),P(d86),P(d1),P(d1),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@527889
     */
    public native void initMutationEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Node relatedNodeArg, String prevValueArg, String newValueArg, String attrNameArg, Number attrChangeArg);
}
