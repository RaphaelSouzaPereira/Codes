package Aula12092016;

public class Retangulo5Ivonei {

	public static void main(String[] args) {
		int c1 = 1;
		// =====================retangulo mínimo totLinhas=4 e totColunas=4
		int totLinhas  = 25;
		int totColunas = 25;

		int meiaCol = (totColunas - 1) / 2;
		boolean inverte = false;

		for (int lin = 0; lin < totLinhas; lin++) {
			System.out.println();
			///////////////////////////////////////////parte 1
			for (int i1 = 0; i1 < c1; i1++)
				if (i1 % 2 == 1)
					System.out.print(" ");
				else
					System.out.print("*");

			/////////////////////////////////////////parte 2 - metade
			for (int i2 = 0; i2 < meiaCol; i2++)
				if (lin % 2 == 0)
					System.out.print("*");
				else
					System.out.print(" ");
			
			////////////////////////////////////////parte 3 - metade invertida
			for (int i2 = 0; i2 < meiaCol; i2++)
				if (lin % 2 == 0)
					System.out.print("*");
				else
					System.out.print(" ");
			///////////////////////////////////////parte 4 - parte 1 invertida
			for (int i1 = 0; i1 < c1; i1++)
				if (lin % 2 == 0)
					if (i1 % 2 == 1)
						System.out.print(" ");
					else
						System.out.print("*");
				else if (i1 % 2 == 0)
					System.out.print(" ");
				else
					System.out.print("*");

			if (!inverte) {
				if (((totLinhas - 1) / 2) == lin) {// exatamente a metade
					c1--;
					meiaCol = ((totColunas - 1) / 2) - lin + 1;
					inverte = true;
				} else {
					c1++;
					meiaCol--;
				}

			} else {
				c1--;
				meiaCol++;
			}
		}

	}// -------------------------------------

}// ----------------------------------------------
