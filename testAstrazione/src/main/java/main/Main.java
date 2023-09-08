package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigApp;
import model.Clienti;
import service.ClientiService;

public class Main 
{
	public static void main(String[] args) 
	{
		var context = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		var cliente = new Clienti();
        cliente.setNome("Nicola");
        cliente.setBollini(1350);
        
        var clientiService = context.getBean(ClientiService.class);
        clientiService.saveAndNotify(cliente);
        
        context.close();
		
	}
}
