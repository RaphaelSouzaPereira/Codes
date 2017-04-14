package Aula26082016;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		String mens = "";
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();

		p1.setNome(digitaNome());
		p1.setIdade(digitaIdade());

		p2.setNome(digitaNome());
		p2.setIdade(digitaIdade());
		
		System.out.println(respostaDados(p1,p2,mens));
		System.out.println(respostaDados1(p1,p2,mens));
		System.out.println(respostaDados2(p1,p2,mens));
		System.out.println(mostraMaisVelho(p1.getIdade(),p2.getIdade(),p1.getNome(),p2.getNome()));
	}
	
	private static String mostraMaisVelho(int id1, int id2, String n1, String n2) {
		if (id1>id2)
			return "A pessoa mais velha é " + n1;
		else if(id2>id1)
			return "A pessoa mais velha é " + n2;
		else
			return "As pessoas tem a mesma idade.";
	}

	public static String respostaDados(Pessoa p1, Pessoa p2, String mens){
		mens = "A pessoa mais velha é " + p1.getNome();
		if (p1.getIdade() > p2.getIdade())
			return mens;
		else
		return "";
		
	}
	public static String respostaDados1(Pessoa p1, Pessoa p2, String mens){
	mens = "A pessoa mais velha é " + p2.getNome();
		if (p2.getIdade() > p1.getIdade())
		return mens;
	else
		return "";
	}
	public static String respostaDados2(Pessoa p1, Pessoa p2, String mens){
	mens = "As pessoas tem a mesma idade.";
		if (p2.getIdade() == p1.getIdade())
			return mens;
		else
		return "";
	}
	
	public static String digitaNome() {
		Scanner e = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		return e.nextLine();

	}

	public static int digitaIdade(){
		Scanner e = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		return e.nextInt();
	}
	
}