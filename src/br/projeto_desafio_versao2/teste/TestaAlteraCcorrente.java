package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAlteraCcorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ccorrente cc = new Ccorrente();
			cc.setCodContaCorrente(1);
			cc.setSaldo(200000);
			cc.setLimite(2000000);
			
			EntityManager em = new JPAUtil().getEntityManager();
			em.getTransaction().begin();
			em.merge(cc);
			em.getTransaction().commit();
			em.close();
			
	}

}
