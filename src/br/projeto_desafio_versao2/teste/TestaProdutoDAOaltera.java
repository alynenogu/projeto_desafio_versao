package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.ProdutoDAO;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaProdutoDAOaltera {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		// TODO Auto-generated method stub
		Produto pdr = new Produto();
		pdr.setId(5);
		pdr.setNome("Cadeira com defeito");
		
		ProdutoDAO prdao = new ProdutoDAO(em);
		try {
			prdao.ProdutoAlterar(pdr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
