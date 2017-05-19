package br.projeto_desafio_versao2.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAnunciar {
	public static void main(String[] args) {
		Anuncia anuncio = new Anuncia();
		anuncio.setValoraluguelhora(30);
		anuncio.setData(Calendar.getInstance());
		
		Usuario usr1 = new Usuario();
		usr1.setId(1);
		anuncio.setUsuario(usr1);
		
		Produto prd1 = new Produto();
		prd1.setId(3);
		anuncio.setProduto(prd1);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(anuncio);
		em.getTransaction().commit();
		em.close();
		
	}

}
