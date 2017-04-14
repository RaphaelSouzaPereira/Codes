package Aula12082016;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
	
	Scanner e = new Scanner(System.in); 
	int n1, n2;
	
	System.out.println("Digite n1: ");
	n1 = e.nextInt();
	System.out.println("Digite n2: ");
	n2 = e.nextInt();
	
	/*if (n1 > n2){
		System.out.println("n1 = "+n1+" é maior que n2="+n2);
	}
	else
		if (n2 > n1){
		System.out.println("n2 = "+n2+" é maior que n1="+n1);
	}
		else {
		System.out.println("n1 e n2 tem o mesmo valor = "+n1);
	}*/
	
	if (n1 > n2){
		System.out.println("n1 = "+n1+" é maior que n2="+n2);
	}
	if (n2 > n1){
		System.out.println("n2 = "+n2+" é maior que n1="+n1);
	}
	if (n1 == n2){
		System.out.println("n1 e n2 tem o mesmo valor = "+n1);
	}
  }
}

