package Aula04112016;

import java.util.Scanner;

public class Venda {

	static final int tamanho = 20;
	static Bike vBike[] = new Bike[tamanho];
	static int indice = 0;
	static boolean teste = true;

	public static void main(String[] args) {

		criaBikes();

		do {
			switch (menu()) {
			case '1':
				cadastraBike();
				break;
			case '2':
				listaBikes();
				break;
			case '3':
				lista();
				break;
			case '4':
				System.out.println("Fim do programa!");
				teste = false;
				break;
			}

		} while (teste);

	}

	private static void criaBikes() {
		for (int i = 0; i < tamanho; i++) {
			vBike[i] = new Bike();
		}

	}

	private static void lista() {

		int escolha = Integer.parseInt(digita("Qual das opções você quer?" + "\n1 - para a Bike mais barata" + "\nou"
				+ "\n2- para a Bike apartir da quantidade de Marchas a sua escolha:"));
		if (escolha == 1) {
			Bike mBike = vBike[0];
			for (int i = 0; i < indice; i++) {
				if (vBike[i].getValor() < mBike.getValor()) {
					mBike = vBike[i];
				}
			}
			System.out.println("Mais BARATA: " + " Ano: " + mBike.getAno() + " Marca: " + mBike.getMarca()
					+ " Marchas: " + mBike.getQtMarchas() + " Cor: " + mBike.getCor() + " Valor: " + mBike.getValor());
		}
		if (escolha == 2) {
			int marcha = Integer.parseInt(digita("Digite a quantidade de Marchas que você deseja: "));
			for (int i = 0; i < indice; i++) {
				if (vBike[i].getQtMarchas() == marcha) {
					System.out.println("Ano: " + vBike[i].getAno() + " Marca: " + vBike[i].getMarca() + " Marchas: "
							+ vBike[i].getQtMarchas() + " Cor: " + vBike[i].getCor() + " Valor: "
							+ vBike[i].getValor());
				
				}
			}
		}
	}

	private static void listaBikes() {
		for (int i = 0; i < indice; i++) {
			System.out.println("Ano: " + vBike[i].getAno() + " Marca: " + vBike[i].getMarca() + " Marchas: "
					+ vBike[i].getQtMarchas() + " Cor: " + vBike[i].getCor() + " Valor: " + vBike[i].getValor());

		}

	}

	private static void cadastraBike() {
		if (indice < tamanho) {
			vBike[indice] = new Bike();
			vBike[indice].setAno(Integer.parseInt(digita("Qual o ano da Bike?")));
			anoOk();
			vBike[indice].setValor(Double.parseDouble(digita("Qual o valor da Bike?")));
			valorOk();
			vBike[indice].setMarca(digita("Qual a marca da Bike?"));
			vBike[indice].setQtMarchas(Integer.parseInt(digita("Quantas marchas tem a Bike?")));
			vBike[indice].setCor(digita("Qual a cor da Bike?"));
			indice++;
		} else {
			System.out.println("Você excedeu o número de Cadastros.");
			System.out.println("Aperte Enter para volta ao Inicio.");
			digita("");
		}

	}

	private static void valorOk() {
		if (vBike[indice].getValor() <= 0) {
			do {
				teste = true;
				vBike[indice].setValor(Double.parseDouble(digita("Valor tem que ser maior que 0 digite novamente: ")));
				if (vBike[indice].getValor() > 0) {
					teste = false;
				}

			} while (teste);
		}

	}

	private static void anoOk() {
		if (vBike[indice].getAno() < 1700 || vBike[indice].getAno() > 2016) {

			do {
				vBike[indice].setAno(Integer.parseInt(digita("Ano inválido digite novamente entre 1700 a 2016: ")));
				if (vBike[indice].getAno() < 1700 || vBike[indice].getAno() > 2016) {
					teste = true;
				} else {
					teste = false;
				}
			} while (teste);
		}

	}

	public static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}

	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Cadastra Bike";
		st += "\n2- Lista Bike";
		st += "\n3- Lista";
		st += "\n4- Sair";
		st += "\nEscolha: ";
		return digita(st).charAt(0);

	}

}
