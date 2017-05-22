package br.projeto_desafio_versao2.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaCategoriaDAOListar {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		CategoriaDAO ctgDAO = new CategoriaDAO(em);
		List<Categoria> ctg = ctgDAO.CategoriaListar();
		
		for (Categoria c:ctg){
			System.out.println("ID: "+c.getId());
			System.out.println("Nome: "+c.getNome());
			System.out.println("Descrição: "+c.getDescricao());
			System.out.println("**************************");
		}

	}

}
