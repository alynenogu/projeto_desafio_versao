package br.projeto_desafio_versao2.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String profissao;
	private String login;
	private String senha;
	private String endereco;
	private int telefone;
	@JoinColumn(unique=true)
	@OneToOne
	private Ccorrente ccorrente;
	
	private int qtdanuncios;
	private int qtdalugados;
	
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Ccorrente getCcorrente() {
		return ccorrente;
	}
	public void setCcorrente(Ccorrente ccorrente) {
		this.ccorrente = ccorrente;
	}
	public int getQtdanuncios() {
		return qtdanuncios;
	}
	public void setQtdanuncios(int qtdanuncios) {
		this.qtdanuncios = qtdanuncios;
	}
	public int getQtdalugados() {
		return qtdalugados;
	}
	public void setQtdalugados(int qtdalugados) {
		this.qtdalugados = qtdalugados;
	}
	
	//Metodos verifica a qtd produtos anunciados
	public boolean verificaQtdAnuncios(int qtdanuncios){
		//Se a qtd for maior que 2, nao pode mais anunciar
		if(this.qtdanuncios > 2){
			
			return false;
		}else{
			return true;
		}
	}
	//Metodos verifica a qtd produtos alugados
		public boolean verificaQtdalugado(int qtdalugados){
			//Se a qtd for maior que 2, nao pode mais alugar
			if(this.qtdalugados > 2){
				
				return false;
			}else{
				return true;
			}
		}
		
	
}
