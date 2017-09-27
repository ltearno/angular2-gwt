package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: Console
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:316760
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:317797
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Console")
public class Console
{

    /*
        Constructors
    */
    public Console(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(assert,289,,)
      * TE Signature : S(assert,)
      * 
     */
    @JsMethod(name = "assert")
    public native void assert_();
    /** 
      * Std Signature : S(assert,289,,P(d27))
      * TE Signature : S(assert,P(d27))
      * 
     */
    @JsMethod(name = "assert")
    public native void assert_(Boolean test /* optional */);
    /** 
      * Std Signature : S(assert,289,,P(d27),P(d1))
      * TE Signature : S(assert,P(d27),P(d1))
      * 
     */
    @JsMethod(name = "assert")
    public native void assert_(Boolean test /* optional */, String message /* optional */);
    /** 
      * Std Signature : S(assert,289,,P(d27),P(d1),P(D3))
      * TE Signature : S(assert,P(d27),P(d1),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@316786
     */
    @JsMethod(name = "assert")
    public native void assert_(Boolean test /* optional */, String message /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@316864
     */
    public native void clear();
    /** 
      * Std Signature : S(count,289,,)
      * TE Signature : S(count,)
      * 
     */
    public native void count();
    /** 
      * Std Signature : S(count,289,,P(d1))
      * TE Signature : S(count,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@316883
     */
    public native void count(String countTitle /* optional */);
    /** 
      * Std Signature : S(debug,289,,)
      * TE Signature : S(debug,)
      * 
     */
    public native void debug();
    /** 
      * Std Signature : S(debug,289,,P(d3))
      * TE Signature : S(debug,P(d3))
      * 
     */
    public native void debug(Object message /* optional */);
    /** 
      * Std Signature : S(debug,289,,P(d3),P(D3))
      * TE Signature : S(debug,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@316921
     */
    public native void debug(Object message /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(dir,289,,)
      * TE Signature : S(dir,)
      * 
     */
    public native void dir();
    /** 
      * Std Signature : S(dir,289,,P(d3))
      * TE Signature : S(dir,P(d3))
      * 
     */
    public native void dir(Object value /* optional */);
    /** 
      * Std Signature : S(dir,289,,P(d3),P(D3))
      * TE Signature : S(dir,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@316979
     */
    public native void dir(Object value /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(dirxml,289,,P(d3))
      * TE Signature : S(dirxml,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317033
     */
    public native void dirxml(Object value);
    /** 
      * Std Signature : S(error,289,,)
      * TE Signature : S(error,)
      * 
     */
    public native void error();
    /** 
      * Std Signature : S(error,289,,P(d3))
      * TE Signature : S(error,P(d3))
      * 
     */
    public native void error(Object message /* optional */);
    /** 
      * Std Signature : S(error,289,,P(d3),P(D3))
      * TE Signature : S(error,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317063
     */
    public native void error(Object message /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(exception,289,,)
      * TE Signature : S(exception,)
      * 
     */
    public native void exception();
    /** 
      * Std Signature : S(exception,289,,P(d1))
      * TE Signature : S(exception,P(d1))
      * 
     */
    public native void exception(String message /* optional */);
    /** 
      * Std Signature : S(exception,289,,P(d1),P(D3))
      * TE Signature : S(exception,P(d1),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317121
     */
    public native void exception(String message /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(group,289,,)
      * TE Signature : S(group,)
      * 
     */
    public native void group();
    /** 
      * Std Signature : S(group,289,,P(d1))
      * TE Signature : S(group,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317186
     */
    public native void group(String groupTitle /* optional */);
    /** 
      * Std Signature : S(groupCollapsed,289,,)
      * TE Signature : S(groupCollapsed,)
      * 
     */
    public native void groupCollapsed();
    /** 
      * Std Signature : S(groupCollapsed,289,,P(d1))
      * TE Signature : S(groupCollapsed,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317224
     */
    public native void groupCollapsed(String groupTitle /* optional */);
    /** 
      * Std Signature : S(groupEnd,289,,)
      * TE Signature : S(groupEnd,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317271
     */
    public native void groupEnd();
    /** 
      * Std Signature : S(info,289,,)
      * TE Signature : S(info,)
      * 
     */
    public native void info();
    /** 
      * Std Signature : S(info,289,,P(d3))
      * TE Signature : S(info,P(d3))
      * 
     */
    public native void info(Object message /* optional */);
    /** 
      * Std Signature : S(info,289,,P(d3),P(D3))
      * TE Signature : S(info,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317293
     */
    public native void info(Object message /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(log,289,,)
      * TE Signature : S(log,)
      * 
     */
    public native void log();
    /** 
      * Std Signature : S(log,289,,P(d3))
      * TE Signature : S(log,P(d3))
      * 
     */
    public native void log(Object message /* optional */);
    /** 
      * Std Signature : S(log,289,,P(d3),P(D3))
      * TE Signature : S(log,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317350
     */
    public native void log(Object message /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(msIsIndependentlyComposed,27,,P(d49))
      * TE Signature : S(msIsIndependentlyComposed,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317406
     */
    public native Boolean msIsIndependentlyComposed(Element element);
    /** 
      * Std Signature : S(profile,289,,)
      * TE Signature : S(profile,)
      * 
     */
    public native void profile();
    /** 
      * Std Signature : S(profile,289,,P(d1))
      * TE Signature : S(profile,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317464
     */
    public native void profile(String reportName /* optional */);
    /** 
      * Std Signature : S(profileEnd,289,,)
      * TE Signature : S(profileEnd,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317504
     */
    public native void profileEnd();
    /** 
      * Std Signature : S(select,289,,P(d49))
      * TE Signature : S(select,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317528
     */
    public native void select(Element element);
    /** 
      * Std Signature : S(table,289,,)
      * TE Signature : S(table,)
      * 
     */
    public native void table();
    /** 
      * Std Signature : S(table,289,,P(D3))
      * TE Signature : S(table,P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317564
     */
    public native void table(Object... data);
    /** 
      * Std Signature : S(time,289,,)
      * TE Signature : S(time,)
      * 
     */
    public native void time();
    /** 
      * Std Signature : S(time,289,,P(d1))
      * TE Signature : S(time,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317597
     */
    public native void time(String timerName /* optional */);
    /** 
      * Std Signature : S(timeEnd,289,,)
      * TE Signature : S(timeEnd,)
      * 
     */
    public native void timeEnd();
    /** 
      * Std Signature : S(timeEnd,289,,P(d1))
      * TE Signature : S(timeEnd,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317633
     */
    public native void timeEnd(String timerName /* optional */);
    /** 
      * Std Signature : S(trace,289,,)
      * TE Signature : S(trace,)
      * 
     */
    public native void trace();
    /** 
      * Std Signature : S(trace,289,,P(d3))
      * TE Signature : S(trace,P(d3))
      * 
     */
    public native void trace(Object message /* optional */);
    /** 
      * Std Signature : S(trace,289,,P(d3),P(D3))
      * TE Signature : S(trace,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317672
     */
    public native void trace(Object message /* optional */, Object... optionalParams);
    /** 
      * Std Signature : S(warn,289,,)
      * TE Signature : S(warn,)
      * 
     */
    public native void warn();
    /** 
      * Std Signature : S(warn,289,,P(d3))
      * TE Signature : S(warn,P(d3))
      * 
     */
    public native void warn(Object message /* optional */);
    /** 
      * Std Signature : S(warn,289,,P(d3),P(D3))
      * TE Signature : S(warn,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@317730
     */
    public native void warn(Object message /* optional */, Object... optionalParams);
}
