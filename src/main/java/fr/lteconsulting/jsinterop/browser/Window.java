package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Window
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:707080
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:715979
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Window")
public class Window implements EventTarget, WindowTimers, WindowSessionStorage, WindowLocalStorage, WindowConsole, GlobalEventHandlers, IDBEnvironment, WindowBase64, GlobalFetch
{

    /*
        Constructors
    */
    public Window(){
    }

    /*
        Properties
    */

    public Object Blob;

    @JsProperty( name = "Blob")
    public native Object getBlob();

    @JsProperty( name = "Blob")
    public native void setBlob( Object value );

    public Object URL;

    @JsProperty( name = "URL")
    public native Object getURL();

    @JsProperty( name = "URL")
    public native void setURL( Object value );

    public ApplicationCache applicationCache;

    @JsProperty( name = "applicationCache")
    public native ApplicationCache getApplicationCache();

    @JsProperty( name = "applicationCache")
    public native void setApplicationCache( ApplicationCache value );

    public CacheStorage caches;

    @JsProperty( name = "caches")
    public native CacheStorage getCaches();

    @JsProperty( name = "caches")
    public native void setCaches( CacheStorage value );

    public Navigator clientInformation;

    @JsProperty( name = "clientInformation")
    public native Navigator getClientInformation();

    @JsProperty( name = "clientInformation")
    public native void setClientInformation( Navigator value );

    public Boolean closed;

