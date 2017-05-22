package br.projeto_desafio_versao2.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.UsuarioDAO;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaUsuarioDAOlista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		UsuarioDAO userDAO = new UsuarioDAO(em);
		List<Usuario> user = userDAO.UsuarioListar();
		
		for (Usuario u:user){
			System.out.println("ID: "+u.getId());
			System.out.println("Nome: "+u.getNome());
			System.out.println("Profissão: "+u.getProfissao());
			System.out.println("Login:" + u.getLogin());
			System.out.println("Senha:" + u.getSenha());
			System.out.println("Telefone:"+u.getTelefone());
			System.out.println("**************************");
		}


	}

}
