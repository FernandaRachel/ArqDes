package br.usjt.arqdes16.mapeamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

@Entity
public class Cidade {

	@Id
	@GeneratedValue
	@Column(name="idCidade")
	private int id;
	@NotNull
	@Size(max=128)
	@Column(name="nmCidade")
	private String nome;
	@NotNull
	@ManyToOne()
	@JoinColumn(name="idUf")
	private Estado estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
