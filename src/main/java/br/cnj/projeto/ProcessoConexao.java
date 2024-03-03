package br.cnj.projeto;

import java.time.LocalDate;

public class ProcessoConexao {
	private LocalDate dt_processo_conexao;
	
	public ProcessoConexao() {
		this.dt_processo_conexao = LocalDate.now();
	}
}
