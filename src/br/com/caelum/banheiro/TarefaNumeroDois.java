package br.com.caelum.banheiro;

public class TarefaNumeroDois implements Runnable {

	private Banheiro banheiro;
	
	public TarefaNumeroDois(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {

		banheiro.fazendoNumeroDois();

	}

}
