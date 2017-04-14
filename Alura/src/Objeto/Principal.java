package Objeto;

import java.util.Scanner;

public class Principal {

	static Funcionario p1 = new Funcionario();
	

	public static void main(String[] args) {

		digitaDados();
		calculoAno();
		mostraDados();
		
	}
		

	private static void mostraDados() {
		System.out.println(p1);
		System.out.println("O valor do sal�rio somando 12 meses �: "+calculoAno());
		
	}

	private static Double calculoAno() {
		return (p1.getSalario()*12);
	}

	private static Double recebeAumento(double valor) {
		p1.setSalario(p1.getSalario() + valor);
		return p1.getSalario();

	}

	private static void digitaDados() {
		p1.setNome(digita("Digite o nome do funcion�rio: "));
		p1.data.setDia(Integer.parseInt(digita("Digite o dia de entrada: ")));
		p1.data.setMes(Integer.parseInt(digita("Digite o m�s de entrada: ")));
		p1.data.setAno(Integer.parseInt(digita("Digite o ano de entrada: ")));
		p1.setRg(digita("Digite o RG do funcionario: "));
		p1.setSalario(Double.parseDouble(digita("Digite o valor do sal�rio do funcion�rio: ")));
		p1.setSalario(recebeAumento(Double.parseDouble(digita("Digite o valor do aumento caso aja: "))));
	}

	private static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();

	}
}