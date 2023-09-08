package config;

 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import main.Bollini;
import main.Clienti;


@Configuration
public class ConfigApp 
{
	@Bean
    public Bollini bollini() 
	{
		Bollini p = new Bollini();
	    p.setBollini(1500);
	    
	    return p;
    }
	
	@Bean
	Clienti cliente(Bollini bollini) //Si potrebbe utilizzare anche bollini() nel set e togliere il parametro di ingresso
	{
		Clienti cliente = new Clienti();
		cliente.setNome("Nicola La Rocca");
		cliente.setBollini(bollini);
		
		return cliente;
	}
	
	
}
