package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: File
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:374351
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:374501
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="File")
public class File extends Blob
{

    /*
        Constructors
    */
    public File(Array<UnionOfArrayBufferAndArrayBufferViewAndBlobAndString> parts, String filename, FilePropertyBag properties){
        super(null, null);
    }

    /*
        Properties
    */

    public Object lastModifiedDate;

    @JsProperty( name = "lastModifiedDate")
    public native Object getLastModifiedDate();

    @JsProperty( name = "lastModifiedDate")
    public native void setLastModifiedDate( Object value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String webkitRelativePath;

    @JsProperty( name = "webkitRelativePath")
    public native String getWebkitRelativePath();

    @JsProperty( name = "webkitRelativePath")
    public native void setWebkitRelativePath( String value );
}
