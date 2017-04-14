package Aula07102016;

import java.util.Scanner;

public class ListaCompras {

	static Item lista[] = new Item[20];
	static int indice = 0;

	public static void main(String[] args) {

		boolean teste = true;
		while (teste) {
			switch (menu()) {
			case '1':
				criaLista();
				break;

			case '2':
				if (criaItensOk() == true) {
					conferirCompras();
				}
				break;

			case '3':
				if (criaItensOk() == true) {
					relatorio();
				}

				break;

			case '4':
				System.out.println("Fim do programa!");
				teste = false;
				break;
			}
		}

	}// -------------------------MAIN--------------------

	private static boolean criaItensOk() {
		int i = 0;
		boolean conferir = true;
		if (lista[i] == null) {
			conferir = false;
			System.out.println("Você não criou sua lista ainda. ");
			System.out.println("Aperte Enter para volta ao Inicio.");
			digita("");

		}
		return conferir;

	}

	private static void relatorio() {
		int conta = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getComprado() == false) {
				System.out.println(lista[i] + " não foi comprado.");
				conta++;
			}
		}
		System.out.println("Faltam " + conta + " produtos;");

	}

	private static void conferirCompras() {

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			char comprado = digita("Ele foi comprado [s]im ou [n]ão.").charAt(0);
			if (comprado == 's') {
				lista[i].setComprado(true);

			} else
				lista[i].setComprado(false);
		}

	}

	private static void criaLista() {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = new Item();
			lista[i].setNomeProduto(digita("Digite o nome do produto: "));
			indice = Integer.parseInt(digita("Digite a quantidade do produto: "));
			if (indice > 0) {
				lista[i].setQuantidade(indice);
			} else {
				valorOk();
			}
		}
	}

	private static void valorOk() {
		System.out.println("Valor inválido.");
		System.out.println("Aperte Enter para volta ao Inicio.");
		digita("");

	}

	private static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}

	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Criar Lista Compras";
		st += "\n2- Conferir Compras";
		st += "\n3- Relatório";
		st += "\n4- Sair da Lista";
		st += "\nEscolha: ";
		return digita(st).charAt(0);
	}

}// -------------------------CLASS-------------------
