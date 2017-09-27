package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLElement
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:400082
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:405063
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface HTMLElement extends Element
{

    /*
        Properties
    */

    @JsProperty( name = "accessKey")
    String getAccessKey();

    @JsProperty( name = "accessKey")
    void setAccessKey( String value );

    @JsProperty( name = "contentEditable")
    String getContentEditable();

    @JsProperty( name = "contentEditable")
    void setContentEditable( String value );

    @JsProperty( name = "dataset")
    DOMStringMap getDataset();

    @JsProperty( name = "dataset")
    void setDataset( DOMStringMap value );

    @JsProperty( name = "dir")
    String getDir();

    @JsProperty( name = "dir")
    void setDir( String value );

    @JsProperty( name = "draggable")
    Boolean getDraggable();

    @JsProperty( name = "draggable")
    void setDraggable( Boolean value );

    @JsProperty( name = "hidden")
    Boolean getHidden();

    @JsProperty( name = "hidden")
    void setHidden( Boolean value );

    @JsProperty( name = "hideFocus")
    Boolean getHideFocus();

    @JsProperty( name = "hideFocus")
    void setHideFocus( Boolean value );

    @JsProperty( name = "innerText")
    String getInnerText();

    @JsProperty( name = "innerText")
    void setInnerText( String value );

    @JsProperty( name = "isContentEditable")
    Boolean getIsContentEditable();

    @JsProperty( name = "isContentEditable")
    void setIsContentEditable( Boolean value );

    @JsProperty( name = "lang")
    String getLang();

    @JsProperty( name = "lang")
    void setLang( String value );

    @JsProperty( name = "offsetHeight")
    Number getOffsetHeight();

    @JsProperty( name = "offsetHeight")
    void setOffsetHeight( Number value );

    @JsProperty( name = "offsetLeft")
    Number getOffsetLeft();

    @JsProperty( name = "offsetLeft")
    void setOffsetLeft( Number value );

    @JsProperty( name = "offsetParent")
    Element getOffsetParent();

    @JsProperty( name = "offsetParent")
    void setOffsetParent( Element value );

    @JsProperty( name = "offsetTop")
    Number getOffsetTop();

    @JsProperty( name = "offsetTop")
    void setOffsetTop( Number value );

    @JsProperty( name = "offsetWidth")
    Number getOffsetWidth();

    @JsProperty( name = "offsetWidth")
    void setOffsetWidth( Number value );

    @JsProperty( name = "onabort")
    Function1<UIEvent, Object> getOnabort();

    @JsProperty( name = "onabort")
    void setOnabort( Function1<UIEvent, Object> value );

    @JsProperty( name = "onactivate")
    Function1<UIEvent, Object> getOnactivate();

    @JsProperty( name = "onactivate")
    void setOnactivate( Function1<UIEvent, Object> value );

    @JsProperty( name = "onbeforeactivate")
    Function1<UIEvent, Object> getOnbeforeactivate();

    @JsProperty( name = "onbeforeactivate")
    void setOnbeforeactivate( Function1<UIEvent, Object> value );

    @JsProperty( name = "onbeforecopy")
    Function1<ClipboardEvent, Object> getOnbeforecopy();

    @JsProperty( name = "onbeforecopy")
    void setOnbeforecopy( Function1<ClipboardEvent, Object> value );

    @JsProperty( name = "onbeforecut")
    Function1<ClipboardEvent, Object> getOnbeforecut();

    @JsProperty( name = "onbeforecut")
    void setOnbeforecut( Function1<ClipboardEvent, Object> value );

    @JsProperty( name = "onbeforedeactivate")
    Function1<UIEvent, Object> getOnbeforedeactivate();

    @JsProperty( name = "onbeforedeactivate")
    void setOnbeforedeactivate( Function1<UIEvent, Object> value );

    @JsProperty( name = "onbeforepaste")
    Function1<ClipboardEvent, Object> getOnbeforepaste();

    @JsProperty( name = "onbeforepaste")
    void setOnbeforepaste( Function1<ClipboardEvent, Object> value );

    @JsProperty( name = "onblur")
    Function1<FocusEvent, Object> getOnblur();

    @JsProperty( name = "onblur")
    void setOnblur( Function1<FocusEvent, Object> value );

    @JsProperty( name = "oncanplay")
    Function1<Event, Object> getOncanplay();

    @JsProperty( name = "oncanplay")
    void setOncanplay( Function1<Event, Object> value );

    @JsProperty( name = "oncanplaythrough")
    Function1<Event, Object> getOncanplaythrough();

    @JsProperty( name = "oncanplaythrough")
    void setOncanplaythrough( Function1<Event, Object> value );

    @JsProperty( name = "onchange")
    Function1<Event, Object> getOnchange();

    @JsProperty( name = "onchange")
    void setOnchange( Function1<Event, Object> value );

    @JsProperty( name = "onclick")
    Function1<MouseEvent, Object> getOnclick();

    @JsProperty( name = "onclick")
    void setOnclick( Function1<MouseEvent, Object> value );

    @JsProperty( name = "oncontextmenu")
    Function1<PointerEvent, Object> getOncontextmenu();

    @JsProperty( name = "oncontextmenu")
    void setOncontextmenu( Function1<PointerEvent, Object> value );

    @JsProperty( name = "oncopy")
    Function1<ClipboardEvent, Object> getOncopy();

    @JsProperty( name = "oncopy")
    void setOncopy( Function1<ClipboardEvent, Object> value );

    @JsProperty( name = "oncuechange")
    Function1<Event, Object> getOncuechange();

    @JsProperty( name = "oncuechange")
    void setOncuechange( Function1<Event, Object> value );

    @JsProperty( name = "oncut")
    Function1<ClipboardEvent, Object> getOncut();

    @JsProperty( name = "oncut")
    void setOncut( Function1<ClipboardEvent, Object> value );

    @JsProperty( name = "ondblclick")
    Function1<MouseEvent, Object> getOndblclick();

    @JsProperty( name = "ondblclick")
    void setOndblclick( Function1<MouseEvent, Object> value );

    @JsProperty( name = "ondeactivate")
    Function1<UIEvent, Object> getOndeactivate();

    @JsProperty( name = "ondeactivate")
    void setOndeactivate( Function1<UIEvent, Object> value );

    @JsProperty( name = "ondrag")
    Function1<DragEvent, Object> getOndrag();

    @JsProperty( name = "ondrag")
    void setOndrag( Function1<DragEvent, Object> value );

    @JsProperty( name = "ondragend")
    Function1<DragEvent, Object> getOndragend();

    @JsProperty( name = "ondragend")
    void setOndragend( Function1<DragEvent, Object> value );

    @JsProperty( name = "ondragenter")
    Function1<DragEvent, Object> getOndragenter();

    @JsProperty( name = "ondragenter")
    void setOndragenter( Function1<DragEvent, Object> value );

    @JsProperty( name = "ondragleave")
    Function1<DragEvent, Object> getOndragleave();

    @JsProperty( name = "ondragleave")
    void setOndragleave( Function1<DragEvent, Object> value );

    @JsProperty( name = "ondragover")
    Function1<DragEvent, Object> getOndragover();

    @JsProperty( name = "ondragover")
    void setOndragover( Function1<DragEvent, Object> value );

    @JsProperty( name = "ondragstart")
    Function1<DragEvent, Object> getOndragstart();

    @JsProperty( name = "ondragstart")
    void setOndragstart( Function1<DragEvent, Object> value );

    @JsProperty( name = "ondrop")
    Function1<DragEvent, Object> getOndrop();

    @JsProperty( name = "ondrop")
    void setOndrop( Function1<DragEvent, Object> value );

    @JsProperty( name = "ondurationchange")
    Function1<Event, Object> getOndurationchange();

    @JsProperty( name = "ondurationchange")
    void setOndurationchange( Function1<Event, Object> value );

    @JsProperty( name = "onemptied")
    Function1<Event, Object> getOnemptied();

    @JsProperty( name = "onemptied")
    void setOnemptied( Function1<Event, Object> value );

    @JsProperty( name = "onended")
    Function1<MediaStreamErrorEvent, Object> getOnended();

    @JsProperty( name = "onended")
    void setOnended( Function1<MediaStreamErrorEvent, Object> value );

    @JsProperty( name = "onerror")
    Function1<ErrorEvent, Object> getOnerror();

    @JsProperty( name = "onerror")
    void setOnerror( Function1<ErrorEvent, Object> value );

    @JsProperty( name = "onfocus")
    Function1<FocusEvent, Object> getOnfocus();

    @JsProperty( name = "onfocus")
    void setOnfocus( Function1<FocusEvent, Object> value );

    @JsProperty( name = "oninput")
    Function1<Event, Object> getOninput();

    @JsProperty( name = "oninput")
    void setOninput( Function1<Event, Object> value );

    @JsProperty( name = "oninvalid")
    Function1<Event, Object> getOninvalid();

    @JsProperty( name = "oninvalid")
    void setOninvalid( Function1<Event, Object> value );

    @JsProperty( name = "onkeydown")
    Function1<KeyboardEvent, Object> getOnkeydown();

    @JsProperty( name = "onkeydown")
    void setOnkeydown( Function1<KeyboardEvent, Object> value );

    @JsProperty( name = "onkeypress")
    Function1<KeyboardEvent, Object> getOnkeypress();

    @JsProperty( name = "onkeypress")
    void setOnkeypress( Function1<KeyboardEvent, Object> value );

    @JsProperty( name = "onkeyup")
    Function1<KeyboardEvent, Object> getOnkeyup();

    @JsProperty( name = "onkeyup")
    void setOnkeyup( Function1<KeyboardEvent, Object> value );

    @JsProperty( name = "onload")
    Function1<Event, Object> getOnload();

    @JsProperty( name = "onload")
    void setOnload( Function1<Event, Object> value );

    @JsProperty( name = "onloadeddata")
    Function1<Event, Object> getOnloadeddata();

    @JsProperty( name = "onloadeddata")
    void setOnloadeddata( Function1<Event, Object> value );

    @JsProperty( name = "onloadedmetadata")
    Function1<Event, Object> getOnloadedmetadata();

    @JsProperty( name = "onloadedmetadata")
    void setOnloadedmetadata( Function1<Event, Object> value );

    @JsProperty( name = "onloadstart")
    Function1<Event, Object> getOnloadstart();

    @JsProperty( name = "onloadstart")
    void setOnloadstart( Function1<Event, Object> value );

    @JsProperty( name = "onmousedown")
    Function1<MouseEvent, Object> getOnmousedown();

    @JsProperty( name = "onmousedown")
    void setOnmousedown( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseenter")
    Function1<MouseEvent, Object> getOnmouseenter();

    @JsProperty( name = "onmouseenter")
    void setOnmouseenter( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseleave")
    Function1<MouseEvent, Object> getOnmouseleave();

    @JsProperty( name = "onmouseleave")
    void setOnmouseleave( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmousemove")
    Function1<MouseEvent, Object> getOnmousemove();

    @JsProperty( name = "onmousemove")
    void setOnmousemove( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseout")
    Function1<MouseEvent, Object> getOnmouseout();

    @JsProperty( name = "onmouseout")
    void setOnmouseout( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseover")
    Function1<MouseEvent, Object> getOnmouseover();

    @JsProperty( name = "onmouseover")
    void setOnmouseover( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseup")
    Function1<MouseEvent, Object> getOnmouseup();

    @JsProperty( name = "onmouseup")
    void setOnmouseup( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmousewheel")
    Function1<WheelEvent, Object> getOnmousewheel();

    @JsProperty( name = "onmousewheel")
    void setOnmousewheel( Function1<WheelEvent, Object> value );

    @JsProperty( name = "onmscontentzoom")
    Function1<UIEvent, Object> getOnmscontentzoom();

    @JsProperty( name = "onmscontentzoom")
    void setOnmscontentzoom( Function1<UIEvent, Object> value );

    @JsProperty( name = "onmsmanipulationstatechanged")
    Function1<MSManipulationEvent, Object> getOnmsmanipulationstatechanged();

    @JsProperty( name = "onmsmanipulationstatechanged")
    void setOnmsmanipulationstatechanged( Function1<MSManipulationEvent, Object> value );

    @JsProperty( name = "onpaste")
    Function1<ClipboardEvent, Object> getOnpaste();

    @JsProperty( name = "onpaste")
    void setOnpaste( Function1<ClipboardEvent, Object> value );

    @JsProperty( name = "onpause")
    Function1<Event, Object> getOnpause();

    @JsProperty( name = "onpause")
    void setOnpause( Function1<Event, Object> value );

    @JsProperty( name = "onplay")
    Function1<Event, Object> getOnplay();

    @JsProperty( name = "onplay")
    void setOnplay( Function1<Event, Object> value );

    @JsProperty( name = "onplaying")
    Function1<Event, Object> getOnplaying();

    @JsProperty( name = "onplaying")
    void setOnplaying( Function1<Event, Object> value );

    @JsProperty( name = "onprogress")
    Function1<ProgressEvent, Object> getOnprogress();

    @JsProperty( name = "onprogress")
    void setOnprogress( Function1<ProgressEvent, Object> value );

    @JsProperty( name = "onratechange")
    Function1<Event, Object> getOnratechange();

    @JsProperty( name = "onratechange")
    void setOnratechange( Function1<Event, Object> value );

    @JsProperty( name = "onreset")
    Function1<Event, Object> getOnreset();

    @JsProperty( name = "onreset")
    void setOnreset( Function1<Event, Object> value );

    @JsProperty( name = "onscroll")
    Function1<UIEvent, Object> getOnscroll();

    @JsProperty( name = "onscroll")
    void setOnscroll( Function1<UIEvent, Object> value );

    @JsProperty( name = "onseeked")
    Function1<Event, Object> getOnseeked();

    @JsProperty( name = "onseeked")
    void setOnseeked( Function1<Event, Object> value );

    @JsProperty( name = "onseeking")
    Function1<Event, Object> getOnseeking();

    @JsProperty( name = "onseeking")
    void setOnseeking( Function1<Event, Object> value );

    @JsProperty( name = "onselect")
    Function1<UIEvent, Object> getOnselect();

    @JsProperty( name = "onselect")
    void setOnselect( Function1<UIEvent, Object> value );

    @JsProperty( name = "onselectstart")
    Function1<Event, Object> getOnselectstart();

    @JsProperty( name = "onselectstart")
    void setOnselectstart( Function1<Event, Object> value );

    @JsProperty( name = "onstalled")
    Function1<Event, Object> getOnstalled();

    @JsProperty( name = "onstalled")
    void setOnstalled( Function1<Event, Object> value );

    @JsProperty( name = "onsubmit")
    Function1<Event, Object> getOnsubmit();

    @JsProperty( name = "onsubmit")
    void setOnsubmit( Function1<Event, Object> value );

    @JsProperty( name = "onsuspend")
    Function1<Event, Object> getOnsuspend();

    @JsProperty( name = "onsuspend")
    void setOnsuspend( Function1<Event, Object> value );

    @JsProperty( name = "ontimeupdate")
    Function1<Event, Object> getOntimeupdate();

    @JsProperty( name = "ontimeupdate")
    void setOntimeupdate( Function1<Event, Object> value );

    @JsProperty( name = "onvolumechange")
    Function1<Event, Object> getOnvolumechange();

    @JsProperty( name = "onvolumechange")
    void setOnvolumechange( Function1<Event, Object> value );

    @JsProperty( name = "onwaiting")
    Function1<Event, Object> getOnwaiting();

    @JsProperty( name = "onwaiting")
    void setOnwaiting( Function1<Event, Object> value );

    @JsProperty( name = "outerText")
    String getOuterText();

    @JsProperty( name = "outerText")
    void setOuterText( String value );

    @JsProperty( name = "spellcheck")
    Boolean getSpellcheck();

    @JsProperty( name = "spellcheck")
    void setSpellcheck( Boolean value );

    @JsProperty( name = "style")
    CSSStyleDeclaration getStyle();

    @JsProperty( name = "style")
    void setStyle( CSSStyleDeclaration value );

    @JsProperty( name = "tabIndex")
    Number getTabIndex();

    @JsProperty( name = "tabIndex")
    void setTabIndex( Number value );

    @JsProperty( name = "title")
    String getTitle();

    @JsProperty( name = "title")
    void setTitle( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(blur,289,,)
      * TE Signature : S(blur,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@404653
     */
    void blur();
    /** 
      * Std Signature : S(click,289,,)
      * TE Signature : S(click,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@404671
     */
    void click();
    /** 
      * Std Signature : S(dragDrop,27,,)
      * TE Signature : S(dragDrop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@404690
     */
    Boolean dragDrop();
    /** 
      * Std Signature : S(focus,289,,)
      * TE Signature : S(focus,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@404715
     */
    void focus();
    /** 
      * Std Signature : S(msGetInputContext,417,,)
      * TE Signature : S(msGetInputContext,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@404734
     */
    MSInputMethodContext msGetInputContext();
}
