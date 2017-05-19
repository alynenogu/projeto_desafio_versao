package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAlteraUsuario {

	public static void main(String[] args) {
		Usuario usr = new Usuario();
		usr.setId(1);
		usr.setNome("Maria de Lourdes");
		
		usr.setProfissao("Dona de Casa");
		usr.setLogin("mamae");
		usr.setSenha("mamae");
		usr.setEndereco("Rua margarida");
		usr.setTelefone(2124129090);
		usr.setQtdanuncios(1);
		usr.setQtdalugados(1);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.merge(usr);
		em.getTransaction().commit();
		em.close();

	}

}
