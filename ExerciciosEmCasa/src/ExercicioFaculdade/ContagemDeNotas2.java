package ExercicioFaculdade;

import java.util.Scanner;

public class ContagemDeNotas2 {

	static Scanner en = new Scanner(System.in);

	public static void main(String[] args) {

		int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;
		;
		boolean a = true;

		while (a) {
			switch (menu()) {
			case '1':
				int valorTotal = Integer.parseInt(digita("Digite um valor: "));

				if (valorTotal > 1) {
					for (valorTotal = valorTotal; valorTotal >= 100;) {
						valorTotal = valorTotal - 100;
						nota100++;
					}

					for (valorTotal = valorTotal; valorTotal >= 50;) {
						valorTotal = valorTotal - 50;
						nota50++;
					}

					for (valorTotal = valorTotal; valorTotal >= 20;) {
						valorTotal = valorTotal - 20;
						nota20++;
					}

					for (valorTotal = valorTotal; valorTotal >= 10;) {
						valorTotal = valorTotal - 10;
						nota10++;
					}

					for (valorTotal = valorTotal; valorTotal >= 5;) {
						valorTotal = valorTotal - 5;
						nota5++;
					}

					for (valorTotal = valorTotal; valorTotal >= 2;) {
						valorTotal = valorTotal - 2;
						nota2++;
					}

					System.out.println("Quantidade de notas:" + "\n100: " + nota100 + 
					"\n50: "+ nota50 + 
					"\n20: "+ nota20 + 
					"\n10: "+ nota10 +
					"\n5: " + nota5 + 
					"\n2: " + nota2);

					retorno("");

				} else if (valorTotal <= 1 || valorTotal % 2 == 1) {
					retorno("Valor muito baixo.");
				}
				break;
			case '2':
				System.out.println("Encerrando...");
				a = false;
			}
		}
	}

	private static char menu() {
		System.out.println("\nMENU" + "\n1) Sacar Dinheiro" + "\n2) Sair do programa" + "\nEscolha: ");
		String st = en.nextLine();
		return st.charAt(0);
	}

	public static String digita(String mensagem) {
		System.out.println(mensagem);
		return en.nextLine();
	}

	public static void retorno(String mensagem) {
		System.out.println(mensagem + "\nAperte enter para voltar ao início.");
		digita("");
	}

}
