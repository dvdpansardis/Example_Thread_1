package br.com.caelum.threads;

public class BuscaNomeNoArquivo {

	public static void main(String[] args) {
		
		String nome = "dav";
		
		Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
		Thread threadAssinaturas3 = new Thread(new TarefaBuscaTextual("autores.txt", nome));

		threadAssinaturas1.start();
		threadAssinaturas2.start();
		threadAssinaturas3.start();
		
	}

}
