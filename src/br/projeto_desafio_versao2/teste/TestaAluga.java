package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAluga {

	public static void main(String[] args) {
		Aluga alg = new Aluga();
		alg.setValordevedor(203.3);
		alg.setQtdhorasalugadas(4);
		
		Usuario usr1 = new Usuario();
		usr1.setId(1);
		alg.setUsuario(usr1);
		
		Produto prd1 = new Produto();
		prd1.setId(3);
		alg.setProduto(prd1);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(alg);
		em.getTransaction().commit();
		em.close();
		
	}

}
