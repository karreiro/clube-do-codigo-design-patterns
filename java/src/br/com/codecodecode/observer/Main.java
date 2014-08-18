package br.com.codecodecode.observer;

public class Main {

	public static void main(String[] args) {
		Juiz juiz = new Juiz();
		Jogador jogador = new Jogador();

		juiz.addObserver(jogador);

		juiz.verificarPosicaoJogadores();
		juiz.apitar();
	}

}
