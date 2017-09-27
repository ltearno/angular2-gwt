package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.CloseEvent;
import fr.lteconsulting.jsinterop.browser.Event;
import fr.lteconsulting.jsinterop.browser.MessageEvent;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfStringAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/WebSocketSubject".WebSocketSubjectConfig
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/WebSocketSubject.d.ts:294
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="WebSocketSubjectConfig")
public class WebSocketSubjectConfig
{

    /*
        Properties
    */

    public Object WebSocketCtor;

    @JsProperty( name = "WebSocketCtor")
    public native Object getWebSocketCtor();

    @JsProperty( name = "WebSocketCtor")
    public native void setWebSocketCtor( Object value );

    public String binaryType;

    @JsProperty( name = "binaryType")
    public native String getBinaryType();

    @JsProperty( name = "binaryType")
    public native void setBinaryType( String value );

    public NextObserver<CloseEvent> closeObserver;

    @JsProperty( name = "closeObserver")
    public native NextObserver<CloseEvent> getCloseObserver();

    @JsProperty( name = "closeObserver")
    public native void setCloseObserver( NextObserver<CloseEvent> value );

    public NextObserver<Void> closingObserver;

    @JsProperty( name = "closingObserver")
    public native NextObserver<Void> getClosingObserver();

    @JsProperty( name = "closingObserver")
    public native void setClosingObserver( NextObserver<Void> value );

    public NextObserver<Event> openObserver;

    @JsProperty( name = "openObserver")
    public native NextObserver<Event> getOpenObserver();

    @JsProperty( name = "openObserver")
    public native void setOpenObserver( NextObserver<Event> value );

    public UnionOfArrayOfStringAndString protocol;

    @JsProperty( name = "protocol")
    public native UnionOfArrayOfStringAndString getProtocol();

    @JsProperty( name = "protocol")
    public native void setProtocol( UnionOfArrayOfStringAndString value );

    @JsOverlay
    public final void setProtocol( Array<String> value ) { setProtocol(UnionOfArrayOfStringAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setProtocol( String value ) { setProtocol(UnionOfArrayOfStringAndString.ofString( value )); }

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(resultSelector,T-,T-,P(d84))
      * TE Signature : S(resultSelector,P(d84))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/WebSocketSubject.d.ts@414
     */
    public native <T> T resultSelector(MessageEvent e);
}
