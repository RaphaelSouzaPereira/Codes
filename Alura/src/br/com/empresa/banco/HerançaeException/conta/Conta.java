package br.com.empresa.banco.HerançaeException.conta;

import Lang.String;
import br.com.empresa.banco.HerançaeException.ValorInvalidoException;

public abstract class Conta {
	
	protected double saldo;
	public String numero;
	public Object nome;

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}
		else{
			this.saldo += valor;
		}
	}
	/*public void deposita(double valor) throws ValorInvalidoException {
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}
		else{
			this.saldo += valor;
		}
	}*/
	/** javadoc
	 * realiza um sac
	 * @param valor
	 */
	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

}
