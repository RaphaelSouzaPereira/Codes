package Aula29082016;

import java.util.Scanner;

public class Exercicio061 {

	public static void main(String[] args) {
		Exercicio061PessoaseSalario p1 = new Exercicio061PessoaseSalario();
		Exercicio061PessoaseSalario p2 = new Exercicio061PessoaseSalario();
		Exercicio061PessoaseSalario p3 = new Exercicio061PessoaseSalario();
		Exercicio061PessoaseSalario p4 = new Exercicio061PessoaseSalario();
		Exercicio061PessoaseSalario p5 = new Exercicio061PessoaseSalario();

		p1.setNome(digitaNome());
		p1.setSalario(digitaSalario());
		p2.setNome(digitaNome());
		p2.setSalario(digitaSalario());
		p3.setNome(digitaNome());
		p3.setSalario(digitaSalario());
		p4.setNome(digitaNome());
		p4.setSalario(digitaSalario());
		p5.setNome(digitaNome());
		p5.setSalario(digitaSalario());

		System.out.println(respostaDados(p1.getSalario(), p2.getSalario(),
				p3.getSalario(), p4.getSalario(), p5.getSalario(),
				p1.getNome(), p2.getNome(), p3.getNome(), p4.getNome(),
				p5.getNome()));
		System.out.println(respostaDados2(p1.getSalario(), p2.getSalario(),
				p3.getSalario(), p4.getSalario(), p5.getSalario(),
				p1.getNome(), p2.getNome(), p3.getNome(), p4.getNome(),
				p5.getNome()));
		System.out.println("E a média dos salários é: "
				+ mostraMedia(p1.getSalario(), p2.getSalario(),
						p3.getSalario(), p4.getSalario(), p5.getSalario()));

	}// main

	private static String respostaDados2(float p1, float p2, float p3,
			float p4, float p5, String n1, String n2, String n3, String n4,
			String n5) {
		if (p1 == p2)
			return "As pessoas: " + n1 + " e " + n2
					+ " tem o mesmo salário que é de " + p1;
		else if (p1 == p3)
			return "As pessoas: " + n1 + " e " + n3
					+ " tem o mesmo salário que é de " + p1;
		else if (p1 == p4)
			return "As pessoas: " + n1 + " e " + n4
					+ " tem o mesmo salário que é de " + p1;
		else if (p1 == p5)
			return "As pessoas: " + n1 + " e " + n5
					+ " tem o mesmo salário que é de " + p1;
		else if (p2 == p3)
			return "As pessoas: " + n2 + " e " + n3
					+ " tem o mesmo salário que é de " + p2;
		else if (p2 == p4)
			return "As pessoas: " + n2 + " e " + n4
					+ " tem o mesmo salário que é de " + p2;
		else if (p2 == p5)
			return "As pessoas: " + n2 + " e " + n5
					+ " tem o mesmo salário que é de " + p2;
		else if (p3 == p4)
			return "As pessoas: " + n3 + " e " + n4
					+ " tem o mesmo salário que é de " + p3;
		else if (p3 == p5)
			return "As pessoas: " + n3 + " e " + n5
					+ " tem o mesmo salário que é de " + p3;
		else if (p4 == p5)
			return "As pessoas: " + n4 + " e " + n5
					+ " tem o mesmo salário que é de " + p1;
		else
			return "";
	}

	private static float mostraMedia(float p1, float p2, float p3, float p4,
			float p5) {
		float media = ((p1 + p2 + p3 + p4 + p5) / 5);
		return media;
	}

	private static String respostaDados(float p1, float p2, float p3, float p4, float p5, String n1, String n2, String n3, String n4, String n5) {
		if (p1>p2 && p1>p3 && p1>p4 && p1>p5)
			return "A pessoa com o maior salário é: "+n1+" e seu salário é: "+p1;
			else if (p2>p1 && p2>p3 && p2>p4 && p2>p5)
				return "A pessoa com o maior salário é: "+n2+" e seu salário é: "+p2;
			else if (p3>p1 && p3>p2 && p3>p4 && p3>p5)
				return "A pessoa com o maior salário é: "+n3+" e seu salário é: "+p3;
			else if (p4>p1 && p4>p2 && p4>p3 && p4>p5)
				return "A pessoa com o maior salário é: "+n4+" e seu salário é: "+p4;
			else if (p5>p1 && p5>p2 && p5>p3 && p5>p4)
				return "A pessoa com o maior salário é: "+n5+" e seu salário é: "+p5;
		else
			return "Error";
		
	}

	private static float digitaSalario() {
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		return e.nextFloat();
	}

	private static String digitaNome() {
		Scanner e = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		return e.nextLine();
	}

}
