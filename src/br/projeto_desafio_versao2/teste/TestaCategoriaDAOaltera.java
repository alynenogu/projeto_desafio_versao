package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaCategoriaDAOaltera {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		Categoria ctg = new Categoria();
		ctg.setId(9);
		ctg.setNome("Louças e mais Louças");
		ctg.setDescricao("Pratos,Talheres");
		
		CategoriaDAO ctgDAO = new CategoriaDAO(em);
		try {
			ctgDAO.CategoriaAlterar(ctg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
