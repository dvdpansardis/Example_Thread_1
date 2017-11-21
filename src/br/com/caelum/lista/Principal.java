package br.com.caelum.lista;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		
		Lista lista = new Lista();
		
		for (int i = 0; i < 10; i++) {
			
			new Thread(new TarefaAdicionaElemento(lista, i)).start();
			
		}
		
		Thread.sleep(3000);
		
		for (int i = 0; i < lista.tamanho(); i++) {
			String elemento = lista.pegaElemento(i);
			System.out.println(elemento);
		}
	}

}
