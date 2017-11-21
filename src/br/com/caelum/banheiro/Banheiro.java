package br.com.caelum.banheiro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

	private Lock lock = new ReentrantLock();

	private boolean estaSujo = true;

	public void fazendoNumeroUm() {
		
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {

			while (estaSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo coisa rapida");

			dormeUmPouco(5000);
			
			this.estaSujo = true;

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as maos");
			System.out.println(nome + " saindo do banheiro");

		}

	}

	private void dormeUmPouco(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + ", eca, banheiro esta sujo!");

		try {
			//guarded block
			this.wait(); // Segura a execução!!!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void limpandoBanheiro() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {

			System.out.println(nome + " entrando no banheiro");

			while (!estaSujo) {
				System.out.println(nome + ", nao esta sujo!");
				return;
			}

			System.out.println(nome + " limpando o banheiro");

			this.estaSujo = false;

			dormeUmPouco(10000);

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as maos");

			this.notifyAll();

			System.out.println(nome + " saindo do banheiro");
		}
	}

	public void fazendoNumeroDois() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {

			if (estaSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo coisa demorada");

			dormeUmPouco(10000);

			this.estaSujo = true;
			
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as maos");
			System.out.println(nome + " saindo do banheiro");
		}

	}

	// public void fazendoNumeroUm() {
	//
	// String nome = Thread.currentThread().getName();
	//
	// System.out.println(nome + " batendo na porta");
	//
	// lock.lock();
	//
	// System.out.println(nome + " entrando no banheiro");
	// System.out.println(nome + " fazendo coisa rapida");
	//
	// try {
	// Thread.sleep(5000);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println(nome + " dando descarga");
	// System.out.println(nome + " lavando as maos");
	// System.out.println(nome + " saindo do banheiro");
	//
	// lock.unlock();
	// }

}
