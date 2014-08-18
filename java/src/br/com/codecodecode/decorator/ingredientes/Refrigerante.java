package br.com.codecodecode.decorator.ingredientes;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.CoquetelIncrementado;

public class Refrigerante extends CoquetelIncrementado {

	public Refrigerante(Coquetel coquetel) {
		super(coquetel, "Refrigerante", 2.5);
	}

}
