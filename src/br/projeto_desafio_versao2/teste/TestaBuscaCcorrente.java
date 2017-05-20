package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscaCcorrente {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Ccorrente cc = em.find(Ccorrente.class, 3);
		
		System.out.println(cc.getLimite());
		em.getTransaction().commit();
		em.close();
		
	}

}
