package Aula15082016;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = e.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = e.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = e.nextInt();
		
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

}
