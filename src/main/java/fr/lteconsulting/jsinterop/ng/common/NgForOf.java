package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Iterable;
import fr.lteconsulting.jsinterop.browser.NgIterable_UnionOfArrayOfTAndIterableOfT;
import fr.lteconsulting.jsinterop.ng.core.DoCheck;
import fr.lteconsulting.jsinterop.ng.core.IterableDiffers;
import fr.lteconsulting.jsinterop.ng.core.OnChanges;
import fr.lteconsulting.jsinterop.ng.core.SimpleChanges;
import fr.lteconsulting.jsinterop.ng.core.TemplateRef;
import fr.lteconsulting.jsinterop.ng.core.ViewContainerRef;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_for_of".NgForOf
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_for_of.d.ts:689
  * 1 constructors
  * The `NgForOf` directive instantiates a template once per item from an iterable. The context
  * for each instantiated template inherits from the outer context with the given loop variable
  * set to the current item from the iterable.
  * 
  * ### Local Variables
  * 
  * `NgForOf` provides several exported values that can be aliased to local variables:
  * 
  * - `$implicit: T`: The value of the individual items in the iterable (`ngForOf`).
  * - `ngForOf: NgIterable<T>`: The value of the iterable expression. Useful when the expression is
  * more complex then a property access, for example when using the async pipe (`userStreams |
  * async`).
  * - `index: number`: The index of the current item in the iterable.
  * - `first: boolean`: True when the item is the first item in the iterable.
  * - `last: boolean`: True when the item is the last item in the iterable.
  * - `even: boolean`: True when the item has an even index in the iterable.
  * - `odd: boolean`: True when the item has an odd index in the iterable.
  * 
  * ```
  * <li *ngFor="let user of userObservable | async as users; index as i; first as isFirst">
  *     {{i}}/{{users.length}}. {{user}} <span *ngIf="isFirst">default</span>
  * </li>
  * ```
  * 
  * ### Change Propagation
  * 
  * When the contents of the iterator changes, `NgForOf` makes the corresponding changes to the DOM:
  * 
  * * When an item is added, a new instance of the template is added to the DOM.
  * * When an item is removed, its template instance is removed from the DOM.
  * * When items are reordered, their respective templates are reordered in the DOM.
  * * Otherwise, the DOM element for that item will remain the same.
  * 
  * Angular uses object identity to track insertions and deletions within the iterator and reproduce
  * those changes in the DOM. This has important implications for animations and any stateful
  * controls (such as `<input>` elements which accept user input) that are present. Inserted rows can
  * be animated in, deleted rows can be animated out, and unchanged rows retain any unsaved state
  * such as user input.
  * 
  * It is possible for the identities of elements in the iterator to change while the data does not.
  * This can happen, for example, if the iterator produced from an RPC to the server, and that
  * RPC is re-run. Even if the data hasn't changed, the second response will produce objects with
  * different identities, and Angular will tear down the entire DOM and rebuild it (as if all old
  * elements were deleted and all new elements inserted). This is an expensive operation and should
  * be avoided if possible.
  * 
  * To customize the default tracking algorithm, `NgForOf` supports `trackBy` option.
  * `trackBy` takes a function which has two arguments: `index` and `item`.
  * If `trackBy` is given, Angular tracks changes by the return value of the function.
  * 
  * ### Syntax
  * 
  * - `<li *ngFor="let item of items; index as i; trackBy: trackByFn">...</li>`
  * - `<li template="ngFor let item of items; index as i; trackBy: trackByFn">...</li>`
  * 
  * With `<ng-template>` element:
  * 
  * ```
  * <ng-template ngFor let-item [ngForOf]="items" let-i="index" [ngForTrackBy]="trackByFn">
  *    <li>...</li>
  * </ng-template>
  * ```
  * 
  * ### Example
  * 
  * See a [live demo](http://plnkr.co/edit/KVuXxDp0qinGDyo307QW?p=preview) for a more detailed
  * example.
 */
@JsType(isNative=true, namespace="ng.common", name="NgForOf")
public class NgForOf<T> extends DoCheck implements OnChanges
{

    /*
        Constructors
    */
    public NgForOf(ViewContainerRef _viewContainer, TemplateRef<NgForOfContext<T>> _template, IterableDiffers _differs){
    }

    /*
        Properties
    */

    public Object _differ;

    @JsProperty( name = "_differ")
    public native Object get_differ();

    @JsProperty( name = "_differ")
    public native void set_differ( Object value );

    public Object _differs;

    @JsProperty( name = "_differs")
    public native Object get_differs();

    @JsProperty( name = "_differs")
    public native void set_differs( Object value );

    public Object _template;

    @JsProperty( name = "_template")
    public native Object get_template();

    @JsProperty( name = "_template")
    public native void set_template( Object value );

    public Object _trackByFn;

    @JsProperty( name = "_trackByFn")
    public native Object get_trackByFn();

    @JsProperty( name = "_trackByFn")
    public native void set_trackByFn( Object value );

    public Object _viewContainer;

    @JsProperty( name = "_viewContainer")
    public native Object get_viewContainer();

    @JsProperty( name = "_viewContainer")
    public native void set_viewContainer( Object value );

    public NgIterable_UnionOfArrayOfTAndIterableOfT<T> ngForOf;

    @JsProperty( name = "ngForOf")
    public native NgIterable_UnionOfArrayOfTAndIterableOfT<T> getNgForOf();

    @JsProperty( name = "ngForOf")
    public native void setNgForOf( NgIterable_UnionOfArrayOfTAndIterableOfT<T> value );

    @JsOverlay
    public final void setNgForOf( Array<T> value ) { setNgForOf(NgIterable_UnionOfArrayOfTAndIterableOfT.ofArrayOfT( value )); }

    @JsOverlay
    public final void setNgForOf( Iterable<T> value ) { setNgForOf(NgIterable_UnionOfArrayOfTAndIterableOfT.ofIterableOfT( value )); }

    public TemplateRef<NgForOfContext<T>> ngForTemplate;

    @JsProperty( name = "ngForTemplate")
    public native TemplateRef<NgForOfContext<T>> getNgForTemplate();

    @JsProperty( name = "ngForTemplate")
    public native void setNgForTemplate( TemplateRef<NgForOfContext<T>> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_applyChanges,3,,P(d3))
      * TE Signature : S(_applyChanges,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_for_of.d.ts@4533
     */
    public native Object _applyChanges(Object changes);
    /** 
      * Std Signature : S(_perViewChange,3,,P(d3),P(d3))
      * TE Signature : S(_perViewChange,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_for_of.d.ts@4569
     */
    public native Object _perViewChange(Object view, Object record);
    /** 
      * Std Signature : S(ngForTrackBy,3,,P(d2),P(dT-))
      * TE Signature : S(ngForTrackBy,P(d2),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@4182
     */
    public native Object ngForTrackBy(Number index, T item);
    /** 
      * Std Signature : S(ngOnChanges,429,,P(d346))
      * TE Signature : S(ngOnChanges,P(d346))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnChanges(SimpleChanges changes);
}
