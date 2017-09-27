package fr.lteconsulting.angular2gwt.client.interop.angular.rxjs;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.rxjs", name = "Observable" )
public class Observable<T>
{
	public native void forEach( ForEachCallback<T> callback );

	@JsFunction
	@FunctionalInterface
	public interface ForEachCallback<T>
	{
		void execute( T value );
	}

	public native Subscription subscribe( Observer<T> observer );

	public native <U> Observable<U> map( MapFunction<T, U> mapFunction );

	public native Promise<T> toPromise();

	public native Observable<T> debounceTime( int time );

	public native Observable<T> distinctUntilChanged();

	public native Observable<T> distinctUntilChanged( KeySelector<T, Object> keySelector );

	public native <K> Observable<T> distinctUntilChanged( KeySelector<T, K> keySelector, KeyComparator<T, K> keyComparator );

	@JsMethod( namespace = "ng.rxjs.Observable", name = "of" )
	public static native <T> Observable<JsArray<T>> of( JsArray<T> elements );

	@JsFunction
	@FunctionalInterface
	public interface KeySelector<T, O>
	{
		O selectKey( T item );
	}

	@JsFunction
	@FunctionalInterface
	public interface KeyComparator<T, O>
	{
		boolean selectKey( O a, O b );
	}

	public native <R> Observable<R> switchMap( Projection<T, R> projection );

	public native <I, R> Observable<R> switchMap( Projection<T, I> projection, ResultSelector<T, I, R> resultSelector );

	@JsFunction
	@FunctionalInterface
	public interface Projection<T, R>
	{
		Observable<R> project( T item, int index );
	}

	@JsFunction
	@FunctionalInterface
	public interface ResultSelector<T, I, R>
	{
		R selectResult( T outerValue, I innerValue, int outerIndex, int innerIndex );
	}

	@JsMethod( name = "catch" )
	public native Observable<T> onError( ErrorCatcher<T> errorCatcher );

	@JsFunction
	@FunctionalInterface
	public interface ErrorCatcher<T>
	{
		Observable<T> catchError( Object error );
	}
}