package br.projeto_desafio_versao2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.modelo.Ccorrente;

public class CcorrenteDAO {
	private EntityManager em;

	public CcorrenteDAO(EntityManager manager) {
		this.em = manager;
		
	}
	public void CcorrenteInserir(Ccorrente cc) throws Exception
    {
		em.getTransaction().begin();
		em.persist(cc);
		em.getTransaction().commit();
		em.close();
            
    }
	
	 public void CcorrenteAlterar(Ccorrente ccDAO) throws Exception
	    {
		 	em.getTransaction().begin();
			em.merge(ccDAO);
			em.getTransaction().commit();
			em.close();
	    }
	 public void CcorrenteDeletar(Ccorrente cc,int id_excluido) throws Exception
	    {
			em.getTransaction().begin();
			cc = em.find(Ccorrente.class, id_excluido);
			em.remove(cc);
			em.getTransaction().commit();
			em.close();
	    }
	 public void CcorrenteBuscar(Ccorrente cc,int id_busca) throws Exception
	    {
			em.getTransaction().begin();
			cc = em.find(Ccorrente.class, id_busca);
			System.out.println("Id:"+cc.getCodContaCorrente());
			System.out.println("Saldo:"+cc.getSaldo());
			System.out.println("Limite:"+cc.getLimite());
			em.getTransaction().commit();
			em.close();
	    }
	 public List<Ccorrente> CcorrenteListar(){
		 Query query = em.createQuery("select c from Ccorrente c");
		 
		return query.getResultList();
		 
	 }


}
