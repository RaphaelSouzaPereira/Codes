package Aula21102016;

import java.util.Scanner;

public class Controle {

	static int tamanho = 10;
	static Partido vPartido[] = new Partido[tamanho];
	static Deputado vDeputado[] = new Deputado[tamanho];
	static int i = 0;
	static int i2 = 0;

	public static void main(String[] args) {

		criaPartidos();
		boolean teste = true;

		while (teste) {

			switch (menu()) {
			case '1':
				cadastrarPartidos();
				break;

			case '2':
				listaPartidos();
				break;

			case '3':
				cadastrarDeputado();
				break;

			case '4':
				listaDeputados();
				break;
			case '5':
				listaCorruptos();
				break;

			case '6':
				sair(teste);
			}
		}
	}

	private static void criaPartidos() {
		for (int p = 0; p > vPartido.length; p++) {
			vPartido[i] = new Partido();
			vDeputado[i] = new Deputado();
		}

	}

	private static void sair(boolean teste) {
		char a = digita("Tem certeza que deseja sair?" + "\n [s]im ou [n]ão").charAt(0);
		if (a == 's') {
			teste = false;
		} else
			teste = true;

	}

	private static void listaCorruptos() {
		for (int e = 0; e < 10; e++) {
			if (vDeputado[e].getIndicadorCorrupcao() == 5) {
				System.out.println(vDeputado[e].getNome() + " - " + vDeputado[e].getPartido().getSigla() + " - "
						+ vDeputado[e].getPartido().getNumero());
			}
		}
	}

	private static void listaDeputados() {
		for (int b = 0; b < tamanho; b++) {
			if (vDeputado[b] != null) {
				System.out.println(vDeputado[b].getNome() + " - " + vDeputado[b].getPartido().getSigla() + " - "
						+ vDeputado[b].getPartido().getNumero());
			}
		}
	}

	private static void cadastrarDeputado() {
		if (i2 < tamanho) {
			vDeputado[i2] = new Deputado();
			vDeputado[i2].setNome(digita("Qual o nome do deputado?"));
			System.out.println("Selecione um dos partidos");
			listaPartidos();
			int escolha = Integer.parseInt(digita("Qual o partido do deputado?"));
			if (escolha == 1) {
				vDeputado[i2].setPartido(vPartido[0]);
			}
			if (escolha == 2) {
				vDeputado[i2].setPartido(vPartido[1]);
			}
			if (escolha == 3) {
				vDeputado[i2].setPartido(vPartido[2]);
			}
			if (escolha == 4) {
				vDeputado[i2].setPartido(vPartido[3]);
			}
			if (escolha == 5) {
				vDeputado[i2].setPartido(vPartido[4]);
			}
			if (escolha == 6) {
				vDeputado[i2].setPartido(vPartido[5]);
			}
			if (escolha == 7) {
				vDeputado[i2].setPartido(vPartido[6]);
			}
			if (escolha == 8) {
				vDeputado[i2].setPartido(vPartido[7]);
			}
			if (escolha == 9) {
				vDeputado[i2].setPartido(vPartido[8]);
			}
			if (escolha == 10) {
				vDeputado[i2].setPartido(vPartido[9]);
			}
			System.out.println("Qual o nível de corrupção do candidato?");
			System.out
					.println("0- indica não corrupto\n" + "1- indica quase corrupto \n" + "2- indica pouco corrupto \n"
							+ "3- indica médio corrupto \n" + "4- indica corrupto \n" + "5- indica muito corrupto");
			int nivel = Integer.parseInt(digita("Escolha: "));
			if (nivel == 0) {
				vDeputado[i2].setIndicadorCorrupcao(0);
			}
			if (nivel == 1) {
				vDeputado[i2].setIndicadorCorrupcao(1);
			}
			if (nivel == 2) {
				vDeputado[i2].setIndicadorCorrupcao(2);
			}
			if (nivel == 3) {
				vDeputado[i2].setIndicadorCorrupcao(3);
			}
			if (nivel == 4) {
				vDeputado[i2].setIndicadorCorrupcao(4);
			}
			if (nivel == 5) {
				vDeputado[i2].setIndicadorCorrupcao(5);
			}
		}
		i2++;
	}

	private static void cadastrarPartidos() {

		if (i < tamanho) {
			vPartido[i] = new Partido();
			vPartido[i].setSigla(digita("Qual a sigla do partido?"));
			vPartido[i].setNumero(Integer.parseInt(digita("Qual o numero do partido?")));
			i++;

		}
	}

	private static void listaPartidos() {

		for (int a = 0; a < vPartido.length; a++) {
			if (vPartido[a] != null) {
				System.out.println((a + 1) + " - " + vPartido[a].getSigla() + " - " + vPartido[a].getNumero());
			}
		}

	}

	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Cadastrar Partidos";
		st += "\n2- Listagem de Partidos";
		st += "\n3- Cadastrar Deputados";
		st += "\n4- Listagem de Deputados";
		st += "\n5- Listagem dos Corruptos";
		st += "\n6- Para sair";
		st += "\nEscolha: ";
		return digita(st).charAt(0);
	}

	public static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}

}
