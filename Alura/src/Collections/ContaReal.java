package Collections;

public class ContaReal implements Comparable<ContaReal> {
	
	double saldo;
	protected int numero;
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContaReal(double a, int b, String c) {
		
			this.saldo = a;
			this.numero = b;
			this.nome = c;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaReal other = (ContaReal) obj;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	/*@Override
	public int compareTo(ContaReal outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}*/

	@Override
	public int compareTo(ContaReal o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deposita(int i) {
		this.setSaldo(i);
		
	}

	
	

}
