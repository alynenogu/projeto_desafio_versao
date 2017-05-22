package br.projeto_desafio_versao2.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AlugaDAO;
import br.projeto_desafio_versao2.DAO.AnunciaDAO;
import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAlugaDAOlista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				EntityManager em = new JPAUtil().getEntityManager();
				AlugaDAO algDAO = new AlugaDAO(em);
				List<Aluga> alg = algDAO.AlugaListar();
				
				for (Aluga a:alg){
					System.out.println("Id:"+a.getId());
					System.out.println("ID do Produto:"+a.getProduto().getId());
					System.out.println("Nome do Produto:"+a.getProduto().getNome());
					
					System.out.println("ID do Anunciante:"+a.getUsuario().getId());
					System.out.println("Nome do Anunciante:"+a.getUsuario().getNome());
					
					System.out.println("**************************");
				}


	}

}
