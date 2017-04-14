package Aula15082016;
import java.util.Scanner;
public class Exercicio09 {
	static float x=0 , y=0 , z=0;
	public static void main(String[] args) {
	
	x = digitaDados("Digite o primeiro numero x: ");
	y = digitaDados("Digite o segundo numero y: ");
	z = digitaDados("Digite o terceiro numero z: ");	
	mostraResultado(x, y, z);
	
}
	private static void mostraResultado(float x, float y, float z) {
		float conta = ((x-5)*y)-z;
		System.out.println("o resultado da equação ((x-5)*y)-z é igual á: "+ conta);
		
	}
	private static float digitaDados(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextFloat();
	}



}