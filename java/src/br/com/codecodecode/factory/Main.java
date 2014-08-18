package br.com.codecodecode.factory;

import br.com.codecodecode.decorator.Coquetel;

public class Main {

	public static void main(String[] args) {
		Coquetel moloko = DrinkFactory.criarDrink(DrinkFactory.Drinks.Moloko);
		System.out.println(moloko.getNome());

		Coquetel hiFi = DrinkFactory.criarDrink(DrinkFactory.Drinks.HiFi);
		System.out.println(hiFi.getNome());

		Coquetel caipirinha = DrinkFactory.criarDrink(DrinkFactory.Drinks.Caipirinha);
		System.out.println(caipirinha.getNome());
	}

}
