package Aula05092016;
import java.util.Scanner;

public class Calculadora2 {
	static int n1, n2;
	static char operacao;
	
	static boolean n1Ok = false;
	static boolean n2Ok = false;
	static boolean opOk = false;

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		do {
			System.out.println("\n\nMENU");
			System.out.println("1- Digite n1");
			System.out.println("2- Digite n2");
			System.out.println("3- Escolha operação");
			System.out.println("4- Mostre o resultado");
			System.out.print("Escolha uma opção: ");

			opcao = e.nextInt();

			switch(opcao){
			case 1:
				recebeN1();
				n1Ok = true;
				break;
			case 2:
				recebeN2();
				n2Ok = true;
				break;
			case 3:
				recebeOperacao();
				opOk = true;
				break;
			case 4:
				MostraResultado();
				break;
			default:
				System.out.println("Erro. Opção inválida.");
			}
			
		} while (true);

	}//--------------------------------final do main

	private static void recebeN1() {
		System.out.print("Digite n1: ");
		n1 = e.nextInt();
	}//-----------------------------

	private static void recebeN2() {
		System.out.print("Digite n2: ");
		n2 = e.nextInt();
	}//-----------------------------

	private static void recebeOperacao() {
		do {
			System.out.print("Escolha uma operação (+ - * /): ");
			operacao = e.next().charAt(0);
			
			if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/')
				System.out.println("...ERRO. Digite o sinal correto.");
			else
				break;
				
		} while (true);
	}//-----------------------------

	private static void MostraResultado() {
		if (n1Ok && n2Ok && opOk) {
			System.out.println("....Resultado: " + realizaOperacao());
		} else
			System.out.println("...Erro. É necessário escolher os números e a operação.");
	}//-----------------------------

	private static String realizaOperacao() {
		if (operacao == '+')
			return ""+(n1 + n2);
		if (operacao == '-')
			return ""+(n1 - n2);
		if (operacao == '*')
			return ""+(n1 * n2);
		
		if (n2 != 0)
			return ""+(n1 / n2);
		return "...Erro. Impossível divisao por zero.";
	}//-----------------------------

}// final da classe
