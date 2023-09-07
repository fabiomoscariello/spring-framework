package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import main.Clienti;

@Configuration
public class ConfigApp 
{
	@Bean(name = "Cliente1")
	@Primary
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
	
	@Bean
    String saluti()
    {
        return "Saluti da Spring Context";
    }
	
	
}
