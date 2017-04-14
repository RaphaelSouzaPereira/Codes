package Collections;

import br.com.empresa.banco.HerançaeException.Tributavel;

public class ContaCorrente extends ContaReal implements Tributavel, Comparable<ContaReal> {
	
	public ContaCorrente(double a, int b, String c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita() {
		
	}

	public double calculaTributos() {
		
		return this.getSaldo() * 0.01;
	}
	public int compareTo(ContaCorrente outra){
		return this.getNumero() - outra.getNumero();
	}

}
