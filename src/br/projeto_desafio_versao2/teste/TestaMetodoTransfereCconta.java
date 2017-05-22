package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaMetodoTransfereCconta {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Ccorrente cc = new Ccorrente();
		cc.setCodContaCorrente(3);
		cc.setSaldo(3000);
		cc.setLimite(3000);
		em.merge(cc);
		Ccorrente cc1 = new Ccorrente();
		cc1.setSaldo(100);
		cc1.setLimite(200);
		em.persist(cc1);
		boolean transfere = cc.tranferePara(cc1, 20);
		
		if(transfere == false){
			System.out.println("Problemas na transferência");
			
		}else{
			System.out.println(cc1.getSaldo());
		}
		em.getTransaction().commit();
		em.close();

	}

}
