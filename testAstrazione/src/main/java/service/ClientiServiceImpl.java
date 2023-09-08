package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Clienti;
import notification.NotificationProxy;
import repository.ClientiRepository;

@Service//Identifica che questa classe ha la responsabilità di servizio
public class ClientiServiceImpl  implements ClientiService 
{
	@Autowired
	ClientiRepository clientiRepository;
	
    @Autowired
    @Qualifier("SMS") //Qui sto dicendo a Spring che deve risolvere questa interfaccia con la classe di implementazione che ha quel qualifiers
    NotificationProxy notificationProxy;
    
    
	/*
	private final ClientiRepository clientiRepository;
    private final NotificationProxy notificationProxy;
    
    public ClientiServiceImpl(ClientiRepository clientiRepository,
    		@Qualifier("MAIL") NotificationProxy notificationProxy)
    {
        this.clientiRepository = clientiRepository;
        this.notificationProxy = notificationProxy;
    }
    */
    

	@Override
	public void saveAndNotify(Clienti cliente) 
	{
		clientiRepository.saveCliente(cliente);
    	notificationProxy.sendNotifica(cliente); 
	}

}
