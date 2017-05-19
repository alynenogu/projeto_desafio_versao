package br.projeto_desafio_versao2.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ccorrente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	double saldo;
	int limite;
	
	
	/*metodos set e get*/
	//int codcontacorrente
	public void setCodContaCorrente(int id) {
		this.id = id;
	}
	public int getCodContaCorrente() {
		return this.id;
	}
	//int saldo
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	// int limite
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public int getLimite() {
		return this.limite;
	}
	
	
	
	//sacar
	
	/*public void sacar(double qtd){
		//o novo saldo vai ser igual ao saldo atual menos a quantidade sacada
		double novoSaldo = this.saldo - qtd;
		this.saldo = novoSaldo;
	}*/
	
	public boolean sacar(double valor){
		//se o valor do saldo for menor que o valor sacado
		if (this.saldo < valor){
			return false;
		}else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	//depositar
	public void deposita(double qtd){
		this.saldo += qtd;
	
	}
	
	
	//transferir
	/*public void transfere(Ccorrente cdestino, double valortransferido){
		//O saldo vai ser diminuido por causa do valor transferido
		this.saldo = this.saldo - valortransferido;
		//O saldo da conta destino vai ser igual, vai ser igual o saldo da conta destino mais a quantidade transferida
		cdestino.saldo = cdestino.saldo + valortransferido;
		
	
	}*/
	public boolean tranferePara(Ccorrente cdestino,double valortransferido){
		//verificar se conseguiu sacar
		boolean retirou = this.sacar(valortransferido);
		//se nao conseguiu sacar, nao consigo transferir
		if(retirou == false){
			return false;
		}else{
			cdestino.deposita(valortransferido);
			return true;
			
		}
	}
}
