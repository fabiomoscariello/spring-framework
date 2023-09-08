package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import main.Clienti;

@Configuration //Classe di configurazione del nostro Spring
public class ConfigApp 
{
	//Passandoci il name vai a nominare il bean.
	@Bean(name = "Cliente1")
	@Primary //A parità di bean si prende quello che ha questa annotazione.
	Clienti cliente1() 
	{
		Clienti cliente = new Clienti();
		cliente.setNome("Nicola La Rocca");
		
		return cliente;
	}
	
	@Bean(name = "Cliente2")
	Clienti cliente2() 
	{
		Clienti cliente = new Clienti();
		cliente.setNome("Marco");
		
		return cliente;
	}
	
	@Bean //Si può creare un bean di qualsiasi tipo.
    String saluti()
    {
        return "Saluti da Spring Context";
    }
	
	
}
