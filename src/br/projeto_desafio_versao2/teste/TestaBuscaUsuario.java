package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 1);
		System.out.println(usuario.getNome());
		em.getTransaction().commit();
		em.close();

	}

}
