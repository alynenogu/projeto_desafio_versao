package br.projeto_desafio_versao2.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anuncia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private double valoraluguelhora;
	
	private Usuario usuario;
	private Produto produto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getValoraluguelhora() {
		return valoraluguelhora;
	}
	public void setValoraluguelhora(double valoraluguelhora) {
		this.valoraluguelhora = valoraluguelhora;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

}
