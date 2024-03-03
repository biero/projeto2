package br.cnj.projeto;

import java.time.LocalDate;

public class Processo {
	private Integer nr_processo;
	private Integer nr_processo_origem;
	private String ds_complemento;
	private LocalDate dt_inicio;
	private Integer id_jbpm;
	private LocalDate dt_fim;
	private Integer nr_duracao;
	private String nm_actor_id;
	private String ds_nm_usu_cadastro_processo;
	private Integer id_pk_tb_processo_pg;
	private Integer id_processo_pg;
	private Integer id_sessao_pg;
	private Integer nr_processo_temp;
	
	public Processo() {
	}

	public Integer getNr_processo() {
		return nr_processo;
	}

	public void setNr_processo(Integer nr_processo) {
		this.nr_processo = nr_processo;
	}

	public Integer getNr_processo_origem() {
		return nr_processo_origem;
	}

	public void setNr_processo_origem(Integer nr_processo_origem) {
		this.nr_processo_origem = nr_processo_origem;
	}

	public String getDs_complemento() {
		return ds_complemento;
	}

	public void setDs_complemento(String ds_complemento) {
		this.ds_complemento = ds_complemento;
	}

	public LocalDate getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(LocalDate dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public Integer getId_jbpm() {
		return id_jbpm;
	}

	public void setId_jbpm(Integer id_jbpm) {
		this.id_jbpm = id_jbpm;
	}

	public LocalDate getDt_fim() {
		return dt_fim;
	}

	public void setDt_fim(LocalDate dt_fim) {
		this.dt_fim = dt_fim;
	}

	public Integer getNr_duracao() {
		return nr_duracao;
	}

	public void setNr_duracao(Integer nr_duracao) {
		this.nr_duracao = nr_duracao;
	}

	public String getNm_actor_id() {
		return nm_actor_id;
	}

	public void setNm_actor_id(String nm_actor_id) {
		this.nm_actor_id = nm_actor_id;
	}

	public String getDs_nm_usu_cadastro_processo() {
		return ds_nm_usu_cadastro_processo;
	}

	public void setDs_nm_usu_cadastro_processo(String ds_nm_usu_cadastro_processo) {
		this.ds_nm_usu_cadastro_processo = ds_nm_usu_cadastro_processo;
	}

	public Integer getId_pk_tb_processo_pg() {
		return id_pk_tb_processo_pg;
	}

	public void setId_pk_tb_processo_pg(Integer id_pk_tb_processo_pg) {
		this.id_pk_tb_processo_pg = id_pk_tb_processo_pg;
	}

	public Integer getId_processo_pg() {
		return id_processo_pg;
	}

	public void setId_processo_pg(Integer id_processo_pg) {
		this.id_processo_pg = id_processo_pg;
	}

	public Integer getId_sessao_pg() {
		return id_sessao_pg;
	}

	public void setId_sessao_pg(Integer id_sessao_pg) {
		this.id_sessao_pg = id_sessao_pg;
	}

	public Integer getNr_processo_temp() {
		return nr_processo_temp;
	}

	public void setNr_processo_temp(Integer nr_processo_temp) {
		this.nr_processo_temp = nr_processo_temp;
	}
	
}
