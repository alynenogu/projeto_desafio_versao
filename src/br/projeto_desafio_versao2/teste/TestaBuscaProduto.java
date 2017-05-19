package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscaProduto {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class, 2);
		System.out.println(produto.getNome());
		em.getTransaction().commit();
		em.close();
	}

}
