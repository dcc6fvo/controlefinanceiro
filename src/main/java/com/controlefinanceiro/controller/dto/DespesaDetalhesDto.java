package com.controlefinanceiro.controller.dto;

import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

import com.controlefinanceiro.modelo.Despesa;
import com.controlefinanceiro.modelo.enums.TipoDespesa;

public class DespesaDetalhesDto {

	private String descricao;
	private double valor;
	private YearMonth data;
	private TipoDespesa tipoDespesa;
	
	public DespesaDetalhesDto(Despesa despesa) {
		this.descricao = despesa.getDescricao();
		this.valor = despesa.getValor();
		this.data = despesa.getData();
		this.tipoDespesa = despesa.getTipoDespesa();
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public YearMonth getData() {
		return data;
	}
	
	public void setData(YearMonth data) {
		this.data = data;
	}
	
	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}
	
	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}	
	
	public static List<DespesaDetalhesDto> converter(List<Despesa> despesas) {
		return despesas.stream().map(DespesaDetalhesDto::new).collect(Collectors.toList());
	}
}
