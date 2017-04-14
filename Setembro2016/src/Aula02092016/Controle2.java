package Aula02092016;
import java.util.Scanner;

public class Controle2 {

	public static void main(String[] args) {
		Lampada2 lamp = new Lampada2();
		
		do {
			if (apertaBotaoZero())
				lamp.setLampada();
			System.out.println(lamp.statusLampada());
		} while (true);

	}// ------final main

	private static boolean apertaBotaoZero() {
		if (digita() == 0)
			return true;
		return false;
	}

	private static int digita() {
		Scanner e = new Scanner(System.in);
		System.out.print("Digite 0 para ligar ou desligar a lampada: ");
		return e.nextInt();
	}
}// --------final classe
