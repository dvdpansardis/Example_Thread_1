package br.com.caelum.banheiro;

public class TarefaNumeroUm implements Runnable {

	private Banheiro banheiro;
	
	public TarefaNumeroUm(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {

		banheiro.fazendoNumeroUm();

	}

}
