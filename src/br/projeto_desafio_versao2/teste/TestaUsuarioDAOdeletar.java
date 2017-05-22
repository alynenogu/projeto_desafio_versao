package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.UsuarioDAO;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaUsuarioDAOdeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		Usuario user1 = new Usuario();
		user1.setId(5);
		
		UsuarioDAO userDAO = new UsuarioDAO(em);
		try {
			userDAO.UsuarioDeletar(user1, user1.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
