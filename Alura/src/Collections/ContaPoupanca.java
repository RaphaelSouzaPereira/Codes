package Collections;

public class ContaPoupanca extends ContaReal implements Comparable<ContaReal>  {
	
		

	public ContaPoupanca(double a, int b, String c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public void deposita(double d) {
		this.saldo = d;
		
	}
	public int compareTo(ContaReal outra) {
		 return this.nome.compareTo(outra.nome);
	}

}
