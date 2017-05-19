package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.projeto_desafio_versao2.modelo.Categoria;

public class TestaCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria ctg = new Categoria();
		ctg.setNome("Livros");
		ctg.setDescricao("Qualquer tipo de livro");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("desafio");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(ctg);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
	}

}
