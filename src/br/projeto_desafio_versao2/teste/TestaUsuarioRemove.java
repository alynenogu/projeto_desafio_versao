package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaUsuarioRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				EntityManager em = new JPAUtil().getEntityManager();
				em.getTransaction().begin();
				Usuario usr = new Usuario();
				usr = em.find(Usuario.class, 2);
				em.remove(usr);
				em.getTransaction().commit();
				em.close();

	}

}
