package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AlugaDAO;
import br.projeto_desafio_versao2.DAO.AnunciaDAO;
import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAlugaDAObuscar {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				EntityManager em = new JPAUtil().getEntityManager();
				
				Aluga alg = new Aluga();
				alg.setId(3);
				
				AlugaDAO algDAO = new AlugaDAO(em);
				try {
					algDAO.AlugaBuscar(alg, alg.getId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
