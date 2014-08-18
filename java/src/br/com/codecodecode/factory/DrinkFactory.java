package br.com.codecodecode.factory;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.ingredientes.*;

public class DrinkFactory {

	public enum Drinks {
		HiFi, Moloko, Caipirinha;
	}

	public static Coquetel criarDrink(Drinks drink) {
		switch (drink) {
			case HiFi:
				return criarHiFi();
			case Moloko:
				return criarMoloko();
			case Caipirinha:
				return criarCaipirinha();
			default:
				return null;
		}
	}

	private static Coquetel criarHiFi() {
		Coquetel hiFi = new Coquetel("Hi-fi", 5.0);
		hiFi = new Vodka(hiFi);
		hiFi = new Leite(hiFi);
		hiFi = new SucoDeAbacaxi(hiFi);
		hiFi = new CremeDeLeite(hiFi);
		return hiFi;
	}

	private static Coquetel criarMoloko() {
		Coquetel moloko = new Coquetel("Moloko", 1.0);
		moloko = new Vodka(moloko);
		moloko = new Leite(moloko);
		moloko = new SucoDeAbacaxi(moloko);
		moloko = new CremeDeLeite(moloko);
		return moloko;
	}

	private static Coquetel criarCaipirinha() {
		Coquetel caipirinha = new Coquetel("Caipirinha", 3.0);
		caipirinha = new Vodka(caipirinha);
		caipirinha = new Gelo(caipirinha);
		caipirinha = new Limao(caipirinha);
		caipirinha = new Acucar(caipirinha);
		return caipirinha;
	}

}
