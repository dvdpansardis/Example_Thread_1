package br.com.caelum.lista1_1;

public class TarefaAdicionaElemento implements Runnable {

	private Lista lista;
	private int numeroDoThread;

	public TarefaAdicionaElemento(Lista lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
		
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			
			lista.adicionaElemento(numeroDoThread + " " + i);
			
		}
		
	}

}
