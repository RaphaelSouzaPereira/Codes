package Aula19082016;
import java.util.Scanner;
public class orienta��oaobjetoexemplo1 {
	
	public static void main(String[] args) {
	
	orienta��oaobjetoexemplo11 n1 = new orienta��oaobjetoexemplo11();
	orienta��oaobjetoexemplo11 n2 = new orienta��oaobjetoexemplo11();
	
	/*int a = digita();
	int b = digita();
	n1.setNumero(a);
	n2.setNumero(b); ou isso */
	
	n1.setNumero(digita());
	n2.setNumero(digita());
	
	System.out.println(n1.getNumero());
	System.out.println(n2.getNumero());
	}

public static int digita(){
	Scanner e = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	return e.nextInt();
}
}
