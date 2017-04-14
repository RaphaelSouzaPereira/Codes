package Aula02092016;
import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		do {

			if (digita() == 0)
				if (lamp.getLampada())
					lamp.setLampada(false);
				else
					lamp.setLampada(true);

			if (lamp.getLampada())
				System.out.println("....Lampada Ligada.");
			else
				System.out.println("....Lampada Desligada.");

		} while (true);

	}// ------final main

	private static int digita() {
		Scanner e = new Scanner(System.in);
		System.out.print("Digite 0 para ligar ou desligar a lampada: ");
		return e.nextInt();
	}
}// --------final classe
