package br.com.caelum.threads;

public class TestaThread1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("isso é a thread main!");
		
		Thread.sleep(1000 * 45);
		
		System.out.println("terminou!");
	}

}
