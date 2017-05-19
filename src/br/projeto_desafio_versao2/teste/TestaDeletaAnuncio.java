package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaDeletaAnuncio {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Anuncia anuncio = new Anuncia();
		anuncio = em.find(Anuncia.class, 1);
		em.remove(anuncio);
		em.getTransaction().commit();
		em.close();

	}

}
