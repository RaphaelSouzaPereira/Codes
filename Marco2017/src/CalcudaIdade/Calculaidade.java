package CalcudaIdade;

import com.senac.SimpleJava.Console;

public class Calculaidade {
	public void run(){
		int ano = Console.readInt("Ano atual: ");
		Pessoa pessoa = lePessoa();
		Console.print(pessoa.getNome()+" voce tem "+pessoa.getIdade(ano)+" anos de vida");
		
	}

	private Pessoa lePessoa() {
		String nome = Console.readLine("Seu nome: ");
		int anoNascimento = Console.readInt("Ano de Nascimento: ");
		return new Pessoa(nome, anoNascimento);
	}
	

}
