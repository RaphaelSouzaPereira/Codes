package br.com.empresa.banco.HerançaeException.conta;

import br.com.empresa.banco.HerançaeException.Tributavel;
/**
 * 
 * @author Pichau
 *
 */
public class ContaCorrente extends Conta implements Tributavel {
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita() {
		
	}

	public double calculaTributos() {
		
		return this.getSaldo() * 0.01;
	}

}
