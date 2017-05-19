package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscaAluga {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Aluga alg =em.find(Aluga.class, 2) ;
		System.out.println(alg.getQtdhorasalugadas());
		em.getTransaction().commit();
		em.close();
		

	}

}
