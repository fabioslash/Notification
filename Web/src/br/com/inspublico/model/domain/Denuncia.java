package br.com.inspublico.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.inspublico.model.util.AvaliacaoEnum;


@Entity
@Table(name = "DENUNCIA", schema="ATENDIMENTO_DB")
public class Denuncia implements Serializable {

	
	private static final long serialVersionUID = -6666120976994283771L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "PROTOCOLO")
	private String protocolo;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "DETALHAMENTO")
	private String detalhamento;

	@Column(name = "DENUNCIA_ENUM")
	private AvaliacaoEnum avaliacaoEnum;
	
	
	
	
	//gets e sets

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public AvaliacaoEnum getAvaliacaoEnum() {
		return avaliacaoEnum;
	}

	public void setAvaliacaoEnum(AvaliacaoEnum avaliacaoEnum) {
		this.avaliacaoEnum = avaliacaoEnum;
	}

	
	//equals e hascode
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((avaliacaoEnum == null) ? 0 : avaliacaoEnum.hashCode());
		result = prime * result
				+ ((detalhamento == null) ? 0 : detalhamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((protocolo == null) ? 0 : protocolo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Denuncia other = (Denuncia) obj;
		if (avaliacaoEnum != other.avaliacaoEnum)
			return false;
		if (detalhamento == null) {
			if (other.detalhamento != null)
				return false;
		} else if (!detalhamento.equals(other.detalhamento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (protocolo == null) {
			if (other.protocolo != null)
				return false;
		} else if (!protocolo.equals(other.protocolo))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
}
