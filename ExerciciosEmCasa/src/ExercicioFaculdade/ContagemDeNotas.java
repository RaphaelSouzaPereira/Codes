package ExercicioFaculdade;

import java.util.Scanner;

public class ContagemDeNotas {

	public static void main(String[] args) {
		int contaNota100 = 0, contaNota50 = 0, contaNota20 = 0, contaNota10 = 0;

		boolean teste = true;
		while (teste) {
			switch (menu()) {
			case '1':
				int valor = Integer.parseInt(digita("Digite um valor"));
				int tira100 = valor, tira50 = valor, tira20 = valor, tira10 = valor;
				if (valor > 9) {

					for (int cem = 100; cem <= tira100;) {
						if (cem <= tira100) {
							tira100 = tira100 - 100;
						}
						contaNota100++;
					}
					System.out.println("Qt de notas de 100: " + contaNota100 + " e faltam " + tira100 + " Reais");

					for (int cin = 50; cin <= tira50;) {
						if (cin <= tira50) {
							tira50 = tira50 - 50;
						}
						contaNota50++;
					}
					System.out.println("Qt de notas de 50: " + contaNota50 + " e faltam " + tira50 + " Reais");

					for (int vin = 20; vin <= tira20;) {
						if (vin <= tira20) {
							tira20 = tira20 - 20;
						}
						contaNota20++;
					}
					System.out.println("Qt de notas de 20: " + contaNota20 + " e faltam " + tira20 + " Reais");

					for (int dez = 10; dez <= tira10;) {
						if (dez <= tira10) {
							tira10 = tira10 - 10;
						}
						contaNota10++;
					}
					System.out.println("Qt de notas de 10: " + contaNota10 + " e faltam " + tira10 + " Reais");

				} else if (valor >= 0 && valor <= 9) {
					valorBaixo();

				}
				else if (tira10 <= 0) {
					valorOk();
				}
				break;
			case '2':
				System.out.println("Fim do programa.");
				teste = false;
			}
		}
	}

	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Sacar Dinheiro";
		st += "\n2- Sair do programa;";
		st += "\nEscolha: ";
		return digita(st).charAt(0);
	}

	private static void valorBaixo() {
		System.out.println("Valor muito baixo.");
		System.out.println("Aperte Enter para volta ao Inicio.");
		digita("");

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

}
