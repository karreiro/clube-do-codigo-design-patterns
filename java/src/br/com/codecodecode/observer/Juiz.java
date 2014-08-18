package br.com.codecodecode.observer;

import java.util.Observable;

public class Juiz extends Observable {

	public void verificarPosicaoJogadores() {
		System.out.println("Juiz verifica posicao de jogadores..");
	}

	public void apitar() {
		System.out.println("Juiz apitou!");
		setChanged();
		notifyObservers("apitou!");
	}

}
