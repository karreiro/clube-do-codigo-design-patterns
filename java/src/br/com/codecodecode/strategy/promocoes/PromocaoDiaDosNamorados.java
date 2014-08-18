package br.com.codecodecode.strategy.promocoes;

public class PromocaoDiaDosNamorados implements Promocao {

	@Override
	public Integer desconto() {
		return 15;
	}

}
