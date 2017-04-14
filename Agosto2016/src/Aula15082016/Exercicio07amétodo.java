package Aula15082016;
import java.util.Scanner;
public class Exercicio07amétodo {
	
	public static void main(String[] args) {
		int n1 = digitaNumero("Digite o primeiro número: ");
		int n2 = digitaNumero("Digite o segundo número: ");
		int n3 = digitaNumero("Digite o terceiro número");
		comparaDados(n1, n2, n3);
				
	}

	private static void comparaDados(int n1, int n2, int n3) {
		if (n1>=n2 && n1>=n3)
			if (n2>=n3)
				System.out.println("Ordem"+n3+" - "+n2+" - "+n1);
			else
				System.out.println("Ordem"+n2+" - "+n3+" - "+n1);
		else if (n2>=n1 && n2>=n3)
			if (n1>=n3)
				System.out.println("Ordem"+n3+" - "+n1+" - "+n2);
			else
				System.out.println("Ordem"+n1+" - "+n3+" - "+n2);
		else if (n3>=n1 && n3>=n2)
			if (n1>=n2)
				System.out.println("Ordem"+n2+" - "+n1+" - "+n3);
			else
				System.out.println("Ordem"+n1+" - "+n2+" - "+n3);
	}

	public static int digitaNumero(String mens){
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextInt();
		
	}
	
}
