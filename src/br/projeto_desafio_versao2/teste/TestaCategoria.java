package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria ctg = new Categoria();
		Categoria ctg1  = new Categoria();
		Categoria ctg2 = new  Categoria();
		Categoria ctg3 = new Categoria();
		
		ctg.setNome("Livros");
		ctg.setDescricao("Qualquer tipo de livro");
		
		ctg1.setNome("Moveis");
		ctg1.setDescricao("Armarios, camas, mesas ...");
		
		ctg2.setNome("eletrodomesticos");
		ctg2.setDescricao("Geladeira,fogão...");
		
		ctg3.setNome("Decoracao");
		ctg3.setDescricao("Quadro,flores...");
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		ctg3 = em.find(Categoria.class, 5);
		em.persist(ctg);
		em.persist(ctg1);
		em.persist(ctg2);
		//remove
		em.remove(ctg3);
		em.getTransaction().commit();
		
		em.close();
		
		
		
	}

}
