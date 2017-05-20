package br.projeto_desafio_versao2.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import br.projeto_desafio_versao2.modelo.Aluga;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.modelo.Ccorrente;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaBuscaAluguelID {
	//Metodos verifica a qtd produtos alugados
			public static boolean verificaQtdalugado(Long qtdalugados){
				//Se a qtd for maior que 2, nao pode mais alugar
				if(qtdalugados > 2){
					
					return false;
				}else{
					System.out.println("Ok, foram feitos menos de 2 aluguéis");
					return true;
				}
			}
			
	public static void main(String[] args) {

        EntityManager manager = new JPAUtil().getEntityManager();

        
        Usuario usr = manager.find(Usuario.class, 1);

        Query query = manager.createQuery("select  count(a.usuario.id) from Aluga a where a.usuario.id=:pUsuario ");

        query.setParameter("pUsuario", usr.getId());
       Long quantidade =  ( Long) query.getSingleResult();
        System.out.println("Total de alugueis: " + quantidade);
      
        
        verificaQtdalugado(quantidade);

     

     
    }

		
	}

