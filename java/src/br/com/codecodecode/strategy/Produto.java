package br.com.codecodecode.strategy;

import br.com.codecodecode.strategy.promocoes.Promocao;

public class Produto {

	private String nome;
	private Promocao promocao;

	public Produto(String nome, Promocao promocao) {
		this.promocao = promocao;
		this.nome = nome;
	}

	public Integer desconto() {
		return promocao.desconto();
	}

}
