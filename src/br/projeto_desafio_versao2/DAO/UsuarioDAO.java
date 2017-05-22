package br.projeto_desafio_versao2.DAO;

import javax.persistence.EntityManager;

public class UsuarioDAO {
	private EntityManager em;

	public UsuarioDAO(EntityManager manager) {
		this.em = manager;
		
	}
	
	

}
