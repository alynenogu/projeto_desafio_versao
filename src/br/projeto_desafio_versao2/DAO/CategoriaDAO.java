package br.projeto_desafio_versao2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.projeto_desafio_versao2.modelo.Categoria;

public class CategoriaDAO {
	private EntityManager em;

	public CategoriaDAO(EntityManager manager) {
		this.em = manager;
		
	}
	public void CategoriaInserir(Categoria ctg ) throws Exception
    {
		em.getTransaction().begin();
		em.persist(ctg);
		em.getTransaction().commit();
		em.close();
            
    }
	
	 public void CategoriaAlterar(Categoria ctg) throws Exception
	    {
		 	em.getTransaction().begin();
			em.merge(ctg);
			em.getTransaction().commit();
			em.close();
	    }
	 public void CategoriaDeletar(Categoria ctg,int id_excluido) throws Exception
	    {
			em.getTransaction().begin();
			ctg = em.find(Categoria.class, id_excluido);
			em.remove(ctg);
			em.getTransaction().commit();
			em.close();
	    }
	 public void CategoriaBuscar(Categoria ctg,int id_busca) throws Exception
	    {
			em.getTransaction().begin();
			ctg = em.find(Categoria.class, id_busca);
			System.out.println("Id:"+ctg.getId());
			System.out.println("Nome:"+ctg.getNome());
			System.out.println("Descrição:"+ctg.getDescricao());
			em.getTransaction().commit();
			em.close();
	    }
	 public List<Categoria> CategoriaListar(){
		 Query query = em.createQuery("select c from Categoria c");
		 
		return query.getResultList();
		 
	 }
}
