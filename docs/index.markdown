---
layout: page
title: Angular 2 Boot
---

*Angular2Boot is in sync with Angular 2.0.0, see the [Angular release notes](https://github.com/angular/angular/blob/master/CHANGELOG.md) !*

*LATEST NEWS !* Angular2Boot [will be presented](https://oracle.rainfocus.com/scripts/catalog/oow16.jsp?event=javaone&search=angular&search.event=javaone) at **[JavaOne 2016](https://www.oracle.com/javaone/index.html)** this year ! We hope to meet your there and discuss with you !

**Angular2Boot** is an opiniated framework to build web applications in Java 8. It is built upon rock-solid foundations : [Angular 2](https://angular.io/), [GWT](http://www.gwtproject.org/) and [Spring Boot](http://projects.spring.io/spring-boot/). You can of course use it with any Java backend, like JavaEE with JAX-RS Web services or whatever else.

It provides a very effective way to build _Single Page Applications_. The development mode is iterative and quick (live code reload), with the strongly typed qualities of Java and the functionalities brought by modern IDEs. The produced code is easy to deploy (relying on one *jar* only), robust (runs on the JVM) and optimized (Angular 2 change detection and GWT optimized compilation).

Build a starting application in less than 5 minutes and enter into the details to get most of **Angular2Boot** !


*Here is a presentation video (in French) of how it works, at the Toulouse Angular User Group in June 2016.*

<iframe width="560" height="315" src="https://www.youtube.com/embed/fD0uViFYVRA" frameborder="0" allowfullscreen></iframe>

# Summary of this document

* TOC
{:toc}

# How to build an application from the official archetype ?

Use the archetype which builds a fully working Angular2 + SpringBoot application :

{% highlight bash %}
mvn archetype:generate \
  -DarchetypeGroupId=fr.lteconsulting \
  -DarchetypeArtifactId=angular2-gwt.archetype \
  -DarchetypeVersion=1.6
{% endhighlight %}

**Note about the version** : *you can use either the latest release version like in the example above, or the next snapshot version (`1.6-SNAPSHOT` in this case) and benefit from the latest improvements and bug fixes. Features only available in the snapshot version are marked in the documentation. You can expect a new release few days after new features are tested and validated.*

Enter the desired *groupId*, *artifactId*, *version* and *package* and your application will be created in a sub directory named after the choosen *artifactId*.

Enter into this directory and build your application :

{% highlight bash %}
mvn clean install
{% endhighlight %}

Everything should work fine. Now you can run the built application with this :

{% highlight bash %}
java -jar target/YOUR_ARTIFACT_ID.jar
{% endhighlight %}

This will launch the SpringBoot application with a minimal client side Angular 2 controller. When entering [http://localhost:8080](http://localhost:8080) in your browser, a page should load and show a "Your application is working !" message. This is the sign that everything has been bootstraped correctly and that you can begin to work. There is also an `input` box, if you change its content the previous title will change too. That's shows that the two-way Angular data binding is working in your application !

# Development mode

During development, building the entire application is too time-consuming. In order to save your time, you can stop the java process we just launched and launch the SpringBoot development mode instead :

{% highlight bash %}
mvn spring-boot:run
{% endhighlight %}

This will allow to have hot swapping of classes on the server side (to a certain extent, see [documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-hotswapping.html)).

You may also want to hot reload client classes when you change them. In this case you need to start the GWT Super Dev Mode. But that has to be done in another terminal because we don't want to stop the Spring Boot server !

{% highlight bash %}
mvn gwt:run-codeserver
{% endhighlight %}

You can open the application project in your IDE (see the chapter on configuration problems that can happen), work on the code and refresh in the browser to get live updates.

# And now, what's next ?

Now that you have a working boostrapped application, you can either continue reading to get more details about what is inside the application you just created. Or you can jump into the Tour of Heroes [tutorial](tutorial/) to learn the basic concepts of Angular 2 and about creating an Angular2Boot application.

You can also read the [cookbook](cookbook/) to learn advanced and deepened techniques.

Typically you will want to :

- add new Angular components to your application. Use the [Angular](https://angular.io/docs/ts/latest/guide/) documentation and the Angular2Boot reference [below](#howto).
- add new REST services on the backend with [SpringBoot](https://spring.io/guides/gs/rest-service/),

# Anatomy of the generated project

The project you have just built contains already several components. If you inspect the `pom.xml` file, you will see that the project inherits from `spring-boot-starter-parent` which is a way to bootstrap a SpringBoot application. The main dependencies your project has are :

- **spring-boot-starter-web**: just enough Spring Boot to serve static files and REST services.
- **gwt-user** and **gwt-dev**: GWT runtime and compiler, needed to compile the front side of the application.
- **angular2-gwt**: Angular 2 bindings and tools for GWT.

Regarding the project build, only two plugins are used: **gwt-maven-plugin** and **spring-boot-maven-plugin**.

Static resources are served from the `src/main/resources/static` directory. You can add more files there and they will be then accessible from the browser.

## index.html

Appart from all the `.js` files which are the required runtime scripts, the most important file in the `src/main/resources/static` directory is `index.html`. The browser loads this page to run your application and it contains everything needed to bootstrap it.

Let's inspect some parts of it. You will find a `<base href='/'>` tag which is needed by Angular to make the routing component work in the default mode. Note that you can remove it if you don't make use of the Router (we will see Routing details later) or if you use the router with the hash strategy on.

Then you will see a bunch of several `<link>` and `<script>` tag to load bootstrap.css (this can be removed) and javascript files. Those provide the Angular runtime which is called by your Java/GWT application.

As we talk about it, the javascript file generated from your Java code is imported by this line :

{% highlight html %}
<script src="angular2gwt/angular2gwt.nocache.js"></script>
{% endhighlight %}

This script bootstraps GWT's core and call your application entry point which is the `onModuleLoad` method of the `Application` class (which in turn bootstraps Angular with your Java component classes).

The last remarkable thing in this file is this line :

{% highlight html %}
<my-app class="container">Application is loading...</my-app>
{% endhighlight %}

This tag is rendered as a `<div>` until all scripts are loaded. During this period, the *"Application is loading"* message is displayed. Once the application is initialized, the Angular engine runs and replaces the `<my-app>` content by the one of the `ApplicationComponent`.

We will see that just after the `Application` class.

## Application.java

This class is the entrypoint of your application, meaning that its `onModuleLoad` method will be the first to be called and it will be called just after the GWT runtime has been initialized.

Angular2Boot entrypoint classes are very simple, the only thing you find is the Angular bootstrapping call :

{% highlight java %}
PlatformBrowserDynamic
  .platformBrowserDynamic()
  .bootstrapModule( ApplicationModule_AngularModule.getNgModulePrototype() );
{% endhighlight %}

The `bootstrapModule` method corresponds to the `bootstrapModule` function of Angular 2's PlatformBrowserDynamic module. In fact it is bound to Java through GWT's JsInterop, so behind the scene it is the same function that is called. The parameter of the `bootstrapModule` is the result of a call to the `ApplicationModule_AngularModule.getNgModulePrototype()` method. This method returns an Angular2-compatible constructor of the `ApplicationModule` class. The `ApplicationModule_AngularModule` class is automatically generated for you by Angular2Boot, as you will see later on.

So here we just say to Angular to start with the `ApplicationModule` as the root module of our application.

Just one word on the commented line of code that shows :

{% highlight java %}
/** You can uncomment that line to switch Angular to Production mode */
// Core.enableProdMode();
{% endhighlight %}

By default, until this line is uncommented Angular will work in debug mode : it will produce helper messages in the console and also add more runtime data associated with the components of the application (helping tools like `Augury` to work). If you deploy your application, don't forget to uncomment this line !

## ApplicationModule.java

[_NgModules_](https://angular.io/docs/ts/latest/guide/ngmodule.html) first appeared in the `rc5` version of Angular2. They allow you to split your application into big functional blocks and reuse them in other applications. They allow the Angular tool to perform more optimizations for you : the modules are statically analyzed by the _Angular Ahead of Time Compiler (ngc)_ and some pruning can happen.

Naturally, your java application too should declare a module. This is done in the `ApplicationModule` class. It reads :

{% highlight java %}
@NgModule(
	imports = {
		BrowserModule.class,
		FormsModule.class },
	declarations = ApplicationComponent.class,
	bootstrap = ApplicationComponent.class )
@JsType
public class ApplicationModule
{
}
{% endhighlight %}

It defines the root module of our application. It imports the Angular `BrowserModule` and `FormsModule`. The first one brings everything that is needed to make Angular 2 work in the browser (as you may know, Angular can run in other environments than browsers) and the second one (_FromsModule_) brings useful usual form directives like `ngModel`. The module then declares the `ApplicationComponent` component so that it is avalaible to other modules if needed. The `bootstrap` parameter says that when the module is bootstrapped, it starts with the `ApplicationComponent` component, which we will examine right now.

## ApplicationComponent.java

Here is the source code of the main component application :

{% highlight java %}
@Component(
	selector = "my-app",
	template = "<h1>{ {title}}</h1>" +
  	"You can edit the title by changing the text in this box :<br/>"+
  	"<input [(ngModel)]='title'/>" )
@JsType
public class ApplicationComponent
{
	@JsProperty
	private String title = "Your application is working !";
}
{% endhighlight %}

It doesn't do much but it already uses some of the main concepts of Angular : *Components*. Here are the very necessary **two** steps to create an Angular component out of a Java class :

- add the `@Component` annotation. This generates metadata about your component for Angular. Refer to the Angular documentation about the meaning of this annotation fields. Putting this annotation triggers the generation of the `ApplicationComponent_AngularComponent` java class.
- add the `@JsType` annotation. This tells the GWT compiler to make this class accessible to the Javascript world. This is required in order that Angular can access your Java classes.

Here with `selector = "my-app"` we set this class to handle the `<my-app>` html tag. As you will have guessed, the content generated with this component will replace the content inside the `<my-app>` tag in the `index.html` page.

The content generated by the component is defined in the `template` field in the annotation (`template = "<h1>{ { title } }</h1> ..."`). It uses the double-brace syntax to refer to the `title` attribute's value.

The `title` field is declared like this:

{% highlight java %}
@JsProperty
private String title = "Your application is working !";
{% endhighlight %}

The `@JsProperty` tells the GWT compiler to make the field accesible to the javascript world and to Angular, even thou it is declared `private`. If it was declared `public` you would not need to put this annotation (the `@JsType` annotation on the class itself makes all the public fields and methods accesible to javascript).

If this field's value change, Angular will know about and the DOM will be updated accordingly (given the change is made inside the angular _zone_, meaning inside an event handler and so on).

As you can note, the component's template includes another part : `<input [(ngModel)]='title'/>`. This creates an `input` tag whose value is data-bound to the `title` attribute of the component object. The `ngModel` is an angular directive that comes from the `FormsModule` that is imported in our `ApplicationModule`. We will dig a bit deeper into this subject later on.

That's all for the front side of the application for the moment. Now let's inspect a backend class providing a very basic REST service.

## ApplicationController.java

This class contains two parts : one is the REST controller and the other is the main method, called by Spring Boot :

{% highlight java %}
@RestController
@EnableAutoConfiguration
public class ApplicationController
{
	@RequestMapping( "/test" )
	String test()
	{
		return "This is a test";
	}

	public static void main( String[] args ) throws Exception
	{
		SpringApplication.run( ApplicationController.class, args );
	}
}
{% endhighlight %}

# Tour of Heroes tutorial

This [tutorial](tutorial/) walks you through the basics of creating an Angular2Boot application. It is strongly advised to read so that you gain the basic knowledge.

The tutorial is based on the official Angular 2 typescript version of the [tutorial](https://angular.io/docs/ts/latest/tutorial/). As you will see, the Java and Typescript versions are very similar. It means that you will be able to learn new things on Angular2Boot by reading the Typescript documentation !

# Using with another backend technology

While *Spring Boot* provides a very good platform to host your angular application, you may want to use Angular2Boot with another backend like *JBoss*, *Tomcat*, *Spark* or *Jetty*.

This is completely possible and documentation and archetypes will be provided soon.

It is even possible to use Angular2Boot only for the front-end and get on with a non-Java technology on the server...

# Motivation

Angular 2 has been wrapped around Typescript and Dart because they allow elegant metadata specification through annotations. Java also has annotations and is a language of choice when it comes to build robust applications.

Angular 2 is a very good framework to build industry grade web applications. It is based on several years of experience with Angular 1 and is now mature and answers most of the developper needs.

GWT provides (optimized) translation from Java to Javascript and bindings to Angular 2. With the latest GWT version (2.8), the new *JsInterop* specification allows easy interoperability with Javascript. And the SuperDevMode has been improved so that recompile time is greatly reduced, providing a development experience similar to what a Javascript developper can expect.

Add the simplicity of Spring Boot for server side application development and you get **Angular2Boot** !

# IDE Configuration

## Eclipse

You need to install `m2e-apt` component. Otherwise, everything should work out of the box by importing the maven project.

## IntelliJ

*Documentation not yet written*

## Version matrix

Angular version     | `angular2-gwt.archetype` versions | `angular2-gwt` versions
--------------------|-----------------------------------|--------------------------
`2.0.0`             | `1.6`, `1.7-SNAPSHOT`             | `1.6`, `1.7-SNAPSHOT`
`2.0.0 rc 6`        | `1.4`, `1.5-SNAPSHOT`             | `1.3`, `1.4-SNAPSHOT`
`2.0.0 rc 5`        | `1.3`, `1.4-SNAPSHOT`             | `1.2`, `1.3-SNAPSHOT`
`2.0.0 beta 17`     | `1.1`, `1.2-SNAPSHOT`             | `1.0`, `1.1-SNAPSHOT`
`2.0.0 beta 16`     | `1.0`                             | `1.0`

## Troubleshooting

Sometimes, after changing a lot of code, the GWT SuperDevMode gets confused and does not manage to update anymore. This is a limitation caused by GWT. One way to circumvent this is to clear the project and build it again, but it's time consumming. Another way of doing so it to quit the GWT SuperDevMode and to run the `rm -rf target/gwt-unitCache/` command. This will clear GWT compilation cache. You can then restart the GWT SuperDevMode (`mvn gwt:run-codeserver`) and things should work fine again.

# Contact

If you have any question or remark, feel free to use the comment zone at the bottom of the page or to email us directly to <contact@lteconsulting.fr>.

License: [MIT license](licensing)

# Useful links

- [Angular 2 Official website](https://angular.io/)
- [Spring Boot Official website](http://projects.spring.io/spring-boot/)
- [Learn Angular 2](http://learnangular2.com/)
- [Sample Angular2Boot application](https://github.com/ltearno/angular2-gwt)