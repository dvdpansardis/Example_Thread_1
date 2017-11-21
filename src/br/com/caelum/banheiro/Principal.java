package br.com.caelum.banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumeroUm(banheiro), "Joao");
		Thread convidado2 = new Thread(new TarefaNumeroDois(banheiro), "Pedro");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");
		
		//São provedores de serviços para outras threads.
		//Um exemplo de uma thread daemon é o coletor de lixo da JVM (Garbage Collector)
		limpeza.setDaemon(true); //Roda em back somente se existir threads principais.
		//Prioridade padrao eh a 5
		limpeza.setPriority(Thread.MAX_PRIORITY); //Tendo  esta prioridade setada o escalonador tende a executar ela primeiro.
		
		convidado1.start();
		convidado2.start();
		limpeza.start();
		
	}

	

}
