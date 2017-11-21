package br.com.caelum.banco;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private GerenciadorDeTransacao tx;
	private PoolDeConexao pool;

	public TarefaAcessaBancoProcedimento(GerenciadorDeTransacao tx, PoolDeConexao pool) {
		this.tx = tx;
		this.pool = pool;
	}

	@Override
	public void run() {

		//DeadLock
		synchronized (tx) {
			System.out.println("começanco a gerenciar a tx");
			tx.begin();

			synchronized (pool) {
				System.out.println("peguei a chave do pool");
				pool.getConnection();

			}
		}

	}
}
