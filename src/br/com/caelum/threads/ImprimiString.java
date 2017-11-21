package br.com.caelum.threads;

public class ImprimiString implements Runnable {

	private String msg;
	
	public ImprimiString(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		
		System.out.println(msg);
		
	}

}
