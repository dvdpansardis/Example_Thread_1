package br.com.caelum.lista1_1;

public class Lista {

	private String[] elementos = new String[1000];
	
	private int indice = 0;
	
	
	public synchronized void adicionaElemento(String elemento){
		this.elementos[this.indice] = elemento;
		this.indice++;

//		indoDormir();
		
		if(estaCheia()) {
			System.out.println("Lista ta cheia, notificando!");
			this.notify();
		}
	}

	private void indoDormir() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int tamanho(){
		return this.indice;
	}
	
	public String pegaElemento(int indice){
		return elementos[indice];
	}

	public boolean estaCheia() {
		return indice == elementos.length;
	}
	
}
