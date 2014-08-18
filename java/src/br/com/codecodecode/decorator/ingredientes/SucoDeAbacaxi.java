package br.com.codecodecode.decorator.ingredientes;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.CoquetelIncrementado;

public class SucoDeAbacaxi extends CoquetelIncrementado {

	public SucoDeAbacaxi(Coquetel coquetel) {
		super(coquetel, "Suco de abacaxi", 1.5);
	}

}
