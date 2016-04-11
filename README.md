# Angular 2 application writing with GWT 2.8-SNAPSHOT

It's time to try it ! Angular 2 has been wrapped around Typescript and Dart because those languages offer code generation (for component metadata).

GWT also can do code generation, with the standard Java JSR-269...

So this project is a try to integrate Angular 2 and GWT in a way that is pleasant for the developper.

## Demo

A demo is available [here](http://lteconsulting.fr/angular2-gwt/).

**Note**: That's really the beginning, more is going to come. But at this stage, this project proves the feasibility of such things.

## Instructions

Checkout this repository, then :

		# go to the web app resource directory
		cd angular2-gwt/angular2-gwt/src/main/webapp
		
		# fetches the angular libraries (~ 50 Mo)
		# note : you need npm for this to work !
		npm install

Now that the Angular files have been loaded, you just need to compile the project :

		cd ../../../..
		mvn clean install

Now, you can run the project either by dropping the `index.html` file into a browser, or by running the super dev mode :

		cd angular2-gwt
		mvn gwt:run

Go to your browser and it should work !

## Explanation

The main application is in the `Application` class and is bootstrapped in the Angular sense with this line of code :

		Browser.bootstrap( MyComponent_AngularComponent.get() );

Here, the `MyComponent` class, written by us, is used as an Angular component. The `MyComponent_AngularComponent` is a Java generated class embedding all the required metadatas for the Angular runtime.

And the component is implemented in the `MyComponent` class, which reads :

		@AngularComponent(
				selector = "my-app",
				template = "<div>"
						+ "Name of hero to add : {{name}}<br/>"
						+ "<input [(ngModel)]='name'><br/>"
						+ "<button (click)='onClick($event)'>Add</button>"
						+ "<ul><li *ngFor='#hero of heroes'>{{ hero }}</li></ul>"
						+ "</div>" )
		@JsType
		public class MyComponent
		{
			@JsProperty
			private String name;
		
			@JsProperty
			private JsArray<String> heroes;
		
			public MyComponent()
			{
				name = "Arnaud";
				heroes = JsArray.of( new String[] { "Windstorm", "Bombasto", "Magneta", "Tornado" } );
			}
		
			@JsMethod
			private void onClick()
			{
				heroes.push( name );
			}
		}

This is quiet straight-forward, and the class in the code contains comments so that you can understand everything that is going on...

## Roadmap

More documentation and more exploration of Angular. In particular the next step is to allow multiple controllers to work together...