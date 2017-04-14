package Aula09092016;

public class Cachorro {

	private String nome, raca, dtNascimento;
	private String porte;
		
	public Cachorro(){
	
	}

	public void setNome(String nome){
		this.nome = nome;
	}		
	public String getNome(){
		return this.nome;
		}
	public void setRaca(String raca) {
		this.raca = raca;
		}
	public String getRaca(){
		return this.raca;	
		}
	public void setdtNascimento(String dtNascimento){
		this.dtNascimento = dtNascimento;
	}
	public String getdtNascimento(){
		return this.dtNascimento;
	}
	public void setPorte(String porte){
		this.porte = porte;
	}
	public String getPorte(){
		return this.porte;
		
	}
}
/*Exercicio01
Abra um projeto com o nome de ExempoAula07.
Crie uma classe Cachorro com os seguintes atributos:
nome (string)
raca (string)
dtNascimento(string)
porte(char) >> [P]equeno, [M]edio e [G]rande

Para a classe Cachorro crie os gets e sets para cada atributo.

Crie uma classe chamada Controle. Nesta classe você deverá instanciar um 
objeto cao, preencher seus atributos e imprimí-los.
Faça isto para apenas um objeto cao.*/

