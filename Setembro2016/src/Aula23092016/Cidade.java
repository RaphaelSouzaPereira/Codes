package Aula23092016;

public class Cidade {
	private String nome;
	private int populacao;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return this.populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}	
	public String toString(){
		return "\n...Nome da Cidade:"+nome+"\n...População: "+populacao;
		//ou return nome;
	}
}
