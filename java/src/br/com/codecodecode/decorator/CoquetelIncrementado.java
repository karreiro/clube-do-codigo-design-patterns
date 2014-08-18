package br.com.codecodecode.decorator;

import br.com.codecodecode.decorator.Coquetel;

public class CoquetelIncrementado extends Coquetel {

	private Coquetel coquetel;
	private String nomeIncremento;
	private Double precoIncremento;

	public CoquetelIncrementado(Coquetel coquetel, String nomeIncremento, Double precoIncremento) {
		super(coquetel.getNome(), coquetel.getPrecoInicial());
		this.coquetel = coquetel;
		this.nomeIncremento = nomeIncremento;
		this.precoIncremento = precoIncremento;
	}

	@Override
	public String getNome() {
		return coquetel.getNome() + " + " + nomeIncremento;
	}

	@Override
	public Double getPrecoInicial() {
		return coquetel.getPrecoInicial() + precoIncremento;
	}
}
