package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler".VirtualTimeScheduler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler.d.ts:143
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="VirtualTimeScheduler")
public class VirtualTimeScheduler extends AsyncScheduler
{

    /*
        Constructors
    */
    public VirtualTimeScheduler(Object SchedulerAction, Number maxFrames){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="rxjs.VirtualTimeScheduler", name="frameTimeFactor")
    public static Number frameTimeFactor;

    /*
        Properties
    */

    public Number frame;

    @JsProperty( name = "frame")
    public native Number getFrame();

    @JsProperty( name = "frame")
    public native void setFrame( Number value );

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    public Number maxFrames;

    @JsProperty( name = "maxFrames")
    public native Number getMaxFrames();

    @JsProperty( name = "maxFrames")
    public native void setMaxFrames( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(flush,429,,)
      * TE Signature : S(flush,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler.d.ts@538
      * Prompt the Scheduler to execute all of its queued actions, therefore
      * clearing its queue.
     */
    public native void flush();
}
