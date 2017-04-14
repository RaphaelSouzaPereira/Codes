package Aula09092016;

public class CachorroIVONEI {
	private String nome;
	private String raca;
	private String dtNascimento;
	private char   porte;

	public CachorroIVONEI(String nome, String raca, String nasc, char porte){
		this.nome = nome;
		this.raca = raca;
		this.dtNascimento = nasc;
		this.porte = porte;
	}
	
	public String mostraDadosCachorro(){
		String st = "";
		st = st + "\nNome: " + getNome();
		st = st + "\nRaça: " + getRaca();
		st += "\nNasc: " + getDtNascimento();
		st += "\nPorte: " + getPorte();
		return st;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public char getPorte() {
		return porte;
	}
	public void setPorte(char porte) {
		this.porte = porte;
	}
	

	
}//-----------------------------final classe
