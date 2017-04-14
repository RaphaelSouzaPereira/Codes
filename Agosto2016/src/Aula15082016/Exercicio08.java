package Aula15082016;
import java.util.Scanner;
public class Exercicio08 {
	static float a=0 , b=0 , c=0;
	public static void main(String[] args) {
	
	a = digitaDados("Digite o primeiro numero a: ");
	b = digitaDados("Digite o segundo numero b: ");
	c = digitaDados("Digite o terceiro numero c: ");	
	mostraResultado(a, b, c);
	
}
	private static void mostraResultado(float a, float b, float c) {
		float conta = ((a+b)*c);
		System.out.println("o número da soma de a e b e sua multiplicação com c é: "+ conta);
		
	}
	private static float digitaDados(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextFloat();
	}



}