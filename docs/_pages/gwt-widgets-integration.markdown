---
layout: page
title: GWT Widgets integration
permalink: /gwt-widgets-integration/
---

# GWT Widgets integration

There are two ways envisaging integrating a legacy GWT widgets with Angular 2 components. One consist in reusing legacy widgets into a new Angular2Boot application. The other is to integrate Angular 2 components inside an existing Widget based GWT application. Both ways are possible with Angular2Boot, and this document helps you to realize each of them.

* TOC
{:toc}

# Angular 2 components inside a Widget based GWT application

You may want to benefit from the functionalities brought by Angular2Boot in your legacy GWT application, after all double data binding is not so bad ;) !

An sample project demonstrating this possibility is available at this address: [https://github.com/ltearno/angular2boot-demos/tree/master/widgets-integration-wayback](https://github.com/ltearno/angular2boot-demos/tree/master/widgets-integration-wayback).

In this case you have a few steps to follow:

## Import Angular2Boot integration artifact

Import the Maven artifact containing all the integration stuff:

{% highlight xml %}
<dependency>
  <groupId>fr.lteconsulting</groupId>
  <artifactId>angular2-gwt-integration</artifactId>
  <version>1.6</version>
  <scope>provided</scope>
</dependency>
{% endhighlight %}

## Provide an Angular module

Write an Angular Module class with your components and imports. The bootstrap component should be set to `AngularIntegrationShellComponent`, which is provided by `angular2-gwt.integration`.

## Initialize the integration layer

Before you need to integrate Angular 2 components in your application, you must make this call (this could be in you application `EntryPoint` method):

{% highlight java %}
AngularIntegration.get().init( ApplicationModule_AngularModule.getNgModulePrototype(), false );
{% endhighlight %}

## Create Angular 2 components and insert them

When you want to create an Angular 2 component (using external Javascript components should work but has not been tested), make this call:

{% highlight java %}
// The ProductsComponent_AngularComponent class is generated by Angular2Boot because of 
// the `@Component` annotation on the `ProductsComponent` class.
AngularComponentContainerWidget<ProductsComponent> containerWidget = 
  AngularIntegration.get().createAngularComponent( 
    ProductsComponent_AngularComponent.getComponentPrototype() );
{% endhighlight %}

The returned object is a GWT widget that can be inserted anywhere in the normal widget tree. The sample application inserts it inside a regular `DisclosurePanel`.

Instances of the `AngularComponentContainerWidget<T>` class provide some useful methods:

{% highlight java %}
// retreive the injected Angular 2 component
ProductsComponent component = containerWidget.getComponentInstance();

// get the Angular 2 ComponentRef object for the component
ComponentRef ref = containerWidget.getComponentRef();

// trigger detection change on this component
containerWidget.detectChanges();
{% endhighlight %}

# Widgets inside an Angular2Boot application

You may want to integrate legacy GWT widgets in your new Angular application. Maybe because you are in the process of migrating all your widgets and you have not yet completely finished, or you have a legacy widget with a big business value and you don't want to reimplement it, or any reason...

It is possible to integrate widgets in a Angular2Boot project.

**NOTE** The following tutorial's code can be found on github at this address [github.com/ltearno/widgets-integration](https://github.com/ltearno/widgets-integration).

## Prerequisites

**NOTE** You must use at least the `1.6` version of `angular2gwt` and `angular2gwt-integration` libraries in your project. If you don't, you won't get the `WidgetAdapterPanel` class needed to integrate with legacy widgets.

## Scenario

Suppose you have a list of a certain DTO (`Product` in this example). You want to display a master/detail UI allowing the user to edit each `Product` of the list. Let's say also that you want the list to be implemented with a normal Angular component (with data binding and so on), and you want to reuse the _Product_ edition form which you have already developped with previous versions of GWT (`Widget`).

The application will have its root `ApplicationComponent` component and two more : `ProductsComponent` to display the list and `ProductComponent` to edit the selected product (which is using the legacy GWT widget). The legacy widget that we import is called `ProductForm`, it implements the `setProduct` and `getProduct` methods.

## `ProductForm`

The legacy widget. In this example it is very simple but you can imagine almost whatever widget your want.

{% highlight java %}
public class ProductForm extends Composite
{
  private TextBox nameTextBox = new TextBox();
  private TextBox colorTextBox = new TextBox();

  public ProductForm()
  {
    FlexTable table = new FlexTable();

    table.setText( 0, 0, "Name" );
    table.setWidget( 0, 1, nameTextBox );

    table.setText( 1, 0, "Color" );
    table.setWidget( 1, 1, colorTextBox );

    initWidget( table );
  }

  public void setProduct( Product product )
  {
    if( product != null )
    {
      nameTextBox.setValue( product.name );
      colorTextBox.setValue( product.color );
    }
    else
    {
      nameTextBox.setValue( "-" );
      colorTextBox.setValue( "black" );
    }
  }

  public void getProduct( Product product )
  {
    product.name = nameTextBox.getValue();
    product.color = colorTextBox.getValue();
  }
}
{% endhighlight %}

## `ApplicationComponent`

Here is the bootstrap component of our application:

{% highlight java %}
@Component(
    selector = "my-app",
    template = "<h1>Angular 2 and GWT Widgets integration</h1>"
        + "GWT Widgets are inserted into Angular 2 components.<br/>"
        + "The 'List of products' view is a normal Angular 2 component, "
        + "and the detailed view is implemented with legacy GWT widgets.<br/>"
        + "After having selected a product, when you click on the button, "
        + "the 'Product' object (shared between "
        + "javascript and java) is updated and the Angular change detection"
        + "algorithm updates portions of the UI which use this value (like the "
        + "name of the product in the list for instance).<br/><br/>"

        + "<products></products>" )
@JsType
public class ApplicationComponent
{
}
{% endhighlight %}

The `<products></products>` element triggers the `ProductsComponent` which we'll see just now.

## `ProductsComponent`

{% highlight java %}
{% raw %}
@Component(
    selector = "products",
    template = "<div>"
        + "<h2>List of products</h2>"
        + "Click on one of the products to select and edit it:"
        + "<ul>"
        + "<li *ngFor='let product of products'"
        + " (click)='select(product)'"
        + " [class.selected]='product===selectedProduct'>"
        + "{{product.name}} (id:{{product.id}})"
        + " <div style='display:inline-block;width:20px;height:20px;'"
        + "  [style.backgroundColor]='product.color'></div>"
        + "</li>"
        + "</ul>"
        + "<product *ngIf='selectedProduct' [product]='selectedProduct'></product>",
    styles = ".selected {"
        + "background-color: #CFD8DC !important;"
        + "color: white;"
        + "}" )
@JsType
public class ProductsComponent
{
  public JsArray<Product> products = JsArray.of(
      new Product( 1, "Table", "red" ),
      new Product( 2, "Chair", "blue" ),
      new Product( 3, "Arm", "green" ),
      new Product( 4, "Wood", "yellow" ),
      new Product( 5, "Light", "brown" ),
      new Product( 6, "Food", "black" ),
      new Product( 7, "Box", "orange" ) );

  public Product selectedProduct = null;

  public void select( Product product )
  {
    selectedProduct = product;
  }
}
{% endraw %}
{% endhighlight %}

There is nothing special in this component. The `products` array is used in the template to populate `<li>` elements (one for each product). When a `<li>` is clicked, the `select()` method is called, which updates the `selectedProduct` attribute.

This attribute is tracked in the template. Look at the following line :

{% highlight html %}
<product *ngIf='selectedProduct' [product]='selectedProduct'></product>
{% endhighlight %}

When the `selectedProduct` attribute is valid, a `<product>` element is added which is selected by the `ProductComponent` class that we'll examine just after. This component is given the selected product in his input with the part: `[product]='selectedProduct'`.

## `ProductComponent`

This is the component that integrates with GWT widgets. Here is the implementation:

{% highlight java %}
{% raw %}
@Component(
    selector = "product",
    template = "<h2 *ngIf='product'>{{product.name | uppercase}}'s details:</h2>"
        + "<div #panel></div>" )
@JsType
public class ProductComponent implements AfterViewInit, OnDestroy
{
  @ViewChild( selector = "panel" )
  @JsProperty
  private ElementRef panelElement;

  private Product product = null;

  private WidgetAdapterPanel adapterPanel = null;
  private ProductForm form = new ProductForm();
  private Button updateButton = new Button( "Update name" );

  @Override
  public void ngAfterViewInit()
  {
    updateButton.addClickHandler( event -> form.getProduct( product ) );

    VerticalPanel vp = new VerticalPanel();
    vp.add( form );
    vp.add( updateButton );

    adapterPanel = new WidgetAdapterPanel( panelElement );
    adapterPanel.setWidget( vp );
  }

  @Input
  public void setProduct( Product product )
  {
    this.product = product;

    if( form != null )
      form.setProduct( product );
  }

  public Product getProduct()
  {
    return product;
  }

  @Override
  public void ngOnDestroy()
  {
    adapterPanel.remove();
    adapterPanel = null;
  }
}
{% endraw %}
{% endhighlight %}

- Get the DOM element of our insertion point in the component's template,
- Create a `WidgetAdapterPanel` widget that _wraps_ around the DOM element,
- Insert your legacy UI in the `WidgetAdapterPanel`,
- Take care of memory leaks by cleaning up when the component is destroyed.

### Get the DOM element from the component's template

In the template we use the named reference `#panel` to name the insertion point.

{% highlight html %}
<div #panel></div>
{% endhighlight %}

We then get the corresponding DOM element by inserting an `ElementRef` attribute with a `@ViewChild` annotation.

{% highlight java %}
@ViewChild( selector = "panel" )
@JsProperty
private ElementRef panelElement;
{% endhighlight %}

The `@ViewChild` annotation indicates to Angular that we want it to inject the DOM element into our component. `@JsProperty` is used because the attribute is accessed by the javascript world and we didn't let the attribute be `public`.

During the component creation lifecycle, after the template for the component is created, the `ElementRef panelElement` attribute is injected by Angular with the correct DOM element. Angular then calls the `ngAfterViewInit` method of our component to let us take the appropriate actions.

### Create a `WidgetAdapterPanel` widget that _wraps_ around the DOM element

In the `ngAfterViewInit` method we first create our UI and then comes the most important action:

{% highlight java %}
adapterPanel = new WidgetAdapterPanel( panelElement );
adapterPanel.setWidget( vp );
{% endhighlight %}

A `WidgetAdapterPanel` widget is created. This widgets serves as a bridge between Angular and legacy _Widgets_. Its constructor takes an `ElementRef` as the only parameter and use it to insert Widgets inside.

We give the `panelElement` `ElementRef` to the constructor so that GWT widgets are inserted in the appropriate div.

### Insert your legacy UI in the `WidgetAdapterPanel`

And we then insert our GWT UI (the `vp` widget) in the _adapter panel_.

Our UI contains an instance of the `ProductForm` class which is the legacy widget that we want to integrate to the application.

### Integrating with Angular data binding

The component is of no use if it cannot be used by other components. We create an `@Input` property to receive the `Person` our component should display and edit.

Since we need to take action when the input is intercepted (we will update the Person form widget), we will use a property getter and setter pair:

{% highlight java %}
private Product product = null;

@Input
public void setProduct( Product product )
{
  this.product = product;

  if( form != null )
    form.setProduct( product );
}

public Product getProduct()
{
  return product;
}
{% endhighlight %}

The `@Input` annotation tells Angular that we want our `setProduct` method to be called when the component's input "product" changes. The `setProduct` method is called with the new value of the input.

We will take this opportunity to update the GWT widget `form` with the updated data.

The `getProduct` method is automatically used by Angular to retreive the value of our `product` property, so we return the value of our internal `product` field.

### Taking care of memory leaks

In order to clean up correctly our component when it is destroyed, we need to add the following method to our component:

{% highlight java %}
@Override
public void ngOnDestroy()
{
  adapterPanel.remove();
  adapterPanel = null;
}
{% endhighlight %}

# Conclusion

We saw a way to integrate legacy GWT widgets inside an Angular 2 application !