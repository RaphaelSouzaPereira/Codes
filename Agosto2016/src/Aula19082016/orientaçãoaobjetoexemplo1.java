package Aula19082016;
import java.util.Scanner;
public class orientaçãoaobjetoexemplo1 {
	
	public static void main(String[] args) {
	
	orientaçãoaobjetoexemplo11 n1 = new orientaçãoaobjetoexemplo11();
	orientaçãoaobjetoexemplo11 n2 = new orientaçãoaobjetoexemplo11();
	
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
