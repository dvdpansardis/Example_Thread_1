package br.com.caelum.threads;

public class TestaImprimiString {

	public static void main(String[] args) {

		Runnable rn = new ImprimiString("hello world");
		
		Thread trd = new Thread(rn, "Teste imprimi string");
		
		trd.start();

	}

}
