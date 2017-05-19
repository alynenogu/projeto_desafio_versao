package br.projeto_desafio_versao2.modelo;

public class Ccorrente {
	int codContaCorrente;
	double saldo;
	int limite;
	
	/*metodos construtores*/
	public Ccorrente(){
		
	}
	public Ccorrente(int codContaCorrente, double saldo, int limite){
		this.codContaCorrente = codContaCorrente;
		this.saldo = saldo;
		this.limite = limite;
	}
	/*metodos set e get*/
	//int codcontacorrente
	public void setCodContaCorrente(int codContaCorrente) {
		this.codContaCorrente = codContaCorrente;
	}
	public int getCodContaCorrente() {
		return this.codContaCorrente;
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
	
	
	/* métodos para conta corrente*/
	
	public void cadastra(int codContaCorrente, int saldo, int limite){
		this.codContaCorrente = codContaCorrente;
		this.saldo = saldo;
		this.limite = limite;
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
