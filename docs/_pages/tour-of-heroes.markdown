---
layout: page
title: Tour of Heroes Tutorial
permalink: /tutorial/
---
In this how-to, we will go through functionalities provided by Angular2Boot by building a simple application step-by-step.

This how-to follows most of the official Angular 2 tutorial, so it is strongly advised to [read it](https://angular.io/docs/ts/latest/tutorial/) also. The official tutorial introduction says :

> Our grand plan is to build an app to help a staffing agency manage its stable of heroes. Even heroes need to find work.
> [...] What we do build will have many of the features we expect to find in a full-blown, data-driven application: acquiring and displaying a list of heroes, editing a selected hero's detail, and navigating among different views of heroic data.

> The Tour of Heroes covers the core fundamentals of Angular. We’ll use built-in directives to show/hide elements and display lists of hero data. We’ll create a component to display hero details and another to show an array of heroes. We'll use one-way data binding for read-only data. We'll add editable fields to update a model with two-way data binding. We'll bind component methods to user events like key strokes and clicks. We’ll learn to select a hero from a master list and edit that hero in the details view. We'll format data with pipes. We'll create a shared service to assemble our heroes. And we'll use routing to navigate among different views and their components.

> We’ll learn enough core Angular to get started and gain confidence that Angular can do whatever we need it to do. We'll be covering a lot of ground at an introductory level but we’ll find plenty of links to chapters with greater depth.

If you have a doubt about the source at any moment you can look at this [project](https://github.com/ltearno/hexa.tools/tree/master/angular2-gwt) sources.

# Summary of this document

* TOC
{:toc}

# Let's get started

If you have not created a project yet, do it with the following command :

{% highlight bash %}
mvn archetype:generate \
  -DarchetypeGroupId=fr.lteconsulting \
  -DarchetypeArtifactId=angular2-gwt.archetype \
  -DarchetypeVersion=1.6
{% endhighlight %}

_Here is also the same command in only one line, for you to copy-paste easily:_

{% highlight bash %}
mvn archetype:generate -DarchetypeGroupId=fr.lteconsulting -DarchetypeArtifactId=angular2-gwt.archetype -DarchetypeVersion=1.6
{% endhighlight %}

Go into the project folder and build it to check that everything is ok :

{% highlight bash %}
mvn clean install
{% endhighlight %}

You can now import the project in your IDE. (Note that if you use Eclipse you need to install the `m2e-apt` extension and go to `Windows`>`Preferences`>`Maven`>`Annotation Processing` and select to automatically configure JDT APT. You will have to restart Eclipse after the installation).

Meanwhile, we are going to launch the development mode with hot reload on both server and client sides. In two terminals, launch those two commands :

{% highlight bash %}
# In one terminal :
mvn spring-boot:run

# And once the first is ready,
# in another terminal :
mvn gwt:run-codeserver
{% endhighlight %}

Now go to the url `http://localhost:8080` and you should see your application running.

# The Hero Editor

## Show our Hero

First let's modify the `ApplicationComponent` class so that it looks like this :

{% highlight java %}
{% raw %}
@Component(
  selector = "my-app",
  template = "<h1>{{title}}</h1><h2>{{hero}} details!</h2>" )
@JsType
public class ApplicationComponent
{
  public String title = "Tour of Heroes";
  public String hero = "Windstorm";
}
{% endraw %}
{% endhighlight %}

Refresh your browser, and it should display the `title` and `hero` properties. This is the _interpolation_ form of one-way data binding.



## Create the `Hero` data object

**Note:** all the classes used in the front side of the application must reside under the `client` package.

Since we will use it everywhere in our application, let's create the DTO right now. Let's create a `Hero` class looking like this:

{% highlight java %}
@JsType
public class Hero
{
  public int id;
  public String name;

  public Hero( int id, String name )
  {
    this.id = id;
    this.name = name;
  }
}
{% endhighlight %}

This class has nothing special appart from the annotations. It is annotated with `@JsType` which means that this Java class is accessible to the javascript world. This makes Angular able to watch over our data objects and update the views when needed. The fields `title` and `name` are automatically exposed to Javascript because they are `public`. If you choose to make them `private`, you will need to annotate them with the `@JsProperty` annotation so that they keep being accessible from the javascript world too.

Now that we have a `Hero` class, let’s refactor our component’s hero attribute to be of type `Hero`. Then initialize it with an `id` of `1` and the `name`, "Windstorm".

{% highlight java %}
public Hero hero = new Hero( 1, "Windstorm" );
{% endhighlight %}

Because we changed the hero from a string to an object, we update the binding in the template to refer to the hero’s `name` property. Update the `template`field of the `@Component` annotation in the `ApplicationComponent` :

{% highlight java %}
template = "<h1>{{title}}</h1><h2>{{hero.name}} details!</h2>"
{% endhighlight %}

The browser refreshes and continues to display our hero’s name.

## Adding more HTML

Displaying a name is good, but we want to see all of our hero’s properties. We’ll add a `<div>` for our hero’s `id` property and another `<div>` for our hero’s `name`. Our template now looks like that :

{% highlight java %}
{% raw %}
template = "<h1>{{title}}</h1>"
  + "<h2>{{hero.name}} details!</h2>"
  + "<div><label>id: </label>{{hero.id}}</div>"
  + "<div><label>name: </label>{{hero.name}}</div>"
{% endraw %}
{% endhighlight %}

## Editing Our Hero

We want to be able to edit the hero name in a textbox.

### Two-way binding

We intend to display the name of the hero in an `<input>`, change it, and see those changes wherever we bind to the hero’s name. In short, we want two-way data binding.

Before we can use two-way data binding for **form inputs**, we need to import the `FormsModule` package in our Angular module. Hopefully, since it is so common to use this module, the Angular2Boot archetype already imported it for you (int the `ApplicationModule` class) !

Now update the template and replace the `{{ "{{ hero.name " }}}}` text by `<input [(ngModel)]='hero.name' placeholder='name'>`. The class now looks lie this :

{% highlight java %}
{% raw %}
@Component(
		selector = "my-app",
		template = "<h1>{{title}}</h1>"
				+ "<h2>{{hero.name}} details!</h2>"
				+ "<div><label>id: </label>{{hero.id}}</div>"
				+ "<div><label>name: </label><input [(ngModel)]='hero.name' placeholder='name'></div>" )
@JsType
public class ApplicationComponent
{
	public String title = "Tour of Heroes";
	public Hero hero = new Hero( 1, "Windstorm" );
}
{% endraw %}
{% endhighlight %}

Refresh the browser. We see our hero again. We can edit the hero’s name and see the changes reflected immediately in the `<h2>`.


## The Road We’ve Travelled

Let’s take stock of what we’ve built.

Our Tour of Heroes uses the double curly braces of interpolation (a kind of one-way data binding) to display the application title and properties of a `Hero` object.
We can both display and change the hero’s name after adding a two-way data binding to the `<input>` element using the built-in `ngModel` directive.
The `ngModel` directive also propagates changes to every other binding of the `hero.name`.


# Master/Detail

## Displaying our Heroes

### Creating heroes

Let’s create a Javascript array of ten heroes in the `ApplicationComponent` class.

{% highlight java %}
{% raw %}
private static final JsArray<Hero> HEROES = JsArray.of(
			new Hero( 11, "Mr. Nice" ),
			new Hero( 12, "Narco" ),
			new Hero( 13, "Bombasto" ),
			new Hero( 14, "Celeritas" ),
			new Hero( 15, "Magneta" ),
			new Hero( 16, "RubberMan" ),
			new Hero( 17, "Dynama" ),
			new Hero( 18, "Dr IQ" ),
			new Hero( 19, "Magma" ),
			new Hero( 20, "Tornado" ) );
{% endraw %}
{% endhighlight %}

The `HEROES` array is of type `JsArray<Hero>`. The `JsArray<T>` type is a wrapper type to the native Javascript array, which is different from the usual `ArrayList<T>` in Java. Because Angular will need to access to our data and does not understand the `ArrayList` type, we need to use the `JsArray` type.

We aspire to fetch this list of heroes from a web service, but let’s take small steps first and display mock heroes.

### Exposing heroes

Let’s create a public property in `ApplicationComponent` that exposes the heroes for binding.

{% highlight java %}
public JsArray<Hero> heroes = HEROES;
{% endhighlight %}

### Displaying heroes in a template

Our component has `heroes`. Let’s create an unordered list in our template to display them. We’ll insert the following chunk of HTML below the title and above the hero details.

{% highlight java %}
+ "<h2>My Heroes</h2>"
+ "<ul class='heroes'>"
+ "<li>"
+ "<!-- each hero goes here -->"
+ "</li>"
+ "</ul>"
{% endhighlight %}

Now we have a template that we can fill with our heroes.

### Listing heroes with ngFor

We want to bind the array of `heroes` in our component to our template, iterate over them, and display them individually. We’ll need some help from Angular to do this. Let’s do this step by step.

First modify the `<li>` tag by adding the built-in directive `*ngFor`.

{% highlight java %}
+ "<li *ngFor='let hero of heroes'>"
{% endhighlight %}

Now we insert some content between the `<li>` tags that uses the hero template variable to display the hero’s properties.

{% highlight java %}
{% raw %}
+ "<li *ngFor='let hero of heroes'>"
+ "<span class='badge'>{{hero.id}}</span> {{hero.name}}"
+ "</li>"
+ "</ul>"
{% endraw %}
{% endhighlight %}

When the browser refreshes, we see a list of heroes!


### Styling our heroes

Our list of heroes looks pretty bland. We want to make it visually obvious to a user which hero we are hovering over and which hero is selected.

Let’s add some styles to our component.

First, create a file named `application.component.css` in the `src/main/resources/static` folder of your project. Add this content :

{% highlight css %}
.selected {
	background-color: #CFD8DC !important;
	color: white;
}

.heroes {
	margin: 0 0 2em 0;
	list-style-type: none;
	padding: 0;
	width: 15em;
}

.heroes li {
	cursor: pointer;
	position: relative;
	left: 0;
	background-color: #EEE;
	margin: .5em;
	padding: .3em 0;
	height: 1.6em;
	border-radius: 4px;
}

.heroes li.selected:hover {
	background-color: #BBD8DC !important;
	color: white;
}

.heroes li:hover {
	color: #607D8B;
	background-color: #DDD;
	left: .1em;
}

.heroes .text {
	position: relative;
	top: -3px;
}

.heroes .badge {
	display: inline-block;
	font-size: small;
	color: white;
	padding: 0.8em 0.7em 0 0.7em;
	background-color: #607D8B;
	line-height: 1em;
	position: relative;
	left: -1px;
	top: -4px;
	height: 1.8em;
	margin-right: .8em;
	border-radius: 4px 0 0 4px;
}
{% endhighlight %}

Now we refer to this file in the `ApplicationComponent` by setting the `styleUrls` :

{% highlight java %}
styleUrls = "application.component.css"
{% endhighlight %}

When we assign styles to a component they are scoped to that specific component. Our styles will only apply to our `ApplicationComponent` and won't "leak" to the outer HTML.

The complete `ApplicationComponent` file should now look like this :

{% highlight java %}
{% raw %}
@Component(
		selector = "my-app",
		template = "<h1>{{title}}</h1>"
				+ "<h2>My Heroes</h2>"
				+ "<ul class='heroes'>"
				+ "<li *ngFor='let hero of heroes'>"
				+ "<span class='badge'>{{hero.id}}</span> {{hero.name}}"
				+ "</li>"
				+ "</ul>"
				+ "<h2>{{hero.name}} details!</h2>"
				+ "<div><label>id: </label>{{hero.id}}</div>"
				+ "<div><label>name: </label><input [(ngModel)]='hero.name' placeholder='name'></div>",
		styleUrls = "application.component.css" )
@JsType
public class ApplicationComponent
{
	private static final JsArray<Hero> HEROES = JsArray.of(
			new Hero( 11, "Mr. Nice" ),
			new Hero( 12, "Narco" ),
			new Hero( 13, "Bombasto" ),
			new Hero( 14, "Celeritas" ),
			new Hero( 15, "Magneta" ),
			new Hero( 16, "RubberMan" ),
			new Hero( 17, "Dynama" ),
			new Hero( 18, "Dr IQ" ),
			new Hero( 19, "Magma" ),
			new Hero( 20, "Tornado" ) );

	public String title = "Tour of Heroes";
	public Hero hero = new Hero( 1, "Windstorm" );
	public JsArray<Hero> heroes = HEROES;
}
{% endraw %}
{% endhighlight %}


## Selecting a Hero

We have a list of heroes and we have a single hero displayed in our app. The list and the single hero are not connected in any way. We want the user to select a hero from our list, and have the selected hero appear in the details view. This UI pattern is widely known as "master-detail". In our case, the master is the heroes list and the detail is the selected hero.

Let’s connect the master to the detail through a `selectedHero` component property bound to a click event.

### Click event

We modify the `<li>` by inserting an Angular event binding to its click event.

{% highlight java %}
{% raw %}
+ "<li *ngFor='let hero of heroes' (click)='onSelect(hero)'>"
{% endraw %}
{% endhighlight %}

Focus on the event binding

{% highlight html %}
{% raw %}
(click)='onSelect(hero)'
{% endraw %}
{% endhighlight %}

The parenthesis identify the `<li>` element’s `click` event as the target. The expression to the right of the equal sign calls the `ApplicationComponent` method, `onSelect()`, passing the template input variable `hero` as an argument. That’s the same `hero` variable we defined previously in the `ngFor`.

### Add the click handler

Our event binding refers to an `onSelect` method that doesn’t exist yet. We’ll add that method to our component now.

What should that method do? It should set the component’s selected hero to the hero that the user clicked.

Our component doesn’t have a “selected hero” yet either. We’ll start there.

### Expose the selected hero

We no longer need the `hero` property of the `ApplicationComponent`. **Replace** it with this simple `selectedHero` property:

{% highlight java %}
public Hero selectedHero = null;
{% endhighlight %}

We’ve decided that none of the heroes should be selected before the user picks a hero so we initialize the `selectedHero` to `null`.

Now **add an `onSelect` method** that sets the selectedHero property to the hero the user clicked.

{% highlight java %}
public void onSelect( Hero hero )
{
    selectedHero = hero;
}
{% endhighlight %}

We will be showing the selected hero's details in our template. At the moment, it is still referring to the old `hero` property. Let’s fix the template to bind to the new `selectedHero` property.

{% highlight java %}
{% raw %}
+ "<h2>{{selectedHero.name}} details!</h2>"
+ "<div><label>id: </label>{{selectedHero.id}}</div>"
+ "<div><label>name: </label><input [(ngModel)]='selectedHero.name' placeholder='name'></div>"
{% endraw %}
{% endhighlight %}

### Hide the empty detail with `ngIf`

When our app loads we see a list of heroes, but a hero is not selected. The selectedHero is undefined. That’s why we'll see the following error in the browser’s console:

        EXCEPTION: TypeError: Cannot read property 'name' of undefined in [null]

Remember that we are displaying `selectedHero.name` in the template. This name property does not exist because `selectedHero` itself is undefined.

We'll address this problem by keeping the hero detail out of the DOM until there is a `selected` hero.

We wrap the HTML hero detail content of our template with a `<div>`. Then we add the `ngIf` built-in directive and set it to the `selectedHero` property of our component.

{% highlight java %}
{% raw %}
+ "<div *ngIf='selectedHero'>"
+ "<h2>{{selectedHero.name}} details!</h2>"
+ "<div><label>id: </label>{{selectedHero.id}}</div>"
+ "<div><label>name: </label><input [(ngModel)]='selectedHero.name' placeholder='name'></div>"
+ "</div>"
{% endraw %}
{% endhighlight %}

When there is no `selectedHero`, the `ngIf` directive removes the hero detail HTML from the DOM. There will be no hero detail elements and no bindings to worry about.

When the user picks a hero, `selectedHero` becomes "truthy" and `ngIf` puts the hero detail content into the DOM and evaluates the nested bindings.

Refresh the browser and see the list of heroes but not the selected hero detail. The `ngIf` keeps it out of the DOM as long as the `selectedHero` is `null`. When we click on a hero in the list, the selected hero displays in the hero details. Everything is working as we expect.

### Styling the selection

We see the selected hero in the details area below but we can’t quickly locate that hero in the list above. We can fix that by applying the `selected` CSS class to the appropriate `<li>` in the master list. For example, when we select Magneta from the heroes list, we can make it pop out visually by giving it a subtle background color.

We’ll add a property binding on `class` for the `selected` class to the template. We'll set this to an expression that compares the current `selectedHero` to the hero.

The key is the name of the CSS class (`selected`). The value is `true` if the two heroes match and `false` otherwise. We’re saying _“apply the `selected` class if the heroes match, remove it if they don’t”_.

{% highlight html %}
{% raw %}
[class.selected]='hero === selectedHero'
{% endraw %}
{% endhighlight %}

Notice in the template that the `class.selected` is surrounded in square brackets (`[]`). This is the syntax for a **property binding**, a binding in which data flows one way from the data source (the expression `hero === selectedHero`) to a property of `class`.

{% highlight java %}
{% raw %}
+ "<li *ngFor='let hero of heroes'"
+ " (click)='onSelect(hero)'"
+ " [class.selected]='hero === selectedHero'>"
+ " <span class='badge'>{{hero.id}}</span> {{hero.name}}"
+ "</li>"
{% endraw %}
{% endhighlight %}

Refresh the browser. We select the hero Magneta and the selection is clearly identified by the background color.

We select a different hero and the tell-tale color switches to that hero.

Here's the complete `ApplicationComponent.java` as it stands now:

{% highlight java %}
{% raw %}
@Component(
		selector = "my-app",
		template = "<h1>{{title}}</h1>"
				+ "<h2>My Heroes</h2>"
				+ "<ul class='heroes'>"
				+ "<li *ngFor='let hero of heroes'"
				+ " (click)='onSelect(hero)'"
				+ " [class.selected]='hero === selectedHero'>"
				+ " <span class='badge'>{{hero.id}}</span> {{hero.name}}"
				+ "</li>"
				+ "</ul>"
				+ "<div *ngIf='selectedHero'>"
				+ "<h2>{{selectedHero.name}} details!</h2>"
				+ "<div><label>id: </label>{{selectedHero.id}}</div>"
				+ "<div><label>name: </label><input [(ngModel)]='selectedHero.name' placeholder='name'></div>"
				+ "</div>",
		styleUrls = "application.component.css" )
@JsType
public class ApplicationComponent
{
	private static final JsArray<Hero> HEROES = JsArray.of(
			new Hero( 11, "Mr. Nice" ),
			new Hero( 12, "Narco" ),
			new Hero( 13, "Bombasto" ),
			new Hero( 14, "Celeritas" ),
			new Hero( 15, "Magneta" ),
			new Hero( 16, "RubberMan" ),
			new Hero( 17, "Dynama" ),
			new Hero( 18, "Dr IQ" ),
			new Hero( 19, "Magma" ),
			new Hero( 20, "Tornado" ) );

	public String title = "Tour of Heroes";
	public Hero selectedHero = null;
	public JsArray<Hero> heroes = HEROES;

	public void onSelect( Hero hero )
	{
		selectedHero = hero;
	}
}
{% endraw %}
{% endhighlight %}

## The Road We’ve Travelled

Here’s what we achieved in this chapter:

- Our Tour of Heroes now displays a list of selectable heroes
- We added the ability to select a hero and show the hero’s details
- We learned how to use the built-in directives `ngIf` and `ngFor` in a component’s template

## The Road Ahead

Our Tour of Heroes has grown, but it’s far from complete. We can't put the entire app into a single component. We need to break it up into sub-components and teach them to work together as we learn in the next chapter.

# Multiple components

Our app is growing. Use cases are flowing in for reusing components, passing data to components, and creating more reusable assets. Let's separate the heroes list from the hero details and make the details component reusable.

## Making a Hero Detail component

Our heroes list and our hero details are in the same component in the same file. They're small now but each could grow. We are sure to receive new requirements for one and not the other. Yet every change puts both components at risk and doubles the testing burden without benefit. If we had to reuse the hero details elsewhere in our app, the heroes list would tag along for the ride.

Our current component violates the Single Responsibility Principle. It's only a tutorial but we can still do things right — especially if doing them right is easy and we learn how to build Angular apps in the process.

Let’s break the hero details out into its own component.

### Separating the Hero Detail Component

Add a new class named `HeroDetailComponent` as follows.

{% highlight java %}
@Component(
		selector = "my-hero-detail" )
@JsType
public class HeroDetailComponent
{
}
{% endhighlight %}

We create metadata with the @Component decorator where we specify the selector name that identifies this component's element.

When we finish here, we'll create a corresponding `<my-hero-detail>` element in the `ApplicationComponent`'s template.

#### Hero Detail Template

At the moment, the _Heroes_ and _Hero Detail_ views are combined in one template in `ApplicationComponent`. Let’s **cut** the _Hero Detail_ content from `ApplicationComponent` and **paste** it into the new template property of `HeroDetailComponent`.

We previously bound to the `selectedHero.name` property of the `ApplicationComponent`. Our `HeroDetailComponent` will have a `hero` property, not a `selectedHero` property. So we replace `selectedHero` with `hero` everywhere in our new template. That's our only change. The result looks like this:

{% highlight java %}
{% raw %}
@Component(
		selector = "my-hero-detail",
		template = "<div *ngIf='hero'>"
				+ "<h2>{{hero.name}} details!</h2>"
				+ "<div><label>id: </label>{{hero.id}}</div>"
				+ "<div><label>name: </label><input [(ngModel)]='hero.name' placeholder='name'></div>"
				+ "</div>" )
@JsType
public class HeroDetailComponent
{
}
{% endraw %}
{% endhighlight %}

Now our hero detail layout exists only in the `HeroDetailComponent`.

#### Add the hero property

Let’s add that `hero` property we were talking about to the component class.

{% highlight java %}
public Hero hero;
{% endhighlight %}

#### The `hero` property is an **`input`**

The `HeroDetailComponent` must be told what hero to display. Who will tell it? The parent `ApplicationComponent`!

The `ApplicationComponent` knows which hero to show: the hero that the user selected from the list. The user's selection is in its `selectedHero` property.

We will soon update the `ApplicationComponent` template so that it binds its `selectedHero` property to the `hero` property of our `HeroDetailComponent`. The binding _might look_ like this:

{% highlight html %}
<my-hero-detail [hero]='selectedHero'></my-hero-detail>
{% endhighlight %}

Notice that the `hero` property is the **target** of a property binding — it's in square brackets to the left of the (`=`).

Angular insists that we declare a **target** property to be an **input** property. If we don't, Angular rejects the binding and throws an error.

We'll do it by annotating the `hero` property with the `@Input` annotation.

{% highlight java %}
@Input
public Hero hero;
{% endhighlight %}

### Refresh the `ApplicationModule`

We return to the `AppModule`, the application's root module, and teach it to use the `HeroDetailComponent`.

We add `HeroDetailComponent` to the `NgModule` decorator's `declarations` array. This array contains the list of all components, pipes, and directives that we created and that belong in our application's module.

{% highlight java %}
@NgModule(
		imports = { BrowserModule.class, FormsModule.class },
		declarations = {
				ApplicationComponent.class,
				HeroDetailComponent.class
		},
		bootstrap = ApplicationComponent.class )
@JsType
public class ApplicationModule
{
}
{% endhighlight %}

### Refresh the `ApplicationComponent`

Now that the application knows about our `HeroDetailComponent`, find the location in the `ApplicationComponent` template where we removed the _Hero Detail_ content and add an element tag that represents the `HeroDetailComponent`.

{% highlight html %}
<my-hero-detail></my-hero-detail>
{% endhighlight %}

The two components won't coordinate until we bind the `selectedHero` property of the `ApplicationComponent` to the `HeroDetailComponent` element's `hero` property like this:

{% highlight html %}
<my-hero-detail [hero]='selectedHero'></my-hero-detail>
{% endhighlight %}

The `ApplicationComponent`’s template should now look like this

{% highlight java %}
{% raw %}
template = "<h1>{{title}}</h1>"
				+ "<h2>My Heroes</h2>"
				+ "<ul class='heroes'>"
				+ "<li *ngFor='let hero of heroes'"
				+ " (click)='onSelect(hero)'"
				+ " [class.selected]='hero === selectedHero'>"
				+ " <span class='badge'>{{hero.id}}</span> {{hero.name}}"
				+ "</li>"
				+ "<my-hero-detail [hero]='selectedHero'></my-hero-detail>"
				+ "</ul>",
{% endraw %}
{% endhighlight %}

Thanks to the binding, the `HeroDetailComponent` should receive the hero from the `ApplicationComponent` and display that hero's detail beneath the list. The detail should update every time the user picks a new hero.

### It works !

When we view our app in the browser we see the list of heroes. When we select a hero we can see the selected hero’s details.

What's fundamentally new is that we can use this `HeroDetailComponent` to show hero details anywhere in the app.

We’ve created our first reusable component!

## The Road We’ve Travelled

Let’s take stock of what we’ve built.

- We created a reusable component
- We learned how to make a component accept input
- We learned to declare the application directives we need in an Angular module. We list the directives in the `NgModule` annotation's `declarations` array.
- We learned to bind a parent component to a child component.

## The Road Ahead

Our Tour of Heroes has become more reusable with shared components.

We're still getting our (mock) data within the `ApplicationComponent`. That's not sustainable. We should refactor data access to a separate service and share it among the components that need data.

We’ll learn to create services in the next tutorial chapter.


# Services

The Tour of Heroes is evolving and we anticipate adding more components in the near future.

Multiple components will need access to hero data and we don't want to copy and paste the same code over and over. Instead, we'll create a single reusable data service and learn to inject it in the components that need it.

Refactoring data access to a separate service keeps the component lean and focused on supporting the view. It also makes it easier to unit test the component with a mock service.

Because data services are invariably asynchronous, we'll finish the chapter with a **Promise**-based version of the data service.

## Creating a Hero Service

Our stakeholders have shared their larger vision for our app. They tell us they want to show the heroes in various ways on different pages. We already can select a hero from a list. Soon we'll add a dashboard with the top performing heroes and create a separate view for editing hero details. All three views need hero data.

At the moment the `ApplicationComponent` defines mock heroes for display. We have at least two objections. First, defining heroes is not the component's job. Second, we can't easily share that list of heroes with other components and views.

We can refactor this hero data acquisition business to a single service that provides heroes, and share that service with all components that need heroes.

### Create the HeroService

Create a new class called `HeroService` and annotate it with the `@Injectable` and `@JsType` annotations.

### Injectable Services

Angular2Boot sees the @Injectable annotation and emits metadata about our service, metadata that Angular may need to inject other dependencies into this service.

The `HeroService` doesn't have any dependencies at the moment. Add the annotation anyway. It is a "best practice" to apply the `@Injectable` annotation ​from the start​ both for consistency and for future-proofing.

### Getting Heroes

Add a `getHeroes()` method stub.

{% highlight java %}
@Injectable
@JsType
public class HeroService
{
	public JsArray<Hero> getHeroes()
	{
	}
}
{% endhighlight %}

We're holding back on the implementation for a moment to make an important point.

The consumer of our service doesn't know how the service gets the data. Our HeroService could get `Hero` data from anywhere. It could get the data from a web service or local storage or from a mock data source.

That's the beauty of removing data access from the component. We can change our minds about the implementation as often as we like, for whatever reason, without touching any of the components that need heroes.

### Mock Heroes

We already have mock `Hero` data sitting in the `ApplicationComponent`. It doesn't belong there. It doesn't belong here either. We'll move the mock data to its own file.

Cut the `HEROES` array from `ApplicationComponent` and paste it into the `HeroService` class.

Then, in the `HeroService` class return the mock array in the `getHeroes()` method. The code looks like this :

{% highlight java %}
@Injectable
@JsType
public class HeroService
{
	private static final JsArray<Hero> HEROES = JsArray.of(
			new Hero( 11, "Mr. Nice" ),
			new Hero( 12, "Narco" ),
			new Hero( 13, "Bombasto" ),
			new Hero( 14, "Celeritas" ),
			new Hero( 15, "Magneta" ),
			new Hero( 16, "RubberMan" ),
			new Hero( 17, "Dynama" ),
			new Hero( 18, "Dr IQ" ),
			new Hero( 19, "Magma" ),
			new Hero( 20, "Tornado" ) );

	public JsArray<Hero> getHeroes()
	{
		return HEROES;
	}
}
{% endhighlight %}

### Use the Hero Service

We're ready to use the `HeroService` in other components starting with our `ApplicationComponent`.

### Do we _new_ the `HeroService`? No way!

We could create a new instance of the `HeroService` with the `new` operator by ourselves.

That's a bad idea for several reasons including

- Our component has to know how to create a `HeroService`. If we ever change the `HeroService` constructor, we'll have to find every place we create the service and fix it. Running around patching code is error prone and adds to the test burden.
- We create a new service each time we use `new`. What if the service should cache heroes and share that cache with others? We couldn't do that.
- We're locking the `ApplicationComponent` into a specific implementation of the `HeroService`. It will be hard to switch implementations for different scenarios. Can we operate offline? Will we need different mocked versions under test? Not easy.

_What if ... what if ... Hey, we've got work to do!_

We get it. Really we do. But it is so ridiculously easy to avoid these problems that there is no excuse for doing it wrong.

### Inject the `HeroService`

Insert the following lines in the `ApplicationComponent` class :

{% highlight java %}
private HeroService heroService;

public ApplicationComponent( HeroService heroService )
{
    this.heroService = heroService;
}
{% endhighlight %}

Now Angular will know it needs to supply an instance of the `HeroService` when it creates a new `ApplicationComponent`.

The _injector_ does not know yet how to create a `HeroService`. If we ran our code now, Angular would fail with an error:

        EXCEPTION: No provider for HeroService! (ApplicationComponent -> HeroService)

We have to teach the _injector_ how to make a `HeroService` by registering a `HeroService` provider. Do that by adding the following `providers` property to the bottom of the component metadata in the `@Component` annotation parameters of the `ApplicationComponent` class.

{% highlight java %}
providers = HeroService.class
{% endhighlight %}

The `providers` parameter tells Angular to create a fresh instance of the `HeroService` when it creates a new `ApplicationComponent`. The `ApplicationComponent` can use that service to get heroes and so can every child component of its component tree.

### `getHeroes` in the `ApplicationComponent`

We've got the service in a `heroService` private variable. Let's use it.

We pause to think. We can call the service and get the data in one line.

{% highlight java %}
heroes = heroService.getHeroes();
{% endhighlight %}

We don't really need a dedicated method to wrap one line. We write it anyway:

{% highlight java %}
public void getHeroes()
{
    heroes = heroService.getHeroes();
}
{% endhighlight %}

### The `ngOnInit` Lifecycle Hook

`ApplicationComponent` should fetch and display heroes without a fuss. Where do we call the `getHeroes()` method? In a constructor? We do not!

Years of experience and bitter tears have taught us to keep complex logic out of the constructor, especially anything that might call a server as a data access method is sure to do.

The constructor is for simple initializations like wiring constructor parameters to properties. It's not for heavy lifting. We should be able to create a component in a test and not worry that it might do real work — like calling a server! — before we tell it to do so.

If not the constructor, something has to call `getHeroes()`.

Angular will call it if we implement the Angular `OnInit` interface. Angular offers a number of interfaces for tapping into critical moments in the component lifecycle: at creation, after each change, and at its eventual destruction.

Each interface has a single method. When the component implements that method, Angular calls it at the appropriate time.

We declare that the `ApplicationComponent` implements the `OnInit` interface and implement the `ngOnInit` method with our initialization logic inside and leave it to Angular to call it at the right time. In our case, we initialize by calling `getHeroes()`.

{% highlight java %}
@Component( ... )
@JsType
public class ApplicationComponent implements OnInit
{
	...

	@Override
	public void ngOnInit()
	{
		getHeroes();
	}

	public void getHeroes()
	{
		heroes = heroService.getHeroes();
	}

    ...
}
{% endhighlight %}

Our application should be running as expected, showing a list of heroes and a hero detail view when we click on a hero name.

We're getting closer. But something isn't quite right.

## Async Services and Promises

Our `HeroService` returns a list of mock heroes immediately. Its `getHeroes()` method signature is synchronous.

Ask for heroes and they are there in the returned result.

Someday we're going to get heroes from a remote server. We don’t call http yet, but we aspire to in later chapters.

When we do, we'll have to wait for the server to respond and we won't be able to block the UI while we wait, even if we want to (which we shouldn't) because the browser won't block.

We'll have to use some kind of asynchronous technique and that will change the signature of our `getHeroes()` method.

We'll use _Promises_.

### The Hero Service makes a Promise

A **Promise** is ... well it's a promise to call us back later when the results are ready. We ask an asynchronous service to do some work and give it a callback function. It does that work (somewhere) and eventually it calls our function with the results of the work or an error.

Update the `HeroService` with this Promise-returning getHeroes method:

{% highlight java %}
public Promise<JsArray<Hero>> getHeroes()
{
    return Promise.resolve( HEROES );
}
{% endhighlight %}

We're still mocking the data. We're simulating the behavior of an ultra-fast, zero-latency server, by returning an **immediately resolved Promise** with our mock heroes as the result.

### Act on the Promise

Returning to the `AppplicationComponent` and its `getHeroes()` method, we have to change our implementation to act on the _Promise_ when it resolves. When the _Promise_ resolves successfully, then we will have heroes to display.

We pass our callback function as an argument to the Promise's **then** method:

{% highlight java %}
private void getHeroes()
{
    heroService.getHeroes().then( heroes -> this.heroes = heroes );
}
{% endhighlight %}

Our callback sets the component's `heroes` property to the array of heroes returned by the service. That's all there is to it!

Our app should still be running, still showing a list of heroes, and still responding to a name selection with a detail view.

## The Road We’ve Travelled

Let’s take stock of what we’ve built.

- We created a service class that can be shared by many components.
- We used the `OnInit` Lifecycle Hook to get our heroes when our `ApplicationComponent` activates.
- We defined our `HeroService` as a provider for our `ApplicationComponent`.
- We created mock hero data and imported them into our service.
- We designed our service to return a Promise and our component to get our data from the Promise.

## The Road Ahead

Our Tour of Heroes has become more reusable using shared components and services. We want to create a dashboard, add menu links that route between the views, and format data in a template. As our app evolves, we’ll learn how to design it to make it easier to grow and maintain.

We learn about Angular Component Router and navigation among the views in the next tutorial chapter.

## Appendix: Take it slow

We can simulate a slow connection.

Add the following `getHeroesSlowly()` method to the `HeroService` class:

{% highlight java %}
public Promise<JsArray<Hero>> getHeroesSlowly()
{
    return new Promise<>( ( resolver, rejecter ) -> {
        GlobalScope.setTimeout( () -> resolver.resolve(null), 2000 );
    } ).then( nop -> getHeroes() );
}
{% endhighlight %}

Like `getHeroes()`, it also returns a Promise. But this Promise waits 2 seconds before resolving the Promise with mock `heroes`.

Back in the `ApplicationComponent`, replace `heroService.getHeroes()` with `heroService.getHeroesSlowly()` and see how the app behaves.




# Routing

We received new requirements for our Tour of Heroes application:

- Add a _Dashboard_ view.
- Navigate between the _Heroes_ and _Dashboard_ views.
- Clicking on a hero in either view navigates to a detail view of the selected hero.
- Clicking a _deep link_ in an email opens the detail view for a particular hero.

## Action plan

Here's our plan:

- Turn `ApplicationComponent` into an application shell that only handles navigation
- Relocate the _Heroes_ concerns within the current `ApplicationComponent` to a separate `HeroesComponent`
- Add routing
- Create a new `DashboardComponent`
- Tie the _Dashboard_ into the navigation structure

## Splitting the `ApplicationComponent`

Our current app loads `ApplicationComponent` and immediately displays the list of heroes.

Our revised app should present a shell with a choice of views (_Dashboard_ and _Heroes_) and then default to one of them.

The `ApplicationComponent` should only handle navigation. Let's move the display of _Heroes_ out of `ApplicationComponent` and into its own `HeroesComponent`.

### `HeroesComponent`

`ApplicationComponent` is already dedicated to _Heroes_. Instead of moving anything out of `ApplicationComponent`, we'll just rename it `HeroesComponent` (and update all references to it with your IDE) and create a new `ApplicationComponent` shell separately.

Then we change the `selector` for the `HeroesComponent` to be `my-heroes`.

### Create the new `ApplicationComponent`

The new `ApplicationComponent` will be the application shell. It will have some navigation links at the top and a display area below for the pages we navigate to.

The initial steps are:

- Create the `ApplicationComponent` class.
- Add an `@Component` annotation on the class with a `my-app` selector.
- Move the following from `HeroesComponent` to `ApplicationComponent`:
-- `title` attribute
-- `@Component` template `<h1>` element, which contains a binding to `title`
- Add a `<my-heroes>` element to the app template just below the heading so we still see the heroes.
- Add `HeroesComponent` to the declarations array of `ApplicationModule` so Angular recognizes the `<my-heroes>` tags.
- Check that `bootstrap` in the `ApplicationModule` is set to `ApplicationComponent.class` and not `HeroesComponent.class` (when we did the refactoring your IDE might have updated this value)
- Add `HeroService` to the providers array of `ApplicationModule` because we'll need it in every other view.
- Remove `HeroService` from the `HeroesComponent` providers array since it has been promoted.

Our `ApplicationModule` looks like this :

{% highlight java %}
@NgModule(
		imports = {
				BrowserModule.class,
				FormsModule.class },
		declarations = {
				ApplicationComponent.class,
				HeroesComponent.class,
				HeroDetailComponent.class
		},
		providers = {
				HeroService.class
		},
		bootstrap = {
				ApplicationComponent.class
		} )
@JsType
public class ApplicationModule
{
}
{% endhighlight %}

And the `ApplicationComponent` is :

{% highlight java %}
{% raw %}
@Component(
		selector = "my-app",
		template = "<h1>{{title}}</h1>"
				+ "<my-heroes></my-heroes>" )
@JsType
public class ApplicationComponent
{
	public String title = "Tour of Heroes";
}
{% endraw %}
{% endhighlight %}

The app still runs and still displays heroes. Our refactoring of `ApplicationComponent` into a new `ApplicationComponent` and a `HeroesComponent` worked! We have done no harm.

## Add Routing

We're ready to take the next step. Instead of displaying heroes automatically, we'd like to show them after the user clicks a button. In other words, we'd like to navigate to the list of heroes.

We'll need the _Angular Component Router_.

The Angular router is an external, optional Angular NgModule called `RouterModule`. The router is a combination of multiple provided services (`RouterModule`), multiple directives (`RouterOutlet`, `RouterLink`, `RouterLinkActive`), and a configuration (`Routes`). We'll configure our routes first.

### Configure routes

Our application doesn't have any routes yet. We'll start by creating a configuration class for the application routes.

_Routes_ tell the router which views to display when a user clicks a link or pastes a URL into the browser address bar.

Let's define a `Routes` class as follow :

{% highlight java %}
public class Routes implements ProviderWrapper
{
	@Override
	public Object get()
	{
		return RouterModule.forRoot( JsArray.of(
				RouterConfig.route(
						"heroes",
						HeroesComponent_AngularComponent.getComponentPrototype() ) ),
				new JsObject().set( "useHash", true ) );
	}
}
{% endhighlight %}

The `ProviderWrapper` interface tells Angular2Java that the class should be used as a service provider for Angular. Our one calls the angular `RouterModule.forRoot` function which builds a _router_ configured with the routes we pass in parameters.

We have only one route definition at the moment but rest assured, we'll add more.

This _route definition_ has the following parts:

- **path**: the router matches this route's path to the URL in the browser address bar (`heroes`).
- **component**: the component that the router should create when navigating to this route (`HeroesComponent`). **Note that we use the enhanced protype (generated by Angular2Java) and not the `HeroesComponent.class` class directly.**

### Make the router available

Add the `Routes.class` to the `imports` attribute of the `@NgModule` annotation in the `ApplicationModule` class.

You also need to add the `HeroesComponent.class` in the `entryComponents` attribute of the same annotation.

`ApplicationModule` now looks like this:

{% highlight java %}
@NgModule(
		imports = {
				BrowserModule.class,
				FormsModule.class,
				Routes.class },
		declarations = {
				ApplicationComponent.class,
				HeroesComponent.class,
				HeroDetailComponent.class
		},
		providers = {
				HeroService.class
		},
		entryComponents = HeroesComponent.class,
		bootstrap = {
				ApplicationComponent.class
		} )
@JsType
public class ApplicationModule
{
}
{% endhighlight %}

### Router Outlet

If we paste the path, `#/heroes`, into the browser address bar, the router should match it to the `heroes` route and display the `HeroesComponent`. But where?

We have to **tell it where** by adding a `<router-outlet>` element to the bottom of the template. `RouterOutlet` is one of the directives provided by the `RouterModule`. The router displays each component immediately below the `<router-outlet>` as we navigate through the application.

### Router Links

We don't really expect users to paste a route URL into the address bar. We add an anchor tag to the template which, when clicked, triggers navigation to the `HeroesComponent`.

The revised template in `ApplicationComponent` looks like this:

{% highlight java %}
template = "<h1>{{title}}</h1>"
        + "<a routerLink='/heroes'>Heroes</a>"
        + "<router-outlet></router-outlet>"
{% endhighlight %}

Notice the `routerLink` binding in the anchor tag. We bind the `RouterLink` directive (another of the `RouterModule` directives) to a string that tells the router where to navigate when the user clicks the link.

Since our link is not dynamic, we define a routing instruction with a one-time binding to our route path. Looking back at the route configuration, we confirm that '#/heroes' is the path of the route to the `HeroesComponent`.

Refresh the browser. We see only the app title and heroes link. We don't see the heroes list.

We click the _Heroes_ navigation link, the browser bar updates to '#/heroes', and now we see the list of heroes. We are navigating at last!

At this stage, our `ApplicationComponent looks like this.`

{% highlight java %}
{% raw %}
@Component(
		selector = "my-app",
		template = "<h1>{{title}}</h1>"
				+ "<a routerLink='/heroes'>Heroes</a>"
				+ "<router-outlet></router-outlet>" )
@JsType
public class ApplicationComponent
{
	public String title = "Tour of Heroes";
}
{% endraw %}
{% endhighlight %}

The _ApplicationComponent_ is now attached to a router and displaying routed views. For this reason and to distinguish it from other kinds of components, we call this type of component a _Router Component_.

## Add a Dashboard

Routing only makes sense when we have multiple views. We need another view.

Create a placeholder `DashboardComponent` that gives us something to navigate to and from.

{% highlight java %}
@Component(
		selector = "my-dashboard",
		template = "<h3>My Dashboard</h3>" )
@JsType
public class DashboardComponent
{
}
{% endhighlight %}

We’ll come back and make it more useful later.

### Configure the dashboard route

Go back to the `Routes` class and teach it to navigate to the dashboard.

Add the following route definition to the array of definitions.

{% highlight java %}
RouterConfig.route(
    "dashboard",
    DashboardComponent_AngularComponent.getComponentPrototype() ) )
{% endhighlight %}

Also add `DashboardComponent.class` to our root `NgModule`'s both `declarations` and `entryComponents`.

#### `redirectTo`

We want the app to show the dashboard when it starts and we want to see a nice URL in the browser address bar that says '#/dashboard'. Remember that the browser launches with '/' in the address bar.

We can use a redirect route to make this happen. Add the following to our array of route definitions:

{% highlight java %}
RouterConfig.route(
    "",
    "/dashboard",
    "full" )
{% endhighlight %}

Add navigation to the template

Finally, add a dashboard navigation link to the template, just above the _Heroes_ link in the `ApplicationComponent`'s template.

{% highlight java %}
template = "<h1>{{title}}</h1>"
    + "<nav>"
    + "<a routerLink='/dashboard'>Dashboard</a>"
    + "<a routerLink='/heroes'>Heroes</a>"
    + "</nav>"
    + "<router-outlet></router-outlet>"
{% endhighlight %}

To see these changes in your browser, go to the application root (`/`) and reload. The app displays the dashboard and we can navigate between the dashboard and the heroes.

## Dashboard Top Heroes

Let’s spice up the dashboard by displaying the top four heroes at a glance.

Replace the `template` metadata with a `templateUrl` property that points to a new template file.

{% highlight java %}
templateUrl = "dashboard.component.html"
{% endhighlight %}

Create that file with this content (in the `src/main/resources/static/` folder):

{% highlight html %}
{% raw %}
<h3>Top Heroes</h3>
<div class="grid grid-pad">
	<div *ngFor="let hero of heroes" (click)="gotoDetail(hero)"
		class="col-1-4">
		<div class="module hero">
			<h4>{{hero.name}}</h4>
		</div>
	</div>
</div>
{% endraw %}
{% endhighlight %}

We use `*ngFor` once again to iterate over a list of heroes and display their names. We added extra `<div>` elements to help with styling later in this chapter.

There's a `(click)` binding to a `gotoDetail` method we haven't written yet and we're displaying a list of heroes that we don't have. We have work to do, starting with those heroes.

### Share the HeroService

We'd like to re-use the `HeroService` to populate the component's heroes array.

Recall earlier in the chapter that we removed the `HeroService` from the providers array of `HeroesComponent` and added it to the providers array of `ApplicationModule`.

That move created a singleton `HeroService` instance, available to all components of the application. Angular will inject `HeroService` and we'll use it here in the `DashboardComponent`.

### Get heroes

Now implement the `DashboardComponent` class like this:

{% highlight java %}
@Component(
		selector = "my-dashboard",
		templateUrl = "dashboard.component.html" )
@JsType
public class DashboardComponent implements OnInit
{
	public JsArray<Hero> heroes = JsArray.empty();

	private HeroService heroService;

	public DashboardComponent( HeroService heroService )
	{
		this.heroService = heroService;
	}

	@Override
	public void ngOnInit()
	{
		heroService.getHeroes().then( heroes -> this.heroes = heroes.slice( 1, 5 ) );
	}

	public void gotoDetail( Hero hero )
	{
		// not implemented yet
	}
}
{% endhighlight %}

We've seen this kind of logic before in the HeroesComponent:

- Define a `heroes` array property.
- Inject the `HeroService` in the constructor and hold it in a private `heroService` field.
- Call the service to get heroes inside the Angular `ngOnInit` lifecycle hook.

The noteworthy differences: we cherry-pick four heroes (2nd, 3rd, 4th, and 5th) and stub the `gotoDetail` method until we're ready to implement it.

Refresh the browser and see four heroes in the new dashboard.

## Navigate to Hero Details

Although we display the details of a selected hero at the bottom of the `HeroesComponent`, we don't yet navigate to the `HeroDetailComponent` in the three ways specified in our requirements:

- from the _Dashboard_ to a selected hero.
- from the _Heroes_ list to a selected hero.
- from a "deep link" URL pasted into the browser address bar.

Adding a hero-detail route seems like an obvious place to start.

### Routing to a hero detail

We'll add a route to the `HeroDetailComponent` in `Routes.java` where our other routes are configured.

The new route is a bit unusual in that we must tell the `HeroDetailComponent` which hero to show. We didn't have to tell the `HeroesComponent` or the `DashboardComponent` anything.

At the moment the parent `HeroesComponent` sets the component's hero property to a hero object with a binding like this.

{% highlight html %}
<my-hero-detail [hero]='selectedHero'></my-hero-detail>
{% endhighlight %}

That clearly won't work in any of our routing scenarios. Certainly not the last one; we can't embed an entire hero object in the URL! Nor would we want to.

### Parameterized route

We _can_ add the hero's `id` to the URL. When routing to the hero whose `id` is 11, we could expect to see an URL such as this:

        /detail/11

The `/detail/` part of that URL is constant. The trailing numeric `id` part changes from hero to hero. We need to represent that variable part of the route with a _parameter_ (or token) that stands for the hero's `id`.

### Configure a Route with a Parameter

Here's the route definition we'll use.

{% highlight java %}
RouterConfig.route(
    "detail/:id",
    HeroDetailComponent_AngularComponent.getComponentPrototype() )
{% endhighlight %}

The colon (:) in the path indicates that `:id` is a placeholder to be filled with a specific hero `id` when navigating to the HeroDetailComponent.

We're finished with the application routes.

We won't add a 'Hero Detail' link to the template because users don't click a navigation _link_ to view a particular hero. They click a _hero_ whether that hero is displayed on the dashboard or in the heroes list.

We'll get to those _hero_ clicks later in the chapter. There's no point in working on them until the `HeroDetailComponent` is ready to be navigated to.

That will require an `HeroDetailComponent` overhaul.

### Revise the `HeroDetailComponent`

Before we rewrite the `HeroDetailComponent`, let's review what it looks like now:

{% highlight java %}
{% raw %}
@Component(
		selector = "my-hero-detail",
		template = "<div *ngIf='hero'>"
				+ "<h2>{{hero.name}} details!</h2>"
				+ "<div><label>id: </label>{{hero.id}}</div>"
				+ "<div><label>name: </label><input [(ngModel)]='hero.name' placeholder='name'></div>"
				+ "</div>" )
@JsType
public class HeroDetailComponent
{
	@Input
	public Hero hero;
}
{% endraw %}
{% endhighlight %}

The template won't change. We'll display a hero the same way. The big changes are driven by how we get the hero.

We will no longer receive the hero in a parent component property binding. The new `HeroDetailComponent` should take the `id` parameter from the params observable in the `ActivatedRoute` service and use the `HeroService` to fetch the hero with that id.

Let's have the `ActivatedRoute` service and the `HeroService` injected into the constructor, saving their values in private fields:

{% highlight java %}
private HeroService heroService;
private ActivatedRoute route;

public HeroDetailComponent( HeroService heroService, ActivatedRoute route )
{
    this.heroService = heroService;
    this.route = route;
}
{% endhighlight %}

We tell the class that we want to implement the `OnInit` interface.

Inside the `ngOnInit` lifecycle hook, we use the params observable to extract the `id` parameter value from the `ActivateRoute` service and use the `HeroService` to fetch the hero with that `id`.

{% highlight java %}
@Override
public void ngOnInit()
{
    route.params.forEach( params -> {
        String value = params.get( "id" );
        if( value != null )
        {
            int id = Integer.parseInt( value );
            heroService.getHero( id ).then( hero -> this.hero = hero );
        }
    } );
}
{% endhighlight %}

Notice how we extract the `id` by calling the `forEach` method which will deliver our array of route parameters.

The hero `id` is an `int`. Route parameters are always `Strings`. So we convert the route parameter value to a number with the `Integer.parseInt()` method.

### Add HeroService.getHero

The problem with this bit of code is that `HeroService` doesn't have a `getHero` method! We better fix that quickly before someone notices that we broke the app.

Open `HeroService` and add a `getHero` method that filters the heroes list from `getHeroes` by `id`:

{% highlight java %}
public Promise<Hero> getHero( int id )
{
    return getHeroes().then( heroes -> heroes.find( hero -> hero.id == id ) );
}
{% endhighlight %}

Let's return to the `HeroDetailComponent` to clean up loose ends.

### Find our way back

We can navigate to the `HeroDetailComponent` in several ways. How do we navigate somewhere else when we're done?

The user could click one of the two links in the `ApplicationComponent`. Or click the browser's back button. We'll add a third option, a `goBack` method in `HeroDetailComponent` that navigates backward one step in the browser's history stack.

{% highlight java %}
public void goBack()
{
    JsTools.historyGoBack();
}
{% endhighlight %}

Then we wire this method with an event binding to a _Back_ button that we add to the bottom of the `HeroDetailComponent` component template.

{% highlight java %}
+ "<button (click)='goBack()'>Back</button>"
{% endhighlight %}

Modifing the template to add this button spurs us to take one more incremental improvement and migrate the template to its own file, called `hero-detail.component.html`:

{% highlight html %}
{% raw %}
<div *ngIf='hero'>
	<h2>{{hero.name}} details!</h2>
	<div>
		<label>id: </label>{{hero.id}}
	</div>
	<div>
		<label>name: </label><input [(ngModel)]='hero.name' placeholder='name'>
	</div>
</div>
<button (click)='goBack()'>Back</button>
{% endraw %}
{% endhighlight %}

We update the component metadata with a `templateUrl` pointing to the template file that we just created.

{% highlight java %}
templateUrl = "hero-detail.component.html"
{% endhighlight %}

Refresh the browser and see the results.

## Select a Dashboard Hero

When a user selects a hero in the dashboard, the app should navigate to the `HeroDetailComponent` to view and edit the selected hero.

In the dashboard template we bound each hero's click event to the `gotoDetail` method, passing along the selected `hero` entity.

We stubbed the `gotoDetail` method when we rewrote the `DashboardComponent`. Now we give it a real implementation.

{% highlight java %}
public void gotoDetail( Hero hero )
{
    JsArray<?> link = JsArray.of( "/detail", String.valueOf( hero.id ) );
    router.navigate( link );
}
{% endhighlight %}

The `gotoDetail` method navigates in two steps:

- Set a route _link_ parameters array
- Pass the array to the router's `navigate` method

For navigation, we wrote router links in the `ApplicationComponent` template. Those links had only one element, the path of the destination route.

This link parameters array has two elements, the **path** of the destination route and a route **parameter** set to the value of the selected hero's `id`.

The two array items align with the **path** and **:id** token in the parameterized hero detail route definition we added to the `Routes` class earlier in the chapter.

The `DashboardComponent` doesn't have the router yet. We obtain it in the usual way: inject the `router` in the constructor (along with the `HeroService`):

{% highlight java %}
private HeroService heroService;
private Router router;

public DashboardComponent( HeroService heroService, Router router )
{
    this.heroService = heroService;
    this.router = router;
}
{% endhighlight %}

A last thing to do is to add the `HeroDetailComponent` class in the `entryComponents` field of the `NgModule` annotation of our root module (`ApplicationModule`).

Refresh the browser and select a hero from the dashboard; the app should navigate directly to that hero’s details.

## Select a Hero in the `HeroesComponent`

We'll do something similar in the `HeroesComponent`.

That component's current template exhibits a "master/detail" style with the list of heroes at the top and details of the selected hero below.

Delete the last line of the template with the `<my-hero-detail>` tags.

We'll no longer show the full `HeroDetailComponent` here. We're going to display the hero detail on its own page and route to it as we did in the dashboard.

But we'll throw in a small twist for variety. When the user selects a hero from the list, we won't go to the detail page. We'll show a mini-detail on this page instead and make the user click a button to navigate to the full detail page.

### Add the mini-detail

Since we again add some HTML to the `HeroesComponent` template, let's move its template into its own file: create a `heroes.component.html` file in the `src/main/resources/static` folder of the application, and move the `HeroesComponent` template content into the html file. Then refer to this file in the `templateUrl` attribute of the `@Component` annotation on the `HeroesComponent` class.

Then, add the following HTML fragment at the bottom of the template where the `<my-hero-detail>` used to be:

{% highlight html %}
{% raw %}
<div *ngIf="selectedHero">
	<h2>{{selectedHero.name | uppercase}} is my hero</h2>
	<button (click)="gotoDetail()">View Details</button>
</div>
{% endraw %}
{% endhighlight %}

After clicking a hero, the user should seethe mini detail zone appearing below the Hero list.

### Format with the uppercase pipe

Notice that the hero's name is displayed in CAPITAL LETTERS. That's the effect of the `uppercase` pipe that we slipped into the interpolation binding. Look for it right after the pipe operator ( | ).

{% highlight html %}
{% raw %}
{{selectedHero.name | uppercase}} is my hero
{% endraw %}
{% endhighlight %}


Pipes are a good way to format strings, currency amounts, dates and other display data. Angular ships with several pipes and we can write our own.

### Renaming the CSS file

When we did rename the old `ApplicationComponent` to `HeroesComponent`, we forgot to rename the `application.component.css` file to `heroes.component.css`. Let's do it now. Of course, you also need to update the `styleUrls` attribute of the `@Component` annotation in the `HeroesComponent` class.

Now we can see what's going on as we update the component class along the same lines as the dashboard:

- Inject the router in the constructor (along with the `HeroService`)
- Implement the `gotoDetail` method by calling the `router.navigate` method with a two-part hero-detail link parameters array.

Here's the revised component class:

{% highlight java %}
@Component(
		selector = "my-heroes",
		templateUrl = "heroes.component.html",
		styleUrls = "heroes.component.css" )
@JsType
public class HeroesComponent implements OnInit
{
	public Hero selectedHero = null;
	public JsArray<Hero> heroes;

	private HeroService heroService;
	private Router router;

	public HeroesComponent( HeroService heroService, Router router )
	{
		this.heroService = heroService;
		this.router = router;
	}

	@Override
	public void ngOnInit()
	{
		getHeroes();
	}

	public void onSelect( Hero hero )
	{
		selectedHero = hero;
	}

	public void gotoDetail()
	{
		router.navigate( JsArray.of( "/detail", String.valueOf( selectedHero.id ) ) );
	}

	private void getHeroes()
	{
		heroService.getHeroesSlowly().then( heroes -> this.heroes = heroes );
	}
}
{% endhighlight %}

Refresh the browser and start clicking. We can navigate around the app, from the dashboard to hero details and back, for heroes list to the mini-detail to the hero details and back to the heroes again. We can jump back and forth between the dashboard and the heroes.

We've met all of the navigational requirements that propelled this chapter.

## Styling the App

The app is functional but pretty ugly. Our creative designer team provided some CSS files to make it look better.

### A Dashboard with Style

The designers think we should display the dashboard heroes in a row of rectangles. They've given us ~60 lines of CSS for this purpose including some simple media queries for responsive design.

If we paste these ~60 lines into the component `styles` metadata, they'll completely obscure the component logic. Let's not do that. It's easier to edit CSS in a separate `*.css` file anyway.

Add a `dashboard.component.css` file to the app folder and reference that file in the component metadata's `styleUrls` array property like this:

{% highlight java %}
styleUrls = "dashboard.component.css"
{% endhighlight %}

Here is the content of the `dashboard.component.css` file :

{% highlight css linenos %}
[class*='col-'] {
	float: left;
}

*, *:after, *:before {
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

h3 {
	text-align: center;
	margin-bottom: 0;
}

[class*='col-'] {
	padding-right: 20px;
	padding-bottom: 20px;
}

[class*='col-']:last-of-type {
	padding-right: 0;
}

.grid {
	margin: 0;
}

.col-1-4 {
	width: 25%;
}

.module {
	padding: 20px;
	text-align: center;
	color: #eee;
	max-height: 120px;
	min-width: 120px;
	background-color: #607D8B;
	border-radius: 2px;
}

h4 {
	position: relative;
}

.module:hover {
	background-color: #EEE;
	cursor: pointer;
	color: #607d8b;
}

.grid-pad {
	padding: 10px 0;
}

.grid-pad>[class*='col-']:last-of-type {
	padding-right: 20px;
}

@media ( max-width : 600px) {
	.module {
		font-size: 10px;
		max-height: 75px;
	}
}

@media ( max-width : 1024px) {
	.grid {
		margin: 0;
	}
	.module {
		min-width: 60px;
	}
}
{% endhighlight %}

### Stylish Hero Details

The designers also gave us CSS styles specifically for the `HeroDetailComponent`.

Add a `hero-detail.component.css` to the app folder and refer to that file inside the `styleUrls` array as we did for `DashboardComponent`. Let's also remove the hero property `@Input` annotation while we are at it.

Here's the content for the `hero-detail.component.css` CSS file.

{% highlight css linenos %}
label {
	display: inline-block;
	width: 3em;
	margin: .5em 0;
	color: #607D8B;
	font-weight: bold;
}

input {
	height: 2em;
	font-size: 1em;
	padding-left: .4em;
}

button {
	margin-top: 20px;
	font-family: Arial;
	background-color: #eee;
	border: none;
	padding: 5px 10px;
	border-radius: 4px;
	cursor: pointer;
	cursor: hand;
}

button:hover {
	background-color: #cfd8dc;
}

button:disabled {
	background-color: #eee;
	color: #ccc;
	cursor: auto;
}
{% endhighlight %}

### Style the Navigation Links

The designers gave us CSS to make the navigation links in our `ApplicationComponent` look more like selectable buttons. We cooperated by surrounding those links in `<nav>` tags.

Add a `application.component.css` file to the app folder with the following content.

{% highlight css %}
h1 {
	font-size: 1.2em;
	color: #999;
	margin-bottom: 0;
}

h2 {
	font-size: 2em;
	margin-top: 0;
	padding-top: 0;
}

nav a {
	padding: 5px 10px;
	text-decoration: none;
	margin-top: 10px;
	display: inline-block;
	background-color: #eee;
	border-radius: 4px;
}

nav a:visited, a:link {
	color: #607D8B;
}

nav a:hover {
	color: #039be5;
	background-color: #CFD8DC;
}

nav a.active {
	color: #039be5;
}
{% endhighlight %}

Set the `ApplicationComponent`'s `styleUrls` property to this CSS file.

### The routerLinkActive directive

The Angular Router provides a `routerLinkActive` directive we can use to add a class to the HTML navigation element whose route matches the active route. All we have to do is define the style for it. Sweet!

{% highlight java %}
{% raw %}
template = "<h1>{{title}}</h1>"
    + "<nav>"
    + "<a routerLink='/dashboard' routerLinkActive='active'>Dashboard</a>"
    + "<a routerLink='/heroes' routerLinkActive='active'>Heroes</a>"
    + "</nav>"
    + "<router-outlet></router-outlet>"
{% endraw %}
{% endhighlight %}

### Global application styles

When we add styles to a component, we're keeping everything a component needs — HTML, the CSS, the code — together in one convenient place. It's pretty easy to package it all up and re-use the component somewhere else.

We can also create styles at the _application level_ outside of any component.

Our designers provided some basic styles to apply to elements across the entire app. These correspond to the full set of master styles that we introduced earlier (see QuickStart, "Add some style").

Create the file `styles.css`, if it doesn't exist already.

Reference it in the `index.html` file :

{% highlight html %}
<link rel="stylesheet" href="styles.css">
{% endhighlight %}

And while we're at it, remove the reference to the `bootstrap.min.css` file in the `index.html` file. It comes from the Angular2Java archetype and can now be removed...

The content of this file can be found [here](https://raw.githubusercontent.com/angular/angular.io/master/public/docs/_examples/styles.css).

Look at the app now. Our dashboard, heroes, and navigation links are styling!

## Recap

### The Road Behind

We travelled a great distance in this chapter

- We added the _Angular Component Router_ to navigate among different components.
- We learned how to create router links to represent navigation menu items.
- We used router link parameters to navigate to the details of user selected hero.
- We shared the `HeroService` among multiple components.
- We moved HTML and CSS out of the component file and into their own files.
- We added the `uppercase` pipe to format data.

### The Road Ahead

We have much of the foundation we need to build an application. We're still missing a key piece: _remote data access_.

In the next chapter, we’ll replace our mock data with data retrieved from a server using http.

# HTTP

## Getting and Saving Data with HTTP

Our stakeholders appreciate our progress. Now they want to get the hero data from a server, let users add, edit, and delete heroes, and save these changes back to the server.

In this chapter we teach our application to make the corresponding HTTP calls to a remote server's web API.

## Providing HTTP Services

`Http` is **not** a core Angular module so we need to import it. On the other hand, we should be able to access http services from anywhere in the application. So we register it in the imports array of `ApplicationModule` where we bootstrap the application and its root AppComponent.

{% highlight java %}
@NgModule(
		imports = {
				BrowserModule.class,
				FormsModule.class,
				HttpModule.class, // <- import HttpModule
				Routes.class },
        ...
{% endhighlight %}

## Heroes and HTTP

Look at our current `HeroService` implementation

{% highlight java %}
public Promise<JsArray<Hero>> getHeroes()
{
    return Promise.resolve( HEROES );
}
{%endhighlight %}

We returned a Promise resolved with mock heroes. It may have seemed like overkill at the time, but we were anticipating the day when we fetched heroes with an HTTP client and we knew that would have to be an asynchronous operation.

That day has arrived! Let's convert `getHeroes()` to use HTTP:

{% highlight java %}
private Http http;
private String heroesUrl = "app/heroes"; // URL to web api

public HeroService( Http http )
{
    this.http = http;
}

public Promise<JsArray<Hero>> getHeroes()
{
    return http.get( heroesUrl )
            .toPromise()
            .<JsArray<Hero>> then( response -> response.json() )
            .onCatch( this::handleError );
}
{% endhighlight %}

### HTTP Promise

We're still returning a Promise but we're creating it differently.

The Angular `http.get` returns an RxJS `Observable`. Observables are a powerful way to manage asynchronous data flows. We'll learn about Observables later in this chapter.

For _now_ we get back on familiar ground by immediately by converting that `Observable` to a `Promise` using the `toPromise` operator.

{% highlight java %}
.toPromise()
{% endhighlight %}

### Extracting the data in the then callback

In the _promise_'s `then` callback we call the `json()` method of the http `Response` to extract the data within the response.

{% highlight java %}
.<JsArray<Hero>> then( response -> response.json() )
{% endhighlight %}

The `then` method is parametrized with the `<JsArray<Hero>>` type because we know that the service returns a javascript array of Heroes.

### Error handling

At the end of `getHeroes()` we `catch` server failures and pass them to an error handler:

{% highlight java %}
.onCatch( this::handleError );
{% endhighlight %}

This is a critical step! We must anticipate HTTP failures as they happen frequently for reasons beyond our control.

{% highlight java %}
private Promise<?> handleError( Object error )
{
    GWT.log( "An error occurred" + error ); // for demo purposes only
    return Promise.reject( error );
}
{% endhighlight %}

In this demo service we log the error to the console; we should do better in real life.

We've also decided to return a user friendly form of the error to the caller in a rejected promise so that the caller can display a proper error message to the user.

### Promises are Promises

Although we made significant _internal_ changes to `getHeroes()`, the public signature did not change. We still return a `Promise`. We won't have to update any of the components that call `getHeroes()`.

### Heroes REST service

Since our last change, instead of using our mocked heroes we are going to make the server side provide them through the network (note that the official tutorial mocks the network requests locally, we are not going to do that, we are going to implement really the service!).

Open the `ApplicationController` class, and remove the REST service part, we are going to implement it in its own class. The `ApplicationController` class now looks like this :

{% highlight java %}
@EnableAutoConfiguration
@ComponentScan( basePackageClasses = ApplicationController.class )
public class ApplicationController
{
	public static void main( String[] args ) throws Exception
	{
		SpringApplication.run( ApplicationController.class, args );
	}
}
{% endhighlight %}

Now, in the same package as `ApplicationController`, create a `HeroesController` class with the following content (note that the mocked heroes are a copy of what we did in the client mocked `HeroService`):

{% highlight java %}
@RestController
@RequestMapping( "/app/" )
public class HeroesController
{
	private static final Collection<Hero> HEROES = new ArrayList<>( Arrays.asList(
			new Hero( 11, "Mr. Nice" ),
			new Hero( 12, "Narco" ),
			new Hero( 13, "Bombasto" ),
			new Hero( 14, "Celeritas" ),
			new Hero( 15, "Magneta" ),
			new Hero( 16, "RubberMan" ),
			new Hero( 17, "Dynama" ),
			new Hero( 18, "Dr IQ" ),
			new Hero( 19, "Magma" ),
			new Hero( 20, "Tornado" ) ) );

	@RequestMapping( "/heroes" )
	public Collection<Hero> heroes()
	{
		return HEROES;
	}
}
{% endhighlight %}

And since the mocked data is of no use anymore in the client side `HeroService`, we just simply remove it. We also take this opportunity to remove the `getHeroesSlowly` method (you will also need to replace the call to this method by a call to the `getHeroes` method in the `HeroesComponent` class). The class now looks like this :

{% highlight java %}
@Injectable
@JsType
public class HeroService
{
	private Http http;
	private String heroesUrl = "app/heroes"; // URL to web api

	public HeroService( Http http )
	{
		this.http = http;
	}

	public Promise<JsArray<Hero>> getHeroes()
	{
		return http.get( heroesUrl )
				.toPromise()
				.<JsArray<Hero>> then( response -> response.json() )
				.onCatch( ( reason ) -> JsArray.empty() );
	}

	public Promise<Hero> getHero( int id )
	{
		return getHeroes().then( heroes -> heroes.find( hero -> hero.id == id ) );
	}
}
{% endhighlight %}

Restart the spring boot application and GWT development and refresh the browser. See that now the heroes are fetched from the server through the network!

## Add, Edit, Delete

Our stakeholders are incredibly pleased with the added flexibility from the API integration, but it doesn't stop there. Next we want to add the capability to add, edit and delete heroes.

We'll complete `HeroService` by creating `post`, `put` and `delete` methods to meet our new requirements.

### Post

We will be using `post` to add new heroes. Post requests require a little bit more setup than Get requests. For Post requests we create a header and set the content type to `application/json`. We'll call `JSON.stringify` before we post to convert the hero object to a string.

### Put

Put will be used to update an individual hero. Its structure is very similar to Post requests. The only difference is that we have to change the URL slightly by appending the id of the hero we want to update.

### Delete

Delete will be used to delete heroes and its format is like `put` except for the function name.

We add a `onCatch` to handle errors for all three methods.

### Save

We combine the call to the private `post` and `put` methods in a single save method. This simplifies the public API and makes the integration with `HeroDetailComponent` easier. `HeroService` determines which method to call based on the state of the `hero` object. If the hero already has an id we know it's an edit. Otherwise we know it's an add.

After these additions our `HeroService` looks like this:

{% highlight java %}
@Injectable
@JsType
public class HeroService
{
	private Http http;

	private static final String heroesUrl = "app/heroes"; // URL to web api
	private static final Headers headers = new Headers();

	static
	{
		headers.append( "Content-Type", "application/json" );
	}

	public HeroService( Http http )
	{
		this.http = http;
	}

	public Promise<JsArray<Hero>> getHeroes()
	{
		return http.get( heroesUrl )
				.toPromise()
				.<JsArray<Hero>> then( response -> response.json() )
				.onCatch( this::handleError );
	}

	public Promise<Hero> getHero( int id )
	{
		return getHeroes().then( heroes -> heroes.find( hero -> hero.id == id ) );
	}

	public Promise<?> delete( int id )
	{
		String url = heroesUrl + "/" + id;
		return http.delete( url )
				.toPromise()
				.then( response -> null )
				.onCatch( this::handleError );
	}

	public Promise<Hero> save( Hero hero )
	{
		if( hero.id > 0 )
			return update( hero );

		hero.id = 0;

		return create( hero );
	}

	public Promise<Hero> create( Hero hero )
	{
		return http.post( heroesUrl,
				JSON.stringify( hero ),
				new JsObject().set( "headers", headers ) )
				.toPromise()
				.<Hero> then( response -> response.json() )
				.onCatch( this::handleError );
	}

	public Promise<Hero> update( Hero hero )
	{
		String url = heroesUrl + "/" + hero.id;
		return http.put( url,
				JSON.stringify( hero ),
				new JsObject().set( "headers", headers ) )
				.toPromise()
				.<Hero> then( response -> response.json() )
				.onCatch( this::handleError );
	}

	private Promise<?> handleError( Object error )
	{
		GWT.log( "An error occurred" + error ); // for demo purposes only
		return Promise.reject( error );
	}
}
{% endhighlight %}

## Updating Components

Loading heroes using `Http` required no changes outside of `HeroService`, but we added a few new features as well. In the following section we will update our components to use our new methods to add, edit and delete heroes.

### Add/Edit in the HeroDetailComponent

We already have `HeroDetailComponent` for viewing details about a specific hero. Add and Edit are natural extensions of the detail view, so we are able to reuse `HeroDetailComponent` with a few tweaks.

The original component was created to render existing data, but to add new data we have to initialize the `hero` property to an empty `Hero` object.

For that we need to add a default constructor to the `Hero` class. The `@JsContructor` annotation is used to says that when the javascript world will want to create a `Hero` it will use this constructor. Then we have to `@JsIgnore` the other constructor, because only one Java constructor can be exposed to the javascript world:

{% highlight java %}
@JsType
public class Hero
{
	public int id;
	public String name;

	@JsConstructor
	public Hero()
	{
	}

	@JsIgnore
	public Hero( int id, String name )
	{
		this();

		this.id = id;
		this.name = name;
	}
}
{% endhighlight %}

In order to differentiate between add and edit we are adding a check to see if an id is passed in the URL. If the id is absent we bind `HeroDetailComponent` to an empty `Hero` object. In either case, any edits made through the UI will be bound back to the same `hero` property.

Add a `save` method to `HeroDetailComponent` and call the corresponding `save` method in `HeroesService`.

{% highlight java %}
public void save()
{
    heroService.save( hero )
            .then( hero -> {
                goBack();
                return null;
            } );
}
{% endhighlight %}

The same `save` method is used for both add and edit since `HeroService` will know when to call `post` vs `put` based on the state of the `Hero` object.

After we save a hero, we redirect the browser back to the previous page using the `goBack()` method.

In order to allow other components to know when the `HeroDetailComponent` updated a hero, we create a `updated` output for our `HeroDetailComponent`:

{% highlight java %}
@Output
public EventEmitter<Hero> updated = new EventEmitter<>();
{% endhighlight %}

We then update the `goBack` method to trigger the `updated` emitter. In this case, we don't need to go back in browser history so we also add a check for that:

{% highlight java %}
public void goBack()
{
    updated.emit( hero );

    if( hero.id > 0 )
        JsTools.historyGoBack();
}
{% endhighlight %}

Inside the `HeroDetailComponent` html template file, we add the _Save_ button:

{% highlight html %}
<button (click)="save()">Save</button>
{% endhighlight %}

### Add/Delete in the HeroesComponent

We'll be reporting propagated HTTP errors, let's start by adding the following fields to the `HeroesComponent` class:

{% highlight java %}
public Object error;
public boolean addingHero;
{% endhighlight %}

The user can _add_ a new hero by clicking a button and entering a name.

When the user clicks the _Add New Hero_ button, we display the `HeroDetailComponent`. We aren't navigating to the component so it won't receive a hero `id`; as we noted above, that is the component's cue to create and present an empty hero.

Add the following to the heroes component HTML, just below the hero list (`<ul class="heroes">...</ul>`).

{% highlight html %}
{% raw %}
<div class="error" *ngIf="error">{{error}}</div>

<button (click)="addHero()">Add New Hero</button>

<div *ngIf="addingHero">
	<my-hero-detail (updated)="updated($event)"></my-hero-detail>
</div>
{% endraw %}
{% endhighlight %}

The first line will display an error message if there is any. The remaining HTML is for adding heroes.

The user can `delete` an existing hero by clicking a delete button next to the hero's name. Add the following to the heroes component HTML right after the hero name in the repeated `<li>` tag:

{% highlight html %}
<button class="delete" (click)="deleteHero(hero, $event)">x</button>
{% endhighlight %}

Add the following to the bottom of the `HeroesComponent` CSS file:

{% highlight css %}
button.delete {
	float: right;
	margin-top: 2px;
	margin-right: .8em;
	background-color: gray !important;
	color: white;
}
{% endhighlight %}


Now let's fix-up the `HeroesComponent` to support the _add_ and _delete_ actions used in the template. Let's start with _add_.

Implement the click handler for the _Add New Hero_ button.

{% highlight java %}
public void addHero()
{
    addingHero = true;
    selectedHero = null;
}
{% endhighlight %}

The `HeroDetailComponent` does most of the work. All we do is toggle an `*ngIf` flag that swaps it into the DOM when we add a hero and removes it from the DOM when the user is done.

When the `HeroDetailComponent` will have finished its work, it will emit an `updated` event which is catched in our template and delegates the appropriate action to the `updated` method:

{% highlight java %}
public void updated( Hero savedHero )
{
    addingHero = false;

    if( savedHero != null )
        getHeroes();
}
{% endhighlight %}

The delete logic is a bit trickier.

{% highlight java %}
public void deleteHero( Hero hero, Event event )
{
    event.stopPropagation();

    heroService.delete( hero.id ).then( res -> {
        heroes = heroes.filter( h -> h != hero );
        if( selectedHero == hero )
            selectedHero = null;
        return null;
    }, error -> this.error = error );
}
{% endhighlight %}

Of course we delegate the persistence of hero deletion to the `HeroService`. But the component is still responsible for updating the display. So the _delete_ method removes the deleted hero from the list.

### Implementing the service methods

The new _add_, _update_ and _delete_ methods need to be supported by our _REST_ service. Here is the new implementation in the `HeroesController` class:

{% highlight java %}
@RestController
@RequestMapping( "/app/" )
public class HeroesController
{
	private static final Map<Integer, Hero> HEROES = new HashMap<>();
	private static int nextId = 42;

	static
	{
		storeHero( new Hero( 11, "Mr. Nice" ) );
		storeHero( new Hero( 12, "Narco" ) );
		storeHero( new Hero( 13, "Bombasto" ) );
		storeHero( new Hero( 14, "Celeritas" ) );
		storeHero( new Hero( 15, "Magneta" ) );
		storeHero( new Hero( 16, "RubberMan" ) );
		storeHero( new Hero( 17, "Dynama" ) );
		storeHero( new Hero( 18, "Dr IQ" ) );
		storeHero( new Hero( 19, "Magma" ) );
		storeHero( new Hero( 20, "Tornado" ) );
	}

	private static void storeHero( Hero hero )
	{
		HEROES.put( hero.id, hero );
	}

	@RequestMapping( value = "/heroes", method = RequestMethod.GET )
	public Collection<Hero> getHeroes()
	{
		return HEROES.values();
	}

	@RequestMapping( value = "/heroes", method = RequestMethod.POST, produces = "application/json" )
	Hero addHero( @RequestBody Hero hero )
	{
		hero.id = nextId++;

		storeHero( hero );

		return hero;
	}

	@RequestMapping( value = "/heroes/{id}", method = RequestMethod.PUT, produces = "application/json" )
	Hero updateHero( @PathVariable( "id" ) int id, @RequestBody Hero hero )
	{
		assert hero.id == id;

		storeHero( hero );

		return hero;
	}

	@RequestMapping( value = "/heroes/{id}", method = RequestMethod.DELETE )
	Boolean deleteHero( @PathVariable( "id" ) int id )
	{
		return HEROES.remove( id ) != null;
	}
}
{% endhighlight %}

## Observables

Each `Http` method returns an `Observable` of HTTP `Response` objects.

Our `HeroService` converts that `Observable` into a `Promise` and returns the promise to the caller. In this section we learn to return the `Observable` directly and discuss when and why that might be a good thing to do.

### Background

An _observable_ is a stream of events that we can process with array-like operators.

Recall that our `HeroService` quickly chained the `toPromise` operator to the `Observable` result of `http.get`. That operator converted the `Observable` into a `Promise` and we passed that promise back to the caller.

Converting to a promise is often a good choice. We typically ask `http` to fetch a single chunk of data. When we receive the data, we're done. A single result in the form of a promise is easy for the calling component to consume and it helps that promises are widely understood by JavaScript programmers.

But requests aren't always "one and done". We may start one request, then cancel it, and make a different request before the server has responded to the first request. Such a _request-cancel-new-request_ sequence is difficult to implement with _Promises_. It's easy with _Observables_ as we'll see.

### Search-by-name

We're going to add a _hero search_ feature to the Tour of Heroes. As the user types a name into a search box, we'll make repeated HTTP requests for heroes filtered by that name.

We start by creating `HeroSearchService` that sends search queries to our server's web api.

{% highlight java %}
@Injectable
@JsType
public class HeroSearchService
{
	private Http http;

	public HeroSearchService( Http http )
	{
		this.http = http;
	}

	public Observable<JsArray<Hero>> search( String term )
	{
		return http.get( "app/heroes/?name=" + term )
				.map( response -> response.json() );
	}
}
{% endhighlight %}

The `http.get()` call in `HeroSearchService` is similar to the one in the `HeroService`, although the URL now has a query string. Another notable difference: we no longer call `toPromise`, we simply return the observable instead.

### HeroSearchComponent

Let's create a new `HeroSearchComponent` that calls this new `HeroSearchService`.

The component template is simple — just a text box and a list of matching search results.

{% highlight html %}
{% raw %}
<div id="search-component">
	<h4>Hero Search</h4>
	<input #searchBox id="search-box" (keyup)="search(searchBox.value)" />
	<div>
		<div *ngFor="let hero of heroes | async" (click)="gotoDetail(hero)"
			class="search-result">{{hero.name}}</div>
	</div>
</div>
{% endraw %}
{% endhighlight %}

We'll also want to add styles for the new component.

{% highlight css %}
.search-result {
	border-bottom: 1px solid gray;
	border-left: 1px solid gray;
	border-right: 1px solid gray;
	width: 195px;
	height: 20px;
	padding: 5px;
	background-color: white;
	cursor: pointer;
}

#search-box {
	width: 200px;
	height: 20px;
}
{% endhighlight %}

As the user types in the search box, a _keyup_ event binding calls the component's `search` method with the new search box value.

The `*ngFor` repeats _hero_ objects from the component's `heroes` property. No surprise there.

But, as we'll soon see, the `heroes` property is now an _Observable_ of hero arrays, rather than just a hero array. The `*ngFor` can't do anything with an `Observable` until we flow it through the async pipe (`AsyncPipe`). The async pipe subscribes to the `Observable` and produces the array of heroes to `*ngFor`.

Time to create the `HeroSearchComponent` class.

{% highlight java %}
@Component(
		selector = "hero-search",
		templateUrl = "hero-search.component.html",
		styleUrls = "hero-search.component.css",
		providers = HeroSearchService.class )
@JsType
public class HeroSearchComponent implements OnInit
{
	public Observable<JsArray<Hero>> heroes;

	private Subject<String> searchTerms = new Subject<>();
	private HeroSearchService heroSearchService;
	private Router router;

	public HeroSearchComponent( HeroSearchService heroSearchService, Router router )
	{
		this.heroSearchService = heroSearchService;
		this.router = router;
	}

	public void search( String term )
	{
		searchTerms.next( term );
	}

	@Override
	public void ngOnInit()
	{
		heroes = searchTerms
				.debounceTime( 300 )
				.distinctUntilChanged()
				.switchMap( ( term, index ) -> {
					if( term != null && !term.isEmpty() )
						return heroSearchService.search( term );
					else
						return Observable.of( JsArray.<Hero> empty() );
				} )
				.onError( reason -> {
					GWT.log( "error: " + reason );
					return Observable.of( JsArray.<Hero> empty() );
				} );
	}

	public void gotoDetail( Hero hero )
	{
		router.navigate( JsArray.of( "/detail", String.valueOf( hero.id ) ) );
	}
}
{% endhighlight %}

#### Search terms

Let's focus on the `searchTerms`:

{% highlight java %}
private Subject<String> searchTerms = new Subject<>();

public void search( String term )
{
    searchTerms.next( term );
}
{% endhighlight %}

A `Subject` is a producer of an _observable_ event stream; `searchTerms` produces an `Observable` of strings, the filter criteria for the name search.

Each call to `search` puts a new string into this subject's observable stream by calling `next`.


#### Initialize the **_heroes_** property (_**ngOnInit**_)

A `Subject` is also an `Observable`. We're going to turn the stream of search terms into a stream of `Hero` arrays and assign the result to the `heroes` property.

{% highlight java %}
public Observable<JsArray<Hero>> heroes;

@Override
public void ngOnInit()
{
    heroes = searchTerms
            .debounceTime( 300 )
            .distinctUntilChanged()
            .switchMap( ( term, index ) -> {
                if( term != null && !term.isEmpty() )
                    return heroSearchService.search( term );
                else
                    return Observable.of( JsArray.<Hero> empty() );
            } )
            .onError( reason -> {
                GWT.log( "error: " + reason );
                return Observable.of( JsArray.<Hero> empty() );
            } );
}
{% endhighlight %}

If we passed every user keystroke directly to the `HeroSearchService`, we'd unleash a storm of HTTP requests. Bad idea. We don't want to tax our server resources and burn through our cellular network data plan.

Fortunately, we can chain `Observable` operators to the string `Observable` that reduce the request flow. We'll make fewer calls to the `HeroSearchService` and still get timely results. Here's how:

- `debounceTime(300)` waits until the flow of new string events pauses for 300 milliseconds before passing along the latest string. We'll never make requests more frequently than 300ms.
- `distinctUntilChanged` ensures that we only send a request if the filter text changed. There's no point in repeating a request for the same search term.
- `switchMap` calls our search service for each search term that makes it through the `debounce` and `distinctUntilChanged` gauntlet. It cancels and discards previous search observables, returning only the latest search service observable.
- `catch` intercepts a failed observable. Our simple example prints the error to the console; a real life application should do better. Then we return an observable containing an empty array to clear the search result.

### Add the search component to the dashboard

We add the hero search HTML element to the bottom of the `DashboardComponent` template.

{% highlight html %}
{% raw %}
<h3>Top Heroes</h3>
<div class="grid grid-pad">
	<div *ngFor="let hero of heroes" (click)="gotoDetail(hero)"
		class="col-1-4">
		<div class="module hero">
			<h4>{{hero.name}}</h4>
		</div>
	</div>
</div>
<hero-search></hero-search>
{% endraw %}
{% endhighlight %}

And finally, we add the `HeroSearchComponent` to the declarations array of the `ApplicationModule` class:

{% highlight java %}
declarations = {
        ApplicationComponent.class,
        DashboardComponent.class,
        HeroesComponent.class,
        HeroDetailComponent.class,
        HeroSearchComponent.class
},
{% endhighlight %}

### Implementing the back-end search service

One thing left is to implement the backend search function. In the `HeroesController` class, we add this method:

{% highlight java %}
@RequestMapping(
        value = "/heroes",
        params = { "name" },
        method = RequestMethod.GET,
        produces = "application/json" )
List<Hero> getHeroes( @RequestParam String name )
{
    return HEROES.values().stream()
            .filter( hero -> hero.name.toLowerCase().contains( name.toLowerCase() ) )
            .collect( Collectors.toList() );
}
{% endhighlight %}

Run the app again, go to the _Dashboard_, and enter some text in the search box. You should get results just under the search box, if you click on one of them, you will be redirected to the _hero_'s detail.

## Home Stretch

We are at the end of our journey for now, but we have accomplished a lot.

- We added the necessary dependencies to use HTTP in our application.
- We refactored `HeroService` to load heroes from a web API.
- We extended `HeroService` to support post, put and delete methods.
- We updated our components to allow adding, editing and deleting of heroes.
- We learned how to use Observables.
