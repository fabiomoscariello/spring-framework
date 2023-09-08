package repository;


import org.springframework.stereotype.Repository;

import model.Clienti;

@Repository
public class ClientiRepositoryImpl implements ClientiRepository
{

	@Override
	public void saveCliente(Clienti cliente) 
	{
		System.out.println("Inserimento Cliente: " + cliente.getNome());
		
	}

	

}
