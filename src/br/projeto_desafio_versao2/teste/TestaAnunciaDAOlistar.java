package br.projeto_desafio_versao2.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AnunciaDAO;
import br.projeto_desafio_versao2.DAO.CategoriaDAO;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.modelo.Categoria;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAnunciaDAOlistar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		AnunciaDAO ancDAO = new AnunciaDAO(em);
		List<Anuncia> anc = ancDAO.AnunciaListar();
		
		for (Anuncia a:anc){
			System.out.println("Id:"+a.getId());
			System.out.println("ID do Produto:"+a.getProduto().getId());
			System.out.println("Nome do Produto:"+a.getProduto().getNome());
			System.out.println("Valor por horario:"+a.getValoraluguelhora());
			System.out.println("ID do Anunciante:"+a.getUsuario().getId());
			System.out.println("Nome do Anunciante:"+a.getUsuario().getNome());
			
			System.out.println("**************************");
		}

	}

}
