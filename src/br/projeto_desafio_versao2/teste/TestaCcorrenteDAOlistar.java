package br.projeto_desafio_versao2.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.DAO.CcorrenteDAO;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaCcorrenteDAOlistar {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		CcorrenteDAO ccDAO = new CcorrenteDAO(em);
		List<Ccorrente> cc = ccDAO.CcorrenteListar();
		
		for (Ccorrente c:cc){
			System.out.println("ID: "+c.getCodContaCorrente());
			System.out.println("Saldo: "+c.getSaldo());
			System.out.println("limite: "+c.getLimite());
			System.out.println("**************************");
		}

	}

}
