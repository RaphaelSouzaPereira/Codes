package ExercicioFaculdade;

import java.util.Scanner;

public class ContagemDeNotas4 {
	static int notasIni100 = 10;
	static int notasIni50 = 10;
	static int notasIni20 = 10;
	static int notasIni10 = 10;

	static double limite = 800.00;

	public static void main(String[] args) {
		int valor = 0;
		int QtNotas100 = 0;
		int QtNotas50 = 0;
		int QtNotas20 = 0;
		int QtNotas10 = 0;
		int valorMaximo = 800;
		int senhaErrada = 0;

		while (true) {
			if (senhaErrada == 2)
				System.exit(0);

			if (notasIni100 + notasIni50 + notasIni20 + notasIni10 == 0)
				System.out
						.println("\n*******************************************"
								+ "\n  Terminal sem notas. Chame um Funcionario."
								+ "\n*******************************************");
			if (senhaOk()) {
				senhaErrada = 0;
				do {
					valor = digitavalor();
					if (valor <= limite)
						break;
					System.out.println("   Valor fora do limite.");
				} while (true);

				if (valor % notaMinima() > 0)
					System.out
							.println("...Erro. Este valor não pode ser pago!");
				else {
					mostraQtNotasIniciais();
					if (notasIni100 > 0) {
						QtNotas100 = valor / 100;
						if (notasIni100 >= QtNotas100) {
							notasIni100 -= QtNotas100;
							valor = valor % 100;
						} else {
							QtNotas100 = notasIni100;
							notasIni100 = 0;
							valor = valor - (QtNotas100 * 100);
						}
					}

					if (notasIni50 > 0) {
						QtNotas50 = valor / 50;
						if (notasIni50 >= QtNotas50) {
							notasIni50 -= QtNotas50;
							valor = valor % 50;
						} else {
							QtNotas50 = notasIni50;
							notasIni50 = 0;
							valor = valor - (QtNotas50 * 50);
						}
					}

					if (notasIni20 > 0) {
						QtNotas20 = valor / 20;
						if (notasIni20 >= QtNotas20) {
							notasIni20 -= QtNotas20;
							valor = valor % 20;
						} else {
							QtNotas20 = notasIni20;
							notasIni20 = 0;
							valor = valor - (QtNotas20 * 20);
						}
					}

					if (notasIni10 > 0) {
						QtNotas10 = valor / 10;
						if (notasIni10 >= QtNotas10) {
							notasIni10 -= QtNotas10;
							valor = valor % 10;
						} else {
							QtNotas10 = notasIni10;
							notasIni10 = 0;
							valor = valor - (QtNotas10 * 10);
						}
					}

					if (valor == 0) {
						System.out.println("\n============================\n"
								+ "\n...Retire suas notas:\n   Qt 100: "
								+ QtNotas100);
						System.out.println("   Qt 50 : " + QtNotas50);
						System.out.println("   Qt 20 : " + QtNotas20);
						System.out.println("   Qt 10 : " + QtNotas10);
					} else
						System.out.println("   Este valor não pode ser pago.");

					mostraQtNotasIniciais();
				}
			} else {
				System.out.println("...Senha não válida! Tente novamente. ");
				senhaErrada++;
			}
		}
	}

	private static int notaMinima() {
		if (notasIni10 > 0)
			return 10;
		if (notasIni20 > 0)
			return 20;
		if (notasIni50 > 0)
			return 50;
		return 100;
	}

	static void mostraQtNotasIniciais() {
		System.out.println("\n============================\n"
				+ "   Qt inicial 100: " + notasIni100);
		System.out.println("   Qt inicial 50 : " + notasIni50);
		System.out.println("   Qt inicial 20 : " + notasIni20);
		System.out.println("   Qt inicial 10 : " + notasIni10);
	}

	static boolean senhaOk() {
		Scanner e = new Scanner(System.in);
		System.out.println("\n///////////////////\nDigite a senha: ");
		int senha = e.nextInt();
		if (senha == 123)
			return true;
		return false;
	}

	static int digitavalor() {
		Scanner e = new Scanner(System.in);
		int valor = 0;
		do {
			System.out.print("\n============================\n"
					+ "Digite um valor: ");
			valor = e.nextInt();
			if (valor < 10)
				System.out
						.println("Para este valor nenhuma nota pode ser utilizada.");
			else if (valor < 1)
				System.out.println("Valor menor que um não vale.");
			else
				break;
		} while (true);
		return valor;
	}
}

// Existe um erro de lógica neste código. Qual é?

