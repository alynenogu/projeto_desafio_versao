package br.projeto_desafio_versao2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import br.projeto_desafio_versao2.modelo.Usuario;

public class UsuarioDAO {
	private EntityManager em;

	public UsuarioDAO(EntityManager manager) {
		this.em = manager;
		
	}
	public void UsuarioInserir(Usuario user) throws Exception
    {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
            
    }
	 public void UsuarioAlterar(Usuario user) throws Exception
	    {
		 	em.getTransaction().begin();
			em.merge(user);
			em.getTransaction().commit();
			em.close();
	    }
	 public void UsuarioDeletar(Usuario user,int id_excluido) throws Exception
	    {
			em.getTransaction().begin();
			user = em.find(Usuario.class, id_excluido);
			em.remove(user);
			em.getTransaction().commit();
			em.close();
	    }
	 public void UsuarioBuscar(Usuario user,int id_busca) throws Exception
	    {
			em.getTransaction().begin();
			user = em.find(Usuario.class, id_busca);
			
			System.out.println("Id:"+user.getId());
			System.out.println("nome:"+user.getNome());
			System.out.println("Profissão:"+user.getProfissao());
			System.out.println("Login:"+user.getLogin());
			System.out.println("Senha:"+user.getSenha());
			System.out.println("Endereço:"+user.getEndereco());
			System.out.println("Telefone:"+user.getTelefone());
			
			em.getTransaction().commit();
			em.close();
	    }
	 public List<Usuario> UsuarioListar(){
		 Query query = em.createQuery("select u from Usuario u");
		 
		return query.getResultList();
		 
	 }

	
	

}
