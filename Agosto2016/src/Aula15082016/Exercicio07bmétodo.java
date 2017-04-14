package Aula15082016;
import java.util.Scanner;
public class Exercicio07bmétodo {
	
	public static void main(String[] args) {
		int n1 = digitaNumero("Digite o primeiro número: ");
		int n2 = digitaNumero("Digite o segundo número: ");
		int n3 = digitaNumero("Digite o terceiro número");
		
		System.out.println(comparaDados(n1, n2, n3));
	}

	 static String comparaDados(int n1, int n2, int n3) {
		String result = "";
		 if (n1>=n2 && n1>=n3)
			if (n2>=n3)
				result = "Ordem"+n3+" - "+n2+" - "+n1;
			else
				result = "Ordem"+n2+" - "+n3+" - "+n1;
		else if (n2>=n1 && n2>=n3)
			if (n1>=n3)
				result = "Ordem"+n3+" - "+n1+" - "+n2;
			else
				result = "Ordem"+n1+" - "+n3+" - "+n2;
		else if (n3>=n1 && n3>=n2)
			if (n1>=n2)
				result = "Ordem"+n2+" - "+n1+" - "+n3;
			else
				result = "Ordem"+n1+" - "+n2+" - "+n3;
		return result;
	 }
/*OU c	 static String comparaDados(int n1, int n2, int n3) {
		 if (n1>=n2 && n1>=n3)
			if (n2>=n3)
				return "Ordem"+n3+" - "+n2+" - "+n1;
			else
				return "Ordem"+n2+" - "+n3+" - "+n1;
		else if (n2>=n1 && n2>=n3)
			if (n1>=n3)
				return "Ordem"+n3+" - "+n1+" - "+n2;
			else
				return "Ordem"+n1+" - "+n3+" - "+n2;
		else if (n3>=n1 && n3>=n2)
			if (n1>=n2)
				return "Ordem"+n2+" - "+n1+" - "+n3;
			else
				return "Ordem"+n1+" - "+n2+" - "+n3;
		return result;*/
	 
	public static int digitaNumero(String mens){
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextInt();
		
	}
	
}
