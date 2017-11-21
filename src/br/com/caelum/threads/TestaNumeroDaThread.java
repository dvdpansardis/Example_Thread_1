package br.com.caelum.threads;

public class TestaNumeroDaThread {

	public static void main(String[] args) {

		new Thread(new TarefaImprimeNumeros()).start();
		new Thread(new TarefaImprimeNumeros()).start();

	}

}
