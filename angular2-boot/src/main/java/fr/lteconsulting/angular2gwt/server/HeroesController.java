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
	private static List<Hero> heroes = Arrays.asList( new Hero( 1, "Injector", "Do nothing", null ), new Hero( 2, "Windstorm", "Do nothing", null ), new Hero( 3, "Bombasto", "Do nothing", null ), new Hero( 4, "Magneta", "Do nothing", null ),
			new Hero( 5, "Tornado", "Do nothing", null ) );

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