package main;

import org.springframework.stereotype.Component;

@Component //Identifica un componente dell'infrastruttura.
public class Clienti 
{
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
