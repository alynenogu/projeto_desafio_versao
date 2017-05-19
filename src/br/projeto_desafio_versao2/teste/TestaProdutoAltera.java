package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaProdutoAltera {
	public static void main(String[] args){
		Produto pdr = new Produto();
		pdr.setId(2);
		pdr.setNome("Cadeira com defeito");
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.merge(pdr);
		em.getTransaction().commit();
		em.close();
	}

}
