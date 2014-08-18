package br.com.codecodecode.decorator.ingredientes;

import br.com.codecodecode.decorator.Coquetel;
import br.com.codecodecode.decorator.CoquetelIncrementado;

public class CremeDeLeite extends CoquetelIncrementado {

	public CremeDeLeite(Coquetel coquetel) {
		super(coquetel, "Creme de leite", 3.0);
	}

}
