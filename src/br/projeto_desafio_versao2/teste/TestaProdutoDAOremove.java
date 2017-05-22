package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.ProdutoDAO;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaProdutoDAOremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				EntityManager em = new JPAUtil().getEntityManager();
				
				Produto pdr = new Produto();
				pdr.setId(5);
				
				ProdutoDAO prdao = new ProdutoDAO(em);
				try {
					prdao.ProdutoDeletar(pdr, pdr.getId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
