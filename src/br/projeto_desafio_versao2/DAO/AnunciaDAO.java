package br.projeto_desafio_versao2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.projeto_desafio_versao2.modelo.Anuncia;

public class AnunciaDAO {
	private EntityManager em;

	public AnunciaDAO(EntityManager manager) {
		this.em = manager;
		
	}
	public void AnunciaInserir(Anuncia anc) throws Exception
    {
		em.getTransaction().begin();
		em.persist(anc);
		em.getTransaction().commit();
		em.close();
            
    }
	 public void AnunciaAlterar(Anuncia anc) throws Exception
	    {
		 	em.getTransaction().begin();
			em.merge(anc);
			em.getTransaction().commit();
			em.close();
	    }
	 public void AnunciaDeletar(Anuncia anc,int id_excluido) throws Exception
	    {
			em.getTransaction().begin();
			anc = em.find(Anuncia.class, id_excluido);
			em.remove(anc);
			em.getTransaction().commit();
			em.close();
	    }
	 public void AnunciaBuscar(Anuncia anc,int id_busca) throws Exception
	    {
			em.getTransaction().begin();
			anc = em.find(Anuncia.class, id_busca);
			
			System.out.println("Id:"+anc.getId());
			System.out.println("ID do Produto:"+anc.getProduto().getId());
			System.out.println("Nome do Produto:"+anc.getProduto().getNome());
			System.out.println("Valor por horario:"+anc.getValoraluguelhora());
			System.out.println("ID do Anunciante:"+anc.getUsuario().getId());
			System.out.println("Nome do Anunciante:"+anc.getUsuario().getNome());
			
			em.getTransaction().commit();
			em.close();
	    }
	 public List<Anuncia> AnunciaListar(){
		 Query query = em.createQuery("select an from Anuncia an");
		 
		return query.getResultList();
		 
	 }

}
