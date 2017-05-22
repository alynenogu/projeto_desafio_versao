package br.projeto_desafio_versao2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import br.projeto_desafio_versao2.modelo.Produto;

public class ProdutoDAO {
	private EntityManager em;

	public ProdutoDAO(EntityManager manager) {
		this.em = manager;
		
	}
	public void ProdutoInserir(Produto prod) throws Exception
    {
		em.getTransaction().begin();
		em.persist(prod);
		em.getTransaction().commit();
		em.close();
            
    }
	
	 public void ProdutoAlterar(Produto prod) throws Exception
	    {
		 	em.getTransaction().begin();
			em.merge(prod);
			em.getTransaction().commit();
			em.close();
	    }
	 public void ProdutoDeletar(Produto prod,int id_excluido) throws Exception
	    {
			em.getTransaction().begin();
			prod = em.find(Produto.class, id_excluido);
			em.remove(prod);
			em.getTransaction().commit();
			em.close();
	    }
	 public void ProdutoBuscar(Produto prod,int id_busca) throws Exception
	    {
			em.getTransaction().begin();
			prod = em.find(Produto.class, id_busca);
			System.out.println("Id:"+prod.getId());
			System.out.println("Nome:"+prod.getNome());
			System.out.println("Descricao:"+prod.getDescricao());
			System.out.println("Categoria:"+prod.getCategoria().getNome());
			System.out.println("usuario que alugou:"+prod.getUsuario().getNome());
			em.getTransaction().commit();
			em.close();
	    }
	 public List<Produto> ProdutoListar(){
		 Query query = em.createQuery("select p from Produto p");
		 
		return query.getResultList();
		 
	 }




}
