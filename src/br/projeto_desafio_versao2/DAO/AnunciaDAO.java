package br.projeto_desafio_versao2.DAO;

import javax.persistence.EntityManager;

public class AnunciaDAO {
	private EntityManager em;

	public AnunciaDAO(EntityManager manager) {
		this.em = manager;
		
	}

}
