package br.projeto_desafio_versao2.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.DAO.ProdutoDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaProdutoDAOlistar {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		ProdutoDAO pdrDAO = new ProdutoDAO(em);
		List<Produto> pdr = pdrDAO.ProdutoListar();
		
		for (Produto p:pdr){
			System.out.println("ID: "+p.getId());
			System.out.println("Nome: "+p.getNome());
			System.out.println("Descrição: "+p.getDescricao());
			System.out.println("Categoria: "+p.getCategoria().getNome());
			System.out.println("**************************");
		}

	}

}
