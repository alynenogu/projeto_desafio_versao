package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.UsuarioDAO;
import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaUsuarioDAOinserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Leonardo");
		usuario1.setProfissao("Faz nada");
		usuario1.setLogin("leo");
		usuario1.setSenha("123");
		usuario1.setEndereco("Rua Sao joao");
		usuario1.setTelefone(2124129090);
		usuario1.setQtdanuncios(1);
		usuario1.setQtdalugados(1);
		
		Ccorrente conta1 = new Ccorrente();
		conta1.setCodContaCorrente(7);
		usuario1.setCcorrente(conta1);
		
		UsuarioDAO userDAO = new UsuarioDAO(em);
		try {
			userDAO.UsuarioInserir(usuario1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
