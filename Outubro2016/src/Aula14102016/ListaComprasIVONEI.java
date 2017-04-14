package Aula14102016;
import java.util.Scanner;

public class ListaComprasIVONEI {
	static final int tamanho = 20; // constante
	static Item lista[] = new Item[tamanho];
	static int indice = 0;

	public static void main(String[] args) {
		String menu = "\n";
		menu += "\nMENU";
		menu += "\n=========================";
		menu += "\n1- Criar Lista Compras";
		menu += "\n2- Conferir Compras";
		menu += "\n3- Relatorio";
		menu += "\n   Escolha: ";
		char op;
		while (true) {
			System.out.println(menu);
			switch (digita().charAt(0)) {
			case '1':
				criarLista();
				break;
			case '2':
				conferirCompras();
				break;
			case '3':
				relatorio();
				break;
			}
		}
	}// ---------------------------final main

	private static void relatorio() {
		for (int i = 0; i < indice; i++) {
			if (lista[i].getComprado() == false) {
				System.out.println(lista[i].getNomeProduto());
				System.out.println(lista[i].getQt());
				System.out.println(lista[i].getComprado());
			}
		}
	}

	private static void conferirCompras() {
		char resp;
		for (int i = 0; i < indice; i++) {
			System.out.print("Item: " + lista[i].getNomeProduto() + " foi comprado? s/n: ");
			resp = digita().charAt(0);
			if (resp == 's')
				lista[i].setComprado(true);
		}
	}

	private static void criarLista() {
		String aux;
		do {
			System.out.print("...Nome Produto: ");
			aux = digita();
			if (aux.equals("fim")) // if (aux == "fim")
				break; // System.out.println("Voltando...");
			else {
				if (indice < tamanho) {
					lista[indice] = new Item();
					lista[indice].setNomeProduto(aux);

					do {
						System.out.print("...Quantidade: ");
						lista[indice].setQt(Integer.parseInt(digita()));
						if (lista[indice].getQt() <= 0)
							System.out.println("ERRO.");
					} while (lista[indice].getQt() <= 0);
					lista[indice].setComprado(false);
					indice++;
					System.out.println("Total de itens: "+indice);
				}
			}
		} while (true);
	}

	private static String digita() {
		Scanner e = new Scanner(System.in);
		return e.next();
	}

}// ------------------------------ final classe
