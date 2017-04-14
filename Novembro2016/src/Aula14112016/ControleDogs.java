package Aula14112016;

import java.util.Scanner;

public class ControleDogs {

	static final int tamanho = 10;
	static Cachorro vCachorro[] = new Cachorro[tamanho];
	static int ind = 0;
	static boolean teste = true;

	public static void main(String[] args) {

		criaDogs();

		do {
			switch (menu()) {
			case '1':
				cadastraDogs();
				break;
			case '2':
				listaDogs();
				break;
			case '0':
				System.out.println("Fim do programa!");
				teste = false;
				break;
			}
		} while (teste);
	}

	private static void listaDogs() {

		double dogP = 0, dogM = 0, dogG = 0;

		if (vCachorro[0] != null) {
			for (int i = 0; i < ind; i++) {
				System.out.println((i + 1) + "- Nome: "
						+ vCachorro[i].getNome() + " - Idade: "
						+ vCachorro[i].getIdade() + " - Porte: "
						+ vCachorro[i].getPorte());
			}

			System.out.println("\nO total de Cachorros é: " + ind);
			System.out.println("\nO total de Cachorros pequenos é: "+ totalDog('p','P'));
			System.out.println("E isso é " + calcula('p','P')+ "% do total de Cachorros cadastrados.");
			
			System.out.println("\nO total de Cachorros médios é: "+ totalDog('m','M'));
			System.out.println("E isso é " + calcula('m','M')+ "% do total de Cachorros cadastrados.");
			
			System.out.println("\nO total de Cachorros grandes é: "+ totalDog('g','G'));
			System.out.println("E isso é " + calcula('g','G')+ "% do total de Cachorros cadastrados.");

		} else {
			System.out.println("Você não cadastrou cachorros ainda.");
			System.out
					.println("Aperte Enter para volta ao Inicio e cadastrar.");
			digita("");
		}
	}

	private static int totalDog(char porte1, char porte2) {
		int contador = 0;
		for (int i = 0; i < ind; i++) {
			if (vCachorro[i].getPorte() == porte1
					&& vCachorro[i].getPorte() == porte1) {
				contador++;
			}

		}
		return contador;
	}

	private static double calcula(char porte1, char porte2) {
		int contador = 0;
		int total = 0;
		double calculo = 0;
		for (int i = 0; i < ind; i++) {
			if (vCachorro[i].getPorte() == porte1
					&& vCachorro[i].getPorte() == porte1) {
				total++;
			}
		}
		return calculo = (total * 100) / ind;

	}

	private static void cadastraDogs() {
		if (ind < tamanho) {
			vCachorro[ind] = new Cachorro();
			vCachorro[ind].setNome(digita("Qual o nome do cachorro?"));
			boolean teste2 = true;
			while (teste2  == true) {
				try {
					vCachorro[ind].setIdade(Integer
							.parseInt(digita("Qual a idade do cachorro?")));
					teste2 = false;
				} catch (Exception e) {
					System.out.println("APENAS Números!");
					teste2 = true;
				}
			}
			
			vCachorro[ind]
					.setPorte(digita(
							"Qual o tamanho do cachorro [P]equeno, [M]édio ou [G]rande")
							.charAt(0));
			while (vCachorro[ind].getPorte() != 'p'
					&& vCachorro[ind].getPorte() != 'P'
					&& vCachorro[ind].getPorte() != 'm'
					&& vCachorro[ind].getPorte() != 'M'
					&& vCachorro[ind].getPorte() != 'g'
					&& vCachorro[ind].getPorte() != 'G') {
				vCachorro[ind].setPorte(digita("Digite o porte correto: [P]equeno, [M]édio ou [G]rande")
								.charAt(0));
			}
			ind++;
		} else {
			System.out.println("Você excedeu o número de Cadastros.");
			System.out.println("Aperte Enter para volta ao Inicio.");
			digita("");
		}
	}

	private static void criaDogs() {
		for (int i = 0; i < tamanho; i++) {
			vCachorro[i] = new Cachorro();
			vCachorro[i] = null;
		}

	}

	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Cadastra Animal";
		st += "\n2- Relatório";
		st += "\n0- Sair";
		st += "\nEscolha: ";
		return digita(st).charAt(0);

	}

	private static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}
}
