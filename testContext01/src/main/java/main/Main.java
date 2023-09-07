package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigApp;

public class Main 
{

	public static void main(String[] args) 
	{
		var context =  new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Clienti cliente = context.getBean(Clienti.class);
		System.out.println(cliente.getNome());
		
		Clienti cliente2 = context.getBean("Cliente2", Clienti.class);
		System.out.println(cliente2.getNome());
		
		String saluti = context.getBean(String.class);
        System.out.println(saluti);
		
		context.close();
	}

}
