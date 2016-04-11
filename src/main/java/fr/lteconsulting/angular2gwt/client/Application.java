package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.client.EntryPoint;

import fr.lteconsulting.hexa.gwt.Document;
import fr.lteconsulting.hexa.gwt.HTMLElement;
import fr.lteconsulting.hexa.gwt.JSON;
import fr.lteconsulting.hexa.gwt.JsObject;
import fr.lteconsulting.hexa.gwt.JsTypedObject;
import fr.lteconsulting.hexa.gwt.Window;
import fr.lteconsulting.hexa.gwt.tardigrade.Tardigrade;
import fr.lteconsulting.hexa.gwt.tardigrade.TardigradeEngine;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

public class Application implements EntryPoint
{
	// object literal
	@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Object" )
	public static class MonDto
	{
		public String ex;
	}

	private static native Object getTemplateObject()
	/*-{
		return {
			e : [ "content", 0, [ "" ], "div", {
				"class" : "Popup"
			}, [] ]
		};
	}-*/;

	private static native Object getBaseCardDec()
	/*-{
		return {
			e : [ null, 0, [ "" ], "div", {
				"class" : "project-card mdl-card mdl-shadow--2dp"
			}, [ {
				e : [ "title", 0, [ "" ], "div", {
					"class" : "mdl-card__title mdl-card--expand"
				}, [] ]
			}, {
				e : [ "content", 0, [ "" ], "div", {
					"class" : "mdl-card__supporting-text"
				}, [] ]
			}, {
				e : [ "details", 0, [ "" ], "div", {
					"class" : "mdl-card__supporting-text",
					"style" : "display:none;"
				}, [] ]
			}, {
				e : [ "actions", 0, [ "" ], "div", {
					"class" : "mdl-card__actions mdl-card--border"
				}, [] ]
			}, {
				e : [ "menu", 0, [ "" ], "div", {
					"class" : "mdl-card__menu"
				}, [] ]
			} ] ]
		}
	}-*/;

	private static native Object getSearchPanelDesc()
	/*-{
		return {
			e : [
					null,
					0,
					[ "" ],
					"div",
					{},
					[
							{
								e : [
										null,
										0,
										[ "" ],
										"div",
										{
											"class" : "mdl-textfield mdl-js-textfield mdl-textfield--floating-label"
										},
										[
												{
													e : [
															"input",
															0,
															[ "" ],
															"input",
															{
																"class" : "mdl-textfield__input",
																"type" : "text",
																"id" : "searchBox"
															}, [] ]
												},
												{
													e : [
															null,
															0,
															[ "" ],
															"label",
															{
																"class" : "mdl-textfield__label",
																"for" : "searchBox"
															},
															[ "Project search..." ] ]
												} ] ]
							}, {
								e : [ null, 0, [ "" ], "div", {
									"class" : "mdl-button mdl-button--icon"
								}, [ {
									e : [ null, 0, [ "" ], "i", {
										"class" : "material-icons"
									}, [ "search" ] ]
								} ] ]
							} ] ]
		};
	}-*/;

	private static native void initMaterialElement( HTMLElement e )
	/*-{
		if (e == null)
			return;

		var upgrade = false;
		for (var i = 0; i < e.classList.length; i++)
			if (e.classList[i].indexOf("mdl-") >= 0) {
				upgrade = true;
				break;
			}

		if (upgrade)
			$wnd.componentHandler.upgradeElement(e);

		for ( var c in e.children) {
			if (e.children[c] instanceof $wnd.HTMLElement)
				@fr.lteconsulting.angular2gwt.client.Application::initMaterialElement(*)(e.children[c]);
		}
	}-*/;

	@Override
	public void onModuleLoad()
	{
		Tardigrade tardigrade = Tardigrade.get();
		TardigradeEngine engine = tardigrade.tardigradeEngine();

		engine.addTemplate( "Test", getTemplateObject() );
		engine.addTemplate( "BaseCard", getBaseCardDec() );
		engine.addTemplate( "SearchPanel", getSearchPanelDesc() );

		String html = engine.buildHtml( "Test", new JsObject().set( "content", "Roule ma poule" ) );
		html = engine.buildHtml( "BaseCard", new JsObject().set( "title", "Titre e" ).set( "content", "Je suis le contenu..." ) );
		html = engine.buildHtml( "SearchPanel", new JsObject() );

		Window.get().alert( "html: " + html );
		Window.get().alert( "dom: " + tardigrade.createElement( html ) );

		MonDto jj = JSON.parse( "{\"ex\":\"toto\"}" );
		jj = new MonDto();
		jj.ex = "salut popto";
		Object jso = new JsTypedObject<String, Integer>().set( "close", 3 ).set( "open", 5 );
		// Window.get().alert( JSON.stringify( jso ) );
		// Window.get().alert( "hello1 : " + jj + " kjhgkfjhgfkjhg\r\n\r\n" + jj.ex );
		String jjs = JSON.stringify( jj );
		// Window.get().alert( "hello : " + jjs );
		// Document.get().getElementsByTagName( "body" ).item( 0 ).setInnerHTML( "<b>CA MARCHE ...</b>" );
		// Document.get().getElementsByTagName( "body" ).item( 0 ).innerHTML( "kjhgkjhgkjhg" ).className( "betta" );

		HTMLElement ne = tardigrade.createElement( html );
		Document.get().getElementsByTagName( "body" ).item( 0 ).appendChild( ne );

		initMaterialElement( ne );

		// Window.get().alert( "jhljkhl" + Document.get().getElementsByTagName( "body" ).item( 0 ));

		// initMaterialElement( Document.get().getElementsByTagName( "body" ).item( 0 ) );
	}
}