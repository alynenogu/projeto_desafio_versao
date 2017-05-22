package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaCategoriaDAOremover {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		Categoria ctg = new Categoria();
		ctg.setId(9);
		ctg.setNome("Louças e mais Louças");
		ctg.setDescricao("Pratos,Talheres");
		
		CategoriaDAO ctdDAO = new CategoriaDAO(em);
		try {
			ctdDAO.CategoriaDeletar(ctg,ctg.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
