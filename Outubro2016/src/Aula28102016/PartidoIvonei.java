package Aula28102016;

public class PartidoIvonei {
	private String sigla;
	private int    numero;
	
	public PartidoIvonei(){
		
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "Partido: [" + sigla + "], numero=" + numero;
	}
	
	
}
