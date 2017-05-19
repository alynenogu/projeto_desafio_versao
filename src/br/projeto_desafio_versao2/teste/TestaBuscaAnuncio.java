package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscaAnuncio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Anuncia anuncia = new Anuncia();
		anuncia = em.find(Anuncia.class, 2);
		System.out.println(anuncia.getValoraluguelhora());
		em.getTransaction().commit();
		em.close();

	}

}
