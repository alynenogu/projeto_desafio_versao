package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.ProdutoDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.StatusAlugado;
import br.projeto_desafio_versao2.modelo.StatusAnunciado;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaProdutoDAOinserir {

	public static void main(String[] args) {
		  EntityManager em = new JPAUtil().getEntityManager();
		// TODO Auto-generated method stub
		Produto prod1 = new Produto();
		prod1.setNome("Liquidificador");
		prod1.setStatusalugar(StatusAlugado.ALUGADO);
		prod1.setStatusanunciado(StatusAnunciado.ANUNCIADO);
		prod1.setDescricao("Ok ok");
		
		
		Categoria categoria = new Categoria();
	     categoria.setId(4);
		
	     prod1.setCategoria(categoria);
	    
	     Usuario usuario = new Usuario();
	     usuario.setId(1);
	     
	     prod1.setUsuario(usuario);
		
	     
	     ProdutoDAO prd = new ProdutoDAO(em);
	     try {
			prd.ProdutoInserir(prod1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	   
		
	
		

	}

}
