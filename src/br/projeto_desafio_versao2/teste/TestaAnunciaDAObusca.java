package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AnunciaDAO;
import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAnunciaDAObusca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		
		Anuncia anc = new Anuncia();
		anc.setId(3);
		
		AnunciaDAO ancDAO = new AnunciaDAO(em);
		try {
			ancDAO.AnunciaBuscar(anc, anc.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
