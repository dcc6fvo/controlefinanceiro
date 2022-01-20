package com.controlefinanceiro.controller.form;

import java.time.YearMonth;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.controlefinanceiro.modelo.Despesa;
import com.controlefinanceiro.modelo.enums.TipoDespesa;

public class DespesaForm {
	
	@NotNull @NotEmpty @Length(min = 3)
	private String descricao;
	
	@NotNull
	private double valor;

	@NotNull
	private YearMonth data;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private TipoDespesa tipoDespesa;
		
	public DespesaForm(@NotNull @NotEmpty @Length(min = 3) String descricao, @NotNull double valor,
			@NotNull YearMonth data, @NotNull TipoDespesa tipoDespesa) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
		this.tipoDespesa = tipoDespesa;
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

	public Despesa converter() {
		return new Despesa (getDescricao(),getValor(),getData(),getTipoDespesa());
	}
}
