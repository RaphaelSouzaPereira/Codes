package Aula23092016;

public class Pessoa {
		private String nome;
		private Cidade cidade;
		
		
		public String getNome() {
			return this.nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Cidade getCidade() {
			return this.cidade;
		}
		public void setCidade(Cidade cidade) {
			this.cidade = cidade;
		}
		public String toString(){
			return "...Nome: "+nome+ cidade;
		}
	//com o toString não é necessário os get caso você não queira
		
		
	
	
	
}
