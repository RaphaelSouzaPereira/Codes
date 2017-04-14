package Aula20032017;

import com.senac.SimpleJava.Console;

public class SoSoma {
	public void run(){
		
		int n1 = Console.readInt("digite n1: ");
		int n2 = Console.readInt("digite n2: ");
		int aux = 0;
		int n5 = 0;
		
		for(int i = 0; i < n2; i++){
			aux += n1;
		}
		
		Console.println("Resultado e da multiplicacao de n1 vezes n2 e: "+aux);
		
		int n3 = Console.readInt("digite n3: ");
		int n4 = Console.readInt("digite n4: ");
		int resultado = 0;
		int aux1 = n3;
		int aux2 = n3;

		for(int i = 1; i < n4; i++){
			for(int a = 0; a < n3; a++){
				aux2 += aux1;
				resultado += aux2;
			} 
			 
		}
		
		Console.println("Resultado e de n3 elevado a n4 e: "+resultado);
	}
	
}
