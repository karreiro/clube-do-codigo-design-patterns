package br.com.codecodecode.strategy;

import br.com.codecodecode.strategy.promocoes.PromocaoDiaDosNamorados;

public class Main {

    public static void main(String[] args) {
		final Produto celular = new Produto("Celular", new PromocaoDiaDosNamorados());
		System.out.println("=> Descontos de " + celular.desconto() + "%!");
	}
}
