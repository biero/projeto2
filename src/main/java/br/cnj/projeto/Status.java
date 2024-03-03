package br.cnj.projeto;

public class Status {
	private Integer id_status;
	private String ds_status;
	private Integer in_ativo;
	
	public Status() {
	}

	public Integer getId_status() {
		return id_status;
	}

	public void setId_status(Integer id_status) {
		this.id_status = id_status;
	}

	public String getDs_status() {
		return ds_status;
	}

	public void setDs_status(String ds_status) {
		this.ds_status = ds_status;
	}

	public Integer getIn_ativo() {
		return in_ativo;
	}

	public void setIn_ativo(Integer in_ativo) {
		this.in_ativo = in_ativo;
	}
}
