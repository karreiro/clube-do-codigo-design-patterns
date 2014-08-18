package br.com.codecodecode.decorator.ingredientes;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.CoquetelIncrementado;

public class Acucar extends CoquetelIncrementado {

	public Acucar(Coquetel coquetel) {
		super(coquetel, "Acucar", 1.0);
	}

}