    @JsProperty( name = "closed")
    public native Boolean getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Boolean value );

    public Console console;

    @JsProperty( name = "console")
    public native Console getConsole();

    @JsProperty( name = "console")
    public native void setConsole( Console value );

    public Crypto crypto;

    @JsProperty( name = "crypto")
    public native Crypto getCrypto();

    @JsProperty( name = "crypto")
    public native void setCrypto( Crypto value );

    public CustomElementRegistry customElements;

    @JsProperty( name = "customElements")
    public native CustomElementRegistry getCustomElements();

    @JsProperty( name = "customElements")
    public native void setCustomElements( CustomElementRegistry value );

    public String defaultStatus;

    @JsProperty( name = "defaultStatus")
    public native String getDefaultStatus();

    @JsProperty( name = "defaultStatus")
    public native void setDefaultStatus( String value );

    public Number devicePixelRatio;

    @JsProperty( name = "devicePixelRatio")
    public native Number getDevicePixelRatio();

    @JsProperty( name = "devicePixelRatio")
    public native void setDevicePixelRatio( Number value );

    public String doNotTrack;

    @JsProperty( name = "doNotTrack")
    public native String getDoNotTrack();

    @JsProperty( name = "doNotTrack")
    public native void setDoNotTrack( String value );

    public Document document;

    @JsProperty( name = "document")
    public native Document getDocument();

    @JsProperty( name = "document")
    public native void setDocument( Document value );

    public Event event;

    @JsProperty( name = "event")
    public native Event getEvent();

    @JsProperty( name = "event")
    public native void setEvent( Event value );

    public External external;

    @JsProperty( name = "external")
    public native External getExternal();

    @JsProperty( name = "external")
    public native void setExternal( External value );

    public Element frameElement;

    @JsProperty( name = "frameElement")
    public native Element getFrameElement();

    @JsProperty( name = "frameElement")
    public native void setFrameElement( Element value );

    public Window frames;

    @JsProperty( name = "frames")
    public native Window getFrames();

    @JsProperty( name = "frames")
    public native void setFrames( Window value );

    public History history;

    @JsProperty( name = "history")
    public native History getHistory();

    @JsProperty( name = "history")
    public native void setHistory( History value );

    public IDBFactory indexedDB;

    @JsProperty( name = "indexedDB")
    public native IDBFactory getIndexedDB();

    @JsProperty( name = "indexedDB")
    public native void setIndexedDB( IDBFactory value );

    public Number innerHeight;

    @JsProperty( name = "innerHeight")
    public native Number getInnerHeight();

    @JsProperty( name = "innerHeight")
    public native void setInnerHeight( Number value );

    public Number innerWidth;

    @JsProperty( name = "innerWidth")
    public native Number getInnerWidth();

    @JsProperty( name = "innerWidth")
    public native void setInnerWidth( Number value );

    public Boolean isSecureContext;

    @JsProperty( name = "isSecureContext")
    public native Boolean getIsSecureContext();

    @JsProperty( name = "isSecureContext")
    public native void setIsSecureContext( Boolean value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public Storage localStorage;

    @JsProperty( name = "localStorage")
    public native Storage getLocalStorage();

    @JsProperty( name = "localStorage")
    public native void setLocalStorage( Storage value );

    public Location location;

    @JsProperty( name = "location")
    public native Location getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Location value );

    public BarProp locationbar;

    @JsProperty( name = "locationbar")
    public native BarProp getLocationbar();

    @JsProperty( name = "locationbar")
    public native void setLocationbar( BarProp value );

    public BarProp menubar;

    @JsProperty( name = "menubar")
    public native BarProp getMenubar();

    @JsProperty( name = "menubar")
    public native void setMenubar( BarProp value );

    public ExtensionScriptApis msContentScript;

    @JsProperty( name = "msContentScript")
    public native ExtensionScriptApis getMsContentScript();

    @JsProperty( name = "msContentScript")
    public native void setMsContentScript( ExtensionScriptApis value );

    public MSCredentials msCredentials;

    @JsProperty( name = "msCredentials")
    public native MSCredentials getMsCredentials();

    @JsProperty( name = "msCredentials")
    public native void setMsCredentials( MSCredentials value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Navigator navigator;

    @JsProperty( name = "navigator")
    public native Navigator getNavigator();

    @JsProperty( name = "navigator")
    public native void setNavigator( Navigator value );

    public UnionOfBooleanAndString offscreenBuffering;

    @JsProperty( name = "offscreenBuffering")
    public native UnionOfBooleanAndString getOffscreenBuffering();

    @JsProperty( name = "offscreenBuffering")
    public native void setOffscreenBuffering( UnionOfBooleanAndString value );

    @JsOverlay
    public final void setOffscreenBuffering( Boolean value ) { setOffscreenBuffering(UnionOfBooleanAndString.ofBoolean( value )); }

    @JsOverlay
    public final void setOffscreenBuffering( String value ) { setOffscreenBuffering(UnionOfBooleanAndString.ofString( value )); }

    public Function1<UIEvent, Object> onabort;

    @JsProperty( name = "onabort")
    public native Function1<UIEvent, Object> getOnabort();

    @JsProperty( name = "onabort")
    public native void setOnabort( Function1<UIEvent, Object> value );

    public Function1<Event, Object> onafterprint;

    @JsProperty( name = "onafterprint")
    public native Function1<Event, Object> getOnafterprint();

    @JsProperty( name = "onafterprint")
    public native void setOnafterprint( Function1<Event, Object> value );

    public Function1<Event, Object> onbeforeprint;

    @JsProperty( name = "onbeforeprint")
    public native Function1<Event, Object> getOnbeforeprint();

    @JsProperty( name = "onbeforeprint")
    public native void setOnbeforeprint( Function1<Event, Object> value );

    public Function1<BeforeUnloadEvent, Object> onbeforeunload;

    @JsProperty( name = "onbeforeunload")
    public native Function1<BeforeUnloadEvent, Object> getOnbeforeunload();

    @JsProperty( name = "onbeforeunload")
    public native void setOnbeforeunload( Function1<BeforeUnloadEvent, Object> value );

    public Function1<FocusEvent, Object> onblur;

    @JsProperty( name = "onblur")
    public native Function1<FocusEvent, Object> getOnblur();

    @JsProperty( name = "onblur")
    public native void setOnblur( Function1<FocusEvent, Object> value );

    public Function1<Event, Object> oncanplay;

    @JsProperty( name = "oncanplay")
    public native Function1<Event, Object> getOncanplay();

    @JsProperty( name = "oncanplay")
    public native void setOncanplay( Function1<Event, Object> value );

    public Function1<Event, Object> oncanplaythrough;

    @JsProperty( name = "oncanplaythrough")
    public native Function1<Event, Object> getOncanplaythrough();

    @JsProperty( name = "oncanplaythrough")
    public native void setOncanplaythrough( Function1<Event, Object> value );

    public Function1<Event, Object> onchange;

    @JsProperty( name = "onchange")
    public native Function1<Event, Object> getOnchange();

    @JsProperty( name = "onchange")
    public native void setOnchange( Function1<Event, Object> value );

    public Function1<MouseEvent, Object> onclick;

    @JsProperty( name = "onclick")
    public native Function1<MouseEvent, Object> getOnclick();

    @JsProperty( name = "onclick")
    public native void setOnclick( Function1<MouseEvent, Object> value );

    public Function1<Event, Object> oncompassneedscalibration;

    @JsProperty( name = "oncompassneedscalibration")
    public native Function1<Event, Object> getOncompassneedscalibration();

    @JsProperty( name = "oncompassneedscalibration")
    public native void setOncompassneedscalibration( Function1<Event, Object> value );

    public Function1<PointerEvent, Object> oncontextmenu;

    @JsProperty( name = "oncontextmenu")
    public native Function1<PointerEvent, Object> getOncontextmenu();

    @JsProperty( name = "oncontextmenu")
    public native void setOncontextmenu( Function1<PointerEvent, Object> value );

    public Function1<MouseEvent, Object> ondblclick;

    @JsProperty( name = "ondblclick")
    public native Function1<MouseEvent, Object> getOndblclick();

    @JsProperty( name = "ondblclick")
    public native void setOndblclick( Function1<MouseEvent, Object> value );

    public Function1<DeviceLightEvent, Object> ondevicelight;

    @JsProperty( name = "ondevicelight")
    public native Function1<DeviceLightEvent, Object> getOndevicelight();

    @JsProperty( name = "ondevicelight")
    public native void setOndevicelight( Function1<DeviceLightEvent, Object> value );

    public Function1<DeviceMotionEvent, Object> ondevicemotion;

    @JsProperty( name = "ondevicemotion")
    public native Function1<DeviceMotionEvent, Object> getOndevicemotion();

    @JsProperty( name = "ondevicemotion")
    public native void setOndevicemotion( Function1<DeviceMotionEvent, Object> value );

    public Function1<DeviceOrientationEvent, Object> ondeviceorientation;

    @JsProperty( name = "ondeviceorientation")
    public native Function1<DeviceOrientationEvent, Object> getOndeviceorientation();

    @JsProperty( name = "ondeviceorientation")
    public native void setOndeviceorientation( Function1<DeviceOrientationEvent, Object> value );

    public Function1<DragEvent, Object> ondrag;

    @JsProperty( name = "ondrag")
    public native Function1<DragEvent, Object> getOndrag();

    @JsProperty( name = "ondrag")
    public native void setOndrag( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragend;

    @JsProperty( name = "ondragend")
    public native Function1<DragEvent, Object> getOndragend();

    @JsProperty( name = "ondragend")
    public native void setOndragend( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragenter;

    @JsProperty( name = "ondragenter")
    public native Function1<DragEvent, Object> getOndragenter();

    @JsProperty( name = "ondragenter")
    public native void setOndragenter( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragleave;

    @JsProperty( name = "ondragleave")
    public native Function1<DragEvent, Object> getOndragleave();

    @JsProperty( name = "ondragleave")
    public native void setOndragleave( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragover;

    @JsProperty( name = "ondragover")
    public native Function1<DragEvent, Object> getOndragover();

    @JsProperty( name = "ondragover")
    public native void setOndragover( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragstart;

    @JsProperty( name = "ondragstart")
    public native Function1<DragEvent, Object> getOndragstart();

    @JsProperty( name = "ondragstart")
    public native void setOndragstart( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondrop;

    @JsProperty( name = "ondrop")
    public native Function1<DragEvent, Object> getOndrop();

    @JsProperty( name = "ondrop")
    public native void setOndrop( Function1<DragEvent, Object> value );

    public Function1<Event, Object> ondurationchange;

    @JsProperty( name = "ondurationchange")
    public native Function1<Event, Object> getOndurationchange();

    @JsProperty( name = "ondurationchange")
    public native void setOndurationchange( Function1<Event, Object> value );

    public Function1<Event, Object> onemptied;

    @JsProperty( name = "onemptied")
    public native Function1<Event, Object> getOnemptied();

    @JsProperty( name = "onemptied")
    public native void setOnemptied( Function1<Event, Object> value );

    public Function1<MediaStreamErrorEvent, Object> onended;

    @JsProperty( name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();

    @JsProperty( name = "onended")
    public native void setOnended( Function1<MediaStreamErrorEvent, Object> value );

    public ErrorEventHandler onerror;

    @JsProperty( name = "onerror")
    public native ErrorEventHandler getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( ErrorEventHandler value );

    public Function1<FocusEvent, Object> onfocus;

    @JsProperty( name = "onfocus")
    public native Function1<FocusEvent, Object> getOnfocus();

    @JsProperty( name = "onfocus")
    public native void setOnfocus( Function1<FocusEvent, Object> value );

    public Function1<HashChangeEvent, Object> onhashchange;

    @JsProperty( name = "onhashchange")
    public native Function1<HashChangeEvent, Object> getOnhashchange();

    @JsProperty( name = "onhashchange")
    public native void setOnhashchange( Function1<HashChangeEvent, Object> value );

    public Function1<Event, Object> oninput;

    @JsProperty( name = "oninput")
    public native Function1<Event, Object> getOninput();

    @JsProperty( name = "oninput")
    public native void setOninput( Function1<Event, Object> value );

    public Function1<Event, Object> oninvalid;

    @JsProperty( name = "oninvalid")
    public native Function1<Event, Object> getOninvalid();

    @JsProperty( name = "oninvalid")
    public native void setOninvalid( Function1<Event, Object> value );

    public Function1<KeyboardEvent, Object> onkeydown;

    @JsProperty( name = "onkeydown")
    public native Function1<KeyboardEvent, Object> getOnkeydown();

    @JsProperty( name = "onkeydown")
    public native void setOnkeydown( Function1<KeyboardEvent, Object> value );

    public Function1<KeyboardEvent, Object> onkeypress;

    @JsProperty( name = "onkeypress")
    public native Function1<KeyboardEvent, Object> getOnkeypress();

    @JsProperty( name = "onkeypress")
    public native void setOnkeypress( Function1<KeyboardEvent, Object> value );

    public Function1<KeyboardEvent, Object> onkeyup;

    @JsProperty( name = "onkeyup")
    public native Function1<KeyboardEvent, Object> getOnkeyup();

    @JsProperty( name = "onkeyup")
    public native void setOnkeyup( Function1<KeyboardEvent, Object> value );

    public Function1<Event, Object> onload;

    @JsProperty( name = "onload")
    public native Function1<Event, Object> getOnload();

    @JsProperty( name = "onload")
    public native void setOnload( Function1<Event, Object> value );

    public Function1<Event, Object> onloadeddata;

    @JsProperty( name = "onloadeddata")
    public native Function1<Event, Object> getOnloadeddata();

    @JsProperty( name = "onloadeddata")
    public native void setOnloadeddata( Function1<Event, Object> value );

    public Function1<Event, Object> onloadedmetadata;

    @JsProperty( name = "onloadedmetadata")
    public native Function1<Event, Object> getOnloadedmetadata();

    @JsProperty( name = "onloadedmetadata")
    public native void setOnloadedmetadata( Function1<Event, Object> value );

    public Function1<Event, Object> onloadstart;

    @JsProperty( name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();

    @JsProperty( name = "onloadstart")
    public native void setOnloadstart( Function1<Event, Object> value );

    public Function1<MessageEvent, Object> onmessage;

    @JsProperty( name = "onmessage")
    public native Function1<MessageEvent, Object> getOnmessage();

    @JsProperty( name = "onmessage")
    public native void setOnmessage( Function1<MessageEvent, Object> value );

    public Function1<MouseEvent, Object> onmousedown;

    @JsProperty( name = "onmousedown")
    public native Function1<MouseEvent, Object> getOnmousedown();

    @JsProperty( name = "onmousedown")
    public native void setOnmousedown( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseenter;

    @JsProperty( name = "onmouseenter")
    public native Function1<MouseEvent, Object> getOnmouseenter();

    @JsProperty( name = "onmouseenter")
    public native void setOnmouseenter( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseleave;

    @JsProperty( name = "onmouseleave")
    public native Function1<MouseEvent, Object> getOnmouseleave();

    @JsProperty( name = "onmouseleave")
    public native void setOnmouseleave( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmousemove;

    @JsProperty( name = "onmousemove")
    public native Function1<MouseEvent, Object> getOnmousemove();

    @JsProperty( name = "onmousemove")
    public native void setOnmousemove( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseout;

    @JsProperty( name = "onmouseout")
    public native Function1<MouseEvent, Object> getOnmouseout();

    @JsProperty( name = "onmouseout")
    public native void setOnmouseout( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseover;

    @JsProperty( name = "onmouseover")
    public native Function1<MouseEvent, Object> getOnmouseover();

    @JsProperty( name = "onmouseover")
    public native void setOnmouseover( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseup;

    @JsProperty( name = "onmouseup")
    public native Function1<MouseEvent, Object> getOnmouseup();

    @JsProperty( name = "onmouseup")
    public native void setOnmouseup( Function1<MouseEvent, Object> value );

    public Function1<WheelEvent, Object> onmousewheel;

    @JsProperty( name = "onmousewheel")
    public native Function1<WheelEvent, Object> getOnmousewheel();

    @JsProperty( name = "onmousewheel")
    public native void setOnmousewheel( Function1<WheelEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturechange;

    @JsProperty( name = "onmsgesturechange")
    public native Function1<MSGestureEvent, Object> getOnmsgesturechange();

    @JsProperty( name = "onmsgesturechange")
    public native void setOnmsgesturechange( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturedoubletap;

    @JsProperty( name = "onmsgesturedoubletap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturedoubletap();

    @JsProperty( name = "onmsgesturedoubletap")
    public native void setOnmsgesturedoubletap( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgestureend;

    @JsProperty( name = "onmsgestureend")
    public native Function1<MSGestureEvent, Object> getOnmsgestureend();

    @JsProperty( name = "onmsgestureend")
    public native void setOnmsgestureend( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturehold;

    @JsProperty( name = "onmsgesturehold")
    public native Function1<MSGestureEvent, Object> getOnmsgesturehold();

    @JsProperty( name = "onmsgesturehold")
    public native void setOnmsgesturehold( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturestart;

    @JsProperty( name = "onmsgesturestart")
    public native Function1<MSGestureEvent, Object> getOnmsgesturestart();

    @JsProperty( name = "onmsgesturestart")
    public native void setOnmsgesturestart( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturetap;

    @JsProperty( name = "onmsgesturetap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturetap();

    @JsProperty( name = "onmsgesturetap")
    public native void setOnmsgesturetap( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsinertiastart;

    @JsProperty( name = "onmsinertiastart")
    public native Function1<MSGestureEvent, Object> getOnmsinertiastart();

    @JsProperty( name = "onmsinertiastart")
    public native void setOnmsinertiastart( Function1<MSGestureEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointercancel;

    @JsProperty( name = "onmspointercancel")
    public native Function1<MSPointerEvent, Object> getOnmspointercancel();

    @JsProperty( name = "onmspointercancel")
    public native void setOnmspointercancel( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerdown;

    @JsProperty( name = "onmspointerdown")
    public native Function1<MSPointerEvent, Object> getOnmspointerdown();

    @JsProperty( name = "onmspointerdown")
    public native void setOnmspointerdown( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerenter;

    @JsProperty( name = "onmspointerenter")
    public native Function1<MSPointerEvent, Object> getOnmspointerenter();

    @JsProperty( name = "onmspointerenter")
    public native void setOnmspointerenter( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerleave;

    @JsProperty( name = "onmspointerleave")
    public native Function1<MSPointerEvent, Object> getOnmspointerleave();

    @JsProperty( name = "onmspointerleave")
    public native void setOnmspointerleave( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointermove;

    @JsProperty( name = "onmspointermove")
    public native Function1<MSPointerEvent, Object> getOnmspointermove();

    @JsProperty( name = "onmspointermove")
    public native void setOnmspointermove( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerout;

    @JsProperty( name = "onmspointerout")
    public native Function1<MSPointerEvent, Object> getOnmspointerout();

    @JsProperty( name = "onmspointerout")
    public native void setOnmspointerout( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerover;

    @JsProperty( name = "onmspointerover")
    public native Function1<MSPointerEvent, Object> getOnmspointerover();

    @JsProperty( name = "onmspointerover")
    public native void setOnmspointerover( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerup;

    @JsProperty( name = "onmspointerup")
    public native Function1<MSPointerEvent, Object> getOnmspointerup();

    @JsProperty( name = "onmspointerup")
    public native void setOnmspointerup( Function1<MSPointerEvent, Object> value );

    public Function1<Event, Object> onoffline;

    @JsProperty( name = "onoffline")
    public native Function1<Event, Object> getOnoffline();

    @JsProperty( name = "onoffline")
    public native void setOnoffline( Function1<Event, Object> value );

    public Function1<Event, Object> ononline;

    @JsProperty( name = "ononline")
    public native Function1<Event, Object> getOnonline();

    @JsProperty( name = "ononline")
    public native void setOnonline( Function1<Event, Object> value );

    public Function1<Event, Object> onorientationchange;

    @JsProperty( name = "onorientationchange")
    public native Function1<Event, Object> getOnorientationchange();

    @JsProperty( name = "onorientationchange")
    public native void setOnorientationchange( Function1<Event, Object> value );

    public Function1<PageTransitionEvent, Object> onpagehide;

    @JsProperty( name = "onpagehide")
    public native Function1<PageTransitionEvent, Object> getOnpagehide();

    @JsProperty( name = "onpagehide")
    public native void setOnpagehide( Function1<PageTransitionEvent, Object> value );

    public Function1<PageTransitionEvent, Object> onpageshow;

    @JsProperty( name = "onpageshow")
    public native Function1<PageTransitionEvent, Object> getOnpageshow();

    @JsProperty( name = "onpageshow")
    public native void setOnpageshow( Function1<PageTransitionEvent, Object> value );

    public Function1<Event, Object> onpause;

    @JsProperty( name = "onpause")
    public native Function1<Event, Object> getOnpause();

    @JsProperty( name = "onpause")
    public native void setOnpause( Function1<Event, Object> value );

    public Function1<Event, Object> onplay;

    @JsProperty( name = "onplay")
    public native Function1<Event, Object> getOnplay();

    @JsProperty( name = "onplay")
    public native void setOnplay( Function1<Event, Object> value );

    public Function1<Event, Object> onplaying;

    @JsProperty( name = "onplaying")
    public native Function1<Event, Object> getOnplaying();

    @JsProperty( name = "onplaying")
    public native void setOnplaying( Function1<Event, Object> value );

    public Function1<PointerEvent, Object> onpointercancel;

    @JsProperty( name = "onpointercancel")
    public native Function1<PointerEvent, Object> getOnpointercancel();

    @JsProperty( name = "onpointercancel")
    public native void setOnpointercancel( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerdown;

    @JsProperty( name = "onpointerdown")
    public native Function1<PointerEvent, Object> getOnpointerdown();

    @JsProperty( name = "onpointerdown")
    public native void setOnpointerdown( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerenter;

    @JsProperty( name = "onpointerenter")
    public native Function1<PointerEvent, Object> getOnpointerenter();

    @JsProperty( name = "onpointerenter")
    public native void setOnpointerenter( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerleave;

    @JsProperty( name = "onpointerleave")
    public native Function1<PointerEvent, Object> getOnpointerleave();

    @JsProperty( name = "onpointerleave")
    public native void setOnpointerleave( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointermove;

    @JsProperty( name = "onpointermove")
    public native Function1<PointerEvent, Object> getOnpointermove();

    @JsProperty( name = "onpointermove")
    public native void setOnpointermove( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerout;

    @JsProperty( name = "onpointerout")
    public native Function1<PointerEvent, Object> getOnpointerout();

    @JsProperty( name = "onpointerout")
    public native void setOnpointerout( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerover;

    @JsProperty( name = "onpointerover")
    public native Function1<PointerEvent, Object> getOnpointerover();

    @JsProperty( name = "onpointerover")
    public native void setOnpointerover( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerup;

    @JsProperty( name = "onpointerup")
    public native Function1<PointerEvent, Object> getOnpointerup();

    @JsProperty( name = "onpointerup")
    public native void setOnpointerup( Function1<PointerEvent, Object> value );

    public Function1<PopStateEvent, Object> onpopstate;

    @JsProperty( name = "onpopstate")
    public native Function1<PopStateEvent, Object> getOnpopstate();

    @JsProperty( name = "onpopstate")
    public native void setOnpopstate( Function1<PopStateEvent, Object> value );

    public Function1<ProgressEvent, Object> onprogress;

    @JsProperty( name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();

    @JsProperty( name = "onprogress")
    public native void setOnprogress( Function1<ProgressEvent, Object> value );

    public Function1<Event, Object> onratechange;

    @JsProperty( name = "onratechange")
    public native Function1<Event, Object> getOnratechange();

    @JsProperty( name = "onratechange")
    public native void setOnratechange( Function1<Event, Object> value );

    public Function1<ProgressEvent, Object> onreadystatechange;

    @JsProperty( name = "onreadystatechange")
    public native Function1<ProgressEvent, Object> getOnreadystatechange();

    @JsProperty( name = "onreadystatechange")
    public native void setOnreadystatechange( Function1<ProgressEvent, Object> value );

    public Function1<Event, Object> onreset;

    @JsProperty( name = "onreset")
    public native Function1<Event, Object> getOnreset();

    @JsProperty( name = "onreset")
    public native void setOnreset( Function1<Event, Object> value );

    public Function1<UIEvent, Object> onresize;

    @JsProperty( name = "onresize")
    public native Function1<UIEvent, Object> getOnresize();

    @JsProperty( name = "onresize")
    public native void setOnresize( Function1<UIEvent, Object> value );

    public Function1<UIEvent, Object> onscroll;

    @JsProperty( name = "onscroll")
    public native Function1<UIEvent, Object> getOnscroll();

    @JsProperty( name = "onscroll")
    public native void setOnscroll( Function1<UIEvent, Object> value );

    public Function1<Event, Object> onseeked;

    @JsProperty( name = "onseeked")
    public native Function1<Event, Object> getOnseeked();

    @JsProperty( name = "onseeked")
    public native void setOnseeked( Function1<Event, Object> value );

    public Function1<Event, Object> onseeking;

    @JsProperty( name = "onseeking")
    public native Function1<Event, Object> getOnseeking();

    @JsProperty( name = "onseeking")
    public native void setOnseeking( Function1<Event, Object> value );

    public Function1<UIEvent, Object> onselect;

    @JsProperty( name = "onselect")
    public native Function1<UIEvent, Object> getOnselect();

    @JsProperty( name = "onselect")
    public native void setOnselect( Function1<UIEvent, Object> value );

    public Function1<Event, Object> onstalled;

    @JsProperty( name = "onstalled")
    public native Function1<Event, Object> getOnstalled();

    @JsProperty( name = "onstalled")
    public native void setOnstalled( Function1<Event, Object> value );

    public Function1<StorageEvent, Object> onstorage;

    @JsProperty( name = "onstorage")
    public native Function1<StorageEvent, Object> getOnstorage();

    @JsProperty( name = "onstorage")
    public native void setOnstorage( Function1<StorageEvent, Object> value );

    public Function1<Event, Object> onsubmit;

    @JsProperty( name = "onsubmit")
    public native Function1<Event, Object> getOnsubmit();

    @JsProperty( name = "onsubmit")
    public native void setOnsubmit( Function1<Event, Object> value );

    public Function1<Event, Object> onsuspend;

    @JsProperty( name = "onsuspend")
    public native Function1<Event, Object> getOnsuspend();

    @JsProperty( name = "onsuspend")
    public native void setOnsuspend( Function1<Event, Object> value );

    public Function1<Event, Object> ontimeupdate;

    @JsProperty( name = "ontimeupdate")
    public native Function1<Event, Object> getOntimeupdate();

    @JsProperty( name = "ontimeupdate")
    public native void setOntimeupdate( Function1<Event, Object> value );

    public Function1<TouchEvent, Object> ontouchcancel;

    @JsProperty( name = "ontouchcancel")
    public native Function1<TouchEvent, Object> getOntouchcancel();

    @JsProperty( name = "ontouchcancel")
    public native void setOntouchcancel( Function1<TouchEvent, Object> value );

    public Function1<TouchEvent, Object> ontouchend;

    @JsProperty( name = "ontouchend")
    public native Function1<TouchEvent, Object> getOntouchend();

    @JsProperty( name = "ontouchend")
    public native void setOntouchend( Function1<TouchEvent, Object> value );

    public Function1<TouchEvent, Object> ontouchmove;

    @JsProperty( name = "ontouchmove")
    public native Function1<TouchEvent, Object> getOntouchmove();

    @JsProperty( name = "ontouchmove")
    public native void setOntouchmove( Function1<TouchEvent, Object> value );

    public Function1<TouchEvent, Object> ontouchstart;

    @JsProperty( name = "ontouchstart")
    public native Function1<TouchEvent, Object> getOntouchstart();

    @JsProperty( name = "ontouchstart")
    public native void setOntouchstart( Function1<TouchEvent, Object> value );

    public Function1<Event, Object> onunload;

    @JsProperty( name = "onunload")
    public native Function1<Event, Object> getOnunload();

    @JsProperty( name = "onunload")
    public native void setOnunload( Function1<Event, Object> value );

    public Function1<Event, Object> onvolumechange;

    @JsProperty( name = "onvolumechange")
    public native Function1<Event, Object> getOnvolumechange();

    @JsProperty( name = "onvolumechange")
    public native void setOnvolumechange( Function1<Event, Object> value );

    public Function1<Event, Object> onwaiting;

    @JsProperty( name = "onwaiting")
    public native Function1<Event, Object> getOnwaiting();

    @JsProperty( name = "onwaiting")
    public native void setOnwaiting( Function1<Event, Object> value );

    public Function1<WheelEvent, Object> onwheel;

    @JsProperty( name = "onwheel")
    public native Function1<WheelEvent, Object> getOnwheel();

    @JsProperty( name = "onwheel")
    public native void setOnwheel( Function1<WheelEvent, Object> value );

    public Object opener;

    @JsProperty( name = "opener")
    public native Object getOpener();

    @JsProperty( name = "opener")
    public native void setOpener( Object value );

    public PropertyKey_UnionOfNumberAndString orientation;

    @JsProperty( name = "orientation")
    public native PropertyKey_UnionOfNumberAndString getOrientation();

    @JsProperty( name = "orientation")
    public native void setOrientation( PropertyKey_UnionOfNumberAndString value );

    @JsOverlay
    public final void setOrientation( Number value ) { setOrientation(PropertyKey_UnionOfNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setOrientation( String value ) { setOrientation(PropertyKey_UnionOfNumberAndString.ofString( value )); }

    public Number outerHeight;

    @JsProperty( name = "outerHeight")
    public native Number getOuterHeight();

    @JsProperty( name = "outerHeight")
    public native void setOuterHeight( Number value );

    public Number outerWidth;

    @JsProperty( name = "outerWidth")
    public native Number getOuterWidth();

    @JsProperty( name = "outerWidth")
    public native void setOuterWidth( Number value );

    public Number pageXOffset;

    @JsProperty( name = "pageXOffset")
    public native Number getPageXOffset();

    @JsProperty( name = "pageXOffset")
    public native void setPageXOffset( Number value );

    public Number pageYOffset;

    @JsProperty( name = "pageYOffset")
    public native Number getPageYOffset();

    @JsProperty( name = "pageYOffset")
    public native void setPageYOffset( Number value );

    public Window parent;

    @JsProperty( name = "parent")
    public native Window getParent();

    @JsProperty( name = "parent")
    public native void setParent( Window value );

    public Performance performance;

    @JsProperty( name = "performance")
    public native Performance getPerformance();

    @JsProperty( name = "performance")
    public native void setPerformance( Performance value );

    public BarProp personalbar;

    @JsProperty( name = "personalbar")
    public native BarProp getPersonalbar();

    @JsProperty( name = "personalbar")
    public native void setPersonalbar( BarProp value );

    public Screen screen;

    @JsProperty( name = "screen")
    public native Screen getScreen();

    @JsProperty( name = "screen")
    public native void setScreen( Screen value );

    public Number screenLeft;

    @JsProperty( name = "screenLeft")
    public native Number getScreenLeft();

    @JsProperty( name = "screenLeft")
    public native void setScreenLeft( Number value );

    public Number screenTop;

    @JsProperty( name = "screenTop")
    public native Number getScreenTop();

    @JsProperty( name = "screenTop")
    public native void setScreenTop( Number value );

    public Number screenX;

    @JsProperty( name = "screenX")
    public native Number getScreenX();

    @JsProperty( name = "screenX")
    public native void setScreenX( Number value );

    public Number screenY;

    @JsProperty( name = "screenY")
    public native Number getScreenY();

    @JsProperty( name = "screenY")
    public native void setScreenY( Number value );

    public Number scrollX;

    @JsProperty( name = "scrollX")
    public native Number getScrollX();

    @JsProperty( name = "scrollX")
    public native void setScrollX( Number value );

    public Number scrollY;

    @JsProperty( name = "scrollY")
    public native Number getScrollY();

    @JsProperty( name = "scrollY")
    public native void setScrollY( Number value );

    public BarProp scrollbars;

    @JsProperty( name = "scrollbars")
    public native BarProp getScrollbars();

    @JsProperty( name = "scrollbars")
    public native void setScrollbars( BarProp value );

    public Window self;

    @JsProperty( name = "self")
    public native Window getSelf();

    @JsProperty( name = "self")
    public native void setSelf( Window value );

    public Storage sessionStorage;

    @JsProperty( name = "sessionStorage")
    public native Storage getSessionStorage();

    @JsProperty( name = "sessionStorage")
    public native void setSessionStorage( Storage value );

    public SpeechSynthesis speechSynthesis;

    @JsProperty( name = "speechSynthesis")
    public native SpeechSynthesis getSpeechSynthesis();

    @JsProperty( name = "speechSynthesis")
    public native void setSpeechSynthesis( SpeechSynthesis value );

    public String status;

    @JsProperty( name = "status")
    public native String getStatus();

    @JsProperty( name = "status")
    public native void setStatus( String value );

    public BarProp statusbar;

    @JsProperty( name = "statusbar")
    public native BarProp getStatusbar();

    @JsProperty( name = "statusbar")
    public native void setStatusbar( BarProp value );

    public StyleMedia styleMedia;

    @JsProperty( name = "styleMedia")
    public native StyleMedia getStyleMedia();

    @JsProperty( name = "styleMedia")
    public native void setStyleMedia( StyleMedia value );

    public BarProp toolbar;

    @JsProperty( name = "toolbar")
    public native BarProp getToolbar();

    @JsProperty( name = "toolbar")
    public native void setToolbar( BarProp value );

    public Window top;

    @JsProperty( name = "top")
    public native Window getTop();

    @JsProperty( name = "top")
    public native void setTop( Window value );

    public Window window;

    @JsProperty( name = "window")
    public native Window getWindow();

    @JsProperty( name = "window")
    public native void setWindow( Window value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1))
      * TE Signature : S(addEventListener,P(d1))
      * 
     */
    public native void addEventListener(String type);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(alert,289,,)
      * TE Signature : S(alert,)
      * 
     */
    public native void alert();
    /** 
      * Std Signature : S(alert,289,,P(d3))
      * TE Signature : S(alert,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714054
     */
    public native void alert(Object message /* optional */);
    /** 
      * Std Signature : S(atob,1,,P(d1))
      * TE Signature : S(atob,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String atob(String encodedString);
    /** 
      * Std Signature : S(blur,289,,)
      * TE Signature : S(blur,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714086
     */
    public native void blur();
    /** 
      * Std Signature : S(btoa,1,,P(d1))
      * TE Signature : S(btoa,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String btoa(String rawString);
    /** 
      * Std Signature : S(cancelAnimationFrame,289,,P(d2))
      * TE Signature : S(cancelAnimationFrame,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714104
     */
    public native void cancelAnimationFrame(Number handle);
    /** 
      * Std Signature : S(captureEvents,289,,)
      * TE Signature : S(captureEvents,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714152
     */
    public native void captureEvents();
    /** 
      * Std Signature : S(clearImmediate,289,,P(d2))
      * TE Signature : S(clearImmediate,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void clearImmediate(Number handle);
    /** 
      * Std Signature : S(clearInterval,289,,P(d2))
      * TE Signature : S(clearInterval,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void clearInterval(Number handle);
    /** 
      * Std Signature : S(clearTimeout,289,,P(d2))
      * TE Signature : S(clearTimeout,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void clearTimeout(Number handle);
    /** 
      * Std Signature : S(close,289,,)
      * TE Signature : S(close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714179
     */
    public native void close();
    /** 
      * Std Signature : S(confirm,27,,)
      * TE Signature : S(confirm,)
      * 
     */
    public native Boolean confirm();
    /** 
      * Std Signature : S(confirm,27,,P(d1))
      * TE Signature : S(confirm,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714198
     */
    public native Boolean confirm(String message /* optional */);
    /** 
      * Std Signature : S(departFocus,289,,P(d1),P(d207))
      * TE Signature : S(departFocus,P(d1),P(d207))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714238
     */
    public native void departFocus(String navigationReason, FocusNavigationOrigin origin);
    /** 
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(fetch,88<148>,,P(d1))
      * TE Signature : S(fetch,P(d1))
      * 
     */
    public native Promise<Response> fetch(String input);
    /** 
      * Std Signature : S(fetch,88<148>,,P(d1),P(d145))
      * TE Signature : S(fetch,P(d1),P(d145))
      * 
     */
    public native Promise<Response> fetch(String input, RequestInit init /* optional */);
    /** 
      * Std Signature : S(fetch,88<148>,,P(d146))
      * TE Signature : S(fetch,P(d146))
      * 
     */
    public native Promise<Response> fetch(Request input);
    /** 
      * Std Signature : S(fetch,88<148>,,P(d146),P(d145))
      * TE Signature : S(fetch,P(d146),P(d145))
      * 
     */
    public native Promise<Response> fetch(Request input, RequestInit init /* optional */);
    /** 
      * Std Signature : S(fetch,88<148>,,P(dU(-146,1)))
      * TE Signature : S(fetch,P(dU(-146,1)))
      * 
     */
    public native Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input);
    /** 
      * Std Signature : S(fetch,88<148>,,P(dU(-146,1)),P(d145))
      * TE Signature : S(fetch,P(dU(-146,1)),P(d145))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input, RequestInit init /* optional */);
    /** 
      * Std Signature : S(focus,289,,)
      * TE Signature : S(focus,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714318
     */
    public native void focus();
    /** 
      * Std Signature : S(getComputedStyle,290,,P(d49))
      * TE Signature : S(getComputedStyle,P(d49))
      * 
     */
    public native CSSStyleDeclaration getComputedStyle(Element elt);
    /** 
      * Std Signature : S(getComputedStyle,290,,P(d49),P(d1))
      * TE Signature : S(getComputedStyle,P(d49),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714337
     */
    public native CSSStyleDeclaration getComputedStyle(Element elt, String pseudoElt /* optional */);
    /** 
      * Std Signature : S(getMatchedCSSRules,291,,P(d49))
      * TE Signature : S(getMatchedCSSRules,P(d49))
      * 
     */
    public native CSSRuleList getMatchedCSSRules(Element elt);
    /** 
      * Std Signature : S(getMatchedCSSRules,291,,P(d49),P(d1))
      * TE Signature : S(getMatchedCSSRules,P(d49),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714414
     */
    public native CSSRuleList getMatchedCSSRules(Element elt, String pseudoElt /* optional */);
    /** 
      * Std Signature : S(getSelection,292,,)
      * TE Signature : S(getSelection,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714485
     */
    public native Selection getSelection();
    /** 
      * Std Signature : S(matchMedia,208,,P(d1))
      * TE Signature : S(matchMedia,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714516
     */
    public native MediaQueryList matchMedia(String mediaQuery);
    /** 
      * Std Signature : S(moveBy,289,,)
      * TE Signature : S(moveBy,)
      * 
     */
    public native void moveBy();
    /** 
      * Std Signature : S(moveBy,289,,P(d2))
      * TE Signature : S(moveBy,P(d2))
      * 
     */
    public native void moveBy(Number x /* optional */);
    /** 
      * Std Signature : S(moveBy,289,,P(d2),P(d2))
      * TE Signature : S(moveBy,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714568
     */
    public native void moveBy(Number x /* optional */, Number y /* optional */);
    /** 
      * Std Signature : S(moveTo,289,,)
      * TE Signature : S(moveTo,)
      * 
     */
    public native void moveTo();
    /** 
      * Std Signature : S(moveTo,289,,P(d2))
      * TE Signature : S(moveTo,P(d2))
      * 
     */
    public native void moveTo(Number x /* optional */);
    /** 
      * Std Signature : S(moveTo,289,,P(d2),P(d2))
      * TE Signature : S(moveTo,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714610
     */
    public native void moveTo(Number x /* optional */, Number y /* optional */);
    /** 
      * Std Signature : S(msWriteProfilerMark,289,,P(d1))
      * TE Signature : S(msWriteProfilerMark,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714652
     */
    public native void msWriteProfilerMark(String profilerMarkName);
    /** 
      * Std Signature : S(open,45,,)
      * TE Signature : S(open,)
      * 
     */
    public native Window open();
    /** 
      * Std Signature : S(open,45,,P(d1))
      * TE Signature : S(open,P(d1))
      * 
     */
    public native Window open(String url /* optional */);
    /** 
      * Std Signature : S(open,45,,P(d1),P(d1))
      * TE Signature : S(open,P(d1),P(d1))
      * 
     */
    public native Window open(String url /* optional */, String target /* optional */);
    /** 
      * Std Signature : S(open,45,,P(d1),P(d1),P(d1))
      * TE Signature : S(open,P(d1),P(d1),P(d1))
      * 
     */
    public native Window open(String url /* optional */, String target /* optional */, String features /* optional */);
    /** 
      * Std Signature : S(open,45,,P(d1),P(d1),P(d1),P(d27))
      * TE Signature : S(open,P(d1),P(d1),P(d1),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714709
     */
    public native Window open(String url /* optional */, String target /* optional */, String features /* optional */, Boolean replace /* optional */);
    /** 
      * Std Signature : S(postMessage,289,,P(d3),P(d1))
      * TE Signature : S(postMessage,P(d3),P(d1))
      * 
     */
    public native void postMessage(Object message, String targetOrigin);
    /** 
      * Std Signature : S(postMessage,289,,P(d3),P(d1),P(d7<3>))
      * TE Signature : S(postMessage,P(d3),P(d1),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714796
     */
    public native void postMessage(Object message, String targetOrigin, Array<Object> transfer /* optional */);
    /** 
      * Std Signature : S(print,289,,)
      * TE Signature : S(print,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714873
     */
    public native void print();
    /** 
      * Std Signature : S(prompt,1,,)
      * TE Signature : S(prompt,)
      * 
     */
    public native String prompt();
    /** 
      * Std Signature : S(prompt,1,,P(d1))
      * TE Signature : S(prompt,P(d1))
      * 
     */
    public native String prompt(String message /* optional */);
    /** 
      * Std Signature : S(prompt,1,,P(d1),P(d1))
      * TE Signature : S(prompt,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714892
     */
    public native String prompt(String message /* optional */, String _default /* optional */);
    /** 
      * Std Signature : S(releaseEvents,289,,)
      * TE Signature : S(releaseEvents,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714956
     */
    public native void releaseEvents();
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1))
      * TE Signature : S(removeEventListener,P(d1))
      * 
     */
    public native void removeEventListener(String type);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138))
      * TE Signature : S(removeEventListener,P(d1),P(d138))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(requestAnimationFrame,2,,P(dF--S(?,289,,P(d2))------)))
      * TE Signature : S(requestAnimationFrame,P(dF--S(?,P(d2))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@714983
     */
    public native Number requestAnimationFrame(FrameRequestCallback callback);
    /** 
      * Std Signature : S(resizeBy,289,,)
      * TE Signature : S(resizeBy,)
      * 
     */
    public native void resizeBy();
    /** 
      * Std Signature : S(resizeBy,289,,P(d2))
      * TE Signature : S(resizeBy,P(d2))
      * 
     */
    public native void resizeBy(Number x /* optional */);
    /** 
      * Std Signature : S(resizeBy,289,,P(d2),P(d2))
      * TE Signature : S(resizeBy,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715050
     */
    public native void resizeBy(Number x /* optional */, Number y /* optional */);
    /** 
      * Std Signature : S(resizeTo,289,,)
      * TE Signature : S(resizeTo,)
      * 
     */
    public native void resizeTo();
    /** 
      * Std Signature : S(resizeTo,289,,P(d2))
      * TE Signature : S(resizeTo,P(d2))
      * 
     */
    public native void resizeTo(Number x /* optional */);
    /** 
      * Std Signature : S(resizeTo,289,,P(d2),P(d2))
      * TE Signature : S(resizeTo,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715094
     */
    public native void resizeTo(Number x /* optional */, Number y /* optional */);
    /** 
      * Std Signature : S(scroll,289,,)
      * TE Signature : S(scroll,)
      * 
     */
    public native void scroll();
    /** 
      * Std Signature : S(scroll,289,,P(d136))
      * TE Signature : S(scroll,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715573
      * VERSION 1
     */
    public native void scroll(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scroll,289,,P(d2))
      * TE Signature : S(scroll,P(d2))
      * 
     */
    public native void scroll(Number x /* optional */);
    /** 
      * Std Signature : S(scroll,289,,P(d2),P(d2))
      * TE Signature : S(scroll,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715138
     */
    public native void scroll(Number x /* optional */, Number y /* optional */);
    /** 
      * Std Signature : S(scrollBy,289,,)
      * TE Signature : S(scrollBy,)
      * 
     */
    public native void scrollBy();
    /** 
      * Std Signature : S(scrollBy,289,,P(d136))
      * TE Signature : S(scrollBy,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715665
      * VERSION 1
     */
    public native void scrollBy(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollBy,289,,P(d2))
      * TE Signature : S(scrollBy,P(d2))
      * 
     */
    public native void scrollBy(Number x /* optional */);
    /** 
      * Std Signature : S(scrollBy,289,,P(d2),P(d2))
      * TE Signature : S(scrollBy,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715180
     */
    public native void scrollBy(Number x /* optional */, Number y /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,)
      * TE Signature : S(scrollTo,)
      * 
     */
    public native void scrollTo();
    /** 
      * Std Signature : S(scrollTo,289,,P(d136))
      * TE Signature : S(scrollTo,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715618
      * VERSION 1
     */
    public native void scrollTo(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,P(d2))
      * TE Signature : S(scrollTo,P(d2))
      * 
     */
    public native void scrollTo(Number x /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,P(d2),P(d2))
      * TE Signature : S(scrollTo,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715224
     */
    public native void scrollTo(Number x /* optional */, Number y /* optional */);
    /** 
      * Std Signature : S(setImmediate,2,,P(d3))
      * TE Signature : S(setImmediate,P(d3))
      * 
     */
    public native Number setImmediate(Object handler);
    /** 
      * Std Signature : S(setImmediate,2,,P(d3),P(D3))
      * TE Signature : S(setImmediate,P(d3),P(D3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number setImmediate(Object handler, Object... args);
    /** 
      * Std Signature : S(setImmediate,2,,P(dFP1--S(?,289,,P(d3))------)<3>))
      * TE Signature : S(setImmediate,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number setImmediate(Action1<Object> handler);
    /** 
      * Std Signature : S(setInterval,2,,P(d3))
      * TE Signature : S(setInterval,P(d3))
      * 
     */
    public native Number setInterval(Object handler);
    /** 
      * Std Signature : S(setInterval,2,,P(d3),P(d3))
      * TE Signature : S(setInterval,P(d3),P(d3))
      * 
     */
    public native Number setInterval(Object handler, Object timeout /* optional */);
    /** 
      * Std Signature : S(setInterval,2,,P(d3),P(d3),P(D3))
      * TE Signature : S(setInterval,P(d3),P(d3),P(D3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number setInterval(Object handler, Object timeout /* optional */, Object... args);
    /** 
      * Std Signature : S(setInterval,2,,P(dFP1--S(?,289,,P(d3))------)<3>),P(d2))
      * TE Signature : S(setInterval,P(dF--S(?,P(d3))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number setInterval(Action1<Object> handler, Number timeout);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3))
      * TE Signature : S(setTimeout,P(d3))
      * 
     */
    public native Number setTimeout(Object handler);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3),P(d3))
      * TE Signature : S(setTimeout,P(d3),P(d3))
      * 
     */
    public native Number setTimeout(Object handler, Object timeout /* optional */);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3),P(d3),P(D3))
      * TE Signature : S(setTimeout,P(d3),P(d3),P(D3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number setTimeout(Object handler, Object timeout /* optional */, Object... args);
    /** 
      * Std Signature : S(setTimeout,2,,P(dFP1--S(?,289,,P(d3))------)<3>),P(d2))
      * TE Signature : S(setTimeout,P(dF--S(?,P(d3))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number setTimeout(Action1<Object> handler, Number timeout);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715268
     */
    public native void stop();
    /** 
      * Std Signature : S(webkitCancelAnimationFrame,289,,P(d2))
      * TE Signature : S(webkitCancelAnimationFrame,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715286
     */
    public native void webkitCancelAnimationFrame(Number handle);
    /** 
      * Std Signature : S(webkitConvertPointFromNodeToPage,209,,P(d86),P(d209))
      * TE Signature : S(webkitConvertPointFromNodeToPage,P(d86),P(d209))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715340
     */
    public native WebKitPoint webkitConvertPointFromNodeToPage(Node node, WebKitPoint pt);
    /** 
      * Std Signature : S(webkitConvertPointFromPageToNode,209,,P(d86),P(d209))
      * TE Signature : S(webkitConvertPointFromPageToNode,P(d86),P(d209))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715420
     */
    public native WebKitPoint webkitConvertPointFromPageToNode(Node node, WebKitPoint pt);
    /** 
      * Std Signature : S(webkitRequestAnimationFrame,2,,P(dF--S(?,289,,P(d2))------)))
      * TE Signature : S(webkitRequestAnimationFrame,P(dF--S(?,P(d2))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@715500
     */
    public native Number webkitRequestAnimationFrame(FrameRequestCallback callback);
}
