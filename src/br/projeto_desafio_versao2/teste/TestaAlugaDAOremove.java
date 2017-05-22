package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AlugaDAO;
import br.projeto_desafio_versao2.DAO.AnunciaDAO;
import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAlugaDAOremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		
		Aluga alg = new Aluga();
		alg.setId(6);
		
		AlugaDAO alugadao = new AlugaDAO(em);
		
		try {
			alugadao.AlugaDeletar(alg, alg.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
