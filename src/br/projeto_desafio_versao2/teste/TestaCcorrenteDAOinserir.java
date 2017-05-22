package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.DAO.CcorrenteDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaCcorrenteDAOinserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		// TODO Auto-generated method stub
		Ccorrente cc = new Ccorrente();
		cc.setSaldo(30920);
		cc.setLimite(10000);
		
		CcorrenteDAO ccDAO = new CcorrenteDAO(em);
		
		
			try {
				ccDAO.CcorrenteInserir(cc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	}

}
