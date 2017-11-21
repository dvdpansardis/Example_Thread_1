package br.com.caelum.threads;

public class TestaFuncaoAnonima {

	public static void main(String[] args) {
		new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("teste funcao anonima");
				
			}
			
		}).start();
		
		System.out.println("passou pela thread");
	}
	
}
