package br.com.caelum.lista2;

import java.util.List;

public class TarefaAdicionaElemento implements Runnable {

	private List<String> lista;
	private int numeroDoThread;

	public TarefaAdicionaElemento(List<String> lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			lista.add(numeroDoThread + " " + i);
			
		}
		
	}

}
