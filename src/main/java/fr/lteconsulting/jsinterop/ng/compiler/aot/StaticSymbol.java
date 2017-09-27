package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol".StaticSymbol
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol.d.ts:0
  * 1 constructors
  * A token representing the a reference to a static type.
  * 
  * This token is unique for a filePath and name and can be used as a hash table key.
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="StaticSymbol")
public class StaticSymbol
{

    /*
        Constructors
    */
    public StaticSymbol(String filePath, String name, Array<String> members){
    }

    /*
        Properties
    */

    public String filePath;

    @JsProperty( name = "filePath")
    public native String getFilePath();

    @JsProperty( name = "filePath")
    public native void setFilePath( String value );

    public Array<String> members;

    @JsProperty( name = "members")
    public native Array<String> getMembers();

    @JsProperty( name = "members")
    public native void setMembers( Array<String> value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(assertNoMembers,429,,)
      * TE Signature : S(assertNoMembers,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol.d.ts@528
     */
    public native void assertNoMembers();
}
