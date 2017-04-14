package Aula30092016;

public class PessoaIvonei {
		private String nome;
		private CidadeIvonei cidade;
		
		
		public String getNome() {
			return this.nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public CidadeIvonei getCidade() {
			return this.cidade;
		}
		public void setCidade(CidadeIvonei cidade) {
			this.cidade = cidade;
		}
		public String toString(){
			return "\n...."+nome+"\n...."+cidade;
		}
	//com o toString não é necessário os get caso você não queira
		
		
	
	
	
}
