package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SpeechSynthesisUtteranceEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:646513
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisUtteranceEventMap")
public class SpeechSynthesisUtteranceEventMap
{

    /*
        Properties
    */

    public Event boundary;

    @JsProperty( name = "boundary")
    public native Event getBoundary();

    @JsProperty( name = "boundary")
    public native void setBoundary( Event value );

    public Event end;

    @JsProperty( name = "end")
    public native Event getEnd();

    @JsProperty( name = "end")
    public native void setEnd( Event value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public Event mark;

    @JsProperty( name = "mark")
    public native Event getMark();

    @JsProperty( name = "mark")
    public native void setMark( Event value );

    public Event pause;

    @JsProperty( name = "pause")
    public native Event getPause();

    @JsProperty( name = "pause")
    public native void setPause( Event value );

    public Event resume;

    @JsProperty( name = "resume")
    public native Event getResume();

    @JsProperty( name = "resume")
    public native void setResume( Event value );

    public Event start;

    @JsProperty( name = "start")
    public native Event getStart();

    @JsProperty( name = "start")
    public native void setStart( Event value );
}
