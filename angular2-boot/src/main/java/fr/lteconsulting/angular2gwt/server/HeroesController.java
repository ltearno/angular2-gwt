package fr.lteconsulting.angular2gwt.server;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.lteconsulting.angular2gwt.client.Hero;

@Controller
@EnableAutoConfiguration
public class HeroesController
{
	private static List<Hero> heroes = Arrays.asList( new Hero( "Injector", "Do nothing", null ), new Hero( "Windstorm", "Do nothing", null ), new Hero( "Bombasto", "Do nothing", null ), new Hero( "Magneta", "Do nothing", null ), new Hero( "Tornado", "Do nothing", null ) );

	@RequestMapping( "/heroes" )
	@ResponseBody
	List<Hero> heroes()
	{
		return heroes;
	}

	public static void main( String[] args ) throws Exception
	{
		SpringApplication.run( HeroesController.class, args );
	}
}