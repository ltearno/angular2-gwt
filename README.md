# Angular 2 application writing with GWT 2.8-SNAPSHOT

It's time to try it ! Angular 2 has been wrapped around Typescript and Dart because those languages offer code generation (for component metadata).

GWT also can do code generation, with the standard Java JSR-269...

So this project is a try to integrate Angular 2 and GWT in a way that is pleasant for the developper.

**This project will move a lot during the next few days, so don't expect complete consistency between the code and the README... You should prefer going to see the code !!!**

Thanks !

## Demo

A demo is available [here](http://lteconsulting.fr/angular2-gwt/).

**Note**: That's really the beginning, more is going to come. But at this stage, this project proves the feasibility of such things.

## Instructions


### From the official archetype

Use the archetype which builds a fully working Angular2 + SpringBoot application :

		mvn archetype:generate -DarchetypeGroupId=fr.lteconsulting -DarchetypeArtifactId=angular2-gwt.archetype -DarchetypeVersion=1.0

Enter the desired *groupId*, *artifactId*, *version* and *package* and your application will be created in a sub directory named after the choosen *artifactId*.

Enter into this directory and build your application :

		mvn clean install

Everything should work fine. Now you can run the built application with this :

		java -jar target/artifactId.jar

This will launch the SpringBoot application with a minimal client side Angular 2 controller. When entering [http://localhost:8080](http://localhost:8080) in your browser, a page should load and write "Your application is working !". It is the sign that everything is bootstraped correctly and that you can begin to work.

During development, building the entire application is too long. So you can stop the java process we just launched and launch the SpringBoot development mode instead :

		mvn spring-boot:run

This will allow to have hot swapping of classes on the server side (to a certain extent, see [documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-hotswapping.html)). If you also want to have hot reload of client classes, you need to start the GWT Super Dev Mode. But that has to be done in another terminal because we don't want to stop the server !

		mvn gwt:run-codeserver

You can open the application project in your IDE (see configuration problems that can happen), work on the code and refresh in the browser to get live updates.

## BBB

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

More documentation and more exploration of Angular. Would be good to cover all the features.
