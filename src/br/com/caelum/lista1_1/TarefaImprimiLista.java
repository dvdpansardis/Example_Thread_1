package br.com.caelum.lista1_1;

public class TarefaImprimiLista implements Runnable {

	private Lista lista;

	public TarefaImprimiLista(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		// O synchronized � da lista pois estamos esperando ela soltar a mutex
		synchronized (lista) {

			indoDormir();
			
			//Valida��o para n�o ficar esperando uma notifica��o que n�o vira!
			if (!lista.estaCheia()) {
				try {
					System.out.println("indo dormir, aguardando notificacao");
					lista.wait(); // esperando a lista notificar
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int i = 0; i < lista.tamanho(); i++) {
				String elemento = lista.pegaElemento(i);
				System.out.println(i + " elemento " + elemento);
			}
		}

	}
	
	private void indoDormir() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
