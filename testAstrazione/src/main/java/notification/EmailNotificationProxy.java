package notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import model.Clienti;

@Component
@Qualifier("MAIL")
public class EmailNotificationProxy implements NotificationProxy
{

	@Override
	public void sendNotifica(Clienti cliente) 
	{
		System.out.println("Invio Notifica via mail al cliente: " + cliente.getNome());
	}

}
