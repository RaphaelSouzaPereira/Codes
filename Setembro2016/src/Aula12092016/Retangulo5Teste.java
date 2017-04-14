package Aula12092016;

public class Retangulo5Teste {

	public static void main(String[] args) {
		
		
		for (int l = 0; l < 10; l++) {
			System.out.print("*");
			
			if (l == 0 || l == 9)
				System.out.print("*");
			else
				System.out.print(" ");

			if (l == 1 || l == 8)
				System.out.print(" ");
			else
				System.out.print("*");

			if (l == 0 || l == 2 || l == 7 || l == 9)
				System.out.print("*");
			else
				System.out.print(" ");

			if (l == 1 || l == 3 || l == 6 || l == 8)
				System.out.print(" ");
			else
				System.out.print("*");
			if (l == 0 || l == 2 || l == 7 || l == 9)
				System.out.print("*");
			else
				System.out.print(" ");
			if (l == 1 || l == 8)
				System.out.print(" ");
			else
				System.out.print("*");
			if (l == 0 || l == 9)
				System.out.print("*");
			else
				System.out.print(" ");
			System.out.print("*");

			System.out.print("\n");

		}

	}
}