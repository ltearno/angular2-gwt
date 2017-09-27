package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast".MessageSpan
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:1011
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="MessageSpan")
public class MessageSpan
{

    /*
        Properties
    */

    public Number endCol;

    @JsProperty( name = "endCol")
    public native Number getEndCol();

    @JsProperty( name = "endCol")
    public native void setEndCol( Number value );

    public Number endLine;

    @JsProperty( name = "endLine")
    public native Number getEndLine();

    @JsProperty( name = "endLine")
    public native void setEndLine( Number value );

    public String filePath;

    @JsProperty( name = "filePath")
    public native String getFilePath();

    @JsProperty( name = "filePath")
    public native void setFilePath( String value );

    public Number startCol;

    @JsProperty( name = "startCol")
    public native Number getStartCol();

    @JsProperty( name = "startCol")
    public native void setStartCol( Number value );

    public Number startLine;

    @JsProperty( name = "startLine")
    public native Number getStartLine();

    @JsProperty( name = "startLine")
    public native void setStartLine( Number value );
}
