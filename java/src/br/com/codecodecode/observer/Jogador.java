package br.com.codecodecode.observer;

import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		String argument = (String) arg1;
		if (argument.equalsIgnoreCase("apitou!")) {
			this.chutar();
		}
	}

	public void chutar(){
		System.out.println("Jogador chutou a bola!!!");
	}

}
