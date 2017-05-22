package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaCategoriaDAO {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		// TODO Auto-generated method stub
		Categoria ctg = new Categoria();
		ctg.setNome("Louças");
		ctg.setDescricao("Pratos,Talheres");
		
		CategoriaDAO ctdDAO = new CategoriaDAO(em);
		try {
			ctdDAO.CategoriaInserir(ctg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
