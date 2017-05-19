package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.StatusAlugado;
import br.projeto_desafio_versao2.modelo.StatusAnunciado;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaProdutoUsuarioCategoria {
	
	public static void main(String[] args) {
	Produto prod1 = new Produto();
	prod1.setNome("Radio");
	prod1.setStatusalugar(StatusAlugado.ALUGADO);
	prod1.setStatusanunciado(StatusAnunciado.ANUNCIADO);
	prod1.setDescricao("Radio fm e am");
	
	Produto prod2 = new Produto();
	prod1.setNome("DVD");
	prod1.setStatusalugar(StatusAlugado.ALUGADO);
	prod1.setStatusanunciado(StatusAnunciado.ANUNCIADO);
	prod1.setDescricao("Dvd antigo");
	
	
	 Categoria categoria = new Categoria();
     categoria.setId(4);
	
     prod1.setCategoria(categoria);
    prod2.setCategoria(categoria); 
     Usuario usuario = new Usuario();
     usuario.setId(1);
     
     prod1.setUsuario(usuario);
	
     
	
     EntityManager em = new JPAUtil().getEntityManager();
	
	em.getTransaction().begin();
	em.persist(prod1);
	em.getTransaction().commit();
	em.close();
	
	


	}
}
