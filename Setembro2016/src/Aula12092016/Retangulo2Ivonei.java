package Aula12092016;

import java.util.Scanner;

public class Retangulo2Ivonei {

	public static void main(String[] args) {
		montaFigura(digita());
	}// --------------------final main

	private static void montaFigura(int i) {
		for (int l = 0; l < 10; l++) {
			System.out.print("\n"+mostraEspaco(i));
			for (int c = 0; c < 10; c++) {
				System.out.print("*");
			}
		}
	}//--------------------------

	private static String mostraEspaco(int i) {
		String st = "";
		for (int k=0; k<i; k++)
			st+=" ";
		return st;
	}//--------------------------
	
	static int digita(){
		Scanner e = new Scanner(System.in);
		System.out.print("Digite a coluna inicial: ");
		return e.nextInt();
	}//--------------------------

}// ------------------------final classe
