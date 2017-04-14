package Aula30092016;

public class PessoaRaphael {
	private String nome;
	private CidadeRaphael cidade;
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CidadeRaphael getCidade() {
		return this.cidade;
	}
	public void setCidade(CidadeRaphael cidade) {
		this.cidade = cidade;
	}
	public String toString(){
		return "\n...."+nome+"\n...."+cidade;
	}
}