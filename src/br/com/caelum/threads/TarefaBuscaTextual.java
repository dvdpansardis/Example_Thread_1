package br.com.caelum.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

	private String arquivo;
	private String nome;

	public TarefaBuscaTextual(String arquivo, String nome) {
		this.arquivo = arquivo;
		this.nome = nome;
	}

	@Override
	public void run() {
		
		try (Scanner scan = new Scanner(new File(arquivo))){
			
			int num = 1;
			
			while(scan.hasNextLine()){
				String line = scan.nextLine();
				
				if(line.toLowerCase().contains(nome.toLowerCase()))
					System.out.println(arquivo + " contem o nome " + nome + " na linha " + num + " linha " + line);
				
				num++;
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}
		

	}

}
