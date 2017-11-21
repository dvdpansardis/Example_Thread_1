package br.com.caelum.banco;

public class TarefaAcessaBanco implements Runnable {

	private GerenciadorDeTransacao tx;
	private PoolDeConexao pool;

	public TarefaAcessaBanco(GerenciadorDeTransacao tx, PoolDeConexao pool) {
		this.tx = tx;
		this.pool = pool;
	}

	@Override
	public void run() {

		synchronized(pool){
			System.out.println("peguei a chave do pool");
			pool.getConnection();
			
			synchronized(tx){
				System.out.println("começanco a gerenciar a tx");
				tx.begin();
			}
		}
		
	}

}
