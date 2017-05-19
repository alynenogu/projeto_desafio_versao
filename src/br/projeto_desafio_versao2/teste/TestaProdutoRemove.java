package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaProdutoRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Produto pdr = new Produto();
		pdr = em.find(Produto.class, 4);
		em.remove(pdr);
		em.getTransaction().commit();
		em.close();

	}

}
