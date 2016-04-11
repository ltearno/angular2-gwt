package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.client.EntryPoint;

import fr.lteconsulting.angular2gwt.client.angular2.Browser;

public class Application implements EntryPoint
{
	private static native Object getAppComponentObject()
	/*-{
		var component = $wnd.ng.core
				.Component(
						{
							selector : 'my-app',
							template : '<div>'
									+ '<h1>My First Angular 2 App</h1>'
									+ 'Hello {{myName}}<br/>'
									+ '<input [(ngModel)]="myName"><br/>'
									+ '<button (click)="onClick($event)">Click me</button>'
									+ '<ul>' + '<li *ngFor="#hero of heroes">'
									+ '{{ hero }}' + '</li>' + '</ul>'
									+ '</div>'
						}).Class(
						{
							constructor : function() {
								console.log("ConsuturJude....");

								this.myName = "Arnaud";

								this.heroes = [ 'Windstorm', 'Bombasto',
										'Magneta', 'Tornado' ];

								this.onClick = function(e) {
									console.log("what a luck !");

									this.heroes.push(this.myName);
								};

								this.ngOnChanges = function(changes) {
									debugger;
									console.log("changes");
								};
								this.ngOnInit = function() {
									debugger;
									console.log("init component...");
								};
							},

							ngOnInit : function() {
								console.log("Ehhhhh Jude....");
							},

							ngAfterViewInit : function() {
								console.log("Ehhhhh Jude HH....");
							}
						});

		$wnd.appComponent = component;

		return component;
	}-*/;

	@Override
	public void onModuleLoad()
	{
		Object component = getAppComponentObject();
		Browser.bootstrap( component );
	}
}