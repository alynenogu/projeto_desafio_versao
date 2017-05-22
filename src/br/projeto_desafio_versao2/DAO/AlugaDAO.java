package br.projeto_desafio_versao2.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class AlugaDAO {
	private EntityManager em;

	public AlugaDAO(EntityManager manager) {
		this.em = manager;
		
	}

    
}
