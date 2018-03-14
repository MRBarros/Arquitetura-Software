package br.usjt.arqsw.entity;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings({ "serial", "unused" })
public class Chamado implements Serializable{
	private static final String id = null;
	/**
	 * 
	 */

	@NotNull(message="A fila não pode ser vazia")
	@Min(value=1, message="A fila não pode ser vazia")
	private String Fila;
	private int idChamado;
	
	private String nome;
	private String descricao;
	private String status;
	private String dtAbertura;
	private String dtFechamento;
	
	
	
	public String getFila() {
		return Fila;
	}



	public void setIdFila(String Fila) {
		this.Fila = Fila;
	}



	public int getIdChamado() {
		return idChamado;
	}



	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getDtAbertura() {
		return dtAbertura;
	}



	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}



	public String getDtFechamento() {
		return dtFechamento;
	}



	public void setDtFechamento(String dtFechamento) {
		this.dtFechamento = dtFechamento;
	}



	public static String getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Chamado [id=" + id + ", nome=" + nome + ", descricao=" + descricao + 
				", status=" + status + ", dtAbertura=" + dtAbertura +
				", dtFechamento=" + dtFechamento + "]";
	}
	
}
