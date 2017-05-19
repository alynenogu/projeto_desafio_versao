package br.projeto_desafio_versao2.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private StatusAlugado statusalugar;
	@Enumerated(EnumType.STRING)
	private StatusAnunciado statusanunciado;
	private String descricao;
	
	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusAlugado getStatusalugar() {
		return statusalugar;
	}

	public void setStatusalugar(StatusAlugado statusalugar) {
		this.statusalugar = statusalugar;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public StatusAnunciado getStatusanunciado() {
		return statusanunciado;
	}

	public void setStatusanunciado(StatusAnunciado statusanunciado) {
		this.statusanunciado = statusanunciado;
	}
	
	


}
