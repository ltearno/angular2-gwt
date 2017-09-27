package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DOMException
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:319411
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:320615
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMException")
public class DOMException
{

    /*
        Constructors
    */
    public DOMException(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="DOMException", name="ABORT_ERR")
    public static Number ABORT_ERR;

    @JsProperty(namespace="DOMException", name="DATA_CLONE_ERR")
    public static Number DATA_CLONE_ERR;

    @JsProperty(namespace="DOMException", name="DOMSTRING_SIZE_ERR")
    public static Number DOMSTRING_SIZE_ERR;

    @JsProperty(namespace="DOMException", name="HIERARCHY_REQUEST_ERR")
    public static Number HIERARCHY_REQUEST_ERR;

    @JsProperty(namespace="DOMException", name="INDEX_SIZE_ERR")
    public static Number INDEX_SIZE_ERR;

    @JsProperty(namespace="DOMException", name="INUSE_ATTRIBUTE_ERR")
    public static Number INUSE_ATTRIBUTE_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_ACCESS_ERR")
    public static Number INVALID_ACCESS_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_CHARACTER_ERR")
    public static Number INVALID_CHARACTER_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_MODIFICATION_ERR")
    public static Number INVALID_MODIFICATION_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_NODE_TYPE_ERR")
    public static Number INVALID_NODE_TYPE_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_STATE_ERR")
    public static Number INVALID_STATE_ERR;

    @JsProperty(namespace="DOMException", name="NAMESPACE_ERR")
    public static Number NAMESPACE_ERR;

    @JsProperty(namespace="DOMException", name="NETWORK_ERR")
    public static Number NETWORK_ERR;

    @JsProperty(namespace="DOMException", name="NOT_FOUND_ERR")
    public static Number NOT_FOUND_ERR;

    @JsProperty(namespace="DOMException", name="NOT_SUPPORTED_ERR")
    public static Number NOT_SUPPORTED_ERR;

    @JsProperty(namespace="DOMException", name="NO_DATA_ALLOWED_ERR")
    public static Number NO_DATA_ALLOWED_ERR;

    @JsProperty(namespace="DOMException", name="NO_MODIFICATION_ALLOWED_ERR")
    public static Number NO_MODIFICATION_ALLOWED_ERR;

    @JsProperty(namespace="DOMException", name="PARSE_ERR")
    public static Number PARSE_ERR;

    @JsProperty(namespace="DOMException", name="QUOTA_EXCEEDED_ERR")
    public static Number QUOTA_EXCEEDED_ERR;

    @JsProperty(namespace="DOMException", name="SECURITY_ERR")
    public static Number SECURITY_ERR;

    @JsProperty(namespace="DOMException", name="SERIALIZE_ERR")
    public static Number SERIALIZE_ERR;

    @JsProperty(namespace="DOMException", name="SYNTAX_ERR")
    public static Number SYNTAX_ERR;

    @JsProperty(namespace="DOMException", name="TIMEOUT_ERR")
    public static Number TIMEOUT_ERR;

    @JsProperty(namespace="DOMException", name="TYPE_MISMATCH_ERR")
    public static Number TYPE_MISMATCH_ERR;

    @JsProperty(namespace="DOMException", name="URL_MISMATCH_ERR")
    public static Number URL_MISMATCH_ERR;

    @JsProperty(namespace="DOMException", name="VALIDATION_ERR")
    public static Number VALIDATION_ERR;

    @JsProperty(namespace="DOMException", name="WRONG_DOCUMENT_ERR")
    public static Number WRONG_DOCUMENT_ERR;

    /*
        Properties
    */

    public Number code;

    @JsProperty( name = "code")
    public native Number getCode();

    @JsProperty( name = "code")
    public native void setCode( Number value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}
