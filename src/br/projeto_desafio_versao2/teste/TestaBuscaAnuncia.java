package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscaAnuncia {
	//Metodos verifica a qtd produtos alugados
	public static boolean verificaQtdanuncio(Long qtdanunciados){
		//Se a qtd for maior que 2, nao pode mais alugar
		if(qtdanunciados > 2){
			
			return false;
		}else{
			System.out.println("Ok, foram feitos menos de 2 anuncios");
			return true;
		}
	}
	public static void main(String[] args) {
		 EntityManager manager = new JPAUtil().getEntityManager();

	        
	        Usuario usr = manager.find(Usuario.class, 1);

	        Query query = manager.createQuery("select  count(a.usuario.id) from Anuncia a where a.usuario.id=:pUsuario ");

	        query.setParameter("pUsuario", usr.getId());
	       Long quantidade =  ( Long) query.getSingleResult();
	        System.out.println("Total de anuncios: " + quantidade);
	      
	        verificaQtdanuncio(quantidade);
	        
	        


	}

}
