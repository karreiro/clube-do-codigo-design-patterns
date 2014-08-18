package br.com.codecodecode.strategy.promocoes;

public class PromocaoDeNatal implements Promocao {

	@Override
	public Integer desconto() {
		return 10;
	}

}
