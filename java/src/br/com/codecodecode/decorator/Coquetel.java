package br.com.codecodecode.decorator;

public class Coquetel {

	private String nome;
	private Double precoInicial;

	public Coquetel(String nome, Double precoInicial) {
		this.nome = nome;
		this.precoInicial = precoInicial;
	}

	public String getNome() {
		return nome;
	}

	public Double getPrecoInicial() {
		return precoInicial;
	}

}
