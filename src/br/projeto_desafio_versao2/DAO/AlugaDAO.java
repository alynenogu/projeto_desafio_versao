package br.projeto_desafio_versao2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class AlugaDAO {
	private EntityManager em;

	public AlugaDAO(EntityManager manager) {
		this.em = manager;
		
	}
	public void AlugaInserir(Aluga al) throws Exception
    {
		em.getTransaction().begin();
		em.persist(al);
		em.getTransaction().commit();
		em.close();
            
    }
	
	 public void AlugaAlterar(Aluga al) throws Exception
	    {
		 	em.getTransaction().begin();
			em.merge(al);
			em.getTransaction().commit();
			em.close();
	    }
	 public void AlugaDeletar(Aluga al,int id_excluido) throws Exception
	    {
			em.getTransaction().begin();
			al = em.find(Aluga.class, id_excluido);
			em.remove(al);
			em.getTransaction().commit();
			em.close();
	    }
	 public void AlugaBuscar(Aluga al,int id_busca) throws Exception
	    {
			em.getTransaction().begin();
			al = em.find(Aluga.class, id_busca);
			System.out.println("Id:"+al.getId());
			System.out.println("qtd de horas alugadas:"+al.getQtdhorasalugadas());
			System.out.println("nome do produto alugado:"+al.getProduto().getNome());
			System.out.println("usuario que alugou:"+al.getUsuario().getNome());
			em.getTransaction().commit();
			em.close();
	    }
	 public List<Aluga> AlugaListar(){
		 Query query = em.createQuery("select al from Aluga al");
		 
		return query.getResultList();
		 
	 }


    
}
