package br.projeto_desafio_versao2.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AlugaDAO;
import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAlugaDAOinserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluga alg = new Aluga();
		alg.setData(Calendar.getInstance());
		alg.setValordevedor(1234);
		alg.setQtdhorasalugadas(6);
		
		Usuario usr1 = new Usuario();
		usr1.setId(1);
		alg.setUsuario(usr1);
		
		Produto prd1 = new Produto();
		prd1.setId(3);
		alg.setProduto(prd1);
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		AlugaDAO algDAO = new AlugaDAO(em);
		try {
			algDAO.AlugaInserir(alg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
