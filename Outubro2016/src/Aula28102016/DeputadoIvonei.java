package Aula28102016;

public class DeputadoIvonei {
	private String  nome;
	private PartidoIvonei partido;
	private int     indacorCorrupcao;
	
	public DeputadoIvonei(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PartidoIvonei getPartido() {
		return partido;
	}
	public void setPartido(PartidoIvonei partido) {
		this.partido = partido;
	}
	public int getIndacorCorrupcao() {
		return indacorCorrupcao;
	}
	public void setIndacorCorrupcao(int indacorCorrupcao) {
		this.indacorCorrupcao = indacorCorrupcao;
	}
	
	public String toString() {
		return "Deputado:" + nome + " - " + partido + " - " + indacorCorrupcao;
	}
	
	
}
