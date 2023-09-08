package notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import model.Clienti;

@Component
//@Primary
@Qualifier("SMS") //Identificatore della classe
public class SMSNotificationProxy implements NotificationProxy   
{

	@Override
	public void sendNotifica(Clienti cliente) 
	{
		System.out.println("Invio Notifica via SMS al cliente: " + cliente.getNome());
		
	}

}
