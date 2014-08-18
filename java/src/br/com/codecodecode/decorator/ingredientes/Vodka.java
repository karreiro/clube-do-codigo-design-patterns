package br.com.codecodecode.decorator.ingredientes;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.CoquetelIncrementado;

public class Vodka extends CoquetelIncrementado {

	public Vodka(Coquetel coquetel) {
		super(coquetel, "Vodka", 2.0);
	}

}
