package br.com.codecodecode.strategy.promocoes;

public class PromocaoQueimaDeEstoque implements Promocao {

	@Override
	public Integer desconto() {
		return 20;
	}

}
