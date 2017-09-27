package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfStatementAndString;
import fr.lteconsulting.jsinterop.ng.compiler.output.Statement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/generated_file".GeneratedFile
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/generated_file.d.ts:49
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="GeneratedFile")
public class GeneratedFile
{

    /*
        Constructors
    */
    public GeneratedFile(String srcFileUrl, String genFileUrl, UnionOfArrayOfStatementAndString sourceOrStmts){
    }

    /*
        Properties
    */

    public String genFileUrl;

    @JsProperty( name = "genFileUrl")
    public native String getGenFileUrl();

    @JsProperty( name = "genFileUrl")
    public native void setGenFileUrl( String value );

    public String source;

    @JsProperty( name = "source")
    public native String getSource();

    @JsProperty( name = "source")
    public native void setSource( String value );

    public String srcFileUrl;

    @JsProperty( name = "srcFileUrl")
    public native String getSrcFileUrl();

    @JsProperty( name = "srcFileUrl")
    public native void setSrcFileUrl( String value );

    public Array<Statement> stmts;

    @JsProperty( name = "stmts")
    public native Array<Statement> getStmts();

    @JsProperty( name = "stmts")
    public native void setStmts( Array<Statement> value );
}
