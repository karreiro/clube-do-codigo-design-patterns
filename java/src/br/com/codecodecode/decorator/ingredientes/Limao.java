package br.com.codecodecode.decorator.ingredientes;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.CoquetelIncrementado;

public class Limao extends CoquetelIncrementado {

	public Limao(Coquetel coquetel) {
		super(coquetel, "Limao", 1.5);
	}

}
