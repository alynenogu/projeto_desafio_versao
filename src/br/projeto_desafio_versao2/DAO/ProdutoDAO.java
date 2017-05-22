package br.projeto_desafio_versao2.DAO;

import javax.persistence.EntityManager;

public class ProdutoDAO {
	private EntityManager em;

	public ProdutoDAO(EntityManager manager) {
		this.em = manager;
		
	}


}
