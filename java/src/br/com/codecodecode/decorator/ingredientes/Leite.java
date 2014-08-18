package br.com.codecodecode.decorator.ingredientes;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.CoquetelIncrementado;

public class Leite extends CoquetelIncrementado {

	public Leite(Coquetel coquetel) {
		super(coquetel, "Leite", 1.0);
	}
}
