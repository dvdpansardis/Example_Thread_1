package br.com.caelum.lista;

public class Lista {

	private String[] elementos = new String[100];
	
	private int indice = 0;
	
	
	public synchronized void adicionaElemento(String elemento){
		this.elementos[this.indice] = elemento;
		this.indice++;
	}
	
	public int tamanho(){
		return this.indice;
	}
	
	public String pegaElemento(int indice){
		return elementos[indice];
	}
	
}
