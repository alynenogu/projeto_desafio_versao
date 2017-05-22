package br.projeto_desafio_versao2.teste;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AlugaDAO;
import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAlugaDAOaltera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluga alg = new Aluga();
		alg.setId(2);
		alg.setValordevedor(99992);
		alg.setQtdhorasalugadas(6);
		
		Usuario usr1 = new Usuario();
		usr1.setId(1);
		alg.setUsuario(usr1);
		
		Produto prd1 = new Produto();
		prd1.setId(3);
		alg.setProduto(prd1);
		
		EntityManager em = new JPAUtil().getEntityManager();
		AlugaDAO al = new AlugaDAO(em);
		try {
			al.AlugaAlterar(alg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
