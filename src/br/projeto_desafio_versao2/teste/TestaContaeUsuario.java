package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaContaeUsuario {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Alyne");
		usuario1.setProfissao("Estudante");
		usuario1.setLogin("line");
		usuario1.setSenha("123");
		usuario1.setEndereco("Rua margarida");
		usuario1.setTelefone(2124129090);
		usuario1.setQtdanuncios(1);
		usuario1.setQtdalugados(1);
		
		Ccorrente conta1 = new Ccorrente();
		conta1.setSaldo(222);
		conta1.setLimite(20000);
		
		usuario1.setCcorrente(conta1);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(usuario1);
		em.persist(conta1);
		em.getTransaction().commit();
		em.close();

	}

}
