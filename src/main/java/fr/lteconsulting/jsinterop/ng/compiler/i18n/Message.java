package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.AnonymousType1283;
import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast".Message
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:251
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Message")
public class Message
{

    /*
        Constructors
    */
    public Message(Array<Node> nodes, AnonymousType817 placeholders, AnonymousType1283 placeholderToMessage, String meaning, String description, String id){
    }

    /*
        Properties
    */

    public String description;

    @JsProperty( name = "description")
    public native String getDescription();

    @JsProperty( name = "description")
    public native void setDescription( String value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public String meaning;

    @JsProperty( name = "meaning")
    public native String getMeaning();

    @JsProperty( name = "meaning")
    public native void setMeaning( String value );

    public Array<Node> nodes;

    @JsProperty( name = "nodes")
    public native Array<Node> getNodes();

    @JsProperty( name = "nodes")
    public native void setNodes( Array<Node> value );

    public AnonymousType1283 placeholderToMessage;

    @JsProperty( name = "placeholderToMessage")
    public native AnonymousType1283 getPlaceholderToMessage();

    @JsProperty( name = "placeholderToMessage")
    public native void setPlaceholderToMessage( AnonymousType1283 value );

    public AnonymousType817 placeholders;

    @JsProperty( name = "placeholders")
    public native AnonymousType817 getPlaceholders();

    @JsProperty( name = "placeholders")
    public native void setPlaceholders( AnonymousType817 value );

    public Array<MessageSpan> sources;

    @JsProperty( name = "sources")
    public native Array<MessageSpan> getSources();

    @JsProperty( name = "sources")
    public native void setSources( Array<MessageSpan> value );
}
