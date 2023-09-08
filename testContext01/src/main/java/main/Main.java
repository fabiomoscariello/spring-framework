package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigApp;

public class Main 
{

	public static void main(String[] args) 
	{
		//Qui si va a creare lo Spring Context e vai a specificare la classe di configurazione dove si trovano i diversi bean.  
		var context =  new AnnotationConfigApplicationContext(ConfigApp.class);
		//Qui dici al context quale tipologia di bean deve andare a cercare.
		Clienti cliente = context.getBean(Clienti.class);
		System.out.println(cliente.getNome());
		
		//Qui aggiungi un indetificativo aggiungendo un nome.
		Clienti cliente2 = context.getBean("Cliente2", Clienti.class);
		System.out.println(cliente2.getNome());
		
		String saluti = context.getBean(String.class);
        System.out.println(saluti);
		//Qui chiudi il contesto
		context.close();
	}

}
