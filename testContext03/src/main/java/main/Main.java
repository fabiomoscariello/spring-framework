package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigApp;

public class Main 
{

	public static void main(String[] args) 
	{
		 var context =  new AnnotationConfigApplicationContext(ConfigApp.class);
		 
		 Clienti cliente = context.getBean(Clienti.class);
		 Bollini bollini = context.getBean(Bollini.class);
		 
		 System.out.println("Nome Cliente: " + cliente.getNome());
		 System.out.println("Bollini Cliente: " + bollini.getBollini());
		 
		 System.out.println(String.format("Il cliente %s ha %s", cliente.getNome(), cliente.getBollini()));
		 
		 context.close();
		 
		 
	}

}
