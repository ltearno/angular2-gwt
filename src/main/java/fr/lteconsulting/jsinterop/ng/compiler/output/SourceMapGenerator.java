package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map".SourceMapGenerator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map.d.ts:184
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map".SourceMapGenerator
  * flags: 16384
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map.d.ts:184
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="SourceMapGenerator")
public class SourceMapGenerator
{

    /*
        Constructors
    */
    public SourceMapGenerator(String file){
    }

    /*
        Properties
    */

    public Object currentLine;

    @JsProperty( name = "currentLine")
    public native Object getCurrentLine();

    @JsProperty( name = "currentLine")
    public native void setCurrentLine( Object value );

    public Object file;

    @JsProperty( name = "file")
    public native Object getFile();

    @JsProperty( name = "file")
    public native void setFile( Object value );

    public Object hasMappings;

    @JsProperty( name = "hasMappings")
    public native Object getHasMappings();

    @JsProperty( name = "hasMappings")
    public native void setHasMappings( Object value );

    public Object lastCol0;

    @JsProperty( name = "lastCol0")
    public native Object getLastCol0();

    @JsProperty( name = "lastCol0")
    public native void setLastCol0( Object value );

    public Object lines;

    @JsProperty( name = "lines")
    public native Object getLines();

    @JsProperty( name = "lines")
    public native void setLines( Object value );

    public Object sourcesContent;

    @JsProperty( name = "sourcesContent")
    public native Object getSourcesContent();

    @JsProperty( name = "sourcesContent")
    public native void setSourcesContent( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addLine,1231,,)
      * TE Signature : S(addLine,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map.d.ts@441
     */
    public native SourceMapGenerator addLine();
    /** 
      * Std Signature : S(addMapping,1231,,P(d2))
      * TE Signature : S(addMapping,P(d2))
      * 
     */
    public native SourceMapGenerator addMapping(Number col0);
    /** 
      * Std Signature : S(addMapping,1231,,P(d2),P(d1))
      * TE Signature : S(addMapping,P(d2),P(d1))
      * 
     */
    public native SourceMapGenerator addMapping(Number col0, String sourceUrl /* optional */);
    /** 
      * Std Signature : S(addMapping,1231,,P(d2),P(d1),P(d2))
      * TE Signature : S(addMapping,P(d2),P(d1),P(d2))
      * 
     */
    public native SourceMapGenerator addMapping(Number col0, String sourceUrl /* optional */, Number sourceLine0 /* optional */);
    /** 
      * Std Signature : S(addMapping,1231,,P(d2),P(d1),P(d2),P(d2))
      * TE Signature : S(addMapping,P(d2),P(d1),P(d2),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map.d.ts@462
     */
    public native SourceMapGenerator addMapping(Number col0, String sourceUrl /* optional */, Number sourceLine0 /* optional */, Number sourceCol0 /* optional */);
    /** 
      * Std Signature : S(addSource,1231,,P(d1))
      * TE Signature : S(addSource,P(d1))
      * 
     */
    public native SourceMapGenerator addSource(String url);
    /** 
      * Std Signature : S(addSource,1231,,P(d1),P(d1))
      * TE Signature : S(addSource,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map.d.ts@382
     */
    public native SourceMapGenerator addSource(String url, String content /* optional */);
    /** 
      * Std Signature : S(toJSON,3,,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map.d.ts@595
     */
    public native Object toJSON();
    /** 
      * Std Signature : S(toJsComment,1,,)
      * TE Signature : S(toJsComment,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/source_map.d.ts@627
     */
    public native String toJsComment();
}
