package br.com.caelum.lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		//List<String> lista = new ArrayList<>();
		//List<String> lista = Collections.synchronizedList(new ArrayList<String>());
		List<String> lista = new Vector<String>();
		
		for (int i = 0; i < 10; i++) {
			
			new Thread(new TarefaAdicionaElemento(lista, i)).start();
			
		}
		
		Thread.sleep(3000);
		
		for (int i = 0; i < lista.size(); i++) {
			String elemento = lista.get(i);
			System.out.println(elemento);
		}
	}

}
