# Angular 2 application writing with GWT 2.8-SNAPSHOT

It's time to try it ! Angular 2 has been wrapped around Typescript and Dart because those languages offer code generation (for component metadata).

GWT also can do code generation, with the standard Java JSR-269...

So this project is a try to integrate Angular 2 and GWT in a way that is pleasant for the developper.

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
		mvn gwt:run-codeserver

Go to your browser and it should work !

## Roadmap

More documentation and more exploration of Angular. In particular the next step is to allow multiple controllers to work together...