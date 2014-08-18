package br.com.codecodecode.decorator;

import br.com.codecodecode.decorator.ingredientes.CremeDeLeite;
import br.com.codecodecode.decorator.ingredientes.Leite;
import br.com.codecodecode.decorator.ingredientes.SucoDeAbacaxi;
import br.com.codecodecode.decorator.ingredientes.Vodka;

public class Main {

	public static void main(String[] args) {
		Coquetel moloko = new Coquetel("Moloko", 2.0);
		moloko = new Vodka(moloko);
		moloko = new Leite(moloko);
		moloko = new SucoDeAbacaxi(moloko);
		moloko = new CremeDeLeite(moloko);

		System.out.println(moloko.getNome());
		System.out.println(moloko.getPrecoInicial());
	}

}
