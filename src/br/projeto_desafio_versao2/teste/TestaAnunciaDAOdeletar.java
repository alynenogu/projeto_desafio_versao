package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AnunciaDAO;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAnunciaDAOdeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		
		Anuncia anuncio = new Anuncia();
		anuncio.setId(4);
		
		AnunciaDAO anunciadao = new AnunciaDAO(em);
		
		try {
			anunciadao.AnunciaDeletar(anuncio, anuncio.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
