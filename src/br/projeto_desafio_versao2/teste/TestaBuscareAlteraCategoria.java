package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscareAlteraCategoria {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Categoria ctg = em.find(Categoria.class, 2);
		ctg.setNome("Roupas");
		ctg.setDescricao("Vestidos,calcas...");
		System.out.println(ctg.getNome());
		System.out.println(ctg.getDescricao());
		em.getTransaction().commit();

	}

}
