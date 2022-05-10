package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Movimentacao {
	private Integer id;
	private LocalDateTime datahora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	
	public Integer getId() {
		return id;
	}
	public LocalDateTime getDatahora() {
		return datahora;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setDatahora(LocalDateTime datahora) {
		this.datahora = datahora;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
	
}
