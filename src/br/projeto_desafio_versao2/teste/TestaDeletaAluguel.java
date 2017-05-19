package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaDeletaAluguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Aluga alg = new Aluga();
		alg = em.find(Aluga.class, 1);
		em.remove(alg);
		em.getTransaction().commit();
		em.close();
		

	}

}
