package br.projeto_desafio_versao2.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Aluga {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private double valordevedor;
		private double qtdhorasalugadas;
		@ManyToOne
		private Usuario usuario;
		@ManyToOne
		private Produto produto;
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar data;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public double getValordevedor() {
			return valordevedor;
		}
		public void setValordevedor(double valordevedor) {
			this.valordevedor = valordevedor;
		}
		public double getQtdhorasalugadas() {
			return qtdhorasalugadas;
		}
		public void setQtdhorasalugadas(double qtdhorasalugadas) {
			this.qtdhorasalugadas = qtdhorasalugadas;
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
