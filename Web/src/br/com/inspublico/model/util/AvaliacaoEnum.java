package br.com.inspublico.model.util;

public enum AvaliacaoEnum {

	RUIM("Ruim"), BOM("Bom"), OTIMO("Ótimo"), EXCELENTE("Excelente");

	private String avaliacao;

	AvaliacaoEnum(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getNota() {
		return avaliacao;
	}

}
